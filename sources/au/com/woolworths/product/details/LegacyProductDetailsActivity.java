package au.com.woolworths.product.details;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics$Banner$Action$couponToastNotification$1;
import au.com.woolworths.analytics.supers.local.ProductDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.DeepLinkAnalytics;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.epoxy.CarouselWithPagerSnap;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetContract;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.details.HealthierBottomSheetFragment;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.analytics.ProductDetailsActions;
import au.com.woolworths.product.details.databinding.ActivityProductDetailsBinding;
import au.com.woolworths.product.details.models.HealthierLink;
import au.com.woolworths.product.details.models.HealthierLinkedInfo;
import au.com.woolworths.product.details.models.ProductDetailsData;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/details/LegacyProductDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LegacyProductDetailsActivity extends Hilt_LegacyProductDetailsActivity implements AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int G = 0;
    public ShopAppNavigator A;
    public ActivityProductDetailsBinding B;
    public ProductDetailsEpoxyController C;
    public final ViewModelLazy D;
    public final ViewModelLazy E;
    public final CompositeDisposable F;
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ListsInMemoryRepository z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9290a;

        static {
            int[] iArr = new int[ButtonStyleApiData.values().length];
            try {
                iArr[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9290a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.details.LegacyProductDetailsActivity$onCreate$3", f = "LegacyProductDetailsActivity.kt", l = {154}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.details.LegacyProductDetailsActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.product.details.LegacyProductDetailsActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<EducationBottomSheetContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EducationBottomSheetContract.Actions actions = (EducationBottomSheetContract.Actions) obj;
                LegacyProductDetailsActivity legacyProductDetailsActivity = (LegacyProductDetailsActivity) this.d;
                int i = LegacyProductDetailsActivity.G;
                legacyProductDetailsActivity.getClass();
                if (Intrinsics.c(actions, EducationBottomSheetContract.Actions.ContinueAddOrUpdateCart.f8751a)) {
                    legacyProductDetailsActivity.O4().u6(false, false, ProductDetailsAnalytics.Details.Action.d);
                } else {
                    if (!(actions instanceof EducationBottomSheetContract.Actions.LaunchInfoSection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InfoSectionFragment.Companion.a(((EducationBottomSheetContract.Actions.LaunchInfoSection) actions).f8752a, null).show(legacyProductDetailsActivity.getSupportFragmentManager(), "InfoSectionFragment");
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return LegacyProductDetailsActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                LegacyProductDetailsActivity legacyProductDetailsActivity = LegacyProductDetailsActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, legacyProductDetailsActivity, LegacyProductDetailsActivity.class, "handleEducationBottomSheetActions", "handleEducationBottomSheetActions(Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;)V", 4), FlowExtKt.a(((EducationBottomSheetViewModel) legacyProductDetailsActivity.E.getD()).m, legacyProductDetailsActivity.getD(), Lifecycle.State.g));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.product.details.LegacyProductDetailsActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ProductDetailsContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws NumberFormatException {
            InfoSheet infoSheet;
            String title;
            InStoreAvailabilityInfo inStoreAvailabilityInfo;
            InfoSheet infoSheet2;
            String message;
            AlertDialog.Builder negativeButton;
            LinearLayout linearLayout;
            ProductDetailsContract.Actions p0 = (ProductDetailsContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            final LegacyProductDetailsActivity legacyProductDetailsActivity = (LegacyProductDetailsActivity) this.receiver;
            int i = LegacyProductDetailsActivity.G;
            legacyProductDetailsActivity.getClass();
            if (p0 instanceof ProductDetailsContract.Actions.WebLinkClick) {
                ContextExtKt.j(legacyProductDetailsActivity, ((ProductDetailsContract.Actions.WebLinkClick) p0).f9309a, null, null, null, 62);
            } else if (p0 instanceof ProductDetailsContract.Actions.AddButtonClick) {
                ProductDetailsContract.Actions.AddButtonClick addButtonClick = (ProductDetailsContract.Actions.AddButtonClick) p0;
                ProductCard productCard = addButtonClick.f9291a;
                boolean z = addButtonClick.b;
                FragmentManager supportFragmentManager = legacyProductDetailsActivity.getSupportFragmentManager();
                Screens screens = Screens.t;
                AddToCartBottomSheetFragment.Companion.a(supportFragmentManager, new AddToCartBottomSheetFragment.Extras(productCard, z, new AddToCartBottomSheetFragment.ProductBottomSheetHostScreen(screens.getD(), screens.getD(), screens.getF()), (ProductCard) null, 16));
            } else if (p0 instanceof ProductDetailsContract.Actions.LaunchImageGallery) {
                Activities.ImageGallery.Extras extras = ((ProductDetailsContract.Actions.LaunchImageGallery) p0).f9299a;
                Intent intentA = ActivityNavigatorKt.a(Activities.ImageGallery.f4479a, ApplicationType.e);
                intentA.putExtra("EXTRA_IMAGE_GALLERY_DATA", extras);
                legacyProductDetailsActivity.startActivityForResult(intentA, 1805);
            } else if (p0 instanceof ProductDetailsContract.Actions.LaunchAddToList) {
                ProductCard productCard2 = ((ProductDetailsContract.Actions.LaunchAddToList) p0).f9295a;
                AddToListBottomSheetFragment.Companion.a(legacyProductDetailsActivity.getSupportFragmentManager(), null, Screens.t, CollectionsKt.Q(new AddToListProductParameters(productCard2, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard2), true, null, null, 914);
            } else if (p0 instanceof ProductDetailsContract.Actions.RequestFocusForNutritionTable) {
                ActivityProductDetailsBinding activityProductDetailsBinding = legacyProductDetailsActivity.B;
                if (activityProductDetailsBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) activityProductDetailsBinding.A.findViewById(com.woolworths.R.id.product_nutrition_info_container);
                if (constraintLayout != null && (linearLayout = (LinearLayout) constraintLayout.findViewById(com.woolworths.R.id.table_container)) != null) {
                    linearLayout.addOnLayoutChangeListener(new LegacyProductDetailsActivity$requestFocusForNutritionTable$$inlined$doOnNextLayout$1());
                }
            } else {
                final int i2 = 1;
                if (p0 instanceof ProductDetailsContract.Actions.DisplayRestrictedItemPrompt) {
                    boolean z2 = ((ProductDetailsContract.Actions.DisplayRestrictedItemPrompt) p0).f9293a;
                    AlertDialog.Builder title2 = new AlertDialog.Builder(legacyProductDetailsActivity).setTitle(com.woolworths.R.string.product_age_restricted_item_prompt_title);
                    if (z2) {
                        final int i3 = 0;
                        negativeButton = title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message_underage).setPositiveButton(com.woolworths.R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.product.details.a
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = i3;
                                LegacyProductDetailsActivity legacyProductDetailsActivity2 = legacyProductDetailsActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager = legacyProductDetailsActivity2.x;
                                        if (analyticsManager != null) {
                                            analyticsManager.c(ProductDetailsActions.RestrictedItemLoginPromptOk.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                    case 1:
                                        int i7 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager2 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager2 == null) {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                        analyticsManager2.c(ProductDetailsActions.RestrictedItemLoginPromptLogin.e);
                                        Activities.LogIn.c(legacyProductDetailsActivity2);
                                        return;
                                    default:
                                        int i8 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager3 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager3 != null) {
                                            analyticsManager3.c(ProductDetailsActions.RestrictedItemLoginPromptCancel.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                }
                            }
                        });
                    } else {
                        final int i4 = 2;
                        negativeButton = title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message).setPositiveButton(com.woolworths.R.string.login_action, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.product.details.a
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i5 = i2;
                                LegacyProductDetailsActivity legacyProductDetailsActivity2 = legacyProductDetailsActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager = legacyProductDetailsActivity2.x;
                                        if (analyticsManager != null) {
                                            analyticsManager.c(ProductDetailsActions.RestrictedItemLoginPromptOk.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                    case 1:
                                        int i7 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager2 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager2 == null) {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                        analyticsManager2.c(ProductDetailsActions.RestrictedItemLoginPromptLogin.e);
                                        Activities.LogIn.c(legacyProductDetailsActivity2);
                                        return;
                                    default:
                                        int i8 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager3 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager3 != null) {
                                            analyticsManager3.c(ProductDetailsActions.RestrictedItemLoginPromptCancel.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                }
                            }
                        }).setNegativeButton(com.woolworths.R.string.cancel, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.product.details.a
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i42) {
                                int i5 = i4;
                                LegacyProductDetailsActivity legacyProductDetailsActivity2 = legacyProductDetailsActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager = legacyProductDetailsActivity2.x;
                                        if (analyticsManager != null) {
                                            analyticsManager.c(ProductDetailsActions.RestrictedItemLoginPromptOk.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                    case 1:
                                        int i7 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager2 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager2 == null) {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                        analyticsManager2.c(ProductDetailsActions.RestrictedItemLoginPromptLogin.e);
                                        Activities.LogIn.c(legacyProductDetailsActivity2);
                                        return;
                                    default:
                                        int i8 = LegacyProductDetailsActivity.G;
                                        AnalyticsManager analyticsManager3 = legacyProductDetailsActivity2.x;
                                        if (analyticsManager3 != null) {
                                            analyticsManager3.c(ProductDetailsActions.RestrictedItemLoginPromptCancel.e);
                                            return;
                                        } else {
                                            Intrinsics.p("analyticsManager");
                                            throw null;
                                        }
                                }
                            }
                        });
                    }
                    negativeButton.create().show();
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchMarketplaceInfoScreen) {
                    ProductDetailsContract.Actions.LaunchMarketplaceInfoScreen launchMarketplaceInfoScreen = (ProductDetailsContract.Actions.LaunchMarketplaceInfoScreen) p0;
                    InfoSectionFragment.Companion.a(launchMarketplaceInfoScreen.f9301a, launchMarketplaceInfoScreen.b).show(legacyProductDetailsActivity.getSupportFragmentManager(), "InfoSectionFragment");
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchMarketplaceSellerItemsList) {
                    ProductDetailsContract.Actions.LaunchMarketplaceSellerItemsList launchMarketplaceSellerItemsList = (ProductDetailsContract.Actions.LaunchMarketplaceSellerItemsList) p0;
                    String str = launchMarketplaceSellerItemsList.f9302a;
                    legacyProductDetailsActivity.startActivity(Activities.ComposeProductListLegacy.f4460a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasByFacet(null, str, launchMarketplaceSellerItemsList.b, launchMarketplaceSellerItemsList.c, null), (Activities.ProductList.ExtrasConfig) null, 12)));
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchProductDetails) {
                    String str2 = ((ProductDetailsContract.Actions.LaunchProductDetails) p0).f9303a;
                    ShopAppNavigator shopAppNavigator = legacyProductDetailsActivity.A;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator.d(str2);
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchHealthierBottomSheet) {
                    HealthierLinkedInfo linkedInfo = ((ProductDetailsContract.Actions.LaunchHealthierBottomSheet) p0).f9298a.getLinkedInfo();
                    if (linkedInfo != null) {
                        List<HealthierLink> links = linkedInfo.getLinks();
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(links, 10));
                        for (HealthierLink healthierLink : links) {
                            arrayList.add(new Pair(healthierLink.getText(), healthierLink.getUrl()));
                        }
                        HealthierBottomSheetFragment.Extras extras2 = new HealthierBottomSheetFragment.Extras(linkedInfo.getTitle(), linkedInfo.getContent(), linkedInfo.getMarkdownContent(), arrayList);
                        HealthierBottomSheetFragment healthierBottomSheetFragment = new HealthierBottomSheetFragment();
                        healthierBottomSheetFragment.setCancelable(true);
                        healthierBottomSheetFragment.setArguments(BundleKt.a(new Pair("healthier_extra_data", extras2)));
                        healthierBottomSheetFragment.show(legacyProductDetailsActivity.getSupportFragmentManager(), "HealthierBottomSheetFragment");
                    }
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchEducationBottomSheet) {
                    ProductDetailsContract.Actions.LaunchEducationBottomSheet launchEducationBottomSheet = (ProductDetailsContract.Actions.LaunchEducationBottomSheet) p0;
                    EducationBottomSheetFragment.Companion.a(Screens.t, launchEducationBottomSheet.f9297a, launchEducationBottomSheet.b).show(legacyProductDetailsActivity.getSupportFragmentManager(), "EducationBottomSheetFragment");
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet) {
                    ProductCard productCard3 = ((ProductDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet) p0).f9296a;
                    InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard3.getInStoreAvailabilityInfo();
                    if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard3.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                        ProductMessageBottomSheetFragment.Companion.a(legacyProductDetailsActivity.getSupportFragmentManager(), productCard3, title, message, Screens.t, null);
                    }
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchShareProductIntent) {
                    String strA = YU.a.A("https://www.woolworths.com.au/shop/productdetails/", ((ProductDetailsContract.Actions.LaunchShareProductIntent) p0).f9306a);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", strA);
                    intent.setType("text/plain");
                    legacyProductDetailsActivity.startActivity(Intent.createChooser(intent, null));
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchPromotionScreen) {
                    PromotionMarkdownContent promotionMarkdownContent = ((ProductDetailsContract.Actions.LaunchPromotionScreen) p0).f9304a;
                    legacyProductDetailsActivity.startActivity(Activities.Promotion.f4509a.b(promotionMarkdownContent.getPromotionMarkdownTitle(), promotionMarkdownContent.getPromotionMarkdownText()));
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchRatingsAndReviews) {
                    legacyProductDetailsActivity.startActivity(ShopAppDeepLink.a(Screens.t, ((ProductDetailsContract.Actions.LaunchRatingsAndReviews) p0).f9305a));
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchWriteReviewIntent) {
                    legacyProductDetailsActivity.startActivity(ShopAppDeepLink.a(Screens.t, ((ProductDetailsContract.Actions.LaunchWriteReviewIntent) p0).f9307a));
                } else if (p0 instanceof ProductDetailsContract.Actions.LaunchActionableCard) {
                    legacyProductDetailsActivity.startActivity(ShopAppDeepLink.a(Screens.t, ((ProductDetailsContract.Actions.LaunchActionableCard) p0).f9294a.getLink()));
                } else if (p0 instanceof ProductDetailsContract.Actions.CopyEverydayMarketCouponCode) {
                    String couponCode = ((ProductDetailsContract.Actions.CopyEverydayMarketCouponCode) p0).f9292a;
                    Object systemService = legacyProductDetailsActivity.getSystemService((Class<Object>) ClipboardManager.class);
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(legacyProductDetailsActivity.getString(com.woolworths.R.string.copy_coupon_code_to_clipboard_label), couponCode));
                    ActivityProductDetailsBinding activityProductDetailsBinding2 = legacyProductDetailsActivity.B;
                    if (activityProductDetailsBinding2 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    Snackbar.i(activityProductDetailsBinding2.B, com.woolworths.R.string.copy_coupon_code_success_message, -1).l();
                    ActivityProductDetailsBinding activityProductDetailsBinding3 = legacyProductDetailsActivity.B;
                    if (activityProductDetailsBinding3 == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    activityProductDetailsBinding3.h.announceForAccessibility(legacyProductDetailsActivity.getString(com.woolworths.R.string.everyday_market_coupon_coupon_accessibility_copy_success));
                    ProductDetailsViewModel productDetailsViewModelO4 = legacyProductDetailsActivity.O4();
                    String string = legacyProductDetailsActivity.getString(com.woolworths.R.string.copy_coupon_code_success_message);
                    Intrinsics.g(string, "getString(...)");
                    Intrinsics.h(couponCode, "couponCode");
                    ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) productDetailsViewModelO4.o.e());
                    if (productCardC != null) {
                        AnalyticsManager analyticsManager = productDetailsViewModelO4.g;
                        EmCouponBannerAnalytics.Banner.Action action = new EmCouponBannerAnalytics.Banner(productCardC.getName(), "productdetail", Screens.t.getE()).h;
                        action.getClass();
                        analyticsManager.g(new EmCouponBannerAnalytics$Banner$Action$couponToastNotification$1(action, string, couponCode));
                    }
                } else {
                    if (!(p0 instanceof ProductDetailsContract.Actions.LaunchInStoreMap)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductCard productCard4 = ((ProductDetailsContract.Actions.LaunchInStoreMap) p0).f9300a;
                    ShopAppNavigator shopAppNavigator2 = legacyProductDetailsActivity.A;
                    if (shopAppNavigator2 == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator2.c(productCard4);
                }
            }
            return Unit.f24250a;
        }
    }

    public LegacyProductDetailsActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.D = new ViewModelLazy(reflectionFactory.b(ProductDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.E = new ViewModelLazy(reflectionFactory.b(EducationBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.details.LegacyProductDetailsActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.F = new CompositeDisposable();
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(O4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            ActivityProductDetailsBinding activityProductDetailsBinding = this.B;
            if (activityProductDetailsBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            CoordinatorLayout contentContainer = activityProductDetailsBinding.B;
            Intrinsics.g(contentContainer, "contentContainer");
            if (this.z != null) {
                ListChangeEventKt.a(addToListSuccessEvent, this, contentContainer, !r2.f(), 20);
            } else {
                Intrinsics.p("listsInMemoryRepository");
                throw null;
            }
        }
    }

    public final ProductDetailsViewModel O4() {
        return (ProductDetailsViewModel) this.D.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1805) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            int intExtra = intent != null ? intent.getIntExtra("EXTRA_IMAGE_INDEX", 0) : 0;
            ActivityProductDetailsBinding activityProductDetailsBinding = this.B;
            if (activityProductDetailsBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            CarouselWithPagerSnap carouselWithPagerSnap = (CarouselWithPagerSnap) activityProductDetailsBinding.A.findViewById(com.woolworths.R.id.product_image_carousel);
            if (carouselWithPagerSnap != null) {
                carouselWithPagerSnap.o0(intExtra);
            }
        }
    }

    @Override // au.com.woolworths.product.details.Hilt_LegacyProductDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String productId;
        super.onCreate(bundle);
        Activities.LegacyProductDetails.Extras extras = (Activities.LegacyProductDetails.Extras) getIntent().getParcelableExtra("EXTRA_PRODUCT_DETAILS_DATA");
        if (extras == null) {
            throw new IllegalStateException("productId is required in Bundle");
        }
        this.B = (ActivityProductDetailsBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_product_details);
        ProductDetailsViewModel productDetailsViewModelO4 = O4();
        FeatureToggleManager featureToggleManager = this.y;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        this.C = new ProductDetailsEpoxyController(productDetailsViewModelO4, featureToggleManager, O4());
        ActivityProductDetailsBinding activityProductDetailsBinding = this.B;
        if (activityProductDetailsBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityProductDetailsBinding.D);
        ActivityProductDetailsBinding activityProductDetailsBinding2 = this.B;
        if (activityProductDetailsBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityProductDetailsBinding2.D(this);
        activityProductDetailsBinding2.O(O4());
        activityProductDetailsBinding2.L(O4());
        activityProductDetailsBinding2.N(O4().r6());
        ListsInMemoryRepository listsInMemoryRepository = this.z;
        if (listsInMemoryRepository == null) {
            Intrinsics.p("listsInMemoryRepository");
            throw null;
        }
        activityProductDetailsBinding2.M(listsInMemoryRepository.b());
        EpoxyRecyclerView epoxyRecyclerView = activityProductDetailsBinding2.A;
        ProductDetailsEpoxyController productDetailsEpoxyController = this.C;
        if (productDetailsEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(productDetailsEpoxyController);
        epoxyRecyclerView.setItemAnimator(null);
        O4().o.f(this, new LegacyProductDetailsActivity$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 28)));
        ProductDetailsViewModel productDetailsViewModelO42 = O4();
        Activities.LegacyProductDetails.ExtraProductDetailsSource extraProductDetailsSource = extras.d;
        if (extraProductDetailsSource instanceof Activities.LegacyProductDetails.ExtrasById) {
            String productId2 = ((Activities.LegacyProductDetails.ExtrasById) extraProductDetailsSource).d;
            Intrinsics.h(productId2, "productId");
            productDetailsViewModelO42.n = productId2;
            productDetailsViewModelO42.q6();
        } else if (extraProductDetailsSource instanceof Activities.LegacyProductDetails.ExtrasByData) {
            Activities.LegacyProductDetails.ExtraProductDetailsData extraProductDetailsData = ((Activities.LegacyProductDetails.ExtrasByData) extraProductDetailsSource).d;
            Intrinsics.f(extraProductDetailsData, "null cannot be cast to non-null type au.com.woolworths.product.details.models.ProductDetailsData");
            ProductDetailsData productDetailsData = (ProductDetailsData) extraProductDetailsData;
            ProductCard productCard = (ProductCard) CollectionsKt.F(CollectionsKt.A(productDetailsData.getFeed(), ProductCard.class));
            if (productCard == null || (productId = productCard.getProductId()) == null) {
                throw new IllegalArgumentException("Invalid Product with null product ID");
            }
            productDetailsViewModelO42.n = productId;
            MutableLiveData mutableLiveData = productDetailsViewModelO42.o;
            ArrayList arrayListV6 = ProductDetailsViewModel.v6(productDetailsData.getFeed());
            List<ProductImage> imageList = productDetailsData.getImageList();
            if (imageList.isEmpty()) {
                imageList = CollectionsKt.Q(new ProductImage(null, null));
            }
            ProductDetailsViewModel.w6(productDetailsViewModelO42, mutableLiveData, arrayListV6, imageList, null, null, 25);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(com.woolworths.R.menu.menu_cart_and_share, menu);
        MenuItem menuItemFindItem = menu.findItem(com.woolworths.R.id.cart_item);
        if (menuItemFindItem == null) {
            return true;
        }
        ListsInMemoryRepository listsInMemoryRepository = this.z;
        if (listsInMemoryRepository == null) {
            Intrinsics.p("listsInMemoryRepository");
            throw null;
        }
        menuItemFindItem.setVisible(listsInMemoryRepository.c());
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(Screens.t);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (itemId == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            if (itemId != com.woolworths.R.id.share) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            ProductDetailsViewModel productDetailsViewModelO4 = O4();
            PublishSubject publishSubject = productDetailsViewModelO4.p;
            String str = productDetailsViewModelO4.n;
            if (str == null) {
                Intrinsics.p("productId");
                throw null;
            }
            publishSubject.onNext(new ProductDetailsContract.Actions.LaunchShareProductIntent(str));
            TrackingMetadata trackingMetadataS6 = productDetailsViewModelO4.s6(null);
            if (trackingMetadataS6 != null) {
                productDetailsViewModelO4.g.j(ProductDetailsActions.ShareProductClick.e, trackingMetadataS6);
            }
            return true;
        } finally {
            Callback.q();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.F.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        PublishSubject publishSubject = O4().q;
        androidx.camera.lifecycle.b bVar = new androidx.camera.lifecycle.b(6, new AnonymousClass1(1, this, LegacyProductDetailsActivity.class, "handleActions", "handleActions(Lau/com/woolworths/product/details/ProductDetailsContract$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.F, lambdaObserver);
        boolean booleanExtra = getIntent().getBooleanExtra("is_deep_link_flag", false);
        String stringExtra = getIntent().getStringExtra("deep_link_uri");
        String strI = stringExtra != null ? DeepLinkAnalytics.i(stringExtra) : null;
        ProductDetailsViewModel productDetailsViewModelO4 = O4();
        TrackableValue trackableValue = TrackableValue.h0;
        if (strI == null) {
            strI = "";
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, strI);
        productDetailsViewModelO4.r = booleanExtra;
        if (booleanExtra) {
            productDetailsViewModelO4.g.j(ProductDetailsActions.DeeplinkVisit.e, trackingMetadataA);
        }
    }
}
