/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TrainingStatusType.
 */
public enum TrainingStatusType {
    /** Enum value nonstarted. */
    NONSTARTED("nonstarted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded"),

    /** Enum value failed. */
    FAILED("failed");

    /** The actual serialized value for a TrainingStatusType instance. */
    private String value;

    TrainingStatusType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TrainingStatusType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TrainingStatusType object, or null if unable to parse.
     */
    @JsonCreator
    public static TrainingStatusType fromString(String value) {
        TrainingStatusType[] items = TrainingStatusType.values();
        for (TrainingStatusType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}