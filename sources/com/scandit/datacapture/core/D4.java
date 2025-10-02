package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D4 implements InterfaceC1141u7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1072n1 f18307a;
    private final boolean b;

    public D4(InterfaceC1072n1 connectivity, boolean z) {
        Intrinsics.h(connectivity, "connectivity");
        this.f18307a = connectivity;
        this.b = z;
    }

    public final InterfaceC1132t7 a(NativeHttpsTask task) {
        Intrinsics.h(task, "task");
        int iA = this.f18307a.a();
        return iA == 1 ? new C1123s7(new C1140u6("No connection")) : (iA != 2 || this.b) ? C1114r7.f18827a : new C1123s7(new C1140u6("Cellular not allowed"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkTypeInterceptor{connectivity=");
        sb.append(this.f18307a);
        sb.append(", allowCellularAccess=");
        return androidx.camera.core.impl.b.s(sb, this.b, '}');
    }

    public D4(boolean z) {
        this(C1063m1.a(), z);
    }
}
