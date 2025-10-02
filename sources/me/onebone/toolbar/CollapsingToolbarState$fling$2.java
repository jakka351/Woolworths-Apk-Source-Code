package me.onebone.toolbar;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "me.onebone.toolbar.CollapsingToolbarState$fling$2", f = "CollapsingToolbar.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class CollapsingToolbarState$fling$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ FlingBehavior r;
    public final /* synthetic */ Ref.FloatRef s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingToolbarState$fling$2(FlingBehavior flingBehavior, Ref.FloatRef floatRef, Continuation continuation) {
        super(2, continuation);
        this.r = flingBehavior;
        this.s = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CollapsingToolbarState$fling$2 collapsingToolbarState$fling$2 = new CollapsingToolbarState$fling$2(this.r, this.s, continuation);
        collapsingToolbarState$fling$2.q = obj;
        return collapsingToolbarState$fling$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CollapsingToolbarState$fling$2) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ScrollScope scrollScope = (ScrollScope) this.q;
            Ref.FloatRef floatRef2 = this.s;
            float f = floatRef2.d;
            this.q = floatRef2;
            this.p = 1;
            obj = this.r.a(scrollScope, f, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            floatRef = floatRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.q;
            ResultKt.b(obj);
        }
        floatRef.d = ((Number) obj).floatValue();
        return Unit.f24250a;
    }
}
