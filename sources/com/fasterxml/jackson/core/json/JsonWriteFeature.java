package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonGenerator;

/* loaded from: classes4.dex */
public enum JsonWriteFeature implements FormatFeature {
    /* JADX INFO: Fake field, exist only in values array */
    QUOTE_FIELD_NAMES(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NAN_AS_STRINGS(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_NUMBERS_AS_STRINGS(false),
    /* JADX INFO: Fake field, exist only in values array */
    ESCAPE_NON_ASCII(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_HEX_UPPER_CASE(true);

    public final boolean d;
    public final int e = 1 << ordinal();

    static {
        JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    }

    JsonWriteFeature(boolean z) {
        this.d = z;
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
