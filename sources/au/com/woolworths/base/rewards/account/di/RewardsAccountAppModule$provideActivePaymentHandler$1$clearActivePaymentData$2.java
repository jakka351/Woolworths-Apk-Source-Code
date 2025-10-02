package au.com.woolworths.base.rewards.account.di;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2", f = "RewardsAccountAppModule.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedPreferences $rewardsWalletPrefs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2(SharedPreferences sharedPreferences, Continuation<? super RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2> continuation) {
        super(2, continuation);
        this.$rewardsWalletPrefs = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2(this.$rewardsWalletPrefs, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SharedPreferences.Editor editorEdit = this.$rewardsWalletPrefs.edit();
        editorEdit.remove("rewards_saved_payment_state_data");
        editorEdit.apply();
        return Unit.f24250a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RewardsAccountAppModule$provideActivePaymentHandler$1$clearActivePaymentData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
    }
}
