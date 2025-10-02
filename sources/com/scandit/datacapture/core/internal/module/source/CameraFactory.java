package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.A0;
import com.scandit.datacapture.core.C1170y0;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CameraFactory {
    public static final A0 d = new A0(0);

    /* renamed from: a, reason: collision with root package name */
    private final CameraProfile f18562a;
    private final Function1 b;
    private final C1170y0 c;

    public CameraFactory(CameraProfile cameraProfile, Function1 cameraDelegateFactory) {
        Intrinsics.h(cameraProfile, "cameraProfile");
        Intrinsics.h(cameraDelegateFactory, "cameraDelegateFactory");
        this.f18562a = cameraProfile;
        this.b = cameraDelegateFactory;
        this.c = new C1170y0();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0001, B:46:0x00b5, B:9:0x001a, B:10:0x001f, B:13:0x0023, B:15:0x002b, B:17:0x003b, B:32:0x0072, B:43:0x00ab, B:34:0x0078, B:36:0x008c, B:41:0x0098, B:42:0x00a4, B:18:0x003e, B:20:0x0048, B:21:0x004b, B:23:0x0051, B:25:0x0059, B:26:0x005c, B:28:0x0064, B:30:0x006a), top: B:52:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.scandit.datacapture.core.source.Camera a(com.scandit.datacapture.core.source.CameraPosition r8, com.scandit.datacapture.core.source.CameraSettings r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "position"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)     // Catch: java.lang.Throwable -> L20
            int[] r0 = com.scandit.datacapture.core.B0.f18297a     // Catch: java.lang.Throwable -> L20
            int r1 = r8.ordinal()     // Catch: java.lang.Throwable -> L20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == r1) goto L23
            if (r0 == r2) goto L23
            r8 = 3
            if (r0 != r8) goto L1a
            goto L94
        L1a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L20
            r8.<init>()     // Catch: java.lang.Throwable -> L20
            throw r8     // Catch: java.lang.Throwable -> L20
        L20:
            r8 = move-exception
            goto Lc0
        L23:
            com.scandit.datacapture.core.y0 r0 = r7.c     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera r0 = r0.a(r8)     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L5c
            java.lang.String r4 = "api"
            java.lang.Object r4 = r9.getProperty(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r4, r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L3e
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = com.scandit.datacapture.core.internal.module.source.NativeCameraApi.CAMERA1     // Catch: java.lang.Throwable -> L20
            goto L70
        L3e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r4, r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4b
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = com.scandit.datacapture.core.internal.module.source.NativeCameraApi.CAMERA2     // Catch: java.lang.Throwable -> L20
            goto L70
        L4b:
            boolean r1 = r9.isUsingApi2Features$scandit_capture_core()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L5c
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r7.f18562a     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L5c
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = com.scandit.datacapture.core.internal.module.source.NativeCameraApi.CAMERA2     // Catch: java.lang.Throwable -> L20
            goto L70
        L5c:
            com.scandit.datacapture.core.y0 r1 = r7.c     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera r1 = r1.a(r8)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L6a
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = r1.getApi$scandit_capture_core()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L70
        L6a:
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r7.f18562a     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r1 = r1.k()     // Catch: java.lang.Throwable -> L20
        L70:
            if (r0 == 0) goto L78
            com.scandit.datacapture.core.internal.module.source.NativeCameraApi r4 = r0.getApi$scandit_capture_core()     // Catch: java.lang.Throwable -> L20
            if (r4 == r1) goto Lab
        L78:
            com.scandit.datacapture.core.internal.module.source.o r4 = new com.scandit.datacapture.core.internal.module.source.o     // Catch: java.lang.Throwable -> L20
            r4.<init>(r7, r8)     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.internal.module.source.p r5 = new com.scandit.datacapture.core.internal.module.source.p     // Catch: java.lang.Throwable -> L20
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.functions.Function1 r6 = r7.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.t0 r1 = (com.scandit.datacapture.core.InterfaceC1125t0) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L91
            com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate r1 = r1.a(r8, r9, r4, r5)     // Catch: java.lang.Throwable -> L20
            goto L92
        L91:
            r1 = r3
        L92:
            if (r1 != 0) goto L96
        L94:
            r8 = r3
            goto Lb1
        L96:
            if (r0 != 0) goto La4
            com.scandit.datacapture.core.y0 r0 = r7.c     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera$Companion r4 = com.scandit.datacapture.core.source.Camera.INSTANCE     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera r1 = r4.create$scandit_capture_core(r1)     // Catch: java.lang.Throwable -> L20
            r0.a(r8, r1)     // Catch: java.lang.Throwable -> L20
            goto Lab
        La4:
            com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera r0 = r0.getF18831a()     // Catch: java.lang.Throwable -> L20
            r0.setDelegate(r1)     // Catch: java.lang.Throwable -> L20
        Lab:
            com.scandit.datacapture.core.y0 r0 = r7.c     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera r8 = r0.a(r8)     // Catch: java.lang.Throwable -> L20
        Lb1:
            if (r8 == 0) goto Lbe
            if (r9 == 0) goto Lbd
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r0 = r7.f18562a     // Catch: java.lang.Throwable -> L20
            r9.addDefaultPropertiesFromProfile$scandit_capture_core(r0)     // Catch: java.lang.Throwable -> L20
            com.scandit.datacapture.core.source.Camera.applySettings$default(r8, r9, r3, r2, r3)     // Catch: java.lang.Throwable -> L20
        Lbd:
            r3 = r8
        Lbe:
            monitor-exit(r7)
            return r3
        Lc0:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L20
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.CameraFactory.a(com.scandit.datacapture.core.source.CameraPosition, com.scandit.datacapture.core.source.CameraSettings):com.scandit.datacapture.core.source.Camera");
    }

    public /* synthetic */ CameraFactory(CameraProfile cameraProfile) {
        this(cameraProfile, new n());
    }
}
