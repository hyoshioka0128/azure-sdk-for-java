// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ImageBuilderClient class. */
public interface ImageBuilderClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription Id forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the VirtualMachineImageTemplatesClient object to access its operations.
     *
     * @return the VirtualMachineImageTemplatesClient object.
     */
    VirtualMachineImageTemplatesClient getVirtualMachineImageTemplates();

    /**
     * Gets the TriggersClient object to access its operations.
     *
     * @return the TriggersClient object.
     */
    TriggersClient getTriggers();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();
}
