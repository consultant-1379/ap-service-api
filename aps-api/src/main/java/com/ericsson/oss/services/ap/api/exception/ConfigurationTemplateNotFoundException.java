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

import static java.net.HttpURLConnection.HTTP_BAD_REQUEST;

/**
 * Thrown to indicate that a Configuration Template could not be found in Configuration Template Application.
 */
@ApplicationException(rollback = false)
public class ConfigurationTemplateNotFoundException extends ApServiceException {

    private static final long serialVersionUID = -7801408861160774847L;

    private static final String TEMPLATE_NOT_FOUND_PROPERTY = "configuration.template.not.found.";

    private final String templateName;

    /**
     * Exception with message information and name of missing template.
     *
     * @param message
     *            description of the exception
     * @param templateName
     *            the template name
     */
    public ConfigurationTemplateNotFoundException(final String message, final String templateName) {
        super(message);
        this.templateName = templateName;
    }

    /**
     * Returns the template name which was returned as not found.
     *
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    @Override
    public int getHttpCode() {
        return HTTP_BAD_REQUEST;
    }

    @Override
    public String getErrorPropertyName() {
        return TEMPLATE_NOT_FOUND_PROPERTY;
    }
}
