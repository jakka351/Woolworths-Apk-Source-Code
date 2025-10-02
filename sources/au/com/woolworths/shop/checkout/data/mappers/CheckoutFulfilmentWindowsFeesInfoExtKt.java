package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutFulfilmentWindowsFeesInfoExtKt {
    public static final FulfilmentExtraInfo a(CheckoutFulfilmentWindows.FeesInfo feesInfo) {
        Object objA;
        Intrinsics.h(feesInfo, "<this>");
        com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo fulfilmentExtraInfo = feesInfo.b;
        String str = fulfilmentExtraInfo.f22478a;
        ArrayList<FulfilmentExtraInfo.Content> arrayList = fulfilmentExtraInfo.b;
        ArrayList arrayList2 = new ArrayList();
        for (FulfilmentExtraInfo.Content content : arrayList) {
            FulfilmentExtraInfo.OnBasicInsetAlert onBasicInsetAlert = content.b;
            if (onBasicInsetAlert != null) {
                objA = FulfilmentExtraInfoOnBasicInsetAlertExtKt.a(onBasicInsetAlert);
            } else {
                FulfilmentExtraInfo.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = content.c;
                if (onBasicCoreBroadcastBanner != null) {
                    objA = FulfilmentExtraInfoOnBasicCoreBroadcastBannerExtKt.a(onBasicCoreBroadcastBanner);
                } else {
                    FulfilmentExtraInfo.OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection = content.d;
                    if (onFulfilmentFeesInfoSection != null) {
                        objA = FulfilmentExtraInfoOnFulfilmentFeesInfoSectionExtKt.a(onFulfilmentFeesInfoSection);
                    } else {
                        FulfilmentExtraInfo.OnCheckoutTermsConditions onCheckoutTermsConditions = content.e;
                        if (onCheckoutTermsConditions != null) {
                            objA = new CheckoutTermsConditions(onCheckoutTermsConditions.f22494a);
                        } else {
                            FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion = content.f;
                            objA = onFulfilmentInfoRowAccordion != null ? FulfilmentExtraInfoOnFulfilmentInfoRowAccordionExtKt.a(onFulfilmentInfoRowAccordion) : null;
                        }
                    }
                }
            }
            if (objA != null) {
                arrayList2.add(objA);
            }
        }
        return new au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo(str, arrayList2);
    }
}
