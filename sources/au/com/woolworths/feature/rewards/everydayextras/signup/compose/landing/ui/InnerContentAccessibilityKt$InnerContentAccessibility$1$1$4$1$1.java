package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1", f = "InnerContentAccessibility.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ EverydayExtrasLandingFeed q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableIntState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1(Function1 function1, EverydayExtrasLandingFeed everydayExtrasLandingFeed, MutableState mutableState, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.p = function1;
        this.q = everydayExtrasLandingFeed;
        this.r = mutableState;
        this.s = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1(this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1 innerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1 = (InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        innerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutableState mutableState = this.r;
        if (((Boolean) mutableState.getD()).booleanValue()) {
            this.p.invoke(this.q.c.get(this.s.d()));
        } else {
            mutableState.setValue(Boolean.TRUE);
        }
        return Unit.f24250a;
    }
}
