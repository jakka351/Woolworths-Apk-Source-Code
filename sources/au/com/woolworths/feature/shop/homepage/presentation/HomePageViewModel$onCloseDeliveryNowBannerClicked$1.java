package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.domain.HomeInteractor;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$onCloseDeliveryNowBannerClicked$1", f = "HomePageViewModel.kt", l = {923}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HomePageViewModel$onCloseDeliveryNowBannerClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HomePageViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$onCloseDeliveryNowBannerClicked$1(HomePageViewModel homePageViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = homePageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomePageViewModel$onCloseDeliveryNowBannerClicked$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomePageViewModel$onCloseDeliveryNowBannerClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeliveryNowBottomBanner deliveryNowBottomBanner;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        HomePageViewModel homePageViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = homePageViewModel.H;
            mutableStateFlow.setValue(HomePageViewModel.z6(homePageViewModel, ((HomePageContract.ViewState) mutableStateFlow.getValue()).b, null, null, 28));
            HomeInteractor homeInteractor = homePageViewModel.e;
            HomePageContract.DeliveryNowData deliveryNowData = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).f;
            String str = (deliveryNowData == null || (deliveryNowBottomBanner = deliveryNowData.b) == null) ? null : deliveryNowBottomBanner.d;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.p = 1;
            Object objA = homeInteractor.g.a(str, this);
            if (objA != coroutineSingletons) {
                objA = unit;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        MutableStateFlow mutableStateFlow2 = homePageViewModel.H;
        HomePageContract.DeliveryNowData deliveryNowData2 = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).f;
        HomePageViewModel.K6(homePageViewModel, mutableStateFlow2, null, null, deliveryNowData2 != null ? new HomePageContract.DeliveryNowData(HomePageContract.DeliveryNowViewState.d, deliveryNowData2.b) : null, null, null, 478);
        return unit;
    }
}
