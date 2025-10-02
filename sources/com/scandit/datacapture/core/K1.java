package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.device.NativeBatteryData;
import com.scandit.datacapture.core.internal.module.device.NativeDeviceInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K1 extends NativeDeviceInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1034j f18336a;

    public K1(C1052l batteryStatusProvider) {
        Intrinsics.h(batteryStatusProvider, "batteryStatusProvider");
        this.f18336a = batteryStatusProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.NativeDeviceInterface
    public final NativeBatteryData getBatteryData() {
        return ((C1052l) this.f18336a).a();
    }
}
