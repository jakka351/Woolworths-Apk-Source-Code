package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: classes4.dex */
public enum StreamWriteFeature implements JacksonFeature {
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_TARGET(JsonGenerator.Feature.AUTO_CLOSE_TARGET),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_CLOSE_CONTENT(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT),
    /* JADX INFO: Fake field, exist only in values array */
    FLUSH_PASSED_TO_STREAM(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_BIGDECIMAL_AS_PLAIN(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT_DUPLICATE_DETECTION(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(JsonGenerator.Feature.IGNORE_UNKNOWN),
    /* JADX INFO: Fake field, exist only in values array */
    USE_FAST_DOUBLE_WRITER(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER);

    public final boolean d;
    public final int e;

    StreamWriteFeature(JsonGenerator.Feature feature) {
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
