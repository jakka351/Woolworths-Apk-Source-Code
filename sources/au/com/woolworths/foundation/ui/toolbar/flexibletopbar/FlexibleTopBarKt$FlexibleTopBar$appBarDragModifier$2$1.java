package au.com.woolworths.foundation.ui.toolbar.flexibletopbar;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1", f = "FlexibleTopBar.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ float q;
    public final /* synthetic */ TopAppBarScrollBehavior r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, Continuation continuation) {
        super(3, continuation);
        this.r = topAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1 flexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1 = new FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1(this.r, (Continuation) obj3);
        flexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1.q = fFloatValue;
        return flexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            float f = this.q;
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.r;
            TopAppBarState f1443a = topAppBarScrollBehavior.getF1443a();
            DecayAnimationSpec c = topAppBarScrollBehavior.getC();
            AnimationSpec animationSpecB = topAppBarScrollBehavior.b();
            this.p = 1;
            if (FlexibleTopBarKt.b(f1443a, f, c, animationSpecB, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
