package au.com.woolworths.feature.shop.brandedshop.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "", "Button", "ContentCard", "Divider", "HeroImage", "HorizontalList", "ImageCard", "Link", "ParagraphText", "ProductCardRow", "ProductHeader", "ProductSection", "TabHeader", "Title", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Button;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ContentCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Divider;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$HeroImage;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$HorizontalList;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ImageCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Link;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ParagraphText;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductCardRow;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductSection;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$TabHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Title;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ItemKey {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Button;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6694a;

        public Button(int i) {
            this.f6694a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Button) && this.f6694a == ((Button) obj).f6694a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6694a);
        }

        public final String toString() {
            return a.e(this.f6694a, "Button(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ContentCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCard implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6695a;

        public ContentCard(int i) {
            this.f6695a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentCard) && this.f6695a == ((ContentCard) obj).f6695a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6695a);
        }

        public final String toString() {
            return a.e(this.f6695a, "ContentCard(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Divider;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Divider implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6696a;
        public final Integer b;
        public final Integer c;

        public Divider(int i, Integer num, Integer num2) {
            this.f6696a = i;
            this.b = num;
            this.c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Divider)) {
                return false;
            }
            Divider divider = (Divider) obj;
            return this.f6696a == divider.f6696a && Intrinsics.c(this.b, divider.b) && Intrinsics.c(this.c, divider.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f6696a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Divider(parentItemIndex=");
            sb.append(this.f6696a);
            sb.append(", selectedTab=");
            sb.append(this.b);
            sb.append(", productRowIndex=");
            return au.com.woolworths.android.onesite.a.p(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$HeroImage;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroImage implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6697a;

        public HeroImage(int i) {
            this.f6697a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeroImage) && this.f6697a == ((HeroImage) obj).f6697a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6697a);
        }

        public final String toString() {
            return a.e(this.f6697a, "HeroImage(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$HorizontalList;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalList implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6698a;

        public HorizontalList(int i) {
            this.f6698a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalList) && this.f6698a == ((HorizontalList) obj).f6698a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6698a);
        }

        public final String toString() {
            return a.e(this.f6698a, "HorizontalList(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ImageCard;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageCard implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6699a;

        public ImageCard(int i) {
            this.f6699a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImageCard) && this.f6699a == ((ImageCard) obj).f6699a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6699a);
        }

        public final String toString() {
            return a.e(this.f6699a, "ImageCard(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Link;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6700a;
        public final Integer b;

        public Link(int i, Integer num) {
            this.f6700a = i;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return this.f6700a == link.f6700a && Intrinsics.c(this.b, link.b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f6700a) * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Link(index=" + this.f6700a + ", selectedTab=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ParagraphText;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ParagraphText implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6701a;

        public ParagraphText(int i) {
            this.f6701a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParagraphText) && this.f6701a == ((ParagraphText) obj).f6701a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6701a);
        }

        public final String toString() {
            return a.e(this.f6701a, "ParagraphText(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductCardRow;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCardRow implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6702a;
        public final Integer b;
        public final Integer c;

        public ProductCardRow(int i, Integer num, Integer num2) {
            this.f6702a = i;
            this.b = num;
            this.c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCardRow)) {
                return false;
            }
            ProductCardRow productCardRow = (ProductCardRow) obj;
            return this.f6702a == productCardRow.f6702a && Intrinsics.c(this.b, productCardRow.b) && Intrinsics.c(this.c, productCardRow.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f6702a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductCardRow(parentItemIndex=");
            sb.append(this.f6702a);
            sb.append(", selectedTab=");
            sb.append(this.b);
            sb.append(", productRowIndex=");
            return au.com.woolworths.android.onesite.a.p(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductHeader implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6703a;

        public ProductHeader(int i) {
            this.f6703a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductHeader) && this.f6703a == ((ProductHeader) obj).f6703a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6703a);
        }

        public final String toString() {
            return a.e(this.f6703a, "ProductHeader(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$ProductSection;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSection implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6704a;

        public ProductSection(int i) {
            this.f6704a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductSection) && this.f6704a == ((ProductSection) obj).f6704a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6704a);
        }

        public final String toString() {
            return a.e(this.f6704a, "ProductSection(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$TabHeader;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TabHeader implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6705a;

        public TabHeader(int i) {
            this.f6705a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabHeader) && this.f6705a == ((TabHeader) obj).f6705a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6705a);
        }

        public final String toString() {
            return a.e(this.f6705a, "TabHeader(index=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey$Title;", "Lau/com/woolworths/feature/shop/brandedshop/data/ItemKey;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title implements ItemKey {

        /* renamed from: a, reason: collision with root package name */
        public final int f6706a;

        public Title(int i) {
            this.f6706a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Title) && this.f6706a == ((Title) obj).f6706a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6706a);
        }

        public final String toString() {
            return a.e(this.f6706a, "Title(index=", ")");
        }
    }

    default String getKey() {
        if (this instanceof Button) {
            return a.d(((Button) this).f6694a, "button_");
        }
        if (this instanceof ContentCard) {
            return a.d(((ContentCard) this).f6695a, "content_card_");
        }
        if (this instanceof Divider) {
            Divider divider = (Divider) this;
            String strD = a.d(divider.f6696a, "divider_");
            Integer num = divider.b;
            if (num != null) {
                strD = ((Object) strD) + "_" + num;
            }
            return ((Object) strD) + "_" + divider.c;
        }
        if (this instanceof HeroImage) {
            return a.d(((HeroImage) this).f6697a, "hero_image_");
        }
        if (this instanceof HorizontalList) {
            return a.d(((HorizontalList) this).f6698a, "horizontal_list_");
        }
        if (this instanceof ImageCard) {
            return a.d(((ImageCard) this).f6699a, "image_card_");
        }
        if (this instanceof Link) {
            Link link = (Link) this;
            String strD2 = a.d(link.f6700a, "link_");
            Integer num2 = link.b;
            if (num2 == null) {
                return strD2;
            }
            return ((Object) strD2) + "_" + num2;
        }
        if (this instanceof ParagraphText) {
            return a.d(((ParagraphText) this).f6701a, "paragraph_");
        }
        if (!(this instanceof ProductCardRow)) {
            if (this instanceof ProductSection) {
                return a.d(((ProductSection) this).f6704a, "product_section_");
            }
            if (this instanceof ProductHeader) {
                return a.d(((ProductHeader) this).f6703a, "product_header_");
            }
            if (this instanceof TabHeader) {
                return a.d(((TabHeader) this).f6705a, "tab_header_");
            }
            if (this instanceof Title) {
                return a.d(((Title) this).f6706a, "title_");
            }
            throw new NoWhenBranchMatchedException();
        }
        ProductCardRow productCardRow = (ProductCardRow) this;
        String strD3 = a.d(productCardRow.f6702a, "products_row_");
        Integer num3 = productCardRow.b;
        if (num3 != null) {
            strD3 = ((Object) strD3) + "_" + num3;
        }
        return ((Object) strD3) + "_" + productCardRow.c;
    }
}
