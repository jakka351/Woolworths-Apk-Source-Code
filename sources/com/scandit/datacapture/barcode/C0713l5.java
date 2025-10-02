package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0713l5 {
    private C0713l5() {
    }

    public static InterfaceC0729m5 a(Function0 onStartScanning, Function0 onStopScanning, Function0 onFreezeScanning, Function0 onReleaseScanning, Function0 onResetScanning) {
        Intrinsics.h(onStartScanning, "onStartScanning");
        Intrinsics.h(onStopScanning, "onStopScanning");
        Intrinsics.h(onFreezeScanning, "onFreezeScanning");
        Intrinsics.h(onReleaseScanning, "onReleaseScanning");
        Intrinsics.h(onResetScanning, "onResetScanning");
        return new C0745n5(onStartScanning, onStopScanning, onFreezeScanning, onReleaseScanning, onResetScanning, EnumC0648h4.Initialized, C4.Initialized);
    }
}
