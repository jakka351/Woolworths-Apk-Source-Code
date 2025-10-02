package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem;", "", "CreditCard", "PayPal", "GooglePay", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentMethodItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$GooglePay;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePay implements PaymentMethodItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f8306a;
        public final boolean b;
        public final String c;
        public final String d;
        public final int e;
        public final String f;
        public final Object g;

        public GooglePay(String str, String str2, String str3, String str4, boolean z, int i, List list) {
            this.f8306a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = str4;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) obj;
            return this.f8306a.equals(googlePay.f8306a) && this.b == googlePay.b && this.c.equals(googlePay.c) && this.d.equals(googlePay.d) && this.e == googlePay.e && this.f.equals(googlePay.f) && this.g.equals(googlePay.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.c(b.a(this.e, b.c(b.c(b.e(this.f8306a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("GooglePay(title=", this.f8306a, ", isSelected=", ", amountTitle=", this.b);
            a.B(sbQ, this.c, ", amountValue=", this.d, ", amountToPay=");
            androidx.compose.ui.input.pointer.a.u(this.e, ", id=", this.f, ", supportedNetworks=", sbQ);
            return android.support.v4.media.session.a.o(this.g, ")", sbQ);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem;", "Add", "Linked", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal$Add;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal$Linked;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PayPal extends PaymentMethodItem {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal$Add;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Add implements PayPal {

            /* renamed from: a, reason: collision with root package name */
            public final String f8307a;
            public final String b;
            public final AddPayPalAlert c;

            public Add(String str, String str2, AddPayPalAlert addPayPalAlert) {
                this.f8307a = str;
                this.b = str2;
                this.c = addPayPalAlert;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Add)) {
                    return false;
                }
                Add add = (Add) obj;
                return Intrinsics.c(this.f8307a, add.f8307a) && Intrinsics.c(this.b, add.b) && Intrinsics.c(this.c, add.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + b.c(this.f8307a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sbV = YU.a.v("Add(icon=", this.f8307a, ", title=", this.b, ", alert=");
                sbV.append(this.c);
                sbV.append(")");
                return sbV.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal$Linked;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$PayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Linked implements PayPal {

            /* renamed from: a, reason: collision with root package name */
            public final String f8308a;
            public final String b;
            public final String c;
            public final boolean d;
            public final String e;
            public final String f;
            public final int g;

            public Linked(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
                this.f8308a = str;
                this.b = str2;
                this.c = str3;
                this.d = z;
                this.e = str4;
                this.f = str5;
                this.g = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Linked)) {
                    return false;
                }
                Linked linked = (Linked) obj;
                return Intrinsics.c(this.f8308a, linked.f8308a) && Intrinsics.c(this.b, linked.b) && Intrinsics.c(this.c, linked.c) && this.d == linked.d && Intrinsics.c(this.e, linked.e) && Intrinsics.c(this.f, linked.f) && this.g == linked.g;
            }

            public final int hashCode() {
                return Integer.hashCode(this.g) + b.c(b.c(b.e(b.c(b.c(this.f8308a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            }

            public final String toString() {
                StringBuilder sbV = YU.a.v("Linked(id=", this.f8308a, ", icon=", this.b, ", title=");
                d.A(this.c, ", isSelected=", ", amountTitle=", sbV, this.d);
                a.B(sbV, this.e, ", amountValue=", this.f, ", amountToPay=");
                return YU.a.m(sbV, this.g, ")");
            }
        }
    }

    default boolean isActive() {
        if ((this instanceof CreditCard.Add) || (this instanceof CreditCard.Expired)) {
            return false;
        }
        if (this instanceof CreditCard.Linked) {
            CreditCard.Linked linked = (CreditCard.Linked) this;
            if (linked.getIsSelected() && linked.getAmountToPay() > 0) {
                return true;
            }
        } else if (this instanceof CreditCard.Unlinked) {
            CreditCard.Unlinked unlinked = (CreditCard.Unlinked) this;
            if (unlinked.e && unlinked.h > 0) {
                return true;
            }
        } else if (this instanceof GooglePay) {
            GooglePay googlePay = (GooglePay) this;
            if (googlePay.b && googlePay.e > 0) {
                return true;
            }
        } else {
            if (this instanceof PayPal.Add) {
                return false;
            }
            if (!(this instanceof PayPal.Linked)) {
                throw new NoWhenBranchMatchedException();
            }
            PayPal.Linked linked2 = (PayPal.Linked) this;
            if (linked2.d && linked2.g > 0) {
                return true;
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem;", "Add", "Linked", "Unlinked", "Expired", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Add;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Expired;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Linked;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Unlinked;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CreditCard extends PaymentMethodItem {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Expired;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "", "id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "a", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Expired implements CreditCard {

            @SerializedName(BarcodePickDeserializer.FIELD_ICON)
            @NotNull
            private final String icon;

            @SerializedName("id")
            @NotNull
            private final String id;

            @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
            @Nullable
            private final String subtitle;

            @SerializedName("title")
            @NotNull
            private final String title;

            public Expired(@NotNull String id, @NotNull String title, @Nullable String str, @NotNull String icon) {
                Intrinsics.h(id, "id");
                Intrinsics.h(title, "title");
                Intrinsics.h(icon, "icon");
                this.id = id;
                this.title = title;
                this.subtitle = str;
                this.icon = icon;
            }

            /* renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: c, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Expired)) {
                    return false;
                }
                Expired expired = (Expired) obj;
                return Intrinsics.c(this.id, expired.id) && Intrinsics.c(this.title, expired.title) && Intrinsics.c(this.subtitle, expired.subtitle) && Intrinsics.c(this.icon, expired.icon);
            }

            public final int hashCode() {
                int iC = b.c(this.id.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                return this.icon.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                String str = this.id;
                String str2 = this.title;
                return a.l(YU.a.v("Expired(id=", str, ", title=", str2, ", subtitle="), this.subtitle, ", icon=", this.icon, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Linked;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "", "id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON, "", "isSelected", "amountTitle", "amountValue", "", "amountToPay", "cvvUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "h", "g", "e", "Z", "i", "()Z", "a", "c", "I", "b", "()I", "d", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Linked implements CreditCard {

            @SerializedName("amountTitle")
            @NotNull
            private final String amountTitle;

            @SerializedName("amountToPay")
            private final int amountToPay;

            @SerializedName("amountValue")
            @NotNull
            private final String amountValue;

            @SerializedName("cvvUrl")
            @NotNull
            private final String cvvUrl;

            @SerializedName(BarcodePickDeserializer.FIELD_ICON)
            @NotNull
            private final String icon;

            @SerializedName("id")
            @NotNull
            private final String id;

            @SerializedName("isSelected")
            private final boolean isSelected;

            @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
            @Nullable
            private final String subtitle;

            @SerializedName("title")
            @NotNull
            private final String title;

            public Linked(@NotNull String id, @NotNull String title, @Nullable String str, @NotNull String icon, boolean z, @NotNull String amountTitle, @NotNull String amountValue, int i, @NotNull String cvvUrl) {
                Intrinsics.h(id, "id");
                Intrinsics.h(title, "title");
                Intrinsics.h(icon, "icon");
                Intrinsics.h(amountTitle, "amountTitle");
                Intrinsics.h(amountValue, "amountValue");
                Intrinsics.h(cvvUrl, "cvvUrl");
                this.id = id;
                this.title = title;
                this.subtitle = str;
                this.icon = icon;
                this.isSelected = z;
                this.amountTitle = amountTitle;
                this.amountValue = amountValue;
                this.amountToPay = i;
                this.cvvUrl = cvvUrl;
            }

            /* renamed from: a, reason: from getter */
            public final String getAmountTitle() {
                return this.amountTitle;
            }

            /* renamed from: b, reason: from getter */
            public final int getAmountToPay() {
                return this.amountToPay;
            }

            /* renamed from: c, reason: from getter */
            public final String getAmountValue() {
                return this.amountValue;
            }

            /* renamed from: d, reason: from getter */
            public final String getCvvUrl() {
                return this.cvvUrl;
            }

            /* renamed from: e, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Linked)) {
                    return false;
                }
                Linked linked = (Linked) obj;
                return Intrinsics.c(this.id, linked.id) && Intrinsics.c(this.title, linked.title) && Intrinsics.c(this.subtitle, linked.subtitle) && Intrinsics.c(this.icon, linked.icon) && this.isSelected == linked.isSelected && Intrinsics.c(this.amountTitle, linked.amountTitle) && Intrinsics.c(this.amountValue, linked.amountValue) && this.amountToPay == linked.amountToPay && Intrinsics.c(this.cvvUrl, linked.cvvUrl);
            }

            /* renamed from: f, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: g, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: h, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iC = b.c(this.id.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                return this.cvvUrl.hashCode() + b.a(this.amountToPay, b.c(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31, this.isSelected), 31, this.amountTitle), 31, this.amountValue), 31);
            }

            /* renamed from: i, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public final String toString() {
                String str = this.id;
                String str2 = this.title;
                String str3 = this.subtitle;
                String str4 = this.icon;
                boolean z = this.isSelected;
                String str5 = this.amountTitle;
                String str6 = this.amountValue;
                int i = this.amountToPay;
                String str7 = this.cvvUrl;
                StringBuilder sbV = YU.a.v("Linked(id=", str, ", title=", str2, ", subtitle=");
                a.B(sbV, str3, ", icon=", str4, ", isSelected=");
                au.com.woolworths.android.onesite.a.y(", amountTitle=", str5, ", amountValue=", sbV, z);
                YU.a.x(i, str6, ", amountToPay=", ", cvvUrl=", sbV);
                return YU.a.o(sbV, str7, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Unlinked;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Unlinked implements CreditCard {

            /* renamed from: a, reason: collision with root package name */
            public final String f8305a;
            public final String b;
            public final String c;
            public final String d;
            public final boolean e;
            public final String f;
            public final String g;
            public final int h;

            public Unlinked(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
                this.f8305a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = z;
                this.f = str5;
                this.g = str6;
                this.h = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unlinked)) {
                    return false;
                }
                Unlinked unlinked = (Unlinked) obj;
                return Intrinsics.c(this.f8305a, unlinked.f8305a) && Intrinsics.c(this.b, unlinked.b) && Intrinsics.c(this.c, unlinked.c) && Intrinsics.c(this.d, unlinked.d) && this.e == unlinked.e && Intrinsics.c(this.f, unlinked.f) && Intrinsics.c(this.g, unlinked.g) && this.h == unlinked.h;
            }

            public final int hashCode() {
                int iC = b.c(this.f8305a.hashCode() * 31, 31, this.b);
                String str = this.c;
                return Integer.hashCode(this.h) + b.c(b.c(b.e(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sbV = YU.a.v("Unlinked(id=", this.f8305a, ", title=", this.b, ", subtitle=");
                a.B(sbV, this.c, ", icon=", this.d, ", isSelected=");
                au.com.woolworths.android.onesite.a.y(", amountTitle=", this.f, ", amountValue=", sbV, this.e);
                sbV.append(this.g);
                sbV.append(", amountToPay=");
                sbV.append(this.h);
                sbV.append(")");
                return sbV.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Add;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard;", "", "title", "Lau/com/woolworths/analytics/model/AnalyticsData;", "clickAnalytics", "<init>", "(Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "a", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Add implements CreditCard {

            @SerializedName("clickAnalytics")
            @NotNull
            private final AnalyticsData clickAnalytics;

            @SerializedName("title")
            @NotNull
            private final String title;

            public Add(@NotNull String title, @NotNull AnalyticsData clickAnalytics) {
                Intrinsics.h(title, "title");
                Intrinsics.h(clickAnalytics, "clickAnalytics");
                this.title = title;
                this.clickAnalytics = clickAnalytics;
            }

            /* renamed from: a, reason: from getter */
            public final AnalyticsData getClickAnalytics() {
                return this.clickAnalytics;
            }

            /* renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Add)) {
                    return false;
                }
                Add add = (Add) obj;
                return Intrinsics.c(this.title, add.title) && Intrinsics.c(this.clickAnalytics, add.clickAnalytics);
            }

            public final int hashCode() {
                return this.clickAnalytics.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return "Add(title=" + this.title + ", clickAnalytics=" + this.clickAnalytics + ")";
            }

            public /* synthetic */ Add(String str, AnalyticsData analyticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                AnalyticsData analyticsData2;
                if ((i & 2) != 0) {
                    analyticsData2 = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
                } else {
                    analyticsData2 = analyticsData;
                }
                this(str, analyticsData2);
            }
        }
    }
}
