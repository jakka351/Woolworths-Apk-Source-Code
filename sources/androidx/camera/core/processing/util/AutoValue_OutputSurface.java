package androidx.camera.core.processing.util;

import YU.a;
import android.opengl.EGLSurface;

/* loaded from: classes2.dex */
final class AutoValue_OutputSurface extends OutputSurface {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f560a;
    public final int b;
    public final int c;

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f560a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final EGLSurface a() {
        return this.f560a;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.f560a.equals(outputSurface.a()) && this.b == outputSurface.c() && this.c == outputSurface.b();
    }

    public final int hashCode() {
        return ((((this.f560a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f560a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return a.m(sb, this.c, "}");
    }
}
