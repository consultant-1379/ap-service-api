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
 * Status entry names for <code>ap status -n</code> reporting.
 */
public enum StatusEntryNames {

    ACTIVATE_OPTIONAL_FEATURES("Activate Optional Features"),
    AIWS_NOTIFICATION("Node Connection to AIWS Notification"),
    ASSIGN_TARGET_GROUP("Assign Target Groups"),
    VALIDATE_CONFIGURATIONS_TASK("Validate Configuration"),
    ADD_NODE_TASK("Add Node"),
    CANCEL_SECURITY_TASK("Cancel Security"),
    CLEAN_UP_TASK("Clean up"),
    CONFIGURE_SOFTWARE_MANAGEMENT("Configure Software Management"),
    CREATE_CV_TASK("Create CV"),
    CREATE_NODE_USER_CREDENTIALS("Create Security Credentials"),
    DELETE_LICENSE_KEY_FILE_TASK("Delete License Key File"),
    DHCP_CONFIGURATION("Configure DHCP"),
    DHCP_REMOVE_CLIENT("Remove DHCP Client Configuration"),
    ENROLL_IPSEC_CERTIFICATE("Enroll IPSec Certificate"),
    ENROLL_OAM_CERTIFICATE("Enroll OAM Certificate"),
    GENERATE_SECURITY_TASK("Generate Security"),
    GPS_POSITION_CHECK_TASK("GPS Position Check"),
    HARDWARE_BIND_TASK("Hardware Bind"),
    IMPORT_CONFIGURATIONS_TASK("Initiate Import Configurations"),
    IMPORT_LICENSE_KEY_FILE_TASK("Import License Key File"),
    NODE_UP("Node Up Notification"),
    REMOVE_NODE_TASK("Remove Node"),
    SET_INTEGRATION_STARTED_TASK("Set Integration Started"),
    SET_INTEGRATION_COMPLETED_TASK("Set Integration Completed"),
    SET_MANAGEMENT_STATE("Set Management State"),
    SITE_CONFIG_COMPLETE("Site Config Complete Notification"),
    SYNC_NODE("Initiate Node Synchronization"),
    SYNC_NODE_NOTIFICATION("Node Synchronization Notification"),
    UNLOCK_CELLS("Unlock Cells"),
    UPLOAD_CONFIGURATION("Upload Configuration"),
    UPLOAD_CV_TASK("Initiate Upload CV");

    private String entryName;

    private StatusEntryNames(final String entryName) {
        this.entryName = entryName;
    }

    @Override
    public String toString() {
        return entryName;
    }
}