package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TSFBuilder;

/* loaded from: classes4.dex */
public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    static {
        for (JsonFactory.Feature feature : JsonFactory.Feature.values()) {
            feature.getClass();
            feature.a();
        }
        for (JsonParser.Feature feature2 : JsonParser.Feature.values()) {
            boolean z = feature2.d;
        }
        JsonGenerator.Feature.a();
    }
}
