package com.otaliastudios.opengl.internal;

import android.opengl.EGLContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/internal/EglContext;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EglContext {

    /* renamed from: a, reason: collision with root package name */
    public final EGLContext f16800a;

    public EglContext(EGLContext eGLContext) {
        this.f16800a = eGLContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EglContext) && Intrinsics.c(this.f16800a, ((EglContext) obj).f16800a);
    }

    public final int hashCode() {
        EGLContext eGLContext = this.f16800a;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    public final String toString() {
        return "EglContext(native=" + this.f16800a + ')';
    }
}
