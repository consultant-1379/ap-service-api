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
package com.ericsson.oss.services.ap.api.exception;

import javax.ejb.ApplicationException;

/**
 * Exception thrown when the CIQ is failed to be downloaded.
 */
@ApplicationException(rollback = false)
public class DownloadCiqException extends ApServiceException {

    /**
     * Exception with message information only.
     *
     * @param message
     *            description of the exception
     */
    public DownloadCiqException(final String message) {
        super(message);
    }

    /**
     * Exception with message information and caused Throwable.
     *
     * @param message
     *            description of the exception
     * @param exception
     *            the cause exception
     */
    public DownloadCiqException(final String message, final Throwable exception) {
        super(message, exception);
    }
}