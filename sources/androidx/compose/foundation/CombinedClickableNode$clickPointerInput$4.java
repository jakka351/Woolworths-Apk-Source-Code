package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CombinedClickableNode$clickPointerInput$4 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ PressGestureScope q;
    public /* synthetic */ long r;
    public final /* synthetic */ CombinedClickableNode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$4(CombinedClickableNode combinedClickableNode, Continuation continuation) {
        super(3, continuation);
        this.s = combinedClickableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).f1751a;
        CombinedClickableNode$clickPointerInput$4 combinedClickableNode$clickPointerInput$4 = new CombinedClickableNode$clickPointerInput$4(this.s, (Continuation) obj3);
        combinedClickableNode$clickPointerInput$4.q = (PressGestureScope) obj;
        combinedClickableNode$clickPointerInput$4.r = j;
        return combinedClickableNode$clickPointerInput$4.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            PressGestureScope pressGestureScope = this.q;
            long j = this.r;
            CombinedClickableNode combinedClickableNode = this.s;
            if (combinedClickableNode.x) {
                this.p = 1;
                MutableInteractionSource mutableInteractionSource = combinedClickableNode.t;
                if (mutableInteractionSource == null || (objC = CoroutineScopeKt.c(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j, mutableInteractionSource, combinedClickableNode, null), this)) != coroutineSingletons) {
                    objC = unit;
                }
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
