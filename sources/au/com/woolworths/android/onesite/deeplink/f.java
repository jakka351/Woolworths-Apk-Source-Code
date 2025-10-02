package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.a;
import androidx.media3.exoplayer.ExoPlayer;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingSurveyInput;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsPageKt;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(SpecialsHomeViewModel specialsHomeViewModel, String str, PromotionCard promotionCard, ProductCard productCard, String str2) {
        this.d = 6;
        this.f = specialsHomeViewModel;
        this.e = str;
        this.g = promotionCard;
        this.i = productCard;
        this.h = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.h;
        Object obj2 = this.i;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj5;
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) obj3;
                String str = (String) obj4;
                String str2 = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (!ShopAppDeepLinkDispatchDefinition.d(bundle) || deepLinkConfig == null || !deepLinkConfig.m) {
                    if (!ShopAppDeepLinkDispatchDefinition.d(bundle)) {
                        DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                        break;
                    } else {
                        Intent intentA = ActivityNavigatorKt.a(Activities.RewardsOfferDetailsOld.f4520a, ApplicationType.e);
                        intentA.putExtra("EXTRA_OFFER_DETAILS", new Activities.RewardsOfferDetailsOld.Extras(str, str2, arrayList));
                        break;
                    }
                } else {
                    Intent intentA2 = ActivityNavigatorKt.a(Activities.RewardsOfferDetails.f4519a, ApplicationType.e);
                    intentA2.putExtra("EXTRA_OFFER_DETAILS", new Activities.RewardsOfferDetails.Extras(str, str2, arrayList));
                    break;
                }
            case 1:
                Function1 function1 = (Function1) obj5;
                DriverRating driverRating = (DriverRating) obj3;
                String str3 = (String) obj4;
                Set set = (Set) obj2;
                String str4 = driverRating.f7754a;
                int i2 = ((StarCount) obj).d;
                String str5 = driverRating.e;
                if (set == null) {
                    set = EmptySet.d;
                }
                function1.invoke(new DriverRatingSurveyInput(str4, i2, str5, str3, set));
                break;
            case 2:
                LazyListState lazyListState = (LazyListState) obj3;
                State state = (State) obj4;
                float f = RecipeDetailsPageKt.f8026a;
                float fT1 = ((Density) obj2).T1((RecipeDetailsPageKt.f8026a - ((PaddingValues) obj5).getB()) - ((Dp) ((MutableState) obj).getD()).d);
                if (lazyListState.h() == 0 && lazyListState.i() < fT1) {
                    RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) state.getD();
                    Intrinsics.h(viewState, "<this>");
                    if (viewState.b != null && viewState.c == null) {
                        z = true;
                    }
                }
                break;
            case 3:
                final Function0 function0 = (Function0) obj5;
                final Function1 function12 = (Function1) obj3;
                final ExoPlayer exoPlayer = (ExoPlayer) obj4;
                final Function0 function02 = (Function0) obj;
                final Function0 function03 = (Function0) obj2;
                break;
            case 4:
                ((FulfilmentWindowsViewModel) obj5).u6(((FulfilmentWindowsSlot) obj3).d, (FulfilmentSlotSelectionOptionId) ((MutableState) obj4).getD());
                ((ViewGroup) obj).removeView((ComposeView) obj2);
                break;
            case 5:
                ProductDetailsRowLink productDetailsRowLink = (ProductDetailsRowLink) obj5;
                Function1 function13 = (Function1) obj3;
                Function1 function14 = (Function1) obj4;
                Function0 function04 = (Function0) obj;
                Function1 function15 = (Function1) obj2;
                Object obj6 = productDetailsRowLink.b;
                if (obj6 instanceof ParagraphTextItemData) {
                    function13.invoke(productDetailsRowLink);
                } else if (obj6 instanceof NutritionInfo) {
                    function14.invoke(obj6);
                } else if (obj6 instanceof InfoSection) {
                    function04.invoke();
                }
                function15.invoke(productDetailsRowLink);
                break;
            default:
                SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) obj5;
                final String section = (String) obj4;
                ProductCard productCard = (ProductCard) obj2;
                String str6 = (String) obj;
                AnalyticsManager analyticsManager = specialsHomeViewModel.i;
                SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
                final String offerId = ((PromotionCard) obj3).getOfferId();
                if (offerId == null) {
                    offerId = "";
                }
                companion.getClass();
                Intrinsics.h(section, "section");
                analyticsManager.i(new Event(section, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionWatchlistSnackbarViewAction$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                        spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                        spreadBuilder.a(new Pair("event.Category", "watchlist"));
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        spreadBuilder.a(new Pair("event.Label", "view list"));
                        a.y("event.Description", a.l(new StringBuilder(), section, " - ", offerId, " - price_family_variants"), spreadBuilder);
                        ArrayList arrayList2 = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "watchlist_buttonclick";
                    }

                    public final boolean equals(Object obj7) {
                        if (!(obj7 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj7;
                        return "watchlist_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                specialsHomeViewModel.q.k(new SpecialsHomeContract.Action.LaunchViewList(str6));
                break;
        }
        return unit;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.e = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    public /* synthetic */ f(Function1 function1, DriverRating driverRating, StarCount starCount, String str, Set set) {
        this.d = 1;
        this.f = function1;
        this.g = driverRating;
        this.h = starCount;
        this.e = str;
        this.i = set;
    }
}
