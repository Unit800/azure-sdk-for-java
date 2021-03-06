/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The GetAllTermsOptionalParameter model.
 */
public class GetAllTermsOptionalParameter {
    /**
     * The pagination start index.
     */
    private Integer offset;

    /**
     * The max limit.
     */
    private Integer limit;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Get the offset value.
     *
     * @return the offset value
     */
    public Integer offset() {
        return this.offset;
    }

    /**
     * Set the offset value.
     *
     * @param offset the offset value to set
     * @return the GetAllTermsOptionalParameter object itself.
     */
    public GetAllTermsOptionalParameter withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     * @return the GetAllTermsOptionalParameter object itself.
     */
    public GetAllTermsOptionalParameter withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the GetAllTermsOptionalParameter object itself.
     */
    public GetAllTermsOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
