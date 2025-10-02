package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: classes4.dex */
public enum StreamReadCapability implements JacksonFeature {
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS,
    /* JADX INFO: Fake field, exist only in values array */
    EXACT_FLOATS;

    public final int d = 1 << ordinal();

    StreamReadCapability() {
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final int a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean b() {
        return false;
    }
}
