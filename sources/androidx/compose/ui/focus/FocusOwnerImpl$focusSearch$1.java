package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FocusOwnerImpl$focusSearch$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {
    public final /* synthetic */ FocusTargetNode h;
    public final /* synthetic */ FocusOwnerImpl i;
    public final /* synthetic */ Lambda j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1 function1) {
        super(1);
        this.h = focusTargetNode;
        this.i = focusOwnerImpl;
        this.j = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        if (Intrinsics.c(focusTargetNode, this.h)) {
            zBooleanValue = false;
        } else {
            if (Intrinsics.c(focusTargetNode, this.i.f)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = ((Boolean) this.j.invoke(focusTargetNode)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
