package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* loaded from: classes.dex */
public class HeartBeatConsumerComponent {

    /* renamed from: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent$1, reason: invalid class name */
    class AnonymousClass1 implements HeartBeatConsumer {
    }

    public static Component a() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Component.Builder builderB = Component.b(HeartBeatConsumer.class);
        builderB.e = 1;
        builderB.f = new androidx.compose.runtime.snapshots.a(anonymousClass1, 6);
        return builderB.b();
    }
}
