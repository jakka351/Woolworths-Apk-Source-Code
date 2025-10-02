package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public Brush b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public Brush g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Stroke q;
    public final AndroidPath r;
    public AndroidPath s;
    public final Object t;

    public PathComponent() {
        int i = VectorKt.f1820a;
        this.d = EmptyList.d;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        this.r = androidPathA;
        this.s = androidPathA;
        this.t = LazyKt.a(LazyThreadSafetyMode.e, PathComponent$pathMeasure$2.h);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        Stroke stroke;
        if (this.n) {
            PathParserKt.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        Brush brush = this.b;
        if (brush != null) {
            DrawScope.Y(drawScope, this.s, brush, this.c, null, 56);
        }
        Brush brush2 = this.g;
        if (brush2 != null) {
            Stroke stroke2 = this.q;
            if (this.o || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.f, this.j, this.h, this.i, null, 16);
                this.q = stroke3;
                this.o = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.Y(drawScope, this.s, brush2, this.e, stroke, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        float f = this.k;
        AndroidPath androidPath = this.r;
        if (f == BitmapDescriptorFactory.HUE_RED && this.l == 1.0f) {
            this.s = androidPath;
            return;
        }
        if (Intrinsics.c(this.s, androidPath)) {
            this.s = AndroidPath_androidKt.a();
        } else {
            int i = this.s.i();
            this.s.o();
            this.s.n(i);
        }
        ?? r0 = this.t;
        ((PathMeasure) r0.getD()).a(androidPath);
        float length = ((PathMeasure) r0.getD()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((PathMeasure) r0.getD()).b(f4, f5, this.s);
        } else {
            ((PathMeasure) r0.getD()).b(f4, length, this.s);
            ((PathMeasure) r0.getD()).b(BitmapDescriptorFactory.HUE_RED, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
