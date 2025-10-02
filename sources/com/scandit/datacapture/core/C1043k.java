package com.scandit.datacapture.core;

import android.os.BatteryManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1043k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1052l f18787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043k(C1052l c1052l) {
        super(0);
        this.f18787a = c1052l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.f18787a.f18793a.getSystemService("batterymanager");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return (BatteryManager) systemService;
    }
}
