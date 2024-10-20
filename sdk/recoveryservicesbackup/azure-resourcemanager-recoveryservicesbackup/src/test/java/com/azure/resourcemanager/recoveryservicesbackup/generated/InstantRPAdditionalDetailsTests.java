// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.InstantRPAdditionalDetails;
import org.junit.jupiter.api.Assertions;

public final class InstantRPAdditionalDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstantRPAdditionalDetails model =
            BinaryData
                .fromString("{\"azureBackupRGNamePrefix\":\"gzukxitmm\",\"azureBackupRGNameSuffix\":\"gqqqxh\"}")
                .toObject(InstantRPAdditionalDetails.class);
        Assertions.assertEquals("gzukxitmm", model.azureBackupRGNamePrefix());
        Assertions.assertEquals("gqqqxh", model.azureBackupRGNameSuffix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstantRPAdditionalDetails model =
            new InstantRPAdditionalDetails()
                .withAzureBackupRGNamePrefix("gzukxitmm")
                .withAzureBackupRGNameSuffix("gqqqxh");
        model = BinaryData.fromObject(model).toObject(InstantRPAdditionalDetails.class);
        Assertions.assertEquals("gzukxitmm", model.azureBackupRGNamePrefix());
        Assertions.assertEquals("gqqqxh", model.azureBackupRGNameSuffix());
    }
}
