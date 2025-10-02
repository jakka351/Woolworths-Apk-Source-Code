package com.scandit.datacapture.core;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class W4 implements V {

    /* renamed from: a, reason: collision with root package name */
    private final String f18390a;
    private final C1098q0 b;
    private final int c;
    private final Rational d;

    public W4(String id, CameraCharacteristics cameraCharacteristics) {
        Intrinsics.h(id, "id");
        Intrinsics.h(cameraCharacteristics, "cameraCharacteristics");
        this.f18390a = id;
        this.b = new C1098q0(cameraCharacteristics);
        this.c = ((C1098q0) a()).g();
        this.d = ((C1098q0) a()).e();
    }

    public final InterfaceC1080o0 a() {
        return this.b;
    }

    public final Rational b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        Integer numF = this.b.f();
        if (numF != null && numF.intValue() == 0) {
            return 0;
        }
        if (numF != null && numF.intValue() == 1) {
            return 2;
        }
        return (numF != null && numF.intValue() == 2) ? 3 : 0;
    }

    public final String e() {
        return this.f18390a;
    }

    public final boolean f() {
        C1098q0 c1098q0 = this.b;
        CameraCharacteristics.Key SENSOR_INFO_TIMESTAMP_SOURCE = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        Intrinsics.g(SENSOR_INFO_TIMESTAMP_SOURCE, "SENSOR_INFO_TIMESTAMP_SOURCE");
        Integer num = (Integer) c1098q0.a(SENSOR_INFO_TIMESTAMP_SOURCE);
        return num != null && num.intValue() == 1;
    }
}
