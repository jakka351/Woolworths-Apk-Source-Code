package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutCredit;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import au.com.woolworths.shop.checkout.domain.model.SnackBarData;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import com.woolworths.shop.checkout.ApplyCheckoutCreditMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApplyCheckoutCreditMutationApplyCheckoutCreditExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v10, types: [au.com.woolworths.shop.checkout.domain.model.address.OrderAddresses] */
    /* JADX WARN: Type inference failed for: r9v11, types: [au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewards] */
    /* JADX WARN: Type inference failed for: r9v12, types: [au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsUnregistered] */
    /* JADX WARN: Type inference failed for: r9v13, types: [au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddressEmpty] */
    /* JADX WARN: Type inference failed for: r9v14, types: [au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress] */
    /* JADX WARN: Type inference failed for: r9v16, types: [au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData] */
    /* JADX WARN: Type inference failed for: r9v7, types: [au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode] */
    /* JADX WARN: Type inference failed for: r9v8, types: [au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions] */
    /* JADX WARN: Type inference failed for: r9v9, types: [au.com.woolworths.shop.checkout.domain.model.breakdown.OrderSummaryTotalDetails] */
    public static final ApplyCheckoutCredit a(ApplyCheckoutCreditMutation.ApplyCheckoutCredit applyCheckoutCredit) {
        SnackBarData snackBarDataA;
        ArrayList arrayList;
        ArrayList arrayList2;
        CheckoutRewardsAndDiscounts checkoutRewardsAndDiscountsA;
        boolean z = applyCheckoutCredit.f21803a;
        String str = applyCheckoutCredit.b;
        ApplyCheckoutCreditMutation.CheckoutSummary checkoutSummary = applyCheckoutCredit.c;
        Checkout checkout = null;
        if (checkoutSummary != null) {
            CheckoutContentSummary checkoutContentSummary = checkoutSummary.b;
            ArrayList arrayList3 = checkoutContentSummary.d;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(CheckoutContentSummaryProgressExtKt.a((CheckoutContentSummary.Progress) it.next()));
            }
            ArrayList<CheckoutContentSummary.Content> arrayList5 = checkoutContentSummary.e;
            ArrayList arrayList6 = new ArrayList();
            for (CheckoutContentSummary.Content content : arrayList5) {
                CheckoutContentSummary.OnInsetBanner onInsetBanner = content.b;
                if (onInsetBanner != null) {
                    checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnInsetBannerExtKt.a(onInsetBanner);
                } else {
                    CheckoutContentSummary.OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress = content.c;
                    if (onCheckoutSummaryBillingAddress != null) {
                        checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutSummaryBillingAddressExtKt.a(onCheckoutSummaryBillingAddress);
                    } else {
                        CheckoutContentSummary.OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmpty = content.d;
                        if (onCheckoutSummaryBillingAddressEmpty != null) {
                            checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutSummaryBillingAddressEmptyExtKt.a(onCheckoutSummaryBillingAddressEmpty);
                        } else {
                            CheckoutContentSummary.OnCheckoutSummaryRewardsUnregistered onCheckoutSummaryRewardsUnregistered = content.e;
                            if (onCheckoutSummaryRewardsUnregistered != null) {
                                checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutSummaryRewardsUnregisteredExtKt.a(onCheckoutSummaryRewardsUnregistered);
                            } else {
                                CheckoutContentSummary.OnCheckoutSummaryRewards onCheckoutSummaryRewards = content.f;
                                if (onCheckoutSummaryRewards != null) {
                                    checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutSummaryRewardsExtKt.a(onCheckoutSummaryRewards);
                                } else {
                                    CheckoutContentSummary.OnCheckoutOrderAddresses onCheckoutOrderAddresses = content.g;
                                    if (onCheckoutOrderAddresses != null) {
                                        checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutOrderAddressesExtKt.a(onCheckoutOrderAddresses);
                                    } else {
                                        CheckoutContentSummary.OnCheckoutOrderSummary onCheckoutOrderSummary = content.h;
                                        if (onCheckoutOrderSummary != null) {
                                            checkoutRewardsAndDiscountsA = OrderSummaryTotalDetailsKt.a(onCheckoutOrderSummary);
                                        } else {
                                            CheckoutContentSummary.OnCheckoutTermsConditions onCheckoutTermsConditions = content.i;
                                            if (onCheckoutTermsConditions != null) {
                                                checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutTermsConditionsExtKt.a(onCheckoutTermsConditions);
                                            } else {
                                                CheckoutContentSummary.OnCheckoutPromotionCode onCheckoutPromotionCode = content.j;
                                                if (onCheckoutPromotionCode != null) {
                                                    checkoutRewardsAndDiscountsA = CheckoutContentSummaryOnCheckoutPromotionCodeExtKt.a(onCheckoutPromotionCode);
                                                } else {
                                                    CheckoutContentSummary.OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscounts = content.k;
                                                    checkoutRewardsAndDiscountsA = onCheckoutRewardsAndDiscounts != null ? CheckoutContentSummaryOnCheckoutRewardsAndDiscountsExtKt.a(onCheckoutRewardsAndDiscounts) : null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (checkoutRewardsAndDiscountsA != null) {
                    arrayList6.add(checkoutRewardsAndDiscountsA);
                }
            }
            CheckoutOrderTotalDetails checkoutOrderTotalDetailsA = CheckoutOrderTotalDetailsKt.a(checkoutContentSummary.f);
            CheckoutContentSummary.Message message = checkoutContentSummary.b;
            if (message != null) {
                CheckoutContentSummary.OnSnackBar onSnackBar = message.b;
                snackBarDataA = onSnackBar != null ? CheckoutContentSummaryOnSnackBarExtKt.a(onSnackBar) : null;
            } else {
                snackBarDataA = null;
            }
            ArrayList arrayList7 = checkoutContentSummary.c;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                arrayList8.add(CheckoutContentSummaryLegacyErrorExtKt.a((CheckoutContentSummary.LegacyError) it2.next()));
            }
            List list = checkoutContentSummary.f22222a;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(CheckoutContentSummaryProductsInfoExtKt.a((CheckoutContentSummary.ProductsInfo) it3.next()));
                }
            } else {
                arrayList = null;
            }
            ?? r5 = EmptyList.d;
            if (arrayList == null) {
                arrayList = r5;
            }
            CheckoutContentSummary.IdVerificationBottomSheet idVerificationBottomSheet = checkoutContentSummary.g;
            IdVerificationBottomSheet idVerificationBottomSheetA = idVerificationBottomSheet != null ? CheckoutContentSummaryIdVerificationBottomSheetExtKt.a(idVerificationBottomSheet) : null;
            List list3 = checkoutContentSummary.h;
            if (list3 != null) {
                List list4 = list3;
                arrayList2 = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(CheckoutContentSummaryImpressionAnalytic1ExtKt.a((CheckoutContentSummary.ImpressionAnalytic1) it4.next()));
                }
            } else {
                arrayList2 = null;
            }
            ArrayList arrayList9 = arrayList2 == null ? r5 : arrayList2;
            Boolean bool = checkoutContentSummary.i;
            CheckoutContentSummary.RestrictionPrompt restrictionPrompt = checkoutContentSummary.j;
            checkout = new Checkout(arrayList4, arrayList6, checkoutOrderTotalDetailsA, snackBarDataA, arrayList8, arrayList, idVerificationBottomSheetA, arrayList9, bool, restrictionPrompt != null ? CheckoutContentSummaryRestrictionPromptExtKt.a(restrictionPrompt) : null);
        }
        return new ApplyCheckoutCredit(z, str, checkout);
    }
}
