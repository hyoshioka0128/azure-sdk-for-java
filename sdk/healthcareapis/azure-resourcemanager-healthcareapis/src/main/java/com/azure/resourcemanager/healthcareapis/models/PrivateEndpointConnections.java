// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * Lists all private endpoint connections for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnectionDescription> listByService(String resourceGroupName, String resourceName);

    /**
     * Lists all private endpoint connections for a service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnectionDescription> listByService(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the service.
     */
    PrivateEndpointConnectionDescription get(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the service.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the service along with {@link Response}.
     */
    Response<PrivateEndpointConnectionDescription> getWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param resourceName The name of the service instance.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the service along with {@link Response}.
     */
    PrivateEndpointConnectionDescription getById(String id);

    /**
     * Gets the specified private endpoint connection associated with the service.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the service along with {@link Response}.
     */
    Response<PrivateEndpointConnectionDescription> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a private endpoint connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateEndpointConnectionDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnectionDescription definition.
     */
    PrivateEndpointConnectionDescription.DefinitionStages.Blank define(String name);
}
