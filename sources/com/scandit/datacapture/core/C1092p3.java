package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsSession;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionConfiguration;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092p3 extends NativeHttpsSessionFactory {
    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionFactory
    public final NativeHttpsSession create(NativeHttpsSessionConfiguration config) {
        Intrinsics.h(config, "config");
        return new C1032i6(config, new C1014g6(config));
    }
}
