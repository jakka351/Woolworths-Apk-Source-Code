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
@DebugMetadata(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {696}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableNode$clickPointerInput$2 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ PressGestureScope q;
    public /* synthetic */ long r;
    public final /* synthetic */ ClickableNode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$clickPointerInput$2(ClickableNode clickableNode, Continuation continuation) {
        super(3, continuation);
        this.s = clickableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).f1751a;
        ClickableNode$clickPointerInput$2 clickableNode$clickPointerInput$2 = new ClickableNode$clickPointerInput$2(this.s, (Continuation) obj3);
        clickableNode$clickPointerInput$2.q = (PressGestureScope) obj;
        clickableNode$clickPointerInput$2.r = j;
        return clickableNode$clickPointerInput$2.invokeSuspend(Unit.f24250a);
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
            ClickableNode clickableNode = this.s;
            if (clickableNode.x) {
                this.p = 1;
                MutableInteractionSource mutableInteractionSource = clickableNode.t;
                if (mutableInteractionSource == null || (objC = CoroutineScopeKt.c(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j, mutableInteractionSource, clickableNode, null), this)) != coroutineSingletons) {
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
