package com.fasterxml.jackson.databind.cfg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EnumFeature implements DatatypeFeature {
    public static final /* synthetic */ EnumFeature[] e = {new EnumFeature()};
    public final int d = 1 << ordinal();

    /* JADX INFO: Fake field, exist only in values array */
    EnumFeature EF2;

    public static EnumFeature valueOf(String str) {
        return (EnumFeature) Enum.valueOf(EnumFeature.class, str);
    }

    public static EnumFeature[] values() {
        return (EnumFeature[]) e.clone();
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
