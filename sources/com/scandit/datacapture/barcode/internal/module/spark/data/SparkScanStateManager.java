package com.scandit.datacapture.barcode.internal.module.spark.data;

import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.AbstractC0523ab;
import com.scandit.datacapture.barcode.C0539bb;
import com.scandit.datacapture.barcode.C0575cb;
import com.scandit.datacapture.barcode.C0794q5;
import com.scandit.datacapture.barcode.Ga;
import com.scandit.datacapture.barcode.Gc;
import com.scandit.datacapture.barcode.Ha;
import com.scandit.datacapture.barcode.Ia;
import com.scandit.datacapture.barcode.Za;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientationMapper;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class SparkScanStateManager {
    static final /* synthetic */ KProperty[] u;

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f17773a;
    private final NativeSparkScanStateMachine b;
    private final DeviceOrientationMapper c;
    private final int d;
    private final int e;
    private boolean f;
    private final SharedPreferences g;
    private C0794q5 h;
    private final C0539bb i;
    private C0794q5 j;
    private C0794q5 k;
    private C0794q5 l;
    private C0794q5 m;
    private SparkScanScanningMode n;
    private boolean o;
    private boolean p;
    private boolean q;
    private C0794q5 r;
    private final C0575cb s;
    private final CopyOnWriteArraySet t;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SparkScanStateManager.class, "torchState", "getTorchState()Lcom/scandit/datacapture/core/source/TorchState;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        u = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(SparkScanStateManager.class, "cameraPosition", "getCameraPosition()Lcom/scandit/datacapture/core/source/CameraPosition;", 0, reflectionFactory)};
    }

    public SparkScanStateManager(SparkScanViewSettings settings, NativeSparkScanStateMachine nativeStateMachine, Ha sparkScanMigrationManager, DeviceOrientationMapper deviceOrientationMapper) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(nativeStateMachine, "nativeStateMachine");
        Intrinsics.h(sparkScanMigrationManager, "sparkScanMigrationManager");
        Intrinsics.h(deviceOrientationMapper, "deviceOrientationMapper");
        this.f17773a = settings;
        this.b = nativeStateMachine;
        this.c = deviceOrientationMapper;
        this.d = Gc.b() / 2;
        this.e = Gc.m() / 2;
        SharedPreferences it = AppAndroidEnvironment.INSTANCE.getApplicationContext().getSharedPreferences("com.scandit.barcode.spark_capture", 0);
        Intrinsics.g(it, "it");
        ((Ia) sparkScanMigrationManager).a(it);
        this.g = it;
        this.h = new C0794q5(settings.getDefaultTorchState());
        this.i = new C0539bb(settings.getDefaultTorchState(), this);
        this.j = new C0794q5(c());
        this.k = new C0794q5(Boolean.valueOf(p()));
        this.l = new C0794q5(Boolean.valueOf(f()));
        this.m = new C0794q5(settings.getDefaultScanningMode());
        this.n = settings.getDefaultScanningMode();
        this.r = new C0794q5(settings.getDefaultCameraPosition());
        this.s = new C0575cb(settings.getDefaultCameraPosition(), this);
        this.t = new CopyOnWriteArraySet();
        a(settings.getDefaultScanningMode());
        nativeStateMachine.addScanningModeListenerAsync(new Ga(new a(this), this));
    }

    public final void b(SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.h(sparkScanScanningMode, "<set-?>");
        this.n = sparkScanScanningMode;
    }

    public final SparkScanViewHandMode c() {
        String string = this.g.getString("spark-capture-camera-hand-mode-setting", this.f17773a.getDefaultHandMode().name());
        if (string == null) {
            string = "";
        }
        SparkScanViewHandMode sparkScanViewHandModeValueOf = SparkScanViewHandMode.valueOf(string);
        int i = AbstractC0523ab.f17377a[k().ordinal()];
        return i != 1 ? i != 2 ? sparkScanViewHandModeValueOf : SparkScanViewHandMode.LEFT : SparkScanViewHandMode.RIGHT;
    }

    public final C0794q5 d() {
        return this.j;
    }

    public final void e(boolean z) {
        this.g.edit().putBoolean("spark-scan-feedback-sound-enabled", z).apply();
        this.k.b(Boolean.valueOf(z));
    }

    public final boolean f() {
        return this.g.getBoolean("spark-scan-feedback-haptic-enabled", this.f17773a.getHapticEnabled());
    }

    public final C0794q5 g() {
        return this.l;
    }

    public final long h() {
        return this.f17773a.getTriggerButtonCollapseTimeout().asMillis();
    }

    public final long i() {
        return this.f17773a.getInactiveStateTimeout().asMillis();
    }

    public final boolean j() {
        return this.o;
    }

    public final DeviceOrientation k() {
        return this.c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
    }

    public final float l() {
        float f;
        int i;
        boolean z = this.f;
        if (z) {
            boolean zV = v();
            if (zV) {
                f = this.g.getFloat("spark-capture-y-center-location", -1.0f);
            } else {
                if (zV) {
                    throw new NoWhenBranchMatchedException();
                }
                f = this.g.getFloat("spark-capture-y-center-location-landscape", BitmapDescriptorFactory.HUE_RED);
            }
            i = this.e;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            boolean zV2 = v();
            if (zV2) {
                f = this.g.getFloat("spark-capture-y-center-location", -1.0f);
            } else {
                if (zV2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = this.g.getFloat("spark-capture-y-center-location-landscape", BitmapDescriptorFactory.HUE_RED);
            }
            i = this.d;
        }
        return f - i;
    }

    public final SparkScanScanningMode m() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeSparkScanScanningMode scanningMode = this.b.getScanningMode();
        Intrinsics.g(scanningMode, "nativeStateMachine.scanningMode");
        return barcodeNativeTypeFactory.convert(scanningMode);
    }

    public final SparkScanScanningMode n() {
        return this.n;
    }

    public final C0794q5 o() {
        return this.m;
    }

    public final boolean p() {
        return this.g.getBoolean("spark-scan-feedback-sound-enabled", this.f17773a.getSoundEnabled());
    }

    public final C0794q5 q() {
        return this.k;
    }

    public final TorchState r() {
        return (TorchState) this.i.getValue(this, u[0]);
    }

    public final C0794q5 s() {
        return this.h;
    }

    public final float t() {
        return this.g.getFloat("spark-capture-x-location", BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean u() {
        return this.p;
    }

    public final boolean v() {
        DeviceOrientation deviceOrientationMapRotationToOrientation = this.c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
        return (deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_LEFT || deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_RIGHT) ? false : true;
    }

    public final void a(boolean z) {
        this.f = z;
    }

    public final void b(float f) {
        this.g.edit().putFloat("spark-capture-x-location", f).apply();
    }

    public final void d(boolean z) {
        if (z) {
            this.n = m();
            a(SparkScanScanningModeKt.copyWith$default(m(), SparkScanScanningBehavior.CONTINUOUS, null, 2, null));
        } else if (!z) {
            a(this.n);
        }
        this.o = z;
    }

    public final float a(float f) {
        int i;
        boolean z = this.f;
        if (z) {
            i = this.e;
        } else if (!z) {
            i = this.d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f + i;
    }

    public final void f(boolean z) {
        this.p = z;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final C0794q5 b() {
        return this.r;
    }

    public final boolean e() {
        return this.q;
    }

    public final void b(Za listener) {
        Intrinsics.h(listener, "listener");
        this.t.remove(listener);
    }

    public final void a(TorchState torchState) {
        Intrinsics.h(torchState, "<set-?>");
        this.i.setValue(this, u[0], torchState);
    }

    public final void c(boolean z) {
        this.g.edit().putBoolean("spark-scan-feedback-haptic-enabled", z).apply();
        this.l.b(Boolean.valueOf(z));
    }

    public final void a(SparkScanViewHandMode value) {
        Intrinsics.h(value, "value");
        this.g.edit().putString("spark-capture-camera-hand-mode-setting", value.name()).apply();
        this.j.b(value);
    }

    public final void c(float f) {
        boolean zV = v();
        if (zV) {
            this.g.edit().putFloat("spark-capture-y-center-location", f).apply();
        } else {
            if (zV) {
                return;
            }
            this.g.edit().putFloat("spark-capture-y-center-location-landscape", f).apply();
        }
    }

    public final void a(SparkScanScanningMode value) {
        Intrinsics.h(value, "value");
        this.m.b(value);
        this.b.setScanningMode(BarcodeNativeTypeFactory.INSTANCE.convert(value));
    }

    public final CameraPosition a() {
        return (CameraPosition) this.s.getValue(this, u[1]);
    }

    public final void a(CameraPosition cameraPosition) {
        Intrinsics.h(cameraPosition, "<set-?>");
        this.s.setValue(this, u[1], cameraPosition);
    }

    public final void a(Za listener) {
        Intrinsics.h(listener, "listener");
        this.t.add(listener);
    }

    public /* synthetic */ SparkScanStateManager(SparkScanViewSettings sparkScanViewSettings, NativeSparkScanStateMachine nativeSparkScanStateMachine) {
        this(sparkScanViewSettings, nativeSparkScanStateMachine, new Ia(), new DeviceOrientationMapper());
    }
}
