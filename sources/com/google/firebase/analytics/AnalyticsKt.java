package com.google.firebase.analytics;

import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnalyticsKt {

    /* renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f15178a;
    public static final Object b = new Object();

    public static final FirebaseAnalytics a() {
        if (f15178a == null) {
            synchronized (b) {
                if (f15178a == null) {
                    FirebaseApp firebaseAppD = FirebaseApp.d();
                    firebaseAppD.a();
                    f15178a = FirebaseAnalytics.getInstance(firebaseAppD.f15169a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f15178a;
        Intrinsics.e(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
