package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.g;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"com.google.firebase-firebase-crashlytics"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics a() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.d().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static final void b(FirebaseCrashlytics firebaseCrashlytics, Function1 function1) {
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        function1.invoke(keyValueBuilder);
        CustomKeysAndValues customKeysAndValuesA = keyValueBuilder.a();
        CrashlyticsCore crashlyticsCore = firebaseCrashlytics.f15252a;
        HashMap map = customKeysAndValuesA.f15250a;
        if (map.isEmpty()) {
            return;
        }
        crashlyticsCore.o.f15286a.a(new g(crashlyticsCore, map, 0));
    }
}
