package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
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
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1", f = "ProductFinderOnboardingScreen.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PagerState q;
    public final /* synthetic */ ProductFinderOnboardingViewModel r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ State t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1(PagerState pagerState, ProductFinderOnboardingViewModel productFinderOnboardingViewModel, Context context, State state, Continuation continuation) {
        super(2, continuation);
        this.q = pagerState;
        this.r = productFinderOnboardingViewModel;
        this.s = context;
        this.t = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowM = SnapshotStateKt.m(new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.b(this.q, 1));
            final Context context = this.s;
            final State state = this.t;
            final ProductFinderOnboardingViewModel productFinderOnboardingViewModel = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws Resources.NotFoundException {
                    int iIntValue = ((Number) obj2).intValue();
                    String string = context.getResources().getString(((ProductFinderOnboardingItem) ((ProductFinderOnboardingContract.ViewState) state.getD()).f7420a.get(iIntValue)).f7423a);
                    Intrinsics.g(string, "getString(...)");
                    productFinderOnboardingViewModel.q6(new ProductFinderOnboardingContract.OnboardingEvent.UpdateCurrentPageIndex(iIntValue, string));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
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
