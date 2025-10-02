package com.woolworths.shop.deliveryunlimited.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.deliveryunlimited.wpay.DeliveryUnlimitedPaymentQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter;", "", "Data", "DeliveryUnlimitedPayment", "IconItem", "PaymentMethodSection", "PaymentMethod", "OnAddCreditCard", "ClickAnalytics", "OnLinkedCreditCard", "OnExpiredCreditCard", "Analytic", "Footer", "Button", "Terms", "Term", "Link", "Button1", "ButtonAction", "Analytics", "ImpressionAnalytics", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedPaymentQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Analytic;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<DeliveryUnlimitedPaymentQuery.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f22692a = new Analytic();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new DeliveryUnlimitedPaymentQuery.Analytic(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Analytic value = (DeliveryUnlimitedPaymentQuery.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22673a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Analytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<DeliveryUnlimitedPaymentQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f22693a = new Analytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new DeliveryUnlimitedPaymentQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Analytics value = (DeliveryUnlimitedPaymentQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22674a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Button;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<DeliveryUnlimitedPaymentQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f22694a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
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
                return new DeliveryUnlimitedPaymentQuery.Button(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Button value = (DeliveryUnlimitedPaymentQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22675a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Button1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<DeliveryUnlimitedPaymentQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f22695a = new Button1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", "buttonAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            DeliveryUnlimitedPaymentQuery.ButtonAction buttonAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    buttonAction = (DeliveryUnlimitedPaymentQuery.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f22696a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new DeliveryUnlimitedPaymentQuery.Button1(str, buttonStyle, bool.booleanValue(), buttonAction);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Button1 value = (DeliveryUnlimitedPaymentQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22676a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f22696a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ButtonAction;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<DeliveryUnlimitedPaymentQuery.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f22696a = new ButtonAction();
        public static final List b = CollectionsKt.Q("analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedPaymentQuery.Analytics analytics = null;
            while (reader.o2(b) == 0) {
                analytics = (DeliveryUnlimitedPaymentQuery.Analytics) Adapters.b(Adapters.c(Analytics.f22693a, true)).fromJson(reader, customScalarAdapters);
            }
            return new DeliveryUnlimitedPaymentQuery.ButtonAction(analytics);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.ButtonAction value = (DeliveryUnlimitedPaymentQuery.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f22693a, true)).toJson(writer, customScalarAdapters, value.f22677a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ClickAnalytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<DeliveryUnlimitedPaymentQuery.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f22697a = new ClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new DeliveryUnlimitedPaymentQuery.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.ClickAnalytics value = (DeliveryUnlimitedPaymentQuery.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22678a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedPaymentQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22698a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedPayment");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment deliveryUnlimitedPayment = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedPayment = (DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment) Adapters.c(DeliveryUnlimitedPayment.f22699a, false).fromJson(reader, customScalarAdapters);
            }
            if (deliveryUnlimitedPayment != null) {
                return new DeliveryUnlimitedPaymentQuery.Data(deliveryUnlimitedPayment);
            }
            Assertions.a(reader, "deliveryUnlimitedPayment");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Data value = (DeliveryUnlimitedPaymentQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedPayment");
            Adapters.c(DeliveryUnlimitedPayment.f22699a, false).toJson(writer, customScalarAdapters, value.f22679a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$DeliveryUnlimitedPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$DeliveryUnlimitedPayment;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedPayment implements Adapter<DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedPayment f22699a = new DeliveryUnlimitedPayment();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, lqlqqlq.mmm006Dm006Dm, "iconItem", "paymentMethodSection", "analytics", "footer", "terms");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            DeliveryUnlimitedPaymentQuery.IconItem iconItem = null;
            DeliveryUnlimitedPaymentQuery.PaymentMethodSection paymentMethodSection = null;
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedPaymentQuery.Footer footer = null;
            DeliveryUnlimitedPaymentQuery.Terms terms = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        iconItem = (DeliveryUnlimitedPaymentQuery.IconItem) Adapters.b(Adapters.c(IconItem.f22701a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        paymentMethodSection = (DeliveryUnlimitedPaymentQuery.PaymentMethodSection) Adapters.c(PaymentMethodSection.f22708a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson = Adapters.a(Adapters.c(Analytic.f22692a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        footer = (DeliveryUnlimitedPaymentQuery.Footer) Adapters.c(Footer.f22700a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        terms = (DeliveryUnlimitedPaymentQuery.Terms) Adapters.c(Terms.f22710a, false).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (paymentMethodSection == null) {
                            Assertions.a(reader, "paymentMethodSection");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "analytics");
                            throw null;
                        }
                        if (footer == null) {
                            Assertions.a(reader, "footer");
                            throw null;
                        }
                        if (terms != null) {
                            return new DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment(str, str2, str3, iconItem, paymentMethodSection, arrayListFromJson, footer, terms);
                        }
                        Assertions.a(reader, "terms");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment value = (DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22680a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconItem");
            Adapters.b(Adapters.c(IconItem.f22701a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("paymentMethodSection");
            Adapters.c(PaymentMethodSection.f22708a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.a(Adapters.c(Analytic.f22692a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("footer");
            Adapters.c(Footer.f22700a, false).toJson(writer, customScalarAdapters, value.g);
            writer.F1("terms");
            Adapters.c(Terms.f22710a, false).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Footer;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<DeliveryUnlimitedPaymentQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f22700a = new Footer();
        public static final List b = CollectionsKt.R("button", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedPaymentQuery.Button button = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (DeliveryUnlimitedPaymentQuery.Button) Adapters.c(Button.f22694a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedPaymentQuery.Footer(button, str);
            }
            Assertions.a(reader, "disclaimer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Footer value = (DeliveryUnlimitedPaymentQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f22694a, false).toJson(writer, customScalarAdapters, value.f22681a);
            writer.F1("disclaimer");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$IconItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$IconItem;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IconItem implements Adapter<DeliveryUnlimitedPaymentQuery.IconItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final IconItem f22701a = new IconItem();
        public static final List b = CollectionsKt.R("iconUrl", AnnotatedPrivateKey.LABEL);

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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new DeliveryUnlimitedPaymentQuery.IconItem(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.IconItem value = (DeliveryUnlimitedPaymentQuery.IconItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22682a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$ImpressionAnalytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<DeliveryUnlimitedPaymentQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f22702a = new ImpressionAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new DeliveryUnlimitedPaymentQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.ImpressionAnalytics value = (DeliveryUnlimitedPaymentQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22683a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Link;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Link;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link implements Adapter<DeliveryUnlimitedPaymentQuery.Link> {

        /* renamed from: a, reason: collision with root package name */
        public static final Link f22703a = new Link();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "url");

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
                return new DeliveryUnlimitedPaymentQuery.Link(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Link value = (DeliveryUnlimitedPaymentQuery.Link) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22684a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$OnAddCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnAddCreditCard;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAddCreditCard implements Adapter<DeliveryUnlimitedPaymentQuery.OnAddCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22704a = CollectionsKt.R("title", "clickAnalytics");

        public static DeliveryUnlimitedPaymentQuery.OnAddCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            DeliveryUnlimitedPaymentQuery.ClickAnalytics clickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f22704a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    clickAnalytics = (DeliveryUnlimitedPaymentQuery.ClickAnalytics) Adapters.c(ClickAnalytics.f22697a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (clickAnalytics != null) {
                return new DeliveryUnlimitedPaymentQuery.OnAddCreditCard(str, clickAnalytics);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedPaymentQuery.OnAddCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22685a);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics.f22697a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedPaymentQuery.OnAddCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$OnExpiredCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnExpiredCreditCard;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnExpiredCreditCard implements Adapter<DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22705a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON);

        public static DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f22705a);
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
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
            if (str4 != null) {
                return new DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard(str, str2, str3, str4);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22686a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$OnLinkedCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$OnLinkedCreditCard;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLinkedCreditCard implements Adapter<DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22706a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON, "isSelected", "amountTitle", "amountValue", "amountToPay", "cvvUrl");

        public static DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f22706a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Integer num2 = num;
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str5 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num2 == null) {
                            Assertions.a(reader, "amountToPay");
                            throw null;
                        }
                        int iIntValue = num2.intValue();
                        if (str7 != null) {
                            return new DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard(str, str2, str3, str4, zBooleanValue, str5, str6, iIntValue, str7);
                        }
                        Assertions.a(reader, "cvvUrl");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22687a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("isSelected");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "amountTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("amountValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("amountToPay");
            d.y(value.h, Adapters.b, writer, customScalarAdapters, "cvvUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$PaymentMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$PaymentMethod;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethod implements Adapter<DeliveryUnlimitedPaymentQuery.PaymentMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethod f22707a = new PaymentMethod();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            DeliveryUnlimitedPaymentQuery.OnAddCreditCard onAddCreditCardA;
            DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard onLinkedCreditCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard onExpiredCreditCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AddCreditCard"))) {
                reader.o();
                onAddCreditCardA = OnAddCreditCard.a(reader, customScalarAdapters);
            } else {
                onAddCreditCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LinkedCreditCard"))) {
                reader.o();
                onLinkedCreditCardA = OnLinkedCreditCard.a(reader, customScalarAdapters);
            } else {
                onLinkedCreditCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ExpiredCreditCard"))) {
                reader.o();
                onExpiredCreditCardA = OnExpiredCreditCard.a(reader, customScalarAdapters);
            }
            return new DeliveryUnlimitedPaymentQuery.PaymentMethod(str, onAddCreditCardA, onLinkedCreditCardA, onExpiredCreditCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.PaymentMethod value = (DeliveryUnlimitedPaymentQuery.PaymentMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22688a);
            DeliveryUnlimitedPaymentQuery.OnAddCreditCard onAddCreditCard = value.b;
            if (onAddCreditCard != null) {
                OnAddCreditCard.b(writer, customScalarAdapters, onAddCreditCard);
            }
            DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard onLinkedCreditCard = value.c;
            if (onLinkedCreditCard != null) {
                OnLinkedCreditCard.b(writer, customScalarAdapters, onLinkedCreditCard);
            }
            DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard onExpiredCreditCard = value.d;
            if (onExpiredCreditCard != null) {
                OnExpiredCreditCard.b(writer, customScalarAdapters, onExpiredCreditCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$PaymentMethodSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$PaymentMethodSection;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodSection implements Adapter<DeliveryUnlimitedPaymentQuery.PaymentMethodSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethodSection f22708a = new PaymentMethodSection();
        public static final List b = CollectionsKt.R("title", "paymentMethods");

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
                    arrayListFromJson = Adapters.a(Adapters.c(PaymentMethod.f22707a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DeliveryUnlimitedPaymentQuery.PaymentMethodSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "paymentMethods");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.PaymentMethodSection value = (DeliveryUnlimitedPaymentQuery.PaymentMethodSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22689a);
            writer.F1("paymentMethods");
            Adapters.a(Adapters.c(PaymentMethod.f22707a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Term;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Term;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Term implements Adapter<DeliveryUnlimitedPaymentQuery.Term> {

        /* renamed from: a, reason: collision with root package name */
        public static final Term f22709a = new Term();
        public static final List b = CollectionsKt.R("title", "links");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Link.f22703a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DeliveryUnlimitedPaymentQuery.Term(str, arrayListFromJson);
            }
            Assertions.a(reader, "links");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Term value = (DeliveryUnlimitedPaymentQuery.Term) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22690a);
            writer.F1("links");
            Adapters.a(Adapters.c(Link.f22703a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/wpay/adapter/DeliveryUnlimitedPaymentQuery_ResponseAdapter$Terms;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/wpay/DeliveryUnlimitedPaymentQuery$Terms;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Terms implements Adapter<DeliveryUnlimitedPaymentQuery.Terms> {

        /* renamed from: a, reason: collision with root package name */
        public static final Terms f22710a = new Terms();
        public static final List b = CollectionsKt.R("title", "terms", "button", "impressionAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedPaymentQuery.Button1 button1 = null;
            DeliveryUnlimitedPaymentQuery.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Term.f22709a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    button1 = (DeliveryUnlimitedPaymentQuery.Button1) Adapters.c(Button1.f22695a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    impressionAnalytics = (DeliveryUnlimitedPaymentQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f22702a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "terms");
                throw null;
            }
            if (button1 != null) {
                return new DeliveryUnlimitedPaymentQuery.Terms(str, arrayListFromJson, button1, impressionAnalytics);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedPaymentQuery.Terms value = (DeliveryUnlimitedPaymentQuery.Terms) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22691a);
            writer.F1("terms");
            Adapters.a(Adapters.c(Term.f22709a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button1.f22695a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f22702a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }
}
