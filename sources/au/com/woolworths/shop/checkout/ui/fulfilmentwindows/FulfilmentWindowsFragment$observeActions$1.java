package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.ui.infosection.dialog.InfoSectionDialog;
import au.com.woolworths.shop.checkout.databinding.FragmentFulfilmentWindowsBinding;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$observeActions$1", f = "FulfilmentWindowsFragment.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FulfilmentWindowsFragment$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FulfilmentWindowsFragment q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FulfilmentWindowsFragment$observeActions$1(FulfilmentWindowsFragment fulfilmentWindowsFragment, Continuation continuation) {
        super(2, continuation);
        this.q = fulfilmentWindowsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FulfilmentWindowsFragment$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FulfilmentWindowsFragment$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final FulfilmentWindowsFragment fulfilmentWindowsFragment = this.q;
            Flow flowA = FlowExtKt.a(fulfilmentWindowsFragment.I1().n, fulfilmentWindowsFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h);
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment$observeActions$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    FulfilmentWindowsContract.Actions actions = (FulfilmentWindowsContract.Actions) obj2;
                    boolean z = actions instanceof FulfilmentWindowsContract.Actions.LaunchFulfilmentSelectionOptionsUi;
                    FulfilmentWindowsFragment fulfilmentWindowsFragment2 = fulfilmentWindowsFragment;
                    if (z) {
                        FulfilmentWindowsContract.Actions.LaunchFulfilmentSelectionOptionsUi launchFulfilmentSelectionOptionsUi = (FulfilmentWindowsContract.Actions.LaunchFulfilmentSelectionOptionsUi) actions;
                        FulfilmentSelectionOptionsUiKt.f(fulfilmentWindowsFragment2, fulfilmentWindowsFragment2.I1(), launchFulfilmentSelectionOptionsUi.f10784a, launchFulfilmentSelectionOptionsUi.b, launchFulfilmentSelectionOptionsUi.c);
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.SelectionComplete) {
                        CheckoutDetailsViewModel checkoutDetailsViewModel = (CheckoutDetailsViewModel) fulfilmentWindowsFragment2.k.getD();
                        Checkout checkout = ((FulfilmentWindowsContract.Actions.SelectionComplete) actions).f10786a;
                        Intrinsics.h(checkout, "checkout");
                        checkoutDetailsViewModel.r = false;
                        checkoutDetailsViewModel.y6(checkout, true);
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.LaunchSnackBar) {
                        FragmentFulfilmentWindowsBinding fragmentFulfilmentWindowsBinding = fulfilmentWindowsFragment2.n;
                        Intrinsics.e(fragmentFulfilmentWindowsBinding);
                        View view = fragmentFulfilmentWindowsBinding.h;
                        Text text = ((FulfilmentWindowsContract.Actions.LaunchSnackBar) actions).f10785a;
                        Context contextRequireContext = fulfilmentWindowsFragment2.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        Snackbar.j(null, view, text.getText(contextRequireContext), 0).l();
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.DismissWindow) {
                        FragmentKt.a(fulfilmentWindowsFragment2).g();
                    } else if (actions instanceof FulfilmentWindowsContract.Actions.LaunchExtraInfoDialog) {
                        InfoSection infoSection = ((FulfilmentWindowsContract.Actions.LaunchExtraInfoDialog) actions).f10782a;
                        InfoSectionDialog infoSectionDialog = new InfoSectionDialog();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("arg_info_section", infoSection);
                        infoSectionDialog.setArguments(bundle);
                        infoSectionDialog.show(fulfilmentWindowsFragment2.getChildFragmentManager(), "InfoSectionDialog");
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
