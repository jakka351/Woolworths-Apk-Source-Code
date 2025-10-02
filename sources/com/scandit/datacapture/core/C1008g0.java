package com.scandit.datacapture.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1008g0 implements InterfaceC0954a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0981d0 f18522a = new C0981d0(0);

    private static Surface a(InterfaceC0979c7 interfaceC0979c7, List previewResolutions, C1037j2 targetFrameSize) {
        Object next;
        Intrinsics.h(previewResolutions, "previewResolutions");
        Intrinsics.h(targetFrameSize, "targetFrameSize");
        Rational rational = new Rational(targetFrameSize.d(), targetFrameSize.b());
        int iC = targetFrameSize.c();
        List listU0 = CollectionsKt.u0(new C0963b0(), previewResolutions);
        Iterator it = listU0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Size size = (Size) next;
            if (Intrinsics.c(targetFrameSize.a(), size)) {
                break;
            }
            int iMin = Math.min(size.getWidth(), size.getHeight());
            if (new Rational(size.getWidth(), size.getHeight()).equals(rational) && iC != 0 && iMin >= iC) {
                break;
            }
        }
        size = (Size) next;
        if (size == null) {
            for (Size size2 : CollectionsKt.u0(new C0972c0(rational.floatValue()), listU0)) {
                if (Math.min(size2.getWidth(), size2.getHeight()) >= iC) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C1024h7 c1024h7 = (C1024h7) interfaceC0979c7;
        c1024h7.a(size2.getWidth(), size2.getHeight());
        return c1024h7.b();
    }

    public void a(Handler handler, CameraDevice cameraDevice, E0 cameraInfo, InterfaceC0979c7 surfaceHolder, C1037j2 frameSize, Z callback) {
        Z z;
        Intrinsics.h(handler, "handler");
        Intrinsics.h(cameraDevice, "cameraDevice");
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(surfaceHolder, "surfaceHolder");
        Intrinsics.h(frameSize, "frameSize");
        Intrinsics.h(callback, "callback");
        try {
            Surface surfaceA = a(surfaceHolder, ((F0) cameraInfo).p(), frameSize);
            ImageReader imageReaderA = C0981d0.a(frameSize);
            b8 b8Var = new b8(callback);
            imageReaderA.setOnImageAvailableListener(b8Var, handler);
            Surface surface = imageReaderA.getSurface();
            Intrinsics.g(surface, "yuvImageReader.surface");
            CaptureRequest.Builder builderB = AbstractC1017h0.b(cameraDevice, surfaceA, surface);
            z = callback;
            try {
                C0999f0 c0999f0 = new C0999f0(z, cameraDevice, surfaceA, imageReaderA, b8Var, handler, f18522a.b(cameraDevice, surfaceA));
                CaptureRequest captureRequestBuild = builderB.build();
                Intrinsics.g(captureRequestBuild, "requestBuilder.build()");
                SessionConfiguration sessionConfiguration = new SessionConfiguration(0, CollectionsKt.R(new OutputConfiguration(surfaceA), new OutputConfiguration(imageReaderA.getSurface())), new ExecutorC0990e0(handler), c0999f0);
                sessionConfiguration.setSessionParameters(captureRequestBuild);
                cameraDevice.createCaptureSession(sessionConfiguration);
            } catch (CameraAccessException e) {
                e = e;
                e.printStackTrace();
                ((K) z).a(C1053l0.f18794a);
            } catch (IllegalArgumentException e2) {
                e = e2;
                e.printStackTrace();
                ((K) z).a(C1053l0.f18794a);
            } catch (IllegalStateException e3) {
                e = e3;
                e.printStackTrace();
                ((K) z).a(C1053l0.f18794a);
            }
        } catch (CameraAccessException e4) {
            e = e4;
            z = callback;
        } catch (IllegalArgumentException e5) {
            e = e5;
            z = callback;
        } catch (IllegalStateException e6) {
            e = e6;
            z = callback;
        }
    }
}
