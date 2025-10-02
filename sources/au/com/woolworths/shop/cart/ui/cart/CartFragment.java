package au.com.woolworths.shop.cart.ui.cart;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics$Banner$Action$couponToastNotification$1;
import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.cart.data.model.CartAlert;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import au.com.woolworths.shop.cart.ShopCartFeature;
import au.com.woolworths.shop.cart.analytics.CartAnalyticsExtKt;
import au.com.woolworths.shop.cart.analytics.CartScreens;
import au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt;
import au.com.woolworths.shop.cart.ui.cart.AutoNavigationState;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import au.com.woolworths.shop.cart.ui.cart.CartFragmentDirections;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartFragment extends Hilt_CartFragment {
    public ShopAppNavigator i;
    public FeatureToggleManager j;
    public final ViewModelLazy k = new ViewModelLazy(Reflection.f24268a.b(CartViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher l;
    public final ActivityResultLauncher m;
    public final ActivityResultLauncher n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartFragment$Companion;", "", "", "REQUEST_CODE_CHECKOUT", "I", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreate$1", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreate$1$1", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02361 extends SuspendLambda implements Function2<CartContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ CartFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02361(CartFragment cartFragment, Continuation continuation) {
                super(2, continuation);
                this.q = cartFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02361 c02361 = new C02361(this.q, continuation);
                c02361.p = obj;
                return c02361;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
                C02361 c02361 = (C02361) create((CartContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02361.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws NumberFormatException {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CartContract.Actions actions = (CartContract.Actions) this.p;
                boolean zC = Intrinsics.c(actions, CartContract.Actions.Finish.f10464a);
                final CartFragment cartFragment = this.q;
                if (zC) {
                    cartFragment.requireActivity().finish();
                } else if (Intrinsics.c(actions, CartContract.Actions.Checkout.f10461a)) {
                    if (cartFragment.i == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    FragmentActivity fragmentActivityRequireActivity = cartFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    fragmentActivityRequireActivity.startActivityForResult(ActivityNavigatorKt.a(Activities.CheckoutActivity.f4457a, ApplicationType.e), 100);
                } else if (Intrinsics.c(actions, CartContract.Actions.GoToProducts.f10465a)) {
                    FragmentActivity fragmentActivityRequireActivity2 = cartFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    Activities.MainActivity.f4487a.d(fragmentActivityRequireActivity2, Activities.MainActivity.Tab.f);
                } else if (Intrinsics.c(actions, CartContract.Actions.HaveYouForgotten.f10466a)) {
                    cartFragment.startActivity(ActivityNavigatorKt.a(Activities.HaveYouForgotten.f4478a, ApplicationType.e));
                } else if (Intrinsics.c(actions, CartContract.Actions.Login.f10468a)) {
                    cartFragment.m.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                } else if (actions instanceof CartContract.Actions.ShowProductReview) {
                    Activities.ProductsReviewActivity.Extras extras = new Activities.ProductsReviewActivity.Extras(Activities.ProductsReviewActivity.Source.e);
                    Intent intentA = ActivityNavigatorKt.a(Activities.ProductsReviewActivity.f4508a, ApplicationType.e);
                    intentA.putExtra("extraData", extras);
                    cartFragment.startActivity(intentA);
                } else {
                    boolean z = actions instanceof CartContract.Actions.ShowFulfilmentWindow;
                    Activities.FulfilmentWindowSelectionActivity fulfilmentWindowSelectionActivity = Activities.FulfilmentWindowSelectionActivity.f4476a;
                    if (z) {
                        ActivityResultLauncher activityResultLauncher = cartFragment.l;
                        FeatureToggleManager featureToggleManager = cartFragment.j;
                        if (featureToggleManager == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        activityResultLauncher.a(featureToggleManager.c(BaseShopAppFeature.j) ? Activities.TimeSelectorActivity.b() : ActivityNavigatorKt.a(fulfilmentWindowSelectionActivity, ApplicationType.e), null);
                    } else if (actions instanceof CartContract.Actions.ShowFulfilmentWindowNoResult) {
                        FeatureToggleManager featureToggleManager2 = cartFragment.j;
                        if (featureToggleManager2 == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        cartFragment.startActivity(featureToggleManager2.c(BaseShopAppFeature.j) ? Activities.TimeSelectorActivity.b() : ActivityNavigatorKt.a(fulfilmentWindowSelectionActivity, ApplicationType.e));
                    } else if (actions instanceof CartContract.Actions.OpenProductDetails) {
                        String str = ((CartContract.Actions.OpenProductDetails) actions).f10469a;
                        ShopAppNavigator shopAppNavigator = cartFragment.i;
                        if (shopAppNavigator == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        shopAppNavigator.d(str);
                    } else if (actions instanceof CartContract.Actions.OpenQuantitySelector) {
                        AddToCartBottomSheetFragment.Companion.a(cartFragment.getChildFragmentManager(), new AddToCartBottomSheetFragment.Extras(((CartContract.Actions.OpenQuantitySelector) actions).f10470a, false, (Screen) CartScreens.d, (TrackingMetadata) null, (ProductCard) null));
                    } else if (Intrinsics.c(actions, CartContract.Actions.OpenRewardsSetup.f10471a)) {
                        FeatureToggleManager featureToggleManager3 = cartFragment.j;
                        if (featureToggleManager3 == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        cartFragment.startActivity(Activities.RewardsSetupMoreActivity.f4522a.b(null, featureToggleManager3.c(BaseShopAppFeature.R)));
                    } else if (Intrinsics.c(actions, CartContract.Actions.ShowConfirmDeleteAll.f10475a)) {
                        new AlertDialog.Builder(cartFragment.requireActivity()).setTitle(R.string.cart_remove_all_products_dialog_title).setMessage(R.string.cart_remove_all_products_dialog_message).setNegativeButton(R.string.cancel, new au.com.woolworths.feature.product.list.q(6)).setPositiveButton(R.string.cart_remove_all_products_dialog_action, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.cart.ui.cart.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Map mapR6;
                                CartViewModel cartViewModelI1 = cartFragment.I1();
                                AnalyticsManager analyticsManager = cartViewModelI1.g;
                                CartAnalytics.Cart.Action action = CartAnalytics.Cart.Action.k;
                                List listQ6 = cartViewModelI1.q6();
                                if (listQ6 == null) {
                                    listQ6 = EmptyList.d;
                                }
                                analyticsManager.i(action, CartAnalyticsExtKt.a(listQ6));
                                MutableStateFlow mutableStateFlow = cartViewModelI1.n;
                                if (cartViewModelI1.h.c(ShopCartFeature.f)) {
                                    mapR6 = cartViewModelI1.r6();
                                    ArrayList arrayListQ6 = cartViewModelI1.q6();
                                    if (arrayListQ6 != null) {
                                        Iterator it = arrayListQ6.iterator();
                                        while (it.hasNext()) {
                                            mapR6.put((CartProductCard) it.next(), Double.valueOf(0.0d));
                                        }
                                    }
                                } else {
                                    mapR6 = EmptyMap.d;
                                }
                                CartViewModel.x6(cartViewModelI1, mutableStateFlow, true, null, null, mapR6, 6);
                                BuildersKt.c(ViewModelKt.a(cartViewModelI1), null, null, new CartViewModel$confirmDeleteAllProducts$2(cartViewModelI1, null), 3);
                            }
                        }).show();
                    } else {
                        int i = 0;
                        if (actions instanceof CartContract.Actions.ShowFailMessage) {
                            Snackbar.i(cartFragment.requireView(), ((CartContract.Actions.ShowFailMessage) actions).f10477a, 0).l();
                        } else if (Intrinsics.c(actions, CartContract.Actions.ShowUndoDelete.f10487a)) {
                            String string = cartFragment.requireActivity().getString(R.string.cart_product_removed_message);
                            Intrinsics.g(string, "getString(...)");
                            cartFragment.R1(string);
                        } else if (Intrinsics.c(actions, CartContract.Actions.ShowUndoDeleteAll.f10488a)) {
                            String string2 = cartFragment.requireActivity().getString(R.string.cart_all_products_removed_message);
                            Intrinsics.g(string2, "getString(...)");
                            cartFragment.R1(string2);
                        } else if (Intrinsics.c(actions, CartContract.Actions.ShowDeleteAllSuccess.f10476a)) {
                            Snackbar.i(cartFragment.requireView(), R.string.cart_all_products_removed_message, 0).l();
                        } else if (actions instanceof CartContract.Actions.ShowUndoDeleteCartSection) {
                            String string3 = cartFragment.requireActivity().getString(R.string.cart_section_products_removed_message, ((CartContract.Actions.ShowUndoDeleteCartSection) actions).f10489a);
                            Intrinsics.g(string3, "getString(...)");
                            cartFragment.R1(string3);
                        } else if (actions instanceof CartContract.Actions.ShowPromotionInfoTooltip) {
                            CartPromotionInfo cartPromotionInfo = ((CartContract.Actions.ShowPromotionInfoTooltip) actions).f10482a;
                            new AlertDialog.Builder(cartFragment.requireActivity()).setTitle(cartPromotionInfo.d.f8688a).setMessage(cartPromotionInfo.d.b).setPositiveButton(R.string.ok, new au.com.woolworths.feature.product.list.q(7)).show();
                        } else if (actions instanceof CartContract.Actions.ShowPromotionScreen) {
                            PromotionMarkdownContent promotionMarkdownContent = ((CartContract.Actions.ShowPromotionScreen) actions).f10483a;
                            cartFragment.startActivity(Activities.Promotion.f4509a.b(promotionMarkdownContent.getPromotionMarkdownTitle(), promotionMarkdownContent.getPromotionMarkdownText()));
                        } else if (actions instanceof CartContract.Actions.OpenUrl) {
                            FragmentActivity fragmentActivityRequireActivity3 = cartFragment.requireActivity();
                            Intrinsics.g(fragmentActivityRequireActivity3, "requireActivity(...)");
                            ContextExtKt.j(fragmentActivityRequireActivity3, ((CartContract.Actions.OpenUrl) actions).f10472a, null, null, null, 62);
                        } else if (actions instanceof CartContract.Actions.ShowCartSectionOptionsDialog) {
                            CartContract.Actions.ShowCartSectionOptionsDialog showCartSectionOptionsDialog = (CartContract.Actions.ShowCartSectionOptionsDialog) actions;
                            FragmentKt.a(cartFragment).d(new CartFragmentDirections.ActionCartFragmentToCartSectionOptionsBottomSheet(showCartSectionOptionsDialog.f10474a, showCartSectionOptionsDialog.b));
                        } else if (Intrinsics.c(actions, CartContract.Actions.DismissCartSectionOptionsDialog.f10463a)) {
                            FragmentKt.a(cartFragment).g();
                        } else {
                            int i2 = 1;
                            if (actions instanceof CartContract.Actions.ShowMoreMenu) {
                                FeatureToggleManager featureToggleManager4 = cartFragment.j;
                                if (featureToggleManager4 == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                boolean zC2 = featureToggleManager4.c(ShopCartFeature.f);
                                String string4 = cartFragment.getString(R.string.cart_more_menu_item_save_cart_to_list);
                                Intrinsics.g(string4, "getString(...)");
                                a aVar = new a(cartFragment, i);
                                String string5 = cartFragment.getString(R.string.cart_more_menu_item_remove_all);
                                Intrinsics.g(string5, "getString(...)");
                                CartOptionsBottomSheetKt.e(cartFragment, zC2, string4, aVar, string5, new a(cartFragment, i2));
                            } else if (actions instanceof CartContract.Actions.LaunchCreateShoppingListActivity) {
                                LinkedHashMap linkedHashMap = ((CartContract.Actions.LaunchCreateShoppingListActivity) actions).f10467a;
                                Intent intentA2 = ActivityNavigatorKt.a(Activities.CreateUpdateShoppingList.f4464a, ApplicationType.e);
                                intentA2.putExtra("EXTRA_LIST_INFO", new Activities.CreateUpdateShoppingList.Extras(Activities.CreateUpdateShoppingList.Mode.d, null, linkedHashMap, 2));
                                cartFragment.n.a(intentA2, null);
                            } else if (actions instanceof CartContract.Actions.ShowSnackbar) {
                                cartFragment.Q1(((CartContract.Actions.ShowSnackbar) actions).f10486a);
                            } else if (Intrinsics.c(actions, CartContract.Actions.ShowSnackBarDeliveryWindowSelected.f10484a)) {
                                cartFragment.Q1(new ResText(R.string.cart_delivery_window_selected));
                            } else if (Intrinsics.c(actions, CartContract.Actions.ShowSnackBarPickUpWindowSelected.f10485a)) {
                                cartFragment.Q1(new ResText(R.string.cart_pickup_window_selected));
                            } else if (actions instanceof CartContract.Actions.AddDeliveryAddress) {
                                cartFragment.startActivity(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, false, false)));
                            } else if (actions instanceof CartContract.Actions.ShowCartAlert) {
                                CartAlert cartAlert = ((CartContract.Actions.ShowCartAlert) actions).f10473a;
                                new AlertDialog.Builder(cartFragment.requireActivity()).setTitle(cartAlert.f8672a).setMessage(cartAlert.b).setPositiveButton(cartAlert.c, (DialogInterface.OnClickListener) null).show();
                            } else {
                                if (!(actions instanceof CartContract.Actions.CopyEverydayMarketCouponCode)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String couponCode = ((CartContract.Actions.CopyEverydayMarketCouponCode) actions).f10462a;
                                Object systemService = cartFragment.requireActivity().getSystemService((Class<Object>) ClipboardManager.class);
                                Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(cartFragment.getString(R.string.copy_coupon_code_to_clipboard_label), couponCode));
                                Snackbar.i(cartFragment.requireActivity().getWindow().getDecorView(), R.string.copy_coupon_code_success_message, -1).l();
                                cartFragment.requireActivity().getWindow().getDecorView().announceForAccessibility(cartFragment.getString(R.string.everyday_market_coupon_coupon_accessibility_copy_success));
                                CartViewModel cartViewModelI1 = cartFragment.I1();
                                String string6 = cartFragment.getString(R.string.copy_coupon_code_success_message);
                                Intrinsics.g(string6, "getString(...)");
                                Intrinsics.h(couponCode, "couponCode");
                                AnalyticsManager analyticsManager = cartViewModelI1.g;
                                EmCouponBannerAnalytics.Banner.Action action = CartViewModel.u.h;
                                action.getClass();
                                analyticsManager.g(new EmCouponBannerAnalytics$Banner$Action$couponToastNotification$1(action, string6, couponCode));
                            }
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = CartFragment.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            CartFragment cartFragment = CartFragment.this;
            Flow flow = cartFragment.I1().m;
            Lifecycle d = cartFragment.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02361(cartFragment, null), FlowExtKt.a(flow, d, Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public CartFragment() {
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.cart.ui.cart.b
            public final /* synthetic */ CartFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i2 = i;
                CartFragment cartFragment = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            CartViewModel cartViewModelI1 = cartFragment.I1();
                            AnalyticsManager analyticsManager = cartViewModelI1.g;
                            BufferedChannel bufferedChannel = cartViewModelI1.l;
                            cartViewModelI1.t = AutoNavigationState.WindowSelected.f10459a;
                            CollectionModeInteractor collectionModeInteractor = cartViewModelI1.j;
                            CollectionMode collectionModeW = collectionModeInteractor.w();
                            if (collectionModeW instanceof CollectionMode.Delivery) {
                                bufferedChannel.k(CartContract.Actions.ShowSnackBarDeliveryWindowSelected.f10484a);
                                analyticsManager.g((Event) new CartAnalytics.Cart().f.x.getD());
                                return;
                            }
                            if (collectionModeW.equals(CollectionMode.PickUp.d)) {
                                bufferedChannel.k(CartContract.Actions.ShowSnackBarPickUpWindowSelected.f10485a);
                                analyticsManager.g((Event) new CartAnalytics.Cart().f.y.getD());
                                return;
                            } else {
                                if (!collectionModeW.equals(CollectionMode.InStore.d) && !collectionModeW.equals(CollectionMode.NotSet.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Bark.Companion companion = Bark.f8483a;
                                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Unexpected window selection for collection mode: " + collectionModeInteractor.w(), null, 12);
                                return;
                            }
                        }
                        return;
                    default:
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            cartFragment.I1().t = AutoNavigationState.LoggedIn.f10457a;
                            return;
                        }
                        CartViewModel cartViewModelI12 = cartFragment.I1();
                        if (cartViewModelI12.k.b() == Region.i || cartViewModelI12.f.d()) {
                            return;
                        }
                        cartViewModelI12.l.k(CartContract.Actions.Finish.f10464a);
                        return;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.l = activityResultLauncherRegisterForActivityResult;
        final int i2 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.cart.ui.cart.b
            public final /* synthetic */ CartFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i2;
                CartFragment cartFragment = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            CartViewModel cartViewModelI1 = cartFragment.I1();
                            AnalyticsManager analyticsManager = cartViewModelI1.g;
                            BufferedChannel bufferedChannel = cartViewModelI1.l;
                            cartViewModelI1.t = AutoNavigationState.WindowSelected.f10459a;
                            CollectionModeInteractor collectionModeInteractor = cartViewModelI1.j;
                            CollectionMode collectionModeW = collectionModeInteractor.w();
                            if (collectionModeW instanceof CollectionMode.Delivery) {
                                bufferedChannel.k(CartContract.Actions.ShowSnackBarDeliveryWindowSelected.f10484a);
                                analyticsManager.g((Event) new CartAnalytics.Cart().f.x.getD());
                                return;
                            }
                            if (collectionModeW.equals(CollectionMode.PickUp.d)) {
                                bufferedChannel.k(CartContract.Actions.ShowSnackBarPickUpWindowSelected.f10485a);
                                analyticsManager.g((Event) new CartAnalytics.Cart().f.y.getD());
                                return;
                            } else {
                                if (!collectionModeW.equals(CollectionMode.InStore.d) && !collectionModeW.equals(CollectionMode.NotSet.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Bark.Companion companion = Bark.f8483a;
                                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Unexpected window selection for collection mode: " + collectionModeInteractor.w(), null, 12);
                                return;
                            }
                        }
                        return;
                    default:
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            cartFragment.I1().t = AutoNavigationState.LoggedIn.f10457a;
                            return;
                        }
                        CartViewModel cartViewModelI12 = cartFragment.I1();
                        if (cartViewModelI12.k.b() == Region.i || cartViewModelI12.f.d()) {
                            return;
                        }
                        cartViewModelI12.l.k(CartContract.Actions.Finish.f10464a);
                        return;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.m = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new CartFragment$createListResultLauncher$1(this));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.n = activityResultLauncherRegisterForActivityResult3;
    }

    public static final void b2(CartFragment cartFragment) {
        CartViewModel cartViewModelI1 = cartFragment.I1();
        AnalyticsManager analyticsManager = cartViewModelI1.g;
        CartAnalytics.Cart.Action action = CartAnalytics.Cart.Action.m;
        ArrayList arrayList = cartViewModelI1.q;
        analyticsManager.i(action, CartAnalyticsExtKt.a(arrayList));
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, Double.valueOf(((CartProductCard) next).d));
        }
        CartViewModel.y6(cartViewModelI1, linkedHashMap, new g(cartViewModelI1, 8), null, 4);
    }

    public final CartViewModel I1() {
        return (CartViewModel) this.k.getD();
    }

    public final void Q1(Text text) {
        View viewRequireView = requireView();
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        Snackbar.j(null, viewRequireView, text.getText(contextRequireContext), 0).l();
    }

    public final void R1(String str) {
        Snackbar snackbarJ = Snackbar.j(null, requireView(), str, 0);
        snackbarJ.k(requireActivity().getString(R.string.undo), new View.OnClickListener() { // from class: au.com.woolworths.shop.cart.ui.cart.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartFragment cartFragment = this.d;
                Callback.g(view);
                try {
                    CartFragment.b2(cartFragment);
                } finally {
                    Callback.h();
                }
            }
        });
        snackbarJ.l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        ComposeView composeView = new ComposeView(fragmentActivityRequireActivity, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CartFragment cartFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1900827861, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                NavHostController navHostControllerA = NavHostControllerKt.a(new Navigator[0], composer2);
                                CartFragment cartFragment2 = cartFragment;
                                FeatureToggleManager featureToggleManager = cartFragment2.j;
                                if (featureToggleManager == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                boolean zC = featureToggleManager.c(ShopCartFeature.f);
                                CartViewModel cartViewModelI1 = cartFragment2.I1();
                                composer2.o(5004770);
                                boolean zI = composer2.I(cartFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(cartFragment2, 2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                CartNavHostKt.a(navHostControllerA, zC, cartViewModelI1, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 343461917));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CartViewModel cartViewModelI1 = I1();
        cartViewModelI1.t6(false, new g(cartViewModelI1, 7));
        cartViewModelI1.g.f(CartAnalytics.Cart.d);
    }
}
