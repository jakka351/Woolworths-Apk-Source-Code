package au.com.woolworths.graphql.common.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AisleSide;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InStoreLocationType;
import au.com.woolworths.shop.graphql.type.ProductPromotionTypes;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import au.com.woolworths.shop.graphql.type.TagStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "InStoreAvailabilityInfo", "PromotionInfo", "InlineLabel", "Trolley", "Trolley1", "List", "InStoreDetails", "InStoreLocation", "Marketplace", "RewardsOfferInfo", "TagLabel", "ProductVarieties", "Category", "MemberPriceInfo", "MultiBuyPriceInfo", "CartProductInfo", "ProductCardAnalytics", "ProductCardAction", "Button", "InfoSheet", "Button1", "Details", "DisplayInfo", "OfferAnalytics", "BoostButton", "Analytics", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCard implements Fragment.Data {
    public final ProductVarieties A;
    public final java.util.List B;
    public final boolean C;
    public final MemberPriceInfo D;
    public final MultiBuyPriceInfo E;
    public final CartProductInfo F;
    public final ProductCardAnalytics G;
    public final ProductCardAction H;
    public final String I;

    /* renamed from: a, reason: collision with root package name */
    public final String f8949a;
    public final String b;
    public final boolean c;
    public final PurchaseRestriction d;
    public final String e;
    public final boolean f;
    public final InStoreAvailabilityInfo g;
    public final Integer h;
    public final String i;
    public final String j;
    public final PromotionInfo k;
    public final String l;
    public final String m;
    public final String n;
    public final java.util.List o;
    public final Trolley p;
    public final java.util.List q;
    public final List r;
    public final InStoreDetails s;
    public final InStoreLocation t;
    public final String u;
    public final String v;
    public final Marketplace w;
    public final RewardsOfferInfo x;
    public final String y;
    public final TagLabel z;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Analytics;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f8950a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f8950a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f8950a, analytics.f8950a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8950a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f8950a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$BoostButton;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f8951a;
        public final ButtonStyle b;
        public final boolean c;

        public BoostButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f8951a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoostButton)) {
                return false;
            }
            BoostButton boostButton = (BoostButton) obj;
            return Intrinsics.c(this.f8951a, boostButton.f8951a) && this.b == boostButton.b && this.c == boostButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f8951a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("BoostButton(label=", this.f8951a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Button;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f8952a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public Button(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f8952a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f8952a, button.f8952a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d;
        }

        public final int hashCode() {
            int iHashCode = this.f8952a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("Button(label=", this.f8952a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Button1;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f8953a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public Button1(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f8953a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f8953a, button1.f8953a) && Intrinsics.c(this.b, button1.b) && this.c == button1.c && this.d == button1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f8953a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("Button1(label=", this.f8953a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$CartProductInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartProductInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f8954a;
        public final String b;
        public final String c;

        public CartProductInfo(String str, String str2, String str3) {
            this.f8954a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartProductInfo)) {
                return false;
            }
            CartProductInfo cartProductInfo = (CartProductInfo) obj;
            return Intrinsics.c(this.f8954a, cartProductInfo.f8954a) && Intrinsics.c(this.b, cartProductInfo.b) && Intrinsics.c(this.c, cartProductInfo.c);
        }

        public final int hashCode() {
            String str = this.f8954a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("CartProductInfo(totalPrice=", this.f8954a, ", totalOriginalPrice=", this.b, ", totalDiscount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Category;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Category {

        /* renamed from: a, reason: collision with root package name */
        public final String f8955a;
        public final Integer b;

        public Category(String str, Integer num) {
            this.f8955a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return Intrinsics.c(this.f8955a, category.f8955a) && Intrinsics.c(this.b, category.b);
        }

        public final int hashCode() {
            String str = this.f8955a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Category(name=" + this.f8955a + ", categoryLevel=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Details;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Details {

        /* renamed from: a, reason: collision with root package name */
        public final int f8956a;
        public final AisleSide b;
        public final int c;
        public final Integer d;
        public final int e;
        public final String f;
        public final double g;
        public final double h;
        public final double i;

        public Details(double d, double d2, double d3, int i, int i2, int i3, AisleSide aisleSide, Integer num, String str) {
            this.f8956a = i;
            this.b = aisleSide;
            this.c = i2;
            this.d = num;
            this.e = i3;
            this.f = str;
            this.g = d;
            this.h = d2;
            this.i = d3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return this.f8956a == details.f8956a && this.b == details.b && this.c == details.c && Intrinsics.c(this.d, details.d) && this.e == details.e && Intrinsics.c(this.f, details.f) && Double.compare(this.g, details.g) == 0 && Double.compare(this.h, details.h) == 0 && Double.compare(this.i, details.i) == 0;
        }

        public final int hashCode() {
            int iA = b.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.f8956a) * 31)) * 31, 31);
            Integer num = this.d;
            int iA2 = b.a(this.e, (iA + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str = this.f;
            return Double.hashCode(this.i) + android.support.v4.media.session.a.a(this.h, android.support.v4.media.session.a.a(this.g, (iA2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Details(aisleNumber=");
            sb.append(this.f8956a);
            sb.append(", aisleSide=");
            sb.append(this.b);
            sb.append(", bayNumber=");
            sb.append(this.c);
            sb.append(", bayNumberAlternate=");
            sb.append(this.d);
            sb.append(", floorNumber=");
            androidx.compose.ui.input.pointer.a.u(this.e, ", location=", this.f, ", x=", sb);
            sb.append(this.g);
            au.com.woolworths.android.onesite.a.z(sb, ", y=", this.h, ", z=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$DisplayInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisplayInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f8957a;
        public final InStoreLocationType b;

        public DisplayInfo(String str, InStoreLocationType inStoreLocationType) {
            this.f8957a = str;
            this.b = inStoreLocationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayInfo)) {
                return false;
            }
            DisplayInfo displayInfo = (DisplayInfo) obj;
            return Intrinsics.c(this.f8957a, displayInfo.f8957a) && this.b == displayInfo.b;
        }

        public final int hashCode() {
            String str = this.f8957a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            InStoreLocationType inStoreLocationType = this.b;
            return iHashCode + (inStoreLocationType != null ? inStoreLocationType.hashCode() : 0);
        }

        public final String toString() {
            return "DisplayInfo(locationText=" + this.f8957a + ", locationType=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreAvailabilityInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreAvailabilityInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Button f8958a;
        public final String b;
        public final InfoSheet c;

        public InStoreAvailabilityInfo(Button button, String str, InfoSheet infoSheet) {
            this.f8958a = button;
            this.b = str;
            this.c = infoSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreAvailabilityInfo)) {
                return false;
            }
            InStoreAvailabilityInfo inStoreAvailabilityInfo = (InStoreAvailabilityInfo) obj;
            return Intrinsics.c(this.f8958a, inStoreAvailabilityInfo.f8958a) && Intrinsics.c(this.b, inStoreAvailabilityInfo.b) && Intrinsics.c(this.c, inStoreAvailabilityInfo.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8958a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InfoSheet infoSheet = this.c;
            return iHashCode2 + (infoSheet != null ? infoSheet.hashCode() : 0);
        }

        public final String toString() {
            return "InStoreAvailabilityInfo(button=" + this.f8958a + ", status=" + this.b + ", infoSheet=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreDetails;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f8959a;
        public final InStoreLocationType b;

        public InStoreDetails(String str, InStoreLocationType inStoreLocationType) {
            this.f8959a = str;
            this.b = inStoreLocationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreDetails)) {
                return false;
            }
            InStoreDetails inStoreDetails = (InStoreDetails) obj;
            return Intrinsics.c(this.f8959a, inStoreDetails.f8959a) && this.b == inStoreDetails.b;
        }

        public final int hashCode() {
            String str = this.f8959a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            InStoreLocationType inStoreLocationType = this.b;
            return iHashCode + (inStoreLocationType != null ? inStoreLocationType.hashCode() : 0);
        }

        public final String toString() {
            return "InStoreDetails(locationText=" + this.f8959a + ", locationType=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreLocation;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreLocation {

        /* renamed from: a, reason: collision with root package name */
        public final Details f8960a;
        public final DisplayInfo b;

        public InStoreLocation(Details details, DisplayInfo displayInfo) {
            this.f8960a = details;
            this.b = displayInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreLocation)) {
                return false;
            }
            InStoreLocation inStoreLocation = (InStoreLocation) obj;
            return Intrinsics.c(this.f8960a, inStoreLocation.f8960a) && Intrinsics.c(this.b, inStoreLocation.b);
        }

        public final int hashCode() {
            Details details = this.f8960a;
            int iHashCode = (details == null ? 0 : details.hashCode()) * 31;
            DisplayInfo displayInfo = this.b;
            return iHashCode + (displayInfo != null ? displayInfo.hashCode() : 0);
        }

        public final String toString() {
            return "InStoreLocation(details=" + this.f8960a + ", displayInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$InfoSheet;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f8961a;
        public final String b;
        public final Button1 c;

        public InfoSheet(String str, String str2, Button1 button1) {
            this.f8961a = str;
            this.b = str2;
            this.c = button1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoSheet)) {
                return false;
            }
            InfoSheet infoSheet = (InfoSheet) obj;
            return Intrinsics.c(this.f8961a, infoSheet.f8961a) && Intrinsics.c(this.b, infoSheet.b) && Intrinsics.c(this.c, infoSheet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f8961a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InfoSheet(title=", this.f8961a, ", message=", this.b, ", button=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$InlineLabel;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f8962a;
        public final String b;
        public final Integer c;

        public InlineLabel(String str, String str2, Integer num) {
            this.f8962a = str;
            this.b = str2;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineLabel)) {
                return false;
            }
            InlineLabel inlineLabel = (InlineLabel) obj;
            return Intrinsics.c(this.f8962a, inlineLabel.f8962a) && Intrinsics.c(this.b, inlineLabel.b) && Intrinsics.c(this.c, inlineLabel.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f8962a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            return iC + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.p(a.v("InlineLabel(type=", this.f8962a, ", label=", this.b, ", priority="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$List;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class List {

        /* renamed from: a, reason: collision with root package name */
        public final double f8963a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public List(double d, double d2, double d3, double d4, String str) {
            this.f8963a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            return Double.compare(this.f8963a, list.f8963a) == 0 && Double.compare(this.b, list.b) == 0 && Double.compare(this.c, list.c) == 0 && Double.compare(this.d, list.d) == 0 && Intrinsics.c(this.e, list.e);
        }

        public final int hashCode() {
            int iA = android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f8963a) * 31, 31), 31), 31);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f8963a, "List(minimum=", ", maximum=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
            sbN.append(this.d);
            sbN.append(", unit=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Marketplace;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Marketplace {

        /* renamed from: a, reason: collision with root package name */
        public final String f8964a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public Marketplace(String str, String str2, String str3, String str4, String str5) {
            this.f8964a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Marketplace)) {
                return false;
            }
            Marketplace marketplace = (Marketplace) obj;
            return Intrinsics.c(this.f8964a, marketplace.f8964a) && Intrinsics.c(this.b, marketplace.b) && Intrinsics.c(this.c, marketplace.c) && Intrinsics.c(this.d, marketplace.d) && Intrinsics.c(this.e, marketplace.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f8964a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("Marketplace(imageUrl=", this.f8964a, ", title=", this.b, ", sellerName=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", brandName=", this.d, ", lowestMarketPriceDescription=");
            return a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$MemberPriceInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MemberPriceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f8965a;
        public final String b;
        public final String c;

        public MemberPriceInfo(String str, String str2, String str3) {
            this.f8965a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemberPriceInfo)) {
                return false;
            }
            MemberPriceInfo memberPriceInfo = (MemberPriceInfo) obj;
            return Intrinsics.c(this.f8965a, memberPriceInfo.f8965a) && Intrinsics.c(this.b, memberPriceInfo.b) && Intrinsics.c(this.c, memberPriceInfo.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f8965a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("MemberPriceInfo(header=", this.f8965a, ", title=", this.b, ", subtitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$MultiBuyPriceInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiBuyPriceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f8966a;
        public final String b;

        public MultiBuyPriceInfo(String str, String str2) {
            this.f8966a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiBuyPriceInfo)) {
                return false;
            }
            MultiBuyPriceInfo multiBuyPriceInfo = (MultiBuyPriceInfo) obj;
            return Intrinsics.c(this.f8966a, multiBuyPriceInfo.f8966a) && Intrinsics.c(this.b, multiBuyPriceInfo.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8966a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("MultiBuyPriceInfo(price=", this.f8966a, ", unitPrice=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$OfferAnalytics;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f8967a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public OfferAnalytics(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f8967a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferAnalytics)) {
                return false;
            }
            OfferAnalytics offerAnalytics = (OfferAnalytics) obj;
            return Intrinsics.c(this.f8967a, offerAnalytics.f8967a) && Intrinsics.c(this.b, offerAnalytics.b) && Intrinsics.c(this.c, offerAnalytics.c) && Intrinsics.c(this.d, offerAnalytics.d) && Intrinsics.c(this.e, offerAnalytics.e) && Intrinsics.c(this.f, offerAnalytics.f) && Intrinsics.c(this.g, offerAnalytics.g) && Intrinsics.c(this.h, offerAnalytics.h) && Intrinsics.c(this.i, offerAnalytics.i);
        }

        public final int hashCode() {
            String str = this.f8967a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OfferAnalytics(offerName=", this.f8967a, ", campaignStream=", this.b, ", channel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", status=", this.d, ", offerType=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", partnerId=", this.f, ", rtlAccountID=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", rtlCampaignID=", this.h, ", rtlCampaignCode=");
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductCardAction;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f8968a;
        public final ActionType b;
        public final String c;
        public final Analytics d;

        public ProductCardAction(String str, ActionType actionType, String str2, Analytics analytics) {
            this.f8968a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCardAction)) {
                return false;
            }
            ProductCardAction productCardAction = (ProductCardAction) obj;
            return Intrinsics.c(this.f8968a, productCardAction.f8968a) && this.b == productCardAction.b && Intrinsics.c(this.c, productCardAction.c) && Intrinsics.c(this.d, productCardAction.d);
        }

        public final int hashCode() {
            int iA = d.a(this.b, this.f8968a.hashCode() * 31, 31);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            Analytics analytics = this.d;
            return iHashCode + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("ProductCardAction(action=", this.f8968a, ", type=", this.b, ", id=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductCardAnalytics;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCardAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f8969a;
        public final AnalyticsFields b;

        public ProductCardAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f8969a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCardAnalytics)) {
                return false;
            }
            ProductCardAnalytics productCardAnalytics = (ProductCardAnalytics) obj;
            return Intrinsics.c(this.f8969a, productCardAnalytics.f8969a) && Intrinsics.c(this.b, productCardAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8969a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ProductCardAnalytics(__typename=", this.f8969a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductVarieties;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductVarieties {

        /* renamed from: a, reason: collision with root package name */
        public final int f8970a;
        public final String b;
        public final String c;

        public ProductVarieties(int i, String str, String str2) {
            this.f8970a = i;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductVarieties)) {
                return false;
            }
            ProductVarieties productVarieties = (ProductVarieties) obj;
            return this.f8970a == productVarieties.f8970a && Intrinsics.c(this.b, productVarieties.b) && Intrinsics.c(this.c, productVarieties.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f8970a) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.p("ProductVarieties(totalCount=", this.f8970a, ", label=", this.b, ", priceFamilyId="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$PromotionInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ProductPromotionTypes f8971a;
        public final String b;

        public PromotionInfo(ProductPromotionTypes productPromotionTypes, String str) {
            this.f8971a = productPromotionTypes;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionInfo)) {
                return false;
            }
            PromotionInfo promotionInfo = (PromotionInfo) obj;
            return this.f8971a == promotionInfo.f8971a && Intrinsics.c(this.b, promotionInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8971a.hashCode() * 31);
        }

        public final String toString() {
            return "PromotionInfo(type=" + this.f8971a + ", label=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$RewardsOfferInfo;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOfferInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f8972a;
        public final RewardsOfferStatus b;
        public final String c;
        public final String d;
        public final String e;
        public final OfferAnalytics f;
        public final BoostButton g;

        public RewardsOfferInfo(String str, RewardsOfferStatus rewardsOfferStatus, String str2, String str3, String str4, OfferAnalytics offerAnalytics, BoostButton boostButton) {
            this.f8972a = str;
            this.b = rewardsOfferStatus;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = offerAnalytics;
            this.g = boostButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOfferInfo)) {
                return false;
            }
            RewardsOfferInfo rewardsOfferInfo = (RewardsOfferInfo) obj;
            return Intrinsics.c(this.f8972a, rewardsOfferInfo.f8972a) && this.b == rewardsOfferInfo.b && Intrinsics.c(this.c, rewardsOfferInfo.c) && Intrinsics.c(this.d, rewardsOfferInfo.d) && Intrinsics.c(this.e, rewardsOfferInfo.e) && Intrinsics.c(this.f, rewardsOfferInfo.f) && Intrinsics.c(this.g, rewardsOfferInfo.g);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f8972a.hashCode() * 31)) * 31;
            String str = this.c;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            OfferAnalytics offerAnalytics = this.f;
            int iHashCode3 = (iHashCode2 + (offerAnalytics == null ? 0 : offerAnalytics.hashCode())) * 31;
            BoostButton boostButton = this.g;
            return iHashCode3 + (boostButton != null ? boostButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RewardsOfferInfo(offerId=");
            sb.append(this.f8972a);
            sb.append(", offerStatus=");
            sb.append(this.b);
            sb.append(", displayStatus=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", displayExpiry=", this.d, ", minimumSpend=");
            sb.append(this.e);
            sb.append(", offerAnalytics=");
            sb.append(this.f);
            sb.append(", boostButton=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$TagLabel;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TagLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f8973a;
        public final TagStyle b;

        public TagLabel(String str, TagStyle tagStyle) {
            this.f8973a = str;
            this.b = tagStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagLabel)) {
                return false;
            }
            TagLabel tagLabel = (TagLabel) obj;
            return Intrinsics.c(this.f8973a, tagLabel.f8973a) && this.b == tagLabel.b;
        }

        public final int hashCode() {
            int iHashCode = this.f8973a.hashCode() * 31;
            TagStyle tagStyle = this.b;
            return iHashCode + (tagStyle == null ? 0 : tagStyle.hashCode());
        }

        public final String toString() {
            return "TagLabel(text=" + this.f8973a + ", style=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Trolley {

        /* renamed from: a, reason: collision with root package name */
        public final String f8974a;
        public final ProductTrolley b;

        public Trolley(String str, ProductTrolley productTrolley) {
            this.f8974a = str;
            this.b = productTrolley;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trolley)) {
                return false;
            }
            Trolley trolley = (Trolley) obj;
            return Intrinsics.c(this.f8974a, trolley.f8974a) && Intrinsics.c(this.b, trolley.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8974a.hashCode() * 31);
        }

        public final String toString() {
            return "Trolley(__typename=" + this.f8974a + ", productTrolley=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley1;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Trolley1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f8975a;
        public final ProductTrolley b;

        public Trolley1(String str, ProductTrolley productTrolley) {
            this.f8975a = str;
            this.b = productTrolley;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trolley1)) {
                return false;
            }
            Trolley1 trolley1 = (Trolley1) obj;
            return Intrinsics.c(this.f8975a, trolley1.f8975a) && Intrinsics.c(this.b, trolley1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8975a.hashCode() * 31);
        }

        public final String toString() {
            return "Trolley1(__typename=" + this.f8975a + ", productTrolley=" + this.b + ")";
        }
    }

    public ProductCard(String str, String str2, boolean z, PurchaseRestriction purchaseRestriction, String str3, boolean z2, InStoreAvailabilityInfo inStoreAvailabilityInfo, Integer num, String str4, String str5, PromotionInfo promotionInfo, String str6, String str7, String str8, java.util.List list, Trolley trolley, java.util.List list2, List list3, InStoreDetails inStoreDetails, InStoreLocation inStoreLocation, String str9, String str10, Marketplace marketplace, RewardsOfferInfo rewardsOfferInfo, String str11, TagLabel tagLabel, ProductVarieties productVarieties, java.util.List list4, boolean z3, MemberPriceInfo memberPriceInfo, MultiBuyPriceInfo multiBuyPriceInfo, CartProductInfo cartProductInfo, ProductCardAnalytics productCardAnalytics, ProductCardAction productCardAction, String str12) {
        this.f8949a = str;
        this.b = str2;
        this.c = z;
        this.d = purchaseRestriction;
        this.e = str3;
        this.f = z2;
        this.g = inStoreAvailabilityInfo;
        this.h = num;
        this.i = str4;
        this.j = str5;
        this.k = promotionInfo;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = list;
        this.p = trolley;
        this.q = list2;
        this.r = list3;
        this.s = inStoreDetails;
        this.t = inStoreLocation;
        this.u = str9;
        this.v = str10;
        this.w = marketplace;
        this.x = rewardsOfferInfo;
        this.y = str11;
        this.z = tagLabel;
        this.A = productVarieties;
        this.B = list4;
        this.C = z3;
        this.D = memberPriceInfo;
        this.E = multiBuyPriceInfo;
        this.F = cartProductInfo;
        this.G = productCardAnalytics;
        this.H = productCardAction;
        this.I = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCard)) {
            return false;
        }
        ProductCard productCard = (ProductCard) obj;
        return Intrinsics.c(this.f8949a, productCard.f8949a) && Intrinsics.c(this.b, productCard.b) && this.c == productCard.c && this.d == productCard.d && Intrinsics.c(this.e, productCard.e) && this.f == productCard.f && Intrinsics.c(this.g, productCard.g) && Intrinsics.c(this.h, productCard.h) && Intrinsics.c(this.i, productCard.i) && Intrinsics.c(this.j, productCard.j) && Intrinsics.c(this.k, productCard.k) && Intrinsics.c(this.l, productCard.l) && Intrinsics.c(this.m, productCard.m) && Intrinsics.c(this.n, productCard.n) && Intrinsics.c(this.o, productCard.o) && Intrinsics.c(this.p, productCard.p) && Intrinsics.c(this.q, productCard.q) && Intrinsics.c(this.r, productCard.r) && Intrinsics.c(this.s, productCard.s) && Intrinsics.c(this.t, productCard.t) && Intrinsics.c(this.u, productCard.u) && Intrinsics.c(this.v, productCard.v) && Intrinsics.c(this.w, productCard.w) && Intrinsics.c(this.x, productCard.x) && Intrinsics.c(this.y, productCard.y) && Intrinsics.c(this.z, productCard.z) && Intrinsics.c(this.A, productCard.A) && Intrinsics.c(this.B, productCard.B) && this.C == productCard.C && Intrinsics.c(this.D, productCard.D) && Intrinsics.c(this.E, productCard.E) && Intrinsics.c(this.F, productCard.F) && Intrinsics.c(this.G, productCard.G) && Intrinsics.c(this.H, productCard.H) && Intrinsics.c(this.I, productCard.I);
    }

    public final int hashCode() {
        int iE = b.e(b.c(this.f8949a.hashCode() * 31, 31, this.b), 31, this.c);
        PurchaseRestriction purchaseRestriction = this.d;
        int iHashCode = (iE + (purchaseRestriction == null ? 0 : purchaseRestriction.hashCode())) * 31;
        String str = this.e;
        int iE2 = b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.g;
        int iHashCode2 = (iE2 + (inStoreAvailabilityInfo == null ? 0 : inStoreAvailabilityInfo.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PromotionInfo promotionInfo = this.k;
        int iHashCode6 = (iHashCode5 + (promotionInfo == null ? 0 : promotionInfo.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.util.List list = this.o;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Trolley trolley = this.p;
        int iHashCode11 = (iHashCode10 + (trolley == null ? 0 : trolley.hashCode())) * 31;
        java.util.List list2 = this.q;
        int iHashCode12 = (this.r.hashCode() + ((iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        InStoreDetails inStoreDetails = this.s;
        int iHashCode13 = (iHashCode12 + (inStoreDetails == null ? 0 : inStoreDetails.hashCode())) * 31;
        InStoreLocation inStoreLocation = this.t;
        int iHashCode14 = (iHashCode13 + (inStoreLocation == null ? 0 : inStoreLocation.hashCode())) * 31;
        String str7 = this.u;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.v;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Marketplace marketplace = this.w;
        int iHashCode17 = (iHashCode16 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        RewardsOfferInfo rewardsOfferInfo = this.x;
        int iHashCode18 = (iHashCode17 + (rewardsOfferInfo == null ? 0 : rewardsOfferInfo.hashCode())) * 31;
        String str9 = this.y;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        TagLabel tagLabel = this.z;
        int iHashCode20 = (iHashCode19 + (tagLabel == null ? 0 : tagLabel.hashCode())) * 31;
        ProductVarieties productVarieties = this.A;
        int iHashCode21 = (iHashCode20 + (productVarieties == null ? 0 : productVarieties.hashCode())) * 31;
        java.util.List list3 = this.B;
        int iE3 = b.e((iHashCode21 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.C);
        MemberPriceInfo memberPriceInfo = this.D;
        int iHashCode22 = (iE3 + (memberPriceInfo == null ? 0 : memberPriceInfo.hashCode())) * 31;
        MultiBuyPriceInfo multiBuyPriceInfo = this.E;
        int iHashCode23 = (iHashCode22 + (multiBuyPriceInfo == null ? 0 : multiBuyPriceInfo.hashCode())) * 31;
        CartProductInfo cartProductInfo = this.F;
        int iHashCode24 = (iHashCode23 + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
        ProductCardAnalytics productCardAnalytics = this.G;
        int iHashCode25 = (iHashCode24 + (productCardAnalytics == null ? 0 : productCardAnalytics.hashCode())) * 31;
        ProductCardAction productCardAction = this.H;
        int iHashCode26 = (iHashCode25 + (productCardAction == null ? 0 : productCardAction.hashCode())) * 31;
        String str10 = this.I;
        return iHashCode26 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductCard(productId=", this.f8949a, ", name=", this.b, ", isNew=");
        sbV.append(this.c);
        sbV.append(", purchaseRestriction=");
        sbV.append(this.d);
        sbV.append(", productImage=");
        d.A(this.e, ", isAvailable=", ", inStoreAvailabilityInfo=", sbV, this.f);
        sbV.append(this.g);
        sbV.append(", price=");
        sbV.append(this.h);
        sbV.append(", unitOfMeasureLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.i, ", badgeImage=", this.j, ", promotionInfo=");
        sbV.append(this.k);
        sbV.append(", unitPriceDescription=");
        sbV.append(this.l);
        sbV.append(", wasPrice=");
        androidx.constraintlayout.core.state.a.B(sbV, this.m, ", purchaseWarning=", this.n, ", inlineLabels=");
        sbV.append(this.o);
        sbV.append(", trolley=");
        sbV.append(this.p);
        sbV.append(", trolleys=");
        sbV.append(this.q);
        sbV.append(", list=");
        sbV.append(this.r);
        sbV.append(", inStoreDetails=");
        sbV.append(this.s);
        sbV.append(", inStoreLocation=");
        sbV.append(this.t);
        sbV.append(", adId=");
        androidx.constraintlayout.core.state.a.B(sbV, this.u, ", source=", this.v, ", marketplace=");
        sbV.append(this.w);
        sbV.append(", rewardsOfferInfo=");
        sbV.append(this.x);
        sbV.append(", disclaimer=");
        sbV.append(this.y);
        sbV.append(", tagLabel=");
        sbV.append(this.z);
        sbV.append(", productVarieties=");
        sbV.append(this.A);
        sbV.append(", categories=");
        sbV.append(this.B);
        sbV.append(", isTobacco=");
        sbV.append(this.C);
        sbV.append(", memberPriceInfo=");
        sbV.append(this.D);
        sbV.append(", multiBuyPriceInfo=");
        sbV.append(this.E);
        sbV.append(", cartProductInfo=");
        sbV.append(this.F);
        sbV.append(", productCardAnalytics=");
        sbV.append(this.G);
        sbV.append(", productCardAction=");
        sbV.append(this.H);
        sbV.append(", pricingFootnoteMd=");
        return a.o(sbV, this.I, ")");
    }
}
