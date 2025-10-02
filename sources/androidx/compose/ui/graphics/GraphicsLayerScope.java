package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PlacementScopeMarker
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    void A(float f);

    void H0(Shape shape);

    default void K(long j) {
    }

    default void L(long j) {
    }

    void b(float f);

    void c(float f);

    void d(float f);

    void e(float f);

    void f(float f);

    void g(float f);

    default long h() {
        return 9205357640488583168L;
    }

    void j(float f);

    default void k(RenderEffect renderEffect) {
    }

    void l(float f);

    void m(float f);

    void p0(long j);

    default void x() {
    }

    void z(boolean z);
}
