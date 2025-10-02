package au.com.woolworths.feature.shop.recipes.recipes.list;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.recipes.search.RecipeSearchAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipesListContract;
import au.com.woolworths.feature.shop.recipes.recipes.models.RecipeListFullPageErrorState;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListClickHandler;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeListViewModel extends AndroidViewModel implements DynamicSizeCardClickListener, FullPageErrorStateClickHandler, RecipeListClickHandler {
    public final RecipesInteractor f;
    public final AnalyticsManager g;
    public final GoogleAdManagerInteractor h;
    public final FeatureToggleManager i;
    public final MediatorLiveData j;
    public final MediatorLiveData k;
    public final SharedFlowImpl l;
    public final Flow m;
    public Activities.RecipeList.ExtraRecipeListSource n;
    public final MutableLiveData o;
    public final MediatorLiveData p;
    public final MediatorLiveData q;
    public final MediatorLiveData r;
    public final MediatorLiveData s;
    public final MediatorLiveData t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeListViewModel(Application application, RecipesInteractor recipesInteractor, AnalyticsManager analyticsManager, GoogleAdManagerInteractor googleAdManagerInteractor, FeatureToggleManager featureToggleManager) {
        super(application);
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f = recipesInteractor;
        this.g = analyticsManager;
        this.h = googleAdManagerInteractor;
        this.i = featureToggleManager;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.j = mediatorLiveData;
        this.k = mediatorLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.o = mutableLiveData;
        this.p = Transformations.c(mutableLiveData, new l(27));
        MediatorLiveData mediatorLiveDataC = Transformations.c(mutableLiveData, new l(28));
        this.q = mediatorLiveDataC;
        this.r = Transformations.c(mutableLiveData, new l(29));
        this.s = Transformations.c(mutableLiveData, new b(0));
        this.t = Transformations.c(mutableLiveData, new b(1));
        final int i = 0;
        mediatorLiveData.n(Transformations.c(mutableLiveData, new b(2)), new RecipeListViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.c
            public final /* synthetic */ RecipeListViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        Integer num = (Integer) obj;
                        RecipeListViewModel recipeListViewModel = this.e;
                        NetworkState networkState = (NetworkState) recipeListViewModel.q.e();
                        if (networkState != null) {
                            Intrinsics.e(num);
                            int iIntValue = num.intValue();
                            RecipeListViewModel.u6(recipeListViewModel, mediatorLiveData, recipeListViewModel.s6(networkState), false, iIntValue, 2);
                        }
                        break;
                    default:
                        NetworkState networkState2 = (NetworkState) obj;
                        boolean zC = Intrinsics.c(networkState2, NetworkState.e);
                        Intrinsics.e(networkState2);
                        RecipeListViewModel recipeListViewModel2 = this.e;
                        RecipeListViewModel.u6(recipeListViewModel2, mediatorLiveData, recipeListViewModel2.s6(networkState2), zC, 0, 4);
                        break;
                }
                return Unit.f24250a;
            }
        }));
        final int i2 = 1;
        mediatorLiveData.n(mediatorLiveDataC, new RecipeListViewModel$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.c
            public final /* synthetic */ RecipeListViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        Integer num = (Integer) obj;
                        RecipeListViewModel recipeListViewModel = this.e;
                        NetworkState networkState = (NetworkState) recipeListViewModel.q.e();
                        if (networkState != null) {
                            Intrinsics.e(num);
                            int iIntValue = num.intValue();
                            RecipeListViewModel.u6(recipeListViewModel, mediatorLiveData, recipeListViewModel.s6(networkState), false, iIntValue, 2);
                        }
                        break;
                    default:
                        NetworkState networkState2 = (NetworkState) obj;
                        boolean zC = Intrinsics.c(networkState2, NetworkState.e);
                        Intrinsics.e(networkState2);
                        RecipeListViewModel recipeListViewModel2 = this.e;
                        RecipeListViewModel.u6(recipeListViewModel2, mediatorLiveData, recipeListViewModel2.s6(networkState2), zC, 0, 4);
                        break;
                }
                return Unit.f24250a;
            }
        }));
    }

    public static void u6(RecipeListViewModel recipeListViewModel, MediatorLiveData mediatorLiveData, RecipeListFullPageErrorState recipeListFullPageErrorState, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            RecipesListContract.ViewState viewState = (RecipesListContract.ViewState) recipeListViewModel.j.e();
            i = viewState != null ? viewState.b : 0;
        }
        mediatorLiveData.m(new RecipesListContract.ViewState(z, i, recipeListFullPageErrorState));
    }

    @Override // au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListClickHandler
    public final void N() {
        r6();
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof ActionableCard;
        SharedFlowImpl sharedFlowImpl = this.l;
        AnalyticsManager analyticsManager = this.g;
        if (z) {
            ActionableCard actionableCard = (ActionableCard) data;
            analyticsManager.j(RecipeListActions.e, ActionableCardKt.a(actionableCard));
            sharedFlowImpl.f(new RecipesListContract.Actions.HandleBannerClick(actionableCard.getLink()));
        } else if (data instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
            String ctaUrl = googleAdBannerCard.getCtaUrl();
            String targetId = googleAdBannerCard.getTargetId();
            if (ctaUrl != null && ctaUrl.length() != 0) {
                sharedFlowImpl.f(new RecipesListContract.Actions.HandleBannerClick(ctaUrl));
            } else if (targetId != null) {
                sharedFlowImpl.f(new RecipesListContract.Actions.LaunchProductListProductGroup(targetId, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
            }
            BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeListViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
            analyticsManager.j(RecipeListActions.g, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        r6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        Function0 function0;
        RecipesListContract.ViewState viewState = (RecipesListContract.ViewState) this.k.e();
        FullPageErrorCause fullPageErrorCause = viewState != null ? viewState.c : null;
        if (fullPageErrorCause == RecipeListFullPageErrorState.NO_RECIPES) {
            NumericPageListing numericPageListing = (NumericPageListing) this.o.e();
            if (numericPageListing == null || (function0 = numericPageListing.d) == null) {
                return;
            }
            function0.invoke();
            return;
        }
        if (fullPageErrorCause == RecipeListFullPageErrorState.NO_NETWORK) {
            r6();
        } else {
            if (fullPageErrorCause != RecipeListFullPageErrorState.SERVER_ERROR) {
                throw new IllegalStateException("Invalid error state with secondary action");
            }
            r6();
        }
    }

    public final RecipeListFullPageErrorState q6() {
        Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource = this.n;
        if (extraRecipeListSource == null) {
            Intrinsics.p("recipeListSource");
            throw null;
        }
        if (extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySourceAndTags) {
            return RecipeListFullPageErrorState.NO_RECIPES;
        }
        if (!(extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm)) {
            throw new IllegalArgumentException("Recipe List: The source provided is not implemented");
        }
        RecipeListFullPageErrorState recipeListFullPageErrorState = RecipeListFullPageErrorState.NO_SEARCH_RESULT;
        t6(recipeListFullPageErrorState);
        return recipeListFullPageErrorState;
    }

    public final void r6() {
        u6(this, this.j, null, false, 0, 6);
        NumericPageListing numericPageListing = (NumericPageListing) this.o.e();
        if (numericPageListing != null) {
            PageListingKt.a(numericPageListing);
        }
    }

    public final RecipeListFullPageErrorState s6(NetworkState networkState) {
        NumericPageListing numericPageListing;
        Integer num;
        if (Intrinsics.c(networkState, NetworkState.d) && (numericPageListing = (NumericPageListing) this.o.e()) != null && (num = (Integer) numericPageListing.e.e()) != null && num.intValue() == 0) {
            return q6();
        }
        Throwable th = networkState.c;
        if (th instanceof NoConnectivityException) {
            RecipeListFullPageErrorState recipeListFullPageErrorState = RecipeListFullPageErrorState.NO_NETWORK;
            Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource = this.n;
            if (extraRecipeListSource == null) {
                Intrinsics.p("recipeListSource");
                throw null;
            }
            if (extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm) {
                t6(recipeListFullPageErrorState);
            }
            return recipeListFullPageErrorState;
        }
        if (!(th instanceof ServerErrorException)) {
            if (th == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected exception caught: " + th, th);
        }
        if (ExceptionExtKt.d(((ServerErrorException) th).d, ServerErrorCode.g) != null) {
            return q6();
        }
        Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource2 = this.n;
        if (extraRecipeListSource2 == null) {
            Intrinsics.p("recipeListSource");
            throw null;
        }
        if (extraRecipeListSource2 instanceof Activities.RecipeList.ExtrasBySourceAndTags) {
            this.g.c(RecipeListActions.i);
        } else {
            if (!(extraRecipeListSource2 instanceof Activities.RecipeList.ExtrasBySearchTerm)) {
                throw new IllegalArgumentException("Recipe List: The source provided is not implemented");
            }
            t6(RecipeListFullPageErrorState.SERVER_ERROR);
        }
        return RecipeListFullPageErrorState.SERVER_ERROR;
    }

    public final void t6(RecipeListFullPageErrorState recipeListFullPageErrorState) {
        String str;
        Text d = recipeListFullPageErrorState.getD();
        Intrinsics.e(d);
        Context applicationContext = p6().getApplicationContext();
        Intrinsics.g(applicationContext, "getApplicationContext(...)");
        final String errorTitle = d.getText(applicationContext).toString();
        Text e = recipeListFullPageErrorState.getE();
        Context applicationContext2 = p6().getApplicationContext();
        Intrinsics.g(applicationContext2, "getApplicationContext(...)");
        String string = e.getText(applicationContext2).toString();
        Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource = this.n;
        if (extraRecipeListSource == null) {
            Intrinsics.p("recipeListSource");
            throw null;
        }
        Activities.RecipeList.ExtrasBySearchTerm extrasBySearchTerm = extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm ? (Activities.RecipeList.ExtrasBySearchTerm) extraRecipeListSource : null;
        if (extrasBySearchTerm == null || (str = extrasBySearchTerm.d) == null) {
            return;
        }
        RecipeSearchAnalytics.RecipeSearchResult.Action.d.getClass();
        Intrinsics.h(errorTitle, "errorTitle");
        Event event = new Event(errorTitle) { // from class: au.com.woolworths.analytics.supers.recipes.search.RecipeSearchAnalytics$RecipeSearchResult$Action$Companion$errorImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(RecipeSearchAnalytics.RecipeSearchResult.f);
                spreadBuilder.a(new Pair("event.Category", "error"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                a.y("event.Label", errorTitle, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "error_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event2 = (Event) obj;
                return "error_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        };
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, string);
        trackingMetadataA.b(TrackableValue.J2, str);
        TrackableValue trackableValue = TrackableValue.O2;
        RecipesListContract.ViewState viewState = (RecipesListContract.ViewState) this.j.e();
        trackingMetadataA.b(trackableValue, Integer.valueOf(viewState != null ? viewState.b : 0));
        this.g.i(event, trackingMetadataA);
    }
}
