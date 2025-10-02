package au.com.woolworths.shop.checkout.ui.content;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromoCode;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromoCodeDetail;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditDetail;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditItem;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ModalBottomSheetDataExtKt {
    public static final List a(ModalBottomSheetData modalBottomSheetData) {
        Intrinsics.h(modalBottomSheetData, "<this>");
        if (!(modalBottomSheetData instanceof ModalBottomSheetData.PromoCode)) {
            return EmptyList.d;
        }
        List<CheckoutPromoCode> list = ((ModalBottomSheetData.PromoCode) modalBottomSheetData).f10760a.f.c;
        ArrayList arrayList = new ArrayList();
        for (CheckoutPromoCode checkoutPromoCode : list) {
            if (!(checkoutPromoCode instanceof CheckoutPromoCode.CheckoutPromoCodeItem)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutPromoCode.CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCode.CheckoutPromoCodeItem) checkoutPromoCode;
            String str = checkoutPromoCodeItem.e ? checkoutPromoCodeItem.f : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final ModalBottomSheetData b(ModalBottomSheetData modalBottomSheetData, LinkedHashSet pendingPromoCodes, ResText resText, PlainText plainText) {
        Intrinsics.h(modalBottomSheetData, "<this>");
        Intrinsics.h(pendingPromoCodes, "pendingPromoCodes");
        if (!(modalBottomSheetData instanceof ModalBottomSheetData.PromoCode)) {
            return modalBottomSheetData;
        }
        ModalBottomSheetData.PromoCode promoCode = (ModalBottomSheetData.PromoCode) modalBottomSheetData;
        CheckoutRewardsAndDiscount.PromoCode promoCode2 = promoCode.f10760a;
        CheckoutPromoCodeDetail checkoutPromoCodeDetail = promoCode2.f;
        List<CheckoutPromoCode> list = checkoutPromoCodeDetail.c;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (CheckoutPromoCode checkoutPromoCode : list) {
            if (!(checkoutPromoCode instanceof CheckoutPromoCode.CheckoutPromoCodeItem)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutPromoCode.CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCode.CheckoutPromoCodeItem) checkoutPromoCode;
            String str = checkoutPromoCodeItem.f;
            arrayList.add(new CheckoutPromoCode.CheckoutPromoCodeItem(checkoutPromoCodeItem.f10575a, checkoutPromoCodeItem.b, checkoutPromoCodeItem.c, checkoutPromoCodeItem.d, checkoutPromoCodeItem.e, str, Boolean.valueOf(pendingPromoCodes.contains(str))));
        }
        return ModalBottomSheetData.PromoCode.a(promoCode, new CheckoutRewardsAndDiscount.PromoCode(promoCode2.b, promoCode2.c, promoCode2.d, promoCode2.e, new CheckoutPromoCodeDetail(checkoutPromoCodeDetail.f10576a, checkoutPromoCodeDetail.b, arrayList)), null, resText, plainText, null, null, 50);
    }

    public static final ModalBottomSheetData c(ModalBottomSheetData modalBottomSheetData, LinkedHashSet pendingStoreCreditCodes, Text text) {
        Intrinsics.h(modalBottomSheetData, "<this>");
        Intrinsics.h(pendingStoreCreditCodes, "pendingStoreCreditCodes");
        if (!(modalBottomSheetData instanceof ModalBottomSheetData.StoreCredit)) {
            return modalBottomSheetData;
        }
        StoreCreditContent storeCreditContent = ((ModalBottomSheetData.StoreCredit) modalBottomSheetData).f10762a;
        if (storeCreditContent instanceof StoreCreditContent.Success) {
            CheckoutStoreCreditDetail items = ((StoreCreditContent.Success) storeCreditContent).f10767a;
            if (items instanceof CheckoutStoreCreditDetail.Items) {
                CheckoutStoreCreditDetail.Items items2 = (CheckoutStoreCreditDetail.Items) items;
                List<CheckoutStoreCreditItem> list = items2.c;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                for (CheckoutStoreCreditItem checkoutStoreCreditItem : list) {
                    arrayList.add(new CheckoutStoreCreditItem(checkoutStoreCreditItem.f10587a, checkoutStoreCreditItem.b, checkoutStoreCreditItem.c, checkoutStoreCreditItem.d, checkoutStoreCreditItem.e, checkoutStoreCreditItem.f, checkoutStoreCreditItem.g, Boolean.valueOf(pendingStoreCreditCodes.contains(checkoutStoreCreditItem.f))));
                }
                items = new CheckoutStoreCreditDetail.Items(items2.f10585a, items2.b, arrayList);
            }
            storeCreditContent = new StoreCreditContent.Success(items);
        }
        Intrinsics.h(storeCreditContent, "storeCreditContent");
        return new ModalBottomSheetData.StoreCredit(storeCreditContent, text);
    }
}
