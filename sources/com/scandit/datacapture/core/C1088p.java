package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1088p implements InterfaceC1125t0 {

    /* renamed from: a, reason: collision with root package name */
    private final CameraProfile f18813a;
    private final InterfaceC1133u b;

    public C1088p(CameraProfile cameraProfile, InterfaceC1133u cameraInfoProvider) {
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(cameraInfoProvider, "cameraInfoProvider");
        this.f18813a = cameraProfile;
        this.b = cameraInfoProvider;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1125t0
    public final NativeCameraDelegate a(CameraPosition position, CameraSettings cameraSettings, Function1 frameCallback, Function1 priorityCameraSwitchStateCallback) {
        Object next;
        Intrinsics.h(position, "position");
        Intrinsics.h(frameCallback, "frameCallback");
        Intrinsics.h(priorityCameraSwitchStateCallback, "priorityCameraSwitchStateCallback");
        CameraPosition cameraPosition = CameraPosition.UNSPECIFIED;
        if (position == cameraPosition) {
            throw new IllegalStateException("Check failed.");
        }
        int i = AbstractC1079o.f18811a[position.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new AssertionError("Unsupported CameraPosition " + cameraPosition);
            }
            i2 = 0;
        }
        Iterator it = ((V4) this.b).a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((U4) ((InterfaceC1124t) next)).c() == i2) {
                break;
            }
        }
        InterfaceC1124t interfaceC1124t = (InterfaceC1124t) next;
        if (interfaceC1124t == null) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, 0, YU.a.d(i2, "No suitable CameraInfo found with facing "), null, 10, null));
        }
        if (interfaceC1124t == null) {
            return null;
        }
        return new com.scandit.datacapture.core.internal.module.source.m(interfaceC1124t, this.f18813a, frameCallback);
    }
}
