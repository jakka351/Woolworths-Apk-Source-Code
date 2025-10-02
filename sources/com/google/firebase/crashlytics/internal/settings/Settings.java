package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes.dex */
public class Settings {

    /* renamed from: a, reason: collision with root package name */
    public final SessionData f15395a;
    public final FeatureFlagData b;
    public final long c;
    public final double d;
    public final double e;
    public final int f;

    public static class FeatureFlagData {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f15396a;
        public final boolean b;
        public final boolean c;

        public FeatureFlagData(boolean z, boolean z2, boolean z3) {
            this.f15396a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static class SessionData {

        /* renamed from: a, reason: collision with root package name */
        public final int f15397a;

        public SessionData(int i) {
            this.f15397a = i;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, double d, double d2, int i) {
        this.c = j;
        this.f15395a = sessionData;
        this.b = featureFlagData;
        this.d = d;
        this.e = d2;
        this.f = i;
    }
}
