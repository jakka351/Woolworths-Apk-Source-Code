package au.com.woolworths.feature.shop.editorder.review.data;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.feature.shop.editorder.review.ChangeMyOrderSummaryQuery;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeMyOrderSummaryQueryChangeMyOrderSummaryExtKt {
    public static final ChangeMyOrderSummary a(ChangeMyOrderSummaryQuery.ChangeMyOrderSummary changeMyOrderSummary) {
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel;
        ChangeMyOrderDetailsSectionItems cart;
        ChangeMyOrderSummaryQuery.Banner banner = changeMyOrderSummary.f7064a;
        if (banner != null) {
            ChangeMyOrderSummaryQuery.BroadcastBannerUI broadcastBannerUI = banner.f7061a;
            String str = broadcastBannerUI.f7062a;
            String str2 = broadcastBannerUI.b;
            int iOrdinal = broadcastBannerUI.c.ordinal();
            CoreBroadcastBannerStyle coreBroadcastBannerStyle = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? CoreBroadcastBannerStyle.d : CoreBroadcastBannerStyle.h : CoreBroadcastBannerStyle.g : CoreBroadcastBannerStyle.f : CoreBroadcastBannerStyle.e : CoreBroadcastBannerStyle.d;
            ChangeMyOrderSummaryQuery.OnHostedIcon onHostedIcon = broadcastBannerUI.d.b;
            if (onHostedIcon == null) {
                throw new IllegalStateException("Error mapping `Icon`: missing non-null synthetic field!");
            }
            basicCoreBroadcastBannerModel = new BasicCoreBroadcastBannerModel(null, new CoreBroadcastBannerModel(str, str2, coreBroadcastBannerStyle, new IconAsset.HostedIcon(onHostedIcon.f7075a)), null, null, null, null, false);
        } else {
            basicCoreBroadcastBannerModel = null;
        }
        ChangeMyOrderSummaryQuery.OrderDetailsSection orderDetailsSection = changeMyOrderSummary.b;
        String str3 = orderDetailsSection.f7076a;
        String str4 = orderDetailsSection.b;
        ArrayList<ChangeMyOrderSummaryQuery.Item> arrayList = orderDetailsSection.c;
        ArrayList arrayList2 = new ArrayList();
        for (ChangeMyOrderSummaryQuery.Item item : arrayList) {
            ChangeMyOrderSummaryQuery.OnFulfilmentMethod onFulfilmentMethod = item.b;
            if (onFulfilmentMethod != null) {
                cart = new ChangeMyOrderDetailsSectionItems.FulfilmentMethod(onFulfilmentMethod.f7073a, onFulfilmentMethod.b, onFulfilmentMethod.c);
            } else {
                ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructions = item.c;
                if (onChangeMyOrderDeliveryInstructions != null) {
                    cart = new ChangeMyOrderDetailsSectionItems.DeliveryInstructions(onChangeMyOrderDeliveryInstructions.f7072a, onChangeMyOrderDeliveryInstructions.b, onChangeMyOrderDeliveryInstructions.c);
                } else {
                    ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot onFulfilmentTimeSlot = item.d;
                    if (onFulfilmentTimeSlot != null) {
                        ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle fulfilmentTimeSlotTitle = onFulfilmentTimeSlot.f7074a;
                        cart = new ChangeMyOrderDetailsSectionItems.FulfilmentTimeSlot(new TextWithAltApiData(fulfilmentTimeSlotTitle.f7068a, fulfilmentTimeSlotTitle.b), onFulfilmentTimeSlot.b, onFulfilmentTimeSlot.c);
                    } else {
                        ChangeMyOrderSummaryQuery.OnCartActions onCartActions = item.e;
                        if (onCartActions != null) {
                            String str5 = onCartActions.f7071a;
                            String str6 = onCartActions.b;
                            int i = onCartActions.c;
                            ArrayList<ChangeMyOrderSummaryQuery.ActionTile> arrayList3 = onCartActions.d;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                            for (ChangeMyOrderSummaryQuery.ActionTile actionTile : arrayList3) {
                                Intrinsics.h(actionTile, "<this>");
                                arrayList4.add(new ChangeMyOrderDetailsSectionItems.Cart.ActionTile(actionTile.f7060a, actionTile.b, actionTile.c));
                            }
                            cart = new ChangeMyOrderDetailsSectionItems.Cart(str5, str6, i, arrayList4);
                        } else {
                            cart = null;
                        }
                    }
                }
            }
            if (cart != null) {
                arrayList2.add(cart);
            }
        }
        ChangeMyOrderDetailsSection changeMyOrderDetailsSection = new ChangeMyOrderDetailsSection(str3, str4, arrayList2);
        ChangeMyOrderSummaryQuery.FooterCTASection footerCTASection = changeMyOrderSummary.c;
        ChangeMyOrderSummaryQuery.CancelButton cancelButton = footerCTASection.f7067a;
        String str7 = cancelButton.b;
        ButtonStyle buttonStyle = cancelButton.c;
        ButtonApiData buttonApiData = new ButtonApiData(str7, null, buttonStyle != null ? ButtonStyleExtKt.a(buttonStyle) : null, cancelButton.d, null, null, null, null, null, 498, null);
        ChangeMyOrderSummaryQuery.CheckoutButton checkoutButton = footerCTASection.b;
        String str8 = checkoutButton.b;
        ButtonStyle buttonStyle2 = checkoutButton.c;
        return new ChangeMyOrderSummary(basicCoreBroadcastBannerModel, changeMyOrderDetailsSection, new FooterCtaSection(buttonApiData, new ButtonApiData(str8, null, buttonStyle2 != null ? ButtonStyleExtKt.a(buttonStyle2) : null, checkoutButton.d, null, null, null, null, null, 498, null)));
    }
}
