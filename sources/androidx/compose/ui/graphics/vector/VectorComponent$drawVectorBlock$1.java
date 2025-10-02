package androidx.compose.ui.graphics.vector;

import androidx.camera.core.impl.b;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class VectorComponent$drawVectorBlock$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ VectorComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.h = vectorComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        VectorComponent vectorComponent = this.h;
        GroupComponent groupComponent = vectorComponent.b;
        float f = vectorComponent.k;
        float f2 = vectorComponent.l;
        CanvasDrawScope$drawContext$1 e = drawScope.getE();
        long jD = e.d();
        e.a().save();
        try {
            e.f1798a.e(0L, f, f2);
            groupComponent.a(drawScope);
            b.C(e, jD);
            return Unit.f24250a;
        } catch (Throwable th) {
            b.C(e, jD);
            throw th;
        }
    }
}
