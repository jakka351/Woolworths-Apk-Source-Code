package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface SurfaceProcessingQuirk extends Quirk {
    static boolean c(Quirks quirks) {
        Iterator it = quirks.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
