package com.scandit.datacapture.core;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeFocusMode;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;

/* loaded from: classes6.dex */
public final class F0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private final CameraProfile f18313a;
    private final V b;
    private final CameraSettings c;
    private final InterfaceC1080o0 d;

    public F0(CameraProfile cameraProfile, V cameraApi2Info, CameraSettings cameraSettings) {
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(cameraApi2Info, "cameraApi2Info");
        this.f18313a = cameraProfile;
        this.b = cameraApi2Info;
        this.c = cameraSettings;
        this.d = ((W4) d()).a();
    }

    public final boolean a(boolean z) throws Exception {
        try {
            if (!this.f18313a.d().b()) {
                return true;
            }
            if (z) {
                return this.f18313a.f();
            }
            return false;
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    public final int[] b() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key CONTROL_AF_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        Intrinsics.g(CONTROL_AF_AVAILABLE_MODES, "CONTROL_AF_AVAILABLE_MODES");
        int[] iArr = (int[]) ((C1098q0) interfaceC1080o0).a(CONTROL_AF_AVAILABLE_MODES);
        return iArr == null ? new int[0] : iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.ranges.ClosedRange c() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L21
            com.scandit.datacapture.core.o0 r0 = r3.d
            android.hardware.camera2.CameraCharacteristics$Key r1 = androidx.camera.camera2.internal.a.g()
            java.lang.String r2 = "CONTROL_ZOOM_RATIO_RANGE"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            com.scandit.datacapture.core.q0 r0 = (com.scandit.datacapture.core.C1098q0) r0
            java.lang.Object r0 = r0.a(r1)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto L21
            com.scandit.datacapture.core.G0 r1 = new com.scandit.datacapture.core.G0
            r1.<init>(r0)
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 != 0) goto L44
            com.scandit.datacapture.core.o0 r0 = r3.d
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            java.lang.String r2 = "SCALER_AVAILABLE_MAX_DIGITAL_ZOOM"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            com.scandit.datacapture.core.q0 r0 = (com.scandit.datacapture.core.C1098q0) r0
            java.lang.Object r0 = r0.a(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L3e
            float r0 = r0.floatValue()
            goto L3f
        L3e:
            r0 = r1
        L3f:
            kotlin.ranges.ClosedFloatingPointRange r0 = kotlin.ranges.RangesKt.j(r1, r0)
            return r0
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.F0.c():kotlin.ranges.ClosedRange");
    }

    public final V d() {
        return this.b;
    }

    public final String e() {
        return ((W4) this.b).e();
    }

    public final CameraPosition f() {
        int iC = ((W4) this.b).c();
        if (iC == 0) {
            return CameraPosition.USER_FACING;
        }
        if (iC == 1) {
            return CameraPosition.WORLD_FACING;
        }
        StringBuilder sb = new StringBuilder("Unsupported Camera API 2 facing ");
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.g(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(LENS_FACING);
        sb.append(num != null ? num.intValue() : 1);
        throw new AssertionError(sb.toString());
    }

    public final CameraProfile g() {
        return this.f18313a;
    }

    public final int h() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.g(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(LENS_FACING);
        return (num != null ? num.intValue() : 1) == 1 ? r() : -r();
    }

    public final Range i() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key CONTROL_AE_COMPENSATION_RANGE = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Intrinsics.g(CONTROL_AE_COMPENSATION_RANGE, "CONTROL_AE_COMPENSATION_RANGE");
        Range range = (Range) ((C1098q0) interfaceC1080o0).a(CONTROL_AE_COMPENSATION_RANGE);
        if (range != null) {
            return range;
        }
        throw new IllegalArgumentException("Exposure compensation range should be non-null on all devices.");
    }

    public final Rational j() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key CONTROL_AE_COMPENSATION_STEP = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
        Intrinsics.g(CONTROL_AE_COMPENSATION_STEP, "CONTROL_AE_COMPENSATION_STEP");
        Rational rational = (Rational) ((C1098q0) interfaceC1080o0).a(CONTROL_AE_COMPENSATION_STEP);
        if (rational != null) {
            return rational;
        }
        throw new IllegalArgumentException("Exposure compensation step should be non-null on all devices.");
    }

    public final ArrayList k() {
        try {
            Size[] sizeArrD = ((C1098q0) this.d).d();
            if (this.f18313a.e()) {
                sizeArrD = (Size[]) ArraysKt.b0(sizeArrD, ((C1098q0) this.d).b());
            }
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArrD) {
                if (size.getWidth() * size.getHeight() <= this.f18313a.a()) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    public final float l() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key LENS_INFO_HYPERFOCAL_DISTANCE = CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE;
        Intrinsics.g(LENS_INFO_HYPERFOCAL_DISTANCE, "LENS_INFO_HYPERFOCAL_DISTANCE");
        Float f = (Float) ((C1098q0) interfaceC1080o0).a(LENS_INFO_HYPERFOCAL_DISTANCE);
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float m() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key LENS_INFO_MINIMUM_FOCUS_DISTANCE = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        Intrinsics.g(LENS_INFO_MINIMUM_FOCUS_DISTANCE, "LENS_INFO_MINIMUM_FOCUS_DISTANCE");
        Float f = (Float) ((C1098q0) interfaceC1080o0).a(LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final int n() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AE = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        Intrinsics.g(CONTROL_MAX_REGIONS_AE, "CONTROL_MAX_REGIONS_AE");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(CONTROL_MAX_REGIONS_AE);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int o() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AF = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        Intrinsics.g(CONTROL_MAX_REGIONS_AF, "CONTROL_MAX_REGIONS_AF");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(CONTROL_MAX_REGIONS_AF);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List p() throws Exception {
        try {
            return ((C1098q0) this.d).c();
        } catch (Exception e) {
            O3.a("Exception caught in listener method. Rethrowing...", e);
            throw e;
        }
    }

    public final Rect q() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.g(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Rect rect = (Rect) ((C1098q0) interfaceC1080o0).a(SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return rect == null ? new Rect() : rect;
    }

    public final int r() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key SENSOR_ORIENTATION = CameraCharacteristics.SENSOR_ORIENTATION;
        Intrinsics.g(SENSOR_ORIENTATION, "SENSOR_ORIENTATION");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(SENSOR_ORIENTATION);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final EnumSet s() {
        EnumSet result = EnumSet.noneOf(NativeFocusMode.class);
        boolean zB = this.f18313a.d().b();
        for (int i : b()) {
            if (i == 0) {
                result.add(NativeFocusMode.FIXED);
            } else if (i == 1) {
                result.add(NativeFocusMode.AUTO);
            } else if ((i == 3 || i == 4) && !zB) {
                result.add(NativeFocusMode.AUTO);
            }
        }
        if (this.f18313a.c()) {
            result.add(NativeFocusMode.FIXED);
        }
        Intrinsics.g(result, "result");
        return result;
    }

    public final int t() {
        CameraSettings cameraSettings = this.c;
        Object property = cameraSettings != null ? cameraSettings.getProperty("xcoverInitialLensPosition") : null;
        Integer num = property instanceof Integer ? (Integer) property : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean u() {
        CameraSettings cameraSettings = this.c;
        Object obj = null;
        Object property = cameraSettings != null ? cameraSettings.getProperty("disableManualLensPositionSupportCheck") : null;
        Boolean bool = property instanceof Boolean ? (Boolean) property : null;
        if (!(bool != null ? bool.booleanValue() : false)) {
            InterfaceC1080o0 interfaceC1080o0 = this.d;
            CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Intrinsics.g(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(INFO_SUPPORTED_HARDWARE_LEVEL);
            if ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 3)) {
                InterfaceC1080o0 interfaceC1080o02 = this.d;
                CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
                Intrinsics.g(LENS_FACING, "LENS_FACING");
                Integer num2 = (Integer) ((C1098q0) interfaceC1080o02).a(LENS_FACING);
                if ((num2 != null ? num2.intValue() : 1) != 1 || !this.f18313a.c()) {
                    InterfaceC1080o0 interfaceC1080o03 = this.d;
                    CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                    Intrinsics.g(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
                    final int[] iArr = (int[]) ((C1098q0) interfaceC1080o03).a(REQUEST_AVAILABLE_CAPABILITIES);
                    if (iArr != null) {
                        Iterator f24664a = (iArr.length == 0 ? EmptySequence.f24658a : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
                            @Override // kotlin.sequences.Sequence
                            /* renamed from: iterator */
                            public final Iterator getF24664a() {
                                return ArrayIteratorsKt.c(iArr);
                            }
                        }).getF24664a();
                        while (true) {
                            if (!f24664a.hasNext()) {
                                break;
                            }
                            Object next = f24664a.next();
                            if (((Number) next).intValue() == 1) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (Integer) obj;
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean v() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key FLASH_INFO_AVAILABLE = CameraCharacteristics.FLASH_INFO_AVAILABLE;
        Intrinsics.g(FLASH_INFO_AVAILABLE, "FLASH_INFO_AVAILABLE");
        Boolean bool = (Boolean) ((C1098q0) interfaceC1080o0).a(FLASH_INFO_AVAILABLE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int w() {
        CameraSettings cameraSettings = this.c;
        Object property = cameraSettings != null ? cameraSettings.getProperty("numFramesInCameraApi2FrameDataPool") : null;
        Integer num = property instanceof Integer ? (Integer) property : null;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final boolean x() {
        InterfaceC1080o0 interfaceC1080o0 = this.d;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.g(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) ((C1098q0) interfaceC1080o0).a(LENS_FACING);
        return (num != null ? num.intValue() : 1) == 0;
    }

    public final Range[] a() {
        return ((C1098q0) this.d).a();
    }
}
