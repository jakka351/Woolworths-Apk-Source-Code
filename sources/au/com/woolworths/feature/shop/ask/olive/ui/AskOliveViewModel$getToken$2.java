package au.com.woolworths.feature.shop.ask.olive.ui;

import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$getToken$2", f = "AskOliveViewModel.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveViewModel$getToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AskOliveViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskOliveViewModel$getToken$2(AskOliveViewModel askOliveViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = askOliveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveViewModel$getToken$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveViewModel$getToken$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        AskOliveViewModel askOliveViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            askOliveViewModel.l.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            AskOliveViewModel$getToken$2$newToken$1 askOliveViewModel$getToken$2$newToken$1 = new AskOliveViewModel$getToken$2$newToken$1(askOliveViewModel, null);
            this.p = 1;
            obj = BuildersKt.f(defaultIoScheduler, askOliveViewModel$getToken$2$newToken$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            askOliveViewModel.q.f(new AskOliveContract.Actions.ForwardAccessTokenToWebview(str));
        }
        return Unit.f24250a;
    }
}
