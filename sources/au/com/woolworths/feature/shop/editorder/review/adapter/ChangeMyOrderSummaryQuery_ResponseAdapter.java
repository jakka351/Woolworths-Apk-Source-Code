package au.com.woolworths.feature.shop.editorder.review.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.editorder.review.ChangeMyOrderSummaryQuery;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter;", "", "Data", "ChangeMyOrderSummary", "Banner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "OrderDetailsSection", "Item", "OnFulfilmentMethod", "OnChangeMyOrderDeliveryInstructions", "OnFulfilmentTimeSlot", "FulfilmentTimeSlotTitle", "OnCartActions", "ActionTile", "FooterCTASection", "CancelButton", "CheckoutButton", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeMyOrderSummaryQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$ActionTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$ActionTile;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionTile implements Adapter<ChangeMyOrderSummaryQuery.ActionTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionTile f7101a = new ActionTile();
        public static final List b = CollectionsKt.R("id", "title", "iconUrl");

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
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new ChangeMyOrderSummaryQuery.ActionTile(str, str2, str3);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.ActionTile value = (ChangeMyOrderSummaryQuery.ActionTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7060a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Banner;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ChangeMyOrderSummaryQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f7102a = new Banner();
        public static final List b = CollectionsKt.Q("broadcastBannerUI");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.BroadcastBannerUI broadcastBannerUI = null;
            while (reader.o2(b) == 0) {
                broadcastBannerUI = (ChangeMyOrderSummaryQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f7103a, false).fromJson(reader, customScalarAdapters);
            }
            if (broadcastBannerUI != null) {
                return new ChangeMyOrderSummaryQuery.Banner(broadcastBannerUI);
            }
            Assertions.a(reader, "broadcastBannerUI");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.Banner value = (ChangeMyOrderSummaryQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f7103a, false).toJson(writer, customScalarAdapters, value.f7061a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$BroadcastBannerUI;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<ChangeMyOrderSummaryQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f7103a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            ChangeMyOrderSummaryQuery.Icon icon = null;
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
                    icon = (ChangeMyOrderSummaryQuery.Icon) Adapters.c(Icon.f7110a, true).fromJson(reader, customScalarAdapters);
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
                return new ChangeMyOrderSummaryQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.BroadcastBannerUI value = (ChangeMyOrderSummaryQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7062a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f7110a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$CancelButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$CancelButton;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancelButton implements Adapter<ChangeMyOrderSummaryQuery.CancelButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelButton f7104a = new CancelButton();
        public static final List b = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ChangeMyOrderSummaryQuery.CancelButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.CancelButton value = (ChangeMyOrderSummaryQuery.CancelButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f7063a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$ChangeMyOrderSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$ChangeMyOrderSummary;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChangeMyOrderSummary implements Adapter<ChangeMyOrderSummaryQuery.ChangeMyOrderSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChangeMyOrderSummary f7105a = new ChangeMyOrderSummary();
        public static final List b = CollectionsKt.R("banner", "orderDetailsSection", "footerCTASection");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.Banner banner = null;
            ChangeMyOrderSummaryQuery.OrderDetailsSection orderDetailsSection = null;
            ChangeMyOrderSummaryQuery.FooterCTASection footerCTASection = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    banner = (ChangeMyOrderSummaryQuery.Banner) Adapters.b(Adapters.c(Banner.f7102a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    orderDetailsSection = (ChangeMyOrderSummaryQuery.OrderDetailsSection) Adapters.c(OrderDetailsSection.f7117a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footerCTASection = (ChangeMyOrderSummaryQuery.FooterCTASection) Adapters.c(FooterCTASection.f7108a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (orderDetailsSection == null) {
                Assertions.a(reader, "orderDetailsSection");
                throw null;
            }
            if (footerCTASection != null) {
                return new ChangeMyOrderSummaryQuery.ChangeMyOrderSummary(banner, orderDetailsSection, footerCTASection);
            }
            Assertions.a(reader, "footerCTASection");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.ChangeMyOrderSummary value = (ChangeMyOrderSummaryQuery.ChangeMyOrderSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.f7102a, false)).toJson(writer, customScalarAdapters, value.f7064a);
            writer.F1("orderDetailsSection");
            Adapters.c(OrderDetailsSection.f7117a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footerCTASection");
            Adapters.c(FooterCTASection.f7108a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$CheckoutButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$CheckoutButton;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutButton implements Adapter<ChangeMyOrderSummaryQuery.CheckoutButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutButton f7106a = new CheckoutButton();
        public static final List b = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled");

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
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ChangeMyOrderSummaryQuery.CheckoutButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.CheckoutButton value = (ChangeMyOrderSummaryQuery.CheckoutButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f7065a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ChangeMyOrderSummaryQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f7107a = new Data();
        public static final List b = CollectionsKt.Q("changeMyOrderSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.ChangeMyOrderSummary changeMyOrderSummary = null;
            while (reader.o2(b) == 0) {
                changeMyOrderSummary = (ChangeMyOrderSummaryQuery.ChangeMyOrderSummary) Adapters.c(ChangeMyOrderSummary.f7105a, false).fromJson(reader, customScalarAdapters);
            }
            if (changeMyOrderSummary != null) {
                return new ChangeMyOrderSummaryQuery.Data(changeMyOrderSummary);
            }
            Assertions.a(reader, "changeMyOrderSummary");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.Data value = (ChangeMyOrderSummaryQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("changeMyOrderSummary");
            Adapters.c(ChangeMyOrderSummary.f7105a, false).toJson(writer, customScalarAdapters, value.f7066a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$FooterCTASection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$FooterCTASection;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterCTASection implements Adapter<ChangeMyOrderSummaryQuery.FooterCTASection> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterCTASection f7108a = new FooterCTASection();
        public static final List b = CollectionsKt.R("cancelButton", "checkoutButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.CancelButton cancelButton = null;
            ChangeMyOrderSummaryQuery.CheckoutButton checkoutButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    cancelButton = (ChangeMyOrderSummaryQuery.CancelButton) Adapters.c(CancelButton.f7104a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    checkoutButton = (ChangeMyOrderSummaryQuery.CheckoutButton) Adapters.c(CheckoutButton.f7106a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (cancelButton == null) {
                Assertions.a(reader, "cancelButton");
                throw null;
            }
            if (checkoutButton != null) {
                return new ChangeMyOrderSummaryQuery.FooterCTASection(cancelButton, checkoutButton);
            }
            Assertions.a(reader, "checkoutButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.FooterCTASection value = (ChangeMyOrderSummaryQuery.FooterCTASection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cancelButton");
            Adapters.c(CancelButton.f7104a, false).toJson(writer, customScalarAdapters, value.f7067a);
            writer.F1("checkoutButton");
            Adapters.c(CheckoutButton.f7106a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$FulfilmentTimeSlotTitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$FulfilmentTimeSlotTitle;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentTimeSlotTitle implements Adapter<ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentTimeSlotTitle f7109a = new FulfilmentTimeSlotTitle();
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
                return new ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle value = (ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7068a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Icon;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<ChangeMyOrderSummaryQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f7110a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.OnHostedIcon onHostedIconA = null;
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
            return new ChangeMyOrderSummaryQuery.Icon(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.Icon value = (ChangeMyOrderSummaryQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7069a);
            ChangeMyOrderSummaryQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Item;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ChangeMyOrderSummaryQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f7111a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ChangeMyOrderSummaryQuery.OnFulfilmentMethod onFulfilmentMethodA;
            ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructionsA;
            ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot onFulfilmentTimeSlotA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ChangeMyOrderSummaryQuery.OnCartActions onCartActionsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FulfilmentMethod"))) {
                reader.o();
                onFulfilmentMethodA = OnFulfilmentMethod.a(reader, customScalarAdapters);
            } else {
                onFulfilmentMethodA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ChangeMyOrderDeliveryInstructions"))) {
                reader.o();
                onChangeMyOrderDeliveryInstructionsA = OnChangeMyOrderDeliveryInstructions.a(reader, customScalarAdapters);
            } else {
                onChangeMyOrderDeliveryInstructionsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FulfilmentTimeSlot"))) {
                reader.o();
                onFulfilmentTimeSlotA = OnFulfilmentTimeSlot.a(reader, customScalarAdapters);
            } else {
                onFulfilmentTimeSlotA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartActions"))) {
                reader.o();
                onCartActionsA = OnCartActions.a(reader, customScalarAdapters);
            }
            return new ChangeMyOrderSummaryQuery.Item(str, onFulfilmentMethodA, onChangeMyOrderDeliveryInstructionsA, onFulfilmentTimeSlotA, onCartActionsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.Item value = (ChangeMyOrderSummaryQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7070a);
            ChangeMyOrderSummaryQuery.OnFulfilmentMethod onFulfilmentMethod = value.b;
            if (onFulfilmentMethod != null) {
                OnFulfilmentMethod.b(writer, customScalarAdapters, onFulfilmentMethod);
            }
            ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructions = value.c;
            if (onChangeMyOrderDeliveryInstructions != null) {
                OnChangeMyOrderDeliveryInstructions.b(writer, customScalarAdapters, onChangeMyOrderDeliveryInstructions);
            }
            ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot onFulfilmentTimeSlot = value.d;
            if (onFulfilmentTimeSlot != null) {
                OnFulfilmentTimeSlot.b(writer, customScalarAdapters, onFulfilmentTimeSlot);
            }
            ChangeMyOrderSummaryQuery.OnCartActions onCartActions = value.e;
            if (onCartActions != null) {
                OnCartActions.b(writer, customScalarAdapters, onCartActions);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OnCartActions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnCartActions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartActions implements Adapter<ChangeMyOrderSummaryQuery.OnCartActions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7112a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "numberOfItems", "actionTiles");

        public static ChangeMyOrderSummaryQuery.OnCartActions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f7112a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ActionTile.f7101a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "numberOfItems");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListFromJson != null) {
                return new ChangeMyOrderSummaryQuery.OnCartActions(str, str2, iIntValue, arrayListFromJson);
            }
            Assertions.a(reader, "actionTiles");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChangeMyOrderSummaryQuery.OnCartActions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7071a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("numberOfItems");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "actionTiles");
            Adapters.a(Adapters.c(ActionTile.f7101a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChangeMyOrderSummaryQuery.OnCartActions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OnChangeMyOrderDeliveryInstructions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnChangeMyOrderDeliveryInstructions;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnChangeMyOrderDeliveryInstructions implements Adapter<ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7113a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "iconUrl");

        public static ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f7113a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
            if (str3 != null) {
                return new ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions(str, str2, str3);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7072a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChangeMyOrderSummaryQuery.OnChangeMyOrderDeliveryInstructions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OnFulfilmentMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnFulfilmentMethod;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentMethod implements Adapter<ChangeMyOrderSummaryQuery.OnFulfilmentMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7114a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "iconUrl");

        public static ChangeMyOrderSummaryQuery.OnFulfilmentMethod a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f7114a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
            if (str3 != null) {
                return new ChangeMyOrderSummaryQuery.OnFulfilmentMethod(str, str2, str3);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChangeMyOrderSummaryQuery.OnFulfilmentMethod value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f7073a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChangeMyOrderSummaryQuery.OnFulfilmentMethod) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OnFulfilmentTimeSlot;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnFulfilmentTimeSlot;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFulfilmentTimeSlot implements Adapter<ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7115a = CollectionsKt.R("fulfilmentTimeSlotTitle", NotificationMessage.NOTIF_KEY_SUB_TITLE, "iconUrl");

        public static ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle fulfilmentTimeSlotTitle = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f7115a);
                if (iO2 == 0) {
                    fulfilmentTimeSlotTitle = (ChangeMyOrderSummaryQuery.FulfilmentTimeSlotTitle) Adapters.c(FulfilmentTimeSlotTitle.f7109a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (fulfilmentTimeSlotTitle == null) {
                Assertions.a(reader, "fulfilmentTimeSlotTitle");
                throw null;
            }
            if (str2 != null) {
                return new ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot(fulfilmentTimeSlotTitle, str, str2);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentTimeSlotTitle");
            Adapters.c(FulfilmentTimeSlotTitle.f7109a, false).toJson(writer, customScalarAdapters, value.f7074a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChangeMyOrderSummaryQuery.OnFulfilmentTimeSlot) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnHostedIcon;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<ChangeMyOrderSummaryQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f7116a = CollectionsKt.Q("url");

        public static ChangeMyOrderSummaryQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f7116a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ChangeMyOrderSummaryQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ChangeMyOrderSummaryQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7075a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ChangeMyOrderSummaryQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/adapter/ChangeMyOrderSummaryQuery_ResponseAdapter$OrderDetailsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OrderDetailsSection;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDetailsSection implements Adapter<ChangeMyOrderSummaryQuery.OrderDetailsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderDetailsSection f7117a = new OrderDetailsSection();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "items");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f7111a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ChangeMyOrderSummaryQuery.OrderDetailsSection(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ChangeMyOrderSummaryQuery.OrderDetailsSection value = (ChangeMyOrderSummaryQuery.OrderDetailsSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f7076a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f7111a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
