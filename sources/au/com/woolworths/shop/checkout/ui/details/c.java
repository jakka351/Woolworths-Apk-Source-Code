package au.com.woolworths.shop.checkout.ui.details;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.local.CheckoutAnalytics;
import au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import au.com.woolworths.shop.checkout.domain.model.CollectionAddress;
import au.com.woolworths.shop.checkout.domain.model.ContactDetails;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSelectedState;
import au.com.woolworths.shop.checkout.domain.model.address.MarketFulfilmentAddress;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.analytics.FulfilmentWindowsActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSelectedListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeCallback;
import au.com.woolworths.shop.product.details.data.BasicCoreRow;
import au.com.woolworths.shop.product.details.data.ProductDetailsCoreRow;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordionProductList;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordionProductListCta;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsDetailsItemEntry;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.SortingOption;
import au.com.woolworths.shop.ratingsandreviews.data.Cta;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.SpecialsHomeViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        final String str;
        List extraContent;
        String value;
        int i = this.d;
        str = "";
        Object obj = null;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((CheckoutDetailsListener) obj3).n2(((CollectionAddress) obj2).getB());
                break;
            case 1:
                ContactDetails contactDetails = (ContactDetails) obj2;
                ((CheckoutDetailsListener) obj3).l2(contactDetails.d, contactDetails.c);
                break;
            case 2:
                FulfilmentWindowsSelectedState fulfilmentWindowsSelectedState = (FulfilmentWindowsSelectedState) obj2;
                ((FulfilmentWindowsSelectedListener) obj3).f(fulfilmentWindowsSelectedState.d, fulfilmentWindowsSelectedState.f10616a, fulfilmentWindowsSelectedState.e);
                break;
            case 3:
                MarketFulfilmentAddress marketFulfilmentAddress = (MarketFulfilmentAddress) obj2;
                ((CheckoutDetailsListener) obj3).Z0(marketFulfilmentAddress.e, marketFulfilmentAddress.f);
                break;
            case 4:
                break;
            case 5:
                ((Function1) obj3).invoke(Integer.valueOf(((FooterData) obj2).c));
                break;
            case 6:
                FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) obj2;
                FulfilmentWindowsViewModel fulfilmentWindowsViewModelI1 = ((FulfilmentWindowsFragment) obj3).I1();
                Intrinsics.h(fulfilmentWindowsOption, "fulfilmentWindowsOption");
                fulfilmentWindowsViewModelI1.f.c(FulfilmentWindowsActions.DeliveryNowLearnMoreClick.e);
                fulfilmentWindowsViewModelI1.w6(fulfilmentWindowsOption);
                break;
            case 7:
                ((CheckoutProductViewModel) obj3).C6(CheckoutAnalytics.Product.Action.e, (TrackingMetadata) obj2);
                break;
            case 8:
                CheckoutProductViewModel checkoutProductViewModel = (CheckoutProductViewModel) obj3;
                checkoutProductViewModel.i.f(CheckoutContentContract.Actions.LeaveShopperNoteScreen.f10752a);
                CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.Companion companion = CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.d;
                final List listQ = CollectionsKt.Q((String) obj2);
                companion.getClass();
                checkoutProductViewModel.C6(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion$saveShopperNote$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(CheckoutSubstitutionAnalytics.CheckoutSubstitution.e);
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        spreadBuilder.a(new Pair("event.Category", "button"));
                        spreadBuilder.a(new Pair("event.Label", "Save Shopper Notes"));
                        spreadBuilder.a(new Pair("product.ID", listQ));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "checkout_save_shopper_notes";
                    }

                    public final boolean equals(Object obj4) {
                        if (!(obj4 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj4;
                        return "checkout_save_shopper_notes".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                }, null);
                break;
            case 9:
                ((Function1) obj3).invoke((SubstitutionPreferenceOption) obj2);
                break;
            case 10:
                ((Function1) obj3).invoke((FulfilmentSlot) obj2);
                break;
            case 11:
                ((Function1) obj3).invoke((FulfilmentBottomSheet) obj2);
                break;
            case 12:
                ((Function1) obj3).invoke((TimeOfDay) obj2);
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                Function0 function0 = (Function0) obj2;
                if (((Text) obj3) != null && function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 16:
                ComposeView composeView = (ComposeView) obj3;
                Function0 function02 = (Function0) obj2;
                ViewParent parent = composeView.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(composeView);
                if (function02 != null) {
                    function02.invoke();
                    break;
                }
                break;
            case 17:
                Paint paint = new Paint();
                paint.setColor(((Context) obj3).getColor(((ShoppingListItemSwipeCallback) obj2).getL()));
                break;
            case 18:
                ((Function1) obj3).invoke(((BasicCoreRow) ((ProductDetailsCoreRow) obj2).b).b);
                break;
            case 19:
                ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta = ((ProductDetailsRowAccordionProductList) obj2).b;
                ((Function2) obj3).invoke(productDetailsRowAccordionProductListCta.b, productDetailsRowAccordionProductListCta.c);
                break;
            case 20:
                ((MutableState) obj2).setValue(Boolean.TRUE);
                ((RatingReviewHandler) obj3).z4();
                break;
            case 21:
                ReviewsViewModel reviewsViewModel = (ReviewsViewModel) obj3;
                RatingsAndReviewsDetailsItemEntry.Cta cta = (RatingsAndReviewsDetailsItemEntry.Cta) obj2;
                String link = cta.f12761a.e;
                final String linkText = cta.b.e;
                Intrinsics.h(link, "link");
                Intrinsics.h(linkText, "linkText");
                reviewsViewModel.h.f(new ReviewsContract.Actions.OnDeepLinkClicked(link));
                AnalyticsManager analyticsManager = reviewsViewModel.g;
                final ReviewsDetailsAnalytics.ReviewsDetails.Action action = new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(reviewsViewModel.e)).f;
                action.getClass();
                analyticsManager.g(new Event(action, linkText) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics$ReviewsDetails$Action$writeReviewButtonClicked$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(action.f4049a.e);
                        a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "link_click");
                        a.y("event.Label", String.valueOf(linkText), spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "productratings&reviews_linkclick";
                    }

                    public final boolean equals(Object obj4) {
                        if (!(obj4 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj4;
                        return "productratings&reviews_linkclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                break;
            case 22:
                ((Function1) obj3).invoke((SortingOption) obj2);
                break;
            case 23:
                ((FocusManager) obj3).u(false);
                ((Function0) obj2).invoke();
                break;
            case 24:
                ((MutableState) obj2).setValue(Boolean.TRUE);
                ((SubmitReviewFormViewModel) obj3).N2();
                break;
            case 25:
                Cta cta2 = (Cta) obj2;
                ((Function2) obj3).invoke(cta2.d.e, cta2.e.e);
                break;
            case 26:
                SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) obj3;
                HorizontalListData horizontalListData = (HorizontalListData) obj2;
                specialsHomeViewModel.getClass();
                String g = horizontalListData.getG();
                if (g != null) {
                    if (SpecialsHomeViewModelKt.a(horizontalListData)) {
                        AnalyticsManager analyticsManager2 = specialsHomeViewModel.i;
                        SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
                        final String f = horizontalListData.getF();
                        if (f == null) {
                            f = "";
                        }
                        String d = horizontalListData.getD();
                        str = d != null ? d : "";
                        companion2.getClass();
                        analyticsManager2.g(new Event(f, str) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$productCarouselActionClick$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(SpecialsAnalytics.Home.f);
                                spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                                spreadBuilder.a(new Pair("event.Action", "product_click"));
                                a.z("event.Label", f, spreadBuilder, "event.Description", str);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getD() {
                                return "specialshub_productclick";
                            }

                            public final boolean equals(Object obj4) {
                                if (!(obj4 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj4;
                                return "specialshub_productclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        });
                    }
                    specialsHomeViewModel.q.k(new SpecialsHomeContract.Action.LaunchDeepLink(g));
                    break;
                }
                break;
            case 27:
                ((SpecialsHomeViewModel) obj3).T0((ProductCard) obj2);
                break;
            case 28:
                ((SpecialsHomeViewModel) obj3).T0(((PromotionCard) obj2).getProductCard());
                break;
            default:
                SpecialsHomeViewModel specialsHomeViewModel2 = (SpecialsHomeViewModel) obj3;
                ChatEntryCard chatEntryCard = (ChatEntryCard) obj2;
                specialsHomeViewModel2.getClass();
                AnalyticsManager analyticsManager3 = specialsHomeViewModel2.i;
                SpecialsAnalytics.Home.Action.Companion companion3 = SpecialsAnalytics.Home.Action.d;
                final String lowerCase = chatEntryCard.f10147a.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
                companion3.getClass();
                Event event = new Event(lowerCase) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$basketBuilderBannerClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                        spreadBuilder.a(new Pair("event.Category", "basket builder"));
                        spreadBuilder.a(new Pair("event.Action", "banner_click"));
                        a.z("event.Label", "webview chat entry card", spreadBuilder, "event.Description", lowerCase);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "basket_builder_banner_click";
                    }

                    public final boolean equals(Object obj4) {
                        if (!(obj4 instanceof Event)) {
                            return false;
                        }
                        Event event2 = (Event) obj4;
                        return "basket_builder_banner_click".equals(event2.getD()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                };
                TrackableValue trackableValue = TrackableValue.f2;
                ActionData actionData = chatEntryCard.f;
                AnalyticsData analytics = actionData.getAnalytics();
                if (analytics != null && (extraContent = analytics.getExtraContent()) != null) {
                    Iterator it = extraContent.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            String key = ((AnalyticsExtraContent) next).getKey();
                            TrackableValue trackableValue2 = TrackableValue.e;
                            if (Intrinsics.c(key, "product.Source")) {
                                obj = next;
                            }
                        }
                    }
                    AnalyticsExtraContent analyticsExtraContent = (AnalyticsExtraContent) obj;
                    if (analyticsExtraContent != null && (value = analyticsExtraContent.getValue()) != null) {
                        str = value;
                    }
                }
                analyticsManager3.i(event, TrackingMetadata.Companion.a(trackableValue, str));
                specialsHomeViewModel2.q.k(new SpecialsHomeContract.Action.OpenOliveChat(actionData.getAction()));
                break;
        }
        return unit;
    }
}
