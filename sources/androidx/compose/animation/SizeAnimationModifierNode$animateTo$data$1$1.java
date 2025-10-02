package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SizeAnimationModifierNode.AnimData q;
    public final /* synthetic */ long r;
    public final /* synthetic */ SizeAnimationModifierNode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j, SizeAnimationModifierNode sizeAnimationModifierNode, Continuation continuation) {
        super(2, continuation);
        this.q = animData;
        this.r = j;
        this.s = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SizeAnimationModifierNode sizeAnimationModifierNode = this.s;
        SizeAnimationModifierNode.AnimData animData = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Animatable animatable = animData.f733a;
            IntSize intSize = new IntSize(this.r);
            AnimationSpec animationSpec = sizeAnimationModifierNode.r;
            this.p = 1;
            obj = Animatable.d(animatable, intSize, animationSpec, null, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.b == AnimationEndReason.e && (function2 = sizeAnimationModifierNode.s) != null) {
            function2.invoke(new IntSize(animData.b), ((SnapshotMutableStateImpl) animationResult.f743a.e).getD());
        }
        return Unit.f24250a;
    }
}
