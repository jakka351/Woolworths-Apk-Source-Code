package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutScreens;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentFeesBottomSheetKt;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$observeActions$1", f = "FulfilmentWindowsActivity.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentWindowsActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FulfilmentWindowsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsActivity$observeActions$1(FulfilmentWindowsActivity fulfilmentWindowsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = fulfilmentWindowsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = FulfilmentWindowsActivity.B;
            final FulfilmentWindowsActivity fulfilmentWindowsActivity = this.q;
            Flow flowA = FlowExtKt.a(fulfilmentWindowsActivity.O4().n, fulfilmentWindowsActivity.getD(), Lifecycle.State.h);
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$observeActions$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    FulfilmentWindowsContract.Actions actions = (FulfilmentWindowsContract.Actions) obj2;
                    boolean z = actions instanceof FulfilmentWindowsContract.Actions.DismissWindow;
                    FulfilmentWindowsActivity fulfilmentWindowsActivity2 = fulfilmentWindowsActivity;
                    if (z) {
                        fulfilmentWindowsActivity2.setResult(-1);
                        fulfilmentWindowsActivity2.finish();
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.LaunchDeepLink) {
                        String str = ((FulfilmentWindowsContract.Actions.LaunchDeepLink) actions).f10780a;
                        int i3 = FulfilmentWindowsActivity.B;
                        fulfilmentWindowsActivity2.startActivity(ShopAppDeepLink.a(CheckoutScreens.e, str));
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.LaunchFulfilmentFeesBottomSheet) {
                        FulfilmentExtraInfo fulfilmentExtraInfo = ((FulfilmentWindowsContract.Actions.LaunchFulfilmentFeesBottomSheet) actions).f10783a;
                        int i4 = FulfilmentWindowsActivity.B;
                        FulfilmentFeesBottomSheetKt.h(fulfilmentWindowsActivity2, fulfilmentExtraInfo, new a(fulfilmentWindowsActivity2, 0), new a(fulfilmentWindowsActivity2, 1));
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.LaunchExtraInfoBottomSheet) {
                        FulfilmentExtraInfo fulfilmentExtraInfo2 = ((FulfilmentWindowsContract.Actions.LaunchExtraInfoBottomSheet) actions).f10781a;
                        int i5 = FulfilmentWindowsActivity.B;
                        FulfilmentFeesBottomSheetKt.h(fulfilmentWindowsActivity2, fulfilmentExtraInfo2, new a(fulfilmentWindowsActivity2, 0), new a(fulfilmentWindowsActivity2, 1));
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
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
