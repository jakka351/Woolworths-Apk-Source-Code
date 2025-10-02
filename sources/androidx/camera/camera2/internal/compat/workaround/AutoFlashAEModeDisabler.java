package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class AutoFlashAEModeDisabler {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f349a;
    public final boolean b;

    public AutoFlashAEModeDisabler(Quirks quirks) {
        this.f349a = quirks.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = DeviceQuirks.f327a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
