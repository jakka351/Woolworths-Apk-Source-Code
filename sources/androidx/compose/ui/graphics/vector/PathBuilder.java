package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1816a = new ArrayList(32);

    public final void a() {
        this.f1816a.add(PathNode.Close.c);
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1816a.add(new PathNode.CurveTo(f, f2, f3, f4, f5, f6));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1816a.add(new PathNode.RelativeCurveTo(f, f2, f3, f4, f5, f6));
    }

    /* renamed from: d, reason: from getter */
    public final ArrayList getF1816a() {
        return this.f1816a;
    }

    public final void e(float f) {
        this.f1816a.add(new PathNode.HorizontalTo(f));
    }

    public final void f(float f) {
        this.f1816a.add(new PathNode.RelativeHorizontalTo(f));
    }

    public final void g(float f, float f2) {
        this.f1816a.add(new PathNode.LineTo(f, f2));
    }

    public final void h(float f, float f2) {
        this.f1816a.add(new PathNode.RelativeLineTo(f, f2));
    }

    public final void i(float f, float f2) {
        this.f1816a.add(new PathNode.MoveTo(f, f2));
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.f1816a.add(new PathNode.ReflectiveCurveTo(f, f2, f3, f4));
    }

    public final void k(float f, float f2, float f3, float f4) {
        this.f1816a.add(new PathNode.RelativeReflectiveCurveTo(f, f2, f3, f4));
    }

    public final void l(float f) {
        this.f1816a.add(new PathNode.VerticalTo(f));
    }

    public final void m(float f) {
        this.f1816a.add(new PathNode.RelativeVerticalTo(f));
    }
}
