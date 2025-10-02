package com.scandit.datacapture.core;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1115s {

    /* renamed from: a, reason: collision with root package name */
    private final C1151w f18828a;
    private final InterfaceC1124t b;
    private int c;
    private int d;
    private final Function1 e;
    private final com.scandit.datacapture.core.internal.module.source.m f;
    private final HandlerC1097q g;
    private final C0 h;
    private final C1106r i;
    private boolean j;
    private final Camera.PreviewCallback k;

    public C1115s(C1151w cameraWrapper, InterfaceC1124t cameraInfo, int i, int i2, Function1 frameDataCallback, com.scandit.datacapture.core.internal.module.source.m delegate) {
        Intrinsics.h(cameraWrapper, "cameraWrapper");
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(frameDataCallback, "frameDataCallback");
        Intrinsics.h(delegate, "delegate");
        this.f18828a = cameraWrapper;
        this.b = cameraInfo;
        this.c = i;
        this.d = i2;
        this.e = frameDataCallback;
        this.f = delegate;
        this.g = new HandlerC1097q(this);
        this.h = new C0(3);
        this.i = new C1106r(this);
        this.j = true;
        this.k = new Camera.PreviewCallback() { // from class: com.scandit.datacapture.core.u8
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                C1115s.a(this.d, bArr, camera);
            }
        };
        a();
        b();
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final void c() {
        Camera cameraB = this.f18828a.b();
        if (cameraB != null) {
            cameraB.setPreviewCallbackWithBuffer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1115s this$0, byte[] bArr, Camera camera) {
        NativeCameraFrameData nativeCameraFrameDataA;
        Intrinsics.h(this$0, "this$0");
        if (bArr == null) {
            return;
        }
        if (bArr.length != ((this$0.c * this$0.d) * 12) / 8 || (nativeCameraFrameDataA = this$0.h.a()) == null) {
            nativeCameraFrameDataA = null;
        } else {
            NativeCameraCaptureParameters captureParameters = nativeCameraFrameDataA.getCaptureParameters();
            if (captureParameters != null) {
                captureParameters.clear();
            } else {
                captureParameters = NativeCameraCaptureParameters.create();
            }
            NativeCameraCaptureParameters captureParameters2 = captureParameters;
            int i = this$0.c;
            int i2 = this$0.d;
            C1106r c1106r = this$0.i;
            int cameraToNativeDeviceOrientation = this$0.f.getCameraToNativeDeviceOrientation();
            NativeAxis nativeAxis = this$0.f.shouldMirrorAroundYAxis() ? NativeAxis.Y : NativeAxis.NONE;
            Intrinsics.g(captureParameters2, "captureParameters");
            InterfaceC1124t cameraInfo = this$0.b;
            Intrinsics.h(cameraInfo, "cameraInfo");
            NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
            int iC = ((U4) cameraInfo).c();
            captureParameters2.insertInt64(nativeCameraCaptureParameterKey, iC != 0 ? iC != 1 ? -1L : 2L : 1L);
            nativeCameraFrameDataA.update(i, i2, bArr, c1106r, cameraToNativeDeviceOrientation, nativeAxis, captureParameters2, null);
        }
        NativeCameraFrameData nativeCameraFrameData = nativeCameraFrameDataA;
        if (nativeCameraFrameData != null) {
            nativeCameraFrameData.retain();
            try {
                if (this$0.j) {
                    this$0.e.invoke(nativeCameraFrameData);
                }
                nativeCameraFrameData.release();
            } catch (Throwable th) {
                nativeCameraFrameData.release();
                throw th;
            }
        }
    }

    private final void b() {
        for (int i = 0; i < 3; i++) {
            byte[] bArr = new byte[((this.c * this.d) * 12) / 8];
            Camera cameraB = this.f18828a.b();
            if (cameraB != null) {
                cameraB.addCallbackBuffer(bArr);
            }
        }
    }

    public final void a() {
        Camera cameraB = this.f18828a.b();
        if (cameraB != null) {
            cameraB.setPreviewCallbackWithBuffer(this.k);
        }
    }

    public final void a(int i, int i2) {
        if (this.c == i && this.d == i2) {
            return;
        }
        Camera cameraB = this.f18828a.b();
        if (cameraB != null) {
            cameraB.setPreviewCallbackWithBuffer(null);
        }
        this.c = i;
        this.d = i2;
        b();
    }

    public final void a(NativeCameraFrameData cameraFrame) {
        Intrinsics.h(cameraFrame, "cameraFrame");
        byte[] bArrTakeBuffer = cameraFrame.takeBuffer();
        HandlerC1097q handlerC1097q = this.g;
        handlerC1097q.sendMessage(handlerC1097q.obtainMessage(0, bArrTakeBuffer));
        this.h.a(cameraFrame);
    }

    public static final void a(C1115s c1115s, byte[] bArr) {
        Camera cameraB;
        if (bArr.length != ((c1115s.c * c1115s.d) * 12) / 8 || (cameraB = c1115s.f18828a.b()) == null) {
            return;
        }
        cameraB.addCallbackBuffer(bArr);
    }
}
