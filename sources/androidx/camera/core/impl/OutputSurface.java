package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class OutputSurface {
    public static OutputSurface a(Surface surface, Size size, int i) {
        return new AutoValue_OutputSurface(surface, size, i);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
