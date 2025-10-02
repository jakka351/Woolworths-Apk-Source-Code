package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class OutputSurface {
    public static OutputSurface d(EGLSurface eGLSurface, int i, int i2) {
        return new AutoValue_OutputSurface(eGLSurface, i, i2);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
