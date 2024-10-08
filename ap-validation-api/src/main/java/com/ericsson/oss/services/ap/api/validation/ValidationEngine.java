/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.api.validation;

/**
 * This interface is implemented by classes that want to execute validation against a context.
 *
 * @see com.ericsson.oss.services.ap.api.validation.ValidationContext
 */
public interface ValidationEngine {

    /**
     * Performs a validation.
     *
     * @param context
     *            the validation context
     */
    boolean validate(final ValidationContext context);
}
