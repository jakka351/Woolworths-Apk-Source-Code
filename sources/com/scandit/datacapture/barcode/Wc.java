package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Wc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17337a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[TorchState.values().length];
        try {
            iArr[TorchState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f17337a = iArr;
        int[] iArr2 = new int[SparkScanScanningBehavior.values().length];
        try {
            iArr2[SparkScanScanningBehavior.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[SparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[SparkScanViewHandMode.values().length];
        try {
            iArr3[SparkScanViewHandMode.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[SparkScanViewHandMode.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        c = iArr3;
        int[] iArr4 = new int[NativeSparkScanViewState.values().length];
        try {
            iArr4[NativeSparkScanViewState.ACTIVE_EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr4[NativeSparkScanViewState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[NativeSparkScanViewState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[NativeSparkScanViewState.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[NativeSparkScanViewState.INITIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
        int[] iArr5 = new int[CameraPosition.values().length];
        try {
            iArr5[CameraPosition.WORLD_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        e = iArr5;
        int[] iArr6 = new int[NativeSparkScanToastType.values().length];
        try {
            iArr6[NativeSparkScanToastType.TARGET_MODE_ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[NativeSparkScanToastType.TARGET_MODE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr6[NativeSparkScanToastType.CONTINUOUS_MODE_ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr6[NativeSparkScanToastType.CONTINUOUS_MODE_DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[NativeSparkScanToastType.SCAN_PAUSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[NativeSparkScanToastType.ZOOMED_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[NativeSparkScanToastType.ZOOMED_OUT.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[NativeSparkScanToastType.TORCH_ON.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[NativeSparkScanToastType.TORCH_OFF.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[NativeSparkScanToastType.USER_FACING_CAMERA_ENABLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[NativeSparkScanToastType.WORLD_FACING_CAMERA_ENABLED.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        f = iArr6;
    }
}
