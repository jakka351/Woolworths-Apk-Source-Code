package au.com.woolworths.feature.product.list;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelperKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.data.PopupMessage;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListBinding;
import au.com.woolworths.feature.product.list.nutrition.NutritionBottomSheetFragment;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.MapFeatureHighlightDialog;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListFragment$onViewCreated$1$1", f = "ProductListFragment.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ ProductListFragment r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.ProductListFragment$onViewCreated$1$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AlertDialog.Builder negativeButton;
            InfoSheet infoSheet;
            String title;
            InStoreAvailabilityInfo inStoreAvailabilityInfo;
            InfoSheet infoSheet2;
            String message;
            Activities.Search.Extras generic;
            ProductListContract.Actions actions = (ProductListContract.Actions) obj;
            final ProductListFragment productListFragment = (ProductListFragment) this.d;
            float f = ProductListFragment.u;
            productListFragment.getClass();
            final int i = 0;
            final int i2 = 1;
            if (actions instanceof ProductListContract.Actions.LaunchProductAddOrReplace) {
                ProductListContract.Actions.LaunchProductAddOrReplace launchProductAddOrReplace = (ProductListContract.Actions.LaunchProductAddOrReplace) actions;
                ProductCard productCard = launchProductAddOrReplace.f5226a;
                AddToCartBottomSheetFragment.Companion.a(productListFragment.getParentFragmentManager(), new AddToCartBottomSheetFragment.Extras(productCard, productCard.getMarketplace() != null, launchProductAddOrReplace.b, launchProductAddOrReplace.c, launchProductAddOrReplace.d));
            } else if (actions instanceof ProductListContract.Actions.LaunchProductSearch) {
                ProductListContract.Actions.LaunchProductSearch launchProductSearch = (ProductListContract.Actions.LaunchProductSearch) actions;
                String str = launchProductSearch.f5228a;
                ProductCard productCard2 = launchProductSearch.b;
                switch (productListFragment.h3().d.e.getE().ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                        generic = new Activities.Search.Extras.Generic(str);
                        break;
                    case 1:
                        generic = new Activities.Search.Extras.BuyAgain(str);
                        break;
                    case 5:
                        if (productCard2 == null) {
                            throw new IllegalStateException("productId expected in the alternative search flow");
                        }
                        generic = new Activities.Search.Extras.ProductAlternative(productCard2, str);
                        break;
                    case 8:
                        generic = new Activities.Search.Extras.ProductFinder(str);
                        break;
                    case 19:
                        generic = new Activities.Search.Extras.VoiceProductFinder(str);
                        break;
                    case 21:
                        generic = new Activities.Search.Extras.VoiceWithMapsProductFinder(str);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                productListFragment.startActivity(Activities.Search.f4526a.b(generic));
            } else {
                if (actions instanceof ProductListContract.Actions.LaunchProductUpdate) {
                    ProductListContract.Actions.LaunchProductUpdate launchProductUpdate = (ProductListContract.Actions.LaunchProductUpdate) actions;
                    ProductCard productCard3 = launchProductUpdate.f5229a;
                    AddToCartBottomSheetFragment.Companion.a(productListFragment.getParentFragmentManager(), new AddToCartBottomSheetFragment.Extras(productCard3, productCard3.getMarketplace() != null, launchProductUpdate.b, launchProductUpdate.c, (ProductCard) null));
                } else if (actions instanceof ProductListContract.Actions.LaunchAddToList) {
                    ProductListContract.Actions.LaunchAddToList launchAddToList = (ProductListContract.Actions.LaunchAddToList) actions;
                    ProductCard productCard4 = launchAddToList.f5220a;
                    AddToListBottomSheetFragment.Companion.a(productListFragment.getParentFragmentManager(), null, launchAddToList.b, CollectionsKt.Q(new AddToListProductParameters(productCard4, (String) null, (Float) null, launchAddToList.d, 14)), null, new ProductInfoViewFactory(productCard4), true, launchAddToList.c, null, 786);
                } else if (actions instanceof ProductListContract.Actions.LaunchAvailabilityMessage) {
                    ProductListContract.Actions.LaunchAvailabilityMessage launchAvailabilityMessage = (ProductListContract.Actions.LaunchAvailabilityMessage) actions;
                    ProductCard productCard5 = launchAvailabilityMessage.f5221a;
                    ProductListScreens productListScreens = launchAvailabilityMessage.b;
                    TrackingMetadata trackingMetadata = launchAvailabilityMessage.c;
                    InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard5.getInStoreAvailabilityInfo();
                    if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard5.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                        ProductMessageBottomSheetFragment.Companion.a(productListFragment.getParentFragmentManager(), productCard5, title, message, productListScreens, trackingMetadata);
                    }
                } else if (actions instanceof ProductListContract.Actions.ChangeDisplayMode) {
                    if (!productListFragment.m3().I.a().isEmpty()) {
                        FragmentProductListBinding fragmentProductListBinding = productListFragment.i;
                        if (fragmentProductListBinding == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        productListFragment.C3();
                        fragmentProductListBinding.E.r();
                    }
                } else if (actions instanceof ProductListContract.Actions.DisplayRestrictedItemPrompt) {
                    ProductListContract.Actions.DisplayRestrictedItemPrompt displayRestrictedItemPrompt = (ProductListContract.Actions.DisplayRestrictedItemPrompt) actions;
                    final ProductCard productCard6 = displayRestrictedItemPrompt.f5217a;
                    boolean z = displayRestrictedItemPrompt.b;
                    AlertDialog.Builder title2 = new AlertDialog.Builder(productListFragment.requireContext()).setTitle(com.woolworths.R.string.product_age_restricted_item_prompt_title);
                    if (z) {
                        negativeButton = title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message_underage).setPositiveButton(com.woolworths.R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.product.list.s
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = i;
                                ProductCard productCard7 = productCard6;
                                ProductListFragment productListFragment2 = productListFragment;
                                switch (i4) {
                                    case 0:
                                        float f2 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptOk.e, ProductListFragment.x3(productCard7));
                                        break;
                                    case 1:
                                        float f3 = ProductListFragment.u;
                                        FragmentActivity fragmentActivityRequireActivity = productListFragment2.requireActivity();
                                        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                                        Activities.LogIn.c(fragmentActivityRequireActivity);
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptLogin.e, ProductListFragment.x3(productCard7));
                                        break;
                                    default:
                                        float f4 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptCancel.e, ProductListFragment.x3(productCard7));
                                        break;
                                }
                            }
                        });
                    } else {
                        AlertDialog.Builder positiveButton = title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message).setPositiveButton(com.woolworths.R.string.login_action, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.product.list.s
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = i2;
                                ProductCard productCard7 = productCard6;
                                ProductListFragment productListFragment2 = productListFragment;
                                switch (i4) {
                                    case 0:
                                        float f2 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptOk.e, ProductListFragment.x3(productCard7));
                                        break;
                                    case 1:
                                        float f3 = ProductListFragment.u;
                                        FragmentActivity fragmentActivityRequireActivity = productListFragment2.requireActivity();
                                        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                                        Activities.LogIn.c(fragmentActivityRequireActivity);
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptLogin.e, ProductListFragment.x3(productCard7));
                                        break;
                                    default:
                                        float f4 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptCancel.e, ProductListFragment.x3(productCard7));
                                        break;
                                }
                            }
                        });
                        final int i3 = 2;
                        negativeButton = positiveButton.setNegativeButton(com.woolworths.R.string.cancel, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.product.list.s
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i32) {
                                int i4 = i3;
                                ProductCard productCard7 = productCard6;
                                ProductListFragment productListFragment2 = productListFragment;
                                switch (i4) {
                                    case 0:
                                        float f2 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptOk.e, ProductListFragment.x3(productCard7));
                                        break;
                                    case 1:
                                        float f3 = ProductListFragment.u;
                                        FragmentActivity fragmentActivityRequireActivity = productListFragment2.requireActivity();
                                        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                                        Activities.LogIn.c(fragmentActivityRequireActivity);
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptLogin.e, ProductListFragment.x3(productCard7));
                                        break;
                                    default:
                                        float f4 = ProductListFragment.u;
                                        productListFragment2.X2().j(ProductListActions.RestrictedItemLoginPromptCancel.e, ProductListFragment.x3(productCard7));
                                        break;
                                }
                            }
                        });
                    }
                    negativeButton.create().show();
                    productListFragment.X2().j(ProductListActions.RestrictedItemLoginPrompt.e, productListFragment.m3().r6());
                } else {
                    boolean z2 = actions instanceof ProductListContract.Actions.LaunchProductListProductGroup;
                    Activities.ProductList productList = Activities.ProductList.f4505a;
                    if (z2) {
                        ProductListContract.Actions.LaunchProductListProductGroup launchProductListProductGroup = (ProductListContract.Actions.LaunchProductListProductGroup) actions;
                        String str2 = launchProductListProductGroup.f5227a;
                        String str3 = launchProductListProductGroup.b;
                        Intent intentA = ActivityNavigatorKt.a(productList, ApplicationType.e);
                        if (str3 == null) {
                            str3 = "";
                        }
                        Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str3, null);
                        Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                        intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(str2, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4));
                        productListFragment.startActivity(intentA);
                    } else if (actions instanceof ProductListContract.Actions.ShowNoResultsMessage) {
                        if (productListFragment.m3().q6().e.getE() != Activities.ProductList.ProductListType.H) {
                            Intrinsics.g(productListFragment.getText(com.woolworths.R.string.product_list_no_results_snack_bar_message), "getText(...)");
                        }
                    } else if (actions instanceof ProductListContract.Actions.HandleBannerClick) {
                        productListFragment.startActivity(ShopAppDeepLink.a(Screens.u, ((ProductListContract.Actions.HandleBannerClick) actions).f5219a));
                    } else if (actions instanceof ProductListContract.Actions.DisplayPopupMessage) {
                        PopupMessage popupMessage = ((ProductListContract.Actions.DisplayPopupMessage) actions).f5216a;
                        new AlertDialog.Builder(productListFragment.requireContext()).setTitle(popupMessage.getTitle()).setMessage(popupMessage.getDescription()).setPositiveButton(popupMessage.getCtaLabel(), new q(i)).show();
                    } else if (actions instanceof ProductListContract.Actions.LaunchEducationBottomSheet) {
                        ProductListContract.Actions.LaunchEducationBottomSheet launchEducationBottomSheet = (ProductListContract.Actions.LaunchEducationBottomSheet) actions;
                        EducationBottomSheetFragment.Companion.a(ProductListScreens.e, launchEducationBottomSheet.f5224a, launchEducationBottomSheet.b).show(productListFragment.getParentFragmentManager(), "EducationBottomSheetFragment");
                    } else if (actions instanceof ProductListContract.Actions.LaunchProductVarieties) {
                        String str4 = ((ProductListContract.Actions.LaunchProductVarieties) actions).f5230a;
                        String string = productListFragment.getString(com.woolworths.R.string.title_product_varieties);
                        Intrinsics.g(string, "getString(...)");
                        productListFragment.startActivity(productList.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(string, null), new Activities.ProductList.ExtrasByPriceFamily(str4), (Activities.ProductList.ExtrasConfig) null, 12), false));
                    } else if (actions instanceof ProductListContract.Actions.NavigateToLink) {
                        String url = ((ProductListContract.Actions.NavigateToLink) actions).f5236a;
                        ShopAppNavigator shopAppNavigator = productListFragment.m;
                        if (shopAppNavigator == null) {
                            Intrinsics.p("navigator");
                            throw null;
                        }
                        Intrinsics.h(url, "url");
                        ContextExtKt.e(shopAppNavigator.b, url);
                    } else if (actions instanceof ProductListContract.Actions.BoostAllSucceeded) {
                        productListFragment.X2().j(ProductListActions.BoostAllSuccessSnackbarImpression.e, ((ProductListContract.Actions.BoostAllSucceeded) actions).f5214a);
                        Intrinsics.g(productListFragment.getString(com.woolworths.R.string.product_boost_all_success), "getString(...)");
                    } else if (actions instanceof ProductListContract.Actions.BoostAllFailed) {
                        productListFragment.X2().j(ProductListActions.BoostAllFailSnackbarImpression.e, ((ProductListContract.Actions.BoostAllFailed) actions).f5213a);
                        Intrinsics.g(productListFragment.getString(com.woolworths.R.string.product_boost_all_failed), "getString(...)");
                    } else if (actions instanceof ProductListContract.Actions.LaunchNutritionInfo) {
                        DietaryInfo dietaryInfo = ((ProductListContract.Actions.LaunchNutritionInfo) actions).f5225a;
                        NutritionBottomSheetFragment.Extras extras = new NutritionBottomSheetFragment.Extras(dietaryInfo.getTitle(), dietaryInfo.getContent());
                        NutritionBottomSheetFragment nutritionBottomSheetFragment = new NutritionBottomSheetFragment();
                        nutritionBottomSheetFragment.setCancelable(true);
                        nutritionBottomSheetFragment.setArguments(BundleKt.a(new Pair("nutrition_extra_data", extras)));
                        nutritionBottomSheetFragment.show(productListFragment.getParentFragmentManager(), "NutritionBottomSheetFragment");
                    } else if (actions instanceof ProductListContract.Actions.LaunchVideoAdBottomSheet) {
                        VideoAdBottomSheetFragment.Companion.a(((ProductListContract.Actions.LaunchVideoAdBottomSheet) actions).f5232a).show(productListFragment.getParentFragmentManager(), "VideoAdBottomSheetFragment");
                    } else if (actions instanceof ProductListContract.Actions.NavigateBack) {
                        productListFragment.requireActivity().finish();
                    } else if (actions instanceof ProductListContract.Actions.DisplaySnackbarForWatchlist) {
                        Context contextRequireContext = productListFragment.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        FragmentProductListBinding fragmentProductListBinding2 = productListFragment.i;
                        if (fragmentProductListBinding2 == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        View view = fragmentProductListBinding2.h;
                        Intrinsics.g(view, "getRoot(...)");
                        ProductListContract.Actions.DisplaySnackbarForWatchlist displaySnackbarForWatchlist = (ProductListContract.Actions.DisplaySnackbarForWatchlist) actions;
                        ResText resText = displaySnackbarForWatchlist.b;
                        Context contextRequireContext2 = productListFragment.requireContext();
                        Intrinsics.g(contextRequireContext2, "requireContext(...)");
                        ListChangeEventKt.b(contextRequireContext, view, resText.getText(contextRequireContext2), displaySnackbarForWatchlist.f5218a, displaySnackbarForWatchlist.c, new u(productListFragment, actions, i));
                    } else if (actions instanceof ProductListContract.Actions.LaunchWatchlistGuestOnboardingScreen) {
                        productListFragment.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
                    } else if (actions instanceof ProductListContract.Actions.LaunchDeeplink) {
                        ProductListContract.Actions.LaunchDeeplink launchDeeplink = (ProductListContract.Actions.LaunchDeeplink) actions;
                        String str5 = launchDeeplink.f5223a;
                        List list = launchDeeplink.b;
                        if (SupportedLinksHelperKt.a(str5)) {
                            Intent intentA2 = ShopAppDeepLink.a(Screens.v, str5);
                            intentA2.putParcelableArrayListExtra("ShopAppDeepLink.Extras.additionalAnalyticsExtraContent", (ArrayList) list);
                            productListFragment.startActivity(intentA2);
                        }
                    } else if (actions instanceof ProductListContract.Actions.LaunchProductsTab) {
                        FragmentActivity fragmentActivityRequireActivity = productListFragment.requireActivity();
                        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                        Activities.MainActivity.f4487a.d(fragmentActivityRequireActivity, Activities.MainActivity.Tab.f);
                    } else if (actions instanceof ProductListContract.Actions.LaunchVoiceProductSearch) {
                        KeyEventDispatcher.Component componentRequireActivity = productListFragment.requireActivity();
                        ProductListFragment.ProductListFragmentCaller productListFragmentCaller = componentRequireActivity instanceof ProductListFragment.ProductListFragmentCaller ? (ProductListFragment.ProductListFragmentCaller) componentRequireActivity : null;
                        if (productListFragmentCaller != null) {
                            productListFragmentCaller.r();
                        }
                    } else if (actions instanceof ProductListContract.Actions.ShowMapFeatureHighlight) {
                        MapFeatureHighlightDialog mapFeatureHighlightDialog = new MapFeatureHighlightDialog();
                        FragmentManager parentFragmentManager = productListFragment.getParentFragmentManager();
                        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                        FragmentTransaction fragmentTransactionE = parentFragmentManager.e();
                        fragmentTransactionE.g(0, mapFeatureHighlightDialog, "Map.FeatureHighlightDialogFragment", 1);
                        fragmentTransactionE.e();
                    } else if (actions instanceof ProductListContract.Actions.ShowTransientEdrOfferBoostError) {
                        productListFragment.getString(com.woolworths.R.string.dismiss);
                    } else if (actions instanceof ProductListContract.Actions.LaunchCartScreen) {
                        productListFragment.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                    } else {
                        if (!(actions instanceof ProductListContract.Actions.OpenOliveChat)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        productListFragment.m3().u.getClass();
                        AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
                        productListFragment.startActivity(Activities.AskOliveActivity.b(5, null, Uri.parse(Intrinsics.c(production, production) ? "https://chatwidget.woolworths.com.au/templates/wowo.html" : "https://chatwidget-test.woolworths.com.au/templates/wowo.html").buildUpon().appendQueryParameter("currentPage", "searchZeroResults").build().toString(), null));
                    }
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListFragment$onViewCreated$1$1(ProductListViewModel productListViewModel, ProductListFragment productListFragment, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = productListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListFragment$onViewCreated$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListFragment$onViewCreated$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.z;
            ProductListFragment productListFragment = this.r;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productListFragment, ProductListFragment.class, "handleActions", "handleActions(Lau/com/woolworths/feature/product/list/ProductListContract$Actions;)V", 4), FlowExtKt.a(flow, productListFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
