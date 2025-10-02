package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class OverrideAeModeForStillCapture {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f358a;
    public boolean b = false;

    public OverrideAeModeForStillCapture(Quirks quirks) {
        this.f358a = quirks.b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
