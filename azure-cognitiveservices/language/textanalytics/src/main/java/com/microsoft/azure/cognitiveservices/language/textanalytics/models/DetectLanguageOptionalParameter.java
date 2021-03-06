/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.textanalytics.models;

import java.util.List;

/**
 * The optional parameters class for "detectLanguage" method.
 */
public class DetectLanguageOptionalParameter {
    /**
    * The documents value.
    */
    private List<Input> documents;

    /**
    * Get the documents value.
    *
    * @return the documents value
    */
    public List<Input> documents() {
        return this.documents;
    }

    /**
    * Set the documents value.
    * <p>
    * The documents value.
    *
    * @param documents the documents value to set
    * @return the detectLanguageOptionalParameter object itself.
    */
    public DetectLanguageOptionalParameter withDocuments(List<Input> documents) {
        this.documents = documents;
        return this;
    }

    }
