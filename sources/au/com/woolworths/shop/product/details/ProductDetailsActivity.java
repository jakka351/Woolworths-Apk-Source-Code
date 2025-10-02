package au.com.woolworths.shop.product.details;

import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$cardTap$1;
import au.com.woolworths.android.onesite.analytics.DeepLinkAnalytics;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.ProductDetailsViewModel;
import au.com.woolworths.shop.product.details.data.FooterButtonAction;
import au.com.woolworths.shop.product.details.navigation.ProductDetailsNavHostKt;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsActivity extends Hilt_ProductDetailsActivity implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int C = 0;
    public final Lazy A = LazyKt.b(new b(this, 0));
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(ProductDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final ProductDetailsActivity productDetailsActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<ProductDetailsViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ProductDetailsViewModel.Factory factory = (ProductDetailsViewModel.Factory) obj;
                    ProductDetailsActivity productDetailsActivity2 = productDetailsActivity;
                    boolean booleanExtra = productDetailsActivity2.getIntent().getBooleanExtra("is_deep_link_flag", false);
                    String stringExtra = productDetailsActivity2.getIntent().getStringExtra("deep_link_uri");
                    return factory.a((String) productDetailsActivity2.A.getD(), stringExtra != null ? DeepLinkAnalytics.i(stringExtra) : null, booleanExtra);
                }
            });
        }
    });
    public FeatureToggleManager x;
    public CollectionModeInteractor y;
    public ShopAppNavigator z;

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(O4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            View decorView = getWindow().getDecorView();
            Intrinsics.g(decorView, "getDecorView(...)");
            ListChangeEventKt.a((ListChangeEvent.AddToListSuccessEvent) listChangeEvent, this, decorView, false, 28);
        }
    }

    public final ProductDetailsViewModel O4() {
        return (ProductDetailsViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
    }

    @Override // au.com.woolworths.shop.product.details.Hilt_ProductDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(5004770);
                    final ProductDetailsActivity productDetailsActivity = this.d;
                    boolean zI = composer.I(productDetailsActivity);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new b(productDetailsActivity, 1);
                        composer.A(objG);
                    }
                    composer.l();
                    final PagerState pagerStateC = PagerStateKt.c((Function0) objG, composer, 6, 2);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1670317195, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1.1

                        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/product/details/ProductDetailsActivity$setViewContent$1$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        public final class C02631 implements ProductClickListener {
                            public final /* synthetic */ ProductDetailsActivity d;

                            public C02631(ProductDetailsActivity productDetailsActivity) {
                                this.d = productDetailsActivity;
                            }

                            @Override // au.com.woolworths.product.tile.ProductClickListener
                            public final void D4(ProductCard productCardTileData, String containerTitle) {
                                Intrinsics.h(containerTitle, "containerTitle");
                                Intrinsics.h(productCardTileData, "productCardTileData");
                                int i = ProductDetailsActivity.C;
                                ProductDetailsViewModel productDetailsViewModelO4 = this.d.O4();
                                AnalyticsData analyticsDataV6 = productDetailsViewModelO4.v6(FooterButtonAction.g);
                                if (analyticsDataV6 != null) {
                                    productDetailsViewModelO4.C6(AnalyticsDataKt.a(analyticsDataV6));
                                }
                                ProductCard productCardU6 = productDetailsViewModelO4.u6();
                                if (productCardU6 != null) {
                                    productDetailsViewModelO4.A6(productCardU6);
                                }
                            }

                            @Override // au.com.woolworths.product.tile.ProductClickListener
                            public final void L0(ProductCard productCardTileData, String containerTitle) {
                                Intrinsics.h(containerTitle, "containerTitle");
                                Intrinsics.h(productCardTileData, "productCardTileData");
                                int i = ProductDetailsActivity.C;
                                ProductDetailsViewModel productDetailsViewModelO4 = this.d.O4();
                                AnalyticsData analyticsDataV6 = productDetailsViewModelO4.v6(FooterButtonAction.e);
                                if (analyticsDataV6 != null) {
                                    productDetailsViewModelO4.C6(AnalyticsDataKt.a(analyticsDataV6));
                                }
                                ProductCard productCardU6 = productDetailsViewModelO4.u6();
                                if (productCardU6 != null) {
                                    productDetailsViewModelO4.s.f(new ProductDetailsContract.Action.LaunchListsBottomSheet(productCardU6));
                                }
                            }

                            @Override // au.com.woolworths.product.tile.ProductClickListener
                            public final void T4(ProductCard productCardTileData, String containerTitle) {
                                Intrinsics.h(containerTitle, "containerTitle");
                                Intrinsics.h(productCardTileData, "productCardTileData");
                                int i = ProductDetailsActivity.C;
                                ProductDetailsViewModel productDetailsViewModelO4 = this.d.O4();
                                AnalyticsData analyticsDataV6 = productDetailsViewModelO4.v6(FooterButtonAction.f);
                                if (analyticsDataV6 != null) {
                                    productDetailsViewModelO4.C6(AnalyticsDataKt.a(analyticsDataV6));
                                }
                                ProductCard productCardU6 = productDetailsViewModelO4.u6();
                                if (productCardU6 != null) {
                                    productDetailsViewModelO4.z6(productCardU6);
                                }
                            }

                            @Override // au.com.woolworths.product.tile.ProductClickListener
                            public final void g5(ProductCard productCardTileData, String containerTitle) {
                                Intrinsics.h(containerTitle, "containerTitle");
                                Intrinsics.h(productCardTileData, "productCardTileData");
                                int i = ProductDetailsActivity.C;
                                ProductDetailsViewModel productDetailsViewModelO4 = this.d.O4();
                                AnalyticsData analyticsDataV6 = productDetailsViewModelO4.v6(FooterButtonAction.h);
                                if (analyticsDataV6 != null) {
                                    productDetailsViewModelO4.C6(AnalyticsDataKt.a(analyticsDataV6));
                                }
                                ProductCard productCardU6 = productDetailsViewModelO4.u6();
                                if (productCardU6 != null) {
                                    productDetailsViewModelO4.s.f(new ProductDetailsContract.Action.LaunchSeeInStoreBottomSheet(productCardU6));
                                }
                            }

                            @Override // au.com.woolworths.product.tile.ProductClickListener
                            public final void g6(ProductCard productCardData, String containerTitle) {
                                Intrinsics.h(containerTitle, "containerTitle");
                                Intrinsics.h(productCardData, "productCardData");
                                int i = ProductDetailsActivity.C;
                                this.d.O4().g6(productCardData, containerTitle);
                            }
                        }

                        /* JADX WARN: Type inference failed for: r12v0, types: [au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1$1$2] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                NavHostController navHostControllerA = NavHostControllerKt.a(new Navigator[0], composer2);
                                int i = ProductDetailsActivity.C;
                                final ProductDetailsActivity productDetailsActivity2 = productDetailsActivity;
                                ProductDetailsViewModel productDetailsViewModelO4 = productDetailsActivity2.O4();
                                C02631 c02631 = new C02631(productDetailsActivity2);
                                ?? r12 = new ProductClickListener() { // from class: au.com.woolworths.shop.product.details.ProductDetailsActivity.setViewContent.1.1.2
                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void D4(ProductCard productCardTileData, String containerTitle) {
                                        String lowerCase;
                                        String buttonLabel;
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardTileData, "productCardTileData");
                                        int i2 = ProductDetailsActivity.C;
                                        ProductDetailsViewModel productDetailsViewModelO42 = productDetailsActivity2.O4();
                                        ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
                                        ProductTrolleyData trolley = productCardTileData.getTrolley();
                                        if (trolley == null || (buttonLabel = trolley.getButtonLabel()) == null) {
                                            lowerCase = "";
                                        } else {
                                            lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                                            Intrinsics.g(lowerCase, "toLowerCase(...)");
                                        }
                                        companion.getClass();
                                        productDetailsViewModelO42.D6(ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase), productCardTileData);
                                        productDetailsViewModelO42.A6(productCardTileData);
                                    }

                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void J1(ProductCard productCardData, String containerTitle) {
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardData, "productCardData");
                                        int i2 = ProductDetailsActivity.C;
                                        ProductDetailsViewModel productDetailsViewModelO42 = productDetailsActivity2.O4();
                                        ProductCardAnalytics.Carousel.Action.d.getClass();
                                        productDetailsViewModelO42.D6(new ProductCardAnalytics$Carousel$Action$Companion$cardTap$1(containerTitle), productCardData);
                                        productDetailsViewModelO42.s.f(new ProductDetailsContract.Action.LaunchProductDetails(productCardData));
                                    }

                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void L0(ProductCard productCardTileData, String containerTitle) {
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardTileData, "productCardTileData");
                                        int i2 = ProductDetailsActivity.C;
                                        ProductDetailsViewModel productDetailsViewModelO42 = productDetailsActivity2.O4();
                                        ProductCardAnalytics.Carousel.Action.d.getClass();
                                        productDetailsViewModelO42.D6(new ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1(containerTitle), productCardTileData);
                                        productDetailsViewModelO42.s.f(new ProductDetailsContract.Action.LaunchListsBottomSheet(productCardTileData));
                                    }

                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void T4(ProductCard productCardTileData, String containerTitle) {
                                        String lowerCase;
                                        String buttonLabel;
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardTileData, "productCardTileData");
                                        int i2 = ProductDetailsActivity.C;
                                        ProductDetailsViewModel productDetailsViewModelO42 = productDetailsActivity2.O4();
                                        ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
                                        ProductTrolleyData trolley = productCardTileData.getTrolley();
                                        if (trolley == null || (buttonLabel = trolley.getButtonLabel()) == null) {
                                            lowerCase = "";
                                        } else {
                                            lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                                            Intrinsics.g(lowerCase, "toLowerCase(...)");
                                        }
                                        companion.getClass();
                                        productDetailsViewModelO42.D6(ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase), productCardTileData);
                                        productDetailsViewModelO42.z6(productCardTileData);
                                    }

                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void g5(ProductCard productCardTileData, String containerTitle) {
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardTileData, "productCardTileData");
                                        int i2 = ProductDetailsActivity.C;
                                        productDetailsActivity2.O4().s.f(new ProductDetailsContract.Action.LaunchSeeInStoreBottomSheet(productCardTileData));
                                    }

                                    @Override // au.com.woolworths.product.tile.ProductClickListener
                                    public final void g6(ProductCard productCardData, String containerTitle) {
                                        Intrinsics.h(containerTitle, "containerTitle");
                                        Intrinsics.h(productCardData, "productCardData");
                                        int i2 = ProductDetailsActivity.C;
                                        productDetailsActivity2.O4().g6(productCardData, "Carousel - ".concat(containerTitle));
                                    }
                                };
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(productDetailsActivity2);
                                Object objG2 = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ProductDetailsActivity$setViewContent$1$1$3$1 productDetailsActivity$setViewContent$1$1$3$1 = new ProductDetailsActivity$setViewContent$1$1$3$1(0, productDetailsActivity2, ProductDetailsActivity.class, "finish", "finish()V", 0);
                                    composer2.A(productDetailsActivity$setViewContent$1$1$3$1);
                                    objG2 = productDetailsActivity$setViewContent$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG2);
                                CollectionModeInteractor collectionModeInteractor = productDetailsActivity2.y;
                                if (collectionModeInteractor == null) {
                                    Intrinsics.p("collectionModeInteractor");
                                    throw null;
                                }
                                boolean zB = collectionModeInteractor.b();
                                i iVar = productDetailsActivity2.O4().u;
                                ProductDetailsViewModel productDetailsViewModelO42 = productDetailsActivity2.O4();
                                composer2.o(5004770);
                                boolean zN = composer2.n(productDetailsViewModelO42);
                                Object objG3 = composer2.G();
                                if (zN || objG3 == composer$Companion$Empty$1) {
                                    ProductDetailsActivity$setViewContent$1$1$4$1 productDetailsActivity$setViewContent$1$1$4$1 = new ProductDetailsActivity$setViewContent$1$1$4$1(1, productDetailsViewModelO42, ProductDetailsViewModel.class, "onChatEntryBannerClicked", "onChatEntryBannerClicked(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                                    composer2.A(productDetailsActivity$setViewContent$1$1$4$1);
                                    objG3 = productDetailsActivity$setViewContent$1$1$4$1;
                                }
                                composer2.l();
                                ProductDetailsNavHostKt.a(navHostControllerA, productDetailsViewModelO4, pagerStateC, c02631, r12, function0, zB, iVar, (Function1) ((KFunction) objG3), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 501838673));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductDetailsActivity$collectActions$1(this, null), 3);
    }
}
