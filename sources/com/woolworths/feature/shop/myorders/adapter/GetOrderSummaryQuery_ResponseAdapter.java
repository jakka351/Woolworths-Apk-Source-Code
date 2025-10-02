package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
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
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.LocationImage_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.LocationTrackingStatusImage_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.MyGroceriesProductListBadgeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderFulfilmentType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderHelpItemType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderPaymentDetailsItemAmountStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderStatusType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderSubtitleIcon_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProgressStepType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TooltipType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.myorders.GetOrderSummaryQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bq\bÇ\u0002\u0018\u00002\u00020\u0001:p\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopq¨\u0006r"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter;", "", "Data", "OrderSummary", "HelpList", "Item", "HelpItem", "ContactTimes", "ContactItem", "Feed", "Item1", "OnOrderDetailsDivider", "OnOrderPaymentDetails", "Total", "SubTotal", "MarketSubtotal", "PaymentMethod", "Discount", "SavingsAndReward", "Refund", "RefundTotal", "OnHorizontalList", "Item2", "OnOrderDetailsProductCard", "InsetBanner", "Action", "Analytics", "Badge", "OnMyGroceriesProductListBadge", "OnOrderProofOfDeliveryDetails", "InsetBanner1", "OnCurrentPickupOrderFulfilmentDetails", "StoreDetails", "CollectionDetails", "ParkingDetails", "OnCurrentPickupLocationTrackingStatus", "OnOrderFulfilmentDetails", "FulfilmentItem", "DeliveryInstructions", "OnPastPickupOrderFulfilmentDetails", "FulfilmentItem1", "OnDeliveryOrderFulfilmentDetails", "FulfilmentItem2", "DeliveryInstructions1", "OnPastOrderOverview", "InsetBanner2", "OrderDetailsStatus", "OrderTime", "OrderDetailSummary", "ChangeOrderButton", "CancelOrderButton", "ViewInvoiceButton", "OnCurrentPickupOrderOverview", "ProgressStepper", "ProgressStepperForCollectedState", "Tooltip", "StepInfoList", "ChangeOrderButton1", "CancelOrderButton1", "CheckInNowButton", "CollectionBanner", "BayNumberPreferences", "ConfirmButton", "BayNumberUnknownButton", "CheckInOnMyWayButton", "OnMyWayPreferences", "ConfirmButton1", "LocationTrackingPrimingPage", "LocationPermissionsWereNotSet", "Rationale", "LocationPermissionButton", "DoNotAllowWasSetEarlier", "Rationale1", "LocationPermissionButton1", "Banner", "HandoverBanner", "OnOrderNumberDetails", "OnDeliveryDriverDetails", "InsetBanner3", "Analytics1", "ExtraContent", "LiveTrackingButton", "DeliveryTooltip", "DeliveryMethodsTab", "BulletInfoList", "DriverRatingBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "OnCurrentDeliveryOrderOverview", "InsetBanner4", "Analytics2", "ExtraContent1", "ChangeOrderButton2", "CancelOrderButton2", "ProgressStepper1", "Tooltip1", "StepInfoList1", "OnDriverRating", "StarsRatingStep", "InsetAlert", "SubmitButton", "CoreButtonAction", "FeedbackAndCommentsStep", "FeedbackChip", "Text", "DoneButton", "CoreButtonAction1", "ThankYouStep", "BadFeedbackButton", "CoreButtonAction2", "CancelWarning", "EditOrderWarning", "WarningItem", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetOrderSummaryQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Action;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<GetOrderSummaryQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f20036a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Action value = (GetOrderSummaryQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f19864a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<GetOrderSummaryQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20037a = new Analytics();
        public static final List b = CollectionsKt.Q("eventLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new GetOrderSummaryQuery.Analytics(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Analytics value = (GetOrderSummaryQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19865a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<GetOrderSummaryQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f20038a = new Analytics1();
        public static final List b = CollectionsKt.R("eventLabel", "extraContent");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new GetOrderSummaryQuery.Analytics1(str, list);
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ExtraContent.f20075a, false))).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Analytics1 value = (GetOrderSummaryQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19866a);
            writer.F1("extraContent");
            Adapters.b(Adapters.a(Adapters.c(ExtraContent.f20075a, false))).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Analytics2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<GetOrderSummaryQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f20039a = new Analytics2();
        public static final List b = CollectionsKt.R("eventLabel", "extraContent");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new GetOrderSummaryQuery.Analytics2(str, list);
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ExtraContent1.f20076a, false))).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Analytics2 value = (GetOrderSummaryQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19867a);
            writer.F1("extraContent");
            Adapters.b(Adapters.a(Adapters.c(ExtraContent1.f20076a, false))).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$BadFeedbackButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BadFeedbackButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BadFeedbackButton implements Adapter<GetOrderSummaryQuery.BadFeedbackButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final BadFeedbackButton f20040a = new BadFeedbackButton();
        public static final List b = CollectionsKt.R("coreButtonStyle", "coreButtonLabel", "coreButtonAction", "coreButtonEnabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CoreButtonStyle coreButtonStyleA = null;
            String str = null;
            GetOrderSummaryQuery.CoreButtonAction2 coreButtonAction2 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    coreButtonStyleA = CoreButtonStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreButtonAction2 = (GetOrderSummaryQuery.CoreButtonAction2) Adapters.c(CoreButtonAction2.f20064a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (coreButtonStyleA == null) {
                Assertions.a(reader, "coreButtonStyle");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "coreButtonLabel");
                throw null;
            }
            if (coreButtonAction2 == null) {
                Assertions.a(reader, "coreButtonAction");
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.BadFeedbackButton(coreButtonStyleA, str, coreButtonAction2, bool.booleanValue());
            }
            Assertions.a(reader, "coreButtonEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.BadFeedbackButton value = (GetOrderSummaryQuery.BadFeedbackButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreButtonStyle");
            CoreButtonStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19868a);
            writer.F1("coreButtonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreButtonAction");
            Adapters.c(CoreButtonAction2.f20064a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("coreButtonEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Badge;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<GetOrderSummaryQuery.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f20041a = new Badge();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.OnMyGroceriesProductListBadge onMyGroceriesProductListBadgeA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("MyGroceriesProductListBadge"))) {
                reader.o();
                onMyGroceriesProductListBadgeA = OnMyGroceriesProductListBadge.a(reader, customScalarAdapters);
            }
            return new GetOrderSummaryQuery.Badge(str, onMyGroceriesProductListBadgeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Badge value = (GetOrderSummaryQuery.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19869a);
            GetOrderSummaryQuery.OnMyGroceriesProductListBadge onMyGroceriesProductListBadge = value.b;
            if (onMyGroceriesProductListBadge != null) {
                OnMyGroceriesProductListBadge.b(writer, customScalarAdapters, onMyGroceriesProductListBadge);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Banner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<GetOrderSummaryQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f20042a = new Banner();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "type", "dismissible", "bannerId", "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BroadcastBannerType broadcastBannerTypeA = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (broadcastBannerTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str4 != null) {
                return new GetOrderSummaryQuery.Banner(str, str2, broadcastBannerTypeA, bool, str3, str4);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Banner value = (GetOrderSummaryQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19870a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$BayNumberPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BayNumberPreferences;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BayNumberPreferences implements Adapter<GetOrderSummaryQuery.BayNumberPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final BayNumberPreferences f20043a = new BayNumberPreferences();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "bayNumber", "confirmButton", "bayNumberUnknownButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            GetOrderSummaryQuery.ConfirmButton confirmButton = null;
            GetOrderSummaryQuery.BayNumberUnknownButton bayNumberUnknownButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    confirmButton = (GetOrderSummaryQuery.ConfirmButton) Adapters.c(ConfirmButton.f20058a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bayNumberUnknownButton = (GetOrderSummaryQuery.BayNumberUnknownButton) Adapters.c(BayNumberUnknownButton.f20044a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "bayNumber");
                throw null;
            }
            if (confirmButton == null) {
                Assertions.a(reader, "confirmButton");
                throw null;
            }
            if (bayNumberUnknownButton != null) {
                return new GetOrderSummaryQuery.BayNumberPreferences(str, str2, arrayListFromJson, confirmButton, bayNumberUnknownButton);
            }
            Assertions.a(reader, "bayNumberUnknownButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.BayNumberPreferences value = (GetOrderSummaryQuery.BayNumberPreferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19871a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bayNumber");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("confirmButton");
            Adapters.c(ConfirmButton.f20058a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("bayNumberUnknownButton");
            Adapters.c(BayNumberUnknownButton.f20044a, false).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$BayNumberUnknownButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BayNumberUnknownButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BayNumberUnknownButton implements Adapter<GetOrderSummaryQuery.BayNumberUnknownButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final BayNumberUnknownButton f20044a = new BayNumberUnknownButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.BayNumberUnknownButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.BayNumberUnknownButton value = (GetOrderSummaryQuery.BayNumberUnknownButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19872a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BroadcastBannerUI;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<GetOrderSummaryQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f20045a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            GetOrderSummaryQuery.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreBroadcastBannerStyleA = CoreBroadcastBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    icon = (GetOrderSummaryQuery.Icon) Adapters.c(Icon.f20086a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (coreBroadcastBannerStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (icon != null) {
                return new GetOrderSummaryQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.BroadcastBannerUI value = (GetOrderSummaryQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19873a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f20086a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$BulletInfoList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$BulletInfoList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BulletInfoList implements Adapter<GetOrderSummaryQuery.BulletInfoList> {

        /* renamed from: a, reason: collision with root package name */
        public static final BulletInfoList f20046a = new BulletInfoList();
        public static final List b = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOrderSummaryQuery.BulletInfoList(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.BulletInfoList value = (GetOrderSummaryQuery.BulletInfoList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19874a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CancelOrderButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelOrderButton implements Adapter<GetOrderSummaryQuery.CancelOrderButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelOrderButton f20047a = new CancelOrderButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.CancelOrderButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CancelOrderButton value = (GetOrderSummaryQuery.CancelOrderButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19875a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CancelOrderButton1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelOrderButton1 implements Adapter<GetOrderSummaryQuery.CancelOrderButton1> {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelOrderButton1 f20048a = new CancelOrderButton1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.CancelOrderButton1(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CancelOrderButton1 value = (GetOrderSummaryQuery.CancelOrderButton1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19876a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CancelOrderButton2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelOrderButton2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelOrderButton2 implements Adapter<GetOrderSummaryQuery.CancelOrderButton2> {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelOrderButton2 f20049a = new CancelOrderButton2();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.CancelOrderButton2(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CancelOrderButton2 value = (GetOrderSummaryQuery.CancelOrderButton2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19877a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CancelWarning;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CancelWarning;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelWarning implements Adapter<GetOrderSummaryQuery.CancelWarning> {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelWarning f20050a = new CancelWarning();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 != null) {
                return new GetOrderSummaryQuery.CancelWarning(str, str2, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CancelWarning value = (GetOrderSummaryQuery.CancelWarning) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19878a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ChangeOrderButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChangeOrderButton implements Adapter<GetOrderSummaryQuery.ChangeOrderButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChangeOrderButton f20051a = new ChangeOrderButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ChangeOrderButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ChangeOrderButton value = (GetOrderSummaryQuery.ChangeOrderButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19879a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ChangeOrderButton1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChangeOrderButton1 implements Adapter<GetOrderSummaryQuery.ChangeOrderButton1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChangeOrderButton1 f20052a = new ChangeOrderButton1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ChangeOrderButton1(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ChangeOrderButton1 value = (GetOrderSummaryQuery.ChangeOrderButton1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19880a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ChangeOrderButton2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ChangeOrderButton2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChangeOrderButton2 implements Adapter<GetOrderSummaryQuery.ChangeOrderButton2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChangeOrderButton2 f20053a = new ChangeOrderButton2();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ChangeOrderButton2(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ChangeOrderButton2 value = (GetOrderSummaryQuery.ChangeOrderButton2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19881a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CheckInNowButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CheckInNowButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckInNowButton implements Adapter<GetOrderSummaryQuery.CheckInNowButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckInNowButton f20054a = new CheckInNowButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.CheckInNowButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CheckInNowButton value = (GetOrderSummaryQuery.CheckInNowButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19882a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CheckInOnMyWayButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CheckInOnMyWayButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckInOnMyWayButton implements Adapter<GetOrderSummaryQuery.CheckInOnMyWayButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckInOnMyWayButton f20055a = new CheckInOnMyWayButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.CheckInOnMyWayButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CheckInOnMyWayButton value = (GetOrderSummaryQuery.CheckInOnMyWayButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19883a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CollectionBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CollectionBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CollectionBanner implements Adapter<GetOrderSummaryQuery.CollectionBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final CollectionBanner f20056a = new CollectionBanner();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.CollectionBanner(insetBannerDisplayTypeA, str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CollectionBanner value = (GetOrderSummaryQuery.CollectionBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f19884a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CollectionDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CollectionDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CollectionDetails implements Adapter<GetOrderSummaryQuery.CollectionDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final CollectionDetails f20057a = new CollectionDetails();
        public static final List b = CollectionsKt.R("fulfillmentLabel", "fulfillmentType", "actionTitle", "parkingDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            GetOrderSummaryQuery.ParkingDetails parkingDetails = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    parkingDetails = (GetOrderSummaryQuery.ParkingDetails) Adapters.b(Adapters.c(ParkingDetails.f20125a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "fulfillmentLabel");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.CollectionDetails(str, str2, str3, parkingDetails);
            }
            Assertions.a(reader, "fulfillmentType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CollectionDetails value = (GetOrderSummaryQuery.CollectionDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfillmentLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19885a);
            writer.F1("fulfillmentType");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("parkingDetails");
            Adapters.b(Adapters.c(ParkingDetails.f20125a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ConfirmButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ConfirmButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfirmButton implements Adapter<GetOrderSummaryQuery.ConfirmButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ConfirmButton f20058a = new ConfirmButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ConfirmButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ConfirmButton value = (GetOrderSummaryQuery.ConfirmButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19886a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ConfirmButton1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ConfirmButton1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfirmButton1 implements Adapter<GetOrderSummaryQuery.ConfirmButton1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ConfirmButton1 f20059a = new ConfirmButton1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ConfirmButton1(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ConfirmButton1 value = (GetOrderSummaryQuery.ConfirmButton1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19887a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ContactItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ContactItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContactItem implements Adapter<GetOrderSummaryQuery.ContactItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContactItem f20060a = new ContactItem();
        public static final List b = CollectionsKt.R("day", "time");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "day");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.ContactItem(str, str2);
            }
            Assertions.a(reader, "time");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ContactItem value = (GetOrderSummaryQuery.ContactItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("day");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19888a);
            writer.F1("time");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ContactTimes;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ContactTimes;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContactTimes implements Adapter<GetOrderSummaryQuery.ContactTimes> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContactTimes f20061a = new ContactTimes();
        public static final List b = CollectionsKt.R("title", "subTitle", "contactItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ContactItem.f20060a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "subTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.ContactTimes(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "contactItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ContactTimes value = (GetOrderSummaryQuery.ContactTimes) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19889a);
            writer.F1("subTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contactItems");
            Adapters.a(Adapters.c(ContactItem.f20060a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CoreButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonAction implements Adapter<GetOrderSummaryQuery.CoreButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonAction f20062a = new CoreButtonAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.CoreButtonAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CoreButtonAction value = (GetOrderSummaryQuery.CoreButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f19890a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CoreButtonAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonAction1 implements Adapter<GetOrderSummaryQuery.CoreButtonAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonAction1 f20063a = new CoreButtonAction1();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.CoreButtonAction1(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CoreButtonAction1 value = (GetOrderSummaryQuery.CoreButtonAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f19891a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$CoreButtonAction2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$CoreButtonAction2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonAction2 implements Adapter<GetOrderSummaryQuery.CoreButtonAction2> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonAction2 f20064a = new CoreButtonAction2();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.CoreButtonAction2(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.CoreButtonAction2 value = (GetOrderSummaryQuery.CoreButtonAction2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f19892a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetOrderSummaryQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20065a = new Data();
        public static final List b = CollectionsKt.Q("orderSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.OrderSummary orderSummary = null;
            while (reader.o2(b) == 0) {
                orderSummary = (GetOrderSummaryQuery.OrderSummary) Adapters.c(OrderSummary.f20123a, false).fromJson(reader, customScalarAdapters);
            }
            if (orderSummary != null) {
                return new GetOrderSummaryQuery.Data(orderSummary);
            }
            Assertions.a(reader, "orderSummary");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Data value = (GetOrderSummaryQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderSummary");
            Adapters.c(OrderSummary.f20123a, false).toJson(writer, customScalarAdapters, value.f19893a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DeliveryInstructions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryInstructions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryInstructions implements Adapter<GetOrderSummaryQuery.DeliveryInstructions> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryInstructions f20066a = new DeliveryInstructions();
        public static final List b = CollectionsKt.R("leaveUnattended", "leaveUnattendedTitle", "hideLeaveUnattended", "leaveUnattendedMessage", "driverInstructions", "driverInstructionsTitle", "canToggleLeaveUnattended", "canEditInstructions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool = bool3;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool3;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool3;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool3;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool3;
                        bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool3;
                        bool5 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool6 = bool3;
                        if (bool2 == null) {
                            Assertions.a(reader, "leaveUnattended");
                            throw null;
                        }
                        Boolean bool7 = bool4;
                        boolean zBooleanValue = bool2.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "leaveUnattendedTitle");
                            throw null;
                        }
                        if (bool6 == null) {
                            Assertions.a(reader, "hideLeaveUnattended");
                            throw null;
                        }
                        Boolean bool8 = bool5;
                        boolean zBooleanValue2 = bool6.booleanValue();
                        if (str2 == null) {
                            Assertions.a(reader, "leaveUnattendedMessage");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "driverInstructions");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "driverInstructionsTitle");
                            throw null;
                        }
                        if (bool7 == null) {
                            Assertions.a(reader, "canToggleLeaveUnattended");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool7.booleanValue();
                        if (bool8 != null) {
                            return new GetOrderSummaryQuery.DeliveryInstructions(str, str2, str3, str4, zBooleanValue, zBooleanValue2, zBooleanValue3, bool8.booleanValue());
                        }
                        Assertions.a(reader, "canEditInstructions");
                        throw null;
                }
                bool3 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DeliveryInstructions value = (GetOrderSummaryQuery.DeliveryInstructions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leaveUnattended");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.f19894a, adapters$BooleanAdapter$1, writer, customScalarAdapters, "leaveUnattendedTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("hideLeaveUnattended");
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "leaveUnattendedMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("driverInstructions");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("driverInstructionsTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("canToggleLeaveUnattended");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "canEditInstructions");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.h));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DeliveryInstructions1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryInstructions1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryInstructions1 implements Adapter<GetOrderSummaryQuery.DeliveryInstructions1> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryInstructions1 f20067a = new DeliveryInstructions1();
        public static final List b = CollectionsKt.R("leaveUnattended", "leaveUnattendedTitle", "hideLeaveUnattended", "leaveUnattendedMessage", "driverInstructions", "driverInstructionsTitle", "canToggleLeaveUnattended", "canEditInstructions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool = bool3;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool3;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool3;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool3;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool3;
                        bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool3;
                        bool5 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool6 = bool3;
                        if (bool2 == null) {
                            Assertions.a(reader, "leaveUnattended");
                            throw null;
                        }
                        Boolean bool7 = bool4;
                        boolean zBooleanValue = bool2.booleanValue();
                        if (str == null) {
                            Assertions.a(reader, "leaveUnattendedTitle");
                            throw null;
                        }
                        if (bool6 == null) {
                            Assertions.a(reader, "hideLeaveUnattended");
                            throw null;
                        }
                        Boolean bool8 = bool5;
                        boolean zBooleanValue2 = bool6.booleanValue();
                        if (str2 == null) {
                            Assertions.a(reader, "leaveUnattendedMessage");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "driverInstructions");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "driverInstructionsTitle");
                            throw null;
                        }
                        if (bool7 == null) {
                            Assertions.a(reader, "canToggleLeaveUnattended");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool7.booleanValue();
                        if (bool8 != null) {
                            return new GetOrderSummaryQuery.DeliveryInstructions1(str, str2, str3, str4, zBooleanValue, zBooleanValue2, zBooleanValue3, bool8.booleanValue());
                        }
                        Assertions.a(reader, "canEditInstructions");
                        throw null;
                }
                bool3 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DeliveryInstructions1 value = (GetOrderSummaryQuery.DeliveryInstructions1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leaveUnattended");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.f19895a, adapters$BooleanAdapter$1, writer, customScalarAdapters, "leaveUnattendedTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("hideLeaveUnattended");
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "leaveUnattendedMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("driverInstructions");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("driverInstructionsTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("canToggleLeaveUnattended");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "canEditInstructions");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.h));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DeliveryMethodsTab;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryMethodsTab;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryMethodsTab implements Adapter<GetOrderSummaryQuery.DeliveryMethodsTab> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryMethodsTab f20068a = new DeliveryMethodsTab();
        public static final List b = CollectionsKt.R("title", "imageUrl", lqlqqlq.mmm006Dm006Dm, "bulletInfoList", "driverRatingBanner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            GetOrderSummaryQuery.DriverRatingBanner driverRatingBanner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson = Adapters.a(Adapters.c(BulletInfoList.f20046a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    driverRatingBanner = (GetOrderSummaryQuery.DriverRatingBanner) Adapters.b(Adapters.c(DriverRatingBanner.f20073a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.DeliveryMethodsTab(str, str2, str3, arrayListFromJson, driverRatingBanner);
            }
            Assertions.a(reader, "bulletInfoList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DeliveryMethodsTab value = (GetOrderSummaryQuery.DeliveryMethodsTab) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19896a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bulletInfoList");
            Adapters.a(Adapters.c(BulletInfoList.f20046a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("driverRatingBanner");
            Adapters.b(Adapters.c(DriverRatingBanner.f20073a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DeliveryTooltip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DeliveryTooltip;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryTooltip implements Adapter<GetOrderSummaryQuery.DeliveryTooltip> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryTooltip f20069a = new DeliveryTooltip();
        public static final List b = CollectionsKt.R("title", "message", "deliveryMethodsTabs");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(DeliveryMethodsTab.f20068a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.DeliveryTooltip(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "deliveryMethodsTabs");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DeliveryTooltip value = (GetOrderSummaryQuery.DeliveryTooltip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19897a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deliveryMethodsTabs");
            Adapters.a(Adapters.c(DeliveryMethodsTab.f20068a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Discount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Discount;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Discount implements Adapter<GetOrderSummaryQuery.Discount> {

        /* renamed from: a, reason: collision with root package name */
        public static final Discount f20070a = new Discount();
        public static final List b = CollectionsKt.R("title", "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.Discount(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Discount value = (GetOrderSummaryQuery.Discount) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19898a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DoNotAllowWasSetEarlier;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DoNotAllowWasSetEarlier;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DoNotAllowWasSetEarlier implements Adapter<GetOrderSummaryQuery.DoNotAllowWasSetEarlier> {

        /* renamed from: a, reason: collision with root package name */
        public static final DoNotAllowWasSetEarlier f20071a = new DoNotAllowWasSetEarlier();
        public static final List b = CollectionsKt.R("header", "rationales", "locationPermissionButtons", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Rationale1.f20131a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson2 = Adapters.a(Adapters.c(LocationPermissionButton1.f20098a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "rationales");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "locationPermissionButtons");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.DoNotAllowWasSetEarlier(str, str2, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DoNotAllowWasSetEarlier value = (GetOrderSummaryQuery.DoNotAllowWasSetEarlier) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19899a);
            writer.F1("rationales");
            Adapters.a(Adapters.c(Rationale1.f20131a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("locationPermissionButtons");
            Adapters.a(Adapters.c(LocationPermissionButton1.f20098a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DoneButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DoneButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DoneButton implements Adapter<GetOrderSummaryQuery.DoneButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final DoneButton f20072a = new DoneButton();
        public static final List b = CollectionsKt.R("coreButtonStyle", "coreButtonLabel", "coreButtonAction", "coreButtonEnabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CoreButtonStyle coreButtonStyleA = null;
            String str = null;
            GetOrderSummaryQuery.CoreButtonAction1 coreButtonAction1 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    coreButtonStyleA = CoreButtonStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreButtonAction1 = (GetOrderSummaryQuery.CoreButtonAction1) Adapters.c(CoreButtonAction1.f20063a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (coreButtonStyleA == null) {
                Assertions.a(reader, "coreButtonStyle");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "coreButtonLabel");
                throw null;
            }
            if (coreButtonAction1 == null) {
                Assertions.a(reader, "coreButtonAction");
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.DoneButton(coreButtonStyleA, str, coreButtonAction1, bool.booleanValue());
            }
            Assertions.a(reader, "coreButtonEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DoneButton value = (GetOrderSummaryQuery.DoneButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreButtonStyle");
            CoreButtonStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19900a);
            writer.F1("coreButtonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreButtonAction");
            Adapters.c(CoreButtonAction1.f20063a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("coreButtonEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$DriverRatingBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$DriverRatingBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DriverRatingBanner implements Adapter<GetOrderSummaryQuery.DriverRatingBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final DriverRatingBanner f20073a = new DriverRatingBanner();
        public static final List b = CollectionsKt.R("broadcastBannerUI", "broadcastBannerDismissible");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.BroadcastBannerUI broadcastBannerUI = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    broadcastBannerUI = (GetOrderSummaryQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f20045a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (broadcastBannerUI == null) {
                Assertions.a(reader, "broadcastBannerUI");
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.DriverRatingBanner(broadcastBannerUI, bool.booleanValue());
            }
            Assertions.a(reader, "broadcastBannerDismissible");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.DriverRatingBanner value = (GetOrderSummaryQuery.DriverRatingBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f20045a, false).toJson(writer, customScalarAdapters, value.f19901a);
            writer.F1("broadcastBannerDismissible");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$EditOrderWarning;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$EditOrderWarning;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditOrderWarning implements Adapter<GetOrderSummaryQuery.EditOrderWarning> {

        /* renamed from: a, reason: collision with root package name */
        public static final EditOrderWarning f20074a = new EditOrderWarning();
        public static final List b = CollectionsKt.R("imageUrl", "title", "warningItems", "acceptLabel", "acceptButtonLabel", "cancelButtonLabel", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson = Adapters.a(Adapters.c(WarningItem.f20147a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "warningItems");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "acceptLabel");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "acceptButtonLabel");
                            throw null;
                        }
                        if (str5 != null) {
                            return new GetOrderSummaryQuery.EditOrderWarning(str, str2, arrayListFromJson, str3, str4, str5, str6);
                        }
                        Assertions.a(reader, "cancelButtonLabel");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.EditOrderWarning value = (GetOrderSummaryQuery.EditOrderWarning) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19902a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("warningItems");
            Adapters.a(Adapters.c(WarningItem.f20147a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("acceptLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("acceptButtonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("cancelButtonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("disclaimer");
            Adapters.i.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ExtraContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ExtraContent;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraContent implements Adapter<GetOrderSummaryQuery.ExtraContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraContent f20075a = new ExtraContent();
        public static final List b = CollectionsKt.R("key", "value");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetOrderSummaryQuery.ExtraContent(str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ExtraContent value = (GetOrderSummaryQuery.ExtraContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19903a);
            writer.F1("value");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ExtraContent1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ExtraContent1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraContent1 implements Adapter<GetOrderSummaryQuery.ExtraContent1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraContent1 f20076a = new ExtraContent1();
        public static final List b = CollectionsKt.R("key", "value");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetOrderSummaryQuery.ExtraContent1(str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ExtraContent1 value = (GetOrderSummaryQuery.ExtraContent1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19904a);
            writer.F1("value");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Feed;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<GetOrderSummaryQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f20077a = new Feed();
        public static final List b = CollectionsKt.R("__typename", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f20094a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.Feed(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Feed value = (GetOrderSummaryQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19905a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f20094a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$FeedbackAndCommentsStep;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FeedbackAndCommentsStep;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackAndCommentsStep implements Adapter<GetOrderSummaryQuery.FeedbackAndCommentsStep> {

        /* renamed from: a, reason: collision with root package name */
        public static final FeedbackAndCommentsStep f20078a = new FeedbackAndCommentsStep();
        public static final List b = CollectionsKt.R("title", "subTitle", "feedbackChipsQuestion", "feedbackChips", "additionalCommentText", "doneButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            String str4 = null;
            GetOrderSummaryQuery.DoneButton doneButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson = Adapters.a(Adapters.c(FeedbackChip.f20079a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    doneButton = (GetOrderSummaryQuery.DoneButton) Adapters.c(DoneButton.f20072a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "subTitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "feedbackChipsQuestion");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "feedbackChips");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "additionalCommentText");
                throw null;
            }
            if (doneButton != null) {
                return new GetOrderSummaryQuery.FeedbackAndCommentsStep(str, str2, str3, arrayListFromJson, str4, doneButton);
            }
            Assertions.a(reader, "doneButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.FeedbackAndCommentsStep value = (GetOrderSummaryQuery.FeedbackAndCommentsStep) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19906a);
            writer.F1("subTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("feedbackChipsQuestion");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("feedbackChips");
            Adapters.a(Adapters.c(FeedbackChip.f20079a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("additionalCommentText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("doneButton");
            Adapters.c(DoneButton.f20072a, false).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$FeedbackChip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FeedbackChip;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackChip implements Adapter<GetOrderSummaryQuery.FeedbackChip> {

        /* renamed from: a, reason: collision with root package name */
        public static final FeedbackChip f20079a = new FeedbackChip();
        public static final List b = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            GetOrderSummaryQuery.Text text = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    text = (GetOrderSummaryQuery.Text) Adapters.c(Text.f20141a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (text != null) {
                return new GetOrderSummaryQuery.FeedbackChip(str, zBooleanValue, text);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.FeedbackChip value = (GetOrderSummaryQuery.FeedbackChip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19907a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.c(Text.f20141a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$FulfilmentItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentItem implements Adapter<GetOrderSummaryQuery.FulfilmentItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentItem f20080a = new FulfilmentItem();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.FulfilmentItem(str, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.FulfilmentItem value = (GetOrderSummaryQuery.FulfilmentItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19908a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$FulfilmentItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentItem1 implements Adapter<GetOrderSummaryQuery.FulfilmentItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentItem1 f20081a = new FulfilmentItem1();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.FulfilmentItem1(str, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.FulfilmentItem1 value = (GetOrderSummaryQuery.FulfilmentItem1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19909a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$FulfilmentItem2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$FulfilmentItem2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentItem2 implements Adapter<GetOrderSummaryQuery.FulfilmentItem2> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentItem2 f20082a = new FulfilmentItem2();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.FulfilmentItem2(str, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.FulfilmentItem2 value = (GetOrderSummaryQuery.FulfilmentItem2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19910a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$HandoverBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HandoverBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HandoverBanner implements Adapter<GetOrderSummaryQuery.HandoverBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final HandoverBanner f20083a = new HandoverBanner();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "type", "dismissible", "bannerId", "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            BroadcastBannerType broadcastBannerTypeA = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (broadcastBannerTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str4 != null) {
                return new GetOrderSummaryQuery.HandoverBanner(str, str2, broadcastBannerTypeA, bool, str3, str4);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.HandoverBanner value = (GetOrderSummaryQuery.HandoverBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19911a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$HelpItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HelpItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpItem implements Adapter<GetOrderSummaryQuery.HelpItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final HelpItem f20084a = new HelpItem();
        public static final List b = CollectionsKt.R("iconUrl", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "itemType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderHelpItemType orderHelpItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    orderHelpItemTypeA = OrderHelpItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (orderHelpItemTypeA != null) {
                return new GetOrderSummaryQuery.HelpItem(str, str2, str3, str4, orderHelpItemTypeA);
            }
            Assertions.a(reader, "itemType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.HelpItem value = (GetOrderSummaryQuery.HelpItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19912a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("itemType");
            OrderHelpItemType_ResponseAdapter.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$HelpList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$HelpList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpList implements Adapter<GetOrderSummaryQuery.HelpList> {

        /* renamed from: a, reason: collision with root package name */
        public static final HelpList f20085a = new HelpList();
        public static final List b = CollectionsKt.R("items", "imageUrl", "helpTitle", "helpItems", "contactTimes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            String str2 = null;
            List list = null;
            GetOrderSummaryQuery.ContactTimes contactTimes = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f20093a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(HelpItem.f20084a, false))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    contactTimes = (GetOrderSummaryQuery.ContactTimes) Adapters.b(Adapters.c(ContactTimes.f20061a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.HelpList(arrayListFromJson, str, str2, list, contactTimes);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.HelpList value = (GetOrderSummaryQuery.HelpList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f20093a, false)).toJson(writer, customScalarAdapters, value.f19913a);
            writer.F1("imageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("helpTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("helpItems");
            Adapters.b(Adapters.a(Adapters.c(HelpItem.f20084a, false))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("contactTimes");
            Adapters.b(Adapters.c(ContactTimes.f20061a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Icon;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<GetOrderSummaryQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f20086a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new GetOrderSummaryQuery.Icon(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Icon value = (GetOrderSummaryQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19914a);
            GetOrderSummaryQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetAlert;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlert implements Adapter<GetOrderSummaryQuery.InsetAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlert f20087a = new InsetAlert();
        public static final List b = CollectionsKt.R("style", lqlqqlq.mmm006Dm006Dm, "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CoreAlertStyle coreAlertStyleA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    coreAlertStyleA = CoreAlertStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (coreAlertStyleA != null) {
                return new GetOrderSummaryQuery.InsetAlert(coreAlertStyleA, str, str2);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetAlert value = (GetOrderSummaryQuery.InsetAlert) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            CoreAlertStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19915a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<GetOrderSummaryQuery.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f20088a = new InsetBanner();
        public static final List b = CollectionsKt.R("message", UrlHandler.ACTION, "displayType", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            GetOrderSummaryQuery.Action action = null;
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            GetOrderSummaryQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    action = (GetOrderSummaryQuery.Action) Adapters.b(Adapters.c(Action.f20036a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (GetOrderSummaryQuery.Analytics) Adapters.b(Adapters.c(Analytics.f20037a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (insetBannerDisplayTypeA != null) {
                return new GetOrderSummaryQuery.InsetBanner(str, action, insetBannerDisplayTypeA, analytics);
            }
            Assertions.a(reader, "displayType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetBanner value = (GetOrderSummaryQuery.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19916a);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f20036a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f20037a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetBanner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner1 implements Adapter<GetOrderSummaryQuery.InsetBanner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner1 f20089a = new InsetBanner1();
        public static final List b = CollectionsKt.R("message", "displayType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (insetBannerDisplayTypeA != null) {
                return new GetOrderSummaryQuery.InsetBanner1(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "displayType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetBanner1 value = (GetOrderSummaryQuery.InsetBanner1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19917a);
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetBanner2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner2 implements Adapter<GetOrderSummaryQuery.InsetBanner2> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner2 f20090a = new InsetBanner2();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.InsetBanner2(insetBannerDisplayTypeA, str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetBanner2 value = (GetOrderSummaryQuery.InsetBanner2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f19918a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetBanner3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner3;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner3 implements Adapter<GetOrderSummaryQuery.InsetBanner3> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner3 f20091a = new InsetBanner3();
        public static final List b = CollectionsKt.R("message", "iconUrl", "displayType", "bannerTitle", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str3 = null;
            GetOrderSummaryQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    analytics1 = (GetOrderSummaryQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f20038a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (insetBannerDisplayTypeA != null) {
                return new GetOrderSummaryQuery.InsetBanner3(str, str2, insetBannerDisplayTypeA, str3, analytics1);
            }
            Assertions.a(reader, "displayType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetBanner3 value = (GetOrderSummaryQuery.InsetBanner3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19919a);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f20038a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$InsetBanner4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$InsetBanner4;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner4 implements Adapter<GetOrderSummaryQuery.InsetBanner4> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner4 f20092a = new InsetBanner4();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            GetOrderSummaryQuery.Analytics2 analytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics2 = (GetOrderSummaryQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f20039a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.InsetBanner4(insetBannerDisplayTypeA, str, str2, analytics2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.InsetBanner4 value = (GetOrderSummaryQuery.InsetBanner4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f19920a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f20039a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<GetOrderSummaryQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20093a = new Item();
        public static final List b = CollectionsKt.R("iconUrl", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "url", "itemType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderHelpItemType orderHelpItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    orderHelpItemTypeA = OrderHelpItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (orderHelpItemTypeA != null) {
                return new GetOrderSummaryQuery.Item(str, str2, str3, str4, orderHelpItemTypeA);
            }
            Assertions.a(reader, "itemType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Item value = (GetOrderSummaryQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19921a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("itemType");
            OrderHelpItemType_ResponseAdapter.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<GetOrderSummaryQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f20094a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            GetOrderSummaryQuery.OnOrderDetailsDivider onOrderDetailsDividerA;
            GetOrderSummaryQuery.OnOrderPaymentDetails onOrderPaymentDetailsA;
            GetOrderSummaryQuery.OnHorizontalList onHorizontalListA;
            GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails onOrderProofOfDeliveryDetailsA;
            GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails onCurrentPickupOrderFulfilmentDetailsA;
            GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus onCurrentPickupLocationTrackingStatusA;
            GetOrderSummaryQuery.OnOrderFulfilmentDetails onOrderFulfilmentDetailsA;
            GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails onPastPickupOrderFulfilmentDetailsA;
            GetOrderSummaryQuery.OnOrderFulfilmentDetails onOrderFulfilmentDetails;
            GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails onDeliveryOrderFulfilmentDetailsA;
            GetOrderSummaryQuery.OnPastOrderOverview onPastOrderOverviewA;
            byte b2;
            GetOrderSummaryQuery.OnCurrentPickupOrderOverview onCurrentPickupOrderOverviewA;
            GetOrderSummaryQuery.OnOrderNumberDetails onOrderNumberDetailsA;
            byte b3;
            GetOrderSummaryQuery.OnDeliveryDriverDetails onDeliveryDriverDetailsA;
            byte b4;
            GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview onCurrentDeliveryOrderOverviewA;
            GetOrderSummaryQuery.OnDriverRating onDriverRatingA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderDetailsDivider"))) {
                reader.o();
                onOrderDetailsDividerA = OnOrderDetailsDivider.a(reader, customScalarAdapters);
            } else {
                onOrderDetailsDividerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderPaymentDetails"))) {
                reader.o();
                onOrderPaymentDetailsA = OnOrderPaymentDetails.a(reader, customScalarAdapters);
            } else {
                onOrderPaymentDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderProofOfDeliveryDetails"))) {
                reader.o();
                onOrderProofOfDeliveryDetailsA = OnOrderProofOfDeliveryDetails.a(reader, customScalarAdapters);
            } else {
                onOrderProofOfDeliveryDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CurrentPickupOrderFulfilmentDetails"))) {
                reader.o();
                onCurrentPickupOrderFulfilmentDetailsA = OnCurrentPickupOrderFulfilmentDetails.a(reader, customScalarAdapters);
            } else {
                onCurrentPickupOrderFulfilmentDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CurrentPickupLocationTrackingStatus"))) {
                reader.o();
                onCurrentPickupLocationTrackingStatusA = OnCurrentPickupLocationTrackingStatus.a(reader, customScalarAdapters);
            } else {
                onCurrentPickupLocationTrackingStatusA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("OrderFulfilmentDetails"), new BooleanExpression.Not(BooleanExpressions.d("includeSpiltOrderFulfilmentDetails"))))) {
                reader.o();
                onOrderFulfilmentDetailsA = OnOrderFulfilmentDetails.a(reader, customScalarAdapters);
            } else {
                onOrderFulfilmentDetailsA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("PastPickupOrderFulfilmentDetails"), BooleanExpressions.d("includeSpiltOrderFulfilmentDetails")))) {
                reader.o();
                onPastPickupOrderFulfilmentDetailsA = OnPastPickupOrderFulfilmentDetails.a(reader, customScalarAdapters);
            } else {
                onPastPickupOrderFulfilmentDetailsA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("DeliveryOrderFulfilmentDetails"), BooleanExpressions.d("includeSpiltOrderFulfilmentDetails")))) {
                reader.o();
                onOrderFulfilmentDetails = onOrderFulfilmentDetailsA;
                onDeliveryOrderFulfilmentDetailsA = OnDeliveryOrderFulfilmentDetails.a(reader, customScalarAdapters);
            } else {
                onOrderFulfilmentDetails = onOrderFulfilmentDetailsA;
                onDeliveryOrderFulfilmentDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PastOrderOverview"))) {
                reader.o();
                onPastOrderOverviewA = OnPastOrderOverview.a(reader, customScalarAdapters);
            } else {
                onPastOrderOverviewA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CurrentPickupOrderOverview"))) {
                reader.o();
                b2 = false;
                onCurrentPickupOrderOverviewA = OnCurrentPickupOrderOverview.a(reader, customScalarAdapters);
            } else {
                b2 = false;
                onCurrentPickupOrderOverviewA = null;
            }
            byte b5 = b2;
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderNumberDetails"))) {
                reader.o();
                onOrderNumberDetailsA = OnOrderNumberDetails.a(reader, customScalarAdapters);
            } else {
                onOrderNumberDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DeliveryDriverDetails"))) {
                reader.o();
                b3 = true;
                onDeliveryDriverDetailsA = OnDeliveryDriverDetails.a(reader, customScalarAdapters);
            } else {
                b3 = true;
                onDeliveryDriverDetailsA = null;
            }
            byte b6 = b3;
            if (a.C(set2, set, null, str, BooleanExpressions.c("CurrentDeliveryOrderOverview"))) {
                reader.o();
                b4 = b5;
                onCurrentDeliveryOrderOverviewA = OnCurrentDeliveryOrderOverview.a(reader, customScalarAdapters);
            } else {
                b4 = b5;
                onCurrentDeliveryOrderOverviewA = null;
            }
            BooleanExpression.Element elementC = BooleanExpressions.c("DriverRating");
            BooleanExpression.Element elementD = BooleanExpressions.d("includeDriverRating");
            byte b7 = b4;
            BooleanExpression[] booleanExpressionArr = new BooleanExpression[2];
            booleanExpressionArr[b7 == true ? 1 : 0] = elementC;
            booleanExpressionArr[b6 == true ? 1 : 0] = elementD;
            if (d.C(set2, set, null, str, BooleanExpressions.a(booleanExpressionArr))) {
                reader.o();
                onDriverRatingA = OnDriverRating.a(reader, customScalarAdapters);
            } else {
                onDriverRatingA = null;
            }
            return new GetOrderSummaryQuery.Item1(str, onOrderDetailsDividerA, onOrderPaymentDetailsA, onHorizontalListA, onOrderProofOfDeliveryDetailsA, onCurrentPickupOrderFulfilmentDetailsA, onCurrentPickupLocationTrackingStatusA, onOrderFulfilmentDetails, onPastPickupOrderFulfilmentDetailsA, onDeliveryOrderFulfilmentDetailsA, onPastOrderOverviewA, onCurrentPickupOrderOverviewA, onOrderNumberDetailsA, onDeliveryDriverDetailsA, onCurrentDeliveryOrderOverviewA, onDriverRatingA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Item1 value = (GetOrderSummaryQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19922a);
            GetOrderSummaryQuery.OnOrderDetailsDivider onOrderDetailsDivider = value.b;
            if (onOrderDetailsDivider != null) {
                OnOrderDetailsDivider.b(writer, customScalarAdapters, onOrderDetailsDivider);
            }
            GetOrderSummaryQuery.OnOrderPaymentDetails onOrderPaymentDetails = value.c;
            if (onOrderPaymentDetails != null) {
                OnOrderPaymentDetails.b(writer, customScalarAdapters, onOrderPaymentDetails);
            }
            GetOrderSummaryQuery.OnHorizontalList onHorizontalList = value.d;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails onOrderProofOfDeliveryDetails = value.e;
            if (onOrderProofOfDeliveryDetails != null) {
                OnOrderProofOfDeliveryDetails.b(writer, customScalarAdapters, onOrderProofOfDeliveryDetails);
            }
            GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails onCurrentPickupOrderFulfilmentDetails = value.f;
            if (onCurrentPickupOrderFulfilmentDetails != null) {
                OnCurrentPickupOrderFulfilmentDetails.b(writer, customScalarAdapters, onCurrentPickupOrderFulfilmentDetails);
            }
            GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus onCurrentPickupLocationTrackingStatus = value.g;
            if (onCurrentPickupLocationTrackingStatus != null) {
                OnCurrentPickupLocationTrackingStatus.b(writer, customScalarAdapters, onCurrentPickupLocationTrackingStatus);
            }
            GetOrderSummaryQuery.OnOrderFulfilmentDetails onOrderFulfilmentDetails = value.h;
            if (onOrderFulfilmentDetails != null) {
                OnOrderFulfilmentDetails.b(writer, customScalarAdapters, onOrderFulfilmentDetails);
            }
            GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails onPastPickupOrderFulfilmentDetails = value.i;
            if (onPastPickupOrderFulfilmentDetails != null) {
                OnPastPickupOrderFulfilmentDetails.b(writer, customScalarAdapters, onPastPickupOrderFulfilmentDetails);
            }
            GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails onDeliveryOrderFulfilmentDetails = value.j;
            if (onDeliveryOrderFulfilmentDetails != null) {
                OnDeliveryOrderFulfilmentDetails.b(writer, customScalarAdapters, onDeliveryOrderFulfilmentDetails);
            }
            GetOrderSummaryQuery.OnPastOrderOverview onPastOrderOverview = value.k;
            if (onPastOrderOverview != null) {
                OnPastOrderOverview.b(writer, customScalarAdapters, onPastOrderOverview);
            }
            GetOrderSummaryQuery.OnCurrentPickupOrderOverview onCurrentPickupOrderOverview = value.l;
            if (onCurrentPickupOrderOverview != null) {
                OnCurrentPickupOrderOverview.b(writer, customScalarAdapters, onCurrentPickupOrderOverview);
            }
            GetOrderSummaryQuery.OnOrderNumberDetails onOrderNumberDetails = value.m;
            if (onOrderNumberDetails != null) {
                OnOrderNumberDetails.b(writer, customScalarAdapters, onOrderNumberDetails);
            }
            GetOrderSummaryQuery.OnDeliveryDriverDetails onDeliveryDriverDetails = value.n;
            if (onDeliveryDriverDetails != null) {
                OnDeliveryDriverDetails.b(writer, customScalarAdapters, onDeliveryDriverDetails);
            }
            GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview onCurrentDeliveryOrderOverview = value.o;
            if (onCurrentDeliveryOrderOverview != null) {
                OnCurrentDeliveryOrderOverview.b(writer, customScalarAdapters, onCurrentDeliveryOrderOverview);
            }
            GetOrderSummaryQuery.OnDriverRating onDriverRating = value.p;
            if (onDriverRating != null) {
                OnDriverRating.b(writer, customScalarAdapters, onDriverRating);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Item2;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<GetOrderSummaryQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f20095a = new Item2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.OnOrderDetailsProductCard onOrderDetailsProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("OrderDetailsProductCard"))) {
                reader.o();
                onOrderDetailsProductCardA = OnOrderDetailsProductCard.a(reader, customScalarAdapters);
            }
            return new GetOrderSummaryQuery.Item2(str, onOrderDetailsProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Item2 value = (GetOrderSummaryQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19923a);
            GetOrderSummaryQuery.OnOrderDetailsProductCard onOrderDetailsProductCard = value.b;
            if (onOrderDetailsProductCard != null) {
                OnOrderDetailsProductCard.b(writer, customScalarAdapters, onOrderDetailsProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$LiveTrackingButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LiveTrackingButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LiveTrackingButton implements Adapter<GetOrderSummaryQuery.LiveTrackingButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final LiveTrackingButton f20096a = new LiveTrackingButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "enabled", "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.LiveTrackingButton(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.LiveTrackingButton value = (GetOrderSummaryQuery.LiveTrackingButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19924a);
            writer.F1("enabled");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "url");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$LocationPermissionButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationPermissionButton implements Adapter<GetOrderSummaryQuery.LocationPermissionButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final LocationPermissionButton f20097a = new LocationPermissionButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.LocationPermissionButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.LocationPermissionButton value = (GetOrderSummaryQuery.LocationPermissionButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19925a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$LocationPermissionButton1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionButton1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationPermissionButton1 implements Adapter<GetOrderSummaryQuery.LocationPermissionButton1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LocationPermissionButton1 f20098a = new LocationPermissionButton1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.LocationPermissionButton1(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.LocationPermissionButton1 value = (GetOrderSummaryQuery.LocationPermissionButton1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19926a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$LocationPermissionsWereNotSet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationPermissionsWereNotSet;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationPermissionsWereNotSet implements Adapter<GetOrderSummaryQuery.LocationPermissionsWereNotSet> {

        /* renamed from: a, reason: collision with root package name */
        public static final LocationPermissionsWereNotSet f20099a = new LocationPermissionsWereNotSet();
        public static final List b = CollectionsKt.R("header", "rationales", "locationPermissionButtons", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Rationale.f20130a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson2 = Adapters.a(Adapters.c(LocationPermissionButton.f20097a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "rationales");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "locationPermissionButtons");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.LocationPermissionsWereNotSet(str, str2, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.LocationPermissionsWereNotSet value = (GetOrderSummaryQuery.LocationPermissionsWereNotSet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19927a);
            writer.F1("rationales");
            Adapters.a(Adapters.c(Rationale.f20130a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("locationPermissionButtons");
            Adapters.a(Adapters.c(LocationPermissionButton.f20097a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$LocationTrackingPrimingPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$LocationTrackingPrimingPage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationTrackingPrimingPage implements Adapter<GetOrderSummaryQuery.LocationTrackingPrimingPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final LocationTrackingPrimingPage f20100a = new LocationTrackingPrimingPage();
        public static final List b = CollectionsKt.R("locationPermissionsWereNotSet", "doNotAllowWasSetEarlier");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.LocationPermissionsWereNotSet locationPermissionsWereNotSet = null;
            GetOrderSummaryQuery.DoNotAllowWasSetEarlier doNotAllowWasSetEarlier = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    locationPermissionsWereNotSet = (GetOrderSummaryQuery.LocationPermissionsWereNotSet) Adapters.c(LocationPermissionsWereNotSet.f20099a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    doNotAllowWasSetEarlier = (GetOrderSummaryQuery.DoNotAllowWasSetEarlier) Adapters.c(DoNotAllowWasSetEarlier.f20071a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (locationPermissionsWereNotSet == null) {
                Assertions.a(reader, "locationPermissionsWereNotSet");
                throw null;
            }
            if (doNotAllowWasSetEarlier != null) {
                return new GetOrderSummaryQuery.LocationTrackingPrimingPage(locationPermissionsWereNotSet, doNotAllowWasSetEarlier);
            }
            Assertions.a(reader, "doNotAllowWasSetEarlier");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.LocationTrackingPrimingPage value = (GetOrderSummaryQuery.LocationTrackingPrimingPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("locationPermissionsWereNotSet");
            Adapters.c(LocationPermissionsWereNotSet.f20099a, false).toJson(writer, customScalarAdapters, value.f19928a);
            writer.F1("doNotAllowWasSetEarlier");
            Adapters.c(DoNotAllowWasSetEarlier.f20071a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$MarketSubtotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$MarketSubtotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketSubtotal implements Adapter<GetOrderSummaryQuery.MarketSubtotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketSubtotal f20101a = new MarketSubtotal();
        public static final List b = CollectionsKt.R("title", "amount", "__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str3 != null) {
                return new GetOrderSummaryQuery.MarketSubtotal(str, str2, str3);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.MarketSubtotal value = (GetOrderSummaryQuery.MarketSubtotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19929a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnCurrentDeliveryOrderOverview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentDeliveryOrderOverview;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCurrentDeliveryOrderOverview implements Adapter<GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20102a = CollectionsKt.R("insetBanners", "bannerAnalyticLabels", "changeOrderButton", "cancelOrderButton", "progressStepper", "tooltip", "instructionsMd", "helpMd", "orderSubtitle", "orderTitle", "orderSubtitleIcon", "liveTrackingMapUrl");

        public static GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            GetOrderSummaryQuery.ChangeOrderButton2 changeOrderButton2 = null;
            GetOrderSummaryQuery.CancelOrderButton2 cancelOrderButton2 = null;
            GetOrderSummaryQuery.ProgressStepper1 progressStepper1 = null;
            GetOrderSummaryQuery.Tooltip1 tooltip1 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            OrderSubtitleIcon orderSubtitleIcon = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(f20102a)) {
                    case 0:
                        arrayListFromJson = Adapters.a(Adapters.c(InsetBanner4.f20092a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        arrayListFromJson2 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        changeOrderButton2 = (GetOrderSummaryQuery.ChangeOrderButton2) Adapters.b(Adapters.c(ChangeOrderButton2.f20053a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        cancelOrderButton2 = (GetOrderSummaryQuery.CancelOrderButton2) Adapters.b(Adapters.c(CancelOrderButton2.f20049a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        progressStepper1 = (GetOrderSummaryQuery.ProgressStepper1) Adapters.b(Adapters.c(ProgressStepper1.f20128a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        tooltip1 = (GetOrderSummaryQuery.Tooltip1) Adapters.b(Adapters.c(Tooltip1.f20144a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        orderSubtitleIcon = (OrderSubtitleIcon) Adapters.b(OrderSubtitleIcon_ResponseAdapter.f12093a).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "insetBanners");
                            throw null;
                        }
                        if (arrayListFromJson2 != null) {
                            return new GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview(arrayListFromJson, arrayListFromJson2, changeOrderButton2, cancelOrderButton2, progressStepper1, tooltip1, str, str2, str3, str4, orderSubtitleIcon, str5);
                        }
                        Assertions.a(reader, "bannerAnalyticLabels");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetBanners");
            Adapters.a(Adapters.c(InsetBanner4.f20092a, false)).toJson(writer, customScalarAdapters, value.f19930a);
            writer.F1("bannerAnalyticLabels");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("changeOrderButton");
            Adapters.b(Adapters.c(ChangeOrderButton2.f20053a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("cancelOrderButton");
            Adapters.b(Adapters.c(CancelOrderButton2.f20049a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("progressStepper");
            Adapters.b(Adapters.c(ProgressStepper1.f20128a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("tooltip");
            Adapters.b(Adapters.c(Tooltip1.f20144a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("instructionsMd");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("helpMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("orderSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("orderTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("orderSubtitleIcon");
            Adapters.b(OrderSubtitleIcon_ResponseAdapter.f12093a).toJson(writer, customScalarAdapters, value.k);
            writer.F1("liveTrackingMapUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.l);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnCurrentDeliveryOrderOverview) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnCurrentPickupLocationTrackingStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupLocationTrackingStatus;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCurrentPickupLocationTrackingStatus implements Adapter<GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20103a = CollectionsKt.R("__typename", "title", lqlqqlq.mmm006Dm006Dm, "image");

        public static GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            LocationTrackingStatusImage locationTrackingStatusImageA = null;
            while (true) {
                int iO2 = reader.o2(f20103a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    locationTrackingStatusImageA = LocationTrackingStatusImage_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (locationTrackingStatusImageA != null) {
                return new GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus(str, str2, str3, locationTrackingStatusImageA);
            }
            Assertions.a(reader, "image");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19931a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("image");
            writer.v0(value.d.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnCurrentPickupLocationTrackingStatus) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnCurrentPickupOrderFulfilmentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupOrderFulfilmentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCurrentPickupOrderFulfilmentDetails implements Adapter<GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20104a = CollectionsKt.R("storeDetails", "collectionDetails");

        public static GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.StoreDetails storeDetails = null;
            GetOrderSummaryQuery.CollectionDetails collectionDetails = null;
            while (true) {
                int iO2 = reader.o2(f20104a);
                if (iO2 == 0) {
                    storeDetails = (GetOrderSummaryQuery.StoreDetails) Adapters.c(StoreDetails.f20138a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    collectionDetails = (GetOrderSummaryQuery.CollectionDetails) Adapters.c(CollectionDetails.f20057a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (storeDetails == null) {
                Assertions.a(reader, "storeDetails");
                throw null;
            }
            if (collectionDetails != null) {
                return new GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails(storeDetails, collectionDetails);
            }
            Assertions.a(reader, "collectionDetails");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeDetails");
            Adapters.c(StoreDetails.f20138a, false).toJson(writer, customScalarAdapters, value.f19932a);
            writer.F1("collectionDetails");
            Adapters.c(CollectionDetails.f20057a, false).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnCurrentPickupOrderFulfilmentDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnCurrentPickupOrderOverview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnCurrentPickupOrderOverview;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCurrentPickupOrderOverview implements Adapter<GetOrderSummaryQuery.OnCurrentPickupOrderOverview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20105a = CollectionsKt.R("progressStepper", "progressStepperForCollectedState", "tooltip", "orderTitle", "orderSubtitle", "orderSubtitleIcon", "instructionsMd", "helpMd", "changeOrderButton", "cancelOrderButton", "checkInNowButton", "collectionBanner", "bayNumberPreferences", "checkInOnMyWayButton", "onMyWayPreferences", "locationTrackingEnabled", "locationTrackingPrimingPage", "banner", "handoverBanner");

        public static GetOrderSummaryQuery.OnCurrentPickupOrderOverview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            GetOrderSummaryQuery.ProgressStepper progressStepper = null;
            GetOrderSummaryQuery.ProgressStepperForCollectedState progressStepperForCollectedState = null;
            GetOrderSummaryQuery.Tooltip tooltip = null;
            String str = null;
            String str2 = null;
            OrderSubtitleIcon orderSubtitleIcon = null;
            String str3 = null;
            String str4 = null;
            GetOrderSummaryQuery.ChangeOrderButton1 changeOrderButton1 = null;
            GetOrderSummaryQuery.CancelOrderButton1 cancelOrderButton1 = null;
            GetOrderSummaryQuery.CheckInNowButton checkInNowButton = null;
            GetOrderSummaryQuery.CollectionBanner collectionBanner = null;
            GetOrderSummaryQuery.BayNumberPreferences bayNumberPreferences = null;
            GetOrderSummaryQuery.CheckInOnMyWayButton checkInOnMyWayButton = null;
            GetOrderSummaryQuery.OnMyWayPreferences onMyWayPreferences = null;
            GetOrderSummaryQuery.LocationTrackingPrimingPage locationTrackingPrimingPage = null;
            GetOrderSummaryQuery.Banner banner = null;
            GetOrderSummaryQuery.HandoverBanner handoverBanner = null;
            while (true) {
                switch (reader.o2(f20105a)) {
                    case 0:
                        bool = bool2;
                        progressStepper = (GetOrderSummaryQuery.ProgressStepper) Adapters.b(Adapters.c(ProgressStepper.f20127a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        progressStepperForCollectedState = (GetOrderSummaryQuery.ProgressStepperForCollectedState) Adapters.b(Adapters.c(ProgressStepperForCollectedState.f20129a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        tooltip = (GetOrderSummaryQuery.Tooltip) Adapters.b(Adapters.c(Tooltip.f20143a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        orderSubtitleIcon = (OrderSubtitleIcon) Adapters.b(OrderSubtitleIcon_ResponseAdapter.f12093a).fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        bool = bool2;
                        changeOrderButton1 = (GetOrderSummaryQuery.ChangeOrderButton1) Adapters.b(Adapters.c(ChangeOrderButton1.f20052a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bool = bool2;
                        cancelOrderButton1 = (GetOrderSummaryQuery.CancelOrderButton1) Adapters.b(Adapters.c(CancelOrderButton1.f20048a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        bool = bool2;
                        checkInNowButton = (GetOrderSummaryQuery.CheckInNowButton) Adapters.b(Adapters.c(CheckInNowButton.f20054a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        bool = bool2;
                        collectionBanner = (GetOrderSummaryQuery.CollectionBanner) Adapters.b(Adapters.c(CollectionBanner.f20056a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        bool = bool2;
                        bayNumberPreferences = (GetOrderSummaryQuery.BayNumberPreferences) Adapters.b(Adapters.c(BayNumberPreferences.f20043a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        bool = bool2;
                        checkInOnMyWayButton = (GetOrderSummaryQuery.CheckInOnMyWayButton) Adapters.b(Adapters.c(CheckInOnMyWayButton.f20055a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        bool = bool2;
                        onMyWayPreferences = (GetOrderSummaryQuery.OnMyWayPreferences) Adapters.b(Adapters.c(OnMyWayPreferences.f20112a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 16:
                        bool = bool2;
                        locationTrackingPrimingPage = (GetOrderSummaryQuery.LocationTrackingPrimingPage) Adapters.b(Adapters.c(LocationTrackingPrimingPage.f20100a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        bool = bool2;
                        banner = (GetOrderSummaryQuery.Banner) Adapters.b(Adapters.c(Banner.f20042a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        bool = bool2;
                        handoverBanner = (GetOrderSummaryQuery.HandoverBanner) Adapters.b(Adapters.c(HandoverBanner.f20083a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (bool3 != null) {
                            return new GetOrderSummaryQuery.OnCurrentPickupOrderOverview(progressStepper, progressStepperForCollectedState, tooltip, str, str2, orderSubtitleIcon, str3, str4, changeOrderButton1, cancelOrderButton1, checkInNowButton, collectionBanner, bayNumberPreferences, checkInOnMyWayButton, onMyWayPreferences, bool3.booleanValue(), locationTrackingPrimingPage, banner, handoverBanner);
                        }
                        Assertions.a(reader, "locationTrackingEnabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnCurrentPickupOrderOverview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("progressStepper");
            Adapters.b(Adapters.c(ProgressStepper.f20127a, false)).toJson(writer, customScalarAdapters, value.f19933a);
            writer.F1("progressStepperForCollectedState");
            Adapters.b(Adapters.c(ProgressStepperForCollectedState.f20129a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("tooltip");
            Adapters.b(Adapters.c(Tooltip.f20143a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("orderTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("orderSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("orderSubtitleIcon");
            Adapters.b(OrderSubtitleIcon_ResponseAdapter.f12093a).toJson(writer, customScalarAdapters, value.f);
            writer.F1("instructionsMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("helpMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("changeOrderButton");
            Adapters.b(Adapters.c(ChangeOrderButton1.f20052a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("cancelOrderButton");
            Adapters.b(Adapters.c(CancelOrderButton1.f20048a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("checkInNowButton");
            Adapters.b(Adapters.c(CheckInNowButton.f20054a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("collectionBanner");
            Adapters.b(Adapters.c(CollectionBanner.f20056a, false)).toJson(writer, customScalarAdapters, value.l);
            writer.F1("bayNumberPreferences");
            Adapters.b(Adapters.c(BayNumberPreferences.f20043a, false)).toJson(writer, customScalarAdapters, value.m);
            writer.F1("checkInOnMyWayButton");
            Adapters.b(Adapters.c(CheckInOnMyWayButton.f20055a, false)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("onMyWayPreferences");
            Adapters.b(Adapters.c(OnMyWayPreferences.f20112a, false)).toJson(writer, customScalarAdapters, value.o);
            writer.F1("locationTrackingEnabled");
            d.B(value.p, Adapters.f, writer, customScalarAdapters, "locationTrackingPrimingPage");
            Adapters.b(Adapters.c(LocationTrackingPrimingPage.f20100a, false)).toJson(writer, customScalarAdapters, value.q);
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.f20042a, false)).toJson(writer, customScalarAdapters, value.r);
            writer.F1("handoverBanner");
            Adapters.b(Adapters.c(HandoverBanner.f20083a, false)).toJson(writer, customScalarAdapters, value.s);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnCurrentPickupOrderOverview) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnDeliveryDriverDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDeliveryDriverDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryDriverDetails implements Adapter<GetOrderSummaryQuery.OnDeliveryDriverDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20106a = CollectionsKt.R("driverName", "deliveryPartner", "iconUrl", "insetBanner", "liveTrackingButton", "deliveryTooltip");

        public static GetOrderSummaryQuery.OnDeliveryDriverDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            GetOrderSummaryQuery.InsetBanner3 insetBanner3 = null;
            GetOrderSummaryQuery.LiveTrackingButton liveTrackingButton = null;
            GetOrderSummaryQuery.DeliveryTooltip deliveryTooltip = null;
            while (true) {
                int iO2 = reader.o2(f20106a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    insetBanner3 = (GetOrderSummaryQuery.InsetBanner3) Adapters.b(Adapters.c(InsetBanner3.f20091a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    liveTrackingButton = (GetOrderSummaryQuery.LiveTrackingButton) Adapters.b(Adapters.c(LiveTrackingButton.f20096a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    deliveryTooltip = (GetOrderSummaryQuery.DeliveryTooltip) Adapters.b(Adapters.c(DeliveryTooltip.f20069a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "driverName");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.OnDeliveryDriverDetails(str, str2, str3, insetBanner3, liveTrackingButton, deliveryTooltip);
            }
            Assertions.a(reader, "deliveryPartner");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnDeliveryDriverDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("driverName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19934a);
            writer.F1("deliveryPartner");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner3.f20091a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("liveTrackingButton");
            Adapters.b(Adapters.c(LiveTrackingButton.f20096a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("deliveryTooltip");
            Adapters.b(Adapters.c(DeliveryTooltip.f20069a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnDeliveryDriverDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnDeliveryOrderFulfilmentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDeliveryOrderFulfilmentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryOrderFulfilmentDetails implements Adapter<GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20107a = CollectionsKt.R("title", "fulfilmentItems", "deliveryInstructions");

        public static GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            GetOrderSummaryQuery.DeliveryInstructions1 deliveryInstructions1 = null;
            while (true) {
                int iO2 = reader.o2(f20107a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(FulfilmentItem2.f20082a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    deliveryInstructions1 = (GetOrderSummaryQuery.DeliveryInstructions1) Adapters.b(Adapters.c(DeliveryInstructions1.f20067a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails(str, arrayListFromJson, deliveryInstructions1);
            }
            Assertions.a(reader, "fulfilmentItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19935a);
            writer.F1("fulfilmentItems");
            Adapters.a(Adapters.c(FulfilmentItem2.f20082a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("deliveryInstructions");
            Adapters.b(Adapters.c(DeliveryInstructions1.f20067a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnDeliveryOrderFulfilmentDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnDriverRating;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnDriverRating;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDriverRating implements Adapter<GetOrderSummaryQuery.OnDriverRating> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20108a = CollectionsKt.R("surveyId", "starsRatingStep", "feedbackAndCommentsStep", "thankYouStep", "orderNumber");

        public static GetOrderSummaryQuery.OnDriverRating a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            GetOrderSummaryQuery.StarsRatingStep starsRatingStep = null;
            GetOrderSummaryQuery.FeedbackAndCommentsStep feedbackAndCommentsStep = null;
            GetOrderSummaryQuery.ThankYouStep thankYouStep = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20108a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    starsRatingStep = (GetOrderSummaryQuery.StarsRatingStep) Adapters.b(Adapters.c(StarsRatingStep.f20135a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    feedbackAndCommentsStep = (GetOrderSummaryQuery.FeedbackAndCommentsStep) Adapters.b(Adapters.c(FeedbackAndCommentsStep.f20078a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    thankYouStep = (GetOrderSummaryQuery.ThankYouStep) Adapters.b(Adapters.c(ThankYouStep.f20142a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "surveyId");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.OnDriverRating(str, starsRatingStep, feedbackAndCommentsStep, thankYouStep, str2);
            }
            Assertions.a(reader, "orderNumber");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnDriverRating value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("surveyId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19936a);
            writer.F1("starsRatingStep");
            Adapters.b(Adapters.c(StarsRatingStep.f20135a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("feedbackAndCommentsStep");
            Adapters.b(Adapters.c(FeedbackAndCommentsStep.f20078a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("thankYouStep");
            Adapters.b(Adapters.c(ThankYouStep.f20142a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("orderNumber");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnDriverRating) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnHorizontalList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<GetOrderSummaryQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20109a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "items", "__typename", "insetBanner", "badges");

        public static GetOrderSummaryQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            String str4 = null;
            GetOrderSummaryQuery.InsetBanner insetBanner = null;
            List list = null;
            while (true) {
                switch (reader.o2(f20109a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson = Adapters.a(Adapters.c(Item2.f20095a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        insetBanner = (GetOrderSummaryQuery.InsetBanner) Adapters.b(Adapters.c(InsetBanner.f20088a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Badge.f20041a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "items");
                            throw null;
                        }
                        if (str4 != null) {
                            return new GetOrderSummaryQuery.OnHorizontalList(str, str2, str3, arrayListFromJson, str4, insetBanner, list);
                        }
                        Assertions.a(reader, "__typename");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19937a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f20095a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner.f20088a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("badges");
            Adapters.b(Adapters.a(Adapters.c(Badge.f20041a, true))).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnHostedIcon;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<GetOrderSummaryQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20110a = CollectionsKt.Q("url");

        public static GetOrderSummaryQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20110a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOrderSummaryQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19938a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnMyGroceriesProductListBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnMyGroceriesProductListBadge;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyGroceriesProductListBadge implements Adapter<GetOrderSummaryQuery.OnMyGroceriesProductListBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20111a = CollectionsKt.R("myGroceriesProductListBadgeLabel", "myGroceriesProductListBadgeType");

        public static GetOrderSummaryQuery.OnMyGroceriesProductListBadge a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            MyGroceriesProductListBadgeType myGroceriesProductListBadgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(f20111a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    myGroceriesProductListBadgeTypeA = MyGroceriesProductListBadgeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "myGroceriesProductListBadgeLabel");
                throw null;
            }
            if (myGroceriesProductListBadgeTypeA != null) {
                return new GetOrderSummaryQuery.OnMyGroceriesProductListBadge(str, myGroceriesProductListBadgeTypeA);
            }
            Assertions.a(reader, "myGroceriesProductListBadgeType");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnMyGroceriesProductListBadge value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("myGroceriesProductListBadgeLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19939a);
            writer.F1("myGroceriesProductListBadgeType");
            writer.v0(value.b.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnMyGroceriesProductListBadge) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnMyWayPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnMyWayPreferences;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyWayPreferences implements Adapter<GetOrderSummaryQuery.OnMyWayPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnMyWayPreferences f20112a = new OnMyWayPreferences();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "eta", "etaType", "etaDefaultIndex", "confirmButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            GetOrderSummaryQuery.ConfirmButton1 confirmButton1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = num2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = num2;
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    num = num2;
                    confirmButton1 = (GetOrderSummaryQuery.ConfirmButton1) Adapters.c(ConfirmButton1.f20059a, false).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "eta");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "etaType");
                throw null;
            }
            if (num3 == null) {
                Assertions.a(reader, "etaDefaultIndex");
                throw null;
            }
            int iIntValue = num3.intValue();
            if (confirmButton1 != null) {
                return new GetOrderSummaryQuery.OnMyWayPreferences(str, str2, arrayListFromJson, str3, iIntValue, confirmButton1);
            }
            Assertions.a(reader, "confirmButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.OnMyWayPreferences value = (GetOrderSummaryQuery.OnMyWayPreferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19940a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("eta");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("etaType");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("etaDefaultIndex");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, "confirmButton");
            Adapters.c(ConfirmButton1.f20059a, false).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderDetailsDivider;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderDetailsDivider;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderDetailsDivider implements Adapter<GetOrderSummaryQuery.OnOrderDetailsDivider> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20113a = CollectionsKt.R("dummyField", "__typename");

        public static GetOrderSummaryQuery.OnOrderDetailsDivider a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f20113a);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetOrderSummaryQuery.OnOrderDetailsDivider(str, bool);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderDetailsDivider value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("dummyField");
            Adapters.l.toJson(writer, customScalarAdapters, value.f19941a);
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderDetailsDivider) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderDetailsProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderDetailsProductCard;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderDetailsProductCard implements Adapter<GetOrderSummaryQuery.OnOrderDetailsProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20114a = CollectionsKt.R("stockcode", AppMeasurementSdk.ConditionalUserProperty.NAME, "imagePath", "quantity", "salesPrice", "pricePerUnit", "__typename");

        public static GetOrderSummaryQuery.OnOrderDetailsProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Double d2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(f20114a)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (num == null) {
                            Assertions.a(reader, "stockcode");
                            throw null;
                        }
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "imagePath");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        double dDoubleValue = d3.doubleValue();
                        if (str3 == null) {
                            Assertions.a(reader, "salesPrice");
                            throw null;
                        }
                        if (str5 != null) {
                            return new GetOrderSummaryQuery.OnOrderDetailsProductCard(iIntValue, str, str2, dDoubleValue, str3, str4, str5);
                        }
                        Assertions.a(reader, "__typename");
                        throw null;
                }
                d2 = d;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderDetailsProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("stockcode");
            d.y(value.f19942a, Adapters.b, writer, customScalarAdapters, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imagePath");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("salesPrice");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("pricePerUnit");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderDetailsProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderFulfilmentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderFulfilmentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderFulfilmentDetails implements Adapter<GetOrderSummaryQuery.OnOrderFulfilmentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20115a = CollectionsKt.R("title", "fulfilmentItems", "deliveryInstructions");

        public static GetOrderSummaryQuery.OnOrderFulfilmentDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            GetOrderSummaryQuery.DeliveryInstructions deliveryInstructions = null;
            while (true) {
                int iO2 = reader.o2(f20115a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(FulfilmentItem.f20080a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    deliveryInstructions = (GetOrderSummaryQuery.DeliveryInstructions) Adapters.b(Adapters.c(DeliveryInstructions.f20066a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.OnOrderFulfilmentDetails(str, arrayListFromJson, deliveryInstructions);
            }
            Assertions.a(reader, "fulfilmentItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderFulfilmentDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19943a);
            writer.F1("fulfilmentItems");
            Adapters.a(Adapters.c(FulfilmentItem.f20080a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("deliveryInstructions");
            Adapters.b(Adapters.c(DeliveryInstructions.f20066a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderFulfilmentDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderNumberDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderNumberDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderNumberDetails implements Adapter<GetOrderSummaryQuery.OnOrderNumberDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20116a = CollectionsKt.R("title", "orderNumber");

        public static GetOrderSummaryQuery.OnOrderNumberDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20116a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.OnOrderNumberDetails(str, str2);
            }
            Assertions.a(reader, "orderNumber");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderNumberDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19944a);
            writer.F1("orderNumber");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderNumberDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderPaymentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderPaymentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderPaymentDetails implements Adapter<GetOrderSummaryQuery.OnOrderPaymentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20117a = CollectionsKt.R("total", "subTotal", "marketSubtotal", "paymentMethods", "discounts", "savingsAndRewards", "refunds", "refundTotal", "disclaimer");

        public static GetOrderSummaryQuery.OnOrderPaymentDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            ArrayList arrayListFromJson4 = null;
            ArrayList arrayListFromJson5 = null;
            ArrayList arrayListFromJson6 = null;
            ArrayList arrayListFromJson7 = null;
            ArrayList arrayListFromJson8 = null;
            String str = null;
            while (true) {
                switch (reader.o2(f20117a)) {
                    case 0:
                        arrayListFromJson = Adapters.a(Adapters.c(Total.f20145a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        arrayListFromJson2 = Adapters.a(Adapters.b(Adapters.c(SubTotal.f20139a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        arrayListFromJson3 = Adapters.a(Adapters.b(Adapters.c(MarketSubtotal.f20101a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson4 = Adapters.a(Adapters.c(PaymentMethod.f20126a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson5 = Adapters.a(Adapters.b(Adapters.c(Discount.f20070a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson6 = Adapters.a(Adapters.b(Adapters.c(SavingsAndReward.f20134a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson7 = Adapters.a(Adapters.b(Adapters.c(Refund.f20132a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson8 = Adapters.a(Adapters.b(Adapters.c(RefundTotal.f20133a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "subTotal");
                            throw null;
                        }
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, "marketSubtotal");
                            throw null;
                        }
                        if (arrayListFromJson4 == null) {
                            Assertions.a(reader, "paymentMethods");
                            throw null;
                        }
                        if (arrayListFromJson5 == null) {
                            Assertions.a(reader, "discounts");
                            throw null;
                        }
                        if (arrayListFromJson6 == null) {
                            Assertions.a(reader, "savingsAndRewards");
                            throw null;
                        }
                        if (arrayListFromJson7 == null) {
                            Assertions.a(reader, "refunds");
                            throw null;
                        }
                        if (arrayListFromJson8 != null) {
                            return new GetOrderSummaryQuery.OnOrderPaymentDetails(arrayListFromJson, arrayListFromJson2, arrayListFromJson3, arrayListFromJson4, arrayListFromJson5, arrayListFromJson6, arrayListFromJson7, arrayListFromJson8, str);
                        }
                        Assertions.a(reader, "refundTotal");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderPaymentDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("total");
            Adapters.a(Adapters.c(Total.f20145a, false)).toJson(writer, customScalarAdapters, value.f19945a);
            writer.F1("subTotal");
            Adapters.a(Adapters.b(Adapters.c(SubTotal.f20139a, false))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("marketSubtotal");
            Adapters.a(Adapters.b(Adapters.c(MarketSubtotal.f20101a, false))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("paymentMethods");
            Adapters.a(Adapters.c(PaymentMethod.f20126a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("discounts");
            Adapters.a(Adapters.b(Adapters.c(Discount.f20070a, false))).toJson(writer, customScalarAdapters, value.e);
            writer.F1("savingsAndRewards");
            Adapters.a(Adapters.b(Adapters.c(SavingsAndReward.f20134a, false))).toJson(writer, customScalarAdapters, value.f);
            writer.F1("refunds");
            Adapters.a(Adapters.b(Adapters.c(Refund.f20132a, false))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("refundTotal");
            Adapters.a(Adapters.b(Adapters.c(RefundTotal.f20133a, false))).toJson(writer, customScalarAdapters, value.h);
            writer.F1("disclaimer");
            Adapters.i.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderPaymentDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnOrderProofOfDeliveryDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnOrderProofOfDeliveryDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderProofOfDeliveryDetails implements Adapter<GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20118a = CollectionsKt.R("title", "insetBanner", "imageUrl", "footnote");

        public static GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            GetOrderSummaryQuery.InsetBanner1 insetBanner1 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f20118a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBanner1 = (GetOrderSummaryQuery.InsetBanner1) Adapters.b(Adapters.c(InsetBanner1.f20089a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails(str, insetBanner1, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19946a);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner1.f20089a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("footnote");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnOrderProofOfDeliveryDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnPastOrderOverview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnPastOrderOverview;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPastOrderOverview implements Adapter<GetOrderSummaryQuery.OnPastOrderOverview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20119a = CollectionsKt.R("insetBanner", "orderDetailsStatus", "orderTime", "orderDetailSummary", "changeOrderButton", "cancelOrderButton", "viewInvoiceButton", "instructionsMd", "helpMd");

        public static GetOrderSummaryQuery.OnPastOrderOverview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetOrderSummaryQuery.InsetBanner2 insetBanner2 = null;
            GetOrderSummaryQuery.OrderDetailsStatus orderDetailsStatus = null;
            GetOrderSummaryQuery.OrderTime orderTime = null;
            GetOrderSummaryQuery.OrderDetailSummary orderDetailSummary = null;
            GetOrderSummaryQuery.ChangeOrderButton changeOrderButton = null;
            GetOrderSummaryQuery.CancelOrderButton cancelOrderButton = null;
            GetOrderSummaryQuery.ViewInvoiceButton viewInvoiceButton = null;
            String str = null;
            String str2 = null;
            while (true) {
                switch (reader.o2(f20119a)) {
                    case 0:
                        insetBanner2 = (GetOrderSummaryQuery.InsetBanner2) Adapters.b(Adapters.c(InsetBanner2.f20090a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        orderDetailsStatus = (GetOrderSummaryQuery.OrderDetailsStatus) Adapters.c(OrderDetailsStatus.f20122a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        orderTime = (GetOrderSummaryQuery.OrderTime) Adapters.b(Adapters.c(OrderTime.f20124a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        orderDetailSummary = (GetOrderSummaryQuery.OrderDetailSummary) Adapters.b(Adapters.c(OrderDetailSummary.f20121a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        changeOrderButton = (GetOrderSummaryQuery.ChangeOrderButton) Adapters.b(Adapters.c(ChangeOrderButton.f20051a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        cancelOrderButton = (GetOrderSummaryQuery.CancelOrderButton) Adapters.b(Adapters.c(CancelOrderButton.f20047a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        viewInvoiceButton = (GetOrderSummaryQuery.ViewInvoiceButton) Adapters.b(Adapters.c(ViewInvoiceButton.f20146a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (orderDetailsStatus != null) {
                            return new GetOrderSummaryQuery.OnPastOrderOverview(insetBanner2, orderDetailsStatus, orderTime, orderDetailSummary, changeOrderButton, cancelOrderButton, viewInvoiceButton, str, str2);
                        }
                        Assertions.a(reader, "orderDetailsStatus");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnPastOrderOverview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner2.f20090a, false)).toJson(writer, customScalarAdapters, value.f19947a);
            writer.F1("orderDetailsStatus");
            Adapters.c(OrderDetailsStatus.f20122a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("orderTime");
            Adapters.b(Adapters.c(OrderTime.f20124a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("orderDetailSummary");
            Adapters.b(Adapters.c(OrderDetailSummary.f20121a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("changeOrderButton");
            Adapters.b(Adapters.c(ChangeOrderButton.f20051a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("cancelOrderButton");
            Adapters.b(Adapters.c(CancelOrderButton.f20047a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("viewInvoiceButton");
            Adapters.b(Adapters.c(ViewInvoiceButton.f20146a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("instructionsMd");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("helpMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnPastOrderOverview) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OnPastPickupOrderFulfilmentDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OnPastPickupOrderFulfilmentDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPastPickupOrderFulfilmentDetails implements Adapter<GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20120a = CollectionsKt.R("fulfilmentItems", "title");

        public static GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f20120a);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(FulfilmentItem1.f20081a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "fulfilmentItems");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails(str, arrayListFromJson);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentItems");
            Adapters.a(Adapters.c(FulfilmentItem1.f20081a, false)).toJson(writer, customScalarAdapters, value.f19948a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (GetOrderSummaryQuery.OnPastPickupOrderFulfilmentDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OrderDetailSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderDetailSummary;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDetailSummary implements Adapter<GetOrderSummaryQuery.OrderDetailSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderDetailSummary f20121a = new OrderDetailSummary();
        public static final List b = CollectionsKt.R("orderNumber", "orderedDate");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "orderNumber");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.OrderDetailSummary(str, str2);
            }
            Assertions.a(reader, "orderedDate");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.OrderDetailSummary value = (GetOrderSummaryQuery.OrderDetailSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderNumber");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19949a);
            writer.F1("orderedDate");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OrderDetailsStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderDetailsStatus;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDetailsStatus implements Adapter<GetOrderSummaryQuery.OrderDetailsStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderDetailsStatus f20122a = new OrderDetailsStatus();
        public static final List b = CollectionsKt.R("status", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OrderStatusType orderStatusTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    orderStatusTypeA = OrderStatusType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (orderStatusTypeA == null) {
                Assertions.a(reader, "status");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.OrderDetailsStatus(orderStatusTypeA, str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.OrderDetailsStatus value = (GetOrderSummaryQuery.OrderDetailsStatus) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("status");
            OrderStatusType_ResponseAdapter.b(writer, customScalarAdapters, value.f19950a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OrderSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderSummary;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderSummary implements Adapter<GetOrderSummaryQuery.OrderSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderSummary f20123a = new OrderSummary();
        public static final List b = CollectionsKt.R("orderId", "helpList", "feed", "cancelWarning", "editOrderWarning", "fulfilmentMethod", "progress", "progressDetail", "showDelightAnimation", "status");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            GetOrderSummaryQuery.HelpList helpList = null;
            GetOrderSummaryQuery.Feed feed = null;
            GetOrderSummaryQuery.CancelWarning cancelWarning = null;
            GetOrderSummaryQuery.EditOrderWarning editOrderWarning = null;
            OrderFulfilmentType orderFulfilmentTypeA = null;
            String str = null;
            String str2 = null;
            OrderStatusType orderStatusTypeA = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool = bool2;
                        helpList = (GetOrderSummaryQuery.HelpList) Adapters.b(Adapters.c(HelpList.f20085a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        feed = (GetOrderSummaryQuery.Feed) Adapters.c(Feed.f20077a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        cancelWarning = (GetOrderSummaryQuery.CancelWarning) Adapters.c(CancelWarning.f20050a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        editOrderWarning = (GetOrderSummaryQuery.EditOrderWarning) Adapters.c(EditOrderWarning.f20074a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        orderFulfilmentTypeA = OrderFulfilmentType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        orderStatusTypeA = OrderStatusType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool3 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "orderId");
                            throw null;
                        }
                        int iIntValue = num.intValue();
                        if (feed == null) {
                            Assertions.a(reader, "feed");
                            throw null;
                        }
                        if (cancelWarning == null) {
                            Assertions.a(reader, "cancelWarning");
                            throw null;
                        }
                        if (editOrderWarning == null) {
                            Assertions.a(reader, "editOrderWarning");
                            throw null;
                        }
                        if (orderFulfilmentTypeA == null) {
                            Assertions.a(reader, "fulfilmentMethod");
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, "progress");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "progressDetail");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "showDelightAnimation");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (orderStatusTypeA != null) {
                            return new GetOrderSummaryQuery.OrderSummary(iIntValue, helpList, feed, cancelWarning, editOrderWarning, orderFulfilmentTypeA, str, str2, zBooleanValue, orderStatusTypeA);
                        }
                        Assertions.a(reader, "status");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.OrderSummary value = (GetOrderSummaryQuery.OrderSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            d.y(value.f19951a, Adapters.b, writer, customScalarAdapters, "helpList");
            Adapters.b(Adapters.c(HelpList.f20085a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("feed");
            Adapters.c(Feed.f20077a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("cancelWarning");
            Adapters.c(CancelWarning.f20050a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("editOrderWarning");
            Adapters.c(EditOrderWarning.f20074a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("fulfilmentMethod");
            writer.v0(value.f.d);
            writer.F1("progress");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("progressDetail");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("showDelightAnimation");
            d.B(value.i, Adapters.f, writer, customScalarAdapters, "status");
            OrderStatusType_ResponseAdapter.b(writer, customScalarAdapters, value.j);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$OrderTime;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$OrderTime;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderTime implements Adapter<GetOrderSummaryQuery.OrderTime> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderTime f20124a = new OrderTime();
        public static final List b = CollectionsKt.R("title", "time");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.OrderTime(str, str2);
            }
            Assertions.a(reader, "time");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.OrderTime value = (GetOrderSummaryQuery.OrderTime) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19952a);
            writer.F1("time");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ParkingDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ParkingDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParkingDetails implements Adapter<GetOrderSummaryQuery.ParkingDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ParkingDetails f20125a = new ParkingDetails();
        public static final List b = CollectionsKt.R("parkingMapUrl", "parkingDirections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.ParkingDetails(str, arrayListFromJson);
            }
            Assertions.a(reader, "parkingDirections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ParkingDetails value = (GetOrderSummaryQuery.ParkingDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("parkingMapUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19953a);
            writer.F1("parkingDirections");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$PaymentMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$PaymentMethod;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethod implements Adapter<GetOrderSummaryQuery.PaymentMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethod f20126a = new PaymentMethod();
        public static final List b = CollectionsKt.R("title", BarcodePickDeserializer.FIELD_ICON, "amount", "__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str4 != null) {
                return new GetOrderSummaryQuery.PaymentMethod(str, str2, str3, str4);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.PaymentMethod value = (GetOrderSummaryQuery.PaymentMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19954a);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ProgressStepper;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepper;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgressStepper implements Adapter<GetOrderSummaryQuery.ProgressStepper> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProgressStepper f20127a = new ProgressStepper();
        public static final List b = CollectionsKt.R("currentStep", "totalSteps", "currentStepType", "currentStepPosition", "imageName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Integer num3 = null;
            ProgressStepType progressStepTypeA = null;
            TooltipType tooltipType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    progressStepTypeA = ProgressStepType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = num2;
                    tooltipType = (TooltipType) Adapters.b(TooltipType_ResponseAdapter.f12131a).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                Assertions.a(reader, "currentStep");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "totalSteps");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (progressStepTypeA == null) {
                Assertions.a(reader, "currentStepType");
                throw null;
            }
            if (num5 != null) {
                return new GetOrderSummaryQuery.ProgressStepper(str, iIntValue, progressStepTypeA, num5.intValue(), tooltipType);
            }
            Assertions.a(reader, "currentStepPosition");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ProgressStepper value = (GetOrderSummaryQuery.ProgressStepper) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("currentStep");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19955a);
            writer.F1("totalSteps");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "currentStepType");
            ProgressStepType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("currentStepPosition");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "imageName");
            Adapters.b(TooltipType_ResponseAdapter.f12131a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ProgressStepper1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepper1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgressStepper1 implements Adapter<GetOrderSummaryQuery.ProgressStepper1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProgressStepper1 f20128a = new ProgressStepper1();
        public static final List b = CollectionsKt.R("currentStep", "totalSteps", "currentStepType", "currentStepPosition");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            ProgressStepType progressStepTypeA = null;
            Integer num2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    progressStepTypeA = ProgressStepType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "currentStep");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "totalSteps");
                throw null;
            }
            int iIntValue = num.intValue();
            if (progressStepTypeA == null) {
                Assertions.a(reader, "currentStepType");
                throw null;
            }
            if (num2 != null) {
                return new GetOrderSummaryQuery.ProgressStepper1(str, iIntValue, progressStepTypeA, num2.intValue());
            }
            Assertions.a(reader, "currentStepPosition");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ProgressStepper1 value = (GetOrderSummaryQuery.ProgressStepper1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("currentStep");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19956a);
            writer.F1("totalSteps");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "currentStepType");
            ProgressStepType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("currentStepPosition");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ProgressStepperForCollectedState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ProgressStepperForCollectedState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgressStepperForCollectedState implements Adapter<GetOrderSummaryQuery.ProgressStepperForCollectedState> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProgressStepperForCollectedState f20129a = new ProgressStepperForCollectedState();
        public static final List b = CollectionsKt.R("currentStep", "totalSteps", "currentStepType", "currentStepPosition", "imageName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Integer num3 = null;
            ProgressStepType progressStepTypeA = null;
            TooltipType tooltipType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    progressStepTypeA = ProgressStepType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = num2;
                    tooltipType = (TooltipType) Adapters.b(TooltipType_ResponseAdapter.f12131a).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                Assertions.a(reader, "currentStep");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "totalSteps");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (progressStepTypeA == null) {
                Assertions.a(reader, "currentStepType");
                throw null;
            }
            if (num5 != null) {
                return new GetOrderSummaryQuery.ProgressStepperForCollectedState(str, iIntValue, progressStepTypeA, num5.intValue(), tooltipType);
            }
            Assertions.a(reader, "currentStepPosition");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ProgressStepperForCollectedState value = (GetOrderSummaryQuery.ProgressStepperForCollectedState) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("currentStep");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19957a);
            writer.F1("totalSteps");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "currentStepType");
            ProgressStepType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("currentStepPosition");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "imageName");
            Adapters.b(TooltipType_ResponseAdapter.f12131a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Rationale;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Rationale;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rationale implements Adapter<GetOrderSummaryQuery.Rationale> {

        /* renamed from: a, reason: collision with root package name */
        public static final Rationale f20130a = new Rationale();
        public static final List b = CollectionsKt.R("applyBackground", "image", "textMd");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            LocationImage locationImageA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    locationImageA = LocationImage_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "applyBackground");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (locationImageA == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.Rationale(zBooleanValue, locationImageA, str);
            }
            Assertions.a(reader, "textMd");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Rationale value = (GetOrderSummaryQuery.Rationale) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("applyBackground");
            d.B(value.f19958a, Adapters.f, writer, customScalarAdapters, "image");
            LocationImage_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("textMd");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Rationale1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Rationale1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rationale1 implements Adapter<GetOrderSummaryQuery.Rationale1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Rationale1 f20131a = new Rationale1();
        public static final List b = CollectionsKt.R("applyBackground", "image", "textMd");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            LocationImage locationImageA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    locationImageA = LocationImage_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "applyBackground");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (locationImageA == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str != null) {
                return new GetOrderSummaryQuery.Rationale1(zBooleanValue, locationImageA, str);
            }
            Assertions.a(reader, "textMd");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Rationale1 value = (GetOrderSummaryQuery.Rationale1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("applyBackground");
            d.B(value.f19959a, Adapters.f, writer, customScalarAdapters, "image");
            LocationImage_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("textMd");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Refund;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Refund;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Refund implements Adapter<GetOrderSummaryQuery.Refund> {

        /* renamed from: a, reason: collision with root package name */
        public static final Refund f20132a = new Refund();
        public static final List b = CollectionsKt.R("amount", "amountStyle", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.Refund(str, orderPaymentDetailsItemAmountStyle, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Refund value = (GetOrderSummaryQuery.Refund) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("amount");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19960a);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$RefundTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$RefundTotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RefundTotal implements Adapter<GetOrderSummaryQuery.RefundTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final RefundTotal f20133a = new RefundTotal();
        public static final List b = CollectionsKt.R("amount", "amountStyle", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.RefundTotal(str, orderPaymentDetailsItemAmountStyle, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.RefundTotal value = (GetOrderSummaryQuery.RefundTotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("amount");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19961a);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$SavingsAndReward;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SavingsAndReward;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavingsAndReward implements Adapter<GetOrderSummaryQuery.SavingsAndReward> {

        /* renamed from: a, reason: collision with root package name */
        public static final SavingsAndReward f20134a = new SavingsAndReward();
        public static final List b = CollectionsKt.R("title", "amount", "amountIcon", "amountStyle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    orderPaymentDetailsItemAmountStyle = (OrderPaymentDetailsItemAmountStyle) Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.SavingsAndReward(str, str2, str3, orderPaymentDetailsItemAmountStyle);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.SavingsAndReward value = (GetOrderSummaryQuery.SavingsAndReward) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19962a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amountIcon");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("amountStyle");
            Adapters.b(OrderPaymentDetailsItemAmountStyle_ResponseAdapter.f12091a).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$StarsRatingStep;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StarsRatingStep;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StarsRatingStep implements Adapter<GetOrderSummaryQuery.StarsRatingStep> {

        /* renamed from: a, reason: collision with root package name */
        public static final StarsRatingStep f20135a = new StarsRatingStep();
        public static final List b = CollectionsKt.R("title", "subTitle", "starsRatingQuestion", "insetAlert", "submitButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            GetOrderSummaryQuery.InsetAlert insetAlert = null;
            GetOrderSummaryQuery.SubmitButton submitButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    insetAlert = (GetOrderSummaryQuery.InsetAlert) Adapters.c(InsetAlert.f20087a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    submitButton = (GetOrderSummaryQuery.SubmitButton) Adapters.c(SubmitButton.f20140a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "subTitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "starsRatingQuestion");
                throw null;
            }
            if (insetAlert == null) {
                Assertions.a(reader, "insetAlert");
                throw null;
            }
            if (submitButton != null) {
                return new GetOrderSummaryQuery.StarsRatingStep(str, str2, str3, insetAlert, submitButton);
            }
            Assertions.a(reader, "submitButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.StarsRatingStep value = (GetOrderSummaryQuery.StarsRatingStep) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19963a);
            writer.F1("subTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("starsRatingQuestion");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("insetAlert");
            Adapters.c(InsetAlert.f20087a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("submitButton");
            Adapters.c(SubmitButton.f20140a, false).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$StepInfoList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StepInfoList;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StepInfoList implements Adapter<GetOrderSummaryQuery.StepInfoList> {

        /* renamed from: a, reason: collision with root package name */
        public static final StepInfoList f20136a = new StepInfoList();
        public static final List b = CollectionsKt.R("number", "isCompleted", "isNextProgressed", "title", lqlqqlq.mmm006Dm006Dm, "stepIconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "number");
                throw null;
            }
            int iIntValue = num.intValue();
            if (bool == null) {
                Assertions.a(reader, "isCompleted");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new GetOrderSummaryQuery.StepInfoList(iIntValue, zBooleanValue, bool2, str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.StepInfoList value = (GetOrderSummaryQuery.StepInfoList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("number");
            d.y(value.f19964a, Adapters.b, writer, customScalarAdapters, "isCompleted");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "isNextProgressed");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("stepIconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$StepInfoList1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StepInfoList1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StepInfoList1 implements Adapter<GetOrderSummaryQuery.StepInfoList1> {

        /* renamed from: a, reason: collision with root package name */
        public static final StepInfoList1 f20137a = new StepInfoList1();
        public static final List b = CollectionsKt.R("number", "isCompleted", "isNextProgressed", "title", lqlqqlq.mmm006Dm006Dm, "stepIconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "number");
                throw null;
            }
            int iIntValue = num.intValue();
            if (bool == null) {
                Assertions.a(reader, "isCompleted");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new GetOrderSummaryQuery.StepInfoList1(iIntValue, zBooleanValue, bool2, str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.StepInfoList1 value = (GetOrderSummaryQuery.StepInfoList1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("number");
            d.y(value.f19965a, Adapters.b, writer, customScalarAdapters, "isCompleted");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "isNextProgressed");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("stepIconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$StoreDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$StoreDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetails implements Adapter<GetOrderSummaryQuery.StoreDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreDetails f20138a = new StoreDetails();
        public static final List b = CollectionsKt.R("storeName", "storeAddress", "actionPath");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "storeName");
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.StoreDetails(str, str2, str3);
            }
            Assertions.a(reader, "storeAddress");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.StoreDetails value = (GetOrderSummaryQuery.StoreDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19966a);
            writer.F1("storeAddress");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("actionPath");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$SubTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SubTotal;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubTotal implements Adapter<GetOrderSummaryQuery.SubTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubTotal f20139a = new SubTotal();
        public static final List b = CollectionsKt.R("title", "amount", "__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str3 != null) {
                return new GetOrderSummaryQuery.SubTotal(str, str2, str3);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.SubTotal value = (GetOrderSummaryQuery.SubTotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19967a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$SubmitButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$SubmitButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubmitButton implements Adapter<GetOrderSummaryQuery.SubmitButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitButton f20140a = new SubmitButton();
        public static final List b = CollectionsKt.R("coreButtonStyle", "coreButtonLabel", "coreButtonAction", "coreButtonEnabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CoreButtonStyle coreButtonStyleA = null;
            String str = null;
            GetOrderSummaryQuery.CoreButtonAction coreButtonAction = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    coreButtonStyleA = CoreButtonStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreButtonAction = (GetOrderSummaryQuery.CoreButtonAction) Adapters.c(CoreButtonAction.f20062a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (coreButtonStyleA == null) {
                Assertions.a(reader, "coreButtonStyle");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "coreButtonLabel");
                throw null;
            }
            if (coreButtonAction == null) {
                Assertions.a(reader, "coreButtonAction");
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.SubmitButton(coreButtonStyleA, str, coreButtonAction, bool.booleanValue());
            }
            Assertions.a(reader, "coreButtonEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.SubmitButton value = (GetOrderSummaryQuery.SubmitButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreButtonStyle");
            CoreButtonStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19968a);
            writer.F1("coreButtonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreButtonAction");
            Adapters.c(CoreButtonAction.f20062a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("coreButtonEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Text;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<GetOrderSummaryQuery.Text> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text f20141a = new Text();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new GetOrderSummaryQuery.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Text value = (GetOrderSummaryQuery.Text) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19969a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ThankYouStep;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ThankYouStep;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ThankYouStep implements Adapter<GetOrderSummaryQuery.ThankYouStep> {

        /* renamed from: a, reason: collision with root package name */
        public static final ThankYouStep f20142a = new ThankYouStep();
        public static final List b = CollectionsKt.R("title", "subTitle", "imageUrl", "badFeedbackMessage", "badFeedbackQuestion", "badFeedbackButton", "neutralFeedbackMessage", "goodFeedbackMessage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            GetOrderSummaryQuery.BadFeedbackButton badFeedbackButton = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        badFeedbackButton = (GetOrderSummaryQuery.BadFeedbackButton) Adapters.c(BadFeedbackButton.f20040a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "subTitle");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "badFeedbackMessage");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "badFeedbackQuestion");
                            throw null;
                        }
                        if (badFeedbackButton == null) {
                            Assertions.a(reader, "badFeedbackButton");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "neutralFeedbackMessage");
                            throw null;
                        }
                        if (str7 != null) {
                            return new GetOrderSummaryQuery.ThankYouStep(str, str2, str3, str4, str5, badFeedbackButton, str6, str7);
                        }
                        Assertions.a(reader, "goodFeedbackMessage");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ThankYouStep value = (GetOrderSummaryQuery.ThankYouStep) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19970a);
            writer.F1("subTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("badFeedbackMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("badFeedbackQuestion");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("badFeedbackButton");
            Adapters.c(BadFeedbackButton.f20040a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("neutralFeedbackMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("goodFeedbackMessage");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Tooltip;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Tooltip;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tooltip implements Adapter<GetOrderSummaryQuery.Tooltip> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tooltip f20143a = new Tooltip();
        public static final List b = CollectionsKt.R("message", "stepInfoList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(StepInfoList.f20136a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.Tooltip(str, arrayListFromJson);
            }
            Assertions.a(reader, "stepInfoList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Tooltip value = (GetOrderSummaryQuery.Tooltip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19971a);
            writer.F1("stepInfoList");
            Adapters.a(Adapters.c(StepInfoList.f20136a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Tooltip1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Tooltip1;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tooltip1 implements Adapter<GetOrderSummaryQuery.Tooltip1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tooltip1 f20144a = new Tooltip1();
        public static final List b = CollectionsKt.R("message", "stepInfoList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(StepInfoList1.f20137a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new GetOrderSummaryQuery.Tooltip1(str, arrayListFromJson);
            }
            Assertions.a(reader, "stepInfoList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Tooltip1 value = (GetOrderSummaryQuery.Tooltip1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19972a);
            writer.F1("stepInfoList");
            Adapters.a(Adapters.c(StepInfoList1.f20137a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$Total;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$Total;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Total implements Adapter<GetOrderSummaryQuery.Total> {

        /* renamed from: a, reason: collision with root package name */
        public static final Total f20145a = new Total();
        public static final List b = CollectionsKt.R("title", "amount", "__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str3 != null) {
                return new GetOrderSummaryQuery.Total(str, str2, str3);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.Total value = (GetOrderSummaryQuery.Total) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19973a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("__typename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$ViewInvoiceButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$ViewInvoiceButton;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewInvoiceButton implements Adapter<GetOrderSummaryQuery.ViewInvoiceButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ViewInvoiceButton f20146a = new ViewInvoiceButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new GetOrderSummaryQuery.ViewInvoiceButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.ViewInvoiceButton value = (GetOrderSummaryQuery.ViewInvoiceButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19974a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/GetOrderSummaryQuery_ResponseAdapter$WarningItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/GetOrderSummaryQuery$WarningItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WarningItem implements Adapter<GetOrderSummaryQuery.WarningItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final WarningItem f20147a = new WarningItem();
        public static final List b = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new GetOrderSummaryQuery.WarningItem(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetOrderSummaryQuery.WarningItem value = (GetOrderSummaryQuery.WarningItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19975a);
        }
    }
}
