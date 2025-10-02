package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;
import au.com.woolworths.shop.checkout.domain.model.ProductInfo;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressGrocery;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressMarket;
import au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmation;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderInfo;
import com.woolworths.shop.checkout.OrderConfirmationQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationQueryKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24, types: [au.com.woolworths.shop.checkout.domain.model.address.OrderAddressMarket] */
    public static final OrderConfirmation a(OrderConfirmationQuery.OrderConfirmation orderConfirmation) {
        Iterator it;
        OrderConfirmationContent orderSummary;
        OrderConfirmationContent orderConfirmationCmoBroadcastBanner;
        BroadcastBannerData broadcastBannerData;
        OrderConfirmationContent universalInventoryContainer;
        GoogleAdBannerCard googleAdBannerCard;
        ActionableCard actionableCard;
        OrderConfirmationQuery.OnActionableCard1 onActionableCard1;
        Iterator it2;
        OrderDetailSectionMessage orderDetailSectionMessage;
        InsetBannerApiData insetBannerApiData;
        OrderAddressGrocery orderAddressMarket;
        String str = "<this>";
        Intrinsics.h(orderConfirmation, "<this>");
        ArrayList arrayList = orderConfirmation.f21867a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (true) {
            int i = 10;
            if (!it3.hasNext()) {
                break;
            }
            OrderConfirmationQuery.Content content = (OrderConfirmationQuery.Content) it3.next();
            OrderConfirmationQuery.OnOrderConfirmationBannerImage onOrderConfirmationBannerImage = content.b;
            if (onOrderConfirmationBannerImage != null) {
                universalInventoryContainer = new OrderConfirmationContent.BannerImage(onOrderConfirmationBannerImage.f21861a, onOrderConfirmationBannerImage.b);
                it = it3;
            } else {
                OrderConfirmationQuery.OnOrderConfirmationHeader onOrderConfirmationHeader = content.c;
                if (onOrderConfirmationHeader != null) {
                    String str2 = onOrderConfirmationHeader.f21864a;
                    String str3 = onOrderConfirmationHeader.b;
                    ArrayList<OrderConfirmationQuery.Order> arrayList3 = onOrderConfirmationHeader.c;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                    for (OrderConfirmationQuery.Order order : arrayList3) {
                        Intrinsics.h(order, "<this>");
                        arrayList4.add(new OrderTotalDetailsSection(order.f21866a, au.com.woolworths.shop.checkout.domain.model.confirmation.CheckoutSummaryValueTypeExtKt.a(order.b), order.c, au.com.woolworths.shop.checkout.domain.model.confirmation.CheckoutSummaryValueTypeExtKt.a(order.d), order.e, null));
                    }
                    orderConfirmationCmoBroadcastBanner = new OrderConfirmationContent.Header(str2, str3, arrayList4);
                } else {
                    OrderConfirmationQuery.OnCheckoutOrderAddresses onCheckoutOrderAddresses = content.d;
                    if (onCheckoutOrderAddresses != null) {
                        String str4 = onCheckoutOrderAddresses.f21855a;
                        ArrayList<OrderConfirmationQuery.AddressSection> arrayList5 = onCheckoutOrderAddresses.b;
                        ArrayList arrayList6 = new ArrayList();
                        for (OrderConfirmationQuery.AddressSection addressSection : arrayList5) {
                            OrderConfirmationQuery.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = addressSection.b;
                            if (onCheckoutOrderGroceryAddress != null) {
                                orderAddressMarket = new OrderAddressGrocery(onCheckoutOrderGroceryAddress.f21856a, onCheckoutOrderGroceryAddress.c, onCheckoutOrderGroceryAddress.b, onCheckoutOrderGroceryAddress.d);
                            } else {
                                OrderConfirmationQuery.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = addressSection.c;
                                if (onCheckoutOrderMarketAddress != null) {
                                    String str5 = onCheckoutOrderMarketAddress.f21857a;
                                    String str6 = onCheckoutOrderMarketAddress.c;
                                    String str7 = onCheckoutOrderMarketAddress.b;
                                    ArrayList<OrderConfirmationQuery.SellerInfo> arrayList7 = onCheckoutOrderMarketAddress.d;
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, i));
                                    for (OrderConfirmationQuery.SellerInfo sellerInfo : arrayList7) {
                                        Intrinsics.h(sellerInfo, "<this>");
                                        arrayList8.add(new MarketSellerInfo(sellerInfo.f21871a, sellerInfo.b));
                                    }
                                    orderAddressMarket = new OrderAddressMarket(str5, str6, str7, arrayList8);
                                } else {
                                    orderAddressMarket = null;
                                }
                            }
                            if (orderAddressMarket != null) {
                                arrayList6.add(orderAddressMarket);
                            }
                            i = 10;
                        }
                        OrderConfirmationQuery.InsetBanner insetBanner = onCheckoutOrderAddresses.c;
                        if (insetBanner != null) {
                            int iOrdinal = insetBanner.f21850a.ordinal();
                            insetBannerApiData = new InsetBannerApiData(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? InsetBannerTypeApiData.INFO : InsetBannerTypeApiData.GREEN : InsetBannerTypeApiData.REWARDS : InsetBannerTypeApiData.ERROR : InsetBannerTypeApiData.WARNING : InsetBannerTypeApiData.INFO, insetBanner.b, null, null, null, null, 32, null);
                        } else {
                            insetBannerApiData = null;
                        }
                        orderConfirmationCmoBroadcastBanner = new OrderConfirmationContent.OrderAddresses(str4, arrayList6, insetBannerApiData);
                    } else {
                        OrderConfirmationQuery.OnCheckoutOrderSummary onCheckoutOrderSummary = content.e;
                        if (onCheckoutOrderSummary != null) {
                            String str8 = onCheckoutOrderSummary.f21858a;
                            String str9 = onCheckoutOrderSummary.b;
                            ArrayList<List> arrayList9 = onCheckoutOrderSummary.c;
                            int i2 = 10;
                            ArrayList arrayList10 = new ArrayList(CollectionsKt.s(arrayList9, 10));
                            for (List<OrderConfirmationQuery.Section> list : arrayList9) {
                                ArrayList arrayList11 = new ArrayList(CollectionsKt.s(list, i2));
                                for (OrderConfirmationQuery.Section section : list) {
                                    Intrinsics.h(section, "<this>");
                                    String str10 = section.f21870a;
                                    DetailsSectionValueType detailsSectionValueTypeA = au.com.woolworths.shop.checkout.domain.model.confirmation.CheckoutSummaryValueTypeExtKt.a(section.b);
                                    String str11 = section.c;
                                    DetailsSectionValueType detailsSectionValueTypeA2 = au.com.woolworths.shop.checkout.domain.model.confirmation.CheckoutSummaryValueTypeExtKt.a(section.d);
                                    String str12 = section.e;
                                    OrderConfirmationQuery.Message message = section.f;
                                    if (message != null) {
                                        it2 = it3;
                                        orderDetailSectionMessage = new OrderDetailSectionMessage(message.f21851a, message.b, null);
                                    } else {
                                        it2 = it3;
                                        orderDetailSectionMessage = null;
                                    }
                                    arrayList11.add(new OrderTotalDetailsSection(str10, detailsSectionValueTypeA, str11, detailsSectionValueTypeA2, str12, orderDetailSectionMessage));
                                    it3 = it2;
                                }
                                arrayList10.add(arrayList11);
                                it3 = it3;
                                i2 = 10;
                            }
                            it = it3;
                            orderSummary = new OrderConfirmationContent.OrderSummary(str8, str9, arrayList10);
                        } else {
                            it = it3;
                            orderSummary = null;
                            OrderConfirmationQuery.OnIconTextBanner onIconTextBanner = content.f;
                            if (onIconTextBanner != null) {
                                universalInventoryContainer = new OrderConfirmationContent.IconTextBanner(onIconTextBanner.f21860a, onIconTextBanner.b);
                            } else {
                                OrderConfirmationQuery.OnOrderConfirmationFooterText onOrderConfirmationFooterText = content.g;
                                if (onOrderConfirmationFooterText != null) {
                                    universalInventoryContainer = new OrderConfirmationContent.FooterText(onOrderConfirmationFooterText.f21863a);
                                } else {
                                    OrderConfirmationQuery.OnActionableCard onActionableCard = content.h;
                                    if (onActionableCard != null) {
                                        String str13 = onActionableCard.c;
                                        String str14 = onActionableCard.d;
                                        int iOrdinal2 = onActionableCard.e.ordinal();
                                        universalInventoryContainer = new OrderConfirmationContent.DynamicSizeAdBannerData(new ActionableCard(str13, str14, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL, onActionableCard.b, onActionableCard.f, null, null));
                                    } else {
                                        OrderConfirmationQuery.OnGoogleAdBannerCard onGoogleAdBannerCard = content.i;
                                        if (onGoogleAdBannerCard != null) {
                                            String str15 = onGoogleAdBannerCard.b;
                                            String str16 = onGoogleAdBannerCard.c;
                                            int iOrdinal3 = onGoogleAdBannerCard.f.ordinal();
                                            DefaultCardHeight defaultCardHeight = iOrdinal3 != 0 ? iOrdinal3 != 1 ? iOrdinal3 != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
                                            GoogleAdCustomTargeting googleAdCustomTargeting = onGoogleAdBannerCard.g;
                                            String str17 = onGoogleAdBannerCard.e;
                                            universalInventoryContainer = new OrderConfirmationContent.DynamicSizeAdBannerData(new GoogleAdBannerCard(str15, str16, defaultCardHeight, googleAdCustomTargeting, null, null, null, null, null, null, null, null, null, Intrinsics.c(str17, "320x50") ? InteractiveAdvertisingBureauAdHeight.STANDARD : Intrinsics.c(str17, "320x100") ? InteractiveAdvertisingBureauAdHeight.LARGE : InteractiveAdvertisingBureauAdHeight.LARGE));
                                        } else {
                                            OrderConfirmationQuery.OnUniversalInventoryContainer onUniversalInventoryContainer = content.j;
                                            if (onUniversalInventoryContainer != null) {
                                                OrderConfirmationQuery.GoogleAdBannerCard googleAdBannerCard2 = onUniversalInventoryContainer.f21865a;
                                                if (googleAdBannerCard2 != null) {
                                                    String str18 = googleAdBannerCard2.b;
                                                    String str19 = googleAdBannerCard2.c;
                                                    int iOrdinal4 = googleAdBannerCard2.f.ordinal();
                                                    DefaultCardHeight defaultCardHeight2 = iOrdinal4 != 0 ? iOrdinal4 != 1 ? iOrdinal4 != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
                                                    GoogleAdCustomTargeting googleAdCustomTargeting2 = googleAdBannerCard2.g;
                                                    String str20 = googleAdBannerCard2.h;
                                                    String str21 = googleAdBannerCard2.e;
                                                    googleAdBannerCard = new GoogleAdBannerCard(str18, str19, defaultCardHeight2, googleAdCustomTargeting2, str20, null, null, null, null, null, null, null, null, Intrinsics.c(str21, "320x50") ? InteractiveAdvertisingBureauAdHeight.STANDARD : Intrinsics.c(str21, "320x100") ? InteractiveAdvertisingBureauAdHeight.LARGE : InteractiveAdvertisingBureauAdHeight.LARGE);
                                                } else {
                                                    googleAdBannerCard = null;
                                                }
                                                OrderConfirmationQuery.NextBestAction nextBestAction = onUniversalInventoryContainer.b;
                                                if (nextBestAction == null || (onActionableCard1 = nextBestAction.b) == null) {
                                                    actionableCard = null;
                                                } else {
                                                    String str22 = onActionableCard1.c;
                                                    String str23 = onActionableCard1.d;
                                                    int iOrdinal5 = onActionableCard1.e.ordinal();
                                                    actionableCard = new ActionableCard(str22, str23, iOrdinal5 != 0 ? iOrdinal5 != 1 ? iOrdinal5 != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL, onActionableCard1.b, onActionableCard1.f, null, null);
                                                }
                                                universalInventoryContainer = new OrderConfirmationContent.UniversalInventoryContainer(new UniversalInventoryContainerData(googleAdBannerCard, actionableCard));
                                            } else {
                                                OrderConfirmationQuery.OnOrderConfirmationCMOBroadcastBanner onOrderConfirmationCMOBroadcastBanner = content.k;
                                                if (onOrderConfirmationCMOBroadcastBanner != null) {
                                                    OrderConfirmationQuery.Banner banner = onOrderConfirmationCMOBroadcastBanner.f21862a;
                                                    if (banner != null) {
                                                        String str24 = banner.f21846a;
                                                        String str25 = banner.b;
                                                        String str26 = banner.e;
                                                        int iOrdinal6 = banner.c.ordinal();
                                                        broadcastBannerData = new BroadcastBannerData(str24, str25, null, null, str26, iOrdinal6 != 0 ? iOrdinal6 != 1 ? iOrdinal6 != 2 ? BroadcastBannerType.NEUTRAL : BroadcastBannerType.REWARDS : BroadcastBannerType.PRIMARY : BroadcastBannerType.NEUTRAL, banner.d, banner.g, banner.f);
                                                    } else {
                                                        broadcastBannerData = null;
                                                    }
                                                    orderConfirmationCmoBroadcastBanner = new OrderConfirmationContent.OrderConfirmationCmoBroadcastBanner(broadcastBannerData);
                                                    universalInventoryContainer = orderConfirmationCmoBroadcastBanner;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        universalInventoryContainer = orderSummary;
                    }
                }
                it = it3;
                universalInventoryContainer = orderConfirmationCmoBroadcastBanner;
            }
            if (universalInventoryContainer != null) {
                arrayList2.add(universalInventoryContainer);
            }
            it3 = it;
        }
        String str27 = orderConfirmation.b;
        OrderConfirmationQuery.OrderInfo orderInfo = orderConfirmation.c;
        ArrayList<OrderConfirmationQuery.ProductsInfo> arrayList12 = orderInfo.f21868a;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.s(arrayList12, 10));
        for (OrderConfirmationQuery.ProductsInfo productsInfo : arrayList12) {
            Intrinsics.h(productsInfo, str);
            arrayList13.add(new ProductInfo(productsInfo.f21869a, productsInfo.b, productsInfo.c, productsInfo.d, productsInfo.e, productsInfo.f, productsInfo.g, productsInfo.h, productsInfo.i, productsInfo.j));
            str = str;
        }
        return new OrderConfirmation(arrayList2, str27, new OrderInfo(arrayList13, orderInfo.b, Boolean.valueOf(orderInfo.c), orderInfo.d, orderInfo.e, orderInfo.f, orderInfo.g, orderInfo.h, orderInfo.i, orderInfo.j, orderInfo.k, orderInfo.l, orderInfo.m, orderInfo.n, orderInfo.o, orderInfo.p, orderInfo.q, orderInfo.r, orderInfo.s, orderInfo.t, orderInfo.u, orderInfo.v, orderInfo.w, orderInfo.x, orderInfo.y));
    }
}
