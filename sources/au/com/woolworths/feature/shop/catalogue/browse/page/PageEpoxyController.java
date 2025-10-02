package au.com.woolworths.feature.shop.catalogue.browse.page;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseAction;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowsePageErrorState;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageKt;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.LoadingPageEpoxyModelModel_;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.PagingErrorEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModelModel_;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Be\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0014J\u001e\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010 \u001a\u00020\b2\u0010\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\"H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\u0018\u0010$\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0014H\u0002R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/PageEpoxyController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "productCardClickHandler", "Lkotlin/Function2;", "Lau/com/woolworths/product/models/ProductCard;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Category;", "", "categoryPageButtonHandler", "Lkotlin/Function1;", "promotionCardClickHandler", "promotionsPageButtonHandler", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;)V", "pagingFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "error", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowsePageErrorState;", "totalNumberOfPages", "setError", "setError$catalogue_release", "onPageSelected", "page", "buildItemModel", "Lcom/airbnb/epoxy/EpoxyModel;", "currentPosition", "item", "addModels", "models", "", "onSecondaryActionClicked", "trackPageImpression", "products", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PageEpoxyController extends PagingDataEpoxyController<BrowsePage> implements FullPageErrorStateClickHandler {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final Function1<BrowsePage.Category, Unit> categoryPageButtonHandler;

    @Nullable
    private CatalogueBrowsePageErrorState error;

    @NotNull
    private final MutableStateFlow<Integer> pagingFlow;

    @NotNull
    private final Function2<ProductCard, BrowsePage.Category, Unit> productCardClickHandler;

    @NotNull
    private final Function1<ProductCard, Unit> promotionCardClickHandler;

    @NotNull
    private final Function1<BrowsePage.Promotion, Unit> promotionsPageButtonHandler;
    private int totalNumberOfPages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageEpoxyController(@NotNull Function2<? super ProductCard, ? super BrowsePage.Category, Unit> productCardClickHandler, @NotNull Function1<? super BrowsePage.Category, Unit> categoryPageButtonHandler, @NotNull Function1<? super ProductCard, Unit> promotionCardClickHandler, @NotNull Function1<? super BrowsePage.Promotion, Unit> promotionsPageButtonHandler, @NotNull AnalyticsManager analyticsManager) {
        super(null, null, null, 7, null);
        Intrinsics.h(productCardClickHandler, "productCardClickHandler");
        Intrinsics.h(categoryPageButtonHandler, "categoryPageButtonHandler");
        Intrinsics.h(promotionCardClickHandler, "promotionCardClickHandler");
        Intrinsics.h(promotionsPageButtonHandler, "promotionsPageButtonHandler");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.productCardClickHandler = productCardClickHandler;
        this.categoryPageButtonHandler = categoryPageButtonHandler;
        this.promotionCardClickHandler = promotionCardClickHandler;
        this.promotionsPageButtonHandler = promotionsPageButtonHandler;
        this.analyticsManager = analyticsManager;
        this.pagingFlow = StateFlowKt.a(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildItemModel$lambda$1(PageEpoxyController pageEpoxyController, BrowsePage browsePage, ProductCard productCard) {
        Function2<ProductCard, BrowsePage.Category, Unit> function2 = pageEpoxyController.productCardClickHandler;
        Intrinsics.e(productCard);
        function2.invoke(productCard, browsePage);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildItemModel$lambda$2(PageEpoxyController pageEpoxyController, BrowsePage.Category category, Integer num) {
        Intrinsics.e(category);
        Intrinsics.e(num);
        pageEpoxyController.trackPageImpression(category, num.intValue());
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildItemModel$lambda$5$lambda$3(PageEpoxyController pageEpoxyController, ProductCard productCard) {
        Function1<ProductCard, Unit> function1 = pageEpoxyController.promotionCardClickHandler;
        Intrinsics.e(productCard);
        function1.invoke(productCard);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildItemModel$lambda$5$lambda$4(PageEpoxyController pageEpoxyController, BrowsePage browsePage, BrowsePage.Promotion promotion) {
        pageEpoxyController.promotionsPageButtonHandler.invoke(browsePage);
        return Unit.f24250a;
    }

    private final void trackPageImpression(BrowsePage.Category page, int products) {
        AnalyticsManager analyticsManager = this.analyticsManager;
        AnalyticsAction analyticsAction = CatalogueBrowseAction.e;
        TrackingMetadata trackingMetadataA = BrowsePageKt.a(page);
        trackingMetadataA.b(TrackableValue.R1, Integer.valueOf(products));
        analyticsManager.j(analyticsAction, trackingMetadataA);
    }

    @Override // com.airbnb.epoxy.paging3.PagingDataEpoxyController
    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        CatalogueBrowsePageErrorState catalogueBrowsePageErrorState = this.error;
        if (catalogueBrowsePageErrorState == null) {
            if (this.totalNumberOfPages <= models.size()) {
                super.addModels(models);
                return;
            }
            ArrayList arrayListJ0 = CollectionsKt.J0(models);
            LoadingPageEpoxyModelModel_ loadingPageEpoxyModelModel_ = new LoadingPageEpoxyModelModel_();
            loadingPageEpoxyModelModel_.C("page-" + models.size());
            arrayListJ0.add(loadingPageEpoxyModelModel_);
            super.addModels(arrayListJ0);
            return;
        }
        ArrayList arrayListJ02 = CollectionsKt.J0(models);
        PagingErrorEpoxyModel_ pagingErrorEpoxyModel_ = new PagingErrorEpoxyModel_();
        pagingErrorEpoxyModel_.K("page-" + models.size());
        pagingErrorEpoxyModel_.t();
        pagingErrorEpoxyModel_.n = catalogueBrowsePageErrorState;
        pagingErrorEpoxyModel_.t();
        pagingErrorEpoxyModel_.o = this;
        arrayListJ02.add(pagingErrorEpoxyModel_);
        super.addModels(arrayListJ02);
    }

    public final void onPageSelected(int page) {
        this.pagingFlow.f(Integer.valueOf(page));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public /* bridge */ /* synthetic */ void onPrimaryActionClicked() {
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public void onSecondaryActionClicked() {
        retry();
    }

    public final void setError$catalogue_release(@Nullable CatalogueBrowsePageErrorState error) {
        this.error = error;
        if (error != null) {
            requestModelBuild();
        }
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [au.com.woolworths.feature.shop.catalogue.browse.page.a] */
    /* JADX WARN: Type inference failed for: r6v6, types: [au.com.woolworths.feature.shop.catalogue.browse.page.a] */
    @Override // com.airbnb.epoxy.paging3.PagingDataEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable final BrowsePage item) {
        if (item == null) {
            throw new IllegalArgumentException("item can't be null");
        }
        if (item instanceof BrowsePage.Category) {
            BrowsePage.Category category = (BrowsePage.Category) item;
            this.totalNumberOfPages = category.f;
            CategoryPageEpoxyModel_ categoryPageEpoxyModel_ = new CategoryPageEpoxyModel_();
            categoryPageEpoxyModel_.n = 1;
            categoryPageEpoxyModel_.N("page-" + currentPosition);
            categoryPageEpoxyModel_.t();
            categoryPageEpoxyModel_.o = category;
            final int i = 0;
            ?? r6 = new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.a
                public final /* synthetic */ PageEpoxyController e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            return PageEpoxyController.buildItemModel$lambda$1(this.e, item, (ProductCard) obj);
                        default:
                            return PageEpoxyController.buildItemModel$lambda$5$lambda$4(this.e, item, (BrowsePage.Promotion) obj);
                    }
                }
            };
            categoryPageEpoxyModel_.t();
            categoryPageEpoxyModel_.p = r6;
            Function1<BrowsePage.Category, Unit> function1 = this.categoryPageButtonHandler;
            categoryPageEpoxyModel_.t();
            categoryPageEpoxyModel_.q = function1;
            e eVar = new e(this, 20);
            categoryPageEpoxyModel_.t();
            categoryPageEpoxyModel_.r = eVar;
            return categoryPageEpoxyModel_;
        }
        if (!(item instanceof BrowsePage.Promotion)) {
            throw new NoWhenBranchMatchedException();
        }
        BrowsePage.Promotion promotion = (BrowsePage.Promotion) item;
        this.totalNumberOfPages = promotion.f;
        PromotionPageEpoxyModelModel_ promotionPageEpoxyModelModel_ = new PromotionPageEpoxyModelModel_();
        promotionPageEpoxyModelModel_.C("page-" + currentPosition);
        BitSet bitSet = promotionPageEpoxyModelModel_.n;
        bitSet.set(0);
        promotionPageEpoxyModelModel_.t();
        promotionPageEpoxyModelModel_.o = promotion;
        l lVar = new l(this, 14);
        promotionPageEpoxyModelModel_.t();
        promotionPageEpoxyModelModel_.q = lVar;
        final int i2 = 1;
        ?? r62 = new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.a
            public final /* synthetic */ PageEpoxyController e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        return PageEpoxyController.buildItemModel$lambda$1(this.e, item, (ProductCard) obj);
                    default:
                        return PageEpoxyController.buildItemModel$lambda$5$lambda$4(this.e, item, (BrowsePage.Promotion) obj);
                }
            }
        };
        promotionPageEpoxyModelModel_.t();
        promotionPageEpoxyModelModel_.r = r62;
        MutableStateFlow<Integer> mutableStateFlow = this.pagingFlow;
        if (mutableStateFlow == null) {
            throw new IllegalArgumentException("pagingFlow cannot be null");
        }
        bitSet.set(1);
        promotionPageEpoxyModelModel_.t();
        promotionPageEpoxyModelModel_.p = mutableStateFlow;
        return promotionPageEpoxyModelModel_;
    }
}
