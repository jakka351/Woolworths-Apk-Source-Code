package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/GenerationalViewportHint;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes2.dex */
public final /* data */ class GenerationalViewportHint {

    /* renamed from: a, reason: collision with root package name */
    public final int f3537a;
    public final ViewportHint b;

    public GenerationalViewportHint(int i, ViewportHint hint) {
        Intrinsics.h(hint, "hint");
        this.f3537a = i;
        this.b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) obj;
        return this.f3537a == generationalViewportHint.f3537a && Intrinsics.c(this.b, generationalViewportHint.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f3537a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f3537a + ", hint=" + this.b + ')';
    }
}
