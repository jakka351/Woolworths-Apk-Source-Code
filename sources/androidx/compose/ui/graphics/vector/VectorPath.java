package androidx.compose.ui.graphics.vector;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public final String d;
    public final List e;
    public final int f;
    public final Brush g;
    public final float h;
    public final Brush i;
    public final float j;
    public final float k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;

    public VectorPath(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, Brush brush, Brush brush2, String str, List list) {
        this.d = str;
        this.e = list;
        this.f = i;
        this.g = brush;
        this.h = f;
        this.i = brush2;
        this.j = f2;
        this.k = f3;
        this.l = i2;
        this.m = i3;
        this.n = f4;
        this.o = f5;
        this.p = f6;
        this.q = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return Intrinsics.c(this.d, vectorPath.d) && Intrinsics.c(this.g, vectorPath.g) && this.h == vectorPath.h && Intrinsics.c(this.i, vectorPath.i) && this.j == vectorPath.j && this.k == vectorPath.k && this.l == vectorPath.l && this.m == vectorPath.m && this.n == vectorPath.n && this.o == vectorPath.o && this.p == vectorPath.p && this.q == vectorPath.q && this.f == vectorPath.f && Intrinsics.c(this.e, vectorPath.e);
        }
        return false;
    }

    public final int hashCode() {
        int iD = b.d(this.d.hashCode() * 31, 31, this.e);
        Brush brush = this.g;
        int iB = a.b(this.h, (iD + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.i;
        return Integer.hashCode(this.f) + a.b(this.q, a.b(this.p, a.b(this.o, a.b(this.n, b.a(this.m, b.a(this.l, a.b(this.k, a.b(this.j, (iB + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
