// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.CloudLinkInner;
import org.junit.jupiter.api.Assertions;

public final class CloudLinkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudLinkInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"status\":\"Active\",\"linkedCloud\":\"sphyoulpjrvxa\"},\"id\":\"l\",\"name\":\"vimjwos\",\"type\":\"tx\"}")
                .toObject(CloudLinkInner.class);
        Assertions.assertEquals("sphyoulpjrvxa", model.linkedCloud());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudLinkInner model = new CloudLinkInner().withLinkedCloud("sphyoulpjrvxa");
        model = BinaryData.fromObject(model).toObject(CloudLinkInner.class);
        Assertions.assertEquals("sphyoulpjrvxa", model.linkedCloud());
    }
}
