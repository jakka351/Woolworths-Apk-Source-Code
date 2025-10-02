package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FocusableNode$retrievePinnableContainer$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Ref.ObjectRef h;
    public final /* synthetic */ FocusableNode i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$retrievePinnableContainer$1(Ref.ObjectRef objectRef, FocusableNode focusableNode) {
        super(0);
        this.h = objectRef;
        this.i = focusableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.h.d = CompositionLocalConsumerModifierNodeKt.a(this.i, PinnableContainerKt.f1891a);
        return Unit.f24250a;
    }
}
