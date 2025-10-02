package com.otaliastudios.opengl.internal;

import android.opengl.EGLSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/internal/EglSurface;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EglSurface {

    /* renamed from: a, reason: collision with root package name */
    public final EGLSurface f16803a;

    public EglSurface(EGLSurface eGLSurface) {
        this.f16803a = eGLSurface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EglSurface) && Intrinsics.c(this.f16803a, ((EglSurface) obj).f16803a);
    }

    public final int hashCode() {
        EGLSurface eGLSurface = this.f16803a;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    public final String toString() {
        return "EglSurface(native=" + this.f16803a + ')';
    }
}
