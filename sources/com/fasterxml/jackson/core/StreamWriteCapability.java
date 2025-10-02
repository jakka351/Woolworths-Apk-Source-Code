package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: classes4.dex */
public enum StreamWriteCapability implements JacksonFeature {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    public final int d = 1 << ordinal();

    StreamWriteCapability() {
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
