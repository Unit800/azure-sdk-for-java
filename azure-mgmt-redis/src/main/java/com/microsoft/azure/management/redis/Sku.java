/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku parameters supplied to the create redis operation.
 */
public class Sku {
    /**
     * What type of redis cache to deploy. Valid values: (Basic, Standard,
     * Premium). Possible values include: 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(required = true)
    private SkuName name;

    /**
     * Which family to use. Valid values: (C, P). Possible values include:
     * 'C', 'P'.
     */
    @JsonProperty(required = true)
    private SkuFamily family;

    /**
     * What size of redis cache to deploy. Valid values: for C family (0, 1,
     * 2, 3, 4, 5, 6), for P family (1, 2, 3, 4).
     */
    @JsonProperty(required = true)
    private int capacity;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public SkuFamily family() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     * @return the Sku object itself.
     */
    public Sku withFamily(SkuFamily family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public int capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

}