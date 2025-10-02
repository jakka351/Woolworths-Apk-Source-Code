package androidx.camera.camera2.internal;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ExposureControl {
    public final Executor b;
    public boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public final ExposureStateImpl f273a = new ExposureStateImpl();

    public ExposureControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.b = executor;
    }
}
