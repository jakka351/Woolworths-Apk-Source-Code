package com.woolworths.shop.checkout.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.CheckoutBadgeStyle;
import au.com.woolworths.shop.graphql.type.DeliveryNowStatus;
import au.com.woolworths.shop.graphql.type.DirectToBootNowStatus;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001:4\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Subheader", "Footer", "SuggestedGroup", "Option", "FeesInfo", "SelectionOptionsInfo", "Action", "Slot", "Badge", "SelectionInfo", "Tag", "Status", "BottomSheet", "FooterV2", "ExtraInfoButton", "ExtraInfo", "DeliveryNowV2", "Tag1", "Status1", "Info", "Item", "DeliveryNowV2Badge", "AltLabel", "SelectionInfo1", "DirectToBootNow", "DirectToBootNowV2", "Tag2", "Status2", "DirectToBootNowV2Badge", "AltLabel1", "TileBadge", "SelectionInfo2", "SelectionOptionsState", "Group", "Message", "Slot1", "Badge1", "SelectionInfo3", "SelectionOptionsState1", "Tag3", "Status3", "SlotsV2", "Badge2", "SelectionInfo4", "Tag4", "Status4", "SelectionOption", "Icon", "SelectionOptionsInfoTag", "AltLabel2", "DisabledBadge", "AltLabel3", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckoutFulfilmentWindows implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f22372a;
    public final String b;
    public final Subheader c;
    public final String d;
    public final Footer e;
    public final String f;
    public final SuggestedGroup g;
    public final ArrayList h;
    public final FeesInfo i;
    public final SelectionOptionsInfo j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Action;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f22373a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22373a = insetBannerActionPlacement;
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
            return this.f22373a == action.f22373a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f22373a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f22373a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AltLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f22374a;
        public final String b;

        public AltLabel(String str, String str2) {
            this.f22374a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltLabel)) {
                return false;
            }
            AltLabel altLabel = (AltLabel) obj;
            return Intrinsics.c(this.f22374a, altLabel.f22374a) && Intrinsics.c(this.b, altLabel.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22374a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("AltLabel(text=", this.f22374a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AltLabel1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22375a;
        public final String b;

        public AltLabel1(String str, String str2) {
            this.f22375a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltLabel1)) {
                return false;
            }
            AltLabel1 altLabel1 = (AltLabel1) obj;
            return Intrinsics.c(this.f22375a, altLabel1.f22375a) && Intrinsics.c(this.b, altLabel1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22375a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("AltLabel1(text=", this.f22375a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AltLabel2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22376a;
        public final String b;

        public AltLabel2(String str, String str2) {
            this.f22376a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltLabel2)) {
                return false;
            }
            AltLabel2 altLabel2 = (AltLabel2) obj;
            return Intrinsics.c(this.f22376a, altLabel2.f22376a) && Intrinsics.c(this.b, altLabel2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22376a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("AltLabel2(text=", this.f22376a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel3;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AltLabel3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22377a;
        public final String b;

        public AltLabel3(String str, String str2) {
            this.f22377a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AltLabel3)) {
                return false;
            }
            AltLabel3 altLabel3 = (AltLabel3) obj;
            return Intrinsics.c(this.f22377a, altLabel3.f22377a) && Intrinsics.c(this.b, altLabel3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22377a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("AltLabel3(text=", this.f22377a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22378a;
        public final CheckoutBadgeStyle b;

        public Badge(String str, CheckoutBadgeStyle checkoutBadgeStyle) {
            this.f22378a = str;
            this.b = checkoutBadgeStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f22378a, badge.f22378a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22378a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(title=" + this.f22378a + ", style=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22379a;
        public final CheckoutBadgeStyle b;

        public Badge1(String str, CheckoutBadgeStyle checkoutBadgeStyle) {
            this.f22379a = str;
            this.b = checkoutBadgeStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge1)) {
                return false;
            }
            Badge1 badge1 = (Badge1) obj;
            return Intrinsics.c(this.f22379a, badge1.f22379a) && this.b == badge1.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22379a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge1(title=" + this.f22379a + ", style=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22380a;
        public final CheckoutBadgeStyle b;

        public Badge2(String str, CheckoutBadgeStyle checkoutBadgeStyle) {
            this.f22380a = str;
            this.b = checkoutBadgeStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge2)) {
                return false;
            }
            Badge2 badge2 = (Badge2) obj;
            return Intrinsics.c(this.f22380a, badge2.f22380a) && this.b == badge2.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22380a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge2(title=" + this.f22380a + ", style=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$BottomSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f22381a;
        public final String b;

        public BottomSheet(String str, String str2) {
            this.f22381a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj;
            return Intrinsics.c(this.f22381a, bottomSheet.f22381a) && Intrinsics.c(this.b, bottomSheet.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22381a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("BottomSheet(bottomSheetTitle=", this.f22381a, ", bottomSheetBody=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DeliveryNowV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowV2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f22382a;
        public final String b;
        public final List c;
        public final List d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final Info l;
        public final boolean m;
        public final boolean n;
        public final DeliveryNowV2Badge o;
        public final SelectionInfo1 p;

        public DeliveryNowV2(int i, String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Info info, boolean z, boolean z2, DeliveryNowV2Badge deliveryNowV2Badge, SelectionInfo1 selectionInfo1) {
            this.f22382a = i;
            this.b = str;
            this.c = list;
            this.d = list2;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = info;
            this.m = z;
            this.n = z2;
            this.o = deliveryNowV2Badge;
            this.p = selectionInfo1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryNowV2)) {
                return false;
            }
            DeliveryNowV2 deliveryNowV2 = (DeliveryNowV2) obj;
            return this.f22382a == deliveryNowV2.f22382a && Intrinsics.c(this.b, deliveryNowV2.b) && Intrinsics.c(this.c, deliveryNowV2.c) && Intrinsics.c(this.d, deliveryNowV2.d) && Intrinsics.c(this.e, deliveryNowV2.e) && Intrinsics.c(this.f, deliveryNowV2.f) && Intrinsics.c(this.g, deliveryNowV2.g) && Intrinsics.c(this.h, deliveryNowV2.h) && Intrinsics.c(this.i, deliveryNowV2.i) && Intrinsics.c(this.j, deliveryNowV2.j) && Intrinsics.c(this.k, deliveryNowV2.k) && Intrinsics.c(this.l, deliveryNowV2.l) && this.m == deliveryNowV2.m && this.n == deliveryNowV2.n && Intrinsics.c(this.o, deliveryNowV2.o) && Intrinsics.c(this.p, deliveryNowV2.p);
        }

        public final int hashCode() {
            int iC = b.c(Integer.hashCode(this.f22382a) * 31, 31, this.b);
            List list = this.c;
            int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.d;
            int iC2 = b.c(b.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.e), 31, this.f);
            String str = this.g;
            int iE = b.e(b.e((this.l.hashCode() + b.c(b.c(b.c(b.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
            DeliveryNowV2Badge deliveryNowV2Badge = this.o;
            int iHashCode2 = (iE + (deliveryNowV2Badge == null ? 0 : deliveryNowV2Badge.hashCode())) * 31;
            SelectionInfo1 selectionInfo1 = this.p;
            return iHashCode2 + (selectionInfo1 != null ? selectionInfo1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbP = a.p("DeliveryNowV2(id=", this.f22382a, ", startTime=", this.b, ", tags=");
            au.com.woolworths.android.onesite.a.C(sbP, this.c, ", statuses=", this.d, ", title=");
            a.B(sbP, this.e, ", subtitle=", this.f, ", secondarySubtitle=");
            a.B(sbP, this.g, ", sectionTitle=", this.h, ", imageUrl=");
            a.B(sbP, this.i, ", messageTitle=", this.j, ", buttonTitle=");
            sbP.append(this.k);
            sbP.append(", info=");
            sbP.append(this.l);
            sbP.append(", isSelected=");
            au.com.woolworths.android.onesite.a.D(sbP, this.m, ", isEnabled=", this.n, ", deliveryNowV2Badge=");
            sbP.append(this.o);
            sbP.append(", selectionInfo=");
            sbP.append(this.p);
            sbP.append(")");
            return sbP.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DeliveryNowV2Badge;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowV2Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22383a;
        public final AltLabel b;
        public final BadgeType c;

        public DeliveryNowV2Badge(String str, AltLabel altLabel, BadgeType badgeType) {
            this.f22383a = str;
            this.b = altLabel;
            this.c = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryNowV2Badge)) {
                return false;
            }
            DeliveryNowV2Badge deliveryNowV2Badge = (DeliveryNowV2Badge) obj;
            return Intrinsics.c(this.f22383a, deliveryNowV2Badge.f22383a) && Intrinsics.c(this.b, deliveryNowV2Badge.b) && this.c == deliveryNowV2Badge.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22383a.hashCode() * 31;
            AltLabel altLabel = this.b;
            return this.c.hashCode() + ((iHashCode + (altLabel == null ? 0 : altLabel.hashCode())) * 31);
        }

        public final String toString() {
            return "DeliveryNowV2Badge(label=" + this.f22383a + ", altLabel=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNow;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectToBootNow {

        /* renamed from: a, reason: collision with root package name */
        public final int f22384a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;

        public DirectToBootNow(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.f22384a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectToBootNow)) {
                return false;
            }
            DirectToBootNow directToBootNow = (DirectToBootNow) obj;
            return this.f22384a == directToBootNow.f22384a && Intrinsics.c(this.b, directToBootNow.b) && Intrinsics.c(this.c, directToBootNow.c) && Intrinsics.c(this.d, directToBootNow.d) && Intrinsics.c(this.e, directToBootNow.e) && Intrinsics.c(this.f, directToBootNow.f) && Intrinsics.c(this.g, directToBootNow.g) && this.h == directToBootNow.h;
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(Integer.hashCode(this.f22384a) * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return Boolean.hashCode(this.h) + b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbP = a.p("DirectToBootNow(id=", this.f22384a, ", startTime=", this.b, ", title=");
            a.B(sbP, this.c, ", subtitle=", this.d, ", secondarySubtitle=");
            a.B(sbP, this.e, ", sectionTitle=", this.f, ", imageUrl=");
            return d.r(this.g, ", isSelected=", ")", sbP, this.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNowV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectToBootNowV2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f22385a;
        public final String b;
        public final List c;
        public final List d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final boolean j;
        public final boolean k;
        public final DirectToBootNowV2Badge l;
        public final TileBadge m;
        public final SelectionInfo2 n;
        public final SelectionOptionsState o;

        public DirectToBootNowV2(int i, String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, DirectToBootNowV2Badge directToBootNowV2Badge, TileBadge tileBadge, SelectionInfo2 selectionInfo2, SelectionOptionsState selectionOptionsState) {
            this.f22385a = i;
            this.b = str;
            this.c = list;
            this.d = list2;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = z;
            this.k = z2;
            this.l = directToBootNowV2Badge;
            this.m = tileBadge;
            this.n = selectionInfo2;
            this.o = selectionOptionsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectToBootNowV2)) {
                return false;
            }
            DirectToBootNowV2 directToBootNowV2 = (DirectToBootNowV2) obj;
            return this.f22385a == directToBootNowV2.f22385a && Intrinsics.c(this.b, directToBootNowV2.b) && Intrinsics.c(this.c, directToBootNowV2.c) && Intrinsics.c(this.d, directToBootNowV2.d) && Intrinsics.c(this.e, directToBootNowV2.e) && Intrinsics.c(this.f, directToBootNowV2.f) && Intrinsics.c(this.g, directToBootNowV2.g) && Intrinsics.c(this.h, directToBootNowV2.h) && Intrinsics.c(this.i, directToBootNowV2.i) && this.j == directToBootNowV2.j && this.k == directToBootNowV2.k && Intrinsics.c(this.l, directToBootNowV2.l) && Intrinsics.c(this.m, directToBootNowV2.m) && Intrinsics.c(this.n, directToBootNowV2.n) && Intrinsics.c(this.o, directToBootNowV2.o);
        }

        public final int hashCode() {
            int iC = b.c(Integer.hashCode(this.f22385a) * 31, 31, this.b);
            List list = this.c;
            int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.d;
            int iC2 = b.c(b.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.e), 31, this.f);
            String str = this.g;
            int iE = b.e(b.e(b.c(b.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            DirectToBootNowV2Badge directToBootNowV2Badge = this.l;
            int iHashCode2 = (iE + (directToBootNowV2Badge == null ? 0 : directToBootNowV2Badge.hashCode())) * 31;
            TileBadge tileBadge = this.m;
            int iHashCode3 = (iHashCode2 + (tileBadge == null ? 0 : tileBadge.hashCode())) * 31;
            SelectionInfo2 selectionInfo2 = this.n;
            int iHashCode4 = (iHashCode3 + (selectionInfo2 == null ? 0 : selectionInfo2.hashCode())) * 31;
            SelectionOptionsState selectionOptionsState = this.o;
            return iHashCode4 + (selectionOptionsState != null ? selectionOptionsState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbP = a.p("DirectToBootNowV2(id=", this.f22385a, ", startTime=", this.b, ", tags=");
            au.com.woolworths.android.onesite.a.C(sbP, this.c, ", statuses=", this.d, ", title=");
            a.B(sbP, this.e, ", subtitle=", this.f, ", secondarySubtitle=");
            a.B(sbP, this.g, ", sectionTitle=", this.h, ", imageUrl=");
            d.A(this.i, ", isSelected=", ", isEnabled=", sbP, this.j);
            sbP.append(this.k);
            sbP.append(", directToBootNowV2Badge=");
            sbP.append(this.l);
            sbP.append(", tileBadge=");
            sbP.append(this.m);
            sbP.append(", selectionInfo=");
            sbP.append(this.n);
            sbP.append(", selectionOptionsState=");
            sbP.append(this.o);
            sbP.append(")");
            return sbP.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNowV2Badge;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectToBootNowV2Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22386a;
        public final AltLabel1 b;
        public final BadgeType c;

        public DirectToBootNowV2Badge(String str, AltLabel1 altLabel1, BadgeType badgeType) {
            this.f22386a = str;
            this.b = altLabel1;
            this.c = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectToBootNowV2Badge)) {
                return false;
            }
            DirectToBootNowV2Badge directToBootNowV2Badge = (DirectToBootNowV2Badge) obj;
            return Intrinsics.c(this.f22386a, directToBootNowV2Badge.f22386a) && Intrinsics.c(this.b, directToBootNowV2Badge.b) && this.c == directToBootNowV2Badge.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22386a.hashCode() * 31;
            AltLabel1 altLabel1 = this.b;
            return this.c.hashCode() + ((iHashCode + (altLabel1 == null ? 0 : altLabel1.hashCode())) * 31);
        }

        public final String toString() {
            return "DirectToBootNowV2Badge(label=" + this.f22386a + ", altLabel=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DisabledBadge;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DisabledBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22387a;
        public final AltLabel3 b;
        public final BadgeType c;

        public DisabledBadge(String str, AltLabel3 altLabel3, BadgeType badgeType) {
            this.f22387a = str;
            this.b = altLabel3;
            this.c = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisabledBadge)) {
                return false;
            }
            DisabledBadge disabledBadge = (DisabledBadge) obj;
            return Intrinsics.c(this.f22387a, disabledBadge.f22387a) && Intrinsics.c(this.b, disabledBadge.b) && this.c == disabledBadge.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22387a.hashCode() * 31;
            AltLabel3 altLabel3 = this.b;
            return this.c.hashCode() + ((iHashCode + (altLabel3 == null ? 0 : altLabel3.hashCode())) * 31);
        }

        public final String toString() {
            return "DisabledBadge(label=" + this.f22387a + ", altLabel=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$ExtraInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22388a;
        public final FulfilmentExtraInfo b;

        public ExtraInfo(String str, FulfilmentExtraInfo fulfilmentExtraInfo) {
            this.f22388a = str;
            this.b = fulfilmentExtraInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraInfo)) {
                return false;
            }
            ExtraInfo extraInfo = (ExtraInfo) obj;
            return Intrinsics.c(this.f22388a, extraInfo.f22388a) && Intrinsics.c(this.b, extraInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22388a.hashCode() * 31);
        }

        public final String toString() {
            return "ExtraInfo(__typename=" + this.f22388a + ", fulfilmentExtraInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$ExtraInfoButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraInfoButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22389a;
        public final String b;

        public ExtraInfoButton(String str, String str2) {
            this.f22389a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraInfoButton)) {
                return false;
            }
            ExtraInfoButton extraInfoButton = (ExtraInfoButton) obj;
            return Intrinsics.c(this.f22389a, extraInfoButton.f22389a) && Intrinsics.c(this.b, extraInfoButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22389a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("ExtraInfoButton(messageTitle=", this.f22389a, ", buttonTitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$FeesInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeesInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22390a;
        public final FulfilmentExtraInfo b;

        public FeesInfo(String str, FulfilmentExtraInfo fulfilmentExtraInfo) {
            this.f22390a = str;
            this.b = fulfilmentExtraInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeesInfo)) {
                return false;
            }
            FeesInfo feesInfo = (FeesInfo) obj;
            return Intrinsics.c(this.f22390a, feesInfo.f22390a) && Intrinsics.c(this.b, feesInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22390a.hashCode() * 31);
        }

        public final String toString() {
            return "FeesInfo(__typename=" + this.f22390a + ", fulfilmentExtraInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Footer;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f22391a;

        public Footer(String str) {
            this.f22391a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Footer) && Intrinsics.c(this.f22391a, ((Footer) obj).f22391a);
        }

        public final int hashCode() {
            return this.f22391a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Footer(buttonTitle=", this.f22391a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$FooterV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterV2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22392a;
        public final String b;
        public final boolean c;

        public FooterV2(String str, String str2, boolean z) {
            this.f22392a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterV2)) {
                return false;
            }
            FooterV2 footerV2 = (FooterV2) obj;
            return Intrinsics.c(this.f22392a, footerV2.f22392a) && Intrinsics.c(this.b, footerV2.b) && this.c == footerV2.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f22392a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.k(")", YU.a.v("FooterV2(title=", this.f22392a, ", subtitle=", this.b, ", isSpecial="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Group;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Group {

        /* renamed from: a, reason: collision with root package name */
        public final String f22393a;
        public final boolean b;
        public final String c;
        public final Message d;
        public final String e;
        public final ArrayList f;
        public final List g;

        public Group(String str, boolean z, String str2, Message message, String str3, ArrayList arrayList, List list) {
            this.f22393a = str;
            this.b = z;
            this.c = str2;
            this.d = message;
            this.e = str3;
            this.f = arrayList;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return this.f22393a.equals(group.f22393a) && this.b == group.b && this.c.equals(group.c) && Intrinsics.c(this.d, group.d) && Intrinsics.c(this.e, group.e) && this.f.equals(group.f) && Intrinsics.c(this.g, group.g);
        }

        public final int hashCode() {
            int iC = b.c(b.e(this.f22393a.hashCode() * 31, 31, this.b), 31, this.c);
            Message message = this.d;
            int iHashCode = (iC + (message == null ? 0 : message.hashCode())) * 31;
            String str = this.e;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            List list = this.g;
            return iB + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("Group(title=", this.f22393a, ", isSelected=", ", imageUrl=", this.b);
            sbQ.append(this.c);
            sbQ.append(", message=");
            sbQ.append(this.d);
            sbQ.append(", subtitle=");
            sbQ.append(this.e);
            sbQ.append(", slots=");
            sbQ.append(this.f);
            sbQ.append(", slotsV2=");
            return android.support.v4.media.session.a.t(sbQ, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Icon;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22394a;

        public Icon(String str) {
            this.f22394a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && Intrinsics.c(this.f22394a, ((Icon) obj).f22394a);
        }

        public final int hashCode() {
            return this.f22394a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Icon(coreIconName=", this.f22394a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Info;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final String f22395a;
        public final ArrayList b;

        public Info(String str, ArrayList arrayList) {
            this.f22395a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return this.f22395a.equals(info.f22395a) && this.b.equals(info.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22395a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Info(title=", this.f22395a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Item;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22396a;
        public final String b;
        public final String c;

        public Item(String str, String str2, String str3) {
            this.f22396a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22396a, item.f22396a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22396a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Item(title=", this.f22396a, ", description=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Message;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f22397a;
        public final String b;

        public Message(String str, String str2) {
            this.f22397a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f22397a, message.f22397a) && Intrinsics.c(this.b, message.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22397a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Message(title=", this.f22397a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Option;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name */
        public final String f22398a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final FooterV2 f;
        public final String g;
        public final ExtraInfoButton h;
        public final ExtraInfo i;
        public final DeliveryNowV2 j;
        public final DeliveryNowStatus k;
        public final DirectToBootNow l;
        public final DirectToBootNowV2 m;
        public final DirectToBootNowStatus n;
        public final ArrayList o;

        public Option(String str, String str2, boolean z, boolean z2, String str3, FooterV2 footerV2, String str4, ExtraInfoButton extraInfoButton, ExtraInfo extraInfo, DeliveryNowV2 deliveryNowV2, DeliveryNowStatus deliveryNowStatus, DirectToBootNow directToBootNow, DirectToBootNowV2 directToBootNowV2, DirectToBootNowStatus directToBootNowStatus, ArrayList arrayList) {
            this.f22398a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = str3;
            this.f = footerV2;
            this.g = str4;
            this.h = extraInfoButton;
            this.i = extraInfo;
            this.j = deliveryNowV2;
            this.k = deliveryNowStatus;
            this.l = directToBootNow;
            this.m = directToBootNowV2;
            this.n = directToBootNowStatus;
            this.o = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return this.f22398a.equals(option.f22398a) && this.b.equals(option.b) && this.c == option.c && this.d == option.d && this.e.equals(option.e) && Intrinsics.c(this.f, option.f) && this.g.equals(option.g) && Intrinsics.c(this.h, option.h) && Intrinsics.c(this.i, option.i) && Intrinsics.c(this.j, option.j) && this.k == option.k && Intrinsics.c(this.l, option.l) && Intrinsics.c(this.m, option.m) && this.n == option.n && this.o.equals(option.o);
        }

        public final int hashCode() {
            int iC = b.c(b.e(b.e(b.c(this.f22398a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            FooterV2 footerV2 = this.f;
            int iC2 = b.c((iC + (footerV2 == null ? 0 : footerV2.hashCode())) * 31, 31, this.g);
            ExtraInfoButton extraInfoButton = this.h;
            int iHashCode = (iC2 + (extraInfoButton == null ? 0 : extraInfoButton.hashCode())) * 31;
            ExtraInfo extraInfo = this.i;
            int iHashCode2 = (iHashCode + (extraInfo == null ? 0 : extraInfo.hashCode())) * 31;
            DeliveryNowV2 deliveryNowV2 = this.j;
            int iHashCode3 = (this.k.hashCode() + ((iHashCode2 + (deliveryNowV2 == null ? 0 : deliveryNowV2.hashCode())) * 31)) * 31;
            DirectToBootNow directToBootNow = this.l;
            int iHashCode4 = (iHashCode3 + (directToBootNow == null ? 0 : directToBootNow.hashCode())) * 31;
            DirectToBootNowV2 directToBootNowV2 = this.m;
            int iHashCode5 = directToBootNowV2 != null ? directToBootNowV2.hashCode() : 0;
            return this.o.hashCode() + ((this.n.hashCode() + ((iHashCode4 + iHashCode5) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Option(title=", this.f22398a, ", subtitle=", this.b, ", isAvailable=");
            au.com.woolworths.android.onesite.a.D(sbV, this.c, ", isSelected=", this.d, ", footer=");
            sbV.append(this.e);
            sbV.append(", footerV2=");
            sbV.append(this.f);
            sbV.append(", sectionTitle=");
            sbV.append(this.g);
            sbV.append(", extraInfoButton=");
            sbV.append(this.h);
            sbV.append(", extraInfo=");
            sbV.append(this.i);
            sbV.append(", deliveryNowV2=");
            sbV.append(this.j);
            sbV.append(", deliveryNowStatus=");
            sbV.append(this.k);
            sbV.append(", directToBootNow=");
            sbV.append(this.l);
            sbV.append(", directToBootNowV2=");
            sbV.append(this.m);
            sbV.append(", directToBootNowStatus=");
            sbV.append(this.n);
            sbV.append(", groups=");
            return android.support.v4.media.session.a.q(")", sbV, this.o);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22399a;
        public final com.woolworths.shop.checkout.fragment.SelectionInfo b;

        public SelectionInfo(String str, com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfo) {
            this.f22399a = str;
            this.b = selectionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionInfo)) {
                return false;
            }
            SelectionInfo selectionInfo = (SelectionInfo) obj;
            return Intrinsics.c(this.f22399a, selectionInfo.f22399a) && Intrinsics.c(this.b, selectionInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22399a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectionInfo(__typename=" + this.f22399a + ", selectionInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionInfo1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22400a;
        public final com.woolworths.shop.checkout.fragment.SelectionInfo b;

        public SelectionInfo1(String str, com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfo) {
            this.f22400a = str;
            this.b = selectionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionInfo1)) {
                return false;
            }
            SelectionInfo1 selectionInfo1 = (SelectionInfo1) obj;
            return Intrinsics.c(this.f22400a, selectionInfo1.f22400a) && Intrinsics.c(this.b, selectionInfo1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22400a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectionInfo1(__typename=" + this.f22400a + ", selectionInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionInfo2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22401a;
        public final com.woolworths.shop.checkout.fragment.SelectionInfo b;

        public SelectionInfo2(String str, com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfo) {
            this.f22401a = str;
            this.b = selectionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionInfo2)) {
                return false;
            }
            SelectionInfo2 selectionInfo2 = (SelectionInfo2) obj;
            return Intrinsics.c(this.f22401a, selectionInfo2.f22401a) && Intrinsics.c(this.b, selectionInfo2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22401a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectionInfo2(__typename=" + this.f22401a + ", selectionInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo3;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionInfo3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22402a;
        public final com.woolworths.shop.checkout.fragment.SelectionInfo b;

        public SelectionInfo3(String str, com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfo) {
            this.f22402a = str;
            this.b = selectionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionInfo3)) {
                return false;
            }
            SelectionInfo3 selectionInfo3 = (SelectionInfo3) obj;
            return Intrinsics.c(this.f22402a, selectionInfo3.f22402a) && Intrinsics.c(this.b, selectionInfo3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22402a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectionInfo3(__typename=" + this.f22402a + ", selectionInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo4;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionInfo4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22403a;
        public final com.woolworths.shop.checkout.fragment.SelectionInfo b;

        public SelectionInfo4(String str, com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfo) {
            this.f22403a = str;
            this.b = selectionInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionInfo4)) {
                return false;
            }
            SelectionInfo4 selectionInfo4 = (SelectionInfo4) obj;
            return Intrinsics.c(this.f22403a, selectionInfo4.f22403a) && Intrinsics.c(this.b, selectionInfo4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22403a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectionInfo4(__typename=" + this.f22403a + ", selectionInfo=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionOption {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentWindowSlotSelectionOptionId f22404a;
        public final String b;
        public final Icon c;
        public final String d;
        public final ArrayList e;
        public final DisabledBadge f;
        public final String g;
        public final String h;

        public SelectionOption(FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId, String str, Icon icon, String str2, ArrayList arrayList, DisabledBadge disabledBadge, String str3, String str4) {
            this.f22404a = fulfilmentWindowSlotSelectionOptionId;
            this.b = str;
            this.c = icon;
            this.d = str2;
            this.e = arrayList;
            this.f = disabledBadge;
            this.g = str3;
            this.h = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionOption)) {
                return false;
            }
            SelectionOption selectionOption = (SelectionOption) obj;
            return this.f22404a == selectionOption.f22404a && this.b.equals(selectionOption.b) && this.c.equals(selectionOption.c) && this.d.equals(selectionOption.d) && this.e.equals(selectionOption.e) && this.f.equals(selectionOption.f) && this.g.equals(selectionOption.g) && this.h.equals(selectionOption.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.c((this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(b.c(b.c(this.f22404a.hashCode() * 31, 31, this.b), 31, this.c.f22394a), 31, this.d), 31, this.e)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectionOption(selectionOptionId=");
            sb.append(this.f22404a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", icon=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", selectionOptionsInfoTags=");
            sb.append(this.e);
            sb.append(", disabledBadge=");
            sb.append(this.f);
            sb.append(", disabledTitle=");
            return a.l(sb, this.g, ", disabledDescription=", this.h, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionOptionsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22405a;
        public final ArrayList b;

        public SelectionOptionsInfo(String str, ArrayList arrayList) {
            this.f22405a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionOptionsInfo)) {
                return false;
            }
            SelectionOptionsInfo selectionOptionsInfo = (SelectionOptionsInfo) obj;
            return this.f22405a.equals(selectionOptionsInfo.f22405a) && this.b.equals(selectionOptionsInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22405a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("SelectionOptionsInfo(title=", this.f22405a, ", selectionOptions=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsInfoTag;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionOptionsInfoTag {

        /* renamed from: a, reason: collision with root package name */
        public final String f22406a;
        public final AltLabel2 b;
        public final BadgeType c;

        public SelectionOptionsInfoTag(String str, AltLabel2 altLabel2, BadgeType badgeType) {
            this.f22406a = str;
            this.b = altLabel2;
            this.c = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionOptionsInfoTag)) {
                return false;
            }
            SelectionOptionsInfoTag selectionOptionsInfoTag = (SelectionOptionsInfoTag) obj;
            return Intrinsics.c(this.f22406a, selectionOptionsInfoTag.f22406a) && Intrinsics.c(this.b, selectionOptionsInfoTag.b) && this.c == selectionOptionsInfoTag.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22406a.hashCode() * 31;
            AltLabel2 altLabel2 = this.b;
            return this.c.hashCode() + ((iHashCode + (altLabel2 == null ? 0 : altLabel2.hashCode())) * 31);
        }

        public final String toString() {
            return "SelectionOptionsInfoTag(label=" + this.f22406a + ", altLabel=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionOptionsState {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22407a;
        public final ArrayList b;
        public final FulfilmentWindowSlotSelectionOptionId c;
        public final boolean d;

        public SelectionOptionsState(ArrayList arrayList, ArrayList arrayList2, FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId, boolean z) {
            this.f22407a = arrayList;
            this.b = arrayList2;
            this.c = fulfilmentWindowSlotSelectionOptionId;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionOptionsState)) {
                return false;
            }
            SelectionOptionsState selectionOptionsState = (SelectionOptionsState) obj;
            return this.f22407a.equals(selectionOptionsState.f22407a) && this.b.equals(selectionOptionsState.b) && this.c == selectionOptionsState.c && this.d == selectionOptionsState.d;
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f22407a.hashCode() * 31, 31, this.b);
            FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId = this.c;
            return Boolean.hashCode(this.d) + ((iB + (fulfilmentWindowSlotSelectionOptionId == null ? 0 : fulfilmentWindowSlotSelectionOptionId.hashCode())) * 31);
        }

        public final String toString() {
            return "SelectionOptionsState(enabledOptions=" + this.f22407a + ", excludedOptions=" + this.b + ", selectedOption=" + this.c + ", isLastWindow=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsState1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectionOptionsState1 {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22408a;
        public final ArrayList b;
        public final FulfilmentWindowSlotSelectionOptionId c;
        public final boolean d;

        public SelectionOptionsState1(ArrayList arrayList, ArrayList arrayList2, FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId, boolean z) {
            this.f22408a = arrayList;
            this.b = arrayList2;
            this.c = fulfilmentWindowSlotSelectionOptionId;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectionOptionsState1)) {
                return false;
            }
            SelectionOptionsState1 selectionOptionsState1 = (SelectionOptionsState1) obj;
            return this.f22408a.equals(selectionOptionsState1.f22408a) && this.b.equals(selectionOptionsState1.b) && this.c == selectionOptionsState1.c && this.d == selectionOptionsState1.d;
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f22408a.hashCode() * 31, 31, this.b);
            FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId = this.c;
            return Boolean.hashCode(this.d) + ((iB + (fulfilmentWindowSlotSelectionOptionId == null ? 0 : fulfilmentWindowSlotSelectionOptionId.hashCode())) * 31);
        }

        public final String toString() {
            return "SelectionOptionsState1(enabledOptions=" + this.f22408a + ", excludedOptions=" + this.b + ", selectedOption=" + this.c + ", isLastWindow=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Slot;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Slot {

        /* renamed from: a, reason: collision with root package name */
        public final String f22409a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final ArrayList i;
        public final SelectionInfo j;
        public final List k;
        public final List l;

        public Slot(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, ArrayList arrayList, SelectionInfo selectionInfo, List list, List list2) {
            this.f22409a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = str4;
            this.i = arrayList;
            this.j = selectionInfo;
            this.k = list;
            this.l = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Slot)) {
                return false;
            }
            Slot slot = (Slot) obj;
            return this.f22409a.equals(slot.f22409a) && this.b.equals(slot.b) && this.c.equals(slot.c) && this.d == slot.d && this.e == slot.e && this.f == slot.f && this.g == slot.g && this.h.equals(slot.h) && this.i.equals(slot.i) && Intrinsics.c(this.j, slot.j) && Intrinsics.c(this.k, slot.k) && Intrinsics.c(this.l, slot.l);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.e(b.e(b.e(b.a(this.d, b.c(b.c(this.f22409a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            SelectionInfo selectionInfo = this.j;
            int iHashCode = (iB + (selectionInfo == null ? 0 : selectionInfo.hashCode())) * 31;
            List list = this.k;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.l;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Slot(title=", this.f22409a, ", subtitle=", this.b, ", startTime=");
            YU.a.x(this.d, this.c, ", id=", ", isAvailable=", sbV);
            au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isSelected=", this.f, ", isPartnerDriver=");
            au.com.woolworths.android.onesite.a.y(", sectionTitle=", this.h, ", badges=", sbV, this.g);
            sbV.append(this.i);
            sbV.append(", selectionInfo=");
            sbV.append(this.j);
            sbV.append(", tags=");
            sbV.append(this.k);
            sbV.append(", statuses=");
            sbV.append(this.l);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Slot1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Slot1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22410a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final ArrayList i;
        public final SelectionInfo3 j;
        public final SelectionOptionsState1 k;
        public final List l;
        public final List m;

        public Slot1(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, ArrayList arrayList, SelectionInfo3 selectionInfo3, SelectionOptionsState1 selectionOptionsState1, List list, List list2) {
            this.f22410a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = str4;
            this.i = arrayList;
            this.j = selectionInfo3;
            this.k = selectionOptionsState1;
            this.l = list;
            this.m = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Slot1)) {
                return false;
            }
            Slot1 slot1 = (Slot1) obj;
            return this.f22410a.equals(slot1.f22410a) && this.b.equals(slot1.b) && this.c.equals(slot1.c) && this.d == slot1.d && this.e == slot1.e && this.f == slot1.f && this.g == slot1.g && this.h.equals(slot1.h) && this.i.equals(slot1.i) && Intrinsics.c(this.j, slot1.j) && Intrinsics.c(this.k, slot1.k) && Intrinsics.c(this.l, slot1.l) && Intrinsics.c(this.m, slot1.m);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.e(b.e(b.e(b.a(this.d, b.c(b.c(this.f22410a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            SelectionInfo3 selectionInfo3 = this.j;
            int iHashCode = (iB + (selectionInfo3 == null ? 0 : selectionInfo3.hashCode())) * 31;
            SelectionOptionsState1 selectionOptionsState1 = this.k;
            int iHashCode2 = (iHashCode + (selectionOptionsState1 == null ? 0 : selectionOptionsState1.hashCode())) * 31;
            List list = this.l;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.m;
            return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Slot1(title=", this.f22410a, ", subtitle=", this.b, ", startTime=");
            YU.a.x(this.d, this.c, ", id=", ", isAvailable=", sbV);
            au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isSelected=", this.f, ", isPartnerDriver=");
            au.com.woolworths.android.onesite.a.y(", sectionTitle=", this.h, ", badges=", sbV, this.g);
            sbV.append(this.i);
            sbV.append(", selectionInfo=");
            sbV.append(this.j);
            sbV.append(", selectionOptionsState=");
            sbV.append(this.k);
            sbV.append(", tags=");
            sbV.append(this.l);
            sbV.append(", statuses=");
            return android.support.v4.media.session.a.t(sbV, this.m, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SlotsV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SlotsV2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22411a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final ArrayList i;
        public final SelectionInfo4 j;
        public final List k;
        public final List l;

        public SlotsV2(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, ArrayList arrayList, SelectionInfo4 selectionInfo4, List list, List list2) {
            this.f22411a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = str4;
            this.i = arrayList;
            this.j = selectionInfo4;
            this.k = list;
            this.l = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotsV2)) {
                return false;
            }
            SlotsV2 slotsV2 = (SlotsV2) obj;
            return this.f22411a.equals(slotsV2.f22411a) && this.b.equals(slotsV2.b) && this.c.equals(slotsV2.c) && this.d == slotsV2.d && this.e == slotsV2.e && this.f == slotsV2.f && this.g == slotsV2.g && this.h.equals(slotsV2.h) && this.i.equals(slotsV2.i) && Intrinsics.c(this.j, slotsV2.j) && Intrinsics.c(this.k, slotsV2.k) && Intrinsics.c(this.l, slotsV2.l);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.e(b.e(b.e(b.a(this.d, b.c(b.c(this.f22411a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            SelectionInfo4 selectionInfo4 = this.j;
            int iHashCode = (iB + (selectionInfo4 == null ? 0 : selectionInfo4.hashCode())) * 31;
            List list = this.k;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.l;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("SlotsV2(title=", this.f22411a, ", subtitle=", this.b, ", startTime=");
            YU.a.x(this.d, this.c, ", id=", ", isAvailable=", sbV);
            au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isSelected=", this.f, ", isPartnerDriver=");
            au.com.woolworths.android.onesite.a.y(", sectionTitle=", this.h, ", badges=", sbV, this.g);
            sbV.append(this.i);
            sbV.append(", selectionInfo=");
            sbV.append(this.j);
            sbV.append(", tags=");
            sbV.append(this.k);
            sbV.append(", statuses=");
            sbV.append(this.l);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status {

        /* renamed from: a, reason: collision with root package name */
        public final String f22412a;
        public final CoreTagUI b;

        public Status(String str, CoreTagUI coreTagUI) {
            this.f22412a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return Intrinsics.c(this.f22412a, status.f22412a) && Intrinsics.c(this.b, status.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22412a.hashCode() * 31);
        }

        public final String toString() {
            return "Status(__typename=" + this.f22412a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22413a;
        public final CoreTagUI b;

        public Status1(String str, CoreTagUI coreTagUI) {
            this.f22413a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status1)) {
                return false;
            }
            Status1 status1 = (Status1) obj;
            return Intrinsics.c(this.f22413a, status1.f22413a) && Intrinsics.c(this.b, status1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22413a.hashCode() * 31);
        }

        public final String toString() {
            return "Status1(__typename=" + this.f22413a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22414a;
        public final CoreTagUI b;

        public Status2(String str, CoreTagUI coreTagUI) {
            this.f22414a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status2)) {
                return false;
            }
            Status2 status2 = (Status2) obj;
            return Intrinsics.c(this.f22414a, status2.f22414a) && Intrinsics.c(this.b, status2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22414a.hashCode() * 31);
        }

        public final String toString() {
            return "Status2(__typename=" + this.f22414a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status3;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22415a;
        public final CoreTagUI b;

        public Status3(String str, CoreTagUI coreTagUI) {
            this.f22415a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status3)) {
                return false;
            }
            Status3 status3 = (Status3) obj;
            return Intrinsics.c(this.f22415a, status3.f22415a) && Intrinsics.c(this.b, status3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22415a.hashCode() * 31);
        }

        public final String toString() {
            return "Status3(__typename=" + this.f22415a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status4;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Status4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22416a;
        public final CoreTagUI b;

        public Status4(String str, CoreTagUI coreTagUI) {
            this.f22416a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status4)) {
                return false;
            }
            Status4 status4 = (Status4) obj;
            return Intrinsics.c(this.f22416a, status4.f22416a) && Intrinsics.c(this.b, status4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22416a.hashCode() * 31);
        }

        public final String toString() {
            return "Status4(__typename=" + this.f22416a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Subheader;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subheader {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22417a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public Subheader(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f22417a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subheader)) {
                return false;
            }
            Subheader subheader = (Subheader) obj;
            return this.f22417a == subheader.f22417a && Intrinsics.c(this.b, subheader.b) && Intrinsics.c(this.c, subheader.c) && Intrinsics.c(this.d, subheader.d) && Intrinsics.c(this.e, subheader.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22417a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Subheader(displayType=", this.f22417a, ", message=", this.b, ", bannerTitle=");
            a.B(sbU, this.c, ", iconUrl=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SuggestedGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedGroup {

        /* renamed from: a, reason: collision with root package name */
        public final String f22418a;
        public final ArrayList b;
        public final BottomSheet c;

        public SuggestedGroup(String str, ArrayList arrayList, BottomSheet bottomSheet) {
            this.f22418a = str;
            this.b = arrayList;
            this.c = bottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedGroup)) {
                return false;
            }
            SuggestedGroup suggestedGroup = (SuggestedGroup) obj;
            return this.f22418a.equals(suggestedGroup.f22418a) && this.b.equals(suggestedGroup.b) && this.c.equals(suggestedGroup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f22418a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbX = d.x("SuggestedGroup(title=", this.f22418a, ", slots=", ", bottomSheet=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag {

        /* renamed from: a, reason: collision with root package name */
        public final String f22419a;
        public final CoreTagUI b;

        public Tag(String str, CoreTagUI coreTagUI) {
            this.f22419a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return Intrinsics.c(this.f22419a, tag.f22419a) && Intrinsics.c(this.b, tag.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22419a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag(__typename=" + this.f22419a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22420a;
        public final CoreTagUI b;

        public Tag1(String str, CoreTagUI coreTagUI) {
            this.f22420a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag1)) {
                return false;
            }
            Tag1 tag1 = (Tag1) obj;
            return Intrinsics.c(this.f22420a, tag1.f22420a) && Intrinsics.c(this.b, tag1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22420a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag1(__typename=" + this.f22420a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22421a;
        public final CoreTagUI b;

        public Tag2(String str, CoreTagUI coreTagUI) {
            this.f22421a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag2)) {
                return false;
            }
            Tag2 tag2 = (Tag2) obj;
            return Intrinsics.c(this.f22421a, tag2.f22421a) && Intrinsics.c(this.b, tag2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22421a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag2(__typename=" + this.f22421a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag3;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22422a;
        public final CoreTagUI b;

        public Tag3(String str, CoreTagUI coreTagUI) {
            this.f22422a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag3)) {
                return false;
            }
            Tag3 tag3 = (Tag3) obj;
            return Intrinsics.c(this.f22422a, tag3.f22422a) && Intrinsics.c(this.b, tag3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22422a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag3(__typename=" + this.f22422a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag4;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tag4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22423a;
        public final CoreTagUI b;

        public Tag4(String str, CoreTagUI coreTagUI) {
            this.f22423a = str;
            this.b = coreTagUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag4)) {
                return false;
            }
            Tag4 tag4 = (Tag4) obj;
            return Intrinsics.c(this.f22423a, tag4.f22423a) && Intrinsics.c(this.b, tag4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22423a.hashCode() * 31);
        }

        public final String toString() {
            return "Tag4(__typename=" + this.f22423a + ", coreTagUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$TileBadge;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TileBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f22424a;
        public final BadgeType b;

        public TileBadge(String str, BadgeType badgeType) {
            this.f22424a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileBadge)) {
                return false;
            }
            TileBadge tileBadge = (TileBadge) obj;
            return Intrinsics.c(this.f22424a, tileBadge.f22424a) && this.b == tileBadge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22424a.hashCode() * 31);
        }

        public final String toString() {
            return "TileBadge(label=" + this.f22424a + ", type=" + this.b + ")";
        }
    }

    public CheckoutFulfilmentWindows(String str, String str2, Subheader subheader, String str3, Footer footer, String str4, SuggestedGroup suggestedGroup, ArrayList arrayList, FeesInfo feesInfo, SelectionOptionsInfo selectionOptionsInfo) {
        this.f22372a = str;
        this.b = str2;
        this.c = subheader;
        this.d = str3;
        this.e = footer;
        this.f = str4;
        this.g = suggestedGroup;
        this.h = arrayList;
        this.i = feesInfo;
        this.j = selectionOptionsInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutFulfilmentWindows)) {
            return false;
        }
        CheckoutFulfilmentWindows checkoutFulfilmentWindows = (CheckoutFulfilmentWindows) obj;
        return this.f22372a.equals(checkoutFulfilmentWindows.f22372a) && this.b.equals(checkoutFulfilmentWindows.b) && Intrinsics.c(this.c, checkoutFulfilmentWindows.c) && this.d.equals(checkoutFulfilmentWindows.d) && Intrinsics.c(this.e, checkoutFulfilmentWindows.e) && Intrinsics.c(this.f, checkoutFulfilmentWindows.f) && Intrinsics.c(this.g, checkoutFulfilmentWindows.g) && this.h.equals(checkoutFulfilmentWindows.h) && Intrinsics.c(this.i, checkoutFulfilmentWindows.i) && Intrinsics.c(this.j, checkoutFulfilmentWindows.j);
    }

    public final int hashCode() {
        int iC = b.c(this.f22372a.hashCode() * 31, 31, this.b);
        Subheader subheader = this.c;
        int iC2 = b.c((iC + (subheader == null ? 0 : subheader.hashCode())) * 31, 31, this.d);
        Footer footer = this.e;
        int iHashCode = (iC2 + (footer == null ? 0 : footer.f22391a.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SuggestedGroup suggestedGroup = this.g;
        int iB = androidx.compose.ui.input.pointer.a.b((iHashCode2 + (suggestedGroup == null ? 0 : suggestedGroup.hashCode())) * 31, 31, this.h);
        FeesInfo feesInfo = this.i;
        int iHashCode3 = (iB + (feesInfo == null ? 0 : feesInfo.hashCode())) * 31;
        SelectionOptionsInfo selectionOptionsInfo = this.j;
        return iHashCode3 + (selectionOptionsInfo != null ? selectionOptionsInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CheckoutFulfilmentWindows(title=", this.f22372a, ", header=", this.b, ", subheader=");
        sbV.append(this.c);
        sbV.append(", subtitle=");
        sbV.append(this.d);
        sbV.append(", footer=");
        sbV.append(this.e);
        sbV.append(", sectionHeader=");
        sbV.append(this.f);
        sbV.append(", suggestedGroup=");
        sbV.append(this.g);
        sbV.append(", options=");
        sbV.append(this.h);
        sbV.append(", feesInfo=");
        sbV.append(this.i);
        sbV.append(", selectionOptionsInfo=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
