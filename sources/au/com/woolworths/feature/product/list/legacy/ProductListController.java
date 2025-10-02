package au.com.woolworths.feature.product.list.legacy;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductCardGridTileUiKt;
import au.com.woolworths.feature.product.list.legacy.compose.productfinder.ProductCardListTileUiKt;
import au.com.woolworths.feature.product.list.legacy.compose.recipe.IngredientCardUiKt;
import au.com.woolworths.feature.product.list.legacy.compose.recipe.ListSectionHeaderKt;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileGridLegacyBinding;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileListLegacyBinding;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerModel;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerUiKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.product.composeui.ProductImageWithBadgeKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.composeui.WatchlistIconKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagedListEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0001\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\nH\u0002J\u001c\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001fH\u0002J$\u0010 \u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0002J$\u0010#\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0019H\u0002J\u001c\u0010(\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020)H\u0002J\u001c\u0010*\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020-H\u0002J,\u0010.\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\nH\u0002J$\u00100\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0019H\u0002J,\u00101\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\nH\u0002J\u001c\u00102\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0002J\u001c\u00105\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002J\u001c\u00108\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0002J\u001c\u0010;\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=H\u0002J\u001c\u0010>\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010?\u001a\u00020@H\u0002J\u001a\u0010A\u001a\u00020B2\u0010\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0DH\u0016J\f\u0010E\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002J\u0010\u0010F\u001a\n H*\u0004\u0018\u00010G0GH\u0002J\u0018\u0010I\u001a\n H*\u0004\u0018\u00010J0J2\u0006\u0010K\u001a\u00020LH\u0002J\f\u0010M\u001a\u00020N*\u00020LH\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020RH\u0002J\u001c\u0010S\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010T\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0019H\u0002J\u001c\u0010U\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020VH\u0002J\u001c\u0010W\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010T\u001a\u00020V2\u0006\u0010'\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006Y²\u0006\f\u0010Z\u001a\u0004\u0018\u00010[X\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u0004\u0018\u00010[X\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u0004\u0018\u00010[X\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u0004\u0018\u00010[X\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListController;", "Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", "", "productListViewModel", "Lau/com/woolworths/feature/product/list/legacy/ProductListViewModel;", "productListOptionsviewModel", "Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsViewModel;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "isInstoreMode", "", "isListsAllowed", "<init>", "(Lau/com/woolworths/feature/product/list/legacy/ProductListViewModel;Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsViewModel;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;ZZ)V", "previousModel", "Lcom/airbnb/epoxy/EpoxyModel;", "value", "Lau/com/woolworths/pagingutils/NetworkState;", "networkState", "getNetworkState", "()Lau/com/woolworths/pagingutils/NetworkState;", "setNetworkState", "(Lau/com/woolworths/pagingutils/NetworkState;)V", "buildItemModel", "currentPosition", "", "item", "shouldShowComposeProductCard", "buildComposeDietaryDisclaimer", "id", "", "Lau/com/woolworths/product/models/DietaryDisclaimer;", "buildComposeProductListInsetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "topMargin", "buildProductCardGridTile", "Lau/com/woolworths/product/models/ProductCard;", "productCardConfig", "Lau/com/woolworths/product/models/ProductCardConfig;", "position", "buildComposeDynamicCard", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;", "buildComposeListHeader", "Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderApiData;", "buildComposeIngredientCard", "Lau/com/woolworths/feature/product/list/legacy/data/IngredientCardApiData;", "buildComposeProductCardGridTile", "inMappedStore", "buildProductCardListTile", "buildComposeProductCardListTile", "buildVideoAdUnit", "videoAdUnitData", "Lau/com/woolworths/product/models/VideoAdUnitData;", "buildMerchCard", "merchCardData", "Lau/com/woolworths/shop/aem/components/model/merchcard/MerchCardData;", "buildEdrOfferBanner", "edrOfferBannerData", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;", "buildPersonalisedProductsBanner", "personalisedProductsBannerData", "Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;", "buildHorizontalList", "horizontalListData", "Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;", "addModels", "", "models", "", "buildSkeletonView", "buildLoadingState", "Lau/com/woolworths/feature/product/list/legacy/ItemProductListPaginationLoadingStateBindingModel_;", "kotlin.jvm.PlatformType", "buildErrorState", "Lau/com/woolworths/feature/product/list/legacy/ItemProductListPaginationErrorStateBindingModel_;", "throwable", "", "buildErrorStateLabel", "Lau/com/woolworths/android/onesite/models/text/ResWithArgText;", "getDynamicSizeCardMargins", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardMargins;", "getDynamicSizeCardPaddings", "Landroidx/compose/foundation/layout/PaddingValues;", "buildDynamicSizeCard", "data", "buildComposeTextBannerCard", "Lau/com/woolworths/feature/shop/banners/imagetextbanner/data/ImageTextBanner;", "buildImageTextBannerCard", "Companion", "product-list-legacy_release", "viewState", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ViewState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListController extends PagedListEpoxyController<Object> {
    public static final int $stable = 8;
    private static final float IMAGE_TEXT_BANNER_IMAGE_HEIGHT = 100;
    private static final int SKELETON_ITEMS_COUNT = 6;

    @NotNull
    private final FeatureToggleManager featureToggleManager;
    private final boolean isInstoreMode;
    private final boolean isListsAllowed;

    @Nullable
    private NetworkState networkState;

    @Nullable
    private EpoxyModel<?> previousModel;

    @NotNull
    private final ProductListOptionsViewModel productListOptionsviewModel;

    @NotNull
    private final ProductListViewModel productListViewModel;

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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListController$buildDynamicSizeCard$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C04641 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DynamicSizeCardData p0 = (DynamicSizeCardData) obj;
            Intrinsics.h(p0, "p0");
            ((ProductListViewModel) this.receiver).m(p0);
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListController$buildDynamicSizeCard$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DynamicSizeCardData p0 = (DynamicSizeCardData) obj;
            Intrinsics.h(p0, "p0");
            ((ProductListViewModel) this.receiver).J6(p0);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListController(@NotNull ProductListViewModel productListViewModel, @NotNull ProductListOptionsViewModel productListOptionsviewModel, @NotNull FeatureToggleManager featureToggleManager, boolean z, boolean z2) {
        super(null, null, null, 7, null);
        Intrinsics.h(productListViewModel, "productListViewModel");
        Intrinsics.h(productListOptionsviewModel, "productListOptionsviewModel");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.productListViewModel = productListViewModel;
        this.productListOptionsviewModel = productListOptionsviewModel;
        this.featureToggleManager = featureToggleManager;
        this.isInstoreMode = z;
        this.isListsAllowed = z2;
    }

    private final EpoxyModel<?> buildComposeDietaryDisclaimer(String id, final DietaryDisclaimer item) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeDietaryDisclaimer.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final DietaryDisclaimer dietaryDisclaimer = item;
                    final ProductListController productListController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(123594281, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeDietaryDisclaimer.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 8);
                                DietaryDisclaimer dietaryDisclaimer2 = dietaryDisclaimer;
                                InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(dietaryDisclaimer2.getInsetBanner());
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(dietaryDisclaimer2);
                                ProductListController productListController2 = productListController;
                                boolean zI2 = zI | composer2.I(productListController2);
                                Object objG = composer2.G();
                                if (zI2 || objG == Composer.Companion.f1624a) {
                                    objG = new f(1, dietaryDisclaimer2, productListController2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                InsetBannerUiKt.b(uiModel, modifierF, false, (Function1) objG, composer2, 48, 12);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1433771663));
    }

    private final EpoxyModel<?> buildComposeDynamicCard(String id, final DynamicSizeCardData item) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeDynamicCard.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final DynamicSizeCardData dynamicSizeCardData = item;
                    final ProductListController productListController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1808727842, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeDynamicCard.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierX = SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false);
                                ProductListController productListController2 = productListController;
                                Modifier modifierE = PaddingKt.e(modifierX, productListController2.getDynamicSizeCardPaddings());
                                ProductListViewModel productListViewModel = productListController2.productListViewModel;
                                composer2.o(5004770);
                                boolean zI = composer2.I(productListViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ProductListController$buildComposeDynamicCard$1$1$1$1 productListController$buildComposeDynamicCard$1$1$1$1 = new ProductListController$buildComposeDynamicCard$1$1$1$1(1, productListViewModel, ProductListViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(productListController$buildComposeDynamicCard$1$1$1$1);
                                    objG = productListController$buildComposeDynamicCard$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                ProductListViewModel productListViewModel2 = productListController2.productListViewModel;
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(productListViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ProductListController$buildComposeDynamicCard$1$1$2$1 productListController$buildComposeDynamicCard$1$1$2$1 = new ProductListController$buildComposeDynamicCard$1$1$2$1(1, productListViewModel2, ProductListViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(productListController$buildComposeDynamicCard$1$1$2$1);
                                    objG2 = productListController$buildComposeDynamicCard$1$1$2$1;
                                }
                                composer2.l();
                                DynamicSizeCardKt.b(dynamicSizeCardData, modifierE, function1, (Function1) ((KFunction) objG2), null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1087479770));
    }

    private final EpoxyModel<?> buildComposeIngredientCard(String id, final IngredientCardApiData item) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeIngredientCard.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final IngredientCardApiData ingredientCardApiData = item;
                    final ProductListController productListController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1055667081, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeIngredientCard.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final IngredientCardApiData ingredientCardApiData2 = ingredientCardApiData;
                                final ProductListController productListController2 = productListController;
                                CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(24564197, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeIngredientCard.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            IngredientCardUiKt.a(ingredientCardApiData2, productListController2.productListViewModel, composer3, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 21963073));
    }

    private final EpoxyModel<?> buildComposeListHeader(String id, final ListSectionHeaderApiData item) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeListHeader.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ListSectionHeaderApiData listSectionHeaderApiData = item;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1165543960, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeListHeader.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final ListSectionHeaderApiData listSectionHeaderApiData2 = listSectionHeaderApiData;
                                CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-1891542004, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeListHeader.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            ListSectionHeaderKt.a(listSectionHeaderApiData2, SizeKt.e(Modifier.Companion.d, 1.0f), composer3, 48, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1572057392));
    }

    private final EpoxyModel<?> buildComposeProductCardGridTile(final ProductCard item, final ProductCardConfig productCardConfig, int position, final boolean inMappedStore) {
        return ComposeInteropKt.b(YU.a.d(position, "grid_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductCardGridTile.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListController productListController = ProductListController.this;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListController.productListViewModel.F, composer);
                    final ProductCard productCard = item;
                    final boolean z = inMappedStore;
                    final ProductCardConfig productCardConfig2 = productCardConfig;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1219093158, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductCardGridTile.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductCardConfig productCardConfig3 = productCardConfig2;
                                boolean zIsWatchlistEnabled = productCardConfig3.isWatchlistEnabled();
                                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                List list = viewState != null ? viewState.r : null;
                                ProductCard productCard2 = productCard;
                                boolean zT = ProductCardExtKt.t(productCard2, list);
                                ProductListController productListController2 = productListController;
                                ProductListViewModel productListViewModel = productListController2.productListViewModel;
                                boolean zIsCheckOtherStoresButtonAllowed = productCardConfig3.isCheckOtherStoresButtonAllowed();
                                boolean zIsInstoreMode = productCardConfig3.isInstoreMode();
                                int iV6 = productListController2.productListViewModel.v6();
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(productListController2) | composer2.I(productCard2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new j(productListController2, productCard2, 2);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(productListController2) | composer2.I(productCard2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new j(productListController2, productCard2, 3);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ProductCardGridTileUiKt.a(productCard, productListViewModel, zIsInstoreMode, zIsWatchlistEnabled, zT, z, zIsCheckOtherStoresButtonAllowed, function0, (Function0) objG2, Integer.valueOf(iV6), null, composer2, ProductCard.$stable, 1024);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -198308590));
    }

    private final EpoxyModel<?> buildComposeProductCardListTile(final ProductCard item, final ProductCardConfig productCardConfig, int position, final boolean inMappedStore) {
        return ComposeInteropKt.b(YU.a.d(position, "list_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductCardListTile.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListController productListController = ProductListController.this;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListController.productListViewModel.F, composer);
                    final ProductCard productCard = item;
                    final boolean z = inMappedStore;
                    final ProductCardConfig productCardConfig2 = productCardConfig;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1289383682, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductCardListTile.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductCardConfig productCardConfig3 = productCardConfig2;
                                boolean zIsWatchlistEnabled = productCardConfig3.isWatchlistEnabled();
                                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                List list = viewState != null ? viewState.r : null;
                                if (list == null) {
                                    list = EmptyList.d;
                                }
                                List list2 = list;
                                ProductListController productListController2 = productListController;
                                ProductListViewModel productListViewModel = productListController2.productListViewModel;
                                boolean zIsInstoreMode = productCardConfig3.isInstoreMode();
                                boolean zIsCheckOtherStoresButtonAllowed = productCardConfig3.isCheckOtherStoresButtonAllowed();
                                Integer numValueOf = Integer.valueOf(productListController2.productListViewModel.v6());
                                composer2.o(-1633490746);
                                boolean zI = composer2.I(productListController2);
                                ProductCard productCard2 = productCard;
                                boolean zI2 = zI | composer2.I(productCard2);
                                Object objG = composer2.G();
                                if (zI2 || objG == Composer.Companion.f1624a) {
                                    objG = new j(productListController2, productCard2, 4);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ProductCardListTileUiKt.a(productCard, productListViewModel, zIsInstoreMode, list2, zIsWatchlistEnabled, z, zIsCheckOtherStoresButtonAllowed, numValueOf, (Function0) objG, composer2, ProductCard.$stable, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1984799046));
    }

    private final EpoxyModel<?> buildComposeProductListInsetBanner(String id, final InsetBannerApiData item, final int topMargin) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductListInsetBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final InsetBannerApiData insetBannerApiData = item;
                    final ProductListController productListController = this;
                    final int i = topMargin;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-378521879, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeProductListInsetBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, PrimitiveResources_androidKt.a(composer2, i), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData);
                                composer2.o(5004770);
                                ProductListController productListController2 = productListController;
                                boolean zI = composer2.I(productListController2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new i(productListController2, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                InsetBannerUiKt.b(uiModel, modifierJ, false, (Function1) objG, composer2, 0, 12);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1204893745));
    }

    private final EpoxyModel<?> buildComposeTextBannerCard(String id, final ImageTextBanner item) {
        return ComposeInteropKt.b(id, new Object[]{item}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeTextBannerCard.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ImageTextBanner imageTextBanner = item;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(994166208, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController.buildComposeTextBannerCard.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ImageTextBannerUiKt.a(imageTextBanner, null, ProductListController.IMAGE_TEXT_BANNER_IMAGE_HEIGHT, composer2, KyberEngine.KyberPolyBytes, 2);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2030609032));
    }

    private final EpoxyModel<?> buildDynamicSizeCard(DynamicSizeCardData data, int position) {
        DynamicSizeCardComposeEpoxyModel dynamicSizeCardComposeEpoxyModel = new DynamicSizeCardComposeEpoxyModel(data, getDynamicSizeCardPaddings(), new C04641(1, this.productListViewModel, ProductListViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0), new AnonymousClass2(1, this.productListViewModel, ProductListViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0));
        dynamicSizeCardComposeEpoxyModel.p("dynamic_size_ad_banner_" + position);
        dynamicSizeCardComposeEpoxyModel.l = new k(0);
        return dynamicSizeCardComposeEpoxyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildDynamicSizeCard$lambda$24(int i, int i2, int i3) {
        return i;
    }

    private final EpoxyModel<?> buildEdrOfferBanner(int position, EdrOfferBannerData edrOfferBannerData) {
        float f = 20;
        EdrOfferBannerEpoxyModel edrOfferBannerEpoxyModel = new EdrOfferBannerEpoxyModel(new PaddingValuesImpl(f, f, f, f), this.productListViewModel, edrOfferBannerData);
        edrOfferBannerEpoxyModel.p("edr_offer_banner_" + position);
        edrOfferBannerEpoxyModel.l = new k(4);
        return edrOfferBannerEpoxyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildEdrOfferBanner$lambda$16$lambda$15(int i, int i2, int i3) {
        return i;
    }

    private final ItemProductListPaginationErrorStateBindingModel_ buildErrorState(Throwable throwable) {
        ItemProductListPaginationErrorStateBindingModel_ itemProductListPaginationErrorStateBindingModel_ = new ItemProductListPaginationErrorStateBindingModel_();
        itemProductListPaginationErrorStateBindingModel_.M();
        itemProductListPaginationErrorStateBindingModel_.l = new androidx.media3.extractor.a(28);
        ResWithArgText resWithArgTextBuildErrorStateLabel = buildErrorStateLabel(throwable);
        itemProductListPaginationErrorStateBindingModel_.t();
        itemProductListPaginationErrorStateBindingModel_.n = resWithArgTextBuildErrorStateLabel;
        ProductListViewModel productListViewModel = this.productListViewModel;
        itemProductListPaginationErrorStateBindingModel_.t();
        itemProductListPaginationErrorStateBindingModel_.o = productListViewModel;
        return itemProductListPaginationErrorStateBindingModel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildErrorState$lambda$23(int i, int i2, int i3) {
        return i;
    }

    private final ResWithArgText buildErrorStateLabel(Throwable th) {
        if (th instanceof NoConnectivityException) {
            return new ResWithArgText(com.woolworths.R.string.product_list_connection_error, this.productListViewModel.w6().d.d);
        }
        if (th instanceof ServerErrorException) {
            return new ResWithArgText(com.woolworths.R.string.product_list_server_error, this.productListViewModel.w6().d.d);
        }
        throw new IllegalStateException("Unexpected exception caught: " + th);
    }

    private final EpoxyModel<?> buildHorizontalList(int position, HorizontalListData horizontalListData) {
        HorizontalListEpoxyModel horizontalListEpoxyModel = new HorizontalListEpoxyModel(position, this.productListViewModel, horizontalListData, this.isInstoreMode);
        horizontalListEpoxyModel.p("horizontal_list_" + position);
        horizontalListEpoxyModel.l = new k(3);
        return horizontalListEpoxyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildHorizontalList$lambda$20$lambda$19(int i, int i2, int i3) {
        return i;
    }

    private final EpoxyModel<?> buildImageTextBannerCard(ImageTextBanner data, int position) {
        ImageTextBannerModel imageTextBannerModel = new ImageTextBannerModel(data, IMAGE_TEXT_BANNER_IMAGE_HEIGHT);
        imageTextBannerModel.p("image_text_banner_" + position);
        imageTextBannerModel.l = new k(1);
        return imageTextBannerModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildImageTextBannerCard$lambda$25(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildItemModel$lambda$0(int i, int i2, int i3) {
        return i;
    }

    private final ItemProductListPaginationLoadingStateBindingModel_ buildLoadingState() {
        ItemProductListPaginationLoadingStateBindingModel_ itemProductListPaginationLoadingStateBindingModel_ = new ItemProductListPaginationLoadingStateBindingModel_();
        itemProductListPaginationLoadingStateBindingModel_.M();
        itemProductListPaginationLoadingStateBindingModel_.l = new k(5);
        return itemProductListPaginationLoadingStateBindingModel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildLoadingState$lambda$22(int i, int i2, int i3) {
        return i;
    }

    private final EpoxyModel<?> buildMerchCard(int position, MerchCardData merchCardData) {
        MerchCardEpoxyModel merchCardEpoxyModel = new MerchCardEpoxyModel(this.productListViewModel, merchCardData);
        merchCardEpoxyModel.p("merch_card_" + position);
        return merchCardEpoxyModel;
    }

    private final EpoxyModel<?> buildPersonalisedProductsBanner(int position, PersonalisedProductsBannerData personalisedProductsBannerData) {
        float f = 16;
        PersonalisedProductsBannerEpoxyModel personalisedProductsBannerEpoxyModel = new PersonalisedProductsBannerEpoxyModel(new PaddingValuesImpl(f, f, f, f), this.productListViewModel, personalisedProductsBannerData);
        personalisedProductsBannerEpoxyModel.p("personalised_products_banner_" + position);
        personalisedProductsBannerEpoxyModel.l = new k(6);
        return personalisedProductsBannerEpoxyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildPersonalisedProductsBanner$lambda$18$lambda$17(int i, int i2, int i3) {
        return i;
    }

    private final EpoxyModel<?> buildProductCardGridTile(ProductCard item, ProductCardConfig productCardConfig, int position) {
        ItemProductCardTileGridLegacyBindingModel_ itemProductCardTileGridLegacyBindingModel_ = new ItemProductCardTileGridLegacyBindingModel_();
        itemProductCardTileGridLegacyBindingModel_.M(ProductCardExtKt.b(item, position, this.featureToggleManager));
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.p = item;
        ProductListViewModel productListViewModel = this.productListViewModel;
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.o = productListViewModel;
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.q = productCardConfig;
        ProductCardButtonsState productCardButtonsStateI = ProductCardExtKt.i(item, productCardConfig.isInstoreMode(), productCardConfig.isListsAllowed(), productCardConfig.isCheckOtherStoresButtonAllowed(), 2);
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.r = productCardButtonsStateI;
        boolean zD = this.productListViewModel.m.d();
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.s = zD;
        ProductListViewModel productListViewModel2 = this.productListViewModel;
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.t = productListViewModel2;
        l lVar = new l(item, this, productCardConfig);
        itemProductCardTileGridLegacyBindingModel_.t();
        itemProductCardTileGridLegacyBindingModel_.n = lVar;
        return itemProductCardTileGridLegacyBindingModel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductCardGridTile$lambda$5(final ProductCard productCard, final ProductListController productListController, final ProductCardConfig productCardConfig, ItemProductCardTileGridLegacyBindingModel_ itemProductCardTileGridLegacyBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        EpoxyItemProductCardTileGridLegacyBinding epoxyItemProductCardTileGridLegacyBinding = viewDataBinding instanceof EpoxyItemProductCardTileGridLegacyBinding ? (EpoxyItemProductCardTileGridLegacyBinding) viewDataBinding : null;
        if (epoxyItemProductCardTileGridLegacyBinding != null) {
            ComposeView productMemberPricingLabel = epoxyItemProductCardTileGridLegacyBinding.O;
            Intrinsics.g(productMemberPricingLabel, "productMemberPricingLabel");
            ProductExtKt.a(productMemberPricingLabel, productCard.getMemberPriceInfo(), ProductMemberPriceLabelStyling.e);
            ComposeView composeView = epoxyItemProductCardTileGridLegacyBinding.L;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController$buildProductCardGridTile$1$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductListController productListController2 = productListController;
                        final MutableState mutableStateA = LiveDataAdapterKt.a(productListController2.productListViewModel.F, composer);
                        final ProductCard productCard2 = productCard;
                        final ProductCardConfig productCardConfig2 = productCardConfig;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(986702401, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController$buildProductCardGridTile$1$1$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductCard productCard3 = productCard2;
                                    String productImage = productCard3.getProductImage();
                                    String badgeImage = productCard3.getBadgeImage();
                                    Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7);
                                    boolean z = productCardConfig2.isWatchlistEnabled() && ProductCardExtKt.a(productCard3);
                                    ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                    boolean zT = ProductCardExtKt.t(productCard3, viewState != null ? viewState.r : null);
                                    composer2.o(-1633490746);
                                    ProductListController productListController3 = productListController2;
                                    boolean zI = composer2.I(productListController3) | composer2.I(productCard3);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new j(productListController3, productCard3, 5);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    ProductImageWithBadgeKt.a(productImage, badgeImage, modifierJ, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, z, zT, (Function0) objG, composer2, KyberEngine.KyberPolyBytes, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 103657977));
            TextView textView = epoxyItemProductCardTileGridLegacyBinding.V;
            textView.setMaxLines(productListController.productListViewModel.v6());
            textView.setSingleLine(productListController.productListViewModel.v6() == 1);
            epoxyItemProductCardTileGridLegacyBinding.A.setOnVisibleListener(new j(productListController, productCard, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildProductCardGridTile$lambda$5$lambda$4$lambda$3(ProductListController productListController, ProductCard productCard) {
        productListController.productListViewModel.K6(productCard);
        return Unit.f24250a;
    }

    private final EpoxyModel<?> buildProductCardListTile(ProductCard item, ProductCardConfig productCardConfig, int position) {
        ItemProductCardTileListLegacyBindingModel_ itemProductCardTileListLegacyBindingModel_ = new ItemProductCardTileListLegacyBindingModel_();
        itemProductCardTileListLegacyBindingModel_.M(ProductCardExtKt.b(item, position, this.featureToggleManager));
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.p = item;
        ProductListViewModel productListViewModel = this.productListViewModel;
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.o = productListViewModel;
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.q = productCardConfig;
        ProductCardButtonsState productCardButtonsStateI = ProductCardExtKt.i(item, productCardConfig.isInstoreMode(), productCardConfig.isListsAllowed(), productCardConfig.isCheckOtherStoresButtonAllowed(), 2);
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.r = productCardButtonsStateI;
        boolean zD = this.productListViewModel.m.d();
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.s = zD;
        boolean zC = this.featureToggleManager.c(BaseShopAppFeature.w);
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.t = zC;
        l lVar = new l(item, productCardConfig, this);
        itemProductCardTileListLegacyBindingModel_.t();
        itemProductCardTileListLegacyBindingModel_.n = lVar;
        return itemProductCardTileListLegacyBindingModel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductCardListTile$lambda$11(final ProductCard productCard, ProductCardConfig productCardConfig, final ProductListController productListController, ItemProductCardTileListLegacyBindingModel_ itemProductCardTileListLegacyBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        EpoxyItemProductCardTileListLegacyBinding epoxyItemProductCardTileListLegacyBinding = viewDataBinding instanceof EpoxyItemProductCardTileListLegacyBinding ? (EpoxyItemProductCardTileListLegacyBinding) viewDataBinding : null;
        if (epoxyItemProductCardTileListLegacyBinding != null) {
            ComposeView productMemberPricingLabel = epoxyItemProductCardTileListLegacyBinding.O;
            Intrinsics.g(productMemberPricingLabel, "productMemberPricingLabel");
            ProductExtKt.a(productMemberPricingLabel, productCard.getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
            if (productCardConfig.isWatchlistEnabled() && ProductCardExtKt.a(productCard)) {
                ComposeView composeView = epoxyItemProductCardTileListLegacyBinding.F;
                composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
                composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController$buildProductCardListTile$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final ProductListController productListController2 = this.d;
                            final MutableState mutableStateA = LiveDataAdapterKt.a(productListController2.productListViewModel.F, composer);
                            final ProductCard productCard2 = productCard;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(363852766, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController$buildProductCardListTile$1$1$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer2 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function0 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function0);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                        }
                                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                        Modifier modifierG = BoxScopeInstance.f944a.g(companion, Alignment.Companion.c);
                                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                        List list = viewState != null ? viewState.r : null;
                                        ProductCard productCard3 = productCard2;
                                        boolean zT = ProductCardExtKt.t(productCard3, list);
                                        composer2.o(-1633490746);
                                        ProductListController productListController3 = productListController2;
                                        boolean zI = composer2.I(productListController3) | composer2.I(productCard3);
                                        Object objG = composer2.G();
                                        if (zI || objG == Composer.Companion.f1624a) {
                                            objG = new j(productListController3, productCard3, 6);
                                            composer2.A(objG);
                                        }
                                        composer2.l();
                                        WatchlistIconKt.a(0, 0, composer2, modifierG, (Function0) objG, zT);
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, 28802454));
            }
            TextView textView = epoxyItemProductCardTileListLegacyBinding.U;
            textView.setMaxLines(productListController.productListViewModel.v6());
            textView.setSingleLine(productListController.productListViewModel.v6() == 1);
            if (productListController.productListViewModel.v6() == 2) {
                CharSequence text = textView.getText();
                Intrinsics.g(text, "getText(...)");
                int lineHeight = textView.getLineHeight() * (StringsKt.H(text).size() - 1);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.D = -lineHeight;
                textView.setLayoutParams(layoutParams2);
            }
            epoxyItemProductCardTileListLegacyBinding.P.L(productListController.productListViewModel.F6() ? ProductMultiBuyLabel.f : ProductMultiBuyLabel.e);
            epoxyItemProductCardTileListLegacyBinding.A.setOnVisibleListener(new j(productListController, productCard, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildProductCardListTile$lambda$11$lambda$10$lambda$9(ProductListController productListController, ProductCard productCard) {
        productListController.productListViewModel.K6(productCard);
        return Unit.f24250a;
    }

    private final EpoxyModel<?> buildSkeletonView() {
        if (this.productListViewModel.I == ProductsDisplayMode.d) {
            ItemProductCardTileListSkeletonLegacyBindingModel_ itemProductCardTileListSkeletonLegacyBindingModel_ = new ItemProductCardTileListSkeletonLegacyBindingModel_();
            itemProductCardTileListSkeletonLegacyBindingModel_.M();
            return itemProductCardTileListSkeletonLegacyBindingModel_;
        }
        ItemProductCardTileGridSkeletonLegacyBindingModel_ itemProductCardTileGridSkeletonLegacyBindingModel_ = new ItemProductCardTileGridSkeletonLegacyBindingModel_();
        itemProductCardTileGridSkeletonLegacyBindingModel_.M();
        return itemProductCardTileGridSkeletonLegacyBindingModel_;
    }

    private final EpoxyModel<?> buildVideoAdUnit(int position, VideoAdUnitData videoAdUnitData) {
        ProductListViewModel productListViewModel = this.productListViewModel;
        boolean z = this.isInstoreMode;
        boolean z2 = this.isListsAllowed;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.productListViewModel.F.e();
        boolean z3 = false;
        if (viewState != null && viewState.q) {
            z3 = true;
        }
        VideoAdUnitComposeEpoxyModel videoAdUnitComposeEpoxyModel = new VideoAdUnitComposeEpoxyModel(productListViewModel, new ProductCardConfig(z, true, z2, z3, false, false, null, 112, null), videoAdUnitData);
        videoAdUnitComposeEpoxyModel.p("video_ad_" + position);
        videoAdUnitComposeEpoxyModel.l = new androidx.media3.extractor.a(29);
        return videoAdUnitComposeEpoxyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildVideoAdUnit$lambda$13$lambda$12(int i, int i2, int i3) {
        return i;
    }

    private final DynamicSizeCardMargins getDynamicSizeCardMargins() {
        return ProductListControllerKt.a(this.previousModel) ? new DynamicSizeCardMargins(15) : new DynamicSizeCardMargins(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaddingValues getDynamicSizeCardPaddings() {
        if (ProductListControllerKt.a(this.previousModel)) {
            float f = 16;
            return new PaddingValuesImpl(f, 0, f, f);
        }
        float f2 = 16;
        return new PaddingValuesImpl(f2, f2, f2, f2);
    }

    private final boolean shouldShowComposeProductCard() {
        return this.featureToggleManager.c(BaseShopAppFeature.p0) && this.productListViewModel.A6() == Activities.ProductList.ProductListType.w;
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        ProductListOptionsContract.ViewState viewState;
        Intrinsics.h(models, "models");
        ArrayList arrayListJ0 = CollectionsKt.J0(models);
        if (models.isEmpty() || ((viewState = (ProductListOptionsContract.ViewState) this.productListOptionsviewModel.j.getValue()) != null && viewState.f5335a)) {
            ArrayList arrayList = new ArrayList(6);
            for (int i = 0; i < 6; i++) {
                arrayList.add(buildSkeletonView());
            }
            arrayListJ0.addAll(0, arrayList);
        } else {
            NetworkState networkState = this.networkState;
            Throwable th = networkState != null ? networkState.c : null;
            if (th != null) {
                ItemProductListPaginationErrorStateBindingModel_ itemProductListPaginationErrorStateBindingModel_BuildErrorState = buildErrorState(th);
                Intrinsics.g(itemProductListPaginationErrorStateBindingModel_BuildErrorState, "buildErrorState(...)");
                arrayListJ0.add(itemProductListPaginationErrorStateBindingModel_BuildErrorState);
            } else if (Intrinsics.c(networkState, NetworkState.e)) {
                ItemProductListPaginationLoadingStateBindingModel_ itemProductListPaginationLoadingStateBindingModel_BuildLoadingState = buildLoadingState();
                Intrinsics.g(itemProductListPaginationLoadingStateBindingModel_BuildLoadingState, "buildLoadingState(...)");
                arrayListJ0.add(itemProductListPaginationLoadingStateBindingModel_BuildLoadingState);
            }
        }
        super.addModels(arrayListJ0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [au.com.woolworths.feature.product.list.legacy.ProductListController$buildItemModel$model$2] */
    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable Object item) {
        EpoxyModel<?> epoxyModelBuildVideoAdUnit;
        ItemNutritionInfoBindingModel_ itemNutritionInfoBindingModel_;
        if (item instanceof DynamicSizeCardData) {
            epoxyModelBuildVideoAdUnit = this.featureToggleManager.c(BaseShopAppFeature.J) ? buildComposeDynamicCard(YU.a.d(currentPosition, "dynamic_size_ad_banner_"), (DynamicSizeCardData) item) : buildDynamicSizeCard((DynamicSizeCardData) item, currentPosition);
        } else if (item instanceof ImageTextBanner) {
            epoxyModelBuildVideoAdUnit = this.featureToggleManager.c(BaseShopAppFeature.J) ? buildComposeTextBannerCard(YU.a.d(currentPosition, "image_text_banner_"), (ImageTextBanner) item) : buildImageTextBannerCard((ImageTextBanner) item, currentPosition);
        } else if (item instanceof InsetBannerApiData) {
            int i = getDynamicSizeCardMargins().f10031a;
            if (this.featureToggleManager.c(BaseShopAppFeature.J)) {
                epoxyModelBuildVideoAdUnit = buildComposeProductListInsetBanner(YU.a.d(currentPosition, "inset_banner_"), (InsetBannerApiData) item, i);
            } else {
                ItemProductListInsetBannerLegacyBindingModel_ itemProductListInsetBannerLegacyBindingModel_ = new ItemProductListInsetBannerLegacyBindingModel_();
                itemProductListInsetBannerLegacyBindingModel_.M("inset_banner_" + currentPosition);
                InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel((InsetBannerApiData) item);
                itemProductListInsetBannerLegacyBindingModel_.t();
                itemProductListInsetBannerLegacyBindingModel_.n = uiModel;
                Integer numValueOf = Integer.valueOf(i);
                itemProductListInsetBannerLegacyBindingModel_.t();
                itemProductListInsetBannerLegacyBindingModel_.o = numValueOf;
                ProductListViewModel productListViewModel = this.productListViewModel;
                itemProductListInsetBannerLegacyBindingModel_.t();
                itemProductListInsetBannerLegacyBindingModel_.p = productListViewModel;
                itemProductListInsetBannerLegacyBindingModel_.l = new k(2);
                epoxyModelBuildVideoAdUnit = itemProductListInsetBannerLegacyBindingModel_;
            }
        } else if (item instanceof ProductCard) {
            boolean z = this.isInstoreMode;
            boolean z2 = this.isListsAllowed;
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.productListViewModel.F.e();
            ProductCardConfig productCardConfig = new ProductCardConfig(z, true, z2, viewState != null && viewState.q, this.featureToggleManager.c(BaseShopAppFeature.h), false, null, 96, null);
            int iOrdinal = this.productListViewModel.I.ordinal();
            if (iOrdinal == 0) {
                epoxyModelBuildVideoAdUnit = shouldShowComposeProductCard() ? buildComposeProductCardListTile((ProductCard) item, productCardConfig, currentPosition, this.productListViewModel.m.d()) : buildProductCardListTile((ProductCard) item, productCardConfig, currentPosition);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                epoxyModelBuildVideoAdUnit = shouldShowComposeProductCard() ? buildComposeProductCardGridTile((ProductCard) item, productCardConfig, currentPosition, this.productListViewModel.m.d()) : buildProductCardGridTile((ProductCard) item, productCardConfig, currentPosition);
            }
        } else if (item instanceof HorizontalListData) {
            epoxyModelBuildVideoAdUnit = buildHorizontalList(currentPosition, (HorizontalListData) item);
        } else if (item instanceof ListSectionHeaderApiData) {
            if (this.featureToggleManager.c(BaseShopAppFeature.J)) {
                epoxyModelBuildVideoAdUnit = buildComposeListHeader(YU.a.d(currentPosition, "list_section_header_"), (ListSectionHeaderApiData) item);
            } else {
                ItemProductListSectionHeaderBindingModel_ itemProductListSectionHeaderBindingModel_ = new ItemProductListSectionHeaderBindingModel_();
                itemProductListSectionHeaderBindingModel_.M("list_section_header_" + currentPosition);
                itemProductListSectionHeaderBindingModel_.t();
                itemProductListSectionHeaderBindingModel_.n = (ListSectionHeaderApiData) item;
                itemNutritionInfoBindingModel_ = itemProductListSectionHeaderBindingModel_;
                epoxyModelBuildVideoAdUnit = itemNutritionInfoBindingModel_;
            }
        } else if (item instanceof IngredientCardApiData) {
            if (this.featureToggleManager.c(BaseShopAppFeature.J)) {
                epoxyModelBuildVideoAdUnit = buildComposeIngredientCard(YU.a.d(currentPosition, "list_ingredient_separator_"), (IngredientCardApiData) item);
            } else {
                ItemIngredientCardSeparatorBindingModel_ itemIngredientCardSeparatorBindingModel_ = new ItemIngredientCardSeparatorBindingModel_();
                itemIngredientCardSeparatorBindingModel_.M("list_ingredient_separator_" + currentPosition);
                itemIngredientCardSeparatorBindingModel_.t();
                itemIngredientCardSeparatorBindingModel_.n = (IngredientCardApiData) item;
                ProductListViewModel productListViewModel2 = this.productListViewModel;
                itemIngredientCardSeparatorBindingModel_.t();
                itemIngredientCardSeparatorBindingModel_.o = productListViewModel2;
                itemNutritionInfoBindingModel_ = itemIngredientCardSeparatorBindingModel_;
                epoxyModelBuildVideoAdUnit = itemNutritionInfoBindingModel_;
            }
        } else if (!(item instanceof DietaryDisclaimer)) {
            epoxyModelBuildVideoAdUnit = item instanceof VideoAdUnitData ? buildVideoAdUnit(currentPosition, (VideoAdUnitData) item) : item instanceof MerchCardData ? buildMerchCard(currentPosition, (MerchCardData) item) : item instanceof EdrOfferBannerData ? buildEdrOfferBanner(currentPosition, (EdrOfferBannerData) item) : item instanceof PersonalisedProductsBannerData ? buildPersonalisedProductsBanner(currentPosition, (PersonalisedProductsBannerData) item) : buildSkeletonView();
        } else if (this.featureToggleManager.c(BaseShopAppFeature.J)) {
            epoxyModelBuildVideoAdUnit = buildComposeDietaryDisclaimer(YU.a.d(currentPosition, "dietary_disclaimer_"), (DietaryDisclaimer) item);
        } else {
            ItemNutritionInfoBindingModel_ itemNutritionInfoBindingModel_2 = new ItemNutritionInfoBindingModel_();
            itemNutritionInfoBindingModel_2.M("dietary_disclaimer_" + currentPosition);
            final DietaryDisclaimer dietaryDisclaimer = (DietaryDisclaimer) item;
            InsetBannerData uiModel2 = InsetBannerApiDataExtKt.toUiModel(dietaryDisclaimer.getInsetBanner());
            itemNutritionInfoBindingModel_2.t();
            itemNutritionInfoBindingModel_2.n = uiModel2;
            ?? r13 = new InsetBannerClickListener() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListController$buildItemModel$model$2
                @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
                public final void onActionClicked(InsetBanner insetBanner) {
                    Intrinsics.h(insetBanner, "insetBanner");
                    DietaryInfo dietaryInfo = dietaryDisclaimer.getDietaryInfo();
                    if (dietaryInfo != null) {
                        this.productListViewModel.v.f(new ProductListContract.Actions.LaunchNutritionInfo(dietaryInfo));
                    }
                }
            };
            itemNutritionInfoBindingModel_2.t();
            itemNutritionInfoBindingModel_2.o = r13;
            itemNutritionInfoBindingModel_ = itemNutritionInfoBindingModel_2;
            epoxyModelBuildVideoAdUnit = itemNutritionInfoBindingModel_;
        }
        this.previousModel = epoxyModelBuildVideoAdUnit;
        Intrinsics.e(epoxyModelBuildVideoAdUnit);
        return epoxyModelBuildVideoAdUnit;
    }

    @Nullable
    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final void setNetworkState(@Nullable NetworkState networkState) {
        this.networkState = networkState;
        requestModelBuild();
    }
}
