package com.scandit.datacapture.core;

import android.content.Context;
import android.os.BatteryManager;
import com.scandit.datacapture.core.internal.module.device.NativeBatteryData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052l implements InterfaceC1034j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18793a;
    private final Lazy b;

    public C1052l(Context context) {
        Intrinsics.h(context, "context");
        this.f18793a = context;
        this.b = LazyKt.b(new C1043k(this));
    }

    public final NativeBatteryData a() {
        return new NativeBatteryData(((BatteryManager) this.b.getD()).getIntProperty(4));
    }
}
