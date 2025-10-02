package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAction;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData;", "", "Info", "RewardsQuantitySelector", "StoreCredit", "PromoCode", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$Info;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$PromoCode;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$RewardsQuantitySelector;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$StoreCredit;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ModalBottomSheetData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$Info;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final String f10759a;
        public final String b;
        public final String c;
        public final AnalyticsData d;

        public Info(String str, String str2, String str3, AnalyticsData analyticsData) {
            this.f10759a = str;
            this.b = str2;
            this.c = str3;
            this.d = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f10759a, info.f10759a) && Intrinsics.c(this.b, info.b) && Intrinsics.c(this.c, info.c) && Intrinsics.c(this.d, info.d);
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f10759a.hashCode() * 31, 31, this.b), 31, this.c);
            AnalyticsData analyticsData = this.d;
            return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Info(title=", this.f10759a, ", description=", this.b, ", buttonTitle=");
            sbV.append(this.c);
            sbV.append(", buttonClickAnalytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$PromoCode;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromoCode extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutRewardsAndDiscount.PromoCode f10760a;
        public final String b;
        public final Text c;
        public final Text d;
        public final ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation e;
        public final ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo f;

        public PromoCode(CheckoutRewardsAndDiscount.PromoCode promoCode, String str, Text text, Text text2, ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation, ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo) {
            Intrinsics.h(promoCode, "promoCode");
            this.f10760a = promoCode;
            this.b = str;
            this.c = text;
            this.d = text2;
            this.e = applyCheckoutPromoCodeConfirmation;
            this.f = applyCheckoutPromoCodeAdditionalInfo;
        }

        public static PromoCode a(PromoCode promoCode, CheckoutRewardsAndDiscount.PromoCode promoCode2, String str, Text text, Text text2, ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation, ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo, int i) {
            if ((i & 1) != 0) {
                promoCode2 = promoCode.f10760a;
            }
            CheckoutRewardsAndDiscount.PromoCode promoCode3 = promoCode2;
            if ((i & 2) != 0) {
                str = promoCode.b;
            }
            String promoCodeToApply = str;
            if ((i & 4) != 0) {
                text = promoCode.c;
            }
            Text text3 = text;
            if ((i & 8) != 0) {
                text2 = promoCode.d;
            }
            Text text4 = text2;
            if ((i & 16) != 0) {
                applyCheckoutPromoCodeConfirmation = promoCode.e;
            }
            ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation2 = applyCheckoutPromoCodeConfirmation;
            if ((i & 32) != 0) {
                applyCheckoutPromoCodeAdditionalInfo = promoCode.f;
            }
            promoCode.getClass();
            Intrinsics.h(promoCode3, "promoCode");
            Intrinsics.h(promoCodeToApply, "promoCodeToApply");
            return new PromoCode(promoCode3, promoCodeToApply, text3, text4, applyCheckoutPromoCodeConfirmation2, applyCheckoutPromoCodeAdditionalInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoCode)) {
                return false;
            }
            PromoCode promoCode = (PromoCode) obj;
            return Intrinsics.c(this.f10760a, promoCode.f10760a) && Intrinsics.c(this.b, promoCode.b) && Intrinsics.c(this.c, promoCode.c) && Intrinsics.c(this.d, promoCode.d) && Intrinsics.c(this.e, promoCode.e) && Intrinsics.c(this.f, promoCode.f);
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(this.f10760a.hashCode() * 31, 31, this.b);
            Text text = this.c;
            int iHashCode = (iC + (text == null ? 0 : text.hashCode())) * 31;
            Text text2 = this.d;
            int iHashCode2 = (iHashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
            ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation = this.e;
            int iHashCode3 = (iHashCode2 + (applyCheckoutPromoCodeConfirmation == null ? 0 : applyCheckoutPromoCodeConfirmation.hashCode())) * 31;
            ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo applyCheckoutPromoCodeAdditionalInfo = this.f;
            return iHashCode3 + (applyCheckoutPromoCodeAdditionalInfo != null ? applyCheckoutPromoCodeAdditionalInfo.hashCode() : 0);
        }

        public final String toString() {
            return "PromoCode(promoCode=" + this.f10760a + ", promoCodeToApply=" + this.b + ", snackbarMessage=" + this.c + ", inlineMessage=" + this.d + ", confirmationDialogData=" + this.e + ", additionalInfo=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$RewardsQuantitySelector;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsQuantitySelector extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutRewardsAction.CheckoutRewardsRedeem f10761a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public RewardsQuantitySelector(CheckoutRewardsAction.CheckoutRewardsRedeem checkoutRewardsRedeem, int i, boolean z, boolean z2, boolean z3) {
            Intrinsics.h(checkoutRewardsRedeem, "checkoutRewardsRedeem");
            this.f10761a = checkoutRewardsRedeem;
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public static RewardsQuantitySelector a(RewardsQuantitySelector rewardsQuantitySelector, int i, boolean z, int i2) {
            CheckoutRewardsAction.CheckoutRewardsRedeem checkoutRewardsRedeem = rewardsQuantitySelector.f10761a;
            if ((i2 & 2) != 0) {
                i = rewardsQuantitySelector.b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = rewardsQuantitySelector.c;
            }
            boolean z2 = z;
            boolean z3 = rewardsQuantitySelector.d;
            boolean z4 = (i2 & 16) != 0 ? rewardsQuantitySelector.e : true;
            rewardsQuantitySelector.getClass();
            Intrinsics.h(checkoutRewardsRedeem, "checkoutRewardsRedeem");
            return new RewardsQuantitySelector(checkoutRewardsRedeem, i3, z2, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsQuantitySelector)) {
                return false;
            }
            RewardsQuantitySelector rewardsQuantitySelector = (RewardsQuantitySelector) obj;
            return Intrinsics.c(this.f10761a, rewardsQuantitySelector.f10761a) && this.b == rewardsQuantitySelector.b && this.c == rewardsQuantitySelector.c && this.d == rewardsQuantitySelector.d && this.e == rewardsQuantitySelector.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.a(this.b, this.f10761a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RewardsQuantitySelector(checkoutRewardsRedeem=");
            sb.append(this.f10761a);
            sb.append(", selectedQuantityIndex=");
            sb.append(this.b);
            sb.append(", redeemable=");
            au.com.woolworths.android.onesite.a.D(sb, this.c, ", isUsingRewardsDollars=", this.d, ", shouldDismiss=");
            return YU.a.k(")", sb, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$StoreCredit;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreCredit extends ModalBottomSheetData {

        /* renamed from: a, reason: collision with root package name */
        public final StoreCreditContent f10762a;
        public final Text b;

        public StoreCredit(StoreCreditContent storeCreditContent, Text text) {
            Intrinsics.h(storeCreditContent, "storeCreditContent");
            this.f10762a = storeCreditContent;
            this.b = text;
        }

        public static StoreCredit a(StoreCredit storeCredit, StoreCreditContent storeCreditContent, int i) {
            if ((i & 1) != 0) {
                storeCreditContent = storeCredit.f10762a;
            }
            Text text = (i & 2) != 0 ? storeCredit.b : null;
            storeCredit.getClass();
            Intrinsics.h(storeCreditContent, "storeCreditContent");
            return new StoreCredit(storeCreditContent, text);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreCredit)) {
                return false;
            }
            StoreCredit storeCredit = (StoreCredit) obj;
            return Intrinsics.c(this.f10762a, storeCredit.f10762a) && Intrinsics.c(this.b, storeCredit.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10762a.hashCode() * 31;
            Text text = this.b;
            return iHashCode + (text == null ? 0 : text.hashCode());
        }

        public final String toString() {
            return "StoreCredit(storeCreditContent=" + this.f10762a + ", snackbarMessage=" + this.b + ")";
        }
    }
}
