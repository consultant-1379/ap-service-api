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

/**
 * Defines the events which cause a transition from one state to another.
 */
public enum StateTransitionEvent {

    BIND_FAILED,
    BIND_STARTED,
    BIND_SUCCESSFUL,
    DELETE_FAILED,
    DELETE_STARTED,
    EXPANSION_CANCELLED,
    EXPANSION_FAILED,
    EXPANSION_STARTED,
    EXPANSION_SUCCESSFUL,
    EXPANSION_SUSPENDED,
    HARDWARE_REPLACE_FAILED,
    HARDWARE_REPLACE_ROLLBACK_FAILED,
    HARDWARE_REPLACE_STARTED,
    HARDWARE_REPLACE_BIND_SUCCESSFUL,
    HARDWARE_REPLACE_SUCCESSFUL,
    IMPORT_STARTED,
    IMPORT_SUCCESSFUL,
    INTEGRATION_CANCELLED,
    INTEGRATION_FAILED,
    INTEGRATION_STARTED,
    INTEGRATION_SUCCESSFUL,
    INTEGRATION_SUCCESSFUL_WITH_WARNING,
    INTEGRATION_SUSPENDED,
    ORDER_CANCELLED,
    ORDER_FAILED,
    ORDER_ROLLBACK_FAILED,
    ORDER_STARTED,
    ORDER_SUCCESSFUL,
    ORDER_SUSPENDED,
    RECONFIGURATION_CANCELLED,
    RECONFIGURATION_FAILED,
    RECONFIGURATION_STARTED,
    RECONFIGURATION_SUCCESSFUL,
    RECONFIGURATION_SUSPENDED;
}