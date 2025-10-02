package au.com.woolworths.feature.shop.homepage.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:%\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\u0082\u0001%'()*+,-./0123456789:;<=>?@ABCDEFGHIJK¨\u0006L"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ActionableCardClick", "ActionableCardImpression", "AddRewardsCardClick", "AddToList", "CatalogueClick", "DeliveryNowEligibility", "GoogleAdBannerClick", "GoogleAdBannerImpression", "HomePageBannerClick", "LoginClick", "MarketplaceCardClick", "MyListsClick", "MyListsItemClick", "MyOrdersImpression", "MyOrdersCardClick", "MyOrdersFulfilmentStatusBannerImpression", "MyOrdersFulfilmentStatusBannerClick", "NetworkError", "ProductClick", "PromotionClick", "RecipesClick", "RewardsPointsClick", "RewardsPointsBalanceErrorClick", "RewardsOffersBalanceErrorClick", "ScreenLoaded", "SeeAllClick", "BoostAllClick", "SeeMoreClick", "ServerError", "ShowBarcodeClick", "SignUpClick", "RecipeTitleClick", "ProductCarouselImpression", "QuickLinkClick", "ViewProductVarieties", "BoostAllFailSnackbarImpression", "BoostAllSuccessSnackbarImpression", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ActionableCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ActionableCardImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$AddRewardsCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$AddToList;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllFailSnackbarImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllSuccessSnackbarImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$CatalogueClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$DeliveryNowEligibility;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$GoogleAdBannerImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$HomePageBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$LoginClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MarketplaceCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyListsClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyListsItemClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersFulfilmentStatusBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersFulfilmentStatusBannerImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$NetworkError;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ProductCarouselImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ProductClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$PromotionClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$QuickLinkClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RecipeTitleClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RecipesClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsOffersBalanceErrorClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsPointsBalanceErrorClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsPointsClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ScreenLoaded;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SeeAllClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SeeMoreClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ServerError;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ShowBarcodeClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SignUpClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ViewProductVarieties;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HomePageActions implements Action {
    public final Screen d = Screens.l;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ActionableCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClick extends HomePageActions {
        public static final ActionableCardClick e = new ActionableCardClick();
        public static final Category f = Category.g;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ActionableCardImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpression extends HomePageActions {
        public static final ActionableCardImpression e = new ActionableCardImpression();
        public static final Category f = Category.h;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$AddRewardsCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddRewardsCardClick extends HomePageActions {
        public static final AddRewardsCardClick e = new AddRewardsCardClick();
        public static final Category f = Category.m;
        public static final String g = "Add Rewards";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$AddToList;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddToList extends HomePageActions {
        public static final AddToList e = new AddToList();
        public static final Category f = Category.m;
        public static final String g = "Add To List";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostAllClick extends HomePageActions {
        public static final BoostAllClick e = new BoostAllClick();
        public static final Category f = Category.m;
        public static final String g = "Boost All";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllFailSnackbarImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostAllFailSnackbarImpression extends HomePageActions {
        public static final BoostAllFailSnackbarImpression e = new BoostAllFailSnackbarImpression();
        public static final Category f = Category.g0;
        public static final String g = "unable to boost your rewards offer";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$BoostAllSuccessSnackbarImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostAllSuccessSnackbarImpression extends HomePageActions {
        public static final BoostAllSuccessSnackbarImpression e = new BoostAllSuccessSnackbarImpression();
        public static final Category f = Category.g0;
        public static final String g = "your rewards offer has been boosted";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$CatalogueClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueClick extends HomePageActions {
        public static final CatalogueClick e = new CatalogueClick();
        public static final Category f = Category.m;
        public static final String g = "Catalogue";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$DeliveryNowEligibility;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowEligibility extends HomePageActions {
        public static final DeliveryNowEligibility e = new DeliveryNowEligibility();
        public static final Category f = Category.B;
        public static final String g = "Delivery Window Status";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$GoogleAdBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerClick extends HomePageActions {
        public static final GoogleAdBannerClick e = new GoogleAdBannerClick();
        public static final Category f = Category.y;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$GoogleAdBannerImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerImpression extends HomePageActions {
        public static final GoogleAdBannerImpression e = new GoogleAdBannerImpression();
        public static final Category f = Category.z;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$HomePageBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomePageBannerClick extends HomePageActions {
        public static final Category e;
        public static final String f;

        static {
            new HomePageBannerClick();
            e = Category.m;
            f = "Homepage Banner";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$LoginClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoginClick extends HomePageActions {
        public static final LoginClick e = new LoginClick();
        public static final Category f = Category.b0;
        public static final String g = "Login";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MarketplaceCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceCardClick extends HomePageActions {
        public static final MarketplaceCardClick e = new MarketplaceCardClick();
        public static final Category f = Category.m;
        public static final String g = "Tap Marketplace";
        public static final HomePageActions$MarketplaceCardClick$screen$1 h = new Screen() { // from class: au.com.woolworths.feature.shop.homepage.analytics.HomePageActions$MarketplaceCardClick$screen$1
            public final String d = Screens.l.getD();
            public final String e = Screens.m.getE();

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: d, reason: from getter */
            public final String getD() {
                return this.d;
            }
        };

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }

        @Override // au.com.woolworths.feature.shop.homepage.analytics.HomePageActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return h;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyListsClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyListsClick extends HomePageActions {
        public static final MyListsClick e = new MyListsClick();
        public static final Category f = Category.m;
        public static final String g = "See All";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyListsItemClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyListsItemClick extends HomePageActions {
        public static final MyListsItemClick e = new MyListsItemClick();
        public static final Category f = Category.D;
        public static final String g = "tap on list tile";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersCardClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrdersCardClick extends HomePageActions {
        public static final MyOrdersCardClick e = new MyOrdersCardClick();
        public static final Category f = Category.m;
        public static final String g = "My Orders";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersFulfilmentStatusBannerClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrdersFulfilmentStatusBannerClick extends HomePageActions {
        public static final MyOrdersFulfilmentStatusBannerClick e = new MyOrdersFulfilmentStatusBannerClick();
        public static final Category f = Category.m;
        public static final String g = "View Order Products";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersFulfilmentStatusBannerImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrdersFulfilmentStatusBannerImpression extends HomePageActions {
        public static final MyOrdersFulfilmentStatusBannerImpression e = new MyOrdersFulfilmentStatusBannerImpression();
        public static final Category f = Category.h;
        public static final String g = "Order Fulfilment Status Banner";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$MyOrdersImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrdersImpression extends HomePageActions {
        public static final MyOrdersImpression e = new MyOrdersImpression();
        public static final Category f = Category.B;
        public static final String g = "My Orders";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$NetworkError;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends HomePageActions {
        public static final NetworkError e = new NetworkError();
        public static final Category f = Category.v;
        public static final String g = "Network Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ProductCarouselImpression;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCarouselImpression extends HomePageActions {
        public final String e;
        public final Category f;

        public ProductCarouselImpression(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.B;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductCarouselImpression) && Intrinsics.c(this.e, ((ProductCarouselImpression) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("ProductCarouselImpression(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ProductClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductClick extends HomePageActions {
        public static final ProductClick e = new ProductClick();
        public static final Category f = Category.m;
        public static final String g = "Product";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$PromotionClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionClick extends HomePageActions {
        public static final Category e;
        public static final String f;

        static {
            new PromotionClick();
            e = Category.m;
            f = "Promotion";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$QuickLinkClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuickLinkClick extends HomePageActions {
        public final String e;
        public final Category f;

        public QuickLinkClick(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.Z;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickLinkClick) && Intrinsics.c(this.e, ((QuickLinkClick) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("QuickLinkClick(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RecipeTitleClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeTitleClick extends HomePageActions {
        public static final Category e;
        public static final String f;

        static {
            new RecipeTitleClick();
            e = Category.m;
            f = "Fresh Ideas For You";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RecipesClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipesClick extends HomePageActions {
        public static final Category e;
        public static final String f;

        static {
            new RecipesClick();
            e = Category.m;
            f = "Recipes";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsOffersBalanceErrorClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOffersBalanceErrorClick extends HomePageActions {
        public static final RewardsOffersBalanceErrorClick e = new RewardsOffersBalanceErrorClick();
        public static final Category f = Category.A;
        public static final String g = "offers balance error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsPointsBalanceErrorClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPointsBalanceErrorClick extends HomePageActions {
        public static final RewardsPointsBalanceErrorClick e = new RewardsPointsBalanceErrorClick();
        public static final Category f = Category.A;
        public static final String g = "points balance error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$RewardsPointsClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPointsClick extends HomePageActions {
        public static final RewardsPointsClick e = new RewardsPointsClick();
        public static final Category f = Category.m;
        public static final String g = "Rewards Points";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ScreenLoaded;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenLoaded extends HomePageActions {
        public static final ScreenLoaded e = new ScreenLoaded();
        public static final Category f = Category.B;
        public static final String g = "Home Screen Loaded";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SeeAllClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SeeAllClick extends HomePageActions {
        public static final SeeAllClick e = new SeeAllClick();
        public static final Category f = Category.m;
        public static final String g = "See All";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SeeMoreClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SeeMoreClick extends HomePageActions {
        public static final SeeMoreClick e = new SeeMoreClick();
        public static final Category f = Category.m;
        public static final String g = "See More";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ServerError;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends HomePageActions {
        public static final ServerError e = new ServerError();
        public static final Category f = Category.v;
        public static final String g = "Server Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ShowBarcodeClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowBarcodeClick extends HomePageActions {
        public static final ShowBarcodeClick e = new ShowBarcodeClick();
        public static final Category f = Category.m;
        public static final String g = "Show Barcode";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$SignUpClick;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpClick extends HomePageActions {
        public static final SignUpClick e = new SignUpClick();
        public static final Category f = Category.b0;
        public static final String g = "Sign Up";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions$ViewProductVarieties;", "Lau/com/woolworths/feature/shop/homepage/analytics/HomePageActions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewProductVarieties extends HomePageActions {
        public static final ViewProductVarieties e = new ViewProductVarieties();
        public static final Category f = Category.D;
        public static final String g = "view varieties";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
