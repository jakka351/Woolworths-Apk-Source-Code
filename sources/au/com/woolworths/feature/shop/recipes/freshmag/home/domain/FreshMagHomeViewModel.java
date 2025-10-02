package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/FreshMagHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeListener;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHomeViewModel extends ViewModel implements FreshMagHomeListener {
    public final FreshMagHomeInteractor e;
    public final CollectionModeInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final CartUpdateInteractor i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final SharedFlowImpl l;
    public final Flow m;
    public final Lazy n;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel$1", f = "FreshMagHomeViewModel.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FreshMagHomeViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            final FreshMagHomeViewModel freshMagHomeViewModel = FreshMagHomeViewModel.this;
            Flow flow = freshMagHomeViewModel.i.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel.1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    MutableLiveData mutableLiveData = freshMagHomeViewModel.j;
                    FreshMagHomeContract.ViewState viewState = (FreshMagHomeContract.ViewState) mutableLiveData.e();
                    FreshMagHomeContract.PageState pageState = viewState != null ? viewState.f8062a : FreshMagHomeContract.PageState.d;
                    FreshMagHomeContract.ViewState viewState2 = (FreshMagHomeContract.ViewState) mutableLiveData.e();
                    FreshMagHomeData freshMagHomeData = viewState2 != null ? viewState2.c : null;
                    FreshMagHomeContract.ViewState viewState3 = (FreshMagHomeContract.ViewState) mutableLiveData.e();
                    mutableLiveData.m(new FreshMagHomeContract.ViewState(pageState, viewState3 != null ? viewState3.b : null, freshMagHomeData, new Integer(iIntValue)));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    public FreshMagHomeViewModel(FreshMagHomeInteractor freshMagHomeInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = freshMagHomeInteractor;
        this.f = collectionModeInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        this.i = cartUpdateInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.j = mutableLiveData;
        this.k = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
        this.n = LazyKt.b(new a(this, 9));
        if (cartUpdateInteractor.b.z()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p6(au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel r6, au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel.p6(au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel, au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData):void");
    }

    public static void r6(FreshMagHomeViewModel freshMagHomeViewModel, FreshMagHomeContract.PageState pageState, FreshMagHomeData freshMagHomeData, FreshMagHomeErrorState freshMagHomeErrorState) {
        MutableLiveData mutableLiveData = freshMagHomeViewModel.j;
        FreshMagHomeContract.ViewState viewState = (FreshMagHomeContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(new FreshMagHomeContract.ViewState(pageState, freshMagHomeErrorState, freshMagHomeData, viewState != null ? viewState.d : null));
    }

    @Override // au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener
    public final void G0(HorizontalListDataInterface data) {
        Intrinsics.h(data, "data");
        this.g.c(FreshMagHomeAction.l);
        String g = data.getG();
        if (g != null) {
            this.l.f(new FreshMagHomeContract.Actions.LaunchDeepLink(g));
        }
    }

    @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener
    public final void N1(RecipeCardSummaryData cardSummaryTileData) {
        Intrinsics.h(cardSummaryTileData, "cardSummaryTileData");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.m2, cardSummaryTileData.getId());
        trackingMetadataA.b(TrackableValue.o2, cardSummaryTileData.getTitle());
        this.g.j(FreshMagHomeAction.m, trackingMetadataA);
        this.l.f(new FreshMagHomeContract.Actions.LaunchRecipeDetails(cardSummaryTileData.getId()));
    }

    @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener
    public final void k5(String id) {
        Intrinsics.h(id, "id");
        this.g.c(FreshMagHomeAction.i);
        this.l.f(new FreshMagHomeContract.Actions.LaunchFreshMagContent(id));
    }

    public final void q6() {
        r6(this, FreshMagHomeContract.PageState.d, null, null);
        BuildersKt.c(ViewModelKt.a(this), null, null, new FreshMagHomeViewModel$fetchFreshMagHomeData$1(this, null), 3);
    }
}
