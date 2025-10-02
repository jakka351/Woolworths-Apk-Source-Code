package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$placeOrderGooglePay$1", f = "WPayForOrderViewModel.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$placeOrderGooglePay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public BufferedChannel p;
    public int q;
    public final /* synthetic */ WPayForOrderViewModel r;
    public final /* synthetic */ GooglePayUiState.Available s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$placeOrderGooglePay$1(WPayForOrderViewModel wPayForOrderViewModel, GooglePayUiState.Available available, Continuation continuation) {
        super(2, continuation);
        this.r = wPayForOrderViewModel;
        this.s = available;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$placeOrderGooglePay$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$placeOrderGooglePay$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BufferedChannel bufferedChannel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            WPayForOrderViewModel wPayForOrderViewModel = this.r;
            BufferedChannel bufferedChannel2 = wPayForOrderViewModel.s;
            GooglePayManager googlePayManager = wPayForOrderViewModel.q;
            GooglePayUiState.Available available = this.s;
            String str = available.f8364a;
            ?? r3 = available.b;
            this.p = bufferedChannel2;
            this.q = 1;
            obj = googlePayManager.a(str, r3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            bufferedChannel = bufferedChannel2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bufferedChannel = this.p;
            ResultKt.b(obj);
        }
        bufferedChannel.k(new WPayForOrderContract.Action.LaunchGooglePay((Task) obj));
        return Unit.f24250a;
    }
}
