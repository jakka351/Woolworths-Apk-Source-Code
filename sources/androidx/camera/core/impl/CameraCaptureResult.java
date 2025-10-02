package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface CameraCaptureResult {

    public static final class EmptyCameraCaptureResult implements CameraCaptureResult {
        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final TagBundle a() {
            return TagBundle.b;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final CameraCaptureMetaData.AfState c() {
            return CameraCaptureMetaData.AfState.d;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final CameraCaptureMetaData.AwbState d() {
            return CameraCaptureMetaData.AwbState.d;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final CameraCaptureMetaData.AeState e() {
            return CameraCaptureMetaData.AeState.d;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final CameraCaptureMetaData.FlashState f() {
            return CameraCaptureMetaData.FlashState.d;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final CaptureResult g() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public final long getTimestamp() {
            return -1L;
        }
    }

    TagBundle a();

    default void b(ExifData.Builder builder) {
        int i;
        ArrayList arrayList = builder.f514a;
        CameraCaptureMetaData.FlashState flashStateF = f();
        if (flashStateF == CameraCaptureMetaData.FlashState.d) {
            return;
        }
        int iOrdinal = flashStateF.ordinal();
        if (iOrdinal == 1) {
            i = 32;
        } else if (iOrdinal == 2) {
            i = 0;
        } else {
            if (iOrdinal != 3) {
                Logger.e("ExifData", "Unknown flash state: " + flashStateF);
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            builder.c("LightSource", String.valueOf(4), arrayList);
        }
        builder.c("Flash", String.valueOf(i), arrayList);
    }

    CameraCaptureMetaData.AfState c();

    CameraCaptureMetaData.AwbState d();

    CameraCaptureMetaData.AeState e();

    CameraCaptureMetaData.FlashState f();

    default CaptureResult g() {
        return null;
    }

    long getTimestamp();
}
