package com.scandit.datacapture.core;

import android.media.Image;
import com.scandit.datacapture.core.internal.sdk.extensions.ImageExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private final C0 f18378a;
    private final S b = new S(this);

    public U(int i) {
        this.f18378a = new C0(i);
    }

    public static final void a(U u, NativeCameraCaptureParameters nativeCameraCaptureParameters, InterfaceC1026i0 interfaceC1026i0, V v) {
        u.getClass();
        if (interfaceC1026i0 != null) {
            C1035j0 c1035j0 = (C1035j0) interfaceC1026i0;
            Float fD = c1035j0.d();
            if (fD != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.EXPOSURE_TIME, fD.floatValue());
            }
            Float fE = c1035j0.e();
            if (fE != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.F_NUMBER, fE.floatValue());
            }
            Float fG = c1035j0.g();
            if (fG != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.LENS_FOCUSING_DISTANCE, fG.floatValue());
            }
            if (c1035j0.j() != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.ISO, r1.intValue());
            }
            Integer numC = c1035j0.c();
            if (numC != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.EXPOSURE_BIAS_VALUE, ((W4) v).b().floatValue() * numC.intValue());
            }
            Integer numF = c1035j0.f();
            if (numF != null) {
                int iIntValue = numF.intValue();
                nativeCameraCaptureParameters.insertBool(NativeCameraCaptureParameterKey.FLASH_ENABLED, iIntValue == 4 || iIntValue == 3);
            }
        }
    }

    public static final void a(U u, NativeCameraFrameData nativeCameraFrameData) {
        u.f18378a.a(nativeCameraFrameData);
    }

    public final NativeCameraFrameData a(Image image, InterfaceC1026i0 interfaceC1026i0, int i, boolean z, V cameraInfo, Long l) {
        Intrinsics.h(image, "image");
        Intrinsics.h(cameraInfo, "cameraInfo");
        NativeCameraFrameData nativeCameraFrameDataA = this.f18378a.a();
        if (nativeCameraFrameDataA == null) {
            return null;
        }
        W4 w4 = (W4) cameraInfo;
        return ImageExtensionsKt.updateFrameData(image, nativeCameraFrameDataA, this.b, i, z, w4.f(), new T(this, interfaceC1026i0, w4, l));
    }
}
