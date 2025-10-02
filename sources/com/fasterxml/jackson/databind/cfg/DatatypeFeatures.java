package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class DatatypeFeatures implements Serializable {
    public final int d;

    public static class DefaultHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final DatatypeFeatures f14234a;

        static {
            for (EnumFeature enumFeature : EnumFeature.values()) {
                enumFeature.getClass();
            }
            int iA = 0;
            for (JsonNodeFeature jsonNodeFeature : JsonNodeFeature.values()) {
                jsonNodeFeature.getClass();
                iA |= jsonNodeFeature.a();
            }
            f14234a = new DatatypeFeatures(0, iA);
        }
    }

    public DatatypeFeatures(int i, int i2) {
        this.d = i2;
    }

    public static DatatypeFeatures a() {
        return DefaultHolder.f14234a;
    }
}
