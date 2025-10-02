package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* loaded from: classes.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* renamed from: a, reason: collision with root package name */
    public final String f15775a;
    public final int b;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.f15775a = str;
        this.b = i;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final long a() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = asString().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(YU.a.h("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final boolean asBoolean() {
        if (this.b == 0) {
            return false;
        }
        String strTrim = asString().trim();
        if (ConfigGetParameterHandler.e.matcher(strTrim).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(YU.a.h("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final String asString() {
        return this.b == 0 ? "" : this.f15775a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = asString().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(YU.a.h("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public final int g() {
        return this.b;
    }
}
