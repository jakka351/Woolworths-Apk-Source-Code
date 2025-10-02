package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/WindowMetrics;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindowMetrics {

    /* renamed from: a, reason: collision with root package name */
    public final Bounds f3890a;

    public WindowMetrics(Rect rect) {
        this.f3890a = new Bounds(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WindowMetrics.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.f3890a, ((WindowMetrics) obj).f3890a);
    }

    public final int hashCode() {
        return this.f3890a.hashCode();
    }

    public final String toString() {
        return "WindowMetrics { bounds: " + this.f3890a.c() + " }";
    }
}
