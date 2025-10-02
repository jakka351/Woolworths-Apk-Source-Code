package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem;", "", "AddGiftCard", "LinkedGiftCard", "UnlinkedGiftCard", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$AddGiftCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$LinkedGiftCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$UnlinkedGiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class GiftCardItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$AddGiftCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddGiftCard extends GiftCardItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f8290a;
        public final AnalyticsData b;

        public AddGiftCard(String str, AnalyticsData analyticsData) {
            this.f8290a = str;
            this.b = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddGiftCard)) {
                return false;
            }
            AddGiftCard addGiftCard = (AddGiftCard) obj;
            return Intrinsics.c(this.f8290a, addGiftCard.f8290a) && Intrinsics.c(this.b, addGiftCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8290a.hashCode() * 31);
        }

        public final String toString() {
            return "AddGiftCard(title=" + this.f8290a + ", clickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$LinkedGiftCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedGiftCard extends GiftCardItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f8291a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final int f;
        public final InsetBannerApiData g;
        public final String h;

        public LinkedGiftCard(String str, String str2, boolean z, String str3, String str4, int i, InsetBannerApiData insetBannerApiData, String str5) {
            this.f8291a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = i;
            this.g = insetBannerApiData;
            this.h = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkedGiftCard)) {
                return false;
            }
            LinkedGiftCard linkedGiftCard = (LinkedGiftCard) obj;
            return Intrinsics.c(this.f8291a, linkedGiftCard.f8291a) && Intrinsics.c(this.b, linkedGiftCard.b) && this.c == linkedGiftCard.c && Intrinsics.c(this.d, linkedGiftCard.d) && Intrinsics.c(this.e, linkedGiftCard.e) && this.f == linkedGiftCard.f && Intrinsics.c(this.g, linkedGiftCard.g) && Intrinsics.c(this.h, linkedGiftCard.h);
        }

        public final int hashCode() {
            int iA = b.a(this.f, b.c(b.c(b.e(b.c(this.f8291a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
            InsetBannerApiData insetBannerApiData = this.g;
            int iHashCode = (iA + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
            String str = this.h;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("LinkedGiftCard(id=", this.f8291a, ", title=", this.b, ", isSelected=");
            au.com.woolworths.android.onesite.a.y(", amountTitle=", this.d, ", amountValue=", sbV, this.c);
            a.x(this.f, this.e, ", amountRedeem=", ", errorBanner=", sbV);
            sbV.append(this.g);
            sbV.append(", snackBarMessage=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem$UnlinkedGiftCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/GiftCardItem;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkedGiftCard extends GiftCardItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f8292a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final String f;
        public final int g;
        public final InsetBannerApiData h;
        public final String i;

        public UnlinkedGiftCard(String str, String str2, String str3, boolean z, String str4, String str5, int i, InsetBannerApiData insetBannerApiData, String str6) {
            this.f8292a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = str5;
            this.g = i;
            this.h = insetBannerApiData;
            this.i = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlinkedGiftCard)) {
                return false;
            }
            UnlinkedGiftCard unlinkedGiftCard = (UnlinkedGiftCard) obj;
            return Intrinsics.c(this.f8292a, unlinkedGiftCard.f8292a) && Intrinsics.c(this.b, unlinkedGiftCard.b) && Intrinsics.c(this.c, unlinkedGiftCard.c) && this.d == unlinkedGiftCard.d && Intrinsics.c(this.e, unlinkedGiftCard.e) && Intrinsics.c(this.f, unlinkedGiftCard.f) && this.g == unlinkedGiftCard.g && Intrinsics.c(this.h, unlinkedGiftCard.h) && Intrinsics.c(this.i, unlinkedGiftCard.i);
        }

        public final int hashCode() {
            int iA = b.a(this.g, b.c(b.c(b.e(b.c(b.c(this.f8292a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
            InsetBannerApiData insetBannerApiData = this.h;
            int iHashCode = (iA + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
            String str = this.i;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("UnlinkedGiftCard(number=", this.f8292a, ", pin=", this.b, ", title=");
            d.A(this.c, ", isSelected=", ", amountTitle=", sbV, this.d);
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", amountValue=", this.f, ", amountRedeem=");
            sbV.append(this.g);
            sbV.append(", errorBanner=");
            sbV.append(this.h);
            sbV.append(", snackBarMessage=");
            return a.o(sbV, this.i, ")");
        }
    }
}
