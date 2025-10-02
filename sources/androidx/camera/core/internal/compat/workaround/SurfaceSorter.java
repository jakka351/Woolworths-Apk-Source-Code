package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* loaded from: classes2.dex */
public class SurfaceSorter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f541a;

    public SurfaceSorter() {
        this.f541a = DeviceQuirks.f535a.b(SurfaceOrderQuirk.class) != null;
    }
}
