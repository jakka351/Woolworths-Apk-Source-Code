package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LayoutNode$_foldedChildren$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LayoutNode h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.h = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.h.L;
        layoutNodeLayoutDelegate.p.D = true;
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.e1();
        }
        return Unit.f24250a;
    }
}
