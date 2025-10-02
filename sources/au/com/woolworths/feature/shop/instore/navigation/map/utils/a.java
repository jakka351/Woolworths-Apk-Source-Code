package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.Button;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientHeading;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import au.com.woolworths.feature.shop.myorders.details.analytics.HelpActions;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportContract;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpContract;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemData;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog;
import au.com.woolworths.feature.shop.myorders.orders.OrdersActivity;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersController;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragmentAdapter;
import au.com.woolworths.feature.shop.notification.preferences.controller.ShopPreferenceDetailsController;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.OnboardingViewModel;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagHomeBinding;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureDifficultyData;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePagerAdapter;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeController;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActions;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity;
import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesViewModel;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.trafficdrivers.data.TrafficDriverItem;
import au.com.woolworths.feature.shop.weblink.WebLinkActivity;
import au.com.woolworths.feature.shop.weblink.WebLinkContract;
import au.com.woolworths.feature.shop.weblink.WebLinkUtilsKt;
import au.com.woolworths.feature.shop.weblink.model.Cookie;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment;
import au.com.woolworths.foundation.bark.common.BarkException;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetEpoxyController;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.details.LegacyProductDetailsActivity;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.ProductDetailsContractKt;
import au.com.woolworths.product.details.ProductDetailsEpoxyController;
import au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding;
import au.com.woolworths.product.details.models.Footer;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.cart.databinding.FragmentAddToCartBinding;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.KeyValueBuilder;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Resources.NotFoundException {
        Object value;
        OriientPosition oriientPosition;
        List list;
        List<ButtonApiData> buttons;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Map update = (Map) obj;
                Intrinsics.h(update, "update");
                MutableStateFlow mutableStateFlow = ((PositionAnimatorImpl) obj2).f7411a;
                do {
                    value = mutableStateFlow.getValue();
                    OriientPosition oriientPosition2 = (OriientPosition) value;
                    if (oriientPosition2 != null) {
                        OriientHeading oriientHeading = oriientPosition2.b;
                        OriientMetersCoordinate oriientMetersCoordinate = oriientPosition2.f7345a;
                        oriientPosition = new OriientPosition(new OriientMetersCoordinate(((Float) update.get("POSITION_X")) != null ? r7.floatValue() : oriientMetersCoordinate.f7344a, ((Float) update.get("POSITION_Y")) != null ? r9.floatValue() : oriientMetersCoordinate.b), new OriientHeading(((Float) update.get("HEADING_X")) != null ? r7.floatValue() : oriientHeading.f7340a, ((Float) update.get("HEADING_Y")) != null ? r9.floatValue() : oriientHeading.b), oriientPosition2.c, ((Float) update.get("ACCURACY")) != null ? r7.floatValue() : oriientPosition2.d, oriientPosition2.e, oriientPosition2.f, oriientPosition2.g, oriientPosition2.h);
                    } else {
                        oriientPosition = null;
                    }
                } while (!mutableStateFlow.d(value, oriientPosition));
                return unit;
            case 1:
                OrderHelpItemData it = (OrderHelpItemData) obj;
                Intrinsics.h(it, "it");
                int i2 = HelpAndSupportActivity.y;
                HelpAndSupportViewModel helpAndSupportViewModel = (HelpAndSupportViewModel) ((HelpAndSupportActivity) obj2).x.getD();
                Screen screen = helpAndSupportViewModel.e;
                AnalyticsManager analyticsManager = helpAndSupportViewModel.f;
                SharedFlowImpl sharedFlowImpl = helpAndSupportViewModel.g;
                String str = it.e;
                String str2 = it.g;
                if (str2 != null && !StringsKt.D(str2)) {
                    int i3 = HelpAndSupportViewModel.WhenMappings.f7716a[it.h.ordinal()];
                    if (i3 == 1) {
                        analyticsManager.c(new HelpActions.ChatWithOlive(screen));
                        sharedFlowImpl.f(new HelpAndSupportContract.Actions.OpenMessageUs(str, str2));
                    } else if (i3 == 2) {
                        analyticsManager.c(new HelpActions.FaqClick(screen));
                        sharedFlowImpl.f(new HelpAndSupportContract.Actions.OpenFAQs(str2));
                    } else if (i3 != 3) {
                        Timber.f27013a.b(YU.a.A("Message action type is none for help item ", str), new Object[0]);
                    } else {
                        sharedFlowImpl.f(new HelpAndSupportContract.Actions.OpenCallUs(str, str2));
                    }
                }
                return unit;
            case 2:
                OrderDetailsHelpViewModel orderDetailsHelpViewModel = (OrderDetailsHelpViewModel) obj2;
                OrderHelpItemData helpItem = (OrderHelpItemData) obj;
                Intrinsics.h(helpItem, "helpItem");
                SharedFlowImpl sharedFlowImpl2 = orderDetailsHelpViewModel.i;
                Screen screen2 = orderDetailsHelpViewModel.e;
                AnalyticsManager analyticsManager2 = orderDetailsHelpViewModel.f;
                String str3 = helpItem.e;
                String str4 = helpItem.g;
                if (str4 != null) {
                    int i4 = OrderDetailsHelpViewModel.WhenMappings.f7726a[helpItem.h.ordinal()];
                    if (i4 == 1) {
                        analyticsManager2.c(new HelpActions.ChatWithOlive(screen2));
                        sharedFlowImpl2.f(new OrderDetailsHelpContract.Actions.OpenOliveActivity(str3, str4));
                    } else if (i4 != 2) {
                        Timber.f27013a.b(YU.a.A("Message action type is none for help item ", str3), new Object[0]);
                    } else {
                        analyticsManager2.c(new HelpActions.FaqClick(screen2));
                        sharedFlowImpl2.f(new OrderDetailsHelpContract.Actions.OpenExternalLink(str3, str4));
                    }
                }
                return unit;
            case 3:
                RequestLocationPermissionPrimingDialog requestLocationPermissionPrimingDialog = (RequestLocationPermissionPrimingDialog) obj2;
                ButtonApiData data = (ButtonApiData) obj;
                Intrinsics.h(data, "data");
                requestLocationPermissionPrimingDialog.dismiss();
                ((OrderDetailsViewModel) requestLocationPermissionPrimingDialog.j.getD()).O2(data);
                return unit;
            case 4:
                List list2 = (List) obj;
                int i5 = OrdersActivity.C;
                Timber.f27013a.m("Tabs Updated " + list2, new Object[0]);
                OrdersListFragmentAdapter ordersListFragmentAdapter = ((OrdersActivity) obj2).B;
                Intrinsics.e(list2);
                ordersListFragmentAdapter.getClass();
                ordersListFragmentAdapter.q = list2;
                ordersListFragmentAdapter.l();
                return unit;
            case 5:
                OrdersListFragment ordersListFragment = (OrdersListFragment) obj2;
                OrderListContract.ViewState viewState = (OrderListContract.ViewState) obj;
                OrdersListFragment.Companion companion = OrdersListFragment.p;
                Timber.f27013a.h("Order list feed items count " + ((viewState == null || (list = viewState.b) == null) ? null : Integer.valueOf(list.size())), new Object[0]);
                if (viewState != null) {
                    OrdersController ordersController = ordersListFragment.m;
                    if (ordersController == null) {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                    ordersController.setData(viewState.i);
                }
                return unit;
            case 6:
                ShopNotificationPreferencesDetailsContract.ViewState viewState2 = (ShopNotificationPreferencesDetailsContract.ViewState) obj;
                ShopPreferenceDetailsController shopPreferenceDetailsController = ((ShopNotificationPreferencesDetailsFragment) obj2).k;
                if (shopPreferenceDetailsController != null) {
                    shopPreferenceDetailsController.setData(viewState2.b, Boolean.valueOf(viewState2.d));
                    return unit;
                }
                Intrinsics.p("controller");
                throw null;
            case 7:
                MutableLiveData mutableLiveData = ((OnboardingViewModel) obj2).m;
                OnboardingContract.ViewState viewState3 = (OnboardingContract.ViewState) mutableLiveData.e();
                mutableLiveData.m(viewState3 != null ? new OnboardingContract.ViewState(true, viewState3.b, viewState3.c, null) : null);
                return unit;
            case 8:
                RecipeDetailsActivity recipeDetailsActivity = (RecipeDetailsActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i6 = RecipeDetailsActivity.B;
                if (zBooleanValue) {
                    if (recipeDetailsActivity.O4().q) {
                        recipeDetailsActivity.setResult(-1, new Intent().putExtra("RESULT_KEY", new Activities.RecipeDetails.Result(recipeDetailsActivity.O4().q)));
                    }
                    recipeDetailsActivity.finish();
                }
                return unit;
            case 9:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.k(semantics, ((RecipeFeatureData) obj2).g);
                return unit;
            case 10:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.k(semantics2, ((RecipeFeatureDifficultyData) obj2).g);
                return unit;
            case 11:
                FreshMagContentActivity freshMagContentActivity = (FreshMagContentActivity) obj2;
                FreshMagContentContract.ViewState viewState4 = (FreshMagContentContract.ViewState) obj;
                ActivityFreshmagContentBinding activityFreshmagContentBinding = freshMagContentActivity.y;
                if (activityFreshmagContentBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                FreshMagContentErrorState freshMagContentErrorState = viewState4.b;
                FreshMagContentContract.FreshMagContent freshMagContent = viewState4.c;
                activityFreshmagContentBinding.L(freshMagContentErrorState);
                activityFreshmagContentBinding.N(viewState4.f8041a);
                activityFreshmagContentBinding.M(freshMagContent);
                CartBadgeActionView cartBadgeActionView = freshMagContentActivity.A;
                if (cartBadgeActionView != null) {
                    cartBadgeActionView.setVisibility(viewState4.d == null ? 8 : 0);
                }
                if (freshMagContent != null) {
                    ZoomablePagerAdapter zoomablePagerAdapter = freshMagContentActivity.z;
                    if (zoomablePagerAdapter == null) {
                        Intrinsics.p("adapter");
                        throw null;
                    }
                    List list3 = freshMagContent.f8040a;
                    ArrayList arrayList = zoomablePagerAdapter.g;
                    arrayList.clear();
                    arrayList.addAll(list3);
                    zoomablePagerAdapter.h.b(list3);
                    ActivityFreshmagContentBinding activityFreshmagContentBinding2 = freshMagContentActivity.y;
                    if (activityFreshmagContentBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    activityFreshmagContentBinding2.B.setCurrentItem(freshMagContent.b);
                }
                return unit;
            case 12:
                FreshMagHomeActivity freshMagHomeActivity = (FreshMagHomeActivity) obj2;
                FreshMagHomeContract.ViewState viewState5 = (FreshMagHomeContract.ViewState) obj;
                ActivityFreshmagHomeBinding activityFreshmagHomeBinding = freshMagHomeActivity.y;
                if (activityFreshmagHomeBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                FreshMagHomeErrorState freshMagHomeErrorState = viewState5.b;
                FreshMagHomeContract.PageState pageState = viewState5.f8062a;
                activityFreshmagHomeBinding.L(freshMagHomeErrorState);
                activityFreshmagHomeBinding.M(pageState);
                if (pageState == FreshMagHomeContract.PageState.e) {
                    FreshMagHomeController freshMagHomeController = freshMagHomeActivity.A;
                    if (freshMagHomeController == null) {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                    FreshMagHomeData freshMagHomeData = viewState5.c;
                    freshMagHomeController.setData(freshMagHomeData != null ? freshMagHomeData.f8052a : null);
                }
                CartBadgeActionView cartBadgeActionView2 = freshMagHomeActivity.B;
                if (cartBadgeActionView2 != null) {
                    cartBadgeActionView2.setVisibility(viewState5.d != null ? 0 : 8);
                }
                return unit;
            case 13:
                String magazineId = (String) obj;
                Intrinsics.h(magazineId, "magazineId");
                ((FreshMagHomeViewModel) obj2).k5(magazineId);
                return unit;
            case 14:
                Integer num = (Integer) obj;
                int i7 = SavedRecipesActivity.y;
                SavedRecipesViewModel savedRecipesViewModelN4 = ((SavedRecipesActivity) obj2).N4();
                Intrinsics.e(num);
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.l2, "Saved recipes");
                trackingMetadataA.b(TrackableValue.n2, num);
                savedRecipesViewModelN4.f.j(SavedRecipesActions.f, trackingMetadataA);
                return unit;
            case 15:
                Intrinsics.h((StoreDetailsContract.ViewAction) obj, "<unused var>");
                MutableStateFlow mutableStateFlow2 = ((StoreDetailsViewModel) obj2).k;
                mutableStateFlow2.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow2.getValue(), null, null, null, null, null, null, null, null, null, 767));
                return unit;
            case 16:
                Intrinsics.h((StoreDetailsContract.ViewAction) obj, "<unused var>");
                MutableStateFlow mutableStateFlow3 = ((au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel) obj2).k;
                mutableStateFlow3.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow3.getValue(), null, null, null, null, null, null, null, null, null, 767));
                return unit;
            case 17:
                TrafficDriverItem trafficDriverItem = (TrafficDriverItem) obj2;
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                StringBuilder sb = new StringBuilder();
                TagLabel tagLabel = trafficDriverItem.f;
                if (tagLabel != null) {
                    sb.append(tagLabel.getText() + "\n");
                }
                sb.append(trafficDriverItem.f8212a);
                String str5 = trafficDriverItem.b;
                if (str5 != null) {
                    sb.append("\n".concat(str5));
                }
                SemanticsPropertiesKt.k(semantics3, sb.toString());
                return unit;
            case 18:
                WebLinkActivity webLinkActivity = (WebLinkActivity) obj2;
                int i8 = WebLinkActivity.z;
                WebLink webLink = ((WebLinkContract.ViewState) obj).f8255a;
                if (webLink != null) {
                    WebView webViewO4 = webLinkActivity.O4();
                    String str6 = webLink.b;
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                    for (Cookie cookie : webLink.d) {
                        Intrinsics.h(cookie, "cookie");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(WebLinkUtilsKt.a(cookie.d) + "=" + WebLinkUtilsKt.a(cookie.e));
                        String str7 = cookie.f;
                        StringBuilder sb3 = new StringBuilder("; Domain=");
                        sb3.append(str7);
                        sb2.append(sb3.toString());
                        sb2.append("; Path=" + cookie.g);
                        sb2.append("; Max-Age=" + cookie.h);
                        if (cookie.i) {
                            sb2.append("; HttpOnly");
                        }
                        if (cookie.j) {
                            sb2.append("; Secure");
                        }
                        String string = sb2.toString();
                        Intrinsics.g(string, "toString(...)");
                        cookieManager.setCookie(str6, string);
                    }
                    cookieManager.flush();
                    webViewO4.loadUrl(str6, webLink.c);
                }
                return unit;
            case 19:
                Task it2 = (Task) obj;
                Intrinsics.h(it2, "it");
                ((WPayForOrderFragment) obj2).k.a(it2, null);
                return unit;
            case 20:
                KeyValueBuilder setCustomKeys = (KeyValueBuilder) obj;
                Intrinsics.h(setCustomKeys, "$this$setCustomKeys");
                setCustomKeys.b("Owner", "");
                setCustomKeys.b("Squad", "");
                setCustomKeys.b("Alert", "");
                if (((BarkException) obj2).getD() != null) {
                    setCustomKeys.b("additionalInfo", "");
                }
                return unit;
            case 21:
                ((BottomSheetEpoxyController) ((BaseBottomSheetFragment) obj2).d.getD()).setData(((BaseBottomSheetContract.ViewState) obj).f8665a);
                return unit;
            case 22:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, ((VideoAdBottomSheet) obj2).g);
                return unit;
            case 23:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                String str8 = ((EverydayMarketCouponBannerData) obj2).j;
                SemanticsPropertiesKt.k(semantics4, str8 != null ? str8 : "");
                return unit;
            case 24:
                Modifier optional = (Modifier) obj;
                Intrinsics.h(optional, "$this$optional");
                return TransformableKt.d(optional, (TransformableState) obj2);
            case 25:
                Context it3 = (Context) obj;
                Intrinsics.h(it3, "it");
                return MarkdownCompatKt.c(it3, (MarkdownTextViewStyle) obj2);
            case 26:
                int iIntValue = ((Integer) obj).intValue();
                AddToCartViewModel addToCartViewModel = ((FragmentAddToCartBinding) obj2).F;
                if (addToCartViewModel != null) {
                    MutableLiveData mutableLiveData2 = addToCartViewModel.m;
                    AddToCartContract.ViewState viewState6 = (AddToCartContract.ViewState) mutableLiveData2.e();
                    mutableLiveData2.m(viewState6 != null ? AddToCartContract.ViewState.a(viewState6, null, 0, iIntValue, 191) : null);
                }
                return unit;
            case 27:
                ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.h(layoutCoordinates, "layoutCoordinates");
                Rect rectB = LayoutCoordinatesKt.b(layoutCoordinates);
                if (Float.intBitsToFloat((int) (rectB.e() >> 32)) > BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) (rectB.e() & 4294967295L)) > BitmapDescriptorFactory.HUE_RED) {
                    int i9 = ProductLocationInfoView.q;
                    productLocationInfoView.getClass();
                    if (((int) Float.intBitsToFloat((int) (rectB.e() >> 32))) != productLocationInfoView.getWidth() || ((int) Float.intBitsToFloat((int) (rectB.e() & 4294967295L))) != productLocationInfoView.getHeight()) {
                        ViewGroup.LayoutParams layoutParams = productLocationInfoView.getLayoutParams();
                        layoutParams.width = (int) Float.intBitsToFloat((int) (rectB.e() >> 32));
                        layoutParams.height = (int) Float.intBitsToFloat((int) (rectB.e() & 4294967295L));
                        productLocationInfoView.setLayoutParams(layoutParams);
                        productLocationInfoView.requestLayout();
                    }
                }
                return unit;
            case 28:
                LegacyProductDetailsActivity legacyProductDetailsActivity = (LegacyProductDetailsActivity) obj2;
                ProductDetailsContract.ViewState viewState7 = (ProductDetailsContract.ViewState) obj;
                ProductDetailsEpoxyController productDetailsEpoxyController = legacyProductDetailsActivity.C;
                if (productDetailsEpoxyController == null) {
                    Intrinsics.p("epoxyController");
                    throw null;
                }
                productDetailsEpoxyController.setData(viewState7.b, viewState7.f9310a);
                ActivityProductDetailsBinding activityProductDetailsBinding = legacyProductDetailsActivity.B;
                if (activityProductDetailsBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                activityProductDetailsBinding.N(legacyProductDetailsActivity.O4().r6());
                if (ProductDetailsContractKt.a(viewState7) != null && ProductDetailsContractKt.c(viewState7) != null) {
                    Footer footerA = ProductDetailsContractKt.a(viewState7);
                    ButtonApiData buttonApiData = (footerA == null || (buttons = footerA.getButtons()) == null) ? null : (ButtonApiData) CollectionsKt.D(buttons);
                    if (buttonApiData == null) {
                        throw new IllegalArgumentException("buttons field cannot be null in non-null Footer data!");
                    }
                    ButtonStyleApiData style = buttonApiData.getStyle();
                    if ((style == null ? -1 : LegacyProductDetailsActivity.WhenMappings.f9290a[style.ordinal()]) == 1) {
                        View viewInflate = LayoutInflater.from(legacyProductDetailsActivity).inflate(R.layout.item_contained_button, (ViewGroup) null);
                        Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.Button");
                        Button button = (Button) viewInflate;
                        button.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                        button.setText(buttonApiData.getLabel());
                        button.setEnabled(buttonApiData.getEnabled());
                        ActivityProductDetailsBinding activityProductDetailsBinding2 = legacyProductDetailsActivity.B;
                        if (activityProductDetailsBinding2 == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout = activityProductDetailsBinding2.z.y;
                        constraintLayout.removeAllViews();
                        constraintLayout.addView(button);
                    }
                }
                return unit;
            default:
                DynamicSizeCardData it4 = (DynamicSizeCardData) obj;
                Intrinsics.h(it4, "it");
                ((ProductDetailsEpoxyController) obj2).clickHandler.m(it4);
                return unit;
        }
    }
}
