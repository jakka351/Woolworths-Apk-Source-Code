package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.marketplace.ItemMarketplaceErrorBindingModel_;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceHorizontalList;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalisedSegment;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePromotionSegment;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.promotion.banner.ItemPromotionBannerBindingModel_;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0014J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0002H\u0002J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0003H\u0002J\u0014\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0013\u001a\u00020\u000e*\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0004H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedEpoxyController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "Lau/com/woolworths/feature/shop/marketplace/data/models/InfoHeader;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePersonalised;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceErrorState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedViewModel;", "productCardConfig", "Lau/com/woolworths/product/models/ProductCardConfig;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "<init>", "(Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedViewModel;Lau/com/woolworths/product/models/ProductCardConfig;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "buildModels", "", "infoHeader", "personalised", "errorState", "buildUi", "build", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePromotionSegment;", "index", "", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceHorizontalList;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplacePersonalisedEpoxyController extends Typed3EpoxyController<InfoHeader, MarketplacePersonalised, MarketplaceErrorState> {
    public static final int $stable = 8;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    @NotNull
    private final MarketplacePersonalisedViewModel listener;

    @NotNull
    private final ProductCardConfig productCardConfig;

    public MarketplacePersonalisedEpoxyController(@NotNull MarketplacePersonalisedViewModel listener, @NotNull ProductCardConfig productCardConfig, @NotNull FeatureToggleManager featureToggleManager) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(productCardConfig, "productCardConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.listener = listener;
        this.productCardConfig = productCardConfig;
        this.featureToggleManager = featureToggleManager;
    }

    private final void build(final MarketplaceHorizontalList marketplaceHorizontalList, int i) {
        final boolean zC = this.featureToggleManager.c(ProductFeature.e);
        ComposeInteropKt.a(this, YU.a.d(i, "carousel_"), new Object[]{marketplaceHorizontalList}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedEpoxyController.build.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final MarketplaceHorizontalList marketplaceHorizontalList2 = marketplaceHorizontalList;
                    final boolean z = zC;
                    final MarketplacePersonalisedEpoxyController marketplacePersonalisedEpoxyController = MarketplacePersonalisedEpoxyController.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(99266640, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedEpoxyController.build.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                MarketplacePersonalisedEpoxyController marketplacePersonalisedEpoxyController2 = marketplacePersonalisedEpoxyController;
                                ProductCardConfig productCardConfig = marketplacePersonalisedEpoxyController2.productCardConfig;
                                MarketplaceHorizontalList marketplaceHorizontalList3 = marketplaceHorizontalList2;
                                String str = marketplaceHorizontalList3.d;
                                String str2 = marketplaceHorizontalList3.e;
                                List list = marketplaceHorizontalList3.h;
                                composer2.o(1849434622);
                                Object objG = composer2.G();
                                if (objG == Composer.Companion.f1624a) {
                                    objG = new h(20);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                MarketplaceProductCarouselUiKt.a(productCardConfig, str, str2, null, list, (Function0) objG, marketplacePersonalisedEpoxyController2.listener, z, composer2, ProductCardConfig.$stable | 199680);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1923876248));
    }

    private final void buildUi(MarketplacePersonalised marketplacePersonalised) {
        int i = 0;
        for (Object obj : marketplacePersonalised.c) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            MarketplacePersonalisedSegment marketplacePersonalisedSegment = (MarketplacePersonalisedSegment) obj;
            if (marketplacePersonalisedSegment instanceof MarketplaceHorizontalList) {
                build((MarketplaceHorizontalList) marketplacePersonalisedSegment, i);
            } else if (marketplacePersonalisedSegment instanceof MarketplacePromotionSegment) {
                build((MarketplacePromotionSegment) marketplacePersonalisedSegment, i);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$1$lambda$0(MarketplacePersonalisedEpoxyController marketplacePersonalisedEpoxyController, InfoHeader infoHeader) {
        marketplacePersonalisedEpoxyController.listener.r6(infoHeader.c);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public void buildModels(@Nullable InfoHeader infoHeader, @Nullable MarketplacePersonalised personalised, @Nullable MarketplaceErrorState errorState) {
        if (errorState != null) {
            buildUi(errorState);
            return;
        }
        if (infoHeader != null) {
            buildUi(infoHeader);
        }
        if (personalised != null) {
            buildUi(personalised);
        }
    }

    private final void buildUi(InfoHeader infoHeader) {
        String str = infoHeader.b;
        if (str == null || infoHeader.c == null) {
            return;
        }
        HowItWorksCardViewModel_ howItWorksCardViewModel_ = new HowItWorksCardViewModel_();
        howItWorksCardViewModel_.C("how_it_works_" + str.hashCode());
        howItWorksCardViewModel_.n.set(0);
        howItWorksCardViewModel_.t();
        howItWorksCardViewModel_.o = str;
        n nVar = new n(18, this, infoHeader);
        howItWorksCardViewModel_.t();
        howItWorksCardViewModel_.p = nVar;
        add(howItWorksCardViewModel_);
    }

    private final void build(final MarketplacePromotionSegment marketplacePromotionSegment, int i) {
        ItemPromotionBannerBindingModel_ itemPromotionBannerBindingModel_ = new ItemPromotionBannerBindingModel_();
        itemPromotionBannerBindingModel_.M("promo_banner_" + i + "}");
        InsetBannerData insetBannerData = marketplacePromotionSegment.d.f9341a;
        itemPromotionBannerBindingModel_.t();
        itemPromotionBannerBindingModel_.n = insetBannerData;
        InsetBannerClickListener insetBannerClickListener = new InsetBannerClickListener() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedEpoxyController$build$1$1
            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
            public final void onActionClicked(InsetBanner insetBanner) {
                Intrinsics.h(insetBanner, "insetBanner");
                this.d.listener.z3(marketplacePromotionSegment.d);
            }
        };
        itemPromotionBannerBindingModel_.t();
        itemPromotionBannerBindingModel_.o = insetBannerClickListener;
        add(itemPromotionBannerBindingModel_);
    }

    private final void buildUi(MarketplaceErrorState marketplaceErrorState) {
        ItemMarketplaceErrorBindingModel_ itemMarketplaceErrorBindingModel_ = new ItemMarketplaceErrorBindingModel_();
        itemMarketplaceErrorBindingModel_.M();
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.n = marketplaceErrorState;
        MarketplacePersonalisedViewModel marketplacePersonalisedViewModel = this.listener;
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.o = marketplacePersonalisedViewModel;
        add(itemMarketplaceErrorBindingModel_);
    }
}
