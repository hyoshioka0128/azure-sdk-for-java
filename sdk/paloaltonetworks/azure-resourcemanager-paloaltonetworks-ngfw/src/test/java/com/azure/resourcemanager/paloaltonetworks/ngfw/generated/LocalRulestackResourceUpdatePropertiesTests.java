// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulestackResourceUpdateProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServices;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LocalRulestackResourceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocalRulestackResourceUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"panEtag\":\"blgyavutpthj\",\"panLocation\":\"oismsksbpimlqol\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[\"xxlxsffgcvizq\",\"dwl\",\"w\",\"youpfgfbkj\"],\"description\":\"dyhgkfminsg\",\"defaultMode\":\"IPS\",\"minAppIdVersion\":\"ttsttktlahbqact\",\"securityServices\":{\"vulnerabilityProfile\":\"zukxitmmqtgqq\",\"antiSpywareProfile\":\"hrnxrxc\",\"antiVirusProfile\":\"uisavokq\",\"urlFilteringProfile\":\"fvazivjlfrqttba\",\"fileBlockingProfile\":\"katnwxyi\",\"dnsSubscription\":\"id\",\"outboundUnTrustCertificate\":\"qfkuvscxkdmli\",\"outboundTrustCertificate\":\"vibrxkpmloazuruo\"}}")
                .toObject(LocalRulestackResourceUpdateProperties.class);
        Assertions.assertEquals("blgyavutpthj", model.panEtag());
        Assertions.assertEquals("oismsksbpimlqol", model.panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, model.scope());
        Assertions.assertEquals("xxlxsffgcvizq", model.associatedSubscriptions().get(0));
        Assertions.assertEquals("dyhgkfminsg", model.description());
        Assertions.assertEquals(DefaultMode.IPS, model.defaultMode());
        Assertions.assertEquals("ttsttktlahbqact", model.minAppIdVersion());
        Assertions.assertEquals("zukxitmmqtgqq", model.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("hrnxrxc", model.securityServices().antiSpywareProfile());
        Assertions.assertEquals("uisavokq", model.securityServices().antiVirusProfile());
        Assertions.assertEquals("fvazivjlfrqttba", model.securityServices().urlFilteringProfile());
        Assertions.assertEquals("katnwxyi", model.securityServices().fileBlockingProfile());
        Assertions.assertEquals("id", model.securityServices().dnsSubscription());
        Assertions.assertEquals("qfkuvscxkdmli", model.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("vibrxkpmloazuruo", model.securityServices().outboundTrustCertificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocalRulestackResourceUpdateProperties model =
            new LocalRulestackResourceUpdateProperties()
                .withPanEtag("blgyavutpthj")
                .withPanLocation("oismsksbpimlqol")
                .withScope(ScopeType.GLOBAL)
                .withAssociatedSubscriptions(Arrays.asList("xxlxsffgcvizq", "dwl", "w", "youpfgfbkj"))
                .withDescription("dyhgkfminsg")
                .withDefaultMode(DefaultMode.IPS)
                .withMinAppIdVersion("ttsttktlahbqact")
                .withSecurityServices(
                    new SecurityServices()
                        .withVulnerabilityProfile("zukxitmmqtgqq")
                        .withAntiSpywareProfile("hrnxrxc")
                        .withAntiVirusProfile("uisavokq")
                        .withUrlFilteringProfile("fvazivjlfrqttba")
                        .withFileBlockingProfile("katnwxyi")
                        .withDnsSubscription("id")
                        .withOutboundUnTrustCertificate("qfkuvscxkdmli")
                        .withOutboundTrustCertificate("vibrxkpmloazuruo"));
        model = BinaryData.fromObject(model).toObject(LocalRulestackResourceUpdateProperties.class);
        Assertions.assertEquals("blgyavutpthj", model.panEtag());
        Assertions.assertEquals("oismsksbpimlqol", model.panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, model.scope());
        Assertions.assertEquals("xxlxsffgcvizq", model.associatedSubscriptions().get(0));
        Assertions.assertEquals("dyhgkfminsg", model.description());
        Assertions.assertEquals(DefaultMode.IPS, model.defaultMode());
        Assertions.assertEquals("ttsttktlahbqact", model.minAppIdVersion());
        Assertions.assertEquals("zukxitmmqtgqq", model.securityServices().vulnerabilityProfile());
        Assertions.assertEquals("hrnxrxc", model.securityServices().antiSpywareProfile());
        Assertions.assertEquals("uisavokq", model.securityServices().antiVirusProfile());
        Assertions.assertEquals("fvazivjlfrqttba", model.securityServices().urlFilteringProfile());
        Assertions.assertEquals("katnwxyi", model.securityServices().fileBlockingProfile());
        Assertions.assertEquals("id", model.securityServices().dnsSubscription());
        Assertions.assertEquals("qfkuvscxkdmli", model.securityServices().outboundUnTrustCertificate());
        Assertions.assertEquals("vibrxkpmloazuruo", model.securityServices().outboundTrustCertificate());
    }
}
