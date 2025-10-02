package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class O implements InterfaceC1125t0 {

    /* renamed from: a, reason: collision with root package name */
    private final CameraManager f18350a;
    private final CameraProfile b;
    private final W c;

    public O(CameraManager cameraManager, CameraProfile cameraProfile, W cameraInfoProvider) {
        Intrinsics.h(cameraManager, "cameraManager");
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(cameraInfoProvider, "cameraInfoProvider");
        this.f18350a = cameraManager;
        this.b = cameraProfile;
        this.c = cameraInfoProvider;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1125t0
    public final NativeCameraDelegate a(CameraPosition position, CameraSettings cameraSettings, Function1 frameCallback, Function1 priorityCameraSwitchStateCallback) throws CameraAccessException {
        Object next;
        V v;
        Object next2;
        Intrinsics.h(position, "position");
        Intrinsics.h(frameCallback, "frameCallback");
        Intrinsics.h(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        CameraPosition cameraPosition = CameraPosition.UNSPECIFIED;
        if (position == cameraPosition) {
            throw new IllegalStateException("Check failed.");
        }
        Object property = cameraSettings != null ? cameraSettings.getProperty("cameraId") : null;
        String str = property instanceof String ? (String) property : null;
        if (str != null) {
            List listA = ((X4) this.c).a();
            Iterator it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.c(((W4) ((V) next2)).e(), str)) {
                    break;
                }
            }
            v = (V) next2;
            if (v == null) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, "No suitable CameraInfo found for id ".concat(str), CollectionsKt.M(listA, ";", null, null, null, 62), 2, null));
            }
        } else {
            int i = P.f18354a[position.ordinal()];
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new AssertionError("Unsupported CameraPosition " + cameraPosition);
            }
            List listA2 = ((X4) this.c).a();
            Iterator it2 = listA2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((W4) ((V) next)).c() == i2) {
                    break;
                }
            }
            v = (V) next;
            if (v == null) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, YU.a.d(i2, "No suitable CameraInfo found with facing "), CollectionsKt.M(listA2, ";", null, null, null, 62), 2, null));
            }
        }
        if (v == null) {
            return null;
        }
        O0 o0 = new O0(this.f18350a);
        C1008g0 c1008g0 = new C1008g0();
        F0 f0 = new F0(this.b, v, cameraSettings);
        return new N(f0, frameCallback, priorityCameraSwitchStateCallback, o0, new C1069m7(), c1008g0, new J6(), new C0992e2(f0), C1178z.f18996a);
    }
}
