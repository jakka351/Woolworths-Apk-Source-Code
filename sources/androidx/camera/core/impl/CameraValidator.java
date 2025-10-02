package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import java.util.LinkedHashSet;

@OptIn
/* loaded from: classes2.dex */
public final class CameraValidator {

    /* renamed from: a, reason: collision with root package name */
    public static final CameraSelector f481a;

    @RequiresApi
    public static class Api34Impl {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class CameraIdListIncorrectException extends Exception {
        public final int d;

        public CameraIdListIncorrectException(String str, int i, IllegalArgumentException illegalArgumentException) {
            super(str, illegalArgumentException);
            this.d = i;
        }
    }

    static {
        CameraSelector.Builder builder = new CameraSelector.Builder();
        builder.a(2);
        f481a = new CameraSelector(builder.f396a);
    }

    public static void a(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && Api34Impl.a(context) != 0) {
            LinkedHashSet linkedHashSetA = cameraRepository.a();
            if (linkedHashSetA.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            Logger.a("CameraValidator", "Virtual device with ID: " + Api34Impl.a(context) + " has " + linkedHashSetA.size() + " cameras. Skipping validation.");
            return;
        }
        if (cameraSelector != null) {
            try {
                numB = cameraSelector.b();
                if (numB == null) {
                    Logger.e("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                Logger.c("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numB = null;
        }
        Logger.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numB);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || numB.intValue() == 1)) {
                CameraSelector.c.c(cameraRepository.a());
                i = 1;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            Logger.f("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (cameraSelector == null || numB.intValue() == 0)) {
                CameraSelector.b.c(cameraRepository.a());
                i++;
            }
        } catch (IllegalArgumentException e3) {
            illegalArgumentException = e3;
            Logger.f("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f481a.c(cameraRepository.a());
            Logger.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        Logger.b("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + cameraRepository.a());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }
}
