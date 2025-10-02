package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRect;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.Rect;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagContentViewModel extends ViewModel {
    public final MagazineInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public final CartUpdateInteractor h;
    public String i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final SharedFlowImpl l;
    public final Flow m;
    public final Lazy n;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel$1", f = "FreshMagContentViewModel.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FreshMagContentViewModel.this.new AnonymousClass1(continuation);
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
            final FreshMagContentViewModel freshMagContentViewModel = FreshMagContentViewModel.this;
            Flow flow = freshMagContentViewModel.h.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel.1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    MutableLiveData mutableLiveData = freshMagContentViewModel.j;
                    FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) mutableLiveData.e();
                    FreshMagContentContract.PageState pageState = viewState != null ? viewState.f8041a : FreshMagContentContract.PageState.d;
                    FreshMagContentContract.ViewState viewState2 = (FreshMagContentContract.ViewState) mutableLiveData.e();
                    FreshMagContentContract.FreshMagContent freshMagContent = viewState2 != null ? viewState2.c : null;
                    FreshMagContentContract.ViewState viewState3 = (FreshMagContentContract.ViewState) mutableLiveData.e();
                    mutableLiveData.m(new FreshMagContentContract.ViewState(pageState, viewState3 != null ? viewState3.b : null, freshMagContent, new Integer(iIntValue)));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/FreshMagContentViewModel$Companion;", "", "", "PAGE_URL_PREFIX", "Ljava/lang/String;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FreshMagContentViewModel(MagazineInteractor magazineInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = magazineInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        this.h = cartUpdateInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.j = mutableLiveData;
        this.k = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
        this.n = LazyKt.b(new a(this, 8));
        if (cartUpdateInteractor.b.z()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        }
    }

    public static final ZoomablePage p6(FreshMagContentViewModel freshMagContentViewModel, MagazinePage magazinePage) {
        String str = magazinePage.f8035a;
        int i = magazinePage.b;
        int i2 = magazinePage.c;
        Iterable<Clickable> iterable = (Iterable) magazinePage.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        for (Clickable clickable : iterable) {
            Coords coords = clickable.b;
            arrayList.add(new ClickableRect(new Rect(coords.f8030a, coords.b, coords.c, coords.d), clickable.c));
        }
        return new ZoomablePage(str, i, i2, arrayList);
    }

    public final void q6(String magazineId) {
        Intrinsics.h(magazineId, "magazineId");
        this.i = magazineId;
        FreshMagContentContract.PageState pageState = FreshMagContentContract.PageState.d;
        MutableLiveData mutableLiveData = this.j;
        FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(new FreshMagContentContract.ViewState(pageState, null, null, viewState != null ? viewState.d : null));
        BuildersKt.c(ViewModelKt.a(this), null, null, new FreshMagContentViewModel$fetchMagazine$1(this, magazineId, null), 3);
    }

    public final void r6(int i) {
        int i2;
        MutableLiveData mutableLiveData = this.j;
        FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) mutableLiveData.e();
        FreshMagContentContract.FreshMagContent freshMagContent = viewState != null ? viewState.c : null;
        if (viewState == null || freshMagContent == null || (i2 = freshMagContent.b) == i) {
            return;
        }
        Integer num = viewState.d;
        FreshMagContentAction freshMagContentAction = i < i2 ? FreshMagContentAction.h : FreshMagContentAction.i;
        TrackableValue trackableValue = TrackableValue.I0;
        String str = this.i;
        if (str == null) {
            Intrinsics.p("magazineId");
            throw null;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str);
        trackingMetadataA.b(TrackableValue.C1, Integer.valueOf(i + 1));
        this.f.j(freshMagContentAction, trackingMetadataA);
        mutableLiveData.m(new FreshMagContentContract.ViewState(FreshMagContentContract.PageState.e, null, new FreshMagContentContract.FreshMagContent(freshMagContent.f8040a, i), num));
    }
}
