// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;
import com.azure.resourcemanager.appcontainers.models.RevisionCollection;
import java.util.Arrays;

public final class RevisionCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RevisionCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"createdTime\":\"2021-06-23T01:08:47Z\",\"lastActiveTime\":\"2021-10-13T12:53:05Z\",\"fqdn\":\"ukxit\",\"active\":false,\"replicas\":451636472,\"trafficWeight\":256938636,\"provisioningError\":\"hrnxrxc\",\"healthState\":\"Healthy\",\"provisioningState\":\"Deprovisioning\"},\"id\":\"vokqdzfv\",\"name\":\"zivj\",\"type\":\"frqttbajlkatnw\"},{\"properties\":{\"createdTime\":\"2021-06-16T21:46:54Z\",\"lastActiveTime\":\"2021-01-10T23:20:49Z\",\"fqdn\":\"kqqfk\",\"active\":true,\"replicas\":71458526,\"trafficWeight\":1380729071,\"provisioningError\":\"igovi\",\"healthState\":\"Unhealthy\",\"provisioningState\":\"Provisioned\"},\"id\":\"loazuruocbgoo\",\"name\":\"bteoybf\",\"type\":\"jxakv\"},{\"properties\":{\"createdTime\":\"2021-04-09T20:03:34Z\",\"lastActiveTime\":\"2021-07-01T03:09:37Z\",\"fqdn\":\"dilmyww\",\"active\":false,\"replicas\":583525950,\"trafficWeight\":1117648712,\"provisioningError\":\"abgyvudt\",\"healthState\":\"Healthy\",\"provisioningState\":\"Provisioned\"},\"id\":\"ihxuuwh\",\"name\":\"j\",\"type\":\"xccybvpa\"},{\"properties\":{\"createdTime\":\"2021-11-06T02:11:56Z\",\"lastActiveTime\":\"2021-10-08T16:55:36Z\",\"fqdn\":\"px\",\"active\":false,\"replicas\":704877183,\"trafficWeight\":167130524,\"provisioningError\":\"tcyohpfkyrk\",\"healthState\":\"Unhealthy\",\"provisioningState\":\"Deprovisioning\"},\"id\":\"gsj\",\"name\":\"mnwqj\",\"type\":\"obaiyhddviaceg\"}],\"nextLink\":\"m\"}")
                .toObject(RevisionCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RevisionCollection model =
            new RevisionCollection()
                .withValue(
                    Arrays.asList(new RevisionInner(), new RevisionInner(), new RevisionInner(), new RevisionInner()));
        model = BinaryData.fromObject(model).toObject(RevisionCollection.class);
    }
}
