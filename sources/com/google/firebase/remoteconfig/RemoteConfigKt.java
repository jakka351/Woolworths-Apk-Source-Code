package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"com.google.firebase-firebase-config"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValueImpl a(FirebaseRemoteConfig firebaseRemoteConfig, String key) {
        Intrinsics.h(firebaseRemoteConfig, "<this>");
        Intrinsics.h(key, "key");
        return firebaseRemoteConfig.g.b(key);
    }
}
