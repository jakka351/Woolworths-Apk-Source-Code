package androidx.window.core;

import YU.a;
import android.graphics.Rect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/Bounds;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Bounds {

    /* renamed from: a, reason: collision with root package name */
    public final int f3869a;
    public final int b;
    public final int c;
    public final int d;

    public Bounds(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f3869a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.f3869a;
    }

    public final Rect c() {
        return new Rect(this.f3869a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Bounds.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        Bounds bounds = (Bounds) obj;
        return this.f3869a == bounds.f3869a && this.b == bounds.b && this.c == bounds.c && this.d == bounds.d;
    }

    public final int hashCode() {
        return (((((this.f3869a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.f3869a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return a.m(sb, this.d, "] }");
    }
}
