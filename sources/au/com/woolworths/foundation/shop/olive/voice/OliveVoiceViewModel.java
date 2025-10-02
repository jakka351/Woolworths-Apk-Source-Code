package au.com.woolworths.foundation.shop.olive.voice;

import android.content.Context;
import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.SearchResult;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceSpeechRecogniserCallback;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceViewModel extends ViewModel implements OliveVoiceSpeechRecogniserCallback {
    public final OliveVoiceInteractorImpl e;
    public final OliveVoiceSpeechRecogniserImpl f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final Context i;
    public final SharedFlowImpl j;
    public final Flow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public boolean n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8807a;

        static {
            int[] iArr = new int[ServerErrorCode.values().length];
            try {
                ServerErrorCode serverErrorCode = ServerErrorCode.d;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8807a = iArr;
        }
    }

    public OliveVoiceViewModel(OliveVoiceInteractorImpl oliveVoiceInteractorImpl, OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, Context context) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = oliveVoiceInteractorImpl;
        this.f = oliveVoiceSpeechRecogniserImpl;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        this.i = context;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(!oliveVoiceInteractorImpl.a() ? OliveVoiceContract.ViewState.Permission.f8801a : OliveVoiceContract.ViewState.Onboarding.f8800a);
        this.l = mutableStateFlowA;
        this.m = FlowKt.b(mutableStateFlowA);
        final int i = 0;
        this.o = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.shop.olive.voice.a
            public final /* synthetic */ OliveVoiceViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.j0));
                    case 1:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.k0));
                    case 2:
                        return this.e.n ? "search" : "finder";
                    default:
                        OliveVoiceViewModel oliveVoiceViewModel = this.e;
                        return new VoiceAnalytics(oliveVoiceViewModel.i, oliveVoiceViewModel.g, (String) oliveVoiceViewModel.q.getD());
                }
            }
        });
        final int i2 = 1;
        this.p = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.shop.olive.voice.a
            public final /* synthetic */ OliveVoiceViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.j0));
                    case 1:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.k0));
                    case 2:
                        return this.e.n ? "search" : "finder";
                    default:
                        OliveVoiceViewModel oliveVoiceViewModel = this.e;
                        return new VoiceAnalytics(oliveVoiceViewModel.i, oliveVoiceViewModel.g, (String) oliveVoiceViewModel.q.getD());
                }
            }
        });
        final int i3 = 2;
        this.q = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.shop.olive.voice.a
            public final /* synthetic */ OliveVoiceViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.j0));
                    case 1:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.k0));
                    case 2:
                        return this.e.n ? "search" : "finder";
                    default:
                        OliveVoiceViewModel oliveVoiceViewModel = this.e;
                        return new VoiceAnalytics(oliveVoiceViewModel.i, oliveVoiceViewModel.g, (String) oliveVoiceViewModel.q.getD());
                }
            }
        });
        final int i4 = 3;
        this.r = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.foundation.shop.olive.voice.a
            public final /* synthetic */ OliveVoiceViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.j0));
                    case 1:
                        return Boolean.valueOf(this.e.h.c(BaseShopAppFeature.k0));
                    case 2:
                        return this.e.n ? "search" : "finder";
                    default:
                        OliveVoiceViewModel oliveVoiceViewModel = this.e;
                        return new VoiceAnalytics(oliveVoiceViewModel.i, oliveVoiceViewModel.g, (String) oliveVoiceViewModel.q.getD());
                }
            }
        });
    }

    public final VoiceAnalytics p6() {
        return (VoiceAnalytics) this.r.getD();
    }

    public final void q6(Activities.ProductList.ProductListType productListType) {
        Intrinsics.h(productListType, "productListType");
        boolean z = productListType.k;
        this.n = z;
        OliveVoiceInteractorImpl oliveVoiceInteractorImpl = this.e;
        if ((z ? oliveVoiceInteractorImpl.f8803a.f8804a.getBoolean("oliveVoiceSearchOnboardingShown", false) : oliveVoiceInteractorImpl.f8803a.f8804a.getBoolean("oliveVoiceOnboardingShown", false)) && oliveVoiceInteractorImpl.a()) {
            s6(VoiceSearchState.Listening.f8833a);
        }
    }

    public final void r6(SearchResult searchResult) {
        Intrinsics.h(searchResult, "searchResult");
        boolean z = searchResult instanceof SearchResult.Success;
        SharedFlowImpl sharedFlowImpl = this.j;
        if (z) {
            sharedFlowImpl.f(OliveVoiceContract.Action.PerformHapticSuccess.f8797a);
            return;
        }
        boolean z2 = searchResult instanceof SearchResult.ProductListNoResultsState;
        OliveVoiceContract.Action.PerformHapticFailure performHapticFailure = OliveVoiceContract.Action.PerformHapticFailure.f8796a;
        if (!z2) {
            if ((searchResult instanceof SearchResult.ProductListEmptyState) || (searchResult instanceof SearchResult.ProductListServerError)) {
                sharedFlowImpl.f(performHapticFailure);
                p6().h();
                s6(new VoiceSearchState.Failure(VoiceSearchError.ApiError.f8822a));
                return;
            } else {
                if (!(searchResult instanceof SearchResult.ProductListConnectionError)) {
                    throw new NoWhenBranchMatchedException();
                }
                sharedFlowImpl.f(performHapticFailure);
                p6().b();
                s6(new VoiceSearchState.Failure(VoiceSearchError.ConnectionError.f8823a));
                return;
            }
        }
        OliveVoiceContract.ViewState viewState = (OliveVoiceContract.ViewState) this.l.getValue();
        OliveVoiceContract.ViewState.VoiceSearch voiceSearch = viewState instanceof OliveVoiceContract.ViewState.VoiceSearch ? (OliveVoiceContract.ViewState.VoiceSearch) viewState : null;
        VoiceSearchState voiceSearchState = voiceSearch != null ? voiceSearch.f8802a : null;
        VoiceSearchState.Processing processing = voiceSearchState instanceof VoiceSearchState.Processing ? (VoiceSearchState.Processing) voiceSearchState : null;
        String str = processing != null ? processing.f8834a : null;
        if (str == null) {
            str = "";
        }
        sharedFlowImpl.f(performHapticFailure);
        VoiceAnalytics voiceAnalyticsP6 = p6();
        voiceAnalyticsP6.getClass();
        String str2 = voiceAnalyticsP6.c;
        voiceAnalyticsP6.a(new VoiceProductAssistantAnalytics.Assistant(str2).h.a(str2, new VoiceSearchError.ProductNotFound(str).a(voiceAnalyticsP6.f8821a), "item not available in store"));
        s6(new VoiceSearchState.Failure(new VoiceSearchError.ProductNotFound(str)));
    }

    public final void s6(VoiceSearchState voiceSearchState) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.l;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, new OliveVoiceContract.ViewState.VoiceSearch(voiceSearchState)));
    }
}
