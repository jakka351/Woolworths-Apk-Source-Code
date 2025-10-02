package au.com.woolworths.feature.shop.brandedshop.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "", "BrandedShopTitle", "BrandedShopHeroImage", "BrandedShopTabHeader", "BrandedShopProductSectionImpression", "BrandedShopProductRow", "BrandedShopLink", "BrandedShopButton", "BrandedShopHorizontalList", "BrandedShopFullWidthImageCard", "BrandedShopFullWidthContentCard", "BrandedShopParagraphText", "BrandedShopProductSectionHeader", "BrandedShopHorizontalDivider", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopButton;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopFullWidthContentCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopFullWidthImageCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHeroImage;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHorizontalDivider;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHorizontalList;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopLink;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopParagraphText;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductRow;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductSectionHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductSectionImpression;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopTabHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopTitle;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BrandedShopFeedItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopButton;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopButton implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6679a;
        public final ButtonData b;

        public BrandedShopButton(String key, ButtonData buttonData) {
            Intrinsics.h(key, "key");
            this.f6679a = key;
            this.b = buttonData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopButton)) {
                return false;
            }
            BrandedShopButton brandedShopButton = (BrandedShopButton) obj;
            return Intrinsics.c(this.f6679a, brandedShopButton.f6679a) && Intrinsics.c(this.b, brandedShopButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6679a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopButton(key=" + this.f6679a + ", buttonData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopFullWidthContentCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopFullWidthContentCard implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6680a;
        public final FullWidthContentCardData b;

        public BrandedShopFullWidthContentCard(String key, FullWidthContentCardData fullWidthContentCardData) {
            Intrinsics.h(key, "key");
            this.f6680a = key;
            this.b = fullWidthContentCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopFullWidthContentCard)) {
                return false;
            }
            BrandedShopFullWidthContentCard brandedShopFullWidthContentCard = (BrandedShopFullWidthContentCard) obj;
            return Intrinsics.c(this.f6680a, brandedShopFullWidthContentCard.f6680a) && Intrinsics.c(this.b, brandedShopFullWidthContentCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6680a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopFullWidthContentCard(key=" + this.f6680a + ", fullWidthContentCardData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopFullWidthImageCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopFullWidthImageCard implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6681a;
        public final FullWidthImageCardData b;

        public BrandedShopFullWidthImageCard(String key, FullWidthImageCardData fullWidthImageCardData) {
            Intrinsics.h(key, "key");
            this.f6681a = key;
            this.b = fullWidthImageCardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopFullWidthImageCard)) {
                return false;
            }
            BrandedShopFullWidthImageCard brandedShopFullWidthImageCard = (BrandedShopFullWidthImageCard) obj;
            return Intrinsics.c(this.f6681a, brandedShopFullWidthImageCard.f6681a) && Intrinsics.c(this.b, brandedShopFullWidthImageCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6681a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopFullWidthImageCard(key=" + this.f6681a + ", fullWidthImageCardData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHeroImage;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopHeroImage implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6682a;
        public final DownloadableAssetData b;

        public BrandedShopHeroImage(String key, DownloadableAssetData downloadableAssetData) {
            Intrinsics.h(key, "key");
            this.f6682a = key;
            this.b = downloadableAssetData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopHeroImage)) {
                return false;
            }
            BrandedShopHeroImage brandedShopHeroImage = (BrandedShopHeroImage) obj;
            return Intrinsics.c(this.f6682a, brandedShopHeroImage.f6682a) && Intrinsics.c(this.b, brandedShopHeroImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6682a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopHeroImage(key=" + this.f6682a + ", imageSection=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHorizontalDivider;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopHorizontalDivider implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6683a;
        public final float b;

        public BrandedShopHorizontalDivider(String key, float f) {
            Intrinsics.h(key, "key");
            this.f6683a = key;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopHorizontalDivider)) {
                return false;
            }
            BrandedShopHorizontalDivider brandedShopHorizontalDivider = (BrandedShopHorizontalDivider) obj;
            return Intrinsics.c(this.f6683a, brandedShopHorizontalDivider.f6683a) && Dp.a(this.b, brandedShopHorizontalDivider.b);
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.f6683a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("BrandedShopHorizontalDivider(key=", this.f6683a, ", paddingBottom=", Dp.b(this.b), ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopHorizontalList;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopHorizontalList implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6684a;
        public final HorizontalListData b;

        public BrandedShopHorizontalList(String key, HorizontalListData horizontalListData) {
            Intrinsics.h(key, "key");
            this.f6684a = key;
            this.b = horizontalListData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopHorizontalList)) {
                return false;
            }
            BrandedShopHorizontalList brandedShopHorizontalList = (BrandedShopHorizontalList) obj;
            return Intrinsics.c(this.f6684a, brandedShopHorizontalList.f6684a) && Intrinsics.c(this.b, brandedShopHorizontalList.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6684a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopHorizontalList(key=" + this.f6684a + ", horizontalListData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopLink;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopLink implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6685a;
        public final LinkData b;
        public final boolean c;

        public BrandedShopLink(String key, LinkData linkData, boolean z) {
            Intrinsics.h(key, "key");
            Intrinsics.h(linkData, "linkData");
            this.f6685a = key;
            this.b = linkData;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopLink)) {
                return false;
            }
            BrandedShopLink brandedShopLink = (BrandedShopLink) obj;
            return Intrinsics.c(this.f6685a, brandedShopLink.f6685a) && Intrinsics.c(this.b, brandedShopLink.b) && this.c == brandedShopLink.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f6685a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BrandedShopLink(key=");
            sb.append(this.f6685a);
            sb.append(", linkData=");
            sb.append(this.b);
            sb.append(", isTabComponent=");
            return a.k(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopParagraphText;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopParagraphText implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6686a;
        public final ParagraphTextItemData b;

        public BrandedShopParagraphText(String key, ParagraphTextItemData paragraphTextItemData) {
            Intrinsics.h(key, "key");
            this.f6686a = key;
            this.b = paragraphTextItemData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopParagraphText)) {
                return false;
            }
            BrandedShopParagraphText brandedShopParagraphText = (BrandedShopParagraphText) obj;
            return Intrinsics.c(this.f6686a, brandedShopParagraphText.f6686a) && Intrinsics.c(this.b, brandedShopParagraphText.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6686a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopParagraphText(key=" + this.f6686a + ", paragraphTextItemData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductRow;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopProductRow implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6687a;
        public final List b;

        public BrandedShopProductRow(String key, List products) {
            Intrinsics.h(key, "key");
            Intrinsics.h(products, "products");
            this.f6687a = key;
            this.b = products;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopProductRow)) {
                return false;
            }
            BrandedShopProductRow brandedShopProductRow = (BrandedShopProductRow) obj;
            return Intrinsics.c(this.f6687a, brandedShopProductRow.f6687a) && Intrinsics.c(this.b, brandedShopProductRow.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6687a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("BrandedShopProductRow(key=", this.f6687a, ", products=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductSectionHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopProductSectionHeader implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6688a;
        public final String b;

        public BrandedShopProductSectionHeader(String key, String headerText) {
            Intrinsics.h(key, "key");
            Intrinsics.h(headerText, "headerText");
            this.f6688a = key;
            this.b = headerText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopProductSectionHeader)) {
                return false;
            }
            BrandedShopProductSectionHeader brandedShopProductSectionHeader = (BrandedShopProductSectionHeader) obj;
            return Intrinsics.c(this.f6688a, brandedShopProductSectionHeader.f6688a) && Intrinsics.c(this.b, brandedShopProductSectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6688a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("BrandedShopProductSectionHeader(key=", this.f6688a, ", headerText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopProductSectionImpression;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopProductSectionImpression implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6689a;
        public final ProductSectionData b;

        public BrandedShopProductSectionImpression(String key, ProductSectionData productSectionData) {
            Intrinsics.h(key, "key");
            this.f6689a = key;
            this.b = productSectionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopProductSectionImpression)) {
                return false;
            }
            BrandedShopProductSectionImpression brandedShopProductSectionImpression = (BrandedShopProductSectionImpression) obj;
            return Intrinsics.c(this.f6689a, brandedShopProductSectionImpression.f6689a) && Intrinsics.c(this.b, brandedShopProductSectionImpression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6689a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopProductSectionImpression(key=" + this.f6689a + ", productSectionData=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopTabHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopTabHeader implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6690a;
        public final ArrayList b;
        public final String c;

        public BrandedShopTabHeader(String key, String str, ArrayList arrayList) {
            Intrinsics.h(key, "key");
            this.f6690a = key;
            this.b = arrayList;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopTabHeader)) {
                return false;
            }
            BrandedShopTabHeader brandedShopTabHeader = (BrandedShopTabHeader) obj;
            return Intrinsics.c(this.f6690a, brandedShopTabHeader.f6690a) && this.b.equals(brandedShopTabHeader.b) && Intrinsics.c(this.c, brandedShopTabHeader.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f6690a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.x("BrandedShopTabHeader(key=", this.f6690a, ", tabSection=", ", headerText=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem$BrandedShopTitle;", "Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopFeedItem;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrandedShopTitle implements BrandedShopFeedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6691a;
        public final TitleSectionData b;

        public BrandedShopTitle(String key, TitleSectionData titleSectionData) {
            Intrinsics.h(key, "key");
            this.f6691a = key;
            this.b = titleSectionData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandedShopTitle)) {
                return false;
            }
            BrandedShopTitle brandedShopTitle = (BrandedShopTitle) obj;
            return Intrinsics.c(this.f6691a, brandedShopTitle.f6691a) && Intrinsics.c(this.b, brandedShopTitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6691a.hashCode() * 31);
        }

        public final String toString() {
            return "BrandedShopTitle(key=" + this.f6691a + ", titleSection=" + this.b + ")";
        }
    }
}
