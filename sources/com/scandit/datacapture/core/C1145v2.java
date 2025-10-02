package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: com.scandit.datacapture.core.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1145v2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f18978a = LazyKt.b(C1118s2.f18829a);
    private static final DisposableResource b = new DisposableResource(C1127t2.f18873a, C1136u2.f18876a);
    public static final /* synthetic */ int c = 0;

    private C1145v2() {
    }

    public static final A2 a() {
        return (A2) f18978a.getD();
    }

    public static DisposableResource b() {
        return b;
    }
}
