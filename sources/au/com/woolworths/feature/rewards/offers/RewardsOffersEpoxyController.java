package au.com.woolworths.feature.rewards.offers;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.feature.rewards.offers.ProductOfferTile;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy;
import au.com.woolworths.feature.rewards.offers.accessibility.StandardBannerAccessibilityDelegate;
import au.com.woolworths.feature.rewards.offers.data.BannerSectionConfig;
import au.com.woolworths.feature.rewards.offers.data.OffersSectionConfig;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessageExtKt;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFiltersGroup;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItemKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.foundation.rewards.offers.ui.accessibility.OfferTileAccessibilityDelegate;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.IdUtils;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u001c\u0010\u0013\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001c\u0010\u0018\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020$H\u0002J\b\u0010(\u001a\u00020\u000fH\u0002J\f\u0010)\u001a\u00020**\u00020$H\u0002J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020$2\u0006\u0010,\u001a\u00020#H\u0002J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0014*\u00020$2\u0006\u0010/\u001a\u00020*2\u0006\u0010,\u001a\u00020#H\u0002J\"\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0014*\b\u0012\u0004\u0012\u0002010\u00142\b\u00102\u001a\u0004\u0018\u00010\u0017H\u0002JF\u00103\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020!2\u0006\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u000b2\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020#2\b\b\u0001\u00108\u001a\u00020*H\u0002J \u00109\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\u000bH\u0002J\u001a\u0010<\u001a\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010=\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$ViewState;", "context", "Landroid/content/Context;", "viewModel", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersViewModelLegacy;", "<init>", "(Landroid/content/Context;Lau/com/woolworths/feature/rewards/offers/RewardsOffersViewModelLegacy;)V", "dismissedBannerIds", "", "", "offerTileAccessibilityDelegate", "Lau/com/woolworths/foundation/rewards/offers/ui/accessibility/OfferTileAccessibilityDelegate;", "dismissBanner", "", "bannerId", "buildModels", "viewState", "filterAndBuildStandardBanners", "", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "filter", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferFilterData;", "filterAndBuildSpinSurpriseBanners", "buildStandardBanner", "banner", "Lau/com/woolworths/feature/rewards/offers/StandardBannerViewItem;", "buildSpinSurpriseBannerIfFeatureEnabled", "Lau/com/woolworths/feature/rewards/offers/SpinSurpriseBannerViewItem;", "buildOfferSection", "filters", "section", "Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;", "shouldShowActivateAllButton", "", "Lau/com/woolworths/feature/rewards/offers/ProductSectionViewItem;", "productOfferTiles", "", "Landroid/view/View;", "setTraversals", "maxRowCount", "", "buildProductOfferCarousel", "isEndedOffers", "toProductOfferTiles", "Lau/com/woolworths/feature/rewards/offers/ProductOfferTile;", "rowCount", "filterBy", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "filterData", "buildSectionTitle", "title", "ctaText", "offerCount", "isCtaInProgress", "paddingBottomRes", "buildNormalOfferCard", "item", "filterId", "shouldShowSectionTitle", "sectionId", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOffersEpoxyController extends TypedEpoxyController<RewardsOffersContractLegacy.ViewState> {
    public static final int $stable = 8;
    public static final int OFFERS_ROW_COUNT = 2;

    @NotNull
    private static final String OFFER_COUNT_PLACEHOLDER = "%%%";

    @NotNull
    private final Context context;

    @NotNull
    private final Set<String> dismissedBannerIds;

    @NotNull
    private final OfferTileAccessibilityDelegate offerTileAccessibilityDelegate;

    @NotNull
    private final List<View> productOfferTiles;

    @NotNull
    private final RewardsOffersViewModelLegacy viewModel;

    public RewardsOffersEpoxyController(@NotNull Context context, @NotNull RewardsOffersViewModelLegacy viewModel) {
        Intrinsics.h(context, "context");
        Intrinsics.h(viewModel, "viewModel");
        this.context = context;
        this.viewModel = viewModel;
        this.dismissedBannerIds = new LinkedHashSet();
        this.offerTileAccessibilityDelegate = new OfferTileAccessibilityDelegate();
        this.productOfferTiles = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List buildModels$lambda$1$lambda$0(RewardsOffersEpoxyController rewardsOffersEpoxyController, RewardsOfferFilterData rewardsOfferFilterData, List offers) {
        Intrinsics.h(offers, "offers");
        return rewardsOffersEpoxyController.filterBy(offers, rewardsOfferFilterData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$3(ItemRewardsOffersFilterNoOffersBindingModel_ itemRewardsOffersFilterNoOffersBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        View view = dataBindingHolder.f13309a.h;
        Intrinsics.f(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        final ConstraintLayout constraintLayout = (ConstraintLayout) view;
        OneShotPreDrawListener.a(constraintLayout, new Runnable() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController$buildModels$lambda$4$lambda$3$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = constraintLayout;
                ViewParent parent = view2.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyRecyclerView");
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) parent;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                constraintLayout2.setMinHeight(((epoxyRecyclerView.getHeight() - epoxyRecyclerView.getPaddingBottom()) - epoxyRecyclerView.getPaddingTop()) - constraintLayout2.getTop());
            }
        });
    }

    private final void buildNormalOfferCard(RewardsOffersViewModelLegacy viewModel, OfferViewItem item, String filterId) {
        ItemRewardsOfferTileCompatBindingModel_ itemRewardsOfferTileCompatBindingModel_ = new ItemRewardsOfferTileCompatBindingModel_();
        itemRewardsOfferTileCompatBindingModel_.M("item_rewards_offer_tile" + item.b.d + "_" + filterId);
        itemRewardsOfferTileCompatBindingModel_.t();
        itemRewardsOfferTileCompatBindingModel_.p = item;
        androidx.camera.core.processing.f fVar = new androidx.camera.core.processing.f(5, this, item, viewModel);
        itemRewardsOfferTileCompatBindingModel_.t();
        itemRewardsOfferTileCompatBindingModel_.n = fVar;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(19, this, item);
        itemRewardsOfferTileCompatBindingModel_.t();
        itemRewardsOfferTileCompatBindingModel_.o = eVar;
        add(itemRewardsOfferTileCompatBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildNormalOfferCard$lambda$36$lambda$34(RewardsOffersEpoxyController rewardsOffersEpoxyController, final OfferViewItem offerViewItem, final RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy, ItemRewardsOfferTileCompatBindingModel_ itemRewardsOfferTileCompatBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewCompat.A(dataBindingHolder.f13309a.h, rewardsOffersEpoxyController.offerTileAccessibilityDelegate);
        ComposeView composeView = (ComposeView) dataBindingHolder.f13309a.h.findViewById(com.woolworths.R.id.compose_view);
        if (composeView != null) {
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController$buildNormalOfferCard$1$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final OfferViewItem offerViewItem2 = offerViewItem;
                        final RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy2 = rewardsOffersViewModelLegacy;
                        ThemeKt.a(48, composer, ComposableLambdaKt.c(1534928392, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController$buildNormalOfferCard$1$1$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    final OfferViewItem offerViewItem3 = offerViewItem2;
                                    RewardsOfferData rewardsOfferData = offerViewItem3.b;
                                    StatefulButtonState statefulButtonStateA = OfferViewItemKt.a(offerViewItem3);
                                    composer2.o(-1633490746);
                                    final RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy3 = rewardsOffersViewModelLegacy2;
                                    boolean zI = composer2.I(rewardsOffersViewModelLegacy3) | composer2.I(offerViewItem3);
                                    Object objG = composer2.G();
                                    Object obj5 = Composer.Companion.f1624a;
                                    if (zI || objG == obj5) {
                                        final int i2 = 0;
                                        objG = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.e
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                RewardsOfferData it = (RewardsOfferData) obj6;
                                                switch (i2) {
                                                    case 0:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersViewModelLegacy3.L4(offerViewItem3.b);
                                                        break;
                                                    default:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersViewModelLegacy3.Z(offerViewItem3.b);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    composer2.l();
                                    composer2.o(-1633490746);
                                    boolean zI2 = composer2.I(rewardsOffersViewModelLegacy3) | composer2.I(offerViewItem3);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        objG2 = new androidx.navigation.compose.d(21, rewardsOffersViewModelLegacy3, offerViewItem3);
                                        composer2.A(objG2);
                                    }
                                    Function2 function2 = (Function2) objG2;
                                    composer2.l();
                                    composer2.o(-1633490746);
                                    boolean zI3 = composer2.I(rewardsOffersViewModelLegacy3) | composer2.I(offerViewItem3);
                                    Object objG3 = composer2.G();
                                    if (zI3 || objG3 == obj5) {
                                        final int i3 = 1;
                                        objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.e
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                RewardsOfferData it = (RewardsOfferData) obj6;
                                                switch (i3) {
                                                    case 0:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersViewModelLegacy3.L4(offerViewItem3.b);
                                                        break;
                                                    default:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersViewModelLegacy3.Z(offerViewItem3.b);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    RewardsOfferTileKt.h(rewardsOfferData, statefulButtonStateA, function1, function2, (Function1) objG3, null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 96);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -560957579));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildNormalOfferCard$lambda$36$lambda$35(RewardsOffersEpoxyController rewardsOffersEpoxyController, OfferViewItem offerViewItem, ItemRewardsOfferTileCompatBindingModel_ itemRewardsOfferTileCompatBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 4) {
            rewardsOffersEpoxyController.viewModel.w6(offerViewItem.b);
        }
    }

    private final void buildOfferSection(RewardsOfferFilterData filters, OfferSectionViewItem section) {
        String str;
        RewardsOfferFilterData rewardsOfferFilterData;
        ContentCta contentCta;
        int size = SectionViewItemExtKt.c(section).size();
        if (size == 0) {
            return;
        }
        if (section instanceof ProductSectionViewItem) {
            ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) section;
            String str2 = productSectionViewItem.d;
            if (str2 != null) {
                rewardsOfferFilterData = filters;
                buildSectionTitle(rewardsOfferFilterData, section, str2, (!shouldShowActivateAllButton(productSectionViewItem) || (contentCta = productSectionViewItem.h) == null) ? null : contentCta.getLabel(), size, productSectionViewItem.g && shouldShowActivateAllButton(productSectionViewItem), com.woolworths.R.dimen.quarter_default_padding);
            } else {
                rewardsOfferFilterData = filters;
            }
            buildProductOfferCarousel(productSectionViewItem, Intrinsics.c(rewardsOfferFilterData != null ? rewardsOfferFilterData.f6288a : null, "ended"));
            return;
        }
        if (!(section instanceof StandardSectionViewItem)) {
            throw new NoWhenBranchMatchedException();
        }
        StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) section;
        String str3 = standardSectionViewItem.d;
        if (str3 != null) {
            buildSectionTitle(filters, section, str3, null, size, false, com.woolworths.R.dimen.default_padding);
        }
        if (filters == null || (str = filters.f6288a) == null) {
            str = "";
        }
        List list = standardSectionViewItem.f;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((OfferViewItem) obj).b.d)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            buildNormalOfferCard(this.viewModel, (OfferViewItem) it.next(), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [au.com.woolworths.feature.rewards.offers.ItemRewardsProductOfferEmptyTileBindingModel_, com.airbnb.epoxy.EpoxyModel] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [au.com.woolworths.feature.rewards.offers.ItemRewardsProductOfferTileBindingModel_, com.airbnb.epoxy.EpoxyModel] */
    private final void buildProductOfferCarousel(ProductSectionViewItem section, boolean isEndedOffers) {
        ?? itemRewardsProductOfferEmptyTileBindingModel_;
        int iMaxRowCount = maxRowCount(section);
        List<ProductOfferTile> productOfferTiles = toProductOfferTiles(section, iMaxRowCount, isEndedOffers);
        List<ProductOfferTile> list = productOfferTiles;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (ProductOfferTile productOfferTile : list) {
            if (productOfferTile instanceof ProductOfferTile.DataTile) {
                itemRewardsProductOfferEmptyTileBindingModel_ = new ItemRewardsProductOfferTileBindingModel_();
                ProductOfferTile.DataTile dataTile = (ProductOfferTile.DataTile) productOfferTile;
                OfferViewItem offerViewItem = dataTile.c;
                itemRewardsProductOfferEmptyTileBindingModel_.M("rewards_product_offer_" + offerViewItem.b.d);
                itemRewardsProductOfferEmptyTileBindingModel_.t();
                itemRewardsProductOfferEmptyTileBindingModel_.p = offerViewItem;
                String str = dataTile.b;
                itemRewardsProductOfferEmptyTileBindingModel_.t();
                itemRewardsProductOfferEmptyTileBindingModel_.q = str;
                androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(16, this, dataTile);
                itemRewardsProductOfferEmptyTileBindingModel_.t();
                itemRewardsProductOfferEmptyTileBindingModel_.n = eVar;
                a aVar = new a(this);
                itemRewardsProductOfferEmptyTileBindingModel_.t();
                itemRewardsProductOfferEmptyTileBindingModel_.o = aVar;
                RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = this.viewModel;
                itemRewardsProductOfferEmptyTileBindingModel_.t();
                itemRewardsProductOfferEmptyTileBindingModel_.r = rewardsOffersViewModelLegacy;
            } else {
                if (!(productOfferTile instanceof ProductOfferTile.EmptyTile)) {
                    throw new NoWhenBranchMatchedException();
                }
                itemRewardsProductOfferEmptyTileBindingModel_ = new ItemRewardsProductOfferEmptyTileBindingModel_();
                itemRewardsProductOfferEmptyTileBindingModel_.M("rewards_product_offer_empty_group_".concat(((ProductOfferTile.EmptyTile) productOfferTile).b));
            }
            arrayList.add(itemRewardsProductOfferEmptyTileBindingModel_);
        }
        ProductOffersCarouselModel_ productOffersCarouselModel_ = new ProductOffersCarouselModel_();
        productOffersCarouselModel_.D("rewards_product_offers_carousel_".concat(section.c));
        Carousel.Padding padding = new Carousel.Padding(com.woolworths.R.dimen.offer_carousel_top_padding, com.woolworths.R.dimen.half_default_padding, com.woolworths.R.dimen.half_default_padding);
        BitSet bitSet = productOffersCarouselModel_.n;
        bitSet.set(1);
        bitSet.clear(5);
        bitSet.clear(6);
        productOffersCarouselModel_.s = -1;
        productOffersCarouselModel_.t();
        productOffersCarouselModel_.q = padding;
        bitSet.set(3);
        bitSet.clear(4);
        productOffersCarouselModel_.t();
        productOffersCarouselModel_.r = 1.1f;
        bitSet.set(0);
        productOffersCarouselModel_.t();
        productOffersCarouselModel_.p = arrayList;
        b bVar = new b(iMaxRowCount, productOfferTiles, this);
        productOffersCarouselModel_.t();
        productOffersCarouselModel_.o = bVar;
        productOffersCarouselModel_.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductOfferCarousel$lambda$23$lambda$21(final RewardsOffersEpoxyController rewardsOffersEpoxyController, final ProductOfferTile productOfferTile, ItemRewardsProductOfferTileBindingModel_ itemRewardsProductOfferTileBindingModel_, DataBindingEpoxyModel.DataBindingHolder view, int i) {
        Intrinsics.h(view, "view");
        View view2 = view.f13309a.h;
        if (!rewardsOffersEpoxyController.productOfferTiles.contains(view2)) {
            view2.setId((int) IdUtils.a("rewards_product_offer_" + ((ProductOfferTile.DataTile) productOfferTile).c.b.d));
            rewardsOffersEpoxyController.productOfferTiles.add(view2);
            rewardsOffersEpoxyController.setTraversals();
        }
        ComposeView composeView = (ComposeView) view.f13309a.h.findViewById(com.woolworths.R.id.compose_view);
        if (composeView != null) {
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController$buildProductOfferCarousel$offerModels$1$1$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductOfferTile productOfferTile2 = productOfferTile;
                        final RewardsOffersEpoxyController rewardsOffersEpoxyController2 = rewardsOffersEpoxyController;
                        ThemeKt.a(48, composer, ComposableLambdaKt.c(-1380982874, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController$buildProductOfferCarousel$offerModels$1$1$1$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    final ProductOfferTile productOfferTile3 = productOfferTile2;
                                    OfferViewItem offerViewItem = ((ProductOfferTile.DataTile) productOfferTile3).c;
                                    RewardsOfferData rewardsOfferData = offerViewItem.b;
                                    StatefulButtonState statefulButtonStateA = OfferViewItemKt.a(offerViewItem);
                                    composer2.o(-1633490746);
                                    final RewardsOffersEpoxyController rewardsOffersEpoxyController3 = rewardsOffersEpoxyController2;
                                    boolean zI = composer2.I(rewardsOffersEpoxyController3) | composer2.n(productOfferTile3);
                                    Object objG = composer2.G();
                                    Object obj5 = Composer.Companion.f1624a;
                                    if (zI || objG == obj5) {
                                        final int i2 = 0;
                                        objG = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.f
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                RewardsOfferData it = (RewardsOfferData) obj6;
                                                switch (i2) {
                                                    case 0:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersEpoxyController3.viewModel.L4(((ProductOfferTile.DataTile) productOfferTile3).c.b);
                                                        break;
                                                    default:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersEpoxyController3.viewModel.Z(((ProductOfferTile.DataTile) productOfferTile3).c.b);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(rewardsOffersEpoxyController3);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        objG2 = new Function2() { // from class: au.com.woolworths.feature.rewards.offers.g
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                RewardsOfferData offer = (RewardsOfferData) obj6;
                                                ContentCta cta = (ContentCta) obj7;
                                                Intrinsics.h(offer, "offer");
                                                Intrinsics.h(cta, "cta");
                                                rewardsOffersEpoxyController3.viewModel.p2(offer, cta);
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    Function2 function2 = (Function2) objG2;
                                    composer2.l();
                                    composer2.o(-1633490746);
                                    boolean zI3 = composer2.I(rewardsOffersEpoxyController3) | composer2.n(productOfferTile3);
                                    Object objG3 = composer2.G();
                                    if (zI3 || objG3 == obj5) {
                                        final int i3 = 1;
                                        objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.f
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                RewardsOfferData it = (RewardsOfferData) obj6;
                                                switch (i3) {
                                                    case 0:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersEpoxyController3.viewModel.L4(((ProductOfferTile.DataTile) productOfferTile3).c.b);
                                                        break;
                                                    default:
                                                        Intrinsics.h(it, "it");
                                                        rewardsOffersEpoxyController3.viewModel.Z(((ProductOfferTile.DataTile) productOfferTile3).c.b);
                                                        break;
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    RewardsOfferTileKt.h(rewardsOfferData, statefulButtonStateA, function1, function2, (Function1) objG3, null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 96);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 908134291));
        }
        ViewCompat.A(view.f13309a.h, rewardsOffersEpoxyController.offerTileAccessibilityDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductOfferCarousel$lambda$23$lambda$22(RewardsOffersEpoxyController rewardsOffersEpoxyController, ItemRewardsProductOfferTileBindingModel_ itemRewardsProductOfferTileBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 4) {
            rewardsOffersEpoxyController.viewModel.w6(itemRewardsProductOfferTileBindingModel_.p.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductOfferCarousel$lambda$27(int i, List productOffers, final RewardsOffersEpoxyController rewardsOffersEpoxyController, ProductOffersCarouselModel_ productOffersCarouselModel_, ProductOffersCarousel productOffersCarousel, int i2) {
        productOffersCarousel.getClass();
        Intrinsics.h(productOffers, "productOffers");
        productOffersCarousel.post(new androidx.media3.exoplayer.drm.b(productOffersCarousel, i, productOffers));
        productOffersCarousel.setOnSwipeStarted(new Function0() { // from class: au.com.woolworths.feature.rewards.offers.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOffersEpoxyController.buildProductOfferCarousel$lambda$27$lambda$26$lambda$24(this.d);
            }
        });
        productOffersCarousel.setOnSwipeEnded(new c(rewardsOffersEpoxyController, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildProductOfferCarousel$lambda$27$lambda$26$lambda$24(RewardsOffersEpoxyController rewardsOffersEpoxyController) {
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
        if (!rewardsOffersViewModelLegacy.q) {
            rewardsOffersViewModelLegacy.q = true;
            rewardsOffersViewModelLegacy.h.c(RewardsOffersListActionData.j);
        }
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildProductOfferCarousel$lambda$27$lambda$26$lambda$25(RewardsOffersEpoxyController rewardsOffersEpoxyController, boolean z) {
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
        if (!rewardsOffersViewModelLegacy.r && z) {
            rewardsOffersViewModelLegacy.r = true;
            rewardsOffersViewModelLegacy.h.c(RewardsOffersListActionData.k);
        }
        return Unit.f24250a;
    }

    private final void buildSectionTitle(RewardsOfferFilterData filters, OfferSectionViewItem section, String title, String ctaText, int offerCount, boolean isCtaInProgress, @DimenRes int paddingBottomRes) {
        if (shouldShowSectionTitle(filters, section.getB())) {
            String strQ = StringsKt.Q(title, OFFER_COUNT_PLACEHOLDER, String.valueOf(offerCount), false);
            ItemRewardsOfferSectionTitleBindingModel_ itemRewardsOfferSectionTitleBindingModel_ = new ItemRewardsOfferSectionTitleBindingModel_();
            itemRewardsOfferSectionTitleBindingModel_.M("rewards_section_".concat(title));
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.n = section;
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.o = strQ;
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.p = ctaText;
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.q = isCtaInProgress;
            RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = this.viewModel;
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.r = rewardsOffersViewModelLegacy;
            Float fValueOf = Float.valueOf(this.context.getResources().getDimension(paddingBottomRes));
            itemRewardsOfferSectionTitleBindingModel_.t();
            itemRewardsOfferSectionTitleBindingModel_.s = fValueOf;
            add(itemRewardsOfferSectionTitleBindingModel_);
        }
    }

    private final void buildSpinSurpriseBannerIfFeatureEnabled(SpinSurpriseBannerViewItem banner) {
        ItemSpinSurpriseBannerBindingModel_ itemSpinSurpriseBannerBindingModel_ = new ItemSpinSurpriseBannerBindingModel_();
        itemSpinSurpriseBannerBindingModel_.M("spin_surprise_banner_".concat(banner.b));
        itemSpinSurpriseBannerBindingModel_.t();
        itemSpinSurpriseBannerBindingModel_.o = banner;
        au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = new au.com.woolworths.feature.rewards.card.overlay.ui.b(8, this, banner);
        itemSpinSurpriseBannerBindingModel_.t();
        itemSpinSurpriseBannerBindingModel_.p = bVar;
        androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(17, this, banner);
        itemSpinSurpriseBannerBindingModel_.t();
        itemSpinSurpriseBannerBindingModel_.n = eVar;
        add(itemSpinSurpriseBannerBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSpinSurpriseBannerIfFeatureEnabled$lambda$12$lambda$10(RewardsOffersEpoxyController rewardsOffersEpoxyController, SpinSurpriseBannerViewItem banner) {
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
        rewardsOffersViewModelLegacy.getClass();
        Intrinsics.h(banner, "banner");
        rewardsOffersViewModelLegacy.l.f(new RewardsOffersContractLegacy.Actions.OpenUrl(banner.d));
        rewardsOffersViewModelLegacy.h.j(RewardsOffersListActionData.m, TrackingMetadata.Companion.a(TrackableValue.m, banner.b));
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildSpinSurpriseBannerIfFeatureEnabled$lambda$12$lambda$11(RewardsOffersEpoxyController rewardsOffersEpoxyController, SpinSurpriseBannerViewItem banner, ItemSpinSurpriseBannerBindingModel_ itemSpinSurpriseBannerBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 4) {
            RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
            rewardsOffersViewModelLegacy.getClass();
            Intrinsics.h(banner, "banner");
            if (rewardsOffersViewModelLegacy.o.add(banner.getB())) {
                rewardsOffersViewModelLegacy.h.j(RewardsOffersListActionData.l, TrackingMetadata.Companion.a(TrackableValue.m, banner.b));
            }
        }
    }

    private final void buildStandardBanner(RewardsOfferFilterData filter, StandardBannerViewItem banner) {
        Object next;
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = this.viewModel;
        String sectionId = banner.b;
        rewardsOffersViewModelLegacy.getClass();
        Intrinsics.h(sectionId, "sectionId");
        boolean z = false;
        if (filter != null) {
            Iterable iterable = (Iterable) filter.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof BannerSectionConfig) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (sectionId.equals(((BannerSectionConfig) next).f6269a)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BannerSectionConfig bannerSectionConfig = (BannerSectionConfig) next;
            if (bannerSectionConfig != null) {
                z = bannerSectionConfig.b;
            }
        }
        if (z) {
            ItemStandardBannerBindingModel_ itemStandardBannerBindingModel_ = new ItemStandardBannerBindingModel_();
            itemStandardBannerBindingModel_.M("standard_banner_" + banner.b);
            itemStandardBannerBindingModel_.t();
            itemStandardBannerBindingModel_.p = banner;
            a aVar = new a(banner);
            itemStandardBannerBindingModel_.t();
            itemStandardBannerBindingModel_.n = aVar;
            c cVar = new c(this, 0);
            itemStandardBannerBindingModel_.t();
            itemStandardBannerBindingModel_.q = cVar;
            androidx.camera.camera2.interop.e eVar = new androidx.camera.camera2.interop.e(18, this, banner);
            itemStandardBannerBindingModel_.t();
            itemStandardBannerBindingModel_.o = eVar;
            add(itemStandardBannerBindingModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildStandardBanner$lambda$9$lambda$6(StandardBannerViewItem standardBannerViewItem, ItemStandardBannerBindingModel_ itemStandardBannerBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        View view = dataBindingHolder.f13309a.h;
        String str = standardBannerViewItem.h;
        if (str == null) {
            str = "";
        }
        ViewCompat.A(view, new StandardBannerAccessibilityDelegate(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildStandardBanner$lambda$9$lambda$7(RewardsOffersEpoxyController rewardsOffersEpoxyController, StandardBannerViewItem standardBannerViewItem) {
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
        Intrinsics.e(standardBannerViewItem);
        rewardsOffersViewModelLegacy.getClass();
        String str = standardBannerViewItem.f;
        if (str != null) {
            rewardsOffersViewModelLegacy.l.f(new RewardsOffersContractLegacy.Actions.OpenUrl(str));
        }
        AnalyticsManager analyticsManager = rewardsOffersViewModelLegacy.h;
        RewardsOffersListActionData rewardsOffersListActionData = RewardsOffersListActionData.f;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, str == null ? "" : str);
        TrackableValue trackableValue = TrackableValue.h0;
        if (str == null) {
            str = "";
        }
        trackingMetadataA.b(trackableValue, str);
        analyticsManager.j(rewardsOffersListActionData, trackingMetadataA);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildStandardBanner$lambda$9$lambda$8(RewardsOffersEpoxyController rewardsOffersEpoxyController, StandardBannerViewItem banner, ItemStandardBannerBindingModel_ itemStandardBannerBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        if (i == 4) {
            RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = rewardsOffersEpoxyController.viewModel;
            rewardsOffersViewModelLegacy.getClass();
            Intrinsics.h(banner, "banner");
            if (rewardsOffersViewModelLegacy.o.add(banner.getB())) {
                rewardsOffersViewModelLegacy.h.j(RewardsOffersListActionData.g, TrackingMetadata.Companion.a(TrackableValue.n, banner.c));
            }
        }
    }

    private final void filterAndBuildSpinSurpriseBanners(List<? extends SectionViewItem> list, RewardsOfferFilterData rewardsOfferFilterData) {
        Iterator it = CollectionsKt.A(list, SpinSurpriseBannerViewItem.class).iterator();
        while (it.hasNext()) {
            buildSpinSurpriseBannerIfFeatureEnabled((SpinSurpriseBannerViewItem) it.next());
        }
    }

    private final void filterAndBuildStandardBanners(List<? extends SectionViewItem> list, RewardsOfferFilterData rewardsOfferFilterData) {
        Iterator it = CollectionsKt.A(list, StandardBannerViewItem.class).iterator();
        while (it.hasNext()) {
            buildStandardBanner(rewardsOfferFilterData, (StandardBannerViewItem) it.next());
        }
    }

    private final List<OfferViewItem> filterBy(List<OfferViewItem> list, RewardsOfferFilterData rewardsOfferFilterData) {
        if (rewardsOfferFilterData == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (rewardsOfferFilterData.c.contains(((OfferViewItem) obj).b.d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int maxRowCount(ProductSectionViewItem productSectionViewItem) {
        return Math.min(productSectionViewItem.i.size(), 2);
    }

    private final void setTraversals() {
        int i = 0;
        for (Object obj : this.productOfferTiles) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            View view = (View) obj;
            if (i > 0) {
                view.setAccessibilityTraversalAfter(this.productOfferTiles.get(i - 1).getId());
            }
            if (i < this.productOfferTiles.size() - 1) {
                view.setAccessibilityTraversalBefore(this.productOfferTiles.get(i2).getId());
            }
            i = i2;
        }
    }

    private final boolean shouldShowActivateAllButton(ProductSectionViewItem section) {
        List listC = SectionViewItemExtKt.c(section);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (((OfferViewItem) it.next()).b.n == RewardsOfferStatus.NOT_ACTIVATED) {
                return true;
            }
        }
        return false;
    }

    private final boolean shouldShowSectionTitle(RewardsOfferFilterData filters, String sectionId) {
        Object next;
        if (filters == null) {
            return true;
        }
        Iterable iterable = (Iterable) filters.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof OffersSectionConfig) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((OffersSectionConfig) next).f6278a.equals(sectionId)) {
                break;
            }
        }
        OffersSectionConfig offersSectionConfig = (OffersSectionConfig) next;
        Boolean boolValueOf = offersSectionConfig != null ? Boolean.valueOf(offersSectionConfig.b) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    private final List<ProductOfferTile> toProductOfferTiles(ProductSectionViewItem productSectionViewItem, int i, boolean z) {
        int size = productSectionViewItem.i.size() % i;
        int i2 = size != 0 ? i - size : 0;
        String str = z ? productSectionViewItem.f : productSectionViewItem.e;
        if (str == null) {
            str = "";
        }
        List list = productSectionViewItem.i;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductOfferTile.DataTile(str, (OfferViewItem) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList2.add(new ProductOfferTile.EmptyTile(str));
        }
        return CollectionsKt.c0(arrayList2, arrayList);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull RewardsOffersContractLegacy.ViewState viewState) {
        ArrayList<SectionViewItem> arrayList;
        Intrinsics.h(viewState, "viewState");
        RewardsOffersMessage rewardsOffersMessage = viewState.d;
        Set set = viewState.e;
        List<? extends SectionViewItem> list = viewState.c;
        RewardsOfferFilterData rewardsOfferFilterData = viewState.f;
        if (list != null) {
            List<? extends SectionViewItem> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (Object objC : list2) {
                if (objC instanceof OfferSectionViewItem) {
                    OfferSectionViewItem offerSectionViewItem = (OfferSectionViewItem) objC;
                    if (offerSectionViewItem instanceof ProductSectionViewItem) {
                        ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) offerSectionViewItem;
                        objC = ProductSectionViewItem.c(productSectionViewItem, false, buildModels$lambda$1$lambda$0(this, rewardsOfferFilterData, productSectionViewItem.i), 191);
                    } else {
                        if (!(offerSectionViewItem instanceof StandardSectionViewItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) offerSectionViewItem;
                        objC = StandardSectionViewItem.c(standardSectionViewItem, false, buildModels$lambda$1$lambda$0(this, rewardsOfferFilterData, standardSectionViewItem.f), 7);
                    }
                }
                arrayList.add(objC);
            }
        } else {
            arrayList = null;
        }
        List listD = arrayList != null ? SectionViewItemExtKt.d(SectionViewItemExtKt.b(arrayList)) : null;
        if (set != null && (!set.isEmpty())) {
            RewardsOffersViewModelLegacy clickHandler = this.viewModel;
            Intrinsics.h(clickHandler, "clickHandler");
            Set<RewardsOfferFilterData> set2 = set;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(set2, 10));
            for (RewardsOfferFilterData rewardsOfferFilterData2 : set2) {
                ItemRewardsOffersFilterBindingModel_ itemRewardsOffersFilterBindingModel_ = new ItemRewardsOffersFilterBindingModel_();
                itemRewardsOffersFilterBindingModel_.M("chip_item_".concat(rewardsOfferFilterData2.b));
                itemRewardsOffersFilterBindingModel_.t();
                itemRewardsOffersFilterBindingModel_.o = rewardsOfferFilterData2;
                Boolean boolValueOf = Boolean.valueOf(rewardsOfferFilterData2.f6288a.equals(rewardsOfferFilterData != null ? rewardsOfferFilterData.f6288a : null));
                itemRewardsOffersFilterBindingModel_.t();
                itemRewardsOffersFilterBindingModel_.n = boolValueOf;
                itemRewardsOffersFilterBindingModel_.t();
                itemRewardsOffersFilterBindingModel_.p = clickHandler;
                arrayList2.add(itemRewardsOffersFilterBindingModel_);
            }
            EpoxyModel<?> rewardsOfferListFiltersGroup = new RewardsOfferListFiltersGroup(com.woolworths.R.layout.item_rewards_offers_filter_group, arrayList2);
            rewardsOfferListFiltersGroup.p("filters_group");
            addInternal(rewardsOfferListFiltersGroup);
        }
        if (listD != null && (!listD.isEmpty())) {
            for (SectionViewItem sectionViewItem : arrayList) {
                if (sectionViewItem instanceof StandardBannerViewItem) {
                    buildStandardBanner(rewardsOfferFilterData, (StandardBannerViewItem) sectionViewItem);
                } else if (sectionViewItem instanceof SpinSurpriseBannerViewItem) {
                    buildSpinSurpriseBannerIfFeatureEnabled((SpinSurpriseBannerViewItem) sectionViewItem);
                } else if (!(sectionViewItem instanceof RewardsCtaCardViewItem) && !(sectionViewItem instanceof MandyBannerViewItem) && !(sectionViewItem instanceof NoOffersCardViewItem)) {
                    if (sectionViewItem instanceof OfferSectionViewItem) {
                        buildOfferSection(rewardsOfferFilterData, (OfferSectionViewItem) sectionViewItem);
                    } else if (!(sectionViewItem instanceof PersonalisedOffersBannerViewItem) && !(sectionViewItem instanceof OfferFeedInlineBannerViewItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return;
        }
        if (listD != null && listD.isEmpty() && rewardsOfferFilterData != null) {
            filterAndBuildSpinSurpriseBanners(list, rewardsOfferFilterData);
            filterAndBuildStandardBanners(list, rewardsOfferFilterData);
            ItemRewardsOffersFilterNoOffersBindingModel_ itemRewardsOffersFilterNoOffersBindingModel_ = new ItemRewardsOffersFilterNoOffersBindingModel_();
            itemRewardsOffersFilterNoOffersBindingModel_.M();
            RewardsEmptyStateData rewardsEmptyStateDataA = RewardsOffersMessageExtKt.a(rewardsOfferFilterData.d);
            itemRewardsOffersFilterNoOffersBindingModel_.t();
            itemRewardsOffersFilterNoOffersBindingModel_.o = rewardsEmptyStateDataA;
            k kVar = new k(11);
            itemRewardsOffersFilterNoOffersBindingModel_.t();
            itemRewardsOffersFilterNoOffersBindingModel_.n = kVar;
            add(itemRewardsOffersFilterNoOffersBindingModel_);
            return;
        }
        if (list == null || !SectionViewItemExtKt.d(SectionViewItemExtKt.b(list)).isEmpty() || rewardsOffersMessage == null) {
            return;
        }
        filterAndBuildSpinSurpriseBanners(list, rewardsOfferFilterData);
        filterAndBuildStandardBanners(list, rewardsOfferFilterData);
        ItemRewardsOfferEmptyStateFullBindingModel_ itemRewardsOfferEmptyStateFullBindingModel_ = new ItemRewardsOfferEmptyStateFullBindingModel_();
        itemRewardsOfferEmptyStateFullBindingModel_.M();
        RewardsEmptyStateData rewardsEmptyStateDataA2 = RewardsOffersMessageExtKt.a(rewardsOffersMessage);
        itemRewardsOfferEmptyStateFullBindingModel_.t();
        itemRewardsOfferEmptyStateFullBindingModel_.n = rewardsEmptyStateDataA2;
        add(itemRewardsOfferEmptyStateFullBindingModel_);
    }

    public final void dismissBanner(@NotNull String bannerId) {
        Intrinsics.h(bannerId, "bannerId");
        this.dismissedBannerIds.add(bannerId);
        setData(getCurrentData());
    }
}
