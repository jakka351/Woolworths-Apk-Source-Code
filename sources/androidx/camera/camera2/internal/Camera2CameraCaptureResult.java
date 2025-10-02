package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes2.dex */
public class Camera2CameraCaptureResult implements CameraCaptureResult {

    /* renamed from: a, reason: collision with root package name */
    public final TagBundle f227a;
    public final CaptureResult b;

    public Camera2CameraCaptureResult(TagBundle tagBundle, CaptureResult captureResult) {
        this.f227a = tagBundle;
        this.b = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final TagBundle a() {
        return this.f227a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final void b(ExifData.Builder builder) {
        CaptureResult captureResult = this.b;
        super.b(builder);
        ArrayList arrayList = builder.f514a;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.e(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Logger.e("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            builder.c("ExposureTime", String.valueOf(r2.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            builder.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r3.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            builder.c("SensitivityType", String.valueOf(3), arrayList);
            builder.c("PhotographicSensitivity", String.valueOf(Math.min(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            builder.d(f2.floatValue());
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            int iOrdinal = (num2.intValue() == 0 ? ExifData.WhiteBalanceMode.e : ExifData.WhiteBalanceMode.d).ordinal();
            builder.c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AfState c() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        CameraCaptureMetaData.AfState afState = CameraCaptureMetaData.AfState.d;
        if (num == null) {
            return afState;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Logger.b("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return afState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AwbState d() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_STATE);
        CameraCaptureMetaData.AwbState awbState = CameraCaptureMetaData.AwbState.d;
        if (num == null) {
            return awbState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData.AwbState.e;
        }
        if (iIntValue == 1) {
            return CameraCaptureMetaData.AwbState.f;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData.AwbState.g;
        }
        if (iIntValue == 3) {
            return CameraCaptureMetaData.AwbState.h;
        }
        Logger.b("C2CameraCaptureResult", "Undefined awb state: " + num);
        return awbState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AeState e() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.d;
        if (num == null) {
            return aeState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData.AeState.e;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return CameraCaptureMetaData.AeState.h;
            }
            if (iIntValue == 3) {
                return CameraCaptureMetaData.AeState.i;
            }
            if (iIntValue == 4) {
                return CameraCaptureMetaData.AeState.g;
            }
            if (iIntValue != 5) {
                Logger.b("C2CameraCaptureResult", "Undefined ae state: " + num);
                return aeState;
            }
        }
        return CameraCaptureMetaData.AeState.f;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.FlashState f() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        CameraCaptureMetaData.FlashState flashState = CameraCaptureMetaData.FlashState.d;
        if (num == null) {
            return flashState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return CameraCaptureMetaData.FlashState.e;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData.FlashState.f;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return CameraCaptureMetaData.FlashState.g;
        }
        Logger.b("C2CameraCaptureResult", "Undefined flash state: " + num);
        return flashState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CaptureResult g() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final long getTimestamp() {
        Long l = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final CameraCaptureMetaData.AfMode h() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_MODE);
        CameraCaptureMetaData.AfMode afMode = CameraCaptureMetaData.AfMode.d;
        if (num == null) {
            return afMode;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return CameraCaptureMetaData.AfMode.f;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return CameraCaptureMetaData.AfMode.g;
            }
            if (iIntValue != 5) {
                Logger.b("C2CameraCaptureResult", "Undefined af mode: " + num);
                return afMode;
            }
        }
        return CameraCaptureMetaData.AfMode.e;
    }

    public Camera2CameraCaptureResult(CaptureResult captureResult) {
        this(TagBundle.b, captureResult);
    }
}
