/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2019
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.ap.api;

import com.ericsson.oss.services.ap.api.exception.ApServiceException;
import com.ericsson.oss.services.ap.api.exception.HwIdAlreadyBoundException;

/**
 * Shared service interface. Interface to AutoProvisioning services.
 */
public interface AutoProvisioningServiceRemote {

    /**
     * Bind the hardware to OSS node.
     *
     * @param nodeFdn
     *            the FDN of the AP node
     * @param serialNumber
     *            node serial number
     * @throws ApServiceException
     *             if there is a general error executing the bind
     * @throws HwIdAlreadyBoundException
     *             if specified serialNumber is already bound to another node
     */
    void bind(final String nodeFdn, final String serialNumber);
}
