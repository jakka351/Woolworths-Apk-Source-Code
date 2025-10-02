package au.com.woolworths.shop.deliveryunlimited.signup.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedIconItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTerms;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/domain/model/DeliveryUnlimitedPaymentResponse;", "", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, lqlqqlq.mmm006Dm006Dm, "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedIconItem;", "iconItem", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "footer", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTerms;", "terms", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodSection;", "paymentMethodSection", "", "Lau/com/woolworths/analytics/model/AnalyticsData;", "analytics", "", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedIconItem;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTerms;Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodSection;Ljava/util/List;Ljava/util/Map;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "c", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedIconItem;", "e", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedIconItem;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "d", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTerms;", "g", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTerms;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodSection;", "f", "()Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodSection;", "Ljava/util/List;", "b", "()Ljava/util/List;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedPaymentResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10874a;

    @SerializedName("analytics")
    @NotNull
    private final List<AnalyticsData> analytics;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @Nullable
    private final String description;

    @SerializedName("footer")
    @NotNull
    private final DeliveryUnlimitedSignUpFooter footer;

    @SerializedName("iconItem")
    @Nullable
    private final DeliveryUnlimitedIconItem iconItem;

    @SerializedName("paymentMethodSection")
    @NotNull
    private final PaymentMethodSection paymentMethodSection;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @NotNull
    private final String subtitle;

    @SerializedName("terms")
    @NotNull
    private final DeliveryUnlimitedSubscribeTerms terms;

    @SerializedName("title")
    @NotNull
    private final String title;

    public DeliveryUnlimitedPaymentResponse(@NotNull String title, @NotNull String subtitle, @Nullable String str, @Nullable DeliveryUnlimitedIconItem deliveryUnlimitedIconItem, @NotNull DeliveryUnlimitedSignUpFooter footer, @NotNull DeliveryUnlimitedSubscribeTerms terms, @NotNull PaymentMethodSection paymentMethodSection, @NotNull List<AnalyticsData> analytics, @NotNull Map<String, String> headers) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(footer, "footer");
        Intrinsics.h(terms, "terms");
        Intrinsics.h(paymentMethodSection, "paymentMethodSection");
        Intrinsics.h(analytics, "analytics");
        Intrinsics.h(headers, "headers");
        this.title = title;
        this.subtitle = subtitle;
        this.description = str;
        this.iconItem = deliveryUnlimitedIconItem;
        this.footer = footer;
        this.terms = terms;
        this.paymentMethodSection = paymentMethodSection;
        this.analytics = analytics;
        this.f10874a = headers;
    }

    public static DeliveryUnlimitedPaymentResponse a(DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse, LinkedHashMap linkedHashMap) {
        String title = deliveryUnlimitedPaymentResponse.title;
        String subtitle = deliveryUnlimitedPaymentResponse.subtitle;
        String str = deliveryUnlimitedPaymentResponse.description;
        DeliveryUnlimitedIconItem deliveryUnlimitedIconItem = deliveryUnlimitedPaymentResponse.iconItem;
        DeliveryUnlimitedSignUpFooter footer = deliveryUnlimitedPaymentResponse.footer;
        DeliveryUnlimitedSubscribeTerms terms = deliveryUnlimitedPaymentResponse.terms;
        PaymentMethodSection paymentMethodSection = deliveryUnlimitedPaymentResponse.paymentMethodSection;
        List<AnalyticsData> analytics = deliveryUnlimitedPaymentResponse.analytics;
        deliveryUnlimitedPaymentResponse.getClass();
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(footer, "footer");
        Intrinsics.h(terms, "terms");
        Intrinsics.h(paymentMethodSection, "paymentMethodSection");
        Intrinsics.h(analytics, "analytics");
        return new DeliveryUnlimitedPaymentResponse(title, subtitle, str, deliveryUnlimitedIconItem, footer, terms, paymentMethodSection, analytics, linkedHashMap);
    }

    /* renamed from: b, reason: from getter */
    public final List getAnalytics() {
        return this.analytics;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final DeliveryUnlimitedSignUpFooter getFooter() {
        return this.footer;
    }

    /* renamed from: e, reason: from getter */
    public final DeliveryUnlimitedIconItem getIconItem() {
        return this.iconItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedPaymentResponse)) {
            return false;
        }
        DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse = (DeliveryUnlimitedPaymentResponse) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedPaymentResponse.title) && Intrinsics.c(this.subtitle, deliveryUnlimitedPaymentResponse.subtitle) && Intrinsics.c(this.description, deliveryUnlimitedPaymentResponse.description) && Intrinsics.c(this.iconItem, deliveryUnlimitedPaymentResponse.iconItem) && Intrinsics.c(this.footer, deliveryUnlimitedPaymentResponse.footer) && Intrinsics.c(this.terms, deliveryUnlimitedPaymentResponse.terms) && Intrinsics.c(this.paymentMethodSection, deliveryUnlimitedPaymentResponse.paymentMethodSection) && Intrinsics.c(this.analytics, deliveryUnlimitedPaymentResponse.analytics) && Intrinsics.c(this.f10874a, deliveryUnlimitedPaymentResponse.f10874a);
    }

    /* renamed from: f, reason: from getter */
    public final PaymentMethodSection getPaymentMethodSection() {
        return this.paymentMethodSection;
    }

    /* renamed from: g, reason: from getter */
    public final DeliveryUnlimitedSubscribeTerms getTerms() {
        return this.terms;
    }

    public final int hashCode() {
        int iC = b.c(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryUnlimitedIconItem deliveryUnlimitedIconItem = this.iconItem;
        return this.f10874a.hashCode() + b.d((this.paymentMethodSection.hashCode() + ((this.terms.hashCode() + ((this.footer.hashCode() + ((iHashCode + (deliveryUnlimitedIconItem != null ? deliveryUnlimitedIconItem.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.analytics);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.description;
        DeliveryUnlimitedIconItem deliveryUnlimitedIconItem = this.iconItem;
        DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter = this.footer;
        DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms = this.terms;
        PaymentMethodSection paymentMethodSection = this.paymentMethodSection;
        List<AnalyticsData> list = this.analytics;
        StringBuilder sbV = a.v("DeliveryUnlimitedPaymentResponse(title=", str, ", subtitle=", str2, ", description=");
        sbV.append(str3);
        sbV.append(", iconItem=");
        sbV.append(deliveryUnlimitedIconItem);
        sbV.append(", footer=");
        sbV.append(deliveryUnlimitedSignUpFooter);
        sbV.append(", terms=");
        sbV.append(deliveryUnlimitedSubscribeTerms);
        sbV.append(", paymentMethodSection=");
        sbV.append(paymentMethodSection);
        sbV.append(", analytics=");
        sbV.append(list);
        sbV.append(", headers=");
        sbV.append(this.f10874a);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ DeliveryUnlimitedPaymentResponse(String str, String str2, String str3, DeliveryUnlimitedIconItem deliveryUnlimitedIconItem, DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter, DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms, PaymentMethodSection paymentMethodSection, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, deliveryUnlimitedIconItem, deliveryUnlimitedSignUpFooter, deliveryUnlimitedSubscribeTerms, paymentMethodSection, list, (i & 256) != 0 ? EmptyMap.d : map);
    }
}
