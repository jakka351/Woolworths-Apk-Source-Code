package au.com.woolworths.shop.cart.ui;

import android.os.Build;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.foundation.feature.di.AssistedViewModelFactory;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsAdapter;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupEpoxyController;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupFragment;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActions;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductFragment;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionEpoxyControllerOld;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingEpoxyController;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewModel;
import au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity;
import au.com.woolworths.shop.lists.ui.lists.ListsContract;
import au.com.woolworths.shop.lists.ui.lists.ListsFragment;
import au.com.woolworths.shop.lists.ui.lists.ListsPagerAdapter;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetViewModel;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsViewModel;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPagingSource;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                return new CartSectionOptionsEpoxyController((CartViewModel) ((CartSectionOptionsBottomSheet) obj).i.getD());
            case 1:
                ProductReviewAlternativeFragment productReviewAlternativeFragment = (ProductReviewAlternativeFragment) obj;
                return new AssistedViewModelFactory(productReviewAlternativeFragment, new d(productReviewAlternativeFragment, 8));
            case 2:
                FragmentKt.a((ContactDetailsFragment) obj).g();
                return unit;
            case 3:
                return Integer.valueOf(((CheckoutContentFragment) obj).getResources().getDimensionPixelSize(R.dimen.bottom_sheet_shadow_height));
            case 4:
                ((CheckoutDetailsViewModel) obj).N0();
                return unit;
            case 5:
                ((CheckoutProductEpoxyController) obj).checkoutProductListener.H3();
                return unit;
            case 6:
                FulfilmentWindowsAdapter fulfilmentWindowsAdapter = new FulfilmentWindowsAdapter((FulfilmentWindowsFragment) obj);
                fulfilmentWindowsAdapter.p = EmptyList.d;
                return fulfilmentWindowsAdapter;
            case 7:
                FulfilmentWindowsGroupFragment fulfilmentWindowsGroupFragment = (FulfilmentWindowsGroupFragment) obj;
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel = (FulfilmentWindowsViewModel) fulfilmentWindowsGroupFragment.j.getD();
                AnalyticsManager analyticsManager = fulfilmentWindowsGroupFragment.i;
                if (analyticsManager != null) {
                    return new FulfilmentWindowsGroupEpoxyController(fulfilmentWindowsViewModel, analyticsManager);
                }
                Intrinsics.p("analyticsManager");
                throw null;
            case 8:
                IdVerificationActivity idVerificationActivity = (IdVerificationActivity) obj;
                AnalyticsManager analyticsManager2 = idVerificationActivity.w;
                if (analyticsManager2 == null) {
                    Intrinsics.p("analyticsManager");
                    throw null;
                }
                analyticsManager2.c(IdVerificationActions.ExitClick.d);
                idVerificationActivity.finish();
                return unit;
            case 9:
                CheckoutProductFragment checkoutProductFragment = (CheckoutProductFragment) obj;
                CheckoutProductViewModel checkoutProductViewModelO2 = checkoutProductFragment.o2();
                FeatureToggleManager featureToggleManager = checkoutProductFragment.r;
                if (featureToggleManager == null) {
                    Intrinsics.p("featureToggleManager");
                    throw null;
                }
                BannerDismissInteractor bannerDismissInteractor = checkoutProductFragment.s;
                if (bannerDismissInteractor != null) {
                    return new CheckoutProductEpoxyController(checkoutProductViewModelO2, featureToggleManager, bannerDismissInteractor, checkoutProductFragment.o2());
                }
                Intrinsics.p("bannerDismissInteractor");
                throw null;
            case 10:
                FragmentKt.a((ShopperNoteFragment) obj).g();
                return unit;
            case 11:
                return Integer.valueOf(((HorizontalSelectorViewListener) obj).f5());
            case 12:
                return new ConfirmSubscriptionTermsAndConditionEpoxyControllerOld((ConfirmSubscriptionViewModel) ((ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld) obj).j.getD());
            case 13:
                int i2 = DeliveryUnlimitedSignUpLandingActivity.B;
                return new DeliveryUnlimitedSignUpLandingEpoxyController(((DeliveryUnlimitedSignUpLandingActivity) obj).O4());
            case 14:
                int i3 = ListDetailsView.p;
                return ((ListDetailsView) obj).getActivity$shop_lists_release().getDefaultViewModelProviderFactory();
            case 15:
                ListDetailsViewModel listDetailsViewModel = (ListDetailsViewModel) obj;
                return new ListDetailsAnalyticsParams(listDetailsViewModel.h.a(), listDetailsViewModel.s);
            case 16:
                ShopListGuestOnboardingActivity shopListGuestOnboardingActivity = (ShopListGuestOnboardingActivity) obj;
                int i4 = ShopListGuestOnboardingActivity.C;
                Activities.ShopListGuestOnboardingActivity.Extras extras = Build.VERSION.SDK_INT >= 33 ? (Activities.ShopListGuestOnboardingActivity.Extras) shopListGuestOnboardingActivity.getIntent().getParcelableExtra("EXTRA_SCREEN_TYPE", Activities.ShopListGuestOnboardingActivity.Extras.class) : (Activities.ShopListGuestOnboardingActivity.Extras) shopListGuestOnboardingActivity.getIntent().getParcelableExtra("EXTRA_SCREEN_TYPE");
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("must provide required extras");
            case 17:
                ListsFragment listsFragment = (ListsFragment) obj;
                ListsFragment.Companion companion = ListsFragment.m;
                List listQ = listsFragment.I1().l.b() == Region.j ? CollectionsKt.Q(ListsContract.ListsTabsContent.e) : CollectionsKt.G0(ListsContract.ListsTabsContent.h);
                FragmentManager supportFragmentManager = listsFragment.requireActivity().getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                return new ListsPagerAdapter(listQ, supportFragmentManager, listsFragment.getViewLifecycleOwner().getD());
            case 18:
                ((MagicMatchContract.Listener) obj).s();
                return unit;
            case 19:
                ((au.com.woolworths.shop.lists.ui.shoppinglist.sort.a) obj).invoke();
                return unit;
            case 20:
                ((au.com.woolworths.shop.lists.ui.shoppinglist.sort.a) obj).invoke();
                return unit;
            case 21:
                ((au.com.woolworths.shop.lists.ui.shoppinglist.sort.a) obj).invoke();
                return unit;
            case 22:
                ((ShoppingListItemListener) obj).K();
                return unit;
            case 23:
                return ShoppingListDetailsListController.buildListDetailsEmptyScreen$lambda$3((ShoppingListDetailsListController) obj);
            case 24:
                ShoppingListDetailsViewModel shoppingListDetailsViewModel = (ShoppingListDetailsViewModel) obj;
                return new ListDetailsAnalyticsParams(shoppingListDetailsViewModel.l.a(), shoppingListDetailsViewModel.H5());
            case 25:
                SortByBottomSheetViewModel sortByBottomSheetViewModel = (SortByBottomSheetViewModel) obj;
                return new ListDetailsAnalyticsParams(sortByBottomSheetViewModel.e.a(), sortByBottomSheetViewModel.i);
            case 26:
                return WatchlistToggleView.a((WatchlistToggleView) obj);
            case 27:
                ((ContentPageViewModel) ((ProductCategoryFragment) obj).j.getD()).q6(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.j, "", ""));
                return unit;
            case 28:
                int i5 = RatingsAndReviewsActivity.z;
                String stringExtra = ((RatingsAndReviewsActivity) obj).getIntent().getStringExtra("id");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new IllegalArgumentException("id must be provided");
            default:
                ReviewsViewModel reviewsViewModel = (ReviewsViewModel) obj;
                RatingsAndReviewsPaginationAdapter ratingsAndReviewsPaginationAdapter = reviewsViewModel.f;
                ratingsAndReviewsPaginationAdapter.c = null;
                ratingsAndReviewsPaginationAdapter.d.clear();
                return new RatingsAndReviewsPagingSource(ratingsAndReviewsPaginationAdapter, reviewsViewModel.e, ((ReviewsContract.ViewState) reviewsViewModel.k.getValue()).f12756a);
        }
    }
}
