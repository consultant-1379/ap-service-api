/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.api.workflow;

/**
 * Interface to provide capability information regarding the AP Hardware Replace use case.
 */
public interface HardwareReplaceCapabilty {

    /**
     * Check if the hardware replace capability is supported for a given node type.
     *
     * @param nodeType
     *            the nodeType to check
     * @return true if hardware replace is supported by the node type.
     */
    boolean isSupported(String nodeType);
}
