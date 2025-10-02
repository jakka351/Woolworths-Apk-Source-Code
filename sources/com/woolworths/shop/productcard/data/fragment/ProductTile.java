package com.woolworths.shop.productcard.data.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductTrolley;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AisleSide;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InStoreLocationType;
import au.com.woolworths.shop.graphql.type.ProductStatusScheme;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.graphql.type.RoundelImagePriority;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001:#\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile;", "Lcom/apollographql/apollo/api/Fragment$Data;", "RoundelImage", "MainProductImage", "ProductTag", "PriceInfo", "ProductStatus", "MiddleMessage", "RatingsAndReviews", "Footer", "List", "Trolley", "RewardsOfferInfo", "Category", "ProductCardAction", "InStoreInfo", "MarketplaceInfo", "RestrictionInfo", "UnitPriceDescription", "WasPrice", "SavePrice", "VariablePrice", "PriceClarificationMessage", "Text", "DisplayText", "FooterIcon", "FooterAction", "Location", "DisplayInfo", "Details", "Availability", "Button", "ButtonAction", "InfoSheet", "Button1", "ButtonAction1", "Description", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductTile implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23631a;
    public final String b;
    public final RoundelImage c;
    public final MainProductImage d;
    public final java.util.List e;
    public final PriceInfo f;
    public final java.util.List g;
    public final MiddleMessage h;
    public final RatingsAndReviews i;
    public final Footer j;
    public final List k;
    public final java.util.List l;
    public final String m;
    public final RewardsOfferInfo n;
    public final java.util.List o;
    public final String p;
    public final ProductCardAction q;
    public final InStoreInfo r;
    public final MarketplaceInfo s;
    public final RestrictionInfo t;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Availability;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Availability {

        /* renamed from: a, reason: collision with root package name */
        public final Button f23632a;
        public final String b;
        public final InfoSheet c;

        public Availability(Button button, String str, InfoSheet infoSheet) {
            this.f23632a = button;
            this.b = str;
            this.c = infoSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Availability)) {
                return false;
            }
            Availability availability = (Availability) obj;
            return Intrinsics.c(this.f23632a, availability.f23632a) && Intrinsics.c(this.b, availability.b) && Intrinsics.c(this.c, availability.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23632a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InfoSheet infoSheet = this.c;
            return iHashCode2 + (infoSheet != null ? infoSheet.hashCode() : 0);
        }

        public final String toString() {
            return "Availability(button=" + this.f23632a + ", status=" + this.b + ", infoSheet=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Button;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f23633a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;
        public final String e;
        public final String f;
        public final ButtonAction g;
        public final String h;

        public Button(String str, String str2, ButtonStyle buttonStyle, boolean z, String str3, String str4, ButtonAction buttonAction, String str5) {
            this.f23633a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
            this.e = str3;
            this.f = str4;
            this.g = buttonAction;
            this.h = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f23633a, button.f23633a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d && Intrinsics.c(this.e, button.e) && Intrinsics.c(this.f, button.f) && Intrinsics.c(this.g, button.g) && Intrinsics.c(this.h, button.h);
        }

        public final int hashCode() {
            String str = this.f23633a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction buttonAction = this.g;
            int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str4 = this.h;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Button(buttonId=", this.f23633a, ", label=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", enabled=");
            sbV.append(this.d);
            sbV.append(", action=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", url=", this.f, ", buttonAction=");
            sbV.append(this.g);
            sbV.append(", iconUrl=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Button1;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23634a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;
        public final String e;
        public final String f;
        public final ButtonAction1 g;
        public final String h;
        public final String i;

        public Button1(String str, String str2, ButtonStyle buttonStyle, boolean z, String str3, String str4, ButtonAction1 buttonAction1, String str5, String str6) {
            this.f23634a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
            this.e = str3;
            this.f = str4;
            this.g = buttonAction1;
            this.h = str5;
            this.i = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f23634a, button1.f23634a) && Intrinsics.c(this.b, button1.b) && this.c == button1.c && this.d == button1.d && Intrinsics.c(this.e, button1.e) && Intrinsics.c(this.f, button1.f) && Intrinsics.c(this.g, button1.g) && Intrinsics.c(this.h, button1.h) && Intrinsics.c(this.i, button1.i);
        }

        public final int hashCode() {
            String str = this.f23634a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction1 buttonAction1 = this.g;
            int iHashCode3 = (iHashCode2 + (buttonAction1 == null ? 0 : buttonAction1.hashCode())) * 31;
            String str4 = this.h;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Button1(buttonId=", this.f23634a, ", label=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", enabled=");
            sbV.append(this.d);
            sbV.append(", action=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", url=", this.f, ", buttonAction=");
            sbV.append(this.g);
            sbV.append(", iconUrl=");
            sbV.append(this.h);
            sbV.append(", altText=");
            return a.o(sbV, this.i, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ButtonAction;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23635a;
        public final String b;
        public final String c;

        public ButtonAction(ActionType actionType, String str, String str2) {
            this.f23635a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return this.f23635a == buttonAction.f23635a && Intrinsics.c(this.b, buttonAction.b) && Intrinsics.c(this.c, buttonAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23635a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ButtonAction(type=", this.f23635a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ButtonAction1;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23636a;
        public final String b;
        public final String c;

        public ButtonAction1(ActionType actionType, String str, String str2) {
            this.f23636a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction1)) {
                return false;
            }
            ButtonAction1 buttonAction1 = (ButtonAction1) obj;
            return this.f23636a == buttonAction1.f23636a && Intrinsics.c(this.b, buttonAction1.b) && Intrinsics.c(this.c, buttonAction1.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23636a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ButtonAction1(type=", this.f23636a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Category;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Category {

        /* renamed from: a, reason: collision with root package name */
        public final String f23637a;
        public final Integer b;

        public Category(String str, Integer num) {
            this.f23637a = str;
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
            return Intrinsics.c(this.f23637a, category.f23637a) && Intrinsics.c(this.b, category.b);
        }

        public final int hashCode() {
            String str = this.f23637a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Category(name=" + this.f23637a + ", categoryLevel=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Description;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Description {

        /* renamed from: a, reason: collision with root package name */
        public final String f23638a;
        public final String b;

        public Description(String str, String str2) {
            this.f23638a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return Intrinsics.c(this.f23638a, description.f23638a) && Intrinsics.c(this.b, description.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23638a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Description(altText=", this.f23638a, ", text=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Details;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Details {

        /* renamed from: a, reason: collision with root package name */
        public final double f23639a;
        public final double b;
        public final double c;
        public final AisleSide d;
        public final String e;
        public final int f;
        public final int g;
        public final Integer h;
        public final int i;

        public Details(double d, double d2, double d3, int i, int i2, int i3, AisleSide aisleSide, Integer num, String str) {
            this.f23639a = d;
            this.b = d2;
            this.c = d3;
            this.d = aisleSide;
            this.e = str;
            this.f = i;
            this.g = i2;
            this.h = num;
            this.i = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return Double.compare(this.f23639a, details.f23639a) == 0 && Double.compare(this.b, details.b) == 0 && Double.compare(this.c, details.c) == 0 && this.d == details.d && Intrinsics.c(this.e, details.e) && this.f == details.f && this.g == details.g && Intrinsics.c(this.h, details.h) && this.i == details.i;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f23639a) * 31, 31), 31)) * 31;
            String str = this.e;
            int iA = b.a(this.g, b.a(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            Integer num = this.h;
            return Integer.hashCode(this.i) + ((iA + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f23639a, "Details(x=", ", y=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", z=", this.c, ", aisleSide=");
            sbN.append(this.d);
            sbN.append(", location=");
            sbN.append(this.e);
            sbN.append(", aisleNumber=");
            a.w(this.f, this.g, ", bayNumber=", ", bayNumberAlternate=", sbN);
            sbN.append(this.h);
            sbN.append(", floorNumber=");
            sbN.append(this.i);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$DisplayInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisplayInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23640a;
        public final InStoreLocationType b;

        public DisplayInfo(String str, InStoreLocationType inStoreLocationType) {
            this.f23640a = str;
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
            return Intrinsics.c(this.f23640a, displayInfo.f23640a) && this.b == displayInfo.b;
        }

        public final int hashCode() {
            String str = this.f23640a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            InStoreLocationType inStoreLocationType = this.b;
            return iHashCode + (inStoreLocationType != null ? inStoreLocationType.hashCode() : 0);
        }

        public final String toString() {
            return "DisplayInfo(locationText=" + this.f23640a + ", locationType=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$DisplayText;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisplayText {

        /* renamed from: a, reason: collision with root package name */
        public final String f23641a;
        public final String b;

        public DisplayText(String str, String str2) {
            this.f23641a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayText)) {
                return false;
            }
            DisplayText displayText = (DisplayText) obj;
            return Intrinsics.c(this.f23641a, displayText.f23641a) && Intrinsics.c(this.b, displayText.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23641a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("DisplayText(text=", this.f23641a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Footer;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f23642a;
        public final FooterIcon b;
        public final boolean c;
        public final FooterAction d;

        public Footer(String str, FooterIcon footerIcon, boolean z, FooterAction footerAction) {
            this.f23642a = str;
            this.b = footerIcon;
            this.c = z;
            this.d = footerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f23642a, footer.f23642a) && Intrinsics.c(this.b, footer.b) && this.c == footer.c && Intrinsics.c(this.d, footer.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23642a.hashCode() * 31;
            FooterIcon footerIcon = this.b;
            int iE = b.e((iHashCode + (footerIcon == null ? 0 : footerIcon.f23644a.hashCode())) * 31, 31, this.c);
            FooterAction footerAction = this.d;
            return iE + (footerAction != null ? footerAction.hashCode() : 0);
        }

        public final String toString() {
            return "Footer(footerText=" + this.f23642a + ", footerIcon=" + this.b + ", isEnhanced=" + this.c + ", footerAction=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$FooterAction;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23643a;
        public final String b;
        public final String c;

        public FooterAction(ActionType actionType, String str, String str2) {
            this.f23643a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterAction)) {
                return false;
            }
            FooterAction footerAction = (FooterAction) obj;
            return this.f23643a == footerAction.f23643a && Intrinsics.c(this.b, footerAction.b) && Intrinsics.c(this.c, footerAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23643a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("FooterAction(type=", this.f23643a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$FooterIcon;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f23644a;

        public FooterIcon(String str) {
            this.f23644a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterIcon) && Intrinsics.c(this.f23644a, ((FooterIcon) obj).f23644a);
        }

        public final int hashCode() {
            return this.f23644a.hashCode();
        }

        public final String toString() {
            return a.h("FooterIcon(coreIconName=", this.f23644a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$InStoreInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Location f23645a;
        public final Availability b;

        public InStoreInfo(Location location, Availability availability) {
            this.f23645a = location;
            this.b = availability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreInfo)) {
                return false;
            }
            InStoreInfo inStoreInfo = (InStoreInfo) obj;
            return Intrinsics.c(this.f23645a, inStoreInfo.f23645a) && Intrinsics.c(this.b, inStoreInfo.b);
        }

        public final int hashCode() {
            Location location = this.f23645a;
            int iHashCode = (location == null ? 0 : location.hashCode()) * 31;
            Availability availability = this.b;
            return iHashCode + (availability != null ? availability.hashCode() : 0);
        }

        public final String toString() {
            return "InStoreInfo(location=" + this.f23645a + ", availability=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$InfoSheet;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f23646a;
        public final String b;
        public final Button1 c;

        public InfoSheet(String str, String str2, Button1 button1) {
            this.f23646a = str;
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
            return Intrinsics.c(this.f23646a, infoSheet.f23646a) && Intrinsics.c(this.b, infoSheet.b) && Intrinsics.c(this.c, infoSheet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23646a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InfoSheet(title=", this.f23646a, ", message=", this.b, ", button=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$List;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class List {

        /* renamed from: a, reason: collision with root package name */
        public final double f23647a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public List(double d, double d2, double d3, double d4, String str) {
            this.f23647a = d;
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
            return Double.compare(this.f23647a, list.f23647a) == 0 && Double.compare(this.b, list.b) == 0 && Double.compare(this.c, list.c) == 0 && Double.compare(this.d, list.d) == 0 && Intrinsics.c(this.e, list.e);
        }

        public final int hashCode() {
            int iA = android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f23647a) * 31, 31), 31), 31);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f23647a, "List(minimum=", ", maximum=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
            sbN.append(this.d);
            sbN.append(", unit=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Location;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Location {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayInfo f23648a;
        public final Details b;

        public Location(DisplayInfo displayInfo, Details details) {
            this.f23648a = displayInfo;
            this.b = details;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.c(this.f23648a, location.f23648a) && Intrinsics.c(this.b, location.b);
        }

        public final int hashCode() {
            DisplayInfo displayInfo = this.f23648a;
            int iHashCode = (displayInfo == null ? 0 : displayInfo.hashCode()) * 31;
            Details details = this.b;
            return iHashCode + (details != null ? details.hashCode() : 0);
        }

        public final String toString() {
            return "Location(displayInfo=" + this.f23648a + ", details=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MainProductImage;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MainProductImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23649a;
        public final String b;
        public final String c;
        public final String d;

        public MainProductImage(String str, String str2, String str3, String str4) {
            this.f23649a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainProductImage)) {
                return false;
            }
            MainProductImage mainProductImage = (MainProductImage) obj;
            return Intrinsics.c(this.f23649a, mainProductImage.f23649a) && Intrinsics.c(this.b, mainProductImage.b) && Intrinsics.c(this.c, mainProductImage.c) && Intrinsics.c(this.d, mainProductImage.d);
        }

        public final int hashCode() {
            String str = this.f23649a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("MainProductImage(smallUrl=", this.f23649a, ", mediumUrl=", this.b, ", largeUrl="), this.c, ", altText=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MarketplaceInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23650a;
        public final Description b;

        public MarketplaceInfo(String str, Description description) {
            this.f23650a = str;
            this.b = description;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceInfo)) {
                return false;
            }
            MarketplaceInfo marketplaceInfo = (MarketplaceInfo) obj;
            return Intrinsics.c(this.f23650a, marketplaceInfo.f23650a) && Intrinsics.c(this.b, marketplaceInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23650a.hashCode() * 31);
        }

        public final String toString() {
            return "MarketplaceInfo(iconUrl=" + this.f23650a + ", description=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$MiddleMessage;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MiddleMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23651a;
        public final String b;

        public MiddleMessage(String str, String str2) {
            this.f23651a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MiddleMessage)) {
                return false;
            }
            MiddleMessage middleMessage = (MiddleMessage) obj;
            return Intrinsics.c(this.f23651a, middleMessage.f23651a) && Intrinsics.c(this.b, middleMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23651a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("MiddleMessage(text=", this.f23651a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$PriceClarificationMessage;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PriceClarificationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23652a;
        public final String b;

        public PriceClarificationMessage(String str, String str2) {
            this.f23652a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceClarificationMessage)) {
                return false;
            }
            PriceClarificationMessage priceClarificationMessage = (PriceClarificationMessage) obj;
            return Intrinsics.c(this.f23652a, priceClarificationMessage.f23652a) && Intrinsics.c(this.b, priceClarificationMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23652a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("PriceClarificationMessage(text=", this.f23652a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$PriceInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PriceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23653a;
        public final Integer b;
        public final String c;
        public final java.util.List d;
        public final WasPrice e;
        public final SavePrice f;
        public final VariablePrice g;
        public final PriceClarificationMessage h;

        public PriceInfo(String str, Integer num, String str2, java.util.List list, WasPrice wasPrice, SavePrice savePrice, VariablePrice variablePrice, PriceClarificationMessage priceClarificationMessage) {
            this.f23653a = str;
            this.b = num;
            this.c = str2;
            this.d = list;
            this.e = wasPrice;
            this.f = savePrice;
            this.g = variablePrice;
            this.h = priceClarificationMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceInfo)) {
                return false;
            }
            PriceInfo priceInfo = (PriceInfo) obj;
            return Intrinsics.c(this.f23653a, priceInfo.f23653a) && Intrinsics.c(this.b, priceInfo.b) && Intrinsics.c(this.c, priceInfo.c) && Intrinsics.c(this.d, priceInfo.d) && Intrinsics.c(this.e, priceInfo.e) && Intrinsics.c(this.f, priceInfo.f) && Intrinsics.c(this.g, priceInfo.g) && Intrinsics.c(this.h, priceInfo.h);
        }

        public final int hashCode() {
            String str = this.f23653a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.util.List list = this.d;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            WasPrice wasPrice = this.e;
            int iHashCode5 = (iHashCode4 + (wasPrice == null ? 0 : wasPrice.hashCode())) * 31;
            SavePrice savePrice = this.f;
            int iHashCode6 = (iHashCode5 + (savePrice == null ? 0 : savePrice.hashCode())) * 31;
            VariablePrice variablePrice = this.g;
            int iHashCode7 = (iHashCode6 + (variablePrice == null ? 0 : variablePrice.hashCode())) * 31;
            PriceClarificationMessage priceClarificationMessage = this.h;
            return iHashCode7 + (priceClarificationMessage != null ? priceClarificationMessage.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriceInfo(leadPriceHeaderText=");
            sb.append(this.f23653a);
            sb.append(", leadPrice=");
            sb.append(this.b);
            sb.append(", leadPriceMeasure=");
            au.com.woolworths.android.onesite.a.B(sb, this.c, ", unitPriceDescriptions=", this.d, ", wasPrice=");
            sb.append(this.e);
            sb.append(", savePrice=");
            sb.append(this.f);
            sb.append(", variablePrice=");
            sb.append(this.g);
            sb.append(", priceClarificationMessage=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductCardAction;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23654a;
        public final String b;
        public final String c;

        public ProductCardAction(ActionType actionType, String str, String str2) {
            this.f23654a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCardAction)) {
                return false;
            }
            ProductCardAction productCardAction = (ProductCardAction) obj;
            return this.f23654a == productCardAction.f23654a && Intrinsics.c(this.b, productCardAction.b) && Intrinsics.c(this.c, productCardAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23654a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ProductCardAction(type=", this.f23654a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductStatus;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductStatus {

        /* renamed from: a, reason: collision with root package name */
        public final Text f23655a;
        public final ProductStatusScheme b;

        public ProductStatus(Text text, ProductStatusScheme productStatusScheme) {
            this.f23655a = text;
            this.b = productStatusScheme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductStatus)) {
                return false;
            }
            ProductStatus productStatus = (ProductStatus) obj;
            return Intrinsics.c(this.f23655a, productStatus.f23655a) && this.b == productStatus.b;
        }

        public final int hashCode() {
            Text text = this.f23655a;
            int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
            ProductStatusScheme productStatusScheme = this.b;
            return iHashCode + (productStatusScheme != null ? productStatusScheme.hashCode() : 0);
        }

        public final String toString() {
            return "ProductStatus(text=" + this.f23655a + ", colorScheme=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$ProductTag;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductTag {

        /* renamed from: a, reason: collision with root package name */
        public final String f23656a;
        public final CoreTagUI b;

        public ProductTag(String str, CoreTagUI coreTagUI) {
            this.f23656a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductTag)) {
                return false;
            }
            ProductTag productTag = (ProductTag) obj;
            return Intrinsics.c(this.f23656a, productTag.f23656a) && Intrinsics.c(this.b, productTag.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23656a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductTag(__typename=" + this.f23656a + ", coreTagUI=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RatingsAndReviews;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingsAndReviews {

        /* renamed from: a, reason: collision with root package name */
        public final Double f23657a;
        public final Integer b;
        public final DisplayText c;

        public RatingsAndReviews(Double d, Integer num, DisplayText displayText) {
            this.f23657a = d;
            this.b = num;
            this.c = displayText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingsAndReviews)) {
                return false;
            }
            RatingsAndReviews ratingsAndReviews = (RatingsAndReviews) obj;
            return Intrinsics.c(this.f23657a, ratingsAndReviews.f23657a) && Intrinsics.c(this.b, ratingsAndReviews.b) && Intrinsics.c(this.c, ratingsAndReviews.c);
        }

        public final int hashCode() {
            Double d = this.f23657a;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Integer num = this.b;
            return this.c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "RatingsAndReviews(rating=" + this.f23657a + ", reviewsCount=" + this.b + ", displayText=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RestrictionInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final PurchaseRestriction f23658a;
        public final String b;
        public final boolean c;

        public RestrictionInfo(PurchaseRestriction purchaseRestriction, String str, boolean z) {
            this.f23658a = purchaseRestriction;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestrictionInfo)) {
                return false;
            }
            RestrictionInfo restrictionInfo = (RestrictionInfo) obj;
            return this.f23658a == restrictionInfo.f23658a && Intrinsics.c(this.b, restrictionInfo.b) && this.c == restrictionInfo.c;
        }

        public final int hashCode() {
            PurchaseRestriction purchaseRestriction = this.f23658a;
            int iHashCode = (purchaseRestriction == null ? 0 : purchaseRestriction.hashCode()) * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RestrictionInfo(purchaseRestriction=");
            sb.append(this.f23658a);
            sb.append(", disclaimer=");
            sb.append(this.b);
            sb.append(", isTobacco=");
            return a.k(")", sb, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RewardsOfferInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOfferInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23659a;

        public RewardsOfferInfo(String str) {
            this.f23659a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RewardsOfferInfo) && Intrinsics.c(this.f23659a, ((RewardsOfferInfo) obj).f23659a);
        }

        public final int hashCode() {
            return this.f23659a.hashCode();
        }

        public final String toString() {
            return a.h("RewardsOfferInfo(offerId=", this.f23659a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$RoundelImage;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RoundelImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23660a;
        public final String b;
        public final RoundelImagePriority c;

        public RoundelImage(String str, String str2, RoundelImagePriority roundelImagePriority) {
            this.f23660a = str;
            this.b = str2;
            this.c = roundelImagePriority;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundelImage)) {
                return false;
            }
            RoundelImage roundelImage = (RoundelImage) obj;
            return Intrinsics.c(this.f23660a, roundelImage.f23660a) && Intrinsics.c(this.b, roundelImage.b) && this.c == roundelImage.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23660a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("RoundelImage(url=", this.f23660a, ", altText=", this.b, ", priority=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$SavePrice;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavePrice {

        /* renamed from: a, reason: collision with root package name */
        public final String f23661a;
        public final String b;

        public SavePrice(String str, String str2) {
            this.f23661a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavePrice)) {
                return false;
            }
            SavePrice savePrice = (SavePrice) obj;
            return Intrinsics.c(this.f23661a, savePrice.f23661a) && Intrinsics.c(this.b, savePrice.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23661a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("SavePrice(text=", this.f23661a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Text;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        /* renamed from: a, reason: collision with root package name */
        public final String f23662a;
        public final String b;

        public Text(String str, String str2) {
            this.f23662a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.c(this.f23662a, text.f23662a) && Intrinsics.c(this.b, text.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23662a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Text(text=", this.f23662a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$Trolley;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Trolley {

        /* renamed from: a, reason: collision with root package name */
        public final String f23663a;
        public final ProductTrolley b;

        public Trolley(String str, ProductTrolley productTrolley) {
            this.f23663a = str;
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
            return Intrinsics.c(this.f23663a, trolley.f23663a) && Intrinsics.c(this.b, trolley.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23663a.hashCode() * 31);
        }

        public final String toString() {
            return "Trolley(__typename=" + this.f23663a + ", productTrolley=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$UnitPriceDescription;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnitPriceDescription {

        /* renamed from: a, reason: collision with root package name */
        public final String f23664a;
        public final String b;

        public UnitPriceDescription(String str, String str2) {
            this.f23664a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnitPriceDescription)) {
                return false;
            }
            UnitPriceDescription unitPriceDescription = (UnitPriceDescription) obj;
            return Intrinsics.c(this.f23664a, unitPriceDescription.f23664a) && Intrinsics.c(this.b, unitPriceDescription.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23664a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("UnitPriceDescription(text=", this.f23664a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$VariablePrice;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VariablePrice {

        /* renamed from: a, reason: collision with root package name */
        public final String f23665a;
        public final String b;

        public VariablePrice(String str, String str2) {
            this.f23665a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariablePrice)) {
                return false;
            }
            VariablePrice variablePrice = (VariablePrice) obj;
            return Intrinsics.c(this.f23665a, variablePrice.f23665a) && Intrinsics.c(this.b, variablePrice.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23665a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("VariablePrice(text=", this.f23665a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/productcard/data/fragment/ProductTile$WasPrice;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WasPrice {

        /* renamed from: a, reason: collision with root package name */
        public final String f23666a;
        public final String b;

        public WasPrice(String str, String str2) {
            this.f23666a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WasPrice)) {
                return false;
            }
            WasPrice wasPrice = (WasPrice) obj;
            return Intrinsics.c(this.f23666a, wasPrice.f23666a) && Intrinsics.c(this.b, wasPrice.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23666a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("WasPrice(text=", this.f23666a, ", altText=", this.b, ")");
        }
    }

    public ProductTile(String str, String str2, RoundelImage roundelImage, MainProductImage mainProductImage, java.util.List list, PriceInfo priceInfo, java.util.List list2, MiddleMessage middleMessage, RatingsAndReviews ratingsAndReviews, Footer footer, List list3, java.util.List list4, String str3, RewardsOfferInfo rewardsOfferInfo, java.util.List list5, String str4, ProductCardAction productCardAction, InStoreInfo inStoreInfo, MarketplaceInfo marketplaceInfo, RestrictionInfo restrictionInfo) {
        this.f23631a = str;
        this.b = str2;
        this.c = roundelImage;
        this.d = mainProductImage;
        this.e = list;
        this.f = priceInfo;
        this.g = list2;
        this.h = middleMessage;
        this.i = ratingsAndReviews;
        this.j = footer;
        this.k = list3;
        this.l = list4;
        this.m = str3;
        this.n = rewardsOfferInfo;
        this.o = list5;
        this.p = str4;
        this.q = productCardAction;
        this.r = inStoreInfo;
        this.s = marketplaceInfo;
        this.t = restrictionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductTile productTile = (ProductTile) obj;
        return Intrinsics.c(this.f23631a, productTile.f23631a) && Intrinsics.c(this.b, productTile.b) && Intrinsics.c(this.c, productTile.c) && Intrinsics.c(this.d, productTile.d) && Intrinsics.c(this.e, productTile.e) && Intrinsics.c(this.f, productTile.f) && Intrinsics.c(this.g, productTile.g) && Intrinsics.c(this.h, productTile.h) && Intrinsics.c(this.i, productTile.i) && Intrinsics.c(this.j, productTile.j) && Intrinsics.c(this.k, productTile.k) && Intrinsics.c(this.l, productTile.l) && Intrinsics.c(this.m, productTile.m) && Intrinsics.c(this.n, productTile.n) && Intrinsics.c(this.o, productTile.o) && Intrinsics.c(this.p, productTile.p) && Intrinsics.c(this.q, productTile.q) && Intrinsics.c(this.r, productTile.r) && Intrinsics.c(this.s, productTile.s) && Intrinsics.c(this.t, productTile.t);
    }

    public final int hashCode() {
        int iC = b.c(this.f23631a.hashCode() * 31, 31, this.b);
        RoundelImage roundelImage = this.c;
        int iHashCode = (iC + (roundelImage == null ? 0 : roundelImage.hashCode())) * 31;
        MainProductImage mainProductImage = this.d;
        int iHashCode2 = (iHashCode + (mainProductImage == null ? 0 : mainProductImage.hashCode())) * 31;
        java.util.List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PriceInfo priceInfo = this.f;
        int iHashCode4 = (iHashCode3 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        java.util.List list2 = this.g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MiddleMessage middleMessage = this.h;
        int iHashCode6 = (iHashCode5 + (middleMessage == null ? 0 : middleMessage.hashCode())) * 31;
        RatingsAndReviews ratingsAndReviews = this.i;
        int iHashCode7 = (iHashCode6 + (ratingsAndReviews == null ? 0 : ratingsAndReviews.hashCode())) * 31;
        Footer footer = this.j;
        int iHashCode8 = (this.k.hashCode() + ((iHashCode7 + (footer == null ? 0 : footer.hashCode())) * 31)) * 31;
        java.util.List list3 = this.l;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.m;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        RewardsOfferInfo rewardsOfferInfo = this.n;
        int iHashCode11 = (iHashCode10 + (rewardsOfferInfo == null ? 0 : rewardsOfferInfo.f23659a.hashCode())) * 31;
        java.util.List list4 = this.o;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.p;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductCardAction productCardAction = this.q;
        int iHashCode14 = (iHashCode13 + (productCardAction == null ? 0 : productCardAction.hashCode())) * 31;
        InStoreInfo inStoreInfo = this.r;
        int iHashCode15 = (iHashCode14 + (inStoreInfo == null ? 0 : inStoreInfo.hashCode())) * 31;
        MarketplaceInfo marketplaceInfo = this.s;
        int iHashCode16 = (iHashCode15 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
        RestrictionInfo restrictionInfo = this.t;
        return iHashCode16 + (restrictionInfo != null ? restrictionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductTile(productId=", this.f23631a, ", productName=", this.b, ", roundelImage=");
        sbV.append(this.c);
        sbV.append(", mainProductImage=");
        sbV.append(this.d);
        sbV.append(", productTags=");
        sbV.append(this.e);
        sbV.append(", priceInfo=");
        sbV.append(this.f);
        sbV.append(", productStatuses=");
        sbV.append(this.g);
        sbV.append(", middleMessage=");
        sbV.append(this.h);
        sbV.append(", ratingsAndReviews=");
        sbV.append(this.i);
        sbV.append(", footer=");
        sbV.append(this.j);
        sbV.append(", list=");
        sbV.append(this.k);
        sbV.append(", trolleys=");
        sbV.append(this.l);
        sbV.append(", adId=");
        sbV.append(this.m);
        sbV.append(", rewardsOfferInfo=");
        sbV.append(this.n);
        sbV.append(", categories=");
        sbV.append(this.o);
        sbV.append(", source=");
        sbV.append(this.p);
        sbV.append(", productCardAction=");
        sbV.append(this.q);
        sbV.append(", inStoreInfo=");
        sbV.append(this.r);
        sbV.append(", marketplaceInfo=");
        sbV.append(this.s);
        sbV.append(", restrictionInfo=");
        sbV.append(this.t);
        sbV.append(")");
        return sbV.toString();
    }
}
