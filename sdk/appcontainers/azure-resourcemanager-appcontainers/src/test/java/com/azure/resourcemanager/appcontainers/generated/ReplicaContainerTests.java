// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import org.junit.jupiter.api.Assertions;

public final class ReplicaContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaContainer model =
            BinaryData
                .fromString(
                    "{\"name\":\"u\",\"containerId\":\"prafwgckhoc\",\"ready\":false,\"started\":false,\"restartCount\":2112438286,\"logStreamEndpoint\":\"fqroudas\",\"execEndpoint\":\"vehhrvkbunzozu\"}")
                .toObject(ReplicaContainer.class);
        Assertions.assertEquals("u", model.name());
        Assertions.assertEquals("prafwgckhoc", model.containerId());
        Assertions.assertEquals(false, model.ready());
        Assertions.assertEquals(false, model.started());
        Assertions.assertEquals(2112438286, model.restartCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaContainer model =
            new ReplicaContainer()
                .withName("u")
                .withContainerId("prafwgckhoc")
                .withReady(false)
                .withStarted(false)
                .withRestartCount(2112438286);
        model = BinaryData.fromObject(model).toObject(ReplicaContainer.class);
        Assertions.assertEquals("u", model.name());
        Assertions.assertEquals("prafwgckhoc", model.containerId());
        Assertions.assertEquals(false, model.ready());
        Assertions.assertEquals(false, model.started());
        Assertions.assertEquals(2112438286, model.restartCount());
    }
}
