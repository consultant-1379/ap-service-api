/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.api.status;

import static com.ericsson.oss.services.ap.api.status.State.BIND_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.BIND_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.DELETE_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.DELETE_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.EXPANSION_CANCELLED;
import static com.ericsson.oss.services.ap.api.status.State.EXPANSION_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.EXPANSION_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.EXPANSION_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.EXPANSION_SUSPENDED;
import static com.ericsson.oss.services.ap.api.status.State.HARDWARE_REPLACE_BIND_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.HARDWARE_REPLACE_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.HARDWARE_REPLACE_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.HARDWARE_REPLACE_ROLLBACK_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.HARDWARE_REPLACE_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_CANCELLED;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_COMPLETED_WITH_WARNING;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.INTEGRATION_SUSPENDED;
import static com.ericsson.oss.services.ap.api.status.State.INVALID_CONFIGURATION;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_CANCELLED;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_ROLLBACK_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.ORDER_SUSPENDED;
import static com.ericsson.oss.services.ap.api.status.State.READY_FOR_EXPANSION;
import static com.ericsson.oss.services.ap.api.status.State.READY_FOR_ORDER;
import static com.ericsson.oss.services.ap.api.status.State.READY_FOR_RECONFIGURATION;
import static com.ericsson.oss.services.ap.api.status.State.RECONFIGURATION_CANCELLED;
import static com.ericsson.oss.services.ap.api.status.State.RECONFIGURATION_COMPLETED;
import static com.ericsson.oss.services.ap.api.status.State.RECONFIGURATION_FAILED;
import static com.ericsson.oss.services.ap.api.status.State.RECONFIGURATION_STARTED;
import static com.ericsson.oss.services.ap.api.status.State.RECONFIGURATION_SUSPENDED;
import static com.ericsson.oss.services.ap.api.status.State.UNKNOWN;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/**
 * Defines the overall project level integration phases for node stateNames.
 */
public enum IntegrationPhase {

    IN_PROGRESS(
        "In Progress", READY_FOR_ORDER, INVALID_CONFIGURATION, DELETE_STARTED, ORDER_STARTED, ORDER_COMPLETED, ORDER_SUSPENDED,
        HARDWARE_REPLACE_STARTED,
        BIND_STARTED, BIND_COMPLETED, INTEGRATION_STARTED, INTEGRATION_SUSPENDED, UNKNOWN, HARDWARE_REPLACE_BIND_COMPLETED, RECONFIGURATION_STARTED,
        READY_FOR_RECONFIGURATION, RECONFIGURATION_SUSPENDED,
        EXPANSION_STARTED, EXPANSION_SUSPENDED, READY_FOR_EXPANSION),
    INTEGRATED(
        "Integrated", INTEGRATION_COMPLETED, INTEGRATION_COMPLETED_WITH_WARNING, HARDWARE_REPLACE_COMPLETED, RECONFIGURATION_COMPLETED,
        EXPANSION_COMPLETED),
    FAILED(
        "Failed", ORDER_FAILED, ORDER_ROLLBACK_FAILED, INTEGRATION_FAILED, DELETE_FAILED, HARDWARE_REPLACE_FAILED,
        HARDWARE_REPLACE_ROLLBACK_FAILED, RECONFIGURATION_FAILED, EXPANSION_FAILED),
    CANCELLED("Cancelled", INTEGRATION_CANCELLED, ORDER_CANCELLED, RECONFIGURATION_CANCELLED, EXPANSION_CANCELLED);

    private static final List<IntegrationPhase> VALUES_AS_LIST = Collections.unmodifiableList(Arrays.asList(values()));

    private final String name;
    private final Set<State> stateNames;

    private IntegrationPhase(final String name, final State... states) {
        this.name = name;
        stateNames = EnumSet.copyOf(Arrays.asList(states));
    }

    /**
     * The name of the {@link IntegrationPhase}.
     *
     * @return the IntegrationPhase as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the {@link IntegrationPhase} from an AP node state.
     *
     * @param nodeState
     *            an AP node state
     * @return IntegrationPhase the corresponding phase for the given state
     */
    public static IntegrationPhase getIntegrationPhase(final String nodeState) {
        final State state = State.valueOf(nodeState);
        for (final IntegrationPhase phase : IntegrationPhase.valuesAsList()) {
            if (phase.stateNames.contains(state)) {
                return phase;
            }
        }
        throw new IllegalArgumentException(String.format("State %s is not in the list of Integration Phases", nodeState));
    }

    /**
     * Returns all {@link IntegrationPhase} values as a {@link List}.
     * <p>
     * To be used instead of {@link #values()}, as it does not create a new array for each invocation.
     *
     * @return all enum values
     */
    public static List<IntegrationPhase> valuesAsList() {
        return VALUES_AS_LIST;
    }
}
