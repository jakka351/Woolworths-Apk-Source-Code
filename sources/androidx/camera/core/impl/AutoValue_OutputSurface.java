package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes2.dex */
final class AutoValue_OutputSurface extends OutputSurface {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f464a;
    public final Size b;
    public final int c;

    public AutoValue_OutputSurface(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f464a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.b = size;
        this.c = i;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final Size c() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final Surface d() {
        return this.f464a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.f464a.equals(outputSurface.d()) && this.b.equals(outputSurface.c()) && this.c == outputSurface.b();
    }

    public final int hashCode() {
        return ((((this.f464a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.f464a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", imageFormat=");
        return YU.a.m(sb, this.c, "}");
    }
}
