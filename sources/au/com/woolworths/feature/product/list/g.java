package au.com.woolworths.feature.product.list;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.unit.IntOffset;
import androidx.lifecycle.MediatorLiveData;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                BuildersKt.c((CoroutineScope) obj3, null, null, new ComposeProductListActivity$initUi$1$1$1$1$1$1$1((ModalBottomSheetState) obj2, null), 3);
                return unit;
            case 1:
                final ProductListFragment productListFragment = (ProductListFragment) obj2;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                float f = ProductListFragment.u;
                Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                Iterator it = ((LazyPagingItems) obj3).c().iterator();
                final int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    if (next instanceof DynamicSizeCardData) {
                        final DynamicSizeCardData dynamicSizeCardData = (DynamicSizeCardData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(16), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    String strD = YU.a.d(i2, "dynamic_size_ad_banner_");
                                    float f2 = ProductListFragment.u;
                                    productListFragment.Q1(strD, dynamicSizeCardData, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 91949951));
                    } else if (next instanceof ImageTextBanner) {
                        final ImageTextBanner imageTextBanner = (ImageTextBanner) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(18), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer.n(item) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer.c()) {
                                    composer.j();
                                } else {
                                    item.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5));
                                    float f2 = ProductListFragment.u;
                                    productListFragment.P2(imageTextBanner, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1428243702));
                    } else if (next instanceof InsetBannerApiData) {
                        final InsetBannerApiData insetBannerApiData = (InsetBannerApiData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(19), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$6
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer.n(item) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer.c()) {
                                    composer.j();
                                } else {
                                    productListFragment.u2(YU.a.d(i2, "inset_banner_"), insetBannerApiData, (ProductListFragment.A3(item) ? new DynamicSizeCardMargins(15) : new DynamicSizeCardMargins(13)).f10031a, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1974636343));
                    } else if (next instanceof HorizontalListData) {
                        final HorizontalListData horizontalListData = (HorizontalListData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(20), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$8
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    float f2 = ProductListFragment.u;
                                    productListFragment.b2(i2, horizontalListData, composer, 64);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1773938312));
                    } else if (next instanceof ListSectionHeaderApiData) {
                        final ListSectionHeaderApiData listSectionHeaderApiData = (ListSectionHeaderApiData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(21), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$10
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    String strD = YU.a.d(i2, "list_section_header_");
                                    float f2 = ProductListFragment.u;
                                    productListFragment.i2(strD, listSectionHeaderApiData, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1227545671));
                    } else if (next instanceof IngredientCardApiData) {
                        final IngredientCardApiData ingredientCardApiData = (IngredientCardApiData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(22), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$12
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    String strD = YU.a.d(i2, "list_ingredient_separator_");
                                    float f2 = ProductListFragment.u;
                                    productListFragment.h2(strD, ingredientCardApiData, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -681153030));
                    } else if (next instanceof DietaryDisclaimer) {
                        final DietaryDisclaimer dietaryDisclaimer = (DietaryDisclaimer) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(23), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$14
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    String strD = YU.a.d(i2, "dietary_disclaimer_");
                                    int i4 = DietaryDisclaimer.$stable << 3;
                                    float f2 = ProductListFragment.u;
                                    productListFragment.I1(strD, dietaryDisclaimer, composer, i4);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -134760389));
                    } else if (next instanceof VideoAdUnitData) {
                        final VideoAdUnitData videoAdUnitData = (VideoAdUnitData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(24), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$16
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    int i4 = VideoAdUnitData.$stable << 3;
                                    float f2 = ProductListFragment.u;
                                    productListFragment.Q2(i2, videoAdUnitData, composer, i4);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 411632252));
                    } else if (next instanceof MerchCardData) {
                        final MerchCardData merchCardData = (MerchCardData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(25), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$18
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    float f2 = ProductListFragment.u;
                                    productListFragment.n2(i2, merchCardData, composer, 64);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 958024893));
                    } else if (next instanceof EdrOfferBannerData) {
                        final EdrOfferBannerData edrOfferBannerData = (EdrOfferBannerData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(26), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    float f2 = ProductListFragment.u;
                                    productListFragment.R1(edrOfferBannerData, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1504417534));
                    } else if (next instanceof PersonalisedProductsBannerData) {
                        final PersonalisedProductsBannerData personalisedProductsBannerData = (PersonalisedProductsBannerData) next;
                        LazyVerticalGrid.f(new au.com.woolworths.design.core.ui.component.stable.corerow.c(17), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$22
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    float f2 = ProductListFragment.u;
                                    productListFragment.o2(personalisedProductsBannerData, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1217734924));
                    } else if (next instanceof ProductCard) {
                        CollectionModeInteractor collectionModeInteractor = productListFragment.l;
                        if (collectionModeInteractor == null) {
                            Intrinsics.p("collectionModeInteractor");
                            throw null;
                        }
                        boolean zB = collectionModeInteractor.b();
                        boolean z = !(productListFragment.h3().d.e instanceof Activities.ProductList.ExtrasBySearchAlternative);
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) productListFragment.m3().C.e();
                        boolean z2 = viewState != null && viewState.q;
                        FeatureToggleManager featureToggleManager = productListFragment.k;
                        if (featureToggleManager == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        final ProductCardConfig productCardConfig = new ProductCardConfig(zB, true, z, z2, featureToggleManager.c(BaseShopAppFeature.h), false, null, 96, null);
                        final ProductCard productCard = (ProductCard) next;
                        LazyVerticalGrid.f(new o(productListFragment, 1), new ComposableLambdaImpl(new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListUI$1$1$1$24

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                static {
                                    int[] iArr = new int[ProductsDisplayMode.values().length];
                                    try {
                                        iArr[0] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.d;
                                        iArr[1] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyGridItemScope item = (LazyGridItemScope) obj4;
                                Composer composer = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    float f2 = ProductListFragment.u;
                                    ProductListFragment productListFragment2 = productListFragment;
                                    int iOrdinal = productListFragment2.m3().L.ordinal();
                                    ProductCardConfig productCardConfig2 = productCardConfig;
                                    ProductCard productCard2 = productCard;
                                    if (iOrdinal == 0) {
                                        composer.o(1904595770);
                                        productListFragment2.q2(productCard2, productCardConfig2, productListFragment2.m3().n.d(), composer, ProductCard.$stable | (ProductCardConfig.$stable << 3));
                                        composer.l();
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw au.com.woolworths.android.onesite.a.x(composer, -1185490171);
                                        }
                                        composer.o(1904969754);
                                        productListFragment2.p2(productCard2, productCardConfig2, productListFragment2.m3().n.d(), composer, ProductCard.$stable | (ProductCardConfig.$stable << 3));
                                        composer.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1764127565));
                    } else {
                        continue;
                    }
                    i2 = i3;
                }
                return unit;
            case 2:
                ProductListFragment productListFragment2 = (ProductListFragment) obj2;
                InsetBanner it2 = (InsetBanner) obj;
                Intrinsics.h(it2, "it");
                DietaryInfo dietaryInfo = ((DietaryDisclaimer) obj3).getDietaryInfo();
                if (dietaryInfo != null) {
                    float f2 = ProductListFragment.u;
                    productListFragment2.m3().y.f(new ProductListContract.Actions.LaunchNutritionInfo(dietaryInfo));
                }
                return unit;
            default:
                List list = (List) obj;
                Intrinsics.e(list);
                ProductListViewModel.H6((ProductListViewModel) obj3, (MediatorLiveData) obj2, 0, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, 66846719);
                return unit;
        }
    }
}
