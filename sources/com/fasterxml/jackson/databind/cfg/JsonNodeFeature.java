package com.fasterxml.jackson.databind.cfg;

/* loaded from: classes4.dex */
public enum JsonNodeFeature implements DatatypeFeature {
    READ_NULL_PROPERTIES,
    WRITE_NULL_PROPERTIES;

    public final int d = 1 << ordinal();

    JsonNodeFeature() {
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final int a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean b() {
        return true;
    }

    public final boolean c(int i) {
        return (i & this.d) != 0;
    }
}
