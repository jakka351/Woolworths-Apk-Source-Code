package com.otaliastudios.opengl.internal;

import android.opengl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/internal/EglDisplay;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EglDisplay {

    /* renamed from: a, reason: collision with root package name */
    public final EGLDisplay f16801a;

    public EglDisplay(EGLDisplay eGLDisplay) {
        this.f16801a = eGLDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EglDisplay) && Intrinsics.c(this.f16801a, ((EglDisplay) obj).f16801a);
    }

    public final int hashCode() {
        EGLDisplay eGLDisplay = this.f16801a;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    public final String toString() {
        return "EglDisplay(native=" + this.f16801a + ')';
    }
}
