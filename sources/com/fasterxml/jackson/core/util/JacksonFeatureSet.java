package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* loaded from: classes4.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> {

    /* renamed from: a, reason: collision with root package name */
    public final int f14220a;

    public JacksonFeatureSet(int i) {
        this.f14220a = i;
    }

    public static JacksonFeatureSet a(JacksonFeature[] jacksonFeatureArr) {
        if (jacksonFeatureArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", jacksonFeatureArr[0].getClass().getName(), Integer.valueOf(jacksonFeatureArr.length)));
        }
        int iA = 0;
        for (JacksonFeature jacksonFeature : jacksonFeatureArr) {
            if (jacksonFeature.b()) {
                iA |= jacksonFeature.a();
            }
        }
        return new JacksonFeatureSet(iA);
    }
}
