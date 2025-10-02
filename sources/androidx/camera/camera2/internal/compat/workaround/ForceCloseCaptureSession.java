package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class ForceCloseCaptureSession {

    /* renamed from: a, reason: collision with root package name */
    public final CaptureSessionOnClosedNotCalledQuirk f353a;

    @FunctionalInterface
    public interface OnConfigured {
    }

    public ForceCloseCaptureSession(Quirks quirks) {
        this.f353a = (CaptureSessionOnClosedNotCalledQuirk) quirks.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }
}
