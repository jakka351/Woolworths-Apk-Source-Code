package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.LocationImage;
import au.com.woolworths.shop.graphql.type.LocationTrackingStatusImage;
import au.com.woolworths.shop.graphql.type.MyGroceriesProductListBadgeType;
import au.com.woolworths.shop.graphql.type.OrderFulfilmentType;
import au.com.woolworths.shop.graphql.type.OrderHelpItemType;
import au.com.woolworths.shop.graphql.type.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.shop.graphql.type.OrderStatusType;
import au.com.woolworths.shop.graphql.type.OrderSubtitleIcon;
import au.com.woolworths.shop.graphql.type.ProgressStepType;
import au.com.woolworths.shop.graphql.type.TooltipType;
import au.com.woolworths.shop.graphql.type.adapter.CallerState_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.GetOrderSummaryQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\br\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:q\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrs¨\u0006t"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Data;", "Data", "OrderSummary", "HelpList", "Item", "HelpItem", "ContactTimes", "ContactItem", "Feed", "Item1", "OnOrderDetailsDivider", "OnOrderPaymentDetails", "Total", "SubTotal", "MarketSubtotal", "PaymentMethod", "Discount", "SavingsAndReward", "Refund", "RefundTotal", "OnHorizontalList", "Item2", "OnOrderDetailsProductCard", "InsetBanner", "Action", "Analytics", "Badge", "OnMyGroceriesProductListBadge", "OnOrderProofOfDeliveryDetails", "InsetBanner1", "OnCurrentPickupOrderFulfilmentDetails", "StoreDetails", "CollectionDetails", "ParkingDetails", "OnCurrentPickupLocationTrackingStatus", "OnOrderFulfilmentDetails", "FulfilmentItem", "DeliveryInstructions", "OnPastPickupOrderFulfilmentDetails", "FulfilmentItem1", "OnDeliveryOrderFulfilmentDetails", "FulfilmentItem2", "DeliveryInstructions1", "OnPastOrderOverview", "InsetBanner2", "OrderDetailsStatus", "OrderTime", "OrderDetailSummary", "ChangeOrderButton", "CancelOrderButton", "ViewInvoiceButton", "OnCurrentPickupOrderOverview", "ProgressStepper", "ProgressStepperForCollectedState", "Tooltip", "StepInfoList", "ChangeOrderButton1", "CancelOrderButton1", "CheckInNowButton", "CollectionBanner", "BayNumberPreferences", "ConfirmButton", "BayNumberUnknownButton", "CheckInOnMyWayButton", "OnMyWayPreferences", "ConfirmButton1", "LocationTrackingPrimingPage", "LocationPermissionsWereNotSet", "Rationale", "LocationPermissionButton", "DoNotAllowWasSetEarlier", "Rationale1", "LocationPermissionButton1", "Banner", "HandoverBanner", "OnOrderNumberDetails", "OnDeliveryDriverDetails", "InsetBanner3", "Analytics1", "ExtraContent", "LiveTrackingButton", "DeliveryTooltip", "DeliveryMethodsTab", "BulletInfoList", "DriverRatingBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "OnCurrentDeliveryOrderOverview", "InsetBanner4", "Analytics2", "ExtraContent1", "ChangeOrderButton2", "CancelOrderButton2", "ProgressStepper1", "Tooltip1", "StepInfoList1", "OnDriverRating", "StarsRatingStep", "InsetAlert", "SubmitButton", "CoreButtonAction", "FeedbackAndCommentsStep", "FeedbackChip", "Text", "DoneButton", "CoreButtonAction1", "ThankYouStep", "BadFeedbackButton", "CoreButtonAction2", "CancelWarning", "EditOrderWarning", "WarningItem", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetOrderSummaryQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f19863a;
    public final Optional b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f19864a;
        public final InsetBannerActionType b;
        public final String c;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str) {
            this.f19864a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f19864a == action.f19864a && this.b == action.b && Intrinsics.c(this.c, action.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + d.c(this.b, this.f19864a.hashCode() * 31, 31);
        }

        public final String toString() {
            return a.o(d.t("Action(placement=", this.f19864a, ", type=", this.b, ", label="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19865a;

        public Analytics(String str) {
            this.f19865a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f19865a, ((Analytics) obj).f19865a);
        }

        public final int hashCode() {
            String str = this.f19865a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(eventLabel=", this.f19865a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19866a;
        public final List b;

        public Analytics1(String str, List list) {
            this.f19866a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f19866a, analytics1.f19866a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            String str = this.f19866a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("Analytics1(eventLabel=", this.f19866a, ", extraContent=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19867a;
        public final List b;

        public Analytics2(String str, List list) {
            this.f19867a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics2)) {
                return false;
            }
            Analytics2 analytics2 = (Analytics2) obj;
            return Intrinsics.c(this.f19867a, analytics2.f19867a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            String str = this.f19867a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("Analytics2(eventLabel=", this.f19867a, ", extraContent=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BadFeedbackButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BadFeedbackButton {

        /* renamed from: a, reason: collision with root package name */
        public final CoreButtonStyle f19868a;
        public final String b;
        public final CoreButtonAction2 c;
        public final boolean d;

        public BadFeedbackButton(CoreButtonStyle coreButtonStyle, String str, CoreButtonAction2 coreButtonAction2, boolean z) {
            this.f19868a = coreButtonStyle;
            this.b = str;
            this.c = coreButtonAction2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadFeedbackButton)) {
                return false;
            }
            BadFeedbackButton badFeedbackButton = (BadFeedbackButton) obj;
            return this.f19868a == badFeedbackButton.f19868a && Intrinsics.c(this.b, badFeedbackButton.b) && Intrinsics.c(this.c, badFeedbackButton.c) && this.d == badFeedbackButton.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.c(this.f19868a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "BadFeedbackButton(coreButtonStyle=" + this.f19868a + ", coreButtonLabel=" + this.b + ", coreButtonAction=" + this.c + ", coreButtonEnabled=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Badge;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f19869a;
        public final OnMyGroceriesProductListBadge b;

        public Badge(String __typename, OnMyGroceriesProductListBadge onMyGroceriesProductListBadge) {
            Intrinsics.h(__typename, "__typename");
            this.f19869a = __typename;
            this.b = onMyGroceriesProductListBadge;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f19869a, badge.f19869a) && Intrinsics.c(this.b, badge.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19869a.hashCode() * 31;
            OnMyGroceriesProductListBadge onMyGroceriesProductListBadge = this.b;
            return iHashCode + (onMyGroceriesProductListBadge == null ? 0 : onMyGroceriesProductListBadge.hashCode());
        }

        public final String toString() {
            return "Badge(__typename=" + this.f19869a + ", onMyGroceriesProductListBadge=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Banner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19870a;
        public final String b;
        public final BroadcastBannerType c;
        public final Boolean d;
        public final String e;
        public final String f;

        public Banner(String str, String str2, BroadcastBannerType broadcastBannerType, Boolean bool, String str3, String str4) {
            this.f19870a = str;
            this.b = str2;
            this.c = broadcastBannerType;
            this.d = bool;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return Intrinsics.c(this.f19870a, banner.f19870a) && Intrinsics.c(this.b, banner.b) && this.c == banner.c && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e) && Intrinsics.c(this.f, banner.f);
        }

        public final int hashCode() {
            int iHashCode = this.f19870a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.d;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Banner(title=", this.f19870a, ", subtitle=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", dismissible=");
            sbV.append(this.d);
            sbV.append(", bannerId=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", imageUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BayNumberPreferences;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BayNumberPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f19871a;
        public final String b;
        public final ArrayList c;
        public final ConfirmButton d;
        public final BayNumberUnknownButton e;

        public BayNumberPreferences(String str, String str2, ArrayList arrayList, ConfirmButton confirmButton, BayNumberUnknownButton bayNumberUnknownButton) {
            this.f19871a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = confirmButton;
            this.e = bayNumberUnknownButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BayNumberPreferences)) {
                return false;
            }
            BayNumberPreferences bayNumberPreferences = (BayNumberPreferences) obj;
            return this.f19871a.equals(bayNumberPreferences.f19871a) && this.b.equals(bayNumberPreferences.b) && this.c.equals(bayNumberPreferences.c) && this.d.equals(bayNumberPreferences.d) && this.e.equals(bayNumberPreferences.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(this.f19871a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BayNumberPreferences(title=", this.f19871a, ", subtitle=", this.b, ", bayNumber=");
            sbV.append(this.c);
            sbV.append(", confirmButton=");
            sbV.append(this.d);
            sbV.append(", bayNumberUnknownButton=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BayNumberUnknownButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BayNumberUnknownButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19872a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public BayNumberUnknownButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19872a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BayNumberUnknownButton)) {
                return false;
            }
            BayNumberUnknownButton bayNumberUnknownButton = (BayNumberUnknownButton) obj;
            return Intrinsics.c(this.f19872a, bayNumberUnknownButton.f19872a) && Intrinsics.c(this.b, bayNumberUnknownButton.b) && this.c == bayNumberUnknownButton.c && this.d == bayNumberUnknownButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19872a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("BayNumberUnknownButton(label=", this.f19872a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BroadcastBannerUI;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f19873a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f19873a = str;
            this.b = str2;
            this.c = coreBroadcastBannerStyle;
            this.d = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerUI)) {
                return false;
            }
            BroadcastBannerUI broadcastBannerUI = (BroadcastBannerUI) obj;
            return Intrinsics.c(this.f19873a, broadcastBannerUI.f19873a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19873a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f19873a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BulletInfoList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BulletInfoList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19874a;

        public BulletInfoList(String str) {
            this.f19874a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BulletInfoList) && Intrinsics.c(this.f19874a, ((BulletInfoList) obj).f19874a);
        }

        public final int hashCode() {
            return this.f19874a.hashCode();
        }

        public final String toString() {
            return a.h("BulletInfoList(text=", this.f19874a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelOrderButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19875a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CancelOrderButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19875a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelOrderButton)) {
                return false;
            }
            CancelOrderButton cancelOrderButton = (CancelOrderButton) obj;
            return Intrinsics.c(this.f19875a, cancelOrderButton.f19875a) && Intrinsics.c(this.b, cancelOrderButton.b) && this.c == cancelOrderButton.c && this.d == cancelOrderButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19875a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CancelOrderButton(label=", this.f19875a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelOrderButton1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19876a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CancelOrderButton1(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19876a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelOrderButton1)) {
                return false;
            }
            CancelOrderButton1 cancelOrderButton1 = (CancelOrderButton1) obj;
            return Intrinsics.c(this.f19876a, cancelOrderButton1.f19876a) && Intrinsics.c(this.b, cancelOrderButton1.b) && this.c == cancelOrderButton1.c && this.d == cancelOrderButton1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19876a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CancelOrderButton1(label=", this.f19876a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelOrderButton2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19877a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CancelOrderButton2(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19877a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelOrderButton2)) {
                return false;
            }
            CancelOrderButton2 cancelOrderButton2 = (CancelOrderButton2) obj;
            return Intrinsics.c(this.f19877a, cancelOrderButton2.f19877a) && Intrinsics.c(this.b, cancelOrderButton2.b) && this.c == cancelOrderButton2.c && this.d == cancelOrderButton2.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19877a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CancelOrderButton2(label=", this.f19877a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelWarning;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelWarning {

        /* renamed from: a, reason: collision with root package name */
        public final String f19878a;
        public final String b;
        public final String c;

        public CancelWarning(String str, String str2, String str3) {
            this.f19878a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelWarning)) {
                return false;
            }
            CancelWarning cancelWarning = (CancelWarning) obj;
            return Intrinsics.c(this.f19878a, cancelWarning.f19878a) && Intrinsics.c(this.b, cancelWarning.b) && Intrinsics.c(this.c, cancelWarning.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19878a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("CancelWarning(title=", this.f19878a, ", subtitle=", this.b, ", message="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangeOrderButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19879a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ChangeOrderButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19879a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOrderButton)) {
                return false;
            }
            ChangeOrderButton changeOrderButton = (ChangeOrderButton) obj;
            return Intrinsics.c(this.f19879a, changeOrderButton.f19879a) && Intrinsics.c(this.b, changeOrderButton.b) && this.c == changeOrderButton.c && this.d == changeOrderButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19879a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ChangeOrderButton(label=", this.f19879a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangeOrderButton1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19880a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ChangeOrderButton1(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19880a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOrderButton1)) {
                return false;
            }
            ChangeOrderButton1 changeOrderButton1 = (ChangeOrderButton1) obj;
            return Intrinsics.c(this.f19880a, changeOrderButton1.f19880a) && Intrinsics.c(this.b, changeOrderButton1.b) && this.c == changeOrderButton1.c && this.d == changeOrderButton1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19880a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ChangeOrderButton1(label=", this.f19880a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangeOrderButton2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19881a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ChangeOrderButton2(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19881a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOrderButton2)) {
                return false;
            }
            ChangeOrderButton2 changeOrderButton2 = (ChangeOrderButton2) obj;
            return Intrinsics.c(this.f19881a, changeOrderButton2.f19881a) && Intrinsics.c(this.b, changeOrderButton2.b) && this.c == changeOrderButton2.c && this.d == changeOrderButton2.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19881a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ChangeOrderButton2(label=", this.f19881a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CheckInNowButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckInNowButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19882a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CheckInNowButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19882a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckInNowButton)) {
                return false;
            }
            CheckInNowButton checkInNowButton = (CheckInNowButton) obj;
            return Intrinsics.c(this.f19882a, checkInNowButton.f19882a) && Intrinsics.c(this.b, checkInNowButton.b) && this.c == checkInNowButton.c && this.d == checkInNowButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19882a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CheckInNowButton(label=", this.f19882a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CheckInOnMyWayButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckInOnMyWayButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19883a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CheckInOnMyWayButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19883a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckInOnMyWayButton)) {
                return false;
            }
            CheckInOnMyWayButton checkInOnMyWayButton = (CheckInOnMyWayButton) obj;
            return Intrinsics.c(this.f19883a, checkInOnMyWayButton.f19883a) && Intrinsics.c(this.b, checkInOnMyWayButton.b) && this.c == checkInOnMyWayButton.c && this.d == checkInOnMyWayButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19883a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CheckInOnMyWayButton(label=", this.f19883a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CollectionBanner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CollectionBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f19884a;
        public final String b;
        public final String c;

        public CollectionBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2) {
            this.f19884a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionBanner)) {
                return false;
            }
            CollectionBanner collectionBanner = (CollectionBanner) obj;
            return this.f19884a == collectionBanner.f19884a && Intrinsics.c(this.b, collectionBanner.b) && Intrinsics.c(this.c, collectionBanner.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19884a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.u("CollectionBanner(displayType=", this.f19884a, ", message=", this.b, ", bannerTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CollectionDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CollectionDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19885a;
        public final String b;
        public final String c;
        public final ParkingDetails d;

        public CollectionDetails(String str, String str2, String str3, ParkingDetails parkingDetails) {
            this.f19885a = str;
            this.b = str2;
            this.c = str3;
            this.d = parkingDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollectionDetails)) {
                return false;
            }
            CollectionDetails collectionDetails = (CollectionDetails) obj;
            return Intrinsics.c(this.f19885a, collectionDetails.f19885a) && Intrinsics.c(this.b, collectionDetails.b) && Intrinsics.c(this.c, collectionDetails.c) && Intrinsics.c(this.d, collectionDetails.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f19885a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            ParkingDetails parkingDetails = this.d;
            return iHashCode + (parkingDetails != null ? parkingDetails.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("CollectionDetails(fulfillmentLabel=", this.f19885a, ", fulfillmentType=", this.b, ", actionTitle=");
            sbV.append(this.c);
            sbV.append(", parkingDetails=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ConfirmButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19886a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ConfirmButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19886a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmButton)) {
                return false;
            }
            ConfirmButton confirmButton = (ConfirmButton) obj;
            return Intrinsics.c(this.f19886a, confirmButton.f19886a) && Intrinsics.c(this.b, confirmButton.b) && this.c == confirmButton.c && this.d == confirmButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19886a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ConfirmButton(label=", this.f19886a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ConfirmButton1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmButton1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19887a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ConfirmButton1(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19887a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmButton1)) {
                return false;
            }
            ConfirmButton1 confirmButton1 = (ConfirmButton1) obj;
            return Intrinsics.c(this.f19887a, confirmButton1.f19887a) && Intrinsics.c(this.b, confirmButton1.b) && this.c == confirmButton1.c && this.d == confirmButton1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19887a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ConfirmButton1(label=", this.f19887a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ContactItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19888a;
        public final String b;

        public ContactItem(String str, String str2) {
            this.f19888a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactItem)) {
                return false;
            }
            ContactItem contactItem = (ContactItem) obj;
            return Intrinsics.c(this.f19888a, contactItem.f19888a) && Intrinsics.c(this.b, contactItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19888a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ContactItem(day=", this.f19888a, ", time=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ContactTimes;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactTimes {

        /* renamed from: a, reason: collision with root package name */
        public final String f19889a;
        public final String b;
        public final ArrayList c;

        public ContactTimes(String str, String str2, ArrayList arrayList) {
            this.f19889a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactTimes)) {
                return false;
            }
            ContactTimes contactTimes = (ContactTimes) obj;
            return this.f19889a.equals(contactTimes.f19889a) && this.b.equals(contactTimes.b) && this.c.equals(contactTimes.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19889a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("ContactTimes(title=", this.f19889a, ", subTitle=", this.b, ", contactItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f19890a;
        public final String b;

        public CoreButtonAction(ActionType actionType, String str) {
            this.f19890a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonAction)) {
                return false;
            }
            CoreButtonAction coreButtonAction = (CoreButtonAction) obj;
            return this.f19890a == coreButtonAction.f19890a && Intrinsics.c(this.b, coreButtonAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19890a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonAction(type=" + this.f19890a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f19891a;
        public final String b;

        public CoreButtonAction1(ActionType actionType, String str) {
            this.f19891a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonAction1)) {
                return false;
            }
            CoreButtonAction1 coreButtonAction1 = (CoreButtonAction1) obj;
            return this.f19891a == coreButtonAction1.f19891a && Intrinsics.c(this.b, coreButtonAction1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19891a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonAction1(type=" + this.f19891a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonAction2 {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f19892a;
        public final String b;

        public CoreButtonAction2(ActionType actionType, String str) {
            this.f19892a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonAction2)) {
                return false;
            }
            CoreButtonAction2 coreButtonAction2 = (CoreButtonAction2) obj;
            return this.f19892a == coreButtonAction2.f19892a && Intrinsics.c(this.b, coreButtonAction2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19892a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonAction2(type=" + this.f19892a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderSummary f19893a;

        public Data(OrderSummary orderSummary) {
            this.f19893a = orderSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19893a, ((Data) obj).f19893a);
        }

        public final int hashCode() {
            return this.f19893a.hashCode();
        }

        public final String toString() {
            return "Data(orderSummary=" + this.f19893a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryInstructions;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryInstructions {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19894a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;

        public DeliveryInstructions(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f19894a = z;
            this.b = str;
            this.c = z2;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = z3;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryInstructions)) {
                return false;
            }
            DeliveryInstructions deliveryInstructions = (DeliveryInstructions) obj;
            return this.f19894a == deliveryInstructions.f19894a && Intrinsics.c(this.b, deliveryInstructions.b) && this.c == deliveryInstructions.c && Intrinsics.c(this.d, deliveryInstructions.d) && Intrinsics.c(this.e, deliveryInstructions.e) && Intrinsics.c(this.f, deliveryInstructions.f) && this.g == deliveryInstructions.g && this.h == deliveryInstructions.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + b.e(b.c(b.c(b.c(b.e(b.c(Boolean.hashCode(this.f19894a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("DeliveryInstructions(leaveUnattended=", ", leaveUnattendedTitle=", this.b, ", hideLeaveUnattended=", this.f19894a);
            au.com.woolworths.android.onesite.a.y(", leaveUnattendedMessage=", this.d, ", driverInstructions=", sbT, this.c);
            androidx.constraintlayout.core.state.a.B(sbT, this.e, ", driverInstructionsTitle=", this.f, ", canToggleLeaveUnattended=");
            return au.com.woolworths.android.onesite.a.q(sbT, this.g, ", canEditInstructions=", this.h, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryInstructions1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryInstructions1 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19895a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;

        public DeliveryInstructions1(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f19895a = z;
            this.b = str;
            this.c = z2;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = z3;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryInstructions1)) {
                return false;
            }
            DeliveryInstructions1 deliveryInstructions1 = (DeliveryInstructions1) obj;
            return this.f19895a == deliveryInstructions1.f19895a && Intrinsics.c(this.b, deliveryInstructions1.b) && this.c == deliveryInstructions1.c && Intrinsics.c(this.d, deliveryInstructions1.d) && Intrinsics.c(this.e, deliveryInstructions1.e) && Intrinsics.c(this.f, deliveryInstructions1.f) && this.g == deliveryInstructions1.g && this.h == deliveryInstructions1.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + b.e(b.c(b.c(b.c(b.e(b.c(Boolean.hashCode(this.f19895a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("DeliveryInstructions1(leaveUnattended=", ", leaveUnattendedTitle=", this.b, ", hideLeaveUnattended=", this.f19895a);
            au.com.woolworths.android.onesite.a.y(", leaveUnattendedMessage=", this.d, ", driverInstructions=", sbT, this.c);
            androidx.constraintlayout.core.state.a.B(sbT, this.e, ", driverInstructionsTitle=", this.f, ", canToggleLeaveUnattended=");
            return au.com.woolworths.android.onesite.a.q(sbT, this.g, ", canEditInstructions=", this.h, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryMethodsTab;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryMethodsTab {

        /* renamed from: a, reason: collision with root package name */
        public final String f19896a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final DriverRatingBanner e;

        public DeliveryMethodsTab(String str, String str2, String str3, ArrayList arrayList, DriverRatingBanner driverRatingBanner) {
            this.f19896a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = driverRatingBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryMethodsTab)) {
                return false;
            }
            DeliveryMethodsTab deliveryMethodsTab = (DeliveryMethodsTab) obj;
            return this.f19896a.equals(deliveryMethodsTab.f19896a) && this.b.equals(deliveryMethodsTab.b) && this.c.equals(deliveryMethodsTab.c) && this.d.equals(deliveryMethodsTab.d) && Intrinsics.c(this.e, deliveryMethodsTab.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.c(this.f19896a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            DriverRatingBanner driverRatingBanner = this.e;
            return iB + (driverRatingBanner == null ? 0 : driverRatingBanner.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeliveryMethodsTab(title=", this.f19896a, ", imageUrl=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", bulletInfoList=");
            sbV.append(this.d);
            sbV.append(", driverRatingBanner=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryTooltip;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryTooltip {

        /* renamed from: a, reason: collision with root package name */
        public final String f19897a;
        public final String b;
        public final ArrayList c;

        public DeliveryTooltip(String str, String str2, ArrayList arrayList) {
            this.f19897a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryTooltip)) {
                return false;
            }
            DeliveryTooltip deliveryTooltip = (DeliveryTooltip) obj;
            return this.f19897a.equals(deliveryTooltip.f19897a) && this.b.equals(deliveryTooltip.b) && this.c.equals(deliveryTooltip.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19897a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("DeliveryTooltip(title=", this.f19897a, ", message=", this.b, ", deliveryMethodsTabs="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Discount;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discount {

        /* renamed from: a, reason: collision with root package name */
        public final String f19898a;
        public final String b;

        public Discount(String str, String str2) {
            this.f19898a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return Intrinsics.c(this.f19898a, discount.f19898a) && Intrinsics.c(this.b, discount.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19898a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Discount(title=", this.f19898a, ", amount=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DoNotAllowWasSetEarlier;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DoNotAllowWasSetEarlier {

        /* renamed from: a, reason: collision with root package name */
        public final String f19899a;
        public final ArrayList b;
        public final ArrayList c;
        public final String d;

        public DoNotAllowWasSetEarlier(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            this.f19899a = str;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoNotAllowWasSetEarlier)) {
                return false;
            }
            DoNotAllowWasSetEarlier doNotAllowWasSetEarlier = (DoNotAllowWasSetEarlier) obj;
            return this.f19899a.equals(doNotAllowWasSetEarlier.f19899a) && this.b.equals(doNotAllowWasSetEarlier.b) && this.c.equals(doNotAllowWasSetEarlier.c) && this.d.equals(doNotAllowWasSetEarlier.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f19899a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbX = d.x("DoNotAllowWasSetEarlier(header=", this.f19899a, ", rationales=", ", locationPermissionButtons=", this.b);
            sbX.append(this.c);
            sbX.append(", footer=");
            sbX.append(this.d);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DoneButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DoneButton {

        /* renamed from: a, reason: collision with root package name */
        public final CoreButtonStyle f19900a;
        public final String b;
        public final CoreButtonAction1 c;
        public final boolean d;

        public DoneButton(CoreButtonStyle coreButtonStyle, String str, CoreButtonAction1 coreButtonAction1, boolean z) {
            this.f19900a = coreButtonStyle;
            this.b = str;
            this.c = coreButtonAction1;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoneButton)) {
                return false;
            }
            DoneButton doneButton = (DoneButton) obj;
            return this.f19900a == doneButton.f19900a && Intrinsics.c(this.b, doneButton.b) && Intrinsics.c(this.c, doneButton.c) && this.d == doneButton.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.c(this.f19900a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "DoneButton(coreButtonStyle=" + this.f19900a + ", coreButtonLabel=" + this.b + ", coreButtonAction=" + this.c + ", coreButtonEnabled=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DriverRatingBanner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DriverRatingBanner {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerUI f19901a;
        public final boolean b;

        public DriverRatingBanner(BroadcastBannerUI broadcastBannerUI, boolean z) {
            this.f19901a = broadcastBannerUI;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DriverRatingBanner)) {
                return false;
            }
            DriverRatingBanner driverRatingBanner = (DriverRatingBanner) obj;
            return Intrinsics.c(this.f19901a, driverRatingBanner.f19901a) && this.b == driverRatingBanner.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f19901a.hashCode() * 31);
        }

        public final String toString() {
            return "DriverRatingBanner(broadcastBannerUI=" + this.f19901a + ", broadcastBannerDismissible=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$EditOrderWarning;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditOrderWarning {

        /* renamed from: a, reason: collision with root package name */
        public final String f19902a;
        public final String b;
        public final ArrayList c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public EditOrderWarning(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6) {
            this.f19902a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditOrderWarning)) {
                return false;
            }
            EditOrderWarning editOrderWarning = (EditOrderWarning) obj;
            return this.f19902a.equals(editOrderWarning.f19902a) && this.b.equals(editOrderWarning.b) && this.c.equals(editOrderWarning.c) && this.d.equals(editOrderWarning.d) && this.e.equals(editOrderWarning.e) && this.f.equals(editOrderWarning.f) && Intrinsics.c(this.g, editOrderWarning.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(androidx.compose.ui.input.pointer.a.b(b.c(this.f19902a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            String str = this.g;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("EditOrderWarning(imageUrl=", this.f19902a, ", title=", this.b, ", warningItems=");
            sbV.append(this.c);
            sbV.append(", acceptLabel=");
            sbV.append(this.d);
            sbV.append(", acceptButtonLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", cancelButtonLabel=", this.f, ", disclaimer=");
            return a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ExtraContent;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f19903a;
        public final String b;

        public ExtraContent(String str, String str2) {
            this.f19903a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraContent)) {
                return false;
            }
            ExtraContent extraContent = (ExtraContent) obj;
            return Intrinsics.c(this.f19903a, extraContent.f19903a) && Intrinsics.c(this.b, extraContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19903a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("ExtraContent(key=", this.f19903a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ExtraContent1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraContent1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19904a;
        public final String b;

        public ExtraContent1(String str, String str2) {
            this.f19904a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraContent1)) {
                return false;
            }
            ExtraContent1 extraContent1 = (ExtraContent1) obj;
            return Intrinsics.c(this.f19904a, extraContent1.f19904a) && Intrinsics.c(this.b, extraContent1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19904a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("ExtraContent1(key=", this.f19904a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Feed;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f19905a;
        public final ArrayList b;

        public Feed(String str, ArrayList arrayList) {
            this.f19905a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return this.f19905a.equals(feed.f19905a) && this.b.equals(feed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19905a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Feed(__typename=", this.f19905a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FeedbackAndCommentsStep;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedbackAndCommentsStep {

        /* renamed from: a, reason: collision with root package name */
        public final String f19906a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final String e;
        public final DoneButton f;

        public FeedbackAndCommentsStep(String str, String str2, String str3, ArrayList arrayList, String str4, DoneButton doneButton) {
            this.f19906a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = str4;
            this.f = doneButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackAndCommentsStep)) {
                return false;
            }
            FeedbackAndCommentsStep feedbackAndCommentsStep = (FeedbackAndCommentsStep) obj;
            return this.f19906a.equals(feedbackAndCommentsStep.f19906a) && this.b.equals(feedbackAndCommentsStep.b) && this.c.equals(feedbackAndCommentsStep.c) && this.d.equals(feedbackAndCommentsStep.d) && this.e.equals(feedbackAndCommentsStep.e) && this.f.equals(feedbackAndCommentsStep.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(androidx.compose.ui.input.pointer.a.b(b.c(b.c(this.f19906a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("FeedbackAndCommentsStep(title=", this.f19906a, ", subTitle=", this.b, ", feedbackChipsQuestion=");
            sbV.append(this.c);
            sbV.append(", feedbackChips=");
            sbV.append(this.d);
            sbV.append(", additionalCommentText=");
            sbV.append(this.e);
            sbV.append(", doneButton=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FeedbackChip;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedbackChip {

        /* renamed from: a, reason: collision with root package name */
        public final String f19907a;
        public final boolean b;
        public final Text c;

        public FeedbackChip(String str, boolean z, Text text) {
            this.f19907a = str;
            this.b = z;
            this.c = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackChip)) {
                return false;
            }
            FeedbackChip feedbackChip = (FeedbackChip) obj;
            return Intrinsics.c(this.f19907a, feedbackChip.f19907a) && this.b == feedbackChip.b && Intrinsics.c(this.c, feedbackChip.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f19907a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("FeedbackChip(id=", this.f19907a, ", isSelected=", ", text=", this.b);
            sbQ.append(this.c);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19908a;
        public final String b;

        public FulfilmentItem(String str, String str2) {
            this.f19908a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentItem)) {
                return false;
            }
            FulfilmentItem fulfilmentItem = (FulfilmentItem) obj;
            return Intrinsics.c(this.f19908a, fulfilmentItem.f19908a) && Intrinsics.c(this.b, fulfilmentItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19908a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentItem(title=", this.f19908a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19909a;
        public final String b;

        public FulfilmentItem1(String str, String str2) {
            this.f19909a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentItem1)) {
                return false;
            }
            FulfilmentItem1 fulfilmentItem1 = (FulfilmentItem1) obj;
            return Intrinsics.c(this.f19909a, fulfilmentItem1.f19909a) && Intrinsics.c(this.b, fulfilmentItem1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19909a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentItem1(title=", this.f19909a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentItem2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19910a;
        public final String b;

        public FulfilmentItem2(String str, String str2) {
            this.f19910a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentItem2)) {
                return false;
            }
            FulfilmentItem2 fulfilmentItem2 = (FulfilmentItem2) obj;
            return Intrinsics.c(this.f19910a, fulfilmentItem2.f19910a) && Intrinsics.c(this.b, fulfilmentItem2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19910a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentItem2(title=", this.f19910a, ", subtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HandoverBanner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HandoverBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19911a;
        public final String b;
        public final BroadcastBannerType c;
        public final Boolean d;
        public final String e;
        public final String f;

        public HandoverBanner(String str, String str2, BroadcastBannerType broadcastBannerType, Boolean bool, String str3, String str4) {
            this.f19911a = str;
            this.b = str2;
            this.c = broadcastBannerType;
            this.d = bool;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandoverBanner)) {
                return false;
            }
            HandoverBanner handoverBanner = (HandoverBanner) obj;
            return Intrinsics.c(this.f19911a, handoverBanner.f19911a) && Intrinsics.c(this.b, handoverBanner.b) && this.c == handoverBanner.c && Intrinsics.c(this.d, handoverBanner.d) && Intrinsics.c(this.e, handoverBanner.e) && Intrinsics.c(this.f, handoverBanner.f);
        }

        public final int hashCode() {
            int iHashCode = this.f19911a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.d;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("HandoverBanner(title=", this.f19911a, ", subtitle=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", dismissible=");
            sbV.append(this.d);
            sbV.append(", bannerId=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", imageUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HelpItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19912a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderHelpItemType e;

        public HelpItem(String str, String str2, String str3, String str4, OrderHelpItemType orderHelpItemType) {
            this.f19912a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderHelpItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpItem)) {
                return false;
            }
            HelpItem helpItem = (HelpItem) obj;
            return Intrinsics.c(this.f19912a, helpItem.f19912a) && Intrinsics.c(this.b, helpItem.b) && Intrinsics.c(this.c, helpItem.c) && Intrinsics.c(this.d, helpItem.d) && this.e == helpItem.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19912a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("HelpItem(iconUrl=", this.f19912a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", url=", this.d, ", itemType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HelpList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19913a;
        public final String b;
        public final String c;
        public final List d;
        public final ContactTimes e;

        public HelpList(ArrayList arrayList, String str, String str2, List list, ContactTimes contactTimes) {
            this.f19913a = arrayList;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = contactTimes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpList)) {
                return false;
            }
            HelpList helpList = (HelpList) obj;
            return this.f19913a.equals(helpList.f19913a) && Intrinsics.c(this.b, helpList.b) && Intrinsics.c(this.c, helpList.c) && Intrinsics.c(this.d, helpList.d) && Intrinsics.c(this.e, helpList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19913a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.d;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            ContactTimes contactTimes = this.e;
            return iHashCode4 + (contactTimes != null ? contactTimes.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HelpList(items=");
            sb.append(this.f19913a);
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", helpTitle=");
            au.com.woolworths.android.onesite.a.B(sb, this.c, ", helpItems=", this.d, ", contactTimes=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Icon;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19914a;
        public final OnHostedIcon b;

        public Icon(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f19914a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f19914a, icon.f19914a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19914a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f19938a.hashCode());
        }

        public final String toString() {
            return "Icon(__typename=" + this.f19914a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetAlert;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlert {

        /* renamed from: a, reason: collision with root package name */
        public final CoreAlertStyle f19915a;
        public final String b;
        public final String c;

        public InsetAlert(CoreAlertStyle coreAlertStyle, String str, String str2) {
            this.f19915a = coreAlertStyle;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlert)) {
                return false;
            }
            InsetAlert insetAlert = (InsetAlert) obj;
            return this.f19915a == insetAlert.f19915a && Intrinsics.c(this.b, insetAlert.b) && Intrinsics.c(this.c, insetAlert.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19915a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InsetAlert(style=");
            sb.append(this.f19915a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19916a;
        public final Action b;
        public final InsetBannerDisplayType c;
        public final Analytics d;

        public InsetBanner(String str, Action action, InsetBannerDisplayType insetBannerDisplayType, Analytics analytics) {
            this.f19916a = str;
            this.b = action;
            this.c = insetBannerDisplayType;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) obj;
            return Intrinsics.c(this.f19916a, insetBanner.f19916a) && Intrinsics.c(this.b, insetBanner.b) && this.c == insetBanner.c && Intrinsics.c(this.d, insetBanner.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19916a.hashCode() * 31;
            Action action = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (action == null ? 0 : action.hashCode())) * 31)) * 31;
            Analytics analytics = this.d;
            return iHashCode2 + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            return "InsetBanner(message=" + this.f19916a + ", action=" + this.b + ", displayType=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19917a;
        public final InsetBannerDisplayType b;

        public InsetBanner1(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f19917a = str;
            this.b = insetBannerDisplayType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner1)) {
                return false;
            }
            InsetBanner1 insetBanner1 = (InsetBanner1) obj;
            return Intrinsics.c(this.f19917a, insetBanner1.f19917a) && this.b == insetBanner1.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19917a.hashCode() * 31);
        }

        public final String toString() {
            return "InsetBanner1(message=" + this.f19917a + ", displayType=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner2 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f19918a;
        public final String b;
        public final String c;

        public InsetBanner2(InsetBannerDisplayType insetBannerDisplayType, String str, String str2) {
            this.f19918a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner2)) {
                return false;
            }
            InsetBanner2 insetBanner2 = (InsetBanner2) obj;
            return this.f19918a == insetBanner2.f19918a && Intrinsics.c(this.b, insetBanner2.b) && Intrinsics.c(this.c, insetBanner2.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19918a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.u("InsetBanner2(displayType=", this.f19918a, ", message=", this.b, ", bannerTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner3;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19919a;
        public final String b;
        public final InsetBannerDisplayType c;
        public final String d;
        public final Analytics1 e;

        public InsetBanner3(String str, String str2, InsetBannerDisplayType insetBannerDisplayType, String str3, Analytics1 analytics1) {
            this.f19919a = str;
            this.b = str2;
            this.c = insetBannerDisplayType;
            this.d = str3;
            this.e = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner3)) {
                return false;
            }
            InsetBanner3 insetBanner3 = (InsetBanner3) obj;
            return Intrinsics.c(this.f19919a, insetBanner3.f19919a) && Intrinsics.c(this.b, insetBanner3.b) && this.c == insetBanner3.c && Intrinsics.c(this.d, insetBanner3.d) && Intrinsics.c(this.e, insetBanner3.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19919a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Analytics1 analytics1 = this.e;
            return iHashCode3 + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetBanner3(message=", this.f19919a, ", iconUrl=", this.b, ", displayType=");
            sbV.append(this.c);
            sbV.append(", bannerTitle=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner4;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner4 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f19920a;
        public final String b;
        public final String c;
        public final Analytics2 d;

        public InsetBanner4(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Analytics2 analytics2) {
            this.f19920a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = analytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner4)) {
                return false;
            }
            InsetBanner4 insetBanner4 = (InsetBanner4) obj;
            return this.f19920a == insetBanner4.f19920a && Intrinsics.c(this.b, insetBanner4.b) && Intrinsics.c(this.c, insetBanner4.c) && Intrinsics.c(this.d, insetBanner4.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f19920a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics2 analytics2 = this.d;
            return iHashCode + (analytics2 != null ? analytics2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("InsetBanner4(displayType=", this.f19920a, ", message=", this.b, ", bannerTitle=");
            sbU.append(this.c);
            sbU.append(", analytics=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19921a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderHelpItemType e;

        public Item(String str, String str2, String str3, String str4, OrderHelpItemType orderHelpItemType) {
            this.f19921a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderHelpItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19921a, item.f19921a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && this.e == item.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19921a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item(iconUrl=", this.f19921a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", url=", this.d, ", itemType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19922a;
        public final OnOrderDetailsDivider b;
        public final OnOrderPaymentDetails c;
        public final OnHorizontalList d;
        public final OnOrderProofOfDeliveryDetails e;
        public final OnCurrentPickupOrderFulfilmentDetails f;
        public final OnCurrentPickupLocationTrackingStatus g;
        public final OnOrderFulfilmentDetails h;
        public final OnPastPickupOrderFulfilmentDetails i;
        public final OnDeliveryOrderFulfilmentDetails j;
        public final OnPastOrderOverview k;
        public final OnCurrentPickupOrderOverview l;
        public final OnOrderNumberDetails m;
        public final OnDeliveryDriverDetails n;
        public final OnCurrentDeliveryOrderOverview o;
        public final OnDriverRating p;

        public Item1(String __typename, OnOrderDetailsDivider onOrderDetailsDivider, OnOrderPaymentDetails onOrderPaymentDetails, OnHorizontalList onHorizontalList, OnOrderProofOfDeliveryDetails onOrderProofOfDeliveryDetails, OnCurrentPickupOrderFulfilmentDetails onCurrentPickupOrderFulfilmentDetails, OnCurrentPickupLocationTrackingStatus onCurrentPickupLocationTrackingStatus, OnOrderFulfilmentDetails onOrderFulfilmentDetails, OnPastPickupOrderFulfilmentDetails onPastPickupOrderFulfilmentDetails, OnDeliveryOrderFulfilmentDetails onDeliveryOrderFulfilmentDetails, OnPastOrderOverview onPastOrderOverview, OnCurrentPickupOrderOverview onCurrentPickupOrderOverview, OnOrderNumberDetails onOrderNumberDetails, OnDeliveryDriverDetails onDeliveryDriverDetails, OnCurrentDeliveryOrderOverview onCurrentDeliveryOrderOverview, OnDriverRating onDriverRating) {
            Intrinsics.h(__typename, "__typename");
            this.f19922a = __typename;
            this.b = onOrderDetailsDivider;
            this.c = onOrderPaymentDetails;
            this.d = onHorizontalList;
            this.e = onOrderProofOfDeliveryDetails;
            this.f = onCurrentPickupOrderFulfilmentDetails;
            this.g = onCurrentPickupLocationTrackingStatus;
            this.h = onOrderFulfilmentDetails;
            this.i = onPastPickupOrderFulfilmentDetails;
            this.j = onDeliveryOrderFulfilmentDetails;
            this.k = onPastOrderOverview;
            this.l = onCurrentPickupOrderOverview;
            this.m = onOrderNumberDetails;
            this.n = onDeliveryDriverDetails;
            this.o = onCurrentDeliveryOrderOverview;
            this.p = onDriverRating;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f19922a, item1.f19922a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c) && Intrinsics.c(this.d, item1.d) && Intrinsics.c(this.e, item1.e) && Intrinsics.c(this.f, item1.f) && Intrinsics.c(this.g, item1.g) && Intrinsics.c(this.h, item1.h) && Intrinsics.c(this.i, item1.i) && Intrinsics.c(this.j, item1.j) && Intrinsics.c(this.k, item1.k) && Intrinsics.c(this.l, item1.l) && Intrinsics.c(this.m, item1.m) && Intrinsics.c(this.n, item1.n) && Intrinsics.c(this.o, item1.o) && Intrinsics.c(this.p, item1.p);
        }

        public final int hashCode() {
            int iHashCode = this.f19922a.hashCode() * 31;
            OnOrderDetailsDivider onOrderDetailsDivider = this.b;
            int iHashCode2 = (iHashCode + (onOrderDetailsDivider == null ? 0 : onOrderDetailsDivider.hashCode())) * 31;
            OnOrderPaymentDetails onOrderPaymentDetails = this.c;
            int iHashCode3 = (iHashCode2 + (onOrderPaymentDetails == null ? 0 : onOrderPaymentDetails.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.d;
            int iHashCode4 = (iHashCode3 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnOrderProofOfDeliveryDetails onOrderProofOfDeliveryDetails = this.e;
            int iHashCode5 = (iHashCode4 + (onOrderProofOfDeliveryDetails == null ? 0 : onOrderProofOfDeliveryDetails.hashCode())) * 31;
            OnCurrentPickupOrderFulfilmentDetails onCurrentPickupOrderFulfilmentDetails = this.f;
            int iHashCode6 = (iHashCode5 + (onCurrentPickupOrderFulfilmentDetails == null ? 0 : onCurrentPickupOrderFulfilmentDetails.hashCode())) * 31;
            OnCurrentPickupLocationTrackingStatus onCurrentPickupLocationTrackingStatus = this.g;
            int iHashCode7 = (iHashCode6 + (onCurrentPickupLocationTrackingStatus == null ? 0 : onCurrentPickupLocationTrackingStatus.hashCode())) * 31;
            OnOrderFulfilmentDetails onOrderFulfilmentDetails = this.h;
            int iHashCode8 = (iHashCode7 + (onOrderFulfilmentDetails == null ? 0 : onOrderFulfilmentDetails.hashCode())) * 31;
            OnPastPickupOrderFulfilmentDetails onPastPickupOrderFulfilmentDetails = this.i;
            int iHashCode9 = (iHashCode8 + (onPastPickupOrderFulfilmentDetails == null ? 0 : onPastPickupOrderFulfilmentDetails.hashCode())) * 31;
            OnDeliveryOrderFulfilmentDetails onDeliveryOrderFulfilmentDetails = this.j;
            int iHashCode10 = (iHashCode9 + (onDeliveryOrderFulfilmentDetails == null ? 0 : onDeliveryOrderFulfilmentDetails.hashCode())) * 31;
            OnPastOrderOverview onPastOrderOverview = this.k;
            int iHashCode11 = (iHashCode10 + (onPastOrderOverview == null ? 0 : onPastOrderOverview.hashCode())) * 31;
            OnCurrentPickupOrderOverview onCurrentPickupOrderOverview = this.l;
            int iHashCode12 = (iHashCode11 + (onCurrentPickupOrderOverview == null ? 0 : onCurrentPickupOrderOverview.hashCode())) * 31;
            OnOrderNumberDetails onOrderNumberDetails = this.m;
            int iHashCode13 = (iHashCode12 + (onOrderNumberDetails == null ? 0 : onOrderNumberDetails.hashCode())) * 31;
            OnDeliveryDriverDetails onDeliveryDriverDetails = this.n;
            int iHashCode14 = (iHashCode13 + (onDeliveryDriverDetails == null ? 0 : onDeliveryDriverDetails.hashCode())) * 31;
            OnCurrentDeliveryOrderOverview onCurrentDeliveryOrderOverview = this.o;
            int iHashCode15 = (iHashCode14 + (onCurrentDeliveryOrderOverview == null ? 0 : onCurrentDeliveryOrderOverview.hashCode())) * 31;
            OnDriverRating onDriverRating = this.p;
            return iHashCode15 + (onDriverRating != null ? onDriverRating.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f19922a + ", onOrderDetailsDivider=" + this.b + ", onOrderPaymentDetails=" + this.c + ", onHorizontalList=" + this.d + ", onOrderProofOfDeliveryDetails=" + this.e + ", onCurrentPickupOrderFulfilmentDetails=" + this.f + ", onCurrentPickupLocationTrackingStatus=" + this.g + ", onOrderFulfilmentDetails=" + this.h + ", onPastPickupOrderFulfilmentDetails=" + this.i + ", onDeliveryOrderFulfilmentDetails=" + this.j + ", onPastOrderOverview=" + this.k + ", onCurrentPickupOrderOverview=" + this.l + ", onOrderNumberDetails=" + this.m + ", onDeliveryDriverDetails=" + this.n + ", onCurrentDeliveryOrderOverview=" + this.o + ", onDriverRating=" + this.p + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item2;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19923a;
        public final OnOrderDetailsProductCard b;

        public Item2(String __typename, OnOrderDetailsProductCard onOrderDetailsProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f19923a = __typename;
            this.b = onOrderDetailsProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f19923a, item2.f19923a) && Intrinsics.c(this.b, item2.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19923a.hashCode() * 31;
            OnOrderDetailsProductCard onOrderDetailsProductCard = this.b;
            return iHashCode + (onOrderDetailsProductCard == null ? 0 : onOrderDetailsProductCard.hashCode());
        }

        public final String toString() {
            return "Item2(__typename=" + this.f19923a + ", onOrderDetailsProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LiveTrackingButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LiveTrackingButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19924a;
        public final boolean b;
        public final String c;

        public LiveTrackingButton(String str, String str2, boolean z) {
            this.f19924a = str;
            this.b = z;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveTrackingButton)) {
                return false;
            }
            LiveTrackingButton liveTrackingButton = (LiveTrackingButton) obj;
            return Intrinsics.c(this.f19924a, liveTrackingButton.f19924a) && this.b == liveTrackingButton.b && Intrinsics.c(this.c, liveTrackingButton.c);
        }

        public final int hashCode() {
            int iE = b.e(this.f19924a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.q("LiveTrackingButton(label=", this.f19924a, ", enabled=", ", url=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationPermissionButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19925a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public LocationPermissionButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19925a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationPermissionButton)) {
                return false;
            }
            LocationPermissionButton locationPermissionButton = (LocationPermissionButton) obj;
            return Intrinsics.c(this.f19925a, locationPermissionButton.f19925a) && Intrinsics.c(this.b, locationPermissionButton.b) && this.c == locationPermissionButton.c && this.d == locationPermissionButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19925a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("LocationPermissionButton(label=", this.f19925a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionButton1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationPermissionButton1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19926a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public LocationPermissionButton1(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19926a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationPermissionButton1)) {
                return false;
            }
            LocationPermissionButton1 locationPermissionButton1 = (LocationPermissionButton1) obj;
            return Intrinsics.c(this.f19926a, locationPermissionButton1.f19926a) && Intrinsics.c(this.b, locationPermissionButton1.b) && this.c == locationPermissionButton1.c && this.d == locationPermissionButton1.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19926a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("LocationPermissionButton1(label=", this.f19926a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionsWereNotSet;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationPermissionsWereNotSet {

        /* renamed from: a, reason: collision with root package name */
        public final String f19927a;
        public final ArrayList b;
        public final ArrayList c;
        public final String d;

        public LocationPermissionsWereNotSet(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            this.f19927a = str;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationPermissionsWereNotSet)) {
                return false;
            }
            LocationPermissionsWereNotSet locationPermissionsWereNotSet = (LocationPermissionsWereNotSet) obj;
            return this.f19927a.equals(locationPermissionsWereNotSet.f19927a) && this.b.equals(locationPermissionsWereNotSet.b) && this.c.equals(locationPermissionsWereNotSet.c) && this.d.equals(locationPermissionsWereNotSet.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f19927a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbX = d.x("LocationPermissionsWereNotSet(header=", this.f19927a, ", rationales=", ", locationPermissionButtons=", this.b);
            sbX.append(this.c);
            sbX.append(", footer=");
            sbX.append(this.d);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationTrackingPrimingPage;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LocationTrackingPrimingPage {

        /* renamed from: a, reason: collision with root package name */
        public final LocationPermissionsWereNotSet f19928a;
        public final DoNotAllowWasSetEarlier b;

        public LocationTrackingPrimingPage(LocationPermissionsWereNotSet locationPermissionsWereNotSet, DoNotAllowWasSetEarlier doNotAllowWasSetEarlier) {
            this.f19928a = locationPermissionsWereNotSet;
            this.b = doNotAllowWasSetEarlier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationTrackingPrimingPage)) {
                return false;
            }
            LocationTrackingPrimingPage locationTrackingPrimingPage = (LocationTrackingPrimingPage) obj;
            return Intrinsics.c(this.f19928a, locationTrackingPrimingPage.f19928a) && Intrinsics.c(this.b, locationTrackingPrimingPage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19928a.hashCode() * 31);
        }

        public final String toString() {
            return "LocationTrackingPrimingPage(locationPermissionsWereNotSet=" + this.f19928a + ", doNotAllowWasSetEarlier=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$MarketSubtotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketSubtotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f19929a;
        public final String b;
        public final String c;

        public MarketSubtotal(String str, String str2, String str3) {
            this.f19929a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketSubtotal)) {
                return false;
            }
            MarketSubtotal marketSubtotal = (MarketSubtotal) obj;
            return Intrinsics.c(this.f19929a, marketSubtotal.f19929a) && Intrinsics.c(this.b, marketSubtotal.b) && Intrinsics.c(this.c, marketSubtotal.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19929a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("MarketSubtotal(title=", this.f19929a, ", amount=", this.b, ", __typename="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentDeliveryOrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCurrentDeliveryOrderOverview {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19930a;
        public final ArrayList b;
        public final ChangeOrderButton2 c;
        public final CancelOrderButton2 d;
        public final ProgressStepper1 e;
        public final Tooltip1 f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final OrderSubtitleIcon k;
        public final String l;

        public OnCurrentDeliveryOrderOverview(ArrayList arrayList, ArrayList arrayList2, ChangeOrderButton2 changeOrderButton2, CancelOrderButton2 cancelOrderButton2, ProgressStepper1 progressStepper1, Tooltip1 tooltip1, String str, String str2, String str3, String str4, OrderSubtitleIcon orderSubtitleIcon, String str5) {
            this.f19930a = arrayList;
            this.b = arrayList2;
            this.c = changeOrderButton2;
            this.d = cancelOrderButton2;
            this.e = progressStepper1;
            this.f = tooltip1;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = str4;
            this.k = orderSubtitleIcon;
            this.l = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCurrentDeliveryOrderOverview)) {
                return false;
            }
            OnCurrentDeliveryOrderOverview onCurrentDeliveryOrderOverview = (OnCurrentDeliveryOrderOverview) obj;
            return this.f19930a.equals(onCurrentDeliveryOrderOverview.f19930a) && this.b.equals(onCurrentDeliveryOrderOverview.b) && Intrinsics.c(this.c, onCurrentDeliveryOrderOverview.c) && Intrinsics.c(this.d, onCurrentDeliveryOrderOverview.d) && Intrinsics.c(this.e, onCurrentDeliveryOrderOverview.e) && Intrinsics.c(this.f, onCurrentDeliveryOrderOverview.f) && Intrinsics.c(this.g, onCurrentDeliveryOrderOverview.g) && Intrinsics.c(this.h, onCurrentDeliveryOrderOverview.h) && Intrinsics.c(this.i, onCurrentDeliveryOrderOverview.i) && Intrinsics.c(this.j, onCurrentDeliveryOrderOverview.j) && this.k == onCurrentDeliveryOrderOverview.k && Intrinsics.c(this.l, onCurrentDeliveryOrderOverview.l);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f19930a.hashCode() * 31, 31, this.b);
            ChangeOrderButton2 changeOrderButton2 = this.c;
            int iHashCode = (iB + (changeOrderButton2 == null ? 0 : changeOrderButton2.hashCode())) * 31;
            CancelOrderButton2 cancelOrderButton2 = this.d;
            int iHashCode2 = (iHashCode + (cancelOrderButton2 == null ? 0 : cancelOrderButton2.hashCode())) * 31;
            ProgressStepper1 progressStepper1 = this.e;
            int iHashCode3 = (iHashCode2 + (progressStepper1 == null ? 0 : progressStepper1.hashCode())) * 31;
            Tooltip1 tooltip1 = this.f;
            int iHashCode4 = (iHashCode3 + (tooltip1 == null ? 0 : tooltip1.hashCode())) * 31;
            String str = this.g;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.j;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            OrderSubtitleIcon orderSubtitleIcon = this.k;
            int iHashCode9 = (iHashCode8 + (orderSubtitleIcon == null ? 0 : orderSubtitleIcon.hashCode())) * 31;
            String str5 = this.l;
            return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCurrentDeliveryOrderOverview(insetBanners=");
            sb.append(this.f19930a);
            sb.append(", bannerAnalyticLabels=");
            sb.append(this.b);
            sb.append(", changeOrderButton=");
            sb.append(this.c);
            sb.append(", cancelOrderButton=");
            sb.append(this.d);
            sb.append(", progressStepper=");
            sb.append(this.e);
            sb.append(", tooltip=");
            sb.append(this.f);
            sb.append(", instructionsMd=");
            androidx.constraintlayout.core.state.a.B(sb, this.g, ", helpMd=", this.h, ", orderSubtitle=");
            androidx.constraintlayout.core.state.a.B(sb, this.i, ", orderTitle=", this.j, ", orderSubtitleIcon=");
            sb.append(this.k);
            sb.append(", liveTrackingMapUrl=");
            sb.append(this.l);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupLocationTrackingStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCurrentPickupLocationTrackingStatus {

        /* renamed from: a, reason: collision with root package name */
        public final String f19931a;
        public final String b;
        public final String c;
        public final LocationTrackingStatusImage d;

        public OnCurrentPickupLocationTrackingStatus(String str, String str2, String str3, LocationTrackingStatusImage locationTrackingStatusImage) {
            this.f19931a = str;
            this.b = str2;
            this.c = str3;
            this.d = locationTrackingStatusImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCurrentPickupLocationTrackingStatus)) {
                return false;
            }
            OnCurrentPickupLocationTrackingStatus onCurrentPickupLocationTrackingStatus = (OnCurrentPickupLocationTrackingStatus) obj;
            return Intrinsics.c(this.f19931a, onCurrentPickupLocationTrackingStatus.f19931a) && Intrinsics.c(this.b, onCurrentPickupLocationTrackingStatus.b) && Intrinsics.c(this.c, onCurrentPickupLocationTrackingStatus.c) && this.d == onCurrentPickupLocationTrackingStatus.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f19931a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCurrentPickupLocationTrackingStatus(__typename=", this.f19931a, ", title=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", image=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCurrentPickupOrderFulfilmentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final StoreDetails f19932a;
        public final CollectionDetails b;

        public OnCurrentPickupOrderFulfilmentDetails(StoreDetails storeDetails, CollectionDetails collectionDetails) {
            this.f19932a = storeDetails;
            this.b = collectionDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCurrentPickupOrderFulfilmentDetails)) {
                return false;
            }
            OnCurrentPickupOrderFulfilmentDetails onCurrentPickupOrderFulfilmentDetails = (OnCurrentPickupOrderFulfilmentDetails) obj;
            return Intrinsics.c(this.f19932a, onCurrentPickupOrderFulfilmentDetails.f19932a) && Intrinsics.c(this.b, onCurrentPickupOrderFulfilmentDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19932a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCurrentPickupOrderFulfilmentDetails(storeDetails=" + this.f19932a + ", collectionDetails=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupOrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCurrentPickupOrderOverview {

        /* renamed from: a, reason: collision with root package name */
        public final ProgressStepper f19933a;
        public final ProgressStepperForCollectedState b;
        public final Tooltip c;
        public final String d;
        public final String e;
        public final OrderSubtitleIcon f;
        public final String g;
        public final String h;
        public final ChangeOrderButton1 i;
        public final CancelOrderButton1 j;
        public final CheckInNowButton k;
        public final CollectionBanner l;
        public final BayNumberPreferences m;
        public final CheckInOnMyWayButton n;
        public final OnMyWayPreferences o;
        public final boolean p;
        public final LocationTrackingPrimingPage q;
        public final Banner r;
        public final HandoverBanner s;

        public OnCurrentPickupOrderOverview(ProgressStepper progressStepper, ProgressStepperForCollectedState progressStepperForCollectedState, Tooltip tooltip, String str, String str2, OrderSubtitleIcon orderSubtitleIcon, String str3, String str4, ChangeOrderButton1 changeOrderButton1, CancelOrderButton1 cancelOrderButton1, CheckInNowButton checkInNowButton, CollectionBanner collectionBanner, BayNumberPreferences bayNumberPreferences, CheckInOnMyWayButton checkInOnMyWayButton, OnMyWayPreferences onMyWayPreferences, boolean z, LocationTrackingPrimingPage locationTrackingPrimingPage, Banner banner, HandoverBanner handoverBanner) {
            this.f19933a = progressStepper;
            this.b = progressStepperForCollectedState;
            this.c = tooltip;
            this.d = str;
            this.e = str2;
            this.f = orderSubtitleIcon;
            this.g = str3;
            this.h = str4;
            this.i = changeOrderButton1;
            this.j = cancelOrderButton1;
            this.k = checkInNowButton;
            this.l = collectionBanner;
            this.m = bayNumberPreferences;
            this.n = checkInOnMyWayButton;
            this.o = onMyWayPreferences;
            this.p = z;
            this.q = locationTrackingPrimingPage;
            this.r = banner;
            this.s = handoverBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCurrentPickupOrderOverview)) {
                return false;
            }
            OnCurrentPickupOrderOverview onCurrentPickupOrderOverview = (OnCurrentPickupOrderOverview) obj;
            return Intrinsics.c(this.f19933a, onCurrentPickupOrderOverview.f19933a) && Intrinsics.c(this.b, onCurrentPickupOrderOverview.b) && Intrinsics.c(this.c, onCurrentPickupOrderOverview.c) && Intrinsics.c(this.d, onCurrentPickupOrderOverview.d) && Intrinsics.c(this.e, onCurrentPickupOrderOverview.e) && this.f == onCurrentPickupOrderOverview.f && Intrinsics.c(this.g, onCurrentPickupOrderOverview.g) && Intrinsics.c(this.h, onCurrentPickupOrderOverview.h) && Intrinsics.c(this.i, onCurrentPickupOrderOverview.i) && Intrinsics.c(this.j, onCurrentPickupOrderOverview.j) && Intrinsics.c(this.k, onCurrentPickupOrderOverview.k) && Intrinsics.c(this.l, onCurrentPickupOrderOverview.l) && Intrinsics.c(this.m, onCurrentPickupOrderOverview.m) && Intrinsics.c(this.n, onCurrentPickupOrderOverview.n) && Intrinsics.c(this.o, onCurrentPickupOrderOverview.o) && this.p == onCurrentPickupOrderOverview.p && Intrinsics.c(this.q, onCurrentPickupOrderOverview.q) && Intrinsics.c(this.r, onCurrentPickupOrderOverview.r) && Intrinsics.c(this.s, onCurrentPickupOrderOverview.s);
        }

        public final int hashCode() {
            ProgressStepper progressStepper = this.f19933a;
            int iHashCode = (progressStepper == null ? 0 : progressStepper.hashCode()) * 31;
            ProgressStepperForCollectedState progressStepperForCollectedState = this.b;
            int iHashCode2 = (iHashCode + (progressStepperForCollectedState == null ? 0 : progressStepperForCollectedState.hashCode())) * 31;
            Tooltip tooltip = this.c;
            int iHashCode3 = (iHashCode2 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            OrderSubtitleIcon orderSubtitleIcon = this.f;
            int iHashCode6 = (iHashCode5 + (orderSubtitleIcon == null ? 0 : orderSubtitleIcon.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.h;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ChangeOrderButton1 changeOrderButton1 = this.i;
            int iHashCode9 = (iHashCode8 + (changeOrderButton1 == null ? 0 : changeOrderButton1.hashCode())) * 31;
            CancelOrderButton1 cancelOrderButton1 = this.j;
            int iHashCode10 = (iHashCode9 + (cancelOrderButton1 == null ? 0 : cancelOrderButton1.hashCode())) * 31;
            CheckInNowButton checkInNowButton = this.k;
            int iHashCode11 = (iHashCode10 + (checkInNowButton == null ? 0 : checkInNowButton.hashCode())) * 31;
            CollectionBanner collectionBanner = this.l;
            int iHashCode12 = (iHashCode11 + (collectionBanner == null ? 0 : collectionBanner.hashCode())) * 31;
            BayNumberPreferences bayNumberPreferences = this.m;
            int iHashCode13 = (iHashCode12 + (bayNumberPreferences == null ? 0 : bayNumberPreferences.hashCode())) * 31;
            CheckInOnMyWayButton checkInOnMyWayButton = this.n;
            int iHashCode14 = (iHashCode13 + (checkInOnMyWayButton == null ? 0 : checkInOnMyWayButton.hashCode())) * 31;
            OnMyWayPreferences onMyWayPreferences = this.o;
            int iE = b.e((iHashCode14 + (onMyWayPreferences == null ? 0 : onMyWayPreferences.hashCode())) * 31, 31, this.p);
            LocationTrackingPrimingPage locationTrackingPrimingPage = this.q;
            int iHashCode15 = (iE + (locationTrackingPrimingPage == null ? 0 : locationTrackingPrimingPage.hashCode())) * 31;
            Banner banner = this.r;
            int iHashCode16 = (iHashCode15 + (banner == null ? 0 : banner.hashCode())) * 31;
            HandoverBanner handoverBanner = this.s;
            return iHashCode16 + (handoverBanner != null ? handoverBanner.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCurrentPickupOrderOverview(progressStepper=");
            sb.append(this.f19933a);
            sb.append(", progressStepperForCollectedState=");
            sb.append(this.b);
            sb.append(", tooltip=");
            sb.append(this.c);
            sb.append(", orderTitle=");
            sb.append(this.d);
            sb.append(", orderSubtitle=");
            sb.append(this.e);
            sb.append(", orderSubtitleIcon=");
            sb.append(this.f);
            sb.append(", instructionsMd=");
            androidx.constraintlayout.core.state.a.B(sb, this.g, ", helpMd=", this.h, ", changeOrderButton=");
            sb.append(this.i);
            sb.append(", cancelOrderButton=");
            sb.append(this.j);
            sb.append(", checkInNowButton=");
            sb.append(this.k);
            sb.append(", collectionBanner=");
            sb.append(this.l);
            sb.append(", bayNumberPreferences=");
            sb.append(this.m);
            sb.append(", checkInOnMyWayButton=");
            sb.append(this.n);
            sb.append(", onMyWayPreferences=");
            sb.append(this.o);
            sb.append(", locationTrackingEnabled=");
            sb.append(this.p);
            sb.append(", locationTrackingPrimingPage=");
            sb.append(this.q);
            sb.append(", banner=");
            sb.append(this.r);
            sb.append(", handoverBanner=");
            sb.append(this.s);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDeliveryDriverDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryDriverDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19934a;
        public final String b;
        public final String c;
        public final InsetBanner3 d;
        public final LiveTrackingButton e;
        public final DeliveryTooltip f;

        public OnDeliveryDriverDetails(String str, String str2, String str3, InsetBanner3 insetBanner3, LiveTrackingButton liveTrackingButton, DeliveryTooltip deliveryTooltip) {
            this.f19934a = str;
            this.b = str2;
            this.c = str3;
            this.d = insetBanner3;
            this.e = liveTrackingButton;
            this.f = deliveryTooltip;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryDriverDetails)) {
                return false;
            }
            OnDeliveryDriverDetails onDeliveryDriverDetails = (OnDeliveryDriverDetails) obj;
            return Intrinsics.c(this.f19934a, onDeliveryDriverDetails.f19934a) && Intrinsics.c(this.b, onDeliveryDriverDetails.b) && Intrinsics.c(this.c, onDeliveryDriverDetails.c) && Intrinsics.c(this.d, onDeliveryDriverDetails.d) && Intrinsics.c(this.e, onDeliveryDriverDetails.e) && Intrinsics.c(this.f, onDeliveryDriverDetails.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f19934a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            InsetBanner3 insetBanner3 = this.d;
            int iHashCode2 = (iHashCode + (insetBanner3 == null ? 0 : insetBanner3.hashCode())) * 31;
            LiveTrackingButton liveTrackingButton = this.e;
            int iHashCode3 = (iHashCode2 + (liveTrackingButton == null ? 0 : liveTrackingButton.hashCode())) * 31;
            DeliveryTooltip deliveryTooltip = this.f;
            return iHashCode3 + (deliveryTooltip != null ? deliveryTooltip.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnDeliveryDriverDetails(driverName=", this.f19934a, ", deliveryPartner=", this.b, ", iconUrl=");
            sbV.append(this.c);
            sbV.append(", insetBanner=");
            sbV.append(this.d);
            sbV.append(", liveTrackingButton=");
            sbV.append(this.e);
            sbV.append(", deliveryTooltip=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDeliveryOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDeliveryOrderFulfilmentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19935a;
        public final ArrayList b;
        public final DeliveryInstructions1 c;

        public OnDeliveryOrderFulfilmentDetails(String str, ArrayList arrayList, DeliveryInstructions1 deliveryInstructions1) {
            this.f19935a = str;
            this.b = arrayList;
            this.c = deliveryInstructions1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDeliveryOrderFulfilmentDetails)) {
                return false;
            }
            OnDeliveryOrderFulfilmentDetails onDeliveryOrderFulfilmentDetails = (OnDeliveryOrderFulfilmentDetails) obj;
            return this.f19935a.equals(onDeliveryOrderFulfilmentDetails.f19935a) && this.b.equals(onDeliveryOrderFulfilmentDetails.b) && Intrinsics.c(this.c, onDeliveryOrderFulfilmentDetails.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f19935a.hashCode() * 31, 31, this.b);
            DeliveryInstructions1 deliveryInstructions1 = this.c;
            return iB + (deliveryInstructions1 == null ? 0 : deliveryInstructions1.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnDeliveryOrderFulfilmentDetails(title=", this.f19935a, ", fulfilmentItems=", ", deliveryInstructions=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDriverRating;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDriverRating {

        /* renamed from: a, reason: collision with root package name */
        public final String f19936a;
        public final StarsRatingStep b;
        public final FeedbackAndCommentsStep c;
        public final ThankYouStep d;
        public final String e;

        public OnDriverRating(String str, StarsRatingStep starsRatingStep, FeedbackAndCommentsStep feedbackAndCommentsStep, ThankYouStep thankYouStep, String str2) {
            this.f19936a = str;
            this.b = starsRatingStep;
            this.c = feedbackAndCommentsStep;
            this.d = thankYouStep;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDriverRating)) {
                return false;
            }
            OnDriverRating onDriverRating = (OnDriverRating) obj;
            return Intrinsics.c(this.f19936a, onDriverRating.f19936a) && Intrinsics.c(this.b, onDriverRating.b) && Intrinsics.c(this.c, onDriverRating.c) && Intrinsics.c(this.d, onDriverRating.d) && Intrinsics.c(this.e, onDriverRating.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19936a.hashCode() * 31;
            StarsRatingStep starsRatingStep = this.b;
            int iHashCode2 = (iHashCode + (starsRatingStep == null ? 0 : starsRatingStep.hashCode())) * 31;
            FeedbackAndCommentsStep feedbackAndCommentsStep = this.c;
            int iHashCode3 = (iHashCode2 + (feedbackAndCommentsStep == null ? 0 : feedbackAndCommentsStep.hashCode())) * 31;
            ThankYouStep thankYouStep = this.d;
            return this.e.hashCode() + ((iHashCode3 + (thankYouStep != null ? thankYouStep.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDriverRating(surveyId=");
            sb.append(this.f19936a);
            sb.append(", starsRatingStep=");
            sb.append(this.b);
            sb.append(", feedbackAndCommentsStep=");
            sb.append(this.c);
            sb.append(", thankYouStep=");
            sb.append(this.d);
            sb.append(", orderNumber=");
            return a.o(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnHorizontalList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19937a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final String e;
        public final InsetBanner f;
        public final List g;

        public OnHorizontalList(String str, String str2, String str3, ArrayList arrayList, String str4, InsetBanner insetBanner, List list) {
            this.f19937a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = str4;
            this.f = insetBanner;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return this.f19937a.equals(onHorizontalList.f19937a) && Intrinsics.c(this.b, onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && this.d.equals(onHorizontalList.d) && this.e.equals(onHorizontalList.e) && Intrinsics.c(this.f, onHorizontalList.f) && Intrinsics.c(this.g, onHorizontalList.g);
        }

        public final int hashCode() {
            int iHashCode = this.f19937a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iC = b.c(androidx.compose.ui.input.pointer.a.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
            InsetBanner insetBanner = this.f;
            int iHashCode3 = (iC + (insetBanner == null ? 0 : insetBanner.hashCode())) * 31;
            List list = this.g;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnHorizontalList(title=", this.f19937a, ", subtitle=", this.b, ", actionTitle=");
            sbV.append(this.c);
            sbV.append(", items=");
            sbV.append(this.d);
            sbV.append(", __typename=");
            sbV.append(this.e);
            sbV.append(", insetBanner=");
            sbV.append(this.f);
            sbV.append(", badges=");
            return android.support.v4.media.session.a.t(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnHostedIcon;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19938a;

        public OnHostedIcon(String str) {
            this.f19938a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f19938a, ((OnHostedIcon) obj).f19938a);
        }

        public final int hashCode() {
            return this.f19938a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f19938a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnMyGroceriesProductListBadge;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyGroceriesProductListBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f19939a;
        public final MyGroceriesProductListBadgeType b;

        public OnMyGroceriesProductListBadge(String str, MyGroceriesProductListBadgeType myGroceriesProductListBadgeType) {
            this.f19939a = str;
            this.b = myGroceriesProductListBadgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyGroceriesProductListBadge)) {
                return false;
            }
            OnMyGroceriesProductListBadge onMyGroceriesProductListBadge = (OnMyGroceriesProductListBadge) obj;
            return Intrinsics.c(this.f19939a, onMyGroceriesProductListBadge.f19939a) && this.b == onMyGroceriesProductListBadge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19939a.hashCode() * 31);
        }

        public final String toString() {
            return "OnMyGroceriesProductListBadge(myGroceriesProductListBadgeLabel=" + this.f19939a + ", myGroceriesProductListBadgeType=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnMyWayPreferences;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyWayPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f19940a;
        public final String b;
        public final ArrayList c;
        public final String d;
        public final int e;
        public final ConfirmButton1 f;

        public OnMyWayPreferences(String str, String str2, ArrayList arrayList, String str3, int i, ConfirmButton1 confirmButton1) {
            this.f19940a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
            this.e = i;
            this.f = confirmButton1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyWayPreferences)) {
                return false;
            }
            OnMyWayPreferences onMyWayPreferences = (OnMyWayPreferences) obj;
            return this.f19940a.equals(onMyWayPreferences.f19940a) && this.b.equals(onMyWayPreferences.b) && this.c.equals(onMyWayPreferences.c) && this.d.equals(onMyWayPreferences.d) && this.e == onMyWayPreferences.e && this.f.equals(onMyWayPreferences.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.a(this.e, b.c(androidx.compose.ui.input.pointer.a.b(b.c(this.f19940a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnMyWayPreferences(title=", this.f19940a, ", subtitle=", this.b, ", eta=");
            sbV.append(this.c);
            sbV.append(", etaType=");
            sbV.append(this.d);
            sbV.append(", etaDefaultIndex=");
            sbV.append(this.e);
            sbV.append(", confirmButton=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderDetailsDivider;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderDetailsDivider {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f19941a;
        public final String b;

        public OnOrderDetailsDivider(String str, Boolean bool) {
            this.f19941a = bool;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderDetailsDivider)) {
                return false;
            }
            OnOrderDetailsDivider onOrderDetailsDivider = (OnOrderDetailsDivider) obj;
            return Intrinsics.c(this.f19941a, onOrderDetailsDivider.f19941a) && Intrinsics.c(this.b, onOrderDetailsDivider.b);
        }

        public final int hashCode() {
            Boolean bool = this.f19941a;
            return this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public final String toString() {
            return "OnOrderDetailsDivider(dummyField=" + this.f19941a + ", __typename=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderDetailsProductCard;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderDetailsProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final int f19942a;
        public final String b;
        public final String c;
        public final double d;
        public final String e;
        public final String f;
        public final String g;

        public OnOrderDetailsProductCard(int i, String str, String str2, double d, String str3, String str4, String str5) {
            this.f19942a = i;
            this.b = str;
            this.c = str2;
            this.d = d;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderDetailsProductCard)) {
                return false;
            }
            OnOrderDetailsProductCard onOrderDetailsProductCard = (OnOrderDetailsProductCard) obj;
            return this.f19942a == onOrderDetailsProductCard.f19942a && Intrinsics.c(this.b, onOrderDetailsProductCard.b) && Intrinsics.c(this.c, onOrderDetailsProductCard.c) && Double.compare(this.d, onOrderDetailsProductCard.d) == 0 && Intrinsics.c(this.e, onOrderDetailsProductCard.e) && Intrinsics.c(this.f, onOrderDetailsProductCard.f) && Intrinsics.c(this.g, onOrderDetailsProductCard.g);
        }

        public final int hashCode() {
            int iC = b.c(android.support.v4.media.session.a.a(this.d, b.c(b.c(Integer.hashCode(this.f19942a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
            String str = this.f;
            return this.g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("OnOrderDetailsProductCard(stockcode=", this.f19942a, ", name=", this.b, ", imagePath=");
            sbP.append(this.c);
            sbP.append(", quantity=");
            sbP.append(this.d);
            androidx.constraintlayout.core.state.a.B(sbP, ", salesPrice=", this.e, ", pricePerUnit=", this.f);
            return a.p(sbP, ", __typename=", this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderFulfilmentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19943a;
        public final ArrayList b;
        public final DeliveryInstructions c;

        public OnOrderFulfilmentDetails(String str, ArrayList arrayList, DeliveryInstructions deliveryInstructions) {
            this.f19943a = str;
            this.b = arrayList;
            this.c = deliveryInstructions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderFulfilmentDetails)) {
                return false;
            }
            OnOrderFulfilmentDetails onOrderFulfilmentDetails = (OnOrderFulfilmentDetails) obj;
            return this.f19943a.equals(onOrderFulfilmentDetails.f19943a) && this.b.equals(onOrderFulfilmentDetails.b) && Intrinsics.c(this.c, onOrderFulfilmentDetails.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f19943a.hashCode() * 31, 31, this.b);
            DeliveryInstructions deliveryInstructions = this.c;
            return iB + (deliveryInstructions == null ? 0 : deliveryInstructions.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnOrderFulfilmentDetails(title=", this.f19943a, ", fulfilmentItems=", ", deliveryInstructions=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderNumberDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderNumberDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19944a;
        public final String b;

        public OnOrderNumberDetails(String str, String str2) {
            this.f19944a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderNumberDetails)) {
                return false;
            }
            OnOrderNumberDetails onOrderNumberDetails = (OnOrderNumberDetails) obj;
            return Intrinsics.c(this.f19944a, onOrderNumberDetails.f19944a) && Intrinsics.c(this.b, onOrderNumberDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19944a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnOrderNumberDetails(title=", this.f19944a, ", orderNumber=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderPaymentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderPaymentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19945a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;
        public final ArrayList g;
        public final ArrayList h;
        public final String i;

        public OnOrderPaymentDetails(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, String str) {
            this.f19945a = arrayList;
            this.b = arrayList2;
            this.c = arrayList3;
            this.d = arrayList4;
            this.e = arrayList5;
            this.f = arrayList6;
            this.g = arrayList7;
            this.h = arrayList8;
            this.i = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderPaymentDetails)) {
                return false;
            }
            OnOrderPaymentDetails onOrderPaymentDetails = (OnOrderPaymentDetails) obj;
            return this.f19945a.equals(onOrderPaymentDetails.f19945a) && this.b.equals(onOrderPaymentDetails.b) && this.c.equals(onOrderPaymentDetails.c) && this.d.equals(onOrderPaymentDetails.d) && this.e.equals(onOrderPaymentDetails.e) && this.f.equals(onOrderPaymentDetails.f) && this.g.equals(onOrderPaymentDetails.g) && this.h.equals(onOrderPaymentDetails.h) && Intrinsics.c(this.i, onOrderPaymentDetails.i);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f19945a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            String str = this.i;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnOrderPaymentDetails(total=");
            sb.append(this.f19945a);
            sb.append(", subTotal=");
            sb.append(this.b);
            sb.append(", marketSubtotal=");
            sb.append(this.c);
            sb.append(", paymentMethods=");
            sb.append(this.d);
            sb.append(", discounts=");
            sb.append(this.e);
            sb.append(", savingsAndRewards=");
            sb.append(this.f);
            sb.append(", refunds=");
            sb.append(this.g);
            sb.append(", refundTotal=");
            sb.append(this.h);
            sb.append(", disclaimer=");
            return a.o(sb, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderProofOfDeliveryDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderProofOfDeliveryDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19946a;
        public final InsetBanner1 b;
        public final String c;
        public final String d;

        public OnOrderProofOfDeliveryDetails(String str, InsetBanner1 insetBanner1, String str2, String str3) {
            this.f19946a = str;
            this.b = insetBanner1;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderProofOfDeliveryDetails)) {
                return false;
            }
            OnOrderProofOfDeliveryDetails onOrderProofOfDeliveryDetails = (OnOrderProofOfDeliveryDetails) obj;
            return Intrinsics.c(this.f19946a, onOrderProofOfDeliveryDetails.f19946a) && Intrinsics.c(this.b, onOrderProofOfDeliveryDetails.b) && Intrinsics.c(this.c, onOrderProofOfDeliveryDetails.c) && Intrinsics.c(this.d, onOrderProofOfDeliveryDetails.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19946a.hashCode() * 31;
            InsetBanner1 insetBanner1 = this.b;
            int iHashCode2 = (iHashCode + (insetBanner1 == null ? 0 : insetBanner1.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnOrderProofOfDeliveryDetails(title=");
            sb.append(this.f19946a);
            sb.append(", insetBanner=");
            sb.append(this.b);
            sb.append(", imageUrl=");
            return androidx.constraintlayout.core.state.a.l(sb, this.c, ", footnote=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnPastOrderOverview;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPastOrderOverview {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBanner2 f19947a;
        public final OrderDetailsStatus b;
        public final OrderTime c;
        public final OrderDetailSummary d;
        public final ChangeOrderButton e;
        public final CancelOrderButton f;
        public final ViewInvoiceButton g;
        public final String h;
        public final String i;

        public OnPastOrderOverview(InsetBanner2 insetBanner2, OrderDetailsStatus orderDetailsStatus, OrderTime orderTime, OrderDetailSummary orderDetailSummary, ChangeOrderButton changeOrderButton, CancelOrderButton cancelOrderButton, ViewInvoiceButton viewInvoiceButton, String str, String str2) {
            this.f19947a = insetBanner2;
            this.b = orderDetailsStatus;
            this.c = orderTime;
            this.d = orderDetailSummary;
            this.e = changeOrderButton;
            this.f = cancelOrderButton;
            this.g = viewInvoiceButton;
            this.h = str;
            this.i = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPastOrderOverview)) {
                return false;
            }
            OnPastOrderOverview onPastOrderOverview = (OnPastOrderOverview) obj;
            return Intrinsics.c(this.f19947a, onPastOrderOverview.f19947a) && Intrinsics.c(this.b, onPastOrderOverview.b) && Intrinsics.c(this.c, onPastOrderOverview.c) && Intrinsics.c(this.d, onPastOrderOverview.d) && Intrinsics.c(this.e, onPastOrderOverview.e) && Intrinsics.c(this.f, onPastOrderOverview.f) && Intrinsics.c(this.g, onPastOrderOverview.g) && Intrinsics.c(this.h, onPastOrderOverview.h) && Intrinsics.c(this.i, onPastOrderOverview.i);
        }

        public final int hashCode() {
            InsetBanner2 insetBanner2 = this.f19947a;
            int iHashCode = (this.b.hashCode() + ((insetBanner2 == null ? 0 : insetBanner2.hashCode()) * 31)) * 31;
            OrderTime orderTime = this.c;
            int iHashCode2 = (iHashCode + (orderTime == null ? 0 : orderTime.hashCode())) * 31;
            OrderDetailSummary orderDetailSummary = this.d;
            int iHashCode3 = (iHashCode2 + (orderDetailSummary == null ? 0 : orderDetailSummary.hashCode())) * 31;
            ChangeOrderButton changeOrderButton = this.e;
            int iHashCode4 = (iHashCode3 + (changeOrderButton == null ? 0 : changeOrderButton.hashCode())) * 31;
            CancelOrderButton cancelOrderButton = this.f;
            int iHashCode5 = (iHashCode4 + (cancelOrderButton == null ? 0 : cancelOrderButton.hashCode())) * 31;
            ViewInvoiceButton viewInvoiceButton = this.g;
            int iHashCode6 = (iHashCode5 + (viewInvoiceButton == null ? 0 : viewInvoiceButton.hashCode())) * 31;
            String str = this.h;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.i;
            return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPastOrderOverview(insetBanner=");
            sb.append(this.f19947a);
            sb.append(", orderDetailsStatus=");
            sb.append(this.b);
            sb.append(", orderTime=");
            sb.append(this.c);
            sb.append(", orderDetailSummary=");
            sb.append(this.d);
            sb.append(", changeOrderButton=");
            sb.append(this.e);
            sb.append(", cancelOrderButton=");
            sb.append(this.f);
            sb.append(", viewInvoiceButton=");
            sb.append(this.g);
            sb.append(", instructionsMd=");
            sb.append(this.h);
            sb.append(", helpMd=");
            return a.o(sb, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnPastPickupOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPastPickupOrderFulfilmentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19948a;
        public final String b;

        public OnPastPickupOrderFulfilmentDetails(String str, ArrayList arrayList) {
            this.f19948a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPastPickupOrderFulfilmentDetails)) {
                return false;
            }
            OnPastPickupOrderFulfilmentDetails onPastPickupOrderFulfilmentDetails = (OnPastPickupOrderFulfilmentDetails) obj;
            return this.f19948a.equals(onPastPickupOrderFulfilmentDetails.f19948a) && this.b.equals(onPastPickupOrderFulfilmentDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19948a.hashCode() * 31);
        }

        public final String toString() {
            return "OnPastPickupOrderFulfilmentDetails(fulfilmentItems=" + this.f19948a + ", title=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderDetailSummary;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderDetailSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f19949a;
        public final String b;

        public OrderDetailSummary(String str, String str2) {
            this.f19949a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDetailSummary)) {
                return false;
            }
            OrderDetailSummary orderDetailSummary = (OrderDetailSummary) obj;
            return Intrinsics.c(this.f19949a, orderDetailSummary.f19949a) && Intrinsics.c(this.b, orderDetailSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19949a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OrderDetailSummary(orderNumber=", this.f19949a, ", orderedDate=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderDetailsStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderDetailsStatus {

        /* renamed from: a, reason: collision with root package name */
        public final OrderStatusType f19950a;
        public final String b;

        public OrderDetailsStatus(OrderStatusType orderStatusType, String str) {
            this.f19950a = orderStatusType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDetailsStatus)) {
                return false;
            }
            OrderDetailsStatus orderDetailsStatus = (OrderDetailsStatus) obj;
            return this.f19950a == orderDetailsStatus.f19950a && Intrinsics.c(this.b, orderDetailsStatus.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19950a.hashCode() * 31);
        }

        public final String toString() {
            return "OrderDetailsStatus(status=" + this.f19950a + ", label=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderSummary;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderSummary {

        /* renamed from: a, reason: collision with root package name */
        public final int f19951a;
        public final HelpList b;
        public final Feed c;
        public final CancelWarning d;
        public final EditOrderWarning e;
        public final OrderFulfilmentType f;
        public final String g;
        public final String h;
        public final boolean i;
        public final OrderStatusType j;

        public OrderSummary(int i, HelpList helpList, Feed feed, CancelWarning cancelWarning, EditOrderWarning editOrderWarning, OrderFulfilmentType orderFulfilmentType, String str, String str2, boolean z, OrderStatusType orderStatusType) {
            this.f19951a = i;
            this.b = helpList;
            this.c = feed;
            this.d = cancelWarning;
            this.e = editOrderWarning;
            this.f = orderFulfilmentType;
            this.g = str;
            this.h = str2;
            this.i = z;
            this.j = orderStatusType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSummary)) {
                return false;
            }
            OrderSummary orderSummary = (OrderSummary) obj;
            return this.f19951a == orderSummary.f19951a && Intrinsics.c(this.b, orderSummary.b) && Intrinsics.c(this.c, orderSummary.c) && Intrinsics.c(this.d, orderSummary.d) && Intrinsics.c(this.e, orderSummary.e) && this.f == orderSummary.f && Intrinsics.c(this.g, orderSummary.g) && Intrinsics.c(this.h, orderSummary.h) && this.i == orderSummary.i && this.j == orderSummary.j;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f19951a) * 31;
            HelpList helpList = this.b;
            return this.j.hashCode() + b.e(b.c(b.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (helpList == null ? 0 : helpList.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderSummary(orderId=");
            sb.append(this.f19951a);
            sb.append(", helpList=");
            sb.append(this.b);
            sb.append(", feed=");
            sb.append(this.c);
            sb.append(", cancelWarning=");
            sb.append(this.d);
            sb.append(", editOrderWarning=");
            sb.append(this.e);
            sb.append(", fulfilmentMethod=");
            sb.append(this.f);
            sb.append(", progress=");
            androidx.constraintlayout.core.state.a.B(sb, this.g, ", progressDetail=", this.h, ", showDelightAnimation=");
            sb.append(this.i);
            sb.append(", status=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderTime;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderTime {

        /* renamed from: a, reason: collision with root package name */
        public final String f19952a;
        public final String b;

        public OrderTime(String str, String str2) {
            this.f19952a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderTime)) {
                return false;
            }
            OrderTime orderTime = (OrderTime) obj;
            return Intrinsics.c(this.f19952a, orderTime.f19952a) && Intrinsics.c(this.b, orderTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19952a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OrderTime(title=", this.f19952a, ", time=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ParkingDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ParkingDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19953a;
        public final ArrayList b;

        public ParkingDetails(String str, ArrayList arrayList) {
            this.f19953a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParkingDetails)) {
                return false;
            }
            ParkingDetails parkingDetails = (ParkingDetails) obj;
            return Intrinsics.c(this.f19953a, parkingDetails.f19953a) && this.b.equals(parkingDetails.b);
        }

        public final int hashCode() {
            String str = this.f19953a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("ParkingDetails(parkingMapUrl=", this.f19953a, ", parkingDirections=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$PaymentMethod;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f19954a;
        public final String b;
        public final String c;
        public final String d;

        public PaymentMethod(String str, String str2, String str3, String str4) {
            this.f19954a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.c(this.f19954a, paymentMethod.f19954a) && Intrinsics.c(this.b, paymentMethod.b) && Intrinsics.c(this.c, paymentMethod.c) && Intrinsics.c(this.d, paymentMethod.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19954a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("PaymentMethod(title=", this.f19954a, ", icon=", this.b, ", amount="), this.c, ", __typename=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepper;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressStepper {

        /* renamed from: a, reason: collision with root package name */
        public final String f19955a;
        public final int b;
        public final ProgressStepType c;
        public final int d;
        public final TooltipType e;

        public ProgressStepper(String str, int i, ProgressStepType progressStepType, int i2, TooltipType tooltipType) {
            this.f19955a = str;
            this.b = i;
            this.c = progressStepType;
            this.d = i2;
            this.e = tooltipType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressStepper)) {
                return false;
            }
            ProgressStepper progressStepper = (ProgressStepper) obj;
            return Intrinsics.c(this.f19955a, progressStepper.f19955a) && this.b == progressStepper.b && this.c == progressStepper.c && this.d == progressStepper.d && this.e == progressStepper.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.f19955a.hashCode() * 31, 31)) * 31, 31);
            TooltipType tooltipType = this.e;
            return iA + (tooltipType == null ? 0 : tooltipType.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("ProgressStepper(currentStep=", this.b, this.f19955a, ", totalSteps=", ", currentStepType=");
            sbU.append(this.c);
            sbU.append(", currentStepPosition=");
            sbU.append(this.d);
            sbU.append(", imageName=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepper1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressStepper1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19956a;
        public final int b;
        public final ProgressStepType c;
        public final int d;

        public ProgressStepper1(String str, int i, ProgressStepType progressStepType, int i2) {
            this.f19956a = str;
            this.b = i;
            this.c = progressStepType;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressStepper1)) {
                return false;
            }
            ProgressStepper1 progressStepper1 = (ProgressStepper1) obj;
            return Intrinsics.c(this.f19956a, progressStepper1.f19956a) && this.b == progressStepper1.b && this.c == progressStepper1.c && this.d == progressStepper1.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ((this.c.hashCode() + b.a(this.b, this.f19956a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbU = b.u("ProgressStepper1(currentStep=", this.b, this.f19956a, ", totalSteps=", ", currentStepType=");
            sbU.append(this.c);
            sbU.append(", currentStepPosition=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepperForCollectedState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressStepperForCollectedState {

        /* renamed from: a, reason: collision with root package name */
        public final String f19957a;
        public final int b;
        public final ProgressStepType c;
        public final int d;
        public final TooltipType e;

        public ProgressStepperForCollectedState(String str, int i, ProgressStepType progressStepType, int i2, TooltipType tooltipType) {
            this.f19957a = str;
            this.b = i;
            this.c = progressStepType;
            this.d = i2;
            this.e = tooltipType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressStepperForCollectedState)) {
                return false;
            }
            ProgressStepperForCollectedState progressStepperForCollectedState = (ProgressStepperForCollectedState) obj;
            return Intrinsics.c(this.f19957a, progressStepperForCollectedState.f19957a) && this.b == progressStepperForCollectedState.b && this.c == progressStepperForCollectedState.c && this.d == progressStepperForCollectedState.d && this.e == progressStepperForCollectedState.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, (this.c.hashCode() + b.a(this.b, this.f19957a.hashCode() * 31, 31)) * 31, 31);
            TooltipType tooltipType = this.e;
            return iA + (tooltipType == null ? 0 : tooltipType.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("ProgressStepperForCollectedState(currentStep=", this.b, this.f19957a, ", totalSteps=", ", currentStepType=");
            sbU.append(this.c);
            sbU.append(", currentStepPosition=");
            sbU.append(this.d);
            sbU.append(", imageName=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Rationale;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rationale {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19958a;
        public final LocationImage b;
        public final String c;

        public Rationale(boolean z, LocationImage locationImage, String str) {
            this.f19958a = z;
            this.b = locationImage;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rationale)) {
                return false;
            }
            Rationale rationale = (Rationale) obj;
            return this.f19958a == rationale.f19958a && this.b == rationale.b && Intrinsics.c(this.c, rationale.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f19958a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rationale(applyBackground=");
            sb.append(this.f19958a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", textMd=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Rationale1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rationale1 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19959a;
        public final LocationImage b;
        public final String c;

        public Rationale1(boolean z, LocationImage locationImage, String str) {
            this.f19959a = z;
            this.b = locationImage;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rationale1)) {
                return false;
            }
            Rationale1 rationale1 = (Rationale1) obj;
            return this.f19959a == rationale1.f19959a && this.b == rationale1.b && Intrinsics.c(this.c, rationale1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f19959a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rationale1(applyBackground=");
            sb.append(this.f19959a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", textMd=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Refund;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Refund {

        /* renamed from: a, reason: collision with root package name */
        public final String f19960a;
        public final OrderPaymentDetailsItemAmountStyle b;
        public final String c;

        public Refund(String str, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle, String str2) {
            this.f19960a = str;
            this.b = orderPaymentDetailsItemAmountStyle;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj;
            return Intrinsics.c(this.f19960a, refund.f19960a) && this.b == refund.b && Intrinsics.c(this.c, refund.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19960a.hashCode() * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.b;
            return this.c.hashCode() + ((iHashCode + (orderPaymentDetailsItemAmountStyle == null ? 0 : orderPaymentDetailsItemAmountStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Refund(amount=");
            sb.append(this.f19960a);
            sb.append(", amountStyle=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$RefundTotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefundTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f19961a;
        public final OrderPaymentDetailsItemAmountStyle b;
        public final String c;

        public RefundTotal(String str, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle, String str2) {
            this.f19961a = str;
            this.b = orderPaymentDetailsItemAmountStyle;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefundTotal)) {
                return false;
            }
            RefundTotal refundTotal = (RefundTotal) obj;
            return Intrinsics.c(this.f19961a, refundTotal.f19961a) && this.b == refundTotal.b && Intrinsics.c(this.c, refundTotal.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19961a.hashCode() * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.b;
            return this.c.hashCode() + ((iHashCode + (orderPaymentDetailsItemAmountStyle == null ? 0 : orderPaymentDetailsItemAmountStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RefundTotal(amount=");
            sb.append(this.f19961a);
            sb.append(", amountStyle=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SavingsAndReward;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavingsAndReward {

        /* renamed from: a, reason: collision with root package name */
        public final String f19962a;
        public final String b;
        public final String c;
        public final OrderPaymentDetailsItemAmountStyle d;

        public SavingsAndReward(String str, String str2, String str3, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle) {
            this.f19962a = str;
            this.b = str2;
            this.c = str3;
            this.d = orderPaymentDetailsItemAmountStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsAndReward)) {
                return false;
            }
            SavingsAndReward savingsAndReward = (SavingsAndReward) obj;
            return Intrinsics.c(this.f19962a, savingsAndReward.f19962a) && Intrinsics.c(this.b, savingsAndReward.b) && Intrinsics.c(this.c, savingsAndReward.c) && this.d == savingsAndReward.d;
        }

        public final int hashCode() {
            int iC = b.c(this.f19962a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.d;
            return iHashCode + (orderPaymentDetailsItemAmountStyle != null ? orderPaymentDetailsItemAmountStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("SavingsAndReward(title=", this.f19962a, ", amount=", this.b, ", amountIcon=");
            sbV.append(this.c);
            sbV.append(", amountStyle=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StarsRatingStep;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StarsRatingStep {

        /* renamed from: a, reason: collision with root package name */
        public final String f19963a;
        public final String b;
        public final String c;
        public final InsetAlert d;
        public final SubmitButton e;

        public StarsRatingStep(String str, String str2, String str3, InsetAlert insetAlert, SubmitButton submitButton) {
            this.f19963a = str;
            this.b = str2;
            this.c = str3;
            this.d = insetAlert;
            this.e = submitButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StarsRatingStep)) {
                return false;
            }
            StarsRatingStep starsRatingStep = (StarsRatingStep) obj;
            return Intrinsics.c(this.f19963a, starsRatingStep.f19963a) && Intrinsics.c(this.b, starsRatingStep.b) && Intrinsics.c(this.c, starsRatingStep.c) && Intrinsics.c(this.d, starsRatingStep.d) && Intrinsics.c(this.e, starsRatingStep.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + b.c(b.c(this.f19963a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("StarsRatingStep(title=", this.f19963a, ", subTitle=", this.b, ", starsRatingQuestion=");
            sbV.append(this.c);
            sbV.append(", insetAlert=");
            sbV.append(this.d);
            sbV.append(", submitButton=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StepInfoList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StepInfoList {

        /* renamed from: a, reason: collision with root package name */
        public final int f19964a;
        public final boolean b;
        public final Boolean c;
        public final String d;
        public final String e;
        public final String f;

        public StepInfoList(int i, boolean z, Boolean bool, String str, String str2, String str3) {
            this.f19964a = i;
            this.b = z;
            this.c = bool;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepInfoList)) {
                return false;
            }
            StepInfoList stepInfoList = (StepInfoList) obj;
            return this.f19964a == stepInfoList.f19964a && this.b == stepInfoList.b && Intrinsics.c(this.c, stepInfoList.c) && Intrinsics.c(this.d, stepInfoList.d) && Intrinsics.c(this.e, stepInfoList.e) && Intrinsics.c(this.f, stepInfoList.f);
        }

        public final int hashCode() {
            int iE = b.e(Integer.hashCode(this.f19964a) * 31, 31, this.b);
            Boolean bool = this.c;
            int iC = b.c((iE + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StepInfoList(number=");
            sb.append(this.f19964a);
            sb.append(", isCompleted=");
            sb.append(this.b);
            sb.append(", isNextProgressed=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", description=");
            return androidx.constraintlayout.core.state.a.l(sb, this.e, ", stepIconUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StepInfoList1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StepInfoList1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f19965a;
        public final boolean b;
        public final Boolean c;
        public final String d;
        public final String e;
        public final String f;

        public StepInfoList1(int i, boolean z, Boolean bool, String str, String str2, String str3) {
            this.f19965a = i;
            this.b = z;
            this.c = bool;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepInfoList1)) {
                return false;
            }
            StepInfoList1 stepInfoList1 = (StepInfoList1) obj;
            return this.f19965a == stepInfoList1.f19965a && this.b == stepInfoList1.b && Intrinsics.c(this.c, stepInfoList1.c) && Intrinsics.c(this.d, stepInfoList1.d) && Intrinsics.c(this.e, stepInfoList1.e) && Intrinsics.c(this.f, stepInfoList1.f);
        }

        public final int hashCode() {
            int iE = b.e(Integer.hashCode(this.f19965a) * 31, 31, this.b);
            Boolean bool = this.c;
            int iC = b.c((iE + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StepInfoList1(number=");
            sb.append(this.f19965a);
            sb.append(", isCompleted=");
            sb.append(this.b);
            sb.append(", isNextProgressed=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", description=");
            return androidx.constraintlayout.core.state.a.l(sb, this.e, ", stepIconUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StoreDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19966a;
        public final String b;
        public final String c;

        public StoreDetails(String str, String str2, String str3) {
            this.f19966a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreDetails)) {
                return false;
            }
            StoreDetails storeDetails = (StoreDetails) obj;
            return Intrinsics.c(this.f19966a, storeDetails.f19966a) && Intrinsics.c(this.b, storeDetails.b) && Intrinsics.c(this.c, storeDetails.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19966a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("StoreDetails(storeName=", this.f19966a, ", storeAddress=", this.b, ", actionPath="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SubTotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f19967a;
        public final String b;
        public final String c;

        public SubTotal(String str, String str2, String str3) {
            this.f19967a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubTotal)) {
                return false;
            }
            SubTotal subTotal = (SubTotal) obj;
            return Intrinsics.c(this.f19967a, subTotal.f19967a) && Intrinsics.c(this.b, subTotal.b) && Intrinsics.c(this.c, subTotal.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19967a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("SubTotal(title=", this.f19967a, ", amount=", this.b, ", __typename="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SubmitButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubmitButton {

        /* renamed from: a, reason: collision with root package name */
        public final CoreButtonStyle f19968a;
        public final String b;
        public final CoreButtonAction c;
        public final boolean d;

        public SubmitButton(CoreButtonStyle coreButtonStyle, String str, CoreButtonAction coreButtonAction, boolean z) {
            this.f19968a = coreButtonStyle;
            this.b = str;
            this.c = coreButtonAction;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) obj;
            return this.f19968a == submitButton.f19968a && Intrinsics.c(this.b, submitButton.b) && Intrinsics.c(this.c, submitButton.c) && this.d == submitButton.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.c(this.f19968a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "SubmitButton(coreButtonStyle=" + this.f19968a + ", coreButtonLabel=" + this.b + ", coreButtonAction=" + this.c + ", coreButtonEnabled=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Text;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        /* renamed from: a, reason: collision with root package name */
        public final String f19969a;
        public final String b;

        public Text(String str, String str2) {
            this.f19969a = str;
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
            return Intrinsics.c(this.f19969a, text.f19969a) && Intrinsics.c(this.b, text.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19969a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Text(text=", this.f19969a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ThankYouStep;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThankYouStep {

        /* renamed from: a, reason: collision with root package name */
        public final String f19970a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final BadFeedbackButton f;
        public final String g;
        public final String h;

        public ThankYouStep(String str, String str2, String str3, String str4, String str5, BadFeedbackButton badFeedbackButton, String str6, String str7) {
            this.f19970a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = badFeedbackButton;
            this.g = str6;
            this.h = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThankYouStep)) {
                return false;
            }
            ThankYouStep thankYouStep = (ThankYouStep) obj;
            return Intrinsics.c(this.f19970a, thankYouStep.f19970a) && Intrinsics.c(this.b, thankYouStep.b) && Intrinsics.c(this.c, thankYouStep.c) && Intrinsics.c(this.d, thankYouStep.d) && Intrinsics.c(this.e, thankYouStep.e) && Intrinsics.c(this.f, thankYouStep.f) && Intrinsics.c(this.g, thankYouStep.g) && Intrinsics.c(this.h, thankYouStep.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.c((this.f.hashCode() + b.c(b.c(b.c(b.c(this.f19970a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ThankYouStep(title=", this.f19970a, ", subTitle=", this.b, ", imageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", badFeedbackMessage=", this.d, ", badFeedbackQuestion=");
            sbV.append(this.e);
            sbV.append(", badFeedbackButton=");
            sbV.append(this.f);
            sbV.append(", neutralFeedbackMessage=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.g, ", goodFeedbackMessage=", this.h, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Tooltip;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tooltip {

        /* renamed from: a, reason: collision with root package name */
        public final String f19971a;
        public final ArrayList b;

        public Tooltip(String str, ArrayList arrayList) {
            this.f19971a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) obj;
            return this.f19971a.equals(tooltip.f19971a) && this.b.equals(tooltip.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19971a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Tooltip(message=", this.f19971a, ", stepInfoList=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Tooltip1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tooltip1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19972a;
        public final ArrayList b;

        public Tooltip1(String str, ArrayList arrayList) {
            this.f19972a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tooltip1)) {
                return false;
            }
            Tooltip1 tooltip1 = (Tooltip1) obj;
            return this.f19972a.equals(tooltip1.f19972a) && this.b.equals(tooltip1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19972a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Tooltip1(message=", this.f19972a, ", stepInfoList=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Total;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Total {

        /* renamed from: a, reason: collision with root package name */
        public final String f19973a;
        public final String b;
        public final String c;

        public Total(String str, String str2, String str3) {
            this.f19973a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            return Intrinsics.c(this.f19973a, total.f19973a) && Intrinsics.c(this.b, total.b) && Intrinsics.c(this.c, total.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19973a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Total(title=", this.f19973a, ", amount=", this.b, ", __typename="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ViewInvoiceButton;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewInvoiceButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19974a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public ViewInvoiceButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f19974a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewInvoiceButton)) {
                return false;
            }
            ViewInvoiceButton viewInvoiceButton = (ViewInvoiceButton) obj;
            return Intrinsics.c(this.f19974a, viewInvoiceButton.f19974a) && Intrinsics.c(this.b, viewInvoiceButton.b) && this.c == viewInvoiceButton.c && this.d == viewInvoiceButton.d;
        }

        public final int hashCode() {
            int iHashCode = this.f19974a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("ViewInvoiceButton(label=", this.f19974a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$WarningItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WarningItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19975a;

        public WarningItem(String str) {
            this.f19975a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WarningItem) && Intrinsics.c(this.f19975a, ((WarningItem) obj).f19975a);
        }

        public final int hashCode() {
            return this.f19975a.hashCode();
        }

        public final String toString() {
            return a.h("WarningItem(text=", this.f19975a, ")");
        }
    }

    public GetOrderSummaryQuery(String orderId, Optional optional, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intrinsics.h(orderId, "orderId");
        this.f19863a = orderId;
        this.b = optional;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetOrderSummaryQuery_ResponseAdapter.Data.f20065a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query getOrderSummary($orderId: ID!, $callerState: CallerState, $includeDeliveryMethods: Boolean!, $includeDriverRating: Boolean!, $includeProgressStepperCollectedState: Boolean!, $includeFleetLiveTracking: Boolean!, $includeP2PLiveTracking: Boolean!, $includeHandoverBanner: Boolean!, $includeOrderYourGroceriesRedesign: Boolean!, $includeSpiltOrderFulfilmentDetails: Boolean!, $includeStatusTimelineRedesign: Boolean!, $includeOrderDetailsChangeMyOrderUplift: Boolean!, $includeAsyncChat: Boolean!) { orderSummary(orderId: $orderId, callerState: $callerState) { orderId helpList: help { items { iconUrl title subtitle url itemType } imageUrl @include(if: $includeAsyncChat) helpTitle @include(if: $includeAsyncChat) helpItems @include(if: $includeAsyncChat) { iconUrl title subtitle url itemType } contactTimes @include(if: $includeAsyncChat) { title subTitle contactItems { day time } } } feed { __typename items { __typename ... on OrderDetailsDivider { dummyField: _ __typename } ... on OrderPaymentDetails { total { title amount __typename } subTotal { title amount __typename } marketSubtotal { title amount __typename } paymentMethods { title icon amount __typename } discounts { title amount } savingsAndRewards { title amount amountIcon amountStyle } refunds { amount amountStyle title } refundTotal { amount amountStyle title } disclaimer } ... on HorizontalList { title subtitle actionTitle items { __typename ... on OrderDetailsProductCard { stockcode name imagePath quantity salesPrice pricePerUnit __typename } } __typename insetBanner { message action { placement type label } displayType analytics { eventLabel } } badges @include(if: $includeOrderYourGroceriesRedesign) { __typename ... on MyGroceriesProductListBadge { myGroceriesProductListBadgeLabel myGroceriesProductListBadgeType } } } ... on OrderProofOfDeliveryDetails { title insetBanner { message displayType } imageUrl footnote } ... on CurrentPickupOrderFulfilmentDetails { storeDetails { storeName storeAddress actionPath } collectionDetails { fulfillmentLabel fulfillmentType actionTitle parkingDetails { parkingMapUrl parkingDirections } } } ... on CurrentPickupLocationTrackingStatus { __typename title description image } ... on OrderFulfilmentDetails @skip(if: $includeSpiltOrderFulfilmentDetails) { title fulfilmentItems { title subtitle } deliveryInstructions { leaveUnattended leaveUnattendedTitle hideLeaveUnattended leaveUnattendedMessage driverInstructions driverInstructionsTitle canToggleLeaveUnattended canEditInstructions } } ... on PastPickupOrderFulfilmentDetails @include(if: $includeSpiltOrderFulfilmentDetails) { fulfilmentItems { title subtitle } title } ... on DeliveryOrderFulfilmentDetails @include(if: $includeSpiltOrderFulfilmentDetails) { title fulfilmentItems { title subtitle } deliveryInstructions { leaveUnattended leaveUnattendedTitle hideLeaveUnattended leaveUnattendedMessage driverInstructions driverInstructionsTitle canToggleLeaveUnattended canEditInstructions } } ... on PastOrderOverview { insetBanner { displayType message bannerTitle: title } orderDetailsStatus { status label } orderTime { title time } orderDetailSummary { orderNumber orderedDate } changeOrderButton { label action style enabled } cancelOrderButton { label action style enabled } viewInvoiceButton { label action style enabled } instructionsMd helpMd } ... on CurrentPickupOrderOverview { progressStepper { currentStep totalSteps currentStepType currentStepPosition imageName } progressStepperForCollectedState @include(if: $includeProgressStepperCollectedState) { currentStep totalSteps currentStepType currentStepPosition imageName } tooltip { message stepInfoList { number isCompleted isNextProgressed title description stepIconUrl @include(if: $includeStatusTimelineRedesign) } } orderTitle orderSubtitle orderSubtitleIcon instructionsMd helpMd changeOrderButton { label action style enabled } cancelOrderButton { label action style enabled } checkInNowButton { label action style enabled } collectionBanner { displayType message bannerTitle: title } bayNumberPreferences { title subtitle bayNumber confirmButton { label action style enabled } bayNumberUnknownButton { label action style enabled } } checkInOnMyWayButton { label action style enabled } onMyWayPreferences { title subtitle eta etaType etaDefaultIndex confirmButton { label action style enabled } } locationTrackingEnabled locationTrackingPrimingPage { locationPermissionsWereNotSet { header rationales { applyBackground image textMd } locationPermissionButtons { label action style enabled } footer } doNotAllowWasSetEarlier { header rationales { applyBackground image textMd } locationPermissionButtons { label action style enabled } footer } } banner { title subtitle type dismissible bannerId imageUrl } handoverBanner @include(if: $includeHandoverBanner) { title subtitle type dismissible bannerId imageUrl } } ... on OrderNumberDetails { title orderNumber } ... on DeliveryDriverDetails { driverName deliveryPartner iconUrl insetBanner { message iconUrl displayType bannerTitle: title analytics { eventLabel extraContent { key value } } } liveTrackingButton @include(if: $includeFleetLiveTracking) { label enabled url } deliveryTooltip @include(if: $includeDeliveryMethods) { title message deliveryMethodsTabs { title imageUrl description bulletInfoList { text } driverRatingBanner @include(if: $includeDriverRating) { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } broadcastBannerDismissible } } } } ... on CurrentDeliveryOrderOverview { insetBanners { displayType message bannerTitle: title analytics { eventLabel extraContent { key value } } } bannerAnalyticLabels changeOrderButton { label action style enabled } cancelOrderButton { label action style enabled } progressStepper { currentStep totalSteps currentStepType currentStepPosition } tooltip { message stepInfoList { number isCompleted isNextProgressed title description stepIconUrl @include(if: $includeStatusTimelineRedesign) } } instructionsMd helpMd orderSubtitle orderTitle orderSubtitleIcon liveTrackingMapUrl @include(if: $includeP2PLiveTracking) } ... on DriverRating @include(if: $includeDriverRating) { surveyId starsRatingStep { title subTitle starsRatingQuestion insetAlert { style description title } submitButton { coreButtonStyle coreButtonLabel coreButtonAction { type action } coreButtonEnabled } } feedbackAndCommentsStep { title subTitle feedbackChipsQuestion feedbackChips { id isSelected text { text altText } } additionalCommentText doneButton { coreButtonStyle coreButtonLabel coreButtonAction { type action } coreButtonEnabled } } thankYouStep { title subTitle imageUrl badFeedbackMessage badFeedbackQuestion badFeedbackButton { coreButtonStyle coreButtonLabel coreButtonAction { type action } coreButtonEnabled } neutralFeedbackMessage goodFeedbackMessage } orderNumber } } } cancelWarning { title subtitle message } editOrderWarning { imageUrl title warningItems { text } acceptLabel acceptButtonLabel cancelButtonLabel disclaimer @include(if: $includeOrderDetailsChangeMyOrderUplift) } fulfilmentMethod progress progressDetail showDelightAnimation status } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOrderSummaryQuery)) {
            return false;
        }
        GetOrderSummaryQuery getOrderSummaryQuery = (GetOrderSummaryQuery) obj;
        return Intrinsics.c(this.f19863a, getOrderSummaryQuery.f19863a) && Intrinsics.c(this.b, getOrderSummaryQuery.b) && this.c == getOrderSummaryQuery.c && this.d == getOrderSummaryQuery.d && this.e == getOrderSummaryQuery.e && this.f == getOrderSummaryQuery.f && this.g == getOrderSummaryQuery.g && this.h == getOrderSummaryQuery.h && this.i == getOrderSummaryQuery.i && this.j == getOrderSummaryQuery.j && this.k == getOrderSummaryQuery.k && this.l == getOrderSummaryQuery.l && this.m == getOrderSummaryQuery.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f19863a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "209cb62ef366e7b78933730153bc601a652d6e06a71459e3c4bdfcbe6523416b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "getOrderSummary";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f19863a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("callerState");
            Adapters.d(Adapters.b(Adapters.c(CallerState_InputAdapter.f12041a, false))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("includeDeliveryMethods");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeDriverRating");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeProgressStepperCollectedState");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeFleetLiveTracking");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeP2PLiveTracking");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeHandoverBanner");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOrderYourGroceriesRedesign");
        d.B(this.i, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeSpiltOrderFulfilmentDetails");
        d.B(this.j, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeStatusTimelineRedesign");
        d.B(this.k, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOrderDetailsChangeMyOrderUplift");
        d.B(this.l, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeAsyncChat");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.m));
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("GetOrderSummaryQuery(orderId=", this.f19863a, ", callerState=", this.b, ", includeDeliveryMethods=");
        au.com.woolworths.android.onesite.a.D(sbR, this.c, ", includeDriverRating=", this.d, ", includeProgressStepperCollectedState=");
        au.com.woolworths.android.onesite.a.D(sbR, this.e, ", includeFleetLiveTracking=", this.f, ", includeP2PLiveTracking=");
        au.com.woolworths.android.onesite.a.D(sbR, this.g, ", includeHandoverBanner=", this.h, ", includeOrderYourGroceriesRedesign=");
        au.com.woolworths.android.onesite.a.D(sbR, this.i, ", includeSpiltOrderFulfilmentDetails=", this.j, ", includeStatusTimelineRedesign=");
        au.com.woolworths.android.onesite.a.D(sbR, this.k, ", includeOrderDetailsChangeMyOrderUplift=", this.l, ", includeAsyncChat=");
        return a.k(")", sbR, this.m);
    }
}
