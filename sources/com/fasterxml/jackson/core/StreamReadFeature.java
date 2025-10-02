package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: classes4.dex */
public enum StreamReadFeature implements JacksonFeature {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_SOURCE(JsonParser.Feature.AUTO_CLOSE_SOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(JsonParser.Feature.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNDEFINED(JsonParser.Feature.IGNORE_UNDEFINED),
    /* JADX INFO: Fake field, exist only in values array */
    INCLUDE_SOURCE_IN_LOCATION(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(JsonParser.Feature.USE_FAST_DOUBLE_PARSER);

    public final boolean d;
    public final int e;
    public final JsonParser.Feature f;

    StreamReadFeature(JsonParser.Feature feature) {
        this.f = feature;
        this.e = feature.e;
        this.d = feature.d;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final int a() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean b() {
        return this.d;
    }
}
