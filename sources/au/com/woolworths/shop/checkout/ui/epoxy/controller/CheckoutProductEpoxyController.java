package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import android.widget.CompoundButton;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.epoxy.GenericInlineErrorStateEpoxyModel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.product.details.b;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.checkout.ItemCheckoutCampaignBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutCampaignHeaderBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutMarketProductBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutMarketSellerGroupBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutProductBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutProductMessageBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutProductsHeaderBindingModel_;
import au.com.woolworths.shop.checkout.data.mappers.CheckoutBannerKt;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutCampaignBinding;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError;
import au.com.woolworths.shop.checkout.domain.model.CheckoutMarketProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaigns;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerGroup;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutProductSubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution_;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode_;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutSubstitutesRowKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ItemCheckoutProductKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ProductMessageRowKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ProductSubstituteRowKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ShopperNoteKt;
import au.com.woolworths.shop.checkout.ui.components.compose.SubstitutionOnboardingBannerKt;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentData;
import au.com.woolworths.shop.checkout.ui.epoxy.view.EditOrderBannerEpoxyView;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020'H\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010'H\u0002J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/controller/CheckoutProductEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentData;", "checkoutProductListener", "Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductListener;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "bannerDismissInteractor", "Lau/com/woolworths/feature/shop/banners/broadcastbanner/BannerDismissInteractor;", "cmoBannerEventHandler", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "<init>", "(Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductListener;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Lau/com/woolworths/feature/shop/banners/broadcastbanner/BannerDismissInteractor;Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;)V", "buildModels", "", "data", "buildUi", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutInlineError;", "index", "", "buildPromotionCode", "promotionCode", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromotionCode;", "buildCheckoutProducts", "checkoutProducts", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutProducts;", "buildCheckoutProductWithCompose", "product", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutProduct;", "buildShopperNoteWithCompose", "buildCheckoutSubstitutesWithCompose", "buildCheckoutProductCampaigns", "campaigns", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductCampaigns;", "buildMarketProducts", "marketProducts", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutMarketProducts;", "buildSubstitutionOnboardingBanner", "bannerDate", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "onSubstitutionOnboardingBannerDismiss", "bannerData", "hasSubstitutionOnboardingBannerDismissed", "", "buildCmoBanner", "shouldShowCmoBanner", "eventHandler", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutProductEpoxyController extends TypedEpoxyController<CheckoutContentData> {
    public static final int $stable = 8;

    @NotNull
    private final BannerDismissInteractor bannerDismissInteractor;

    @NotNull
    private final CheckoutProductListener checkoutProductListener;

    @NotNull
    private final EditOrderEventHandler cmoBannerEventHandler;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    public CheckoutProductEpoxyController(@NotNull CheckoutProductListener checkoutProductListener, @NotNull FeatureToggleManager featureToggleManager, @NotNull BannerDismissInteractor bannerDismissInteractor, @NotNull EditOrderEventHandler cmoBannerEventHandler) {
        Intrinsics.h(checkoutProductListener, "checkoutProductListener");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(bannerDismissInteractor, "bannerDismissInteractor");
        Intrinsics.h(cmoBannerEventHandler, "cmoBannerEventHandler");
        this.checkoutProductListener = checkoutProductListener;
        this.featureToggleManager = featureToggleManager;
        this.bannerDismissInteractor = bannerDismissInteractor;
        this.cmoBannerEventHandler = cmoBannerEventHandler;
    }

    private final void buildCheckoutProductCampaigns(CheckoutProductCampaigns campaigns) {
        ItemCheckoutCampaignHeaderBindingModel_ itemCheckoutCampaignHeaderBindingModel_ = new ItemCheckoutCampaignHeaderBindingModel_();
        itemCheckoutCampaignHeaderBindingModel_.M();
        add(itemCheckoutCampaignHeaderBindingModel_);
        for (CheckoutProductCampaign checkoutProductCampaign : campaigns.f10568a) {
            ItemCheckoutCampaignBindingModel_ itemCheckoutCampaignBindingModel_ = new ItemCheckoutCampaignBindingModel_();
            itemCheckoutCampaignBindingModel_.M("campaign_opt_toggle_id_" + checkoutProductCampaign.d);
            itemCheckoutCampaignBindingModel_.t();
            itemCheckoutCampaignBindingModel_.o = checkoutProductCampaign;
            CheckoutProductListener checkoutProductListener = this.checkoutProductListener;
            itemCheckoutCampaignBindingModel_.t();
            itemCheckoutCampaignBindingModel_.p = checkoutProductListener;
            b bVar = new b(2, checkoutProductCampaign, this);
            itemCheckoutCampaignBindingModel_.t();
            itemCheckoutCampaignBindingModel_.n = bVar;
            add(itemCheckoutCampaignBindingModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildCheckoutProductCampaigns$lambda$17$lambda$16$lambda$15(CheckoutProductCampaign checkoutProductCampaign, CheckoutProductEpoxyController checkoutProductEpoxyController, ItemCheckoutCampaignBindingModel_ itemCheckoutCampaignBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutCampaignBinding");
        SwitchMaterial switchMaterial = ((EpoxyItemCheckoutCampaignBinding) viewDataBinding).A;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(checkoutProductCampaign.f);
        switchMaterial.setOnCheckedChangeListener(new au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.a(1, checkoutProductEpoxyController, checkoutProductCampaign));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildCheckoutProductCampaigns$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13(CheckoutProductEpoxyController checkoutProductEpoxyController, CheckoutProductCampaign checkoutProductCampaign, CompoundButton compoundButton, boolean z) {
        Intrinsics.h(compoundButton, "<unused var>");
        checkoutProductEpoxyController.checkoutProductListener.E1(checkoutProductCampaign.d, z);
    }

    private final void buildCheckoutProductWithCompose(final CheckoutProduct product) {
        ComposeInteropKt.a(this, "product_item_".concat(product.c), new Object[]{product}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildCheckoutProductWithCompose.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CheckoutProduct checkoutProduct = product;
                    final CheckoutProductEpoxyController checkoutProductEpoxyController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1156519975, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildCheckoutProductWithCompose.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CheckoutProduct checkoutProduct2 = checkoutProduct;
                                String str = checkoutProduct2.f10565a;
                                String str2 = checkoutProduct2.d;
                                String str3 = checkoutProduct2.e;
                                String str4 = checkoutProduct2.g;
                                composer2.o(-1633490746);
                                CheckoutProductEpoxyController checkoutProductEpoxyController2 = checkoutProductEpoxyController;
                                boolean zI = composer2.I(checkoutProductEpoxyController2) | composer2.I(checkoutProduct2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(checkoutProductEpoxyController2, checkoutProduct2, 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ItemCheckoutProductKt.a(str4, str, str2, str3, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1280651701));
        String str = product.c;
        ComposeInteropKt.a(this, "product_item_substitute_".concat(str), new Object[]{product}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildCheckoutProductWithCompose.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CheckoutProduct checkoutProduct = product;
                    if (checkoutProduct.o != null) {
                        final CheckoutProductEpoxyController checkoutProductEpoxyController = this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(484982877, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildCheckoutProductWithCompose.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    CheckoutProduct checkoutProduct2 = checkoutProduct;
                                    CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = checkoutProduct2.o;
                                    composer2.o(-1633490746);
                                    CheckoutProductEpoxyController checkoutProductEpoxyController2 = checkoutProductEpoxyController;
                                    boolean zI = composer2.I(checkoutProductEpoxyController2) | composer2.I(checkoutProduct2);
                                    Object objG = composer2.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (zI || objG == composer$Companion$Empty$1) {
                                        objG = new l(8, checkoutProductEpoxyController2, checkoutProduct2);
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    composer2.l();
                                    composer2.o(-1633490746);
                                    boolean zI2 = composer2.I(checkoutProductEpoxyController2) | composer2.I(checkoutProduct2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                                        objG2 = new a(checkoutProductEpoxyController2, checkoutProduct2, 1);
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    ProductSubstituteRowKt.b(checkoutProductSubstitutionPreference, function1, (Function0) objG2, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                }
                return Unit.f24250a;
            }
        }, true, -778024354));
        int i = 0;
        for (Object obj : product.l) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            final String str2 = (String) obj;
            ComposeInteropKt.a(this, "product_item_message_" + str + "_" + i, new Object[]{product}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController$buildCheckoutProductWithCompose$3$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final String str3 = str2;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1916230003, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController$buildCheckoutProductWithCompose$3$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer2 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductMessageRowKt.a(str3, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1511675983));
            i = i2;
        }
    }

    private final void buildCheckoutProducts(CheckoutProducts checkoutProducts) {
        this.checkoutProductListener.w1(checkoutProducts);
        ItemCheckoutProductsHeaderBindingModel_ itemCheckoutProductsHeaderBindingModel_ = new ItemCheckoutProductsHeaderBindingModel_();
        String str = checkoutProducts.f10573a;
        itemCheckoutProductsHeaderBindingModel_.q("products_header", str);
        itemCheckoutProductsHeaderBindingModel_.t();
        itemCheckoutProductsHeaderBindingModel_.n = str;
        String str2 = checkoutProducts.b;
        itemCheckoutProductsHeaderBindingModel_.t();
        itemCheckoutProductsHeaderBindingModel_.o = str2;
        add(itemCheckoutProductsHeaderBindingModel_);
        Boolean bool = checkoutProducts.f;
        if (bool.equals(Boolean.TRUE)) {
            buildCheckoutSubstitutesWithCompose(checkoutProducts);
        } else {
            ItemCheckoutProductsSubstitution_ itemCheckoutProductsSubstitution_ = new ItemCheckoutProductsSubstitution_();
            itemCheckoutProductsSubstitution_.q("products_substitution", str);
            itemCheckoutProductsSubstitution_.t();
            itemCheckoutProductsSubstitution_.n = checkoutProducts;
            CheckoutProductListener checkoutProductListener = this.checkoutProductListener;
            itemCheckoutProductsSubstitution_.t();
            itemCheckoutProductsSubstitution_.o = checkoutProductListener;
            add(itemCheckoutProductsSubstitution_);
        }
        BroadcastBannerData broadcastBannerData = checkoutProducts.g;
        if (broadcastBannerData != null) {
            buildSubstitutionOnboardingBanner(broadcastBannerData);
        }
        for (CheckoutProduct checkoutProduct : checkoutProducts.e) {
            if (bool.equals(Boolean.TRUE)) {
                buildCheckoutProductWithCompose(checkoutProduct);
            } else {
                ItemCheckoutProductBindingModel_ itemCheckoutProductBindingModel_ = new ItemCheckoutProductBindingModel_();
                itemCheckoutProductBindingModel_.M("product_item_".concat(checkoutProduct.c));
                itemCheckoutProductBindingModel_.t();
                itemCheckoutProductBindingModel_.n = checkoutProduct;
                CheckoutProductListener checkoutProductListener2 = this.checkoutProductListener;
                itemCheckoutProductBindingModel_.t();
                itemCheckoutProductBindingModel_.o = checkoutProductListener2;
                add(itemCheckoutProductBindingModel_);
                int i = 0;
                for (Object obj : checkoutProduct.l) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ItemCheckoutProductMessageBindingModel_ itemCheckoutProductMessageBindingModel_ = new ItemCheckoutProductMessageBindingModel_();
                    itemCheckoutProductMessageBindingModel_.M("product_item_message_" + checkoutProduct.c + "_" + i);
                    itemCheckoutProductMessageBindingModel_.t();
                    itemCheckoutProductMessageBindingModel_.n = (String) obj;
                    add(itemCheckoutProductMessageBindingModel_);
                    i = i2;
                }
            }
            buildShopperNoteWithCompose(checkoutProduct);
        }
    }

    private final void buildCheckoutSubstitutesWithCompose(final CheckoutProducts checkoutProducts) {
        CheckoutSubstitutionPreferences checkoutSubstitutionPreferences = checkoutProducts.d;
        if (checkoutSubstitutionPreferences != null) {
            ComposeInteropKt.a(this, "products_substitution", new Object[]{checkoutSubstitutionPreferences}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController$buildCheckoutSubstitutesWithCompose$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final CheckoutProducts checkoutProducts2 = checkoutProducts;
                        final CheckoutProductEpoxyController checkoutProductEpoxyController = this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1845548238, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController$buildCheckoutSubstitutesWithCompose$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                    CheckoutProducts checkoutProducts3 = checkoutProducts2;
                                    CheckoutSubstitutionPreferences checkoutSubstitutionPreferences2 = checkoutProducts3.d;
                                    composer2.o(-1633490746);
                                    CheckoutProductEpoxyController checkoutProductEpoxyController2 = checkoutProductEpoxyController;
                                    boolean zI = composer2.I(checkoutProductEpoxyController2) | composer2.I(checkoutProducts3);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new l(9, checkoutProductEpoxyController2, checkoutProducts3);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    CheckoutSubstitutesRowKt.a(checkoutSubstitutionPreferences2, (Function1) objG, modifierE, composer2, KyberEngine.KyberPolyBytes);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 597253078));
            this.checkoutProductListener.c1(checkoutProducts.d);
        }
    }

    private final void buildCmoBanner(boolean shouldShowCmoBanner, EditOrderEventHandler eventHandler) {
        if (shouldShowCmoBanner) {
            EditOrderBannerEpoxyView editOrderBannerEpoxyView = new EditOrderBannerEpoxyView(eventHandler);
            editOrderBannerEpoxyView.p("edit_order_banner");
            addInternal(editOrderBannerEpoxyView);
        }
    }

    private final void buildMarketProducts(CheckoutMarketProducts marketProducts) {
        ItemCheckoutProductsHeaderBindingModel_ itemCheckoutProductsHeaderBindingModel_ = new ItemCheckoutProductsHeaderBindingModel_();
        itemCheckoutProductsHeaderBindingModel_.q("products_header", marketProducts.f10564a);
        String str = marketProducts.f10564a;
        itemCheckoutProductsHeaderBindingModel_.t();
        itemCheckoutProductsHeaderBindingModel_.n = str;
        String str2 = marketProducts.b;
        itemCheckoutProductsHeaderBindingModel_.t();
        itemCheckoutProductsHeaderBindingModel_.o = str2;
        add(itemCheckoutProductsHeaderBindingModel_);
        for (MarketSellerGroup marketSellerGroup : marketProducts.c) {
            ItemCheckoutMarketSellerGroupBindingModel_ itemCheckoutMarketSellerGroupBindingModel_ = new ItemCheckoutMarketSellerGroupBindingModel_();
            itemCheckoutMarketSellerGroupBindingModel_.M("market_seller_group_".concat(marketSellerGroup.f10621a));
            itemCheckoutMarketSellerGroupBindingModel_.t();
            itemCheckoutMarketSellerGroupBindingModel_.n = marketSellerGroup;
            add(itemCheckoutMarketSellerGroupBindingModel_);
            for (MarketProductRow marketProductRow : marketSellerGroup.c) {
                ItemCheckoutMarketProductBindingModel_ itemCheckoutMarketProductBindingModel_ = new ItemCheckoutMarketProductBindingModel_();
                itemCheckoutMarketProductBindingModel_.M("market_product_item_".concat(marketProductRow.c));
                itemCheckoutMarketProductBindingModel_.t();
                itemCheckoutMarketProductBindingModel_.n = marketProductRow;
                String str3 = marketSellerGroup.f10621a;
                itemCheckoutMarketProductBindingModel_.t();
                itemCheckoutMarketProductBindingModel_.o = str3;
                String str4 = marketSellerGroup.b;
                itemCheckoutMarketProductBindingModel_.t();
                itemCheckoutMarketProductBindingModel_.p = str4;
                CheckoutProductListener checkoutProductListener = this.checkoutProductListener;
                itemCheckoutMarketProductBindingModel_.t();
                itemCheckoutMarketProductBindingModel_.q = checkoutProductListener;
                add(itemCheckoutMarketProductBindingModel_);
            }
        }
    }

    private final void buildPromotionCode(CheckoutPromotionCode promotionCode) {
        ItemCheckoutPromotionCode_ itemCheckoutPromotionCode_ = new ItemCheckoutPromotionCode_();
        itemCheckoutPromotionCode_.L("promotion_code_".concat(promotionCode.f10577a));
        itemCheckoutPromotionCode_.t();
        itemCheckoutPromotionCode_.n = promotionCode;
        CheckoutProductListener checkoutProductListener = this.checkoutProductListener;
        itemCheckoutPromotionCode_.t();
        itemCheckoutPromotionCode_.o = checkoutProductListener;
        add(itemCheckoutPromotionCode_);
    }

    private final void buildShopperNoteWithCompose(final CheckoutProduct product) {
        ComposeInteropKt.a(this, "product_item_shoppernote_".concat(product.c), new Object[]{product}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildShopperNoteWithCompose.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CheckoutProduct checkoutProduct = product;
                    final CheckoutProductEpoxyController checkoutProductEpoxyController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(450514569, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildShopperNoteWithCompose.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CheckoutProduct checkoutProduct2 = checkoutProduct;
                                String str = checkoutProduct2.h.f10569a;
                                boolean z = str != null;
                                composer2.o(-1633490746);
                                CheckoutProductEpoxyController checkoutProductEpoxyController2 = checkoutProductEpoxyController;
                                boolean zI = composer2.I(checkoutProductEpoxyController2) | composer2.I(checkoutProduct2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(checkoutProductEpoxyController2, checkoutProduct2, 2);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ShopperNoteKt.a(0, composer2, str, (Function0) objG, z);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1381636507));
    }

    private final void buildSubstitutionOnboardingBanner(final BroadcastBannerData bannerDate) {
        if (hasSubstitutionOnboardingBannerDismissed(bannerDate)) {
            return;
        }
        ComposeInteropKt.a(this, "substitution-onboarding-banner", new Object[]{bannerDate}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>(this) { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildSubstitutionOnboardingBanner.1
            public final /* synthetic */ CheckoutProductEpoxyController e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final BroadcastBannerData broadcastBannerData = bannerDate;
                    final CheckoutProductEpoxyController checkoutProductEpoxyController = this.e;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1671919217, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController.buildSubstitutionOnboardingBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                CheckoutProductEpoxyController checkoutProductEpoxyController2 = checkoutProductEpoxyController;
                                boolean zI = composer2.I(checkoutProductEpoxyController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new d(checkoutProductEpoxyController2, 15);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(checkoutProductEpoxyController2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new c(checkoutProductEpoxyController2, 5);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                SubstitutionOnboardingBannerKt.a(broadcastBannerData, function1, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -404382869));
    }

    private final void buildUi(CheckoutInlineError checkoutInlineError, int i) {
        GenericInlineErrorStateEpoxyModel genericInlineErrorStateEpoxyModel = new GenericInlineErrorStateEpoxyModel(R.layout.include_generic_inline_error_state);
        genericInlineErrorStateEpoxyModel.p = new androidx.camera.core.processing.concurrent.b(1);
        buildUi$lambda$1(checkoutInlineError, i, genericInlineErrorStateEpoxyModel);
        add(genericInlineErrorStateEpoxyModel);
    }

    private static final Unit buildUi$lambda$1(CheckoutInlineError checkoutInlineError, int i, GenericInlineErrorStateEpoxyModel includeGenericInlineErrorState) {
        Intrinsics.h(includeGenericInlineErrorState, "$this$includeGenericInlineErrorState");
        includeGenericInlineErrorState.p("inline_message_" + checkoutInlineError.hashCode() + "_" + i);
        includeGenericInlineErrorState.q = checkoutInlineError;
        return Unit.f24250a;
    }

    private final boolean hasSubstitutionOnboardingBannerDismissed(BroadcastBannerData bannerData) {
        if (bannerData != null) {
            return this.bannerDismissInteractor.a(bannerData);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubstitutionOnboardingBannerDismiss(BroadcastBannerData bannerData) {
        String bannerId = bannerData.getBannerId();
        if (bannerId != null) {
            this.bannerDismissInteractor.b(bannerId);
        }
        this.checkoutProductListener.X1();
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull CheckoutContentData data) {
        List list;
        Intrinsics.h(data, "data");
        buildCmoBanner(data.c, this.cmoBannerEventHandler);
        Checkout checkout = data.f10756a;
        if (checkout == null || (list = checkout.b) == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (obj instanceof InsetBannerApiData) {
                buildUi(CheckoutBannerKt.a((InsetBannerApiData) obj), i);
            } else if (obj instanceof CheckoutPromotionCode) {
                buildPromotionCode((CheckoutPromotionCode) obj);
            } else if (obj instanceof CheckoutProducts) {
                buildCheckoutProducts((CheckoutProducts) obj);
            } else if (obj instanceof CheckoutProductCampaigns) {
                buildCheckoutProductCampaigns((CheckoutProductCampaigns) obj);
            } else if (obj instanceof CheckoutMarketProducts) {
                buildMarketProducts((CheckoutMarketProducts) obj);
            }
            i = i2;
        }
    }
}
