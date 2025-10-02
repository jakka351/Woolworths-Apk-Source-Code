package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ForceCloseDeferrableSurface {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f354a;
    public final boolean b;
    public final boolean c;

    public ForceCloseDeferrableSurface(Quirks quirks, Quirks quirks2) {
        this.f354a = quirks2.a(TextureViewIsClosedQuirk.class);
        this.b = quirks.a(PreviewOrientationIncorrectQuirk.class);
        this.c = quirks.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f354a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DeferrableSurface) it.next()).a();
            }
            Logger.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
