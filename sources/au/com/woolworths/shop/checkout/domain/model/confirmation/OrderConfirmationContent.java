package au.com.woolworths.shop.checkout.domain.model.confirmation;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "BannerImage", "Header", "OrderAddresses", "OrderSummary", "IconTextBanner", "FooterText", "DynamicSizeAdBannerData", "UniversalInventoryContainer", "VocPlaceholder", "OrderConfirmationCmoBroadcastBanner", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$BannerImage;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$DynamicSizeAdBannerData;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$FooterText;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$Header;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$IconTextBanner;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderAddresses;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderConfirmationCmoBroadcastBanner;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderSummary;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$UniversalInventoryContainer;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$VocPlaceholder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OrderConfirmationContent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$BannerImage;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "imageUrl", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImage implements OrderConfirmationContent {

        @SerializedName("altText")
        @NotNull
        private final String altText;

        @SerializedName("imageUrl")
        @NotNull
        private final String imageUrl;

        public BannerImage(@NotNull String imageUrl, @NotNull String altText) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(altText, "altText");
            this.imageUrl = imageUrl;
            this.altText = altText;
        }

        /* renamed from: a, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        /* renamed from: b, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerImage)) {
                return false;
            }
            BannerImage bannerImage = (BannerImage) obj;
            return Intrinsics.c(this.imageUrl, bannerImage.imageUrl) && Intrinsics.c(this.altText, bannerImage.altText);
        }

        public final int hashCode() {
            return this.altText.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        public final String toString() {
            return a.j("BannerImage(imageUrl=", this.imageUrl, ", altText=", this.altText, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$DynamicSizeAdBannerData;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DynamicSizeAdBannerData implements OrderConfirmationContent {

        /* renamed from: a, reason: collision with root package name */
        public final DynamicSizeCardData f10650a;

        public DynamicSizeAdBannerData(DynamicSizeCardData dynamicSizeCardData) {
            this.f10650a = dynamicSizeCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DynamicSizeAdBannerData) && Intrinsics.c(this.f10650a, ((DynamicSizeAdBannerData) obj).f10650a);
        }

        public final int hashCode() {
            return this.f10650a.hashCode();
        }

        public final String toString() {
            return "DynamicSizeAdBannerData(dynamicSizeCardData=" + this.f10650a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$FooterText;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterText implements OrderConfirmationContent {

        @SerializedName(TextBundle.TEXT_ENTRY)
        @NotNull
        private final String text;

        public FooterText(@NotNull String text) {
            Intrinsics.h(text, "text");
            this.text = text;
        }

        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterText) && Intrinsics.c(this.text, ((FooterText) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return a.h("FooterText(text=", this.text, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$Header;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsSection;", "order", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header implements OrderConfirmationContent {

        @SerializedName("order")
        @NotNull
        private final List<OrderTotalDetailsSection> order;

        @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
        @NotNull
        private final String subtitle;

        @SerializedName("title")
        @NotNull
        private final String title;

        public Header(@NotNull String title, @NotNull String subtitle, @NotNull List<OrderTotalDetailsSection> order) {
            Intrinsics.h(title, "title");
            Intrinsics.h(subtitle, "subtitle");
            Intrinsics.h(order, "order");
            this.title = title;
            this.subtitle = subtitle;
            this.order = order;
        }

        /* renamed from: a, reason: from getter */
        public final List getOrder() {
            return this.order;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.title, header.title) && Intrinsics.c(this.subtitle, header.subtitle) && Intrinsics.c(this.order, header.order);
        }

        public final int hashCode() {
            return this.order.hashCode() + b.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return android.support.v4.media.session.a.t(a.v("Header(title=", str, ", subtitle=", str2, ", order="), this.order, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$IconTextBanner;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "imageUrl", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IconTextBanner implements OrderConfirmationContent {

        @SerializedName("imageUrl")
        @NotNull
        private final String imageUrl;

        @SerializedName("title")
        @NotNull
        private final String title;

        public IconTextBanner(@NotNull String imageUrl, @NotNull String title) {
            Intrinsics.h(imageUrl, "imageUrl");
            Intrinsics.h(title, "title");
            this.imageUrl = imageUrl;
            this.title = title;
        }

        /* renamed from: a, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconTextBanner)) {
                return false;
            }
            IconTextBanner iconTextBanner = (IconTextBanner) obj;
            return Intrinsics.c(this.imageUrl, iconTextBanner.imageUrl) && Intrinsics.c(this.title, iconTextBanner.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        public final String toString() {
            return a.j("IconTextBanner(imageUrl=", this.imageUrl, ", title=", this.title, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderAddresses;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "title", "", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddress;", "addressSections", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "insetBanner", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "b", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderAddresses implements OrderConfirmationContent {

        @SerializedName("addressSections")
        @NotNull
        private final List<OrderAddress> addressSections;

        @SerializedName("insetBanner")
        @Nullable
        private final InsetBannerApiData insetBanner;

        @SerializedName("title")
        @NotNull
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderAddresses(@NotNull String title, @NotNull List<? extends OrderAddress> addressSections, @Nullable InsetBannerApiData insetBannerApiData) {
            Intrinsics.h(title, "title");
            Intrinsics.h(addressSections, "addressSections");
            this.title = title;
            this.addressSections = addressSections;
            this.insetBanner = insetBannerApiData;
        }

        /* renamed from: a, reason: from getter */
        public final List getAddressSections() {
            return this.addressSections;
        }

        /* renamed from: b, reason: from getter */
        public final InsetBannerApiData getInsetBanner() {
            return this.insetBanner;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderAddresses)) {
                return false;
            }
            OrderAddresses orderAddresses = (OrderAddresses) obj;
            return Intrinsics.c(this.title, orderAddresses.title) && Intrinsics.c(this.addressSections, orderAddresses.addressSections) && Intrinsics.c(this.insetBanner, orderAddresses.insetBanner);
        }

        public final int hashCode() {
            int iD = b.d(this.title.hashCode() * 31, 31, this.addressSections);
            InsetBannerApiData insetBannerApiData = this.insetBanner;
            return iD + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode());
        }

        public final String toString() {
            String str = this.title;
            List<OrderAddress> list = this.addressSections;
            InsetBannerApiData insetBannerApiData = this.insetBanner;
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("OrderAddresses(title=", str, ", addressSections=", ", insetBanner=", list);
            sbS.append(insetBannerApiData);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderConfirmationCmoBroadcastBanner;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "banner", "<init>", "(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "a", "()Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderConfirmationCmoBroadcastBanner implements OrderConfirmationContent {

        @SerializedName("banner")
        @Nullable
        private final BroadcastBannerData banner;

        public OrderConfirmationCmoBroadcastBanner(@Nullable BroadcastBannerData broadcastBannerData) {
            this.banner = broadcastBannerData;
        }

        /* renamed from: a, reason: from getter */
        public final BroadcastBannerData getBanner() {
            return this.banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderConfirmationCmoBroadcastBanner) && Intrinsics.c(this.banner, ((OrderConfirmationCmoBroadcastBanner) obj).banner);
        }

        public final int hashCode() {
            BroadcastBannerData broadcastBannerData = this.banner;
            if (broadcastBannerData == null) {
                return 0;
            }
            return broadcastBannerData.hashCode();
        }

        public final String toString() {
            return "OrderConfirmationCmoBroadcastBanner(banner=" + this.banner + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$OrderSummary;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "", "title", "summaryText", "", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderTotalDetailsSection;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderSummary implements OrderConfirmationContent {

        @SerializedName("sections")
        @NotNull
        private final List<List<OrderTotalDetailsSection>> sections;

        @SerializedName("summaryText")
        @Nullable
        private final String summaryText;

        @SerializedName("title")
        @NotNull
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderSummary(@NotNull String title, @Nullable String str, @NotNull List<? extends List<OrderTotalDetailsSection>> sections) {
            Intrinsics.h(title, "title");
            Intrinsics.h(sections, "sections");
            this.title = title;
            this.summaryText = str;
            this.sections = sections;
        }

        /* renamed from: a, reason: from getter */
        public final List getSections() {
            return this.sections;
        }

        /* renamed from: b, reason: from getter */
        public final String getSummaryText() {
            return this.summaryText;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSummary)) {
                return false;
            }
            OrderSummary orderSummary = (OrderSummary) obj;
            return Intrinsics.c(this.title, orderSummary.title) && Intrinsics.c(this.summaryText, orderSummary.summaryText) && Intrinsics.c(this.sections, orderSummary.sections);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.summaryText;
            return this.sections.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.summaryText;
            return android.support.v4.media.session.a.t(a.v("OrderSummary(title=", str, ", summaryText=", str2, ", sections="), this.sections, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$UniversalInventoryContainer;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UniversalInventoryContainer implements OrderConfirmationContent {

        /* renamed from: a, reason: collision with root package name */
        public final UniversalInventoryContainerData f10651a;

        public UniversalInventoryContainer(UniversalInventoryContainerData universalInventoryContainerData) {
            this.f10651a = universalInventoryContainerData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UniversalInventoryContainer) && Intrinsics.c(this.f10651a, ((UniversalInventoryContainer) obj).f10651a);
        }

        public final int hashCode() {
            return this.f10651a.hashCode();
        }

        public final String toString() {
            return "UniversalInventoryContainer(universalInventoryContainerData=" + this.f10651a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent$VocPlaceholder;", "Lau/com/woolworths/shop/checkout/domain/model/confirmation/OrderConfirmationContent;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VocPlaceholder implements OrderConfirmationContent {

        /* renamed from: a, reason: collision with root package name */
        public final int f10652a;

        public VocPlaceholder(int i) {
            this.f10652a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VocPlaceholder) && this.f10652a == ((VocPlaceholder) obj).f10652a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f10652a);
        }

        public final String toString() {
            return a.e(this.f10652a, "VocPlaceholder(vocHeightInPixel=", ")");
        }
    }
}
