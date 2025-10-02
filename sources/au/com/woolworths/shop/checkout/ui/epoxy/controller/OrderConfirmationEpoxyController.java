package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import android.text.SpannableStringBuilder;
import android.text.style.TtsSpan;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.legacy.broadcastbanner.designcoreadapter.BroadcastBannerKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.checkout.ItemCheckoutOrderAddressBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutOrderAddressMarketSellerBindingModel_;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressGrocery;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressMarket;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent;
import au.com.woolworths.shop.checkout.ui.components.BannerImageEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationFooterTextEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationIconTextBannerEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationSectionTitleEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationSubtitleEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationTitleEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.SectionDividerEpoxyModel;
import au.com.woolworths.shop.checkout.ui.compose.VocPlaceholderKt;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel;
import au.com.woolworths.shop.checkout.ui.details.d;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0014\u0010\u000b\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000b\u001a\u00020\t*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0016\u0010\u000b\u001a\u00020\t*\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/controller/OrderConfirmationEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "viewModel", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationViewModel;", "<init>", "(Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationViewModel;)V", "buildModels", "", "contentList", "buildUi", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$BannerImage;", "index", "", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$Header;", "getNumericStringBuilderIfExist", "Landroid/text/SpannableStringBuilder;", "value", "", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderAddresses;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressGrocery;", "inserBannerApiData", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressMarket;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderSummary;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$IconTextBanner;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$FooterText;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$DynamicSizeAdBannerData;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$VocPlaceholder;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderConfirmationCmoBroadcastBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationEpoxyController extends TypedEpoxyController<List<? extends OrderConfirmationContent>> {
    public static final int $stable = 8;

    @NotNull
    private final OrderConfirmationViewModel viewModel;

    public OrderConfirmationEpoxyController(@NotNull OrderConfirmationViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private final void buildUi(final OrderConfirmationContent.DynamicSizeAdBannerData dynamicSizeAdBannerData, int i) {
        ComposeInteropKt.a(this, YU.a.d(i, "dynamic_size_ad_banner_"), new Object[]{dynamicSizeAdBannerData.f10650a}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController.buildUi.15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final OrderConfirmationContent.DynamicSizeAdBannerData dynamicSizeAdBannerData2 = dynamicSizeAdBannerData;
                    final OrderConfirmationEpoxyController orderConfirmationEpoxyController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1295949231, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController.buildUi.15.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                DynamicSizeCardData dynamicSizeCardData = dynamicSizeAdBannerData2.f10650a;
                                float f = 16;
                                Modifier modifierJ = PaddingKt.j(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
                                OrderConfirmationEpoxyController orderConfirmationEpoxyController2 = orderConfirmationEpoxyController;
                                OrderConfirmationViewModel orderConfirmationViewModel = orderConfirmationEpoxyController2.viewModel;
                                composer2.o(5004770);
                                boolean zI = composer2.I(orderConfirmationViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    OrderConfirmationEpoxyController$buildUi$15$1$1$1 orderConfirmationEpoxyController$buildUi$15$1$1$1 = new OrderConfirmationEpoxyController$buildUi$15$1$1$1(1, orderConfirmationViewModel, OrderConfirmationViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(orderConfirmationEpoxyController$buildUi$15$1$1$1);
                                    objG = orderConfirmationEpoxyController$buildUi$15$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                OrderConfirmationViewModel orderConfirmationViewModel2 = orderConfirmationEpoxyController2.viewModel;
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(orderConfirmationViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    OrderConfirmationEpoxyController$buildUi$15$1$2$1 orderConfirmationEpoxyController$buildUi$15$1$2$1 = new OrderConfirmationEpoxyController$buildUi$15$1$2$1(1, orderConfirmationViewModel2, OrderConfirmationViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(orderConfirmationEpoxyController$buildUi$15$1$2$1);
                                    objG2 = orderConfirmationEpoxyController$buildUi$15$1$2$1;
                                }
                                composer2.l();
                                DynamicSizeCardKt.b(dynamicSizeCardData, modifierJ, function1, (Function1) ((KFunction) objG2), null, BitmapDescriptorFactory.HUE_RED, composer2, 48, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 43842919));
    }

    private final SpannableStringBuilder getNumericStringBuilderIfExist(String value) {
        if (value.length() <= 1 || !StringsKt.W(value, "#", false)) {
            return null;
        }
        String strS = StringsKt.s(1, value);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TtsSpan ttsSpanBuild = new TtsSpan.DigitsBuilder(strS).build();
        Intrinsics.g(ttsSpanBuild, "build(...)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) value);
        spannableStringBuilder.setSpan(ttsSpanBuild, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable List<? extends OrderConfirmationContent> contentList) {
        if (contentList != null) {
            int i = 0;
            for (Object obj : contentList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                OrderConfirmationContent orderConfirmationContent = (OrderConfirmationContent) obj;
                if (orderConfirmationContent instanceof OrderConfirmationContent.BannerImage) {
                    buildUi((OrderConfirmationContent.BannerImage) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.Header) {
                    buildUi((OrderConfirmationContent.Header) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.OrderAddresses) {
                    buildUi((OrderConfirmationContent.OrderAddresses) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.OrderSummary) {
                    buildUi((OrderConfirmationContent.OrderSummary) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.IconTextBanner) {
                    buildUi((OrderConfirmationContent.IconTextBanner) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.FooterText) {
                    buildUi((OrderConfirmationContent.FooterText) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.DynamicSizeAdBannerData) {
                    buildUi((OrderConfirmationContent.DynamicSizeAdBannerData) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.VocPlaceholder) {
                    buildUi((OrderConfirmationContent.VocPlaceholder) orderConfirmationContent, i);
                } else if (orderConfirmationContent instanceof OrderConfirmationContent.OrderConfirmationCmoBroadcastBanner) {
                    buildUi((OrderConfirmationContent.OrderConfirmationCmoBroadcastBanner) orderConfirmationContent, i);
                }
                i = i2;
            }
        }
    }

    private final void buildUi(final OrderConfirmationContent.VocPlaceholder vocPlaceholder, int i) {
        ComposeInteropKt.a(this, YU.a.d(i, "dynamic_size_ad_banner_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController.buildUi.16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    VocPlaceholderKt.a(vocPlaceholder.f10652a, 0, composer, null);
                }
                return Unit.f24250a;
            }
        }, true, 1478672737));
    }

    private final void buildUi(final OrderConfirmationContent.OrderConfirmationCmoBroadcastBanner orderConfirmationCmoBroadcastBanner, int i) {
        if (orderConfirmationCmoBroadcastBanner.getBanner() != null) {
            ComposeInteropKt.a(this, YU.a.d(i, "cmo_broadcast_banner_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController.buildUi.17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final OrderConfirmationContent.OrderConfirmationCmoBroadcastBanner orderConfirmationCmoBroadcastBanner2 = orderConfirmationCmoBroadcastBanner;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-609817602, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController.buildUi.17.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    float f = 16;
                                    Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, f, f, f, BitmapDescriptorFactory.HUE_RED, 8);
                                    BroadcastBannerData banner = orderConfirmationCmoBroadcastBanner2.getBanner();
                                    composer2.o(1849434622);
                                    Object objG = composer2.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (objG == composer$Companion$Empty$1) {
                                        objG = new d(2);
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                                    if (objE == composer$Companion$Empty$1) {
                                        objE = new d(3);
                                        composer2.A(objE);
                                    }
                                    composer2.l();
                                    BroadcastBannerKt.a(banner, function1, (Function1) objE, modifierJ, composer2, 432, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1345927974));
        }
    }

    private final void buildUi(OrderConfirmationContent.BannerImage bannerImage, int i) {
        BannerImageEpoxyModel_ bannerImageEpoxyModel_ = new BannerImageEpoxyModel_();
        bannerImageEpoxyModel_.K("banner_image_" + i);
        bannerImageEpoxyModel_.t();
        bannerImageEpoxyModel_.n = bannerImage;
        add(bannerImageEpoxyModel_);
    }

    private final void buildUi(OrderConfirmationContent.Header header, int i) {
        ConfirmationTitleEpoxyModel_ confirmationTitleEpoxyModel_ = new ConfirmationTitleEpoxyModel_();
        confirmationTitleEpoxyModel_.K("header_title_" + i);
        String title = header.getTitle();
        confirmationTitleEpoxyModel_.t();
        confirmationTitleEpoxyModel_.n = title;
        add(confirmationTitleEpoxyModel_);
        ConfirmationSubtitleEpoxyModel_ confirmationSubtitleEpoxyModel_ = new ConfirmationSubtitleEpoxyModel_();
        confirmationSubtitleEpoxyModel_.K("header_subtitle_" + i);
        String subtitle = header.getSubtitle();
        confirmationSubtitleEpoxyModel_.t();
        confirmationSubtitleEpoxyModel_.n = subtitle;
        add(confirmationSubtitleEpoxyModel_);
        EpoxyModel<?> epoxyModel = SectionDividerEpoxyModel.Dotted.p;
        epoxyModel.p("divider_header_" + i);
        add(epoxyModel);
        int i2 = 0;
        for (Object obj : header.getOrder()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                OrderTotalDetailsSection orderTotalDetailsSection = (OrderTotalDetailsSection) obj;
                OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_ = new OrderTotalSectionEpoxyModel_();
                orderTotalSectionEpoxyModel_.M("header_" + i + "_section_" + i2);
                orderTotalSectionEpoxyModel_.t();
                orderTotalSectionEpoxyModel_.n = orderTotalDetailsSection;
                SpannableStringBuilder numericStringBuilderIfExist = getNumericStringBuilderIfExist(orderTotalDetailsSection.c);
                if (numericStringBuilderIfExist != null) {
                    orderTotalSectionEpoxyModel_.t();
                    orderTotalSectionEpoxyModel_.p = numericStringBuilderIfExist;
                }
                add(orderTotalSectionEpoxyModel_);
                i2 = i3;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
        EpoxyModel<?> epoxyModel2 = SectionDividerEpoxyModel.Dotted.p;
        epoxyModel2.p("divider_header_" + i);
        add(epoxyModel2);
    }

    private final void buildUi(OrderConfirmationContent.OrderAddresses orderAddresses, int i) {
        EpoxyModel<?> epoxyModel;
        ConfirmationSectionTitleEpoxyModel_ confirmationSectionTitleEpoxyModel_ = new ConfirmationSectionTitleEpoxyModel_();
        confirmationSectionTitleEpoxyModel_.K("addresses_" + i);
        String title = orderAddresses.getTitle();
        confirmationSectionTitleEpoxyModel_.t();
        confirmationSectionTitleEpoxyModel_.n = title;
        add(confirmationSectionTitleEpoxyModel_);
        int i2 = 0;
        for (Object obj : orderAddresses.getAddressSections()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                OrderAddress orderAddress = (OrderAddress) obj;
                if (orderAddress instanceof OrderAddressGrocery) {
                    buildUi((OrderAddressGrocery) orderAddress, orderAddresses.getInsetBanner());
                } else {
                    if (!(orderAddress instanceof OrderAddressMarket)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buildUi((OrderAddressMarket) orderAddress, orderAddresses.getInsetBanner());
                }
                if (i2 < CollectionsKt.I(orderAddresses.getAddressSections())) {
                    epoxyModel = SectionDividerEpoxyModel.Solid.p;
                } else {
                    epoxyModel = SectionDividerEpoxyModel.Dotted.p;
                }
                epoxyModel.p("divider_address_section_" + i);
                add(epoxyModel);
                i2 = i3;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
    }

    private final void buildUi(OrderAddressGrocery orderAddressGrocery, InsetBannerApiData insetBannerApiData) {
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = new ItemCheckoutOrderAddressBindingModel_();
        itemCheckoutOrderAddressBindingModel_.M("order_address_grocery_".concat(orderAddressGrocery.f10642a));
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.n = orderAddressGrocery;
        String str = orderAddressGrocery.d;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.p = str;
        InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.o = uiModel;
        add(itemCheckoutOrderAddressBindingModel_);
    }

    private final void buildUi(OrderAddressMarket orderAddressMarket, InsetBannerApiData insetBannerApiData) {
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = new ItemCheckoutOrderAddressBindingModel_();
        itemCheckoutOrderAddressBindingModel_.M("order_address_market_".concat(orderAddressMarket.f10643a));
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.n = orderAddressMarket;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.p = null;
        InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.o = uiModel;
        add(itemCheckoutOrderAddressBindingModel_);
        int i = 0;
        for (Object obj : orderAddressMarket.d) {
            int i2 = i + 1;
            if (i >= 0) {
                MarketSellerInfo marketSellerInfo = (MarketSellerInfo) obj;
                ItemCheckoutOrderAddressMarketSellerBindingModel_ itemCheckoutOrderAddressMarketSellerBindingModel_ = new ItemCheckoutOrderAddressMarketSellerBindingModel_();
                itemCheckoutOrderAddressMarketSellerBindingModel_.M("order_address_seller_".concat(marketSellerInfo.f10622a));
                itemCheckoutOrderAddressMarketSellerBindingModel_.t();
                itemCheckoutOrderAddressMarketSellerBindingModel_.n = marketSellerInfo;
                add(itemCheckoutOrderAddressMarketSellerBindingModel_);
                i = i2;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
    }

    private final void buildUi(OrderConfirmationContent.OrderSummary orderSummary, int i) {
        ConfirmationSectionTitleEpoxyModel_ confirmationSectionTitleEpoxyModel_ = new ConfirmationSectionTitleEpoxyModel_();
        confirmationSectionTitleEpoxyModel_.K("summary_title_" + i);
        String title = orderSummary.getTitle();
        confirmationSectionTitleEpoxyModel_.t();
        confirmationSectionTitleEpoxyModel_.n = title;
        add(confirmationSectionTitleEpoxyModel_);
        String summaryText = orderSummary.getSummaryText();
        if (summaryText != null) {
            ConfirmationSubtitleEpoxyModel_ confirmationSubtitleEpoxyModel_ = new ConfirmationSubtitleEpoxyModel_();
            confirmationSubtitleEpoxyModel_.K("summary_subtitle_" + i);
            confirmationSubtitleEpoxyModel_.t();
            confirmationSubtitleEpoxyModel_.n = summaryText;
            add(confirmationSubtitleEpoxyModel_);
            EpoxyModel<?> epoxyModel = SectionDividerEpoxyModel.Dotted.p;
            epoxyModel.p("divider_summary_subtitle_" + i);
            add(epoxyModel);
        }
        int i2 = 0;
        for (Object obj : orderSummary.getSections()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int i4 = 0;
                for (Object obj2 : (List) obj) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_ = new OrderTotalSectionEpoxyModel_();
                        StringBuilder sbQ = YU.a.q(i, i2, "summary_", "_section_", "_subSection_");
                        sbQ.append(i4);
                        orderTotalSectionEpoxyModel_.M(sbQ.toString());
                        orderTotalSectionEpoxyModel_.t();
                        orderTotalSectionEpoxyModel_.n = (OrderTotalDetailsSection) obj2;
                        OrderConfirmationViewModel orderConfirmationViewModel = this.viewModel;
                        orderTotalSectionEpoxyModel_.t();
                        orderTotalSectionEpoxyModel_.o = orderConfirmationViewModel;
                        add(orderTotalSectionEpoxyModel_);
                        i4 = i5;
                    } else {
                        CollectionsKt.z0();
                        throw null;
                    }
                }
                if (i2 < CollectionsKt.I(orderSummary.getSections())) {
                    EpoxyModel<?> epoxyModel2 = SectionDividerEpoxyModel.Dotted.p;
                    epoxyModel2.p("divider_summary_" + i + "_section_" + i2);
                    add(epoxyModel2);
                }
                i2 = i3;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
    }

    private final void buildUi(OrderConfirmationContent.IconTextBanner iconTextBanner, int i) {
        ConfirmationIconTextBannerEpoxyModel_ confirmationIconTextBannerEpoxyModel_ = new ConfirmationIconTextBannerEpoxyModel_();
        confirmationIconTextBannerEpoxyModel_.K("icon_text_banner_" + i);
        String imageUrl = iconTextBanner.getImageUrl();
        confirmationIconTextBannerEpoxyModel_.t();
        confirmationIconTextBannerEpoxyModel_.n = imageUrl;
        String title = iconTextBanner.getTitle();
        confirmationIconTextBannerEpoxyModel_.t();
        confirmationIconTextBannerEpoxyModel_.o = title;
        add(confirmationIconTextBannerEpoxyModel_);
    }

    private final void buildUi(OrderConfirmationContent.FooterText footerText, int i) {
        ConfirmationFooterTextEpoxyModel_ confirmationFooterTextEpoxyModel_ = new ConfirmationFooterTextEpoxyModel_();
        confirmationFooterTextEpoxyModel_.K("footer_text_" + i);
        String text = footerText.getText();
        confirmationFooterTextEpoxyModel_.t();
        confirmationFooterTextEpoxyModel_.n = text;
        add(confirmationFooterTextEpoxyModel_);
    }
}
