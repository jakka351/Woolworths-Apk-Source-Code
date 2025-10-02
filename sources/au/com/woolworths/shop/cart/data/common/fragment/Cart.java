package au.com.woolworths.shop.cart.data.common.fragment;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CartBannerType;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Header", "RewardsInfo", "CartSection", "Footer", "Analytic", "RequiredAlert", "CartProductQuantity", "SavingsOnCart", "CartCheckoutBtn", "OnCouponBanner", "CouponBannerTermsAndConditions", "OnInlineMessage", "OnCartAvailableProductSection", "SectionHeader", "Product", "OnCartProductCard", "OnCartProductCategory", "OnCartPromotionSection", "Info", "TooltipMessage", "Product1", "OnCartProductCard1", "OnCartProductCategory1", "OnCartMarketProductSection", "SectionHeader1", "CartTracker", "ShippingMessageBanner", "OnPromotionBanner", "Banner", "Action", "PromotionContent", "OnPromotionMarkdownContent", "SellerGroup", "Product2", "OnCartProductCard2", "OnCartProductCategory2", "OnImageTextBanner", "OnCartBanner", "Banner1", "Analytics", "Action1", "Button", "Analytics1", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Cart implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final int f10310a;
    public final Header b;
    public final RewardsInfo c;
    public final ArrayList d;
    public final Footer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ArrayList j;
    public final RequiredAlert k;
    public final ArrayList l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Action;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f10311a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f10311a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f10311a == action.f10311a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f10311a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f10311a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Action1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f10312a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action1(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f10312a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) obj;
            return this.f10312a == action1.f10312a && this.b == action1.b && Intrinsics.c(this.c, action1.c) && Intrinsics.c(this.d, action1.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f10312a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action1(placement=", this.f10312a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytic;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f10313a;
        public final AnalyticsFields b;

        public Analytic(String str, AnalyticsFields analyticsFields) {
            this.f10313a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) obj;
            return Intrinsics.c(this.f10313a, analytic.f10313a) && Intrinsics.c(this.b, analytic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10313a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytic(__typename=", this.f10313a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytics;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f10314a;
        public final String b;
        public final String c;

        public Analytics(String str, String str2, String str3) {
            this.f10314a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f10314a, analytics.f10314a) && Intrinsics.c(this.b, analytics.b) && Intrinsics.c(this.c, analytics.c);
        }

        public final int hashCode() {
            String str = this.f10314a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Analytics(eventLabel=", this.f10314a, ", eventDescription=", this.b, ", eventValue="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytics1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10315a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f10315a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f10315a, analytics1.f10315a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10315a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f10315a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Banner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f10316a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f10316a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f10316a == banner.f10316a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f10316a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f10316a, ", message=", this.b, ", iconUrl=");
            a.B(sbU, this.c, ", bannerTitle=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Banner1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f10317a;
        public final String b;
        public final String c;
        public final String d;
        public final Analytics e;
        public final Action1 f;

        public Banner1(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Analytics analytics, Action1 action1) {
            this.f10317a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = analytics;
            this.f = action1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner1)) {
                return false;
            }
            Banner1 banner1 = (Banner1) obj;
            return this.f10317a == banner1.f10317a && Intrinsics.c(this.b, banner1.b) && Intrinsics.c(this.c, banner1.c) && Intrinsics.c(this.d, banner1.d) && Intrinsics.c(this.e, banner1.e) && Intrinsics.c(this.f, banner1.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f10317a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Analytics analytics = this.e;
            int iHashCode3 = (iHashCode2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
            Action1 action1 = this.f;
            return iHashCode3 + (action1 != null ? action1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner1(displayType=", this.f10317a, ", message=", this.b, ", iconUrl=");
            a.B(sbU, this.c, ", bannerTitle=", this.d, ", analytics=");
            sbU.append(this.e);
            sbU.append(", action=");
            sbU.append(this.f);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Button;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f10318a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public Button(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f10318a = str;
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
            return Intrinsics.c(this.f10318a, button.f10318a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d;
        }

        public final int hashCode() {
            int iHashCode = this.f10318a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(YU.a.v("Button(label=", this.f10318a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartCheckoutBtn;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartCheckoutBtn {

        /* renamed from: a, reason: collision with root package name */
        public final String f10319a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CartCheckoutBtn(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f10319a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartCheckoutBtn)) {
                return false;
            }
            CartCheckoutBtn cartCheckoutBtn = (CartCheckoutBtn) obj;
            return Intrinsics.c(this.f10319a, cartCheckoutBtn.f10319a) && Intrinsics.c(this.b, cartCheckoutBtn.b) && this.c == cartCheckoutBtn.c && this.d == cartCheckoutBtn.d;
        }

        public final int hashCode() {
            int iHashCode = this.f10319a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(YU.a.v("CartCheckoutBtn(label=", this.f10319a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartProductQuantity;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartProductQuantity {

        /* renamed from: a, reason: collision with root package name */
        public final String f10320a;
        public final double b;

        public CartProductQuantity(String str, double d) {
            this.f10320a = str;
            this.b = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartProductQuantity)) {
                return false;
            }
            CartProductQuantity cartProductQuantity = (CartProductQuantity) obj;
            return Intrinsics.c(this.f10320a, cartProductQuantity.f10320a) && Double.compare(this.b, cartProductQuantity.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (this.f10320a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CartProductQuantity(productId=", this.f10320a, ", quantity=");
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartSection;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f10321a;
        public final OnCouponBanner b;
        public final OnInlineMessage c;
        public final OnCartAvailableProductSection d;
        public final OnCartPromotionSection e;
        public final OnCartMarketProductSection f;
        public final OnImageTextBanner g;
        public final OnCartBanner h;

        public CartSection(String __typename, OnCouponBanner onCouponBanner, OnInlineMessage onInlineMessage, OnCartAvailableProductSection onCartAvailableProductSection, OnCartPromotionSection onCartPromotionSection, OnCartMarketProductSection onCartMarketProductSection, OnImageTextBanner onImageTextBanner, OnCartBanner onCartBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f10321a = __typename;
            this.b = onCouponBanner;
            this.c = onInlineMessage;
            this.d = onCartAvailableProductSection;
            this.e = onCartPromotionSection;
            this.f = onCartMarketProductSection;
            this.g = onImageTextBanner;
            this.h = onCartBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartSection)) {
                return false;
            }
            CartSection cartSection = (CartSection) obj;
            return Intrinsics.c(this.f10321a, cartSection.f10321a) && Intrinsics.c(this.b, cartSection.b) && Intrinsics.c(this.c, cartSection.c) && Intrinsics.c(this.d, cartSection.d) && Intrinsics.c(this.e, cartSection.e) && Intrinsics.c(this.f, cartSection.f) && Intrinsics.c(this.g, cartSection.g) && Intrinsics.c(this.h, cartSection.h);
        }

        public final int hashCode() {
            int iHashCode = this.f10321a.hashCode() * 31;
            OnCouponBanner onCouponBanner = this.b;
            int iHashCode2 = (iHashCode + (onCouponBanner == null ? 0 : onCouponBanner.hashCode())) * 31;
            OnInlineMessage onInlineMessage = this.c;
            int iHashCode3 = (iHashCode2 + (onInlineMessage == null ? 0 : onInlineMessage.hashCode())) * 31;
            OnCartAvailableProductSection onCartAvailableProductSection = this.d;
            int iHashCode4 = (iHashCode3 + (onCartAvailableProductSection == null ? 0 : onCartAvailableProductSection.hashCode())) * 31;
            OnCartPromotionSection onCartPromotionSection = this.e;
            int iHashCode5 = (iHashCode4 + (onCartPromotionSection == null ? 0 : onCartPromotionSection.hashCode())) * 31;
            OnCartMarketProductSection onCartMarketProductSection = this.f;
            int iHashCode6 = (iHashCode5 + (onCartMarketProductSection == null ? 0 : onCartMarketProductSection.hashCode())) * 31;
            OnImageTextBanner onImageTextBanner = this.g;
            int iHashCode7 = (iHashCode6 + (onImageTextBanner == null ? 0 : onImageTextBanner.hashCode())) * 31;
            OnCartBanner onCartBanner = this.h;
            return iHashCode7 + (onCartBanner != null ? onCartBanner.hashCode() : 0);
        }

        public final String toString() {
            return "CartSection(__typename=" + this.f10321a + ", onCouponBanner=" + this.b + ", onInlineMessage=" + this.c + ", onCartAvailableProductSection=" + this.d + ", onCartPromotionSection=" + this.e + ", onCartMarketProductSection=" + this.f + ", onImageTextBanner=" + this.g + ", onCartBanner=" + this.h + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartTracker;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartTracker {

        /* renamed from: a, reason: collision with root package name */
        public final String f10322a;
        public final double b;
        public final String c;

        public CartTracker(double d, String str, String str2) {
            this.f10322a = str;
            this.b = d;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartTracker)) {
                return false;
            }
            CartTracker cartTracker = (CartTracker) obj;
            return Intrinsics.c(this.f10322a, cartTracker.f10322a) && Double.compare(this.b, cartTracker.b) == 0 && Intrinsics.c(this.c, cartTracker.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + android.support.v4.media.session.a.a(this.b, this.f10322a.hashCode() * 31, 31);
        }

        public final String toString() {
            return YU.a.p(au.com.woolworths.android.onesite.a.r(this.b, "CartTracker(title=", this.f10322a, ", freeShippingPercentage="), ", description=", this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CouponBannerTermsAndConditions;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CouponBannerTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f10323a;
        public final String b;

        public CouponBannerTermsAndConditions(String str, String str2) {
            this.f10323a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CouponBannerTermsAndConditions)) {
                return false;
            }
            CouponBannerTermsAndConditions couponBannerTermsAndConditions = (CouponBannerTermsAndConditions) obj;
            return Intrinsics.c(this.f10323a, couponBannerTermsAndConditions.f10323a) && Intrinsics.c(this.b, couponBannerTermsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10323a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("CouponBannerTermsAndConditions(url=", this.f10323a, ", title=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Footer;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f10324a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public Footer(Button button, String str, String str2, String str3, String str4, String str5) {
            this.f10324a = button;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f10324a, footer.f10324a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c) && Intrinsics.c(this.d, footer.d) && Intrinsics.c(this.e, footer.e) && Intrinsics.c(this.f, footer.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f10324a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(button=");
            sb.append(this.f10324a);
            sb.append(", totalLabel=");
            sb.append(this.b);
            sb.append(", totalAmount=");
            a.B(sb, this.c, ", totalDescription=", this.d, ", panelMarkdown=");
            return a.l(sb, this.e, ", savings=", this.f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Header;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f10325a;
        public final SavingsOnCart b;
        public final CartCheckoutBtn c;
        public final String d;

        public Header(String str, SavingsOnCart savingsOnCart, CartCheckoutBtn cartCheckoutBtn, String str2) {
            this.f10325a = str;
            this.b = savingsOnCart;
            this.c = cartCheckoutBtn;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f10325a, header.f10325a) && Intrinsics.c(this.b, header.b) && Intrinsics.c(this.c, header.c) && Intrinsics.c(this.d, header.d);
        }

        public final int hashCode() {
            int iHashCode = this.f10325a.hashCode() * 31;
            SavingsOnCart savingsOnCart = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (savingsOnCart == null ? 0 : savingsOnCart.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Header(subtotalInclDelivery=" + this.f10325a + ", savingsOnCart=" + this.b + ", cartCheckoutBtn=" + this.c + ", subtitle=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Info;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10326a;
        public final String b;
        public final String c;
        public final TooltipMessage d;

        public Info(boolean z, String str, String str2, TooltipMessage tooltipMessage) {
            this.f10326a = z;
            this.b = str;
            this.c = str2;
            this.d = tooltipMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return this.f10326a == info.f10326a && Intrinsics.c(this.b, info.b) && Intrinsics.c(this.c, info.c) && Intrinsics.c(this.d, info.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(Boolean.hashCode(this.f10326a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("Info(active=", ", imageUrl=", this.b, ", description=", this.f10326a);
            sbT.append(this.c);
            sbT.append(", tooltipMessage=");
            sbT.append(this.d);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartAvailableProductSection;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartAvailableProductSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f10327a;
        public final SectionHeader b;
        public final ArrayList c;

        public OnCartAvailableProductSection(String str, SectionHeader sectionHeader, ArrayList arrayList) {
            this.f10327a = str;
            this.b = sectionHeader;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartAvailableProductSection)) {
                return false;
            }
            OnCartAvailableProductSection onCartAvailableProductSection = (OnCartAvailableProductSection) obj;
            return Intrinsics.c(this.f10327a, onCartAvailableProductSection.f10327a) && Intrinsics.c(this.b, onCartAvailableProductSection.b) && this.c.equals(onCartAvailableProductSection.c);
        }

        public final int hashCode() {
            String str = this.f10327a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            SectionHeader sectionHeader = this.b;
            return this.c.hashCode() + ((iHashCode + (sectionHeader != null ? sectionHeader.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCartAvailableProductSection(title=");
            sb.append(this.f10327a);
            sb.append(", sectionHeader=");
            sb.append(this.b);
            sb.append(", products=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartBanner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Banner1 f10328a;
        public final CartBannerType b;

        public OnCartBanner(Banner1 banner1, CartBannerType cartBannerType) {
            this.f10328a = banner1;
            this.b = cartBannerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartBanner)) {
                return false;
            }
            OnCartBanner onCartBanner = (OnCartBanner) obj;
            return Intrinsics.c(this.f10328a, onCartBanner.f10328a) && this.b == onCartBanner.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10328a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartBanner(banner=" + this.f10328a + ", type=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartMarketProductSection;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartMarketProductSection {

        /* renamed from: a, reason: collision with root package name */
        public final SectionHeader1 f10329a;
        public final CartTracker b;
        public final ShippingMessageBanner c;
        public final ArrayList d;

        public OnCartMarketProductSection(SectionHeader1 sectionHeader1, CartTracker cartTracker, ShippingMessageBanner shippingMessageBanner, ArrayList arrayList) {
            this.f10329a = sectionHeader1;
            this.b = cartTracker;
            this.c = shippingMessageBanner;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartMarketProductSection)) {
                return false;
            }
            OnCartMarketProductSection onCartMarketProductSection = (OnCartMarketProductSection) obj;
            return Intrinsics.c(this.f10329a, onCartMarketProductSection.f10329a) && Intrinsics.c(this.b, onCartMarketProductSection.b) && Intrinsics.c(this.c, onCartMarketProductSection.c) && this.d.equals(onCartMarketProductSection.d);
        }

        public final int hashCode() {
            SectionHeader1 sectionHeader1 = this.f10329a;
            int iHashCode = (sectionHeader1 == null ? 0 : sectionHeader1.hashCode()) * 31;
            CartTracker cartTracker = this.b;
            int iHashCode2 = (iHashCode + (cartTracker == null ? 0 : cartTracker.hashCode())) * 31;
            ShippingMessageBanner shippingMessageBanner = this.c;
            return this.d.hashCode() + ((iHashCode2 + (shippingMessageBanner != null ? shippingMessageBanner.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "OnCartMarketProductSection(sectionHeader=" + this.f10329a + ", cartTracker=" + this.b + ", shippingMessageBanner=" + this.c + ", sellerGroups=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f10330a;
        public final CartProductCard b;

        public OnCartProductCard(String str, CartProductCard cartProductCard) {
            this.f10330a = str;
            this.b = cartProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCard)) {
                return false;
            }
            OnCartProductCard onCartProductCard = (OnCartProductCard) obj;
            return Intrinsics.c(this.f10330a, onCartProductCard.f10330a) && Intrinsics.c(this.b, onCartProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10330a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCard(__typename=" + this.f10330a + ", cartProductCard=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10331a;
        public final CartProductCard b;

        public OnCartProductCard1(String str, CartProductCard cartProductCard) {
            this.f10331a = str;
            this.b = cartProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCard1)) {
                return false;
            }
            OnCartProductCard1 onCartProductCard1 = (OnCartProductCard1) obj;
            return Intrinsics.c(this.f10331a, onCartProductCard1.f10331a) && Intrinsics.c(this.b, onCartProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10331a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCard1(__typename=" + this.f10331a + ", cartProductCard=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard2;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCard2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10332a;
        public final CartProductCard b;

        public OnCartProductCard2(String str, CartProductCard cartProductCard) {
            this.f10332a = str;
            this.b = cartProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCard2)) {
                return false;
            }
            OnCartProductCard2 onCartProductCard2 = (OnCartProductCard2) obj;
            return Intrinsics.c(this.f10332a, onCartProductCard2.f10332a) && Intrinsics.c(this.b, onCartProductCard2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10332a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCard2(__typename=" + this.f10332a + ", cartProductCard=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCategory {

        /* renamed from: a, reason: collision with root package name */
        public final String f10333a;
        public final CartProductCategory b;

        public OnCartProductCategory(String str, CartProductCategory cartProductCategory) {
            this.f10333a = str;
            this.b = cartProductCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCategory)) {
                return false;
            }
            OnCartProductCategory onCartProductCategory = (OnCartProductCategory) obj;
            return Intrinsics.c(this.f10333a, onCartProductCategory.f10333a) && Intrinsics.c(this.b, onCartProductCategory.b);
        }

        public final int hashCode() {
            return this.b.f10420a.hashCode() + (this.f10333a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCategory(__typename=" + this.f10333a + ", cartProductCategory=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCategory1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10334a;
        public final CartProductCategory b;

        public OnCartProductCategory1(String str, CartProductCategory cartProductCategory) {
            this.f10334a = str;
            this.b = cartProductCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCategory1)) {
                return false;
            }
            OnCartProductCategory1 onCartProductCategory1 = (OnCartProductCategory1) obj;
            return Intrinsics.c(this.f10334a, onCartProductCategory1.f10334a) && Intrinsics.c(this.b, onCartProductCategory1.b);
        }

        public final int hashCode() {
            return this.b.f10420a.hashCode() + (this.f10334a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCategory1(__typename=" + this.f10334a + ", cartProductCategory=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory2;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartProductCategory2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10335a;
        public final CartProductCategory b;

        public OnCartProductCategory2(String str, CartProductCategory cartProductCategory) {
            this.f10335a = str;
            this.b = cartProductCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartProductCategory2)) {
                return false;
            }
            OnCartProductCategory2 onCartProductCategory2 = (OnCartProductCategory2) obj;
            return Intrinsics.c(this.f10335a, onCartProductCategory2.f10335a) && Intrinsics.c(this.b, onCartProductCategory2.b);
        }

        public final int hashCode() {
            return this.b.f10420a.hashCode() + (this.f10335a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCartProductCategory2(__typename=" + this.f10335a + ", cartProductCategory=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartPromotionSection;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartPromotionSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f10336a;
        public final String b;
        public final Info c;
        public final ArrayList d;

        public OnCartPromotionSection(String str, String str2, Info info, ArrayList arrayList) {
            this.f10336a = str;
            this.b = str2;
            this.c = info;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartPromotionSection)) {
                return false;
            }
            OnCartPromotionSection onCartPromotionSection = (OnCartPromotionSection) obj;
            return Intrinsics.c(this.f10336a, onCartPromotionSection.f10336a) && this.b.equals(onCartPromotionSection.b) && this.c.equals(onCartPromotionSection.c) && this.d.equals(onCartPromotionSection.d);
        }

        public final int hashCode() {
            String str = this.f10336a;
            return this.d.hashCode() + ((this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCartPromotionSection(promotionSectionTitle=", this.f10336a, ", promotionId=", this.b, ", info=");
            sbV.append(this.c);
            sbV.append(", products=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCouponBanner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCouponBanner {

        /* renamed from: a, reason: collision with root package name */
        public final CouponBannerColorTheme f10337a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final CouponBannerTermsAndConditions f;

        public OnCouponBanner(CouponBannerColorTheme couponBannerColorTheme, String str, String str2, String str3, String str4, CouponBannerTermsAndConditions couponBannerTermsAndConditions) {
            this.f10337a = couponBannerColorTheme;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = couponBannerTermsAndConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCouponBanner)) {
                return false;
            }
            OnCouponBanner onCouponBanner = (OnCouponBanner) obj;
            return this.f10337a == onCouponBanner.f10337a && Intrinsics.c(this.b, onCouponBanner.b) && Intrinsics.c(this.c, onCouponBanner.c) && Intrinsics.c(this.d, onCouponBanner.d) && Intrinsics.c(this.e, onCouponBanner.e) && Intrinsics.c(this.f, onCouponBanner.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f10337a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.f.hashCode() + b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCouponBanner(couponBannerColorTheme=");
            sb.append(this.f10337a);
            sb.append(", couponBannerCouponCode=");
            sb.append(this.b);
            sb.append(", couponBannerDescription=");
            a.B(sb, this.c, ", couponBannerImage=", this.d, ", couponBannerMinimumSpend=");
            sb.append(this.e);
            sb.append(", couponBannerTermsAndConditions=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnImageTextBanner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnImageTextBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f10338a;
        public final String b;

        public OnImageTextBanner(String str, String str2) {
            this.f10338a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnImageTextBanner)) {
                return false;
            }
            OnImageTextBanner onImageTextBanner = (OnImageTextBanner) obj;
            return Intrinsics.c(this.f10338a, onImageTextBanner.f10338a) && Intrinsics.c(this.b, onImageTextBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10338a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnImageTextBanner(imageUrl=", this.f10338a, ", message=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnInlineMessage;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInlineMessage {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f10339a;
        public final String b;

        public OnInlineMessage(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f10339a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInlineMessage)) {
                return false;
            }
            OnInlineMessage onInlineMessage = (OnInlineMessage) obj;
            return this.f10339a == onInlineMessage.f10339a && Intrinsics.c(this.b, onInlineMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10339a.hashCode() * 31);
        }

        public final String toString() {
            return "OnInlineMessage(displayType=" + this.f10339a + ", message=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnPromotionBanner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Banner f10340a;
        public final PromotionContent b;

        public OnPromotionBanner(Banner banner, PromotionContent promotionContent) {
            this.f10340a = banner;
            this.b = promotionContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionBanner)) {
                return false;
            }
            OnPromotionBanner onPromotionBanner = (OnPromotionBanner) obj;
            return Intrinsics.c(this.f10340a, onPromotionBanner.f10340a) && Intrinsics.c(this.b, onPromotionBanner.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10340a.hashCode() * 31;
            PromotionContent promotionContent = this.b;
            return iHashCode + (promotionContent == null ? 0 : promotionContent.hashCode());
        }

        public final String toString() {
            return "OnPromotionBanner(banner=" + this.f10340a + ", promotionContent=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnPromotionMarkdownContent;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionMarkdownContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f10341a;
        public final String b;

        public OnPromotionMarkdownContent(String str, String str2) {
            this.f10341a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionMarkdownContent)) {
                return false;
            }
            OnPromotionMarkdownContent onPromotionMarkdownContent = (OnPromotionMarkdownContent) obj;
            return Intrinsics.c(this.f10341a, onPromotionMarkdownContent.f10341a) && Intrinsics.c(this.b, onPromotionMarkdownContent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10341a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnPromotionMarkdownContent(promotionMarkdownTitle=", this.f10341a, ", promotionMarkdownText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f10342a;
        public final OnCartProductCard b;
        public final OnCartProductCategory c;

        public Product(String __typename, OnCartProductCard onCartProductCard, OnCartProductCategory onCartProductCategory) {
            Intrinsics.h(__typename, "__typename");
            this.f10342a = __typename;
            this.b = onCartProductCard;
            this.c = onCartProductCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f10342a, product.f10342a) && Intrinsics.c(this.b, product.b) && Intrinsics.c(this.c, product.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10342a.hashCode() * 31;
            OnCartProductCard onCartProductCard = this.b;
            int iHashCode2 = (iHashCode + (onCartProductCard == null ? 0 : onCartProductCard.hashCode())) * 31;
            OnCartProductCategory onCartProductCategory = this.c;
            return iHashCode2 + (onCartProductCategory != null ? onCartProductCategory.hashCode() : 0);
        }

        public final String toString() {
            return "Product(__typename=" + this.f10342a + ", onCartProductCard=" + this.b + ", onCartProductCategory=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10343a;
        public final OnCartProductCard1 b;
        public final OnCartProductCategory1 c;

        public Product1(String __typename, OnCartProductCard1 onCartProductCard1, OnCartProductCategory1 onCartProductCategory1) {
            Intrinsics.h(__typename, "__typename");
            this.f10343a = __typename;
            this.b = onCartProductCard1;
            this.c = onCartProductCategory1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product1)) {
                return false;
            }
            Product1 product1 = (Product1) obj;
            return Intrinsics.c(this.f10343a, product1.f10343a) && Intrinsics.c(this.b, product1.b) && Intrinsics.c(this.c, product1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10343a.hashCode() * 31;
            OnCartProductCard1 onCartProductCard1 = this.b;
            int iHashCode2 = (iHashCode + (onCartProductCard1 == null ? 0 : onCartProductCard1.hashCode())) * 31;
            OnCartProductCategory1 onCartProductCategory1 = this.c;
            return iHashCode2 + (onCartProductCategory1 != null ? onCartProductCategory1.hashCode() : 0);
        }

        public final String toString() {
            return "Product1(__typename=" + this.f10343a + ", onCartProductCard=" + this.b + ", onCartProductCategory=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product2;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10344a;
        public final OnCartProductCard2 b;
        public final OnCartProductCategory2 c;

        public Product2(String __typename, OnCartProductCard2 onCartProductCard2, OnCartProductCategory2 onCartProductCategory2) {
            Intrinsics.h(__typename, "__typename");
            this.f10344a = __typename;
            this.b = onCartProductCard2;
            this.c = onCartProductCategory2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product2)) {
                return false;
            }
            Product2 product2 = (Product2) obj;
            return Intrinsics.c(this.f10344a, product2.f10344a) && Intrinsics.c(this.b, product2.b) && Intrinsics.c(this.c, product2.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10344a.hashCode() * 31;
            OnCartProductCard2 onCartProductCard2 = this.b;
            int iHashCode2 = (iHashCode + (onCartProductCard2 == null ? 0 : onCartProductCard2.hashCode())) * 31;
            OnCartProductCategory2 onCartProductCategory2 = this.c;
            return iHashCode2 + (onCartProductCategory2 != null ? onCartProductCategory2.hashCode() : 0);
        }

        public final String toString() {
            return "Product2(__typename=" + this.f10344a + ", onCartProductCard=" + this.b + ", onCartProductCategory=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$PromotionContent;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f10345a;
        public final OnPromotionMarkdownContent b;

        public PromotionContent(String __typename, OnPromotionMarkdownContent onPromotionMarkdownContent) {
            Intrinsics.h(__typename, "__typename");
            this.f10345a = __typename;
            this.b = onPromotionMarkdownContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionContent)) {
                return false;
            }
            PromotionContent promotionContent = (PromotionContent) obj;
            return Intrinsics.c(this.f10345a, promotionContent.f10345a) && Intrinsics.c(this.b, promotionContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10345a.hashCode() * 31;
            OnPromotionMarkdownContent onPromotionMarkdownContent = this.b;
            return iHashCode + (onPromotionMarkdownContent == null ? 0 : onPromotionMarkdownContent.hashCode());
        }

        public final String toString() {
            return "PromotionContent(__typename=" + this.f10345a + ", onPromotionMarkdownContent=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$RequiredAlert;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequiredAlert {

        /* renamed from: a, reason: collision with root package name */
        public final String f10346a;
        public final String b;
        public final String c;
        public final Analytics1 d;

        public RequiredAlert(String str, String str2, String str3, Analytics1 analytics1) {
            this.f10346a = str;
            this.b = str2;
            this.c = str3;
            this.d = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequiredAlert)) {
                return false;
            }
            RequiredAlert requiredAlert = (RequiredAlert) obj;
            return Intrinsics.c(this.f10346a, requiredAlert.f10346a) && Intrinsics.c(this.b, requiredAlert.b) && Intrinsics.c(this.c, requiredAlert.c) && Intrinsics.c(this.d, requiredAlert.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f10346a.hashCode() * 31, 31, this.b), 31, this.c);
            Analytics1 analytics1 = this.d;
            return iC + (analytics1 == null ? 0 : analytics1.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("RequiredAlert(title=", this.f10346a, ", message=", this.b, ", buttonTitle=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$RewardsInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10347a;
        public final String b;

        public RewardsInfo(String str, String str2) {
            this.f10347a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsInfo)) {
                return false;
            }
            RewardsInfo rewardsInfo = (RewardsInfo) obj;
            return Intrinsics.c(this.f10347a, rewardsInfo.f10347a) && Intrinsics.c(this.b, rewardsInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10347a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("RewardsInfo(imageUrl=", this.f10347a, ", title=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SavingsOnCart;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavingsOnCart {

        /* renamed from: a, reason: collision with root package name */
        public final String f10348a;
        public final String b;

        public SavingsOnCart(String str, String str2) {
            this.f10348a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsOnCart)) {
                return false;
            }
            SavingsOnCart savingsOnCart = (SavingsOnCart) obj;
            return Intrinsics.c(this.f10348a, savingsOnCart.f10348a) && Intrinsics.c(this.b, savingsOnCart.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10348a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("SavingsOnCart(label=", this.f10348a, ", amount=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SectionHeader;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SectionHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f10349a;
        public final String b;

        public SectionHeader(String str, String str2) {
            this.f10349a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) obj;
            return Intrinsics.c(this.f10349a, sectionHeader.f10349a) && Intrinsics.c(this.b, sectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10349a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("SectionHeader(title=", this.f10349a, ", imageUrl=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SectionHeader1;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SectionHeader1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f10350a;
        public final String b;

        public SectionHeader1(String str, String str2) {
            this.f10350a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionHeader1)) {
                return false;
            }
            SectionHeader1 sectionHeader1 = (SectionHeader1) obj;
            return Intrinsics.c(this.f10350a, sectionHeader1.f10350a) && Intrinsics.c(this.b, sectionHeader1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10350a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("SectionHeader1(title=", this.f10350a, ", imageUrl=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SellerGroup;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SellerGroup {

        /* renamed from: a, reason: collision with root package name */
        public final String f10351a;
        public final String b;
        public final ArrayList c;

        public SellerGroup(String str, String str2, ArrayList arrayList) {
            this.f10351a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerGroup)) {
                return false;
            }
            SellerGroup sellerGroup = (SellerGroup) obj;
            return this.f10351a.equals(sellerGroup.f10351a) && this.b.equals(sellerGroup.b) && this.c.equals(sellerGroup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f10351a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("SellerGroup(sellerName=", this.f10351a, ", dispatchNote=", this.b, ", products="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$ShippingMessageBanner;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShippingMessageBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f10352a;
        public final OnPromotionBanner b;

        public ShippingMessageBanner(String __typename, OnPromotionBanner onPromotionBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f10352a = __typename;
            this.b = onPromotionBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShippingMessageBanner)) {
                return false;
            }
            ShippingMessageBanner shippingMessageBanner = (ShippingMessageBanner) obj;
            return Intrinsics.c(this.f10352a, shippingMessageBanner.f10352a) && Intrinsics.c(this.b, shippingMessageBanner.b);
        }

        public final int hashCode() {
            int iHashCode = this.f10352a.hashCode() * 31;
            OnPromotionBanner onPromotionBanner = this.b;
            return iHashCode + (onPromotionBanner == null ? 0 : onPromotionBanner.hashCode());
        }

        public final String toString() {
            return "ShippingMessageBanner(__typename=" + this.f10352a + ", onPromotionBanner=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/Cart$TooltipMessage;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TooltipMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f10353a;
        public final String b;

        public TooltipMessage(String str, String str2) {
            this.f10353a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipMessage)) {
                return false;
            }
            TooltipMessage tooltipMessage = (TooltipMessage) obj;
            return Intrinsics.c(this.f10353a, tooltipMessage.f10353a) && Intrinsics.c(this.b, tooltipMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10353a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("TooltipMessage(title=", this.f10353a, ", message=", this.b, ")");
        }
    }

    public Cart(int i, Header header, RewardsInfo rewardsInfo, ArrayList arrayList, Footer footer, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList2, RequiredAlert requiredAlert, ArrayList arrayList3) {
        this.f10310a = i;
        this.b = header;
        this.c = rewardsInfo;
        this.d = arrayList;
        this.e = footer;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = arrayList2;
        this.k = requiredAlert;
        this.l = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return this.f10310a == cart.f10310a && this.b.equals(cart.b) && Intrinsics.c(this.c, cart.c) && this.d.equals(cart.d) && this.e.equals(cart.e) && this.f == cart.f && this.g == cart.g && this.h == cart.h && this.i == cart.i && this.j.equals(cart.j) && Intrinsics.c(this.k, cart.k) && this.l.equals(cart.l);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f10310a) * 31)) * 31;
        RewardsInfo rewardsInfo = this.c;
        int iB = androidx.compose.ui.input.pointer.a.b(b.e(b.e(b.e(b.e((this.e.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode + (rewardsInfo == null ? 0 : rewardsInfo.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        RequiredAlert requiredAlert = this.k;
        return this.l.hashCode() + ((iB + (requiredAlert != null ? requiredAlert.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cart(totalProducts=");
        sb.append(this.f10310a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", rewardsInfo=");
        sb.append(this.c);
        sb.append(", cartSections=");
        sb.append(this.d);
        sb.append(", footer=");
        sb.append(this.e);
        sb.append(", requiresProductReview=");
        sb.append(this.f);
        sb.append(", requiresFulfilmentWindow=");
        au.com.woolworths.android.onesite.a.D(sb, this.g, ", requiresHaveYouForgotten=", this.h, ", requiresFulfilmentAddress=");
        sb.append(this.i);
        sb.append(", analytics=");
        sb.append(this.j);
        sb.append(", requiredAlert=");
        sb.append(this.k);
        sb.append(", cartProductQuantities=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
