package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RenderInTransitionOverlayNode$draw$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ LayoutNodeDrawScope h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderInTransitionOverlayNode$draw$1(LayoutNodeDrawScope layoutNodeDrawScope) {
        super(1);
        this.h = layoutNodeDrawScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.h.Q0();
        return Unit.f24250a;
    }
}
