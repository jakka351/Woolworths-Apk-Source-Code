package au.com.woolworths.feature.shop.inbox.ui;

import au.com.woolworths.feature.shop.inbox.InboxUiEffect;
import au.com.woolworths.feature.shop.inbox.InboxViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$1$1", f = "InboxScreen.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InboxScreenKt$InboxScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InboxViewModel q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxScreenKt$InboxScreen$1$1(InboxViewModel inboxViewModel, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = inboxViewModel;
        this.r = function2;
        this.s = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxScreenKt$InboxScreen$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxScreenKt$InboxScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.l;
            final Function2 function2 = this.r;
            final Function0 function0 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InboxUiEffect inboxUiEffect = (InboxUiEffect) obj2;
                    if (inboxUiEffect instanceof InboxUiEffect.OpenTermsAndConditions) {
                        InboxUiEffect.OpenTermsAndConditions openTermsAndConditions = (InboxUiEffect.OpenTermsAndConditions) inboxUiEffect;
                        function2.invoke(openTermsAndConditions.f7265a, openTermsAndConditions.b);
                    } else {
                        if (!Intrinsics.c(inboxUiEffect, InboxUiEffect.OpenAskOlive.f7264a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function0.invoke();
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
