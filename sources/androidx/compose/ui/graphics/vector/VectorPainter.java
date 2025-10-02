package androidx.compose.ui.graphics.vector;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public final MutableState i = SnapshotStateKt.f(new Size(0));
    public final MutableState j = SnapshotStateKt.f(Boolean.FALSE);
    public final VectorComponent k;
    public Composition l;
    public final MutableIntState m;
    public float n;
    public ColorFilter o;
    public int p;

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1, kotlin.jvm.internal.Lambda] */
    public VectorPainter(GroupComponent groupComponent) {
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.f = new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                VectorPainter vectorPainter = this.h;
                int i = vectorPainter.p;
                MutableIntState mutableIntState = vectorPainter.m;
                if (i == ((SnapshotMutableIntStateImpl) mutableIntState).d()) {
                    ((SnapshotMutableIntStateImpl) mutableIntState).i(((SnapshotMutableIntStateImpl) mutableIntState).d() + 1);
                }
                return Unit.f24250a;
            }
        };
        this.k = vectorComponent;
        this.m = SnapshotIntStateKt.a(0);
        this.n = 1.0f;
        this.p = -1;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        this.n = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        this.o = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getL() {
        return ((Size) ((SnapshotMutableStateImpl) this.i).getD()).f1754a;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        ColorFilter colorFilter = this.o;
        VectorComponent vectorComponent = this.k;
        if (colorFilter == null) {
            colorFilter = (ColorFilter) ((SnapshotMutableStateImpl) vectorComponent.g).getD();
        }
        if (((Boolean) ((SnapshotMutableStateImpl) this.j).getD()).booleanValue() && drawScope.getLayoutDirection() == LayoutDirection.e) {
            long jM0 = drawScope.M0();
            CanvasDrawScope$drawContext$1 e = drawScope.getE();
            long jD = e.d();
            e.a().save();
            try {
                e.f1798a.e(jM0, -1.0f, 1.0f);
                vectorComponent.e(drawScope, this.n, colorFilter);
            } finally {
                b.C(e, jD);
            }
        } else {
            vectorComponent.e(drawScope, this.n, colorFilter);
        }
        this.p = ((SnapshotMutableIntStateImpl) this.m).d();
    }
}
