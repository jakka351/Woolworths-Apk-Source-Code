package au.com.woolworths.feature.shop.recipes.search;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.recipes.search.RecipeSearchAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import au.com.woolworths.base.shopapp.modules.search.SearchType;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeSearchViewModel extends ViewModel {
    public final RecipeSearchInteractor e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final StateFlow j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel$1", f = "RecipeSearchViewModel.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RecipeSearchViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final RecipeSearchViewModel recipeSearchViewModel = RecipeSearchViewModel.this;
                RecipeSearchRepository$special$$inlined$map$1 recipeSearchRepository$special$$inlined$map$1 = recipeSearchViewModel.e.f8087a.b;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        List recentSearches = (List) obj2;
                        MutableStateFlow mutableStateFlow = recipeSearchViewModel.g;
                        do {
                            value = mutableStateFlow.getValue();
                            ((RecipeSearchContract.ViewState) value).getClass();
                            Intrinsics.h(recentSearches, "recentSearches");
                        } while (!mutableStateFlow.d(value, new RecipeSearchContract.ViewState(recentSearches)));
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (recipeSearchRepository$special$$inlined$map$1.collect(flowCollector, this) == coroutineSingletons) {
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

    public RecipeSearchViewModel(RecipeSearchInteractor recipeSearchInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = recipeSearchInteractor;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new RecipeSearchContract.ViewState(EmptyList.d));
        this.g = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = FlowKt.a(sharedFlowImplB);
        this.j = FlowKt.b(mutableStateFlowA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeSearchViewModel$onClearRecentSearchesClick$1(this, null), 3);
    }

    public final void q6(String searchTerm, SearchKeywordType searchKeywordType) {
        Intrinsics.h(searchTerm, "searchTerm");
        String string = StringsKt.k0(searchTerm).toString();
        if (string.length() == 0) {
            return;
        }
        this.h.f(new RecipeSearchContract.Actions.LaunchRecipeSearchResult(string));
        BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeSearchViewModel$onSearchSubmitted$1(this, string, null), 3);
        RecipeSearchAnalytics.RecipeSearch.Action action = RecipeSearchAnalytics.RecipeSearch.Action.d;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.J2, string);
        trackingMetadataA.b(TrackableValue.K2, searchKeywordType.d);
        TrackableValue trackableValue = TrackableValue.Q2;
        SearchType[] searchTypeArr = SearchType.d;
        trackingMetadataA.b(trackableValue, "recipes");
        this.f.i(action, trackingMetadataA);
    }
}
