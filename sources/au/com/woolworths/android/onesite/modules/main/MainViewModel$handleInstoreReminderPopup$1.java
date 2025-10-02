package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$handleInstoreReminderPopup$1", f = "MainViewModel.kt", l = {592}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$handleInstoreReminderPopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MainViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$handleInstoreReminderPopup$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$handleInstoreReminderPopup$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$handleInstoreReminderPopup$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MainViewModel mainViewModel = this.q;
        InstorePresenceInteractor instorePresenceInteractor = mainViewModel.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            if (mainViewModel.h.b() && instorePresenceInteractor.e()) {
                this.p = 1;
                obj = instorePresenceInteractor.j(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            mainViewModel.v.onNext(MainContract.Actions.ShowInstoreReminderPopup.f4354a);
        }
        return Unit.f24250a;
    }
}
