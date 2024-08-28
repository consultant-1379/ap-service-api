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
package com.ericsson.oss.services.ap.api.exception;

/**
 * Indicates that hardware bind failed because the specified serial number is already bound to another node.
 */
public class HwIdAlreadyBoundException extends ApApplicationException {

    private static final long serialVersionUID = 1L;

    private final String nodeName;

    /**
     * Exception with message information and node name.
     *
     * @param message
     *            the error message
     * @param nodeName
     *            the name of the node to which the hardware serial number is already bound
     */
    public HwIdAlreadyBoundException(final String message, final String nodeName) {
        super(message);
        this.nodeName = nodeName;
    }

    /**
     * Returns the name of the node to which the hardware serial number is already bound.
     *
     * @return the name of the node
     */
    public String getNodename() {
        return nodeName;
    }
}
