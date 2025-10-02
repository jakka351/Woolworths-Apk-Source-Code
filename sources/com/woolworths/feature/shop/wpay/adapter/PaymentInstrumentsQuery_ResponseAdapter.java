package com.woolworths.feature.shop.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.wpay.PaymentInstrumentsQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b#\bÇ\u0002\u0018\u00002\u00020\u0001:\"\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter;", "", "Data", "PaymentInstruments", "OnPaymentInstrumentResponseSuccess", "GiftCardSection", "GiftCard", "OnAddGiftCard", "ClickAnalytics", "OnLinkedGiftCard", "ErrorBanner", "Analytics", "OnUnlinkedGiftCard", "ErrorBanner1", "Analytics1", "PaymentMethodSection", "PaymentMethod", "OnAddCreditCard", "ClickAnalytics1", "OnAddPayPal", "Alert", "ClickAnalytics2", "OnLinkedCreditCard", "OnUnlinkedCreditCard", "OnExpiredCreditCard", "OnLinkedPayPal", "OnGooglePay", "PaymentInstrumentTotalDetails", "Button", "OnPlaceOrderButtonDefault", "Analytics2", "OnPlaceOrderButtonGooglePay", "Analytics3", "Analytic", "OnPaymentInstrumentResponseValidationFailure", "ImpressionAnalytics", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInstrumentsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Alert;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Alert;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Alert implements Adapter<PaymentInstrumentsQuery.Alert> {

        /* renamed from: a, reason: collision with root package name */
        public static final Alert f20425a = new Alert();
        public static final List b = CollectionsKt.R("title", "message", "primaryButtonTitle", "secondaryButtonTitle", "clickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            PaymentInstrumentsQuery.ClickAnalytics2 clickAnalytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    clickAnalytics2 = (PaymentInstrumentsQuery.ClickAnalytics2) Adapters.c(ClickAnalytics2.f20434a, true).fromJson(reader, customScalarAdapters);
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
            if (str3 == null) {
                Assertions.a(reader, "primaryButtonTitle");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "secondaryButtonTitle");
                throw null;
            }
            if (clickAnalytics2 != null) {
                return new PaymentInstrumentsQuery.Alert(str, str2, str3, str4, clickAnalytics2);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Alert value = (PaymentInstrumentsQuery.Alert) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20368a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryButtonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryButtonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics2.f20434a, true).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytic;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<PaymentInstrumentsQuery.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f20426a = new Analytic();
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
                return new PaymentInstrumentsQuery.Analytic(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Analytic value = (PaymentInstrumentsQuery.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20369a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<PaymentInstrumentsQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20427a = new Analytics();
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
                return new PaymentInstrumentsQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Analytics value = (PaymentInstrumentsQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20370a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics1;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<PaymentInstrumentsQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f20428a = new Analytics1();
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
                return new PaymentInstrumentsQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Analytics1 value = (PaymentInstrumentsQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20371a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics2;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<PaymentInstrumentsQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f20429a = new Analytics2();
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
                return new PaymentInstrumentsQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Analytics2 value = (PaymentInstrumentsQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20372a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Analytics3;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<PaymentInstrumentsQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f20430a = new Analytics3();
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
                return new PaymentInstrumentsQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Analytics3 value = (PaymentInstrumentsQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20373a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Button;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<PaymentInstrumentsQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f20431a = new Button();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PaymentInstrumentsQuery.OnPlaceOrderButtonDefault onPlaceOrderButtonDefaultA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay onPlaceOrderButtonGooglePayA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PlaceOrderButtonDefault"))) {
                reader.o();
                onPlaceOrderButtonDefaultA = OnPlaceOrderButtonDefault.a(reader, customScalarAdapters);
            } else {
                onPlaceOrderButtonDefaultA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PlaceOrderButtonGooglePay"))) {
                reader.o();
                onPlaceOrderButtonGooglePayA = OnPlaceOrderButtonGooglePay.a(reader, customScalarAdapters);
            }
            return new PaymentInstrumentsQuery.Button(str, onPlaceOrderButtonDefaultA, onPlaceOrderButtonGooglePayA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Button value = (PaymentInstrumentsQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20374a);
            PaymentInstrumentsQuery.OnPlaceOrderButtonDefault onPlaceOrderButtonDefault = value.b;
            if (onPlaceOrderButtonDefault != null) {
                OnPlaceOrderButtonDefault.b(writer, customScalarAdapters, onPlaceOrderButtonDefault);
            }
            PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay onPlaceOrderButtonGooglePay = value.c;
            if (onPlaceOrderButtonGooglePay != null) {
                OnPlaceOrderButtonGooglePay.b(writer, customScalarAdapters, onPlaceOrderButtonGooglePay);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<PaymentInstrumentsQuery.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f20432a = new ClickAnalytics();
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
                return new PaymentInstrumentsQuery.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ClickAnalytics value = (PaymentInstrumentsQuery.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20375a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ClickAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics1;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics1 implements Adapter<PaymentInstrumentsQuery.ClickAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics1 f20433a = new ClickAnalytics1();
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
                return new PaymentInstrumentsQuery.ClickAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ClickAnalytics1 value = (PaymentInstrumentsQuery.ClickAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20376a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ClickAnalytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ClickAnalytics2;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics2 implements Adapter<PaymentInstrumentsQuery.ClickAnalytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics2 f20434a = new ClickAnalytics2();
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
                return new PaymentInstrumentsQuery.ClickAnalytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ClickAnalytics2 value = (PaymentInstrumentsQuery.ClickAnalytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20377a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<PaymentInstrumentsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20435a = new Data();
        public static final List b = CollectionsKt.Q("paymentInstruments");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PaymentInstrumentsQuery.PaymentInstruments paymentInstruments = null;
            while (reader.o2(b) == 0) {
                paymentInstruments = (PaymentInstrumentsQuery.PaymentInstruments) Adapters.c(PaymentInstruments.f20456a, true).fromJson(reader, customScalarAdapters);
            }
            if (paymentInstruments != null) {
                return new PaymentInstrumentsQuery.Data(paymentInstruments);
            }
            Assertions.a(reader, "paymentInstruments");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.Data value = (PaymentInstrumentsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("paymentInstruments");
            Adapters.c(PaymentInstruments.f20456a, true).toJson(writer, customScalarAdapters, value.f20378a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ErrorBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ErrorBanner;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorBanner implements Adapter<PaymentInstrumentsQuery.ErrorBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorBanner f20436a = new ErrorBanner();
        public static final List b = CollectionsKt.R("displayType", "message", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            PaymentInstrumentsQuery.Analytics analytics = null;
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
                    analytics = (PaymentInstrumentsQuery.Analytics) Adapters.b(Adapters.c(Analytics.f20427a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new PaymentInstrumentsQuery.ErrorBanner(insetBannerDisplayTypeA, str, analytics);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ErrorBanner value = (PaymentInstrumentsQuery.ErrorBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f20379a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f20427a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ErrorBanner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ErrorBanner1;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorBanner1 implements Adapter<PaymentInstrumentsQuery.ErrorBanner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorBanner1 f20437a = new ErrorBanner1();
        public static final List b = CollectionsKt.R("displayType", "message", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            PaymentInstrumentsQuery.Analytics1 analytics1 = null;
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
                    analytics1 = (PaymentInstrumentsQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f20428a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new PaymentInstrumentsQuery.ErrorBanner1(insetBannerDisplayTypeA, str, analytics1);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ErrorBanner1 value = (PaymentInstrumentsQuery.ErrorBanner1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f20380a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f20428a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$GiftCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$GiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GiftCard implements Adapter<PaymentInstrumentsQuery.GiftCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final GiftCard f20438a = new GiftCard();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PaymentInstrumentsQuery.OnAddGiftCard onAddGiftCardA;
            PaymentInstrumentsQuery.OnLinkedGiftCard onLinkedGiftCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PaymentInstrumentsQuery.OnUnlinkedGiftCard onUnlinkedGiftCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AddGiftCard"))) {
                reader.o();
                onAddGiftCardA = OnAddGiftCard.a(reader, customScalarAdapters);
            } else {
                onAddGiftCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LinkedGiftCard"))) {
                reader.o();
                onLinkedGiftCardA = OnLinkedGiftCard.a(reader, customScalarAdapters);
            } else {
                onLinkedGiftCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UnlinkedGiftCard"))) {
                reader.o();
                onUnlinkedGiftCardA = OnUnlinkedGiftCard.a(reader, customScalarAdapters);
            }
            return new PaymentInstrumentsQuery.GiftCard(str, onAddGiftCardA, onLinkedGiftCardA, onUnlinkedGiftCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.GiftCard value = (PaymentInstrumentsQuery.GiftCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20381a);
            PaymentInstrumentsQuery.OnAddGiftCard onAddGiftCard = value.b;
            if (onAddGiftCard != null) {
                OnAddGiftCard.b(writer, customScalarAdapters, onAddGiftCard);
            }
            PaymentInstrumentsQuery.OnLinkedGiftCard onLinkedGiftCard = value.c;
            if (onLinkedGiftCard != null) {
                OnLinkedGiftCard.b(writer, customScalarAdapters, onLinkedGiftCard);
            }
            PaymentInstrumentsQuery.OnUnlinkedGiftCard onUnlinkedGiftCard = value.d;
            if (onUnlinkedGiftCard != null) {
                OnUnlinkedGiftCard.b(writer, customScalarAdapters, onUnlinkedGiftCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$GiftCardSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$GiftCardSection;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GiftCardSection implements Adapter<PaymentInstrumentsQuery.GiftCardSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final GiftCardSection f20439a = new GiftCardSection();
        public static final List b = CollectionsKt.R("title", "giftCards");

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
                    arrayListFromJson = Adapters.a(Adapters.c(GiftCard.f20438a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new PaymentInstrumentsQuery.GiftCardSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "giftCards");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.GiftCardSection value = (PaymentInstrumentsQuery.GiftCardSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20382a);
            writer.F1("giftCards");
            Adapters.a(Adapters.c(GiftCard.f20438a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$ImpressionAnalytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<PaymentInstrumentsQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f20440a = new ImpressionAnalytics();
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
                return new PaymentInstrumentsQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.ImpressionAnalytics value = (PaymentInstrumentsQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20383a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnAddCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAddCreditCard implements Adapter<PaymentInstrumentsQuery.OnAddCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20441a = CollectionsKt.R("title", "clickAnalytics");

        public static PaymentInstrumentsQuery.OnAddCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PaymentInstrumentsQuery.ClickAnalytics1 clickAnalytics1 = null;
            while (true) {
                int iO2 = reader.o2(f20441a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    clickAnalytics1 = (PaymentInstrumentsQuery.ClickAnalytics1) Adapters.c(ClickAnalytics1.f20433a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (clickAnalytics1 != null) {
                return new PaymentInstrumentsQuery.OnAddCreditCard(str, clickAnalytics1);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnAddCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20384a);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics1.f20433a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnAddCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnAddGiftCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddGiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAddGiftCard implements Adapter<PaymentInstrumentsQuery.OnAddGiftCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20442a = CollectionsKt.R("title", "clickAnalytics");

        public static PaymentInstrumentsQuery.OnAddGiftCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PaymentInstrumentsQuery.ClickAnalytics clickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f20442a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    clickAnalytics = (PaymentInstrumentsQuery.ClickAnalytics) Adapters.c(ClickAnalytics.f20432a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (clickAnalytics != null) {
                return new PaymentInstrumentsQuery.OnAddGiftCard(str, clickAnalytics);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnAddGiftCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20385a);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics.f20432a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnAddGiftCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnAddPayPal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnAddPayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAddPayPal implements Adapter<PaymentInstrumentsQuery.OnAddPayPal> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20443a = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", "alert");

        public static PaymentInstrumentsQuery.OnAddPayPal a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            PaymentInstrumentsQuery.Alert alert = null;
            while (true) {
                int iO2 = reader.o2(f20443a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    alert = (PaymentInstrumentsQuery.Alert) Adapters.c(Alert.f20425a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (alert != null) {
                return new PaymentInstrumentsQuery.OnAddPayPal(str, str2, alert);
            }
            Assertions.a(reader, "alert");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnAddPayPal value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20386a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("alert");
            Adapters.c(Alert.f20425a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnAddPayPal) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnExpiredCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnExpiredCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnExpiredCreditCard implements Adapter<PaymentInstrumentsQuery.OnExpiredCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20444a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON);

        public static PaymentInstrumentsQuery.OnExpiredCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f20444a);
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
                return new PaymentInstrumentsQuery.OnExpiredCreditCard(str, str2, str3, str4);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnExpiredCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20387a);
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
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnExpiredCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnGooglePay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnGooglePay;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGooglePay implements Adapter<PaymentInstrumentsQuery.OnGooglePay> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20445a = CollectionsKt.R("title", "isSelected", "amountTitle", "amountValue", "amountToPay", "id", "supportedNetworks");

        public static PaymentInstrumentsQuery.OnGooglePay a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f20445a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Integer num2 = num;
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str2 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num2 == null) {
                            Assertions.a(reader, "amountToPay");
                            throw null;
                        }
                        int iIntValue = num2.intValue();
                        if (str4 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new PaymentInstrumentsQuery.OnGooglePay(str, zBooleanValue, str2, str3, iIntValue, str4, arrayListFromJson);
                        }
                        Assertions.a(reader, "supportedNetworks");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnGooglePay value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20388a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "amountTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("amountValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("amountToPay");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("supportedNetworks");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnGooglePay) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnLinkedCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLinkedCreditCard implements Adapter<PaymentInstrumentsQuery.OnLinkedCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20446a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON, "isSelected", "amountTitle", "amountValue", "amountToPay", "cvvUrl");

        public static PaymentInstrumentsQuery.OnLinkedCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(f20446a)) {
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
                            return new PaymentInstrumentsQuery.OnLinkedCreditCard(str, str2, str3, str4, zBooleanValue, str5, str6, iIntValue, str7);
                        }
                        Assertions.a(reader, "cvvUrl");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnLinkedCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20389a);
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
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnLinkedCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnLinkedGiftCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedGiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLinkedGiftCard implements Adapter<PaymentInstrumentsQuery.OnLinkedGiftCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20447a = CollectionsKt.R("id", "title", "isSelected", "amountTitle", "amountValue", "amountRedeem", "errorBanner", "snackBarMessage");

        public static PaymentInstrumentsQuery.OnLinkedGiftCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            PaymentInstrumentsQuery.ErrorBanner errorBanner = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(f20447a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        errorBanner = (PaymentInstrumentsQuery.ErrorBanner) Adapters.b(Adapters.c(ErrorBanner.f20436a, false)).fromJson(reader, customScalarAdapters);
                        bool2 = bool2;
                        num = num;
                        continue;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Integer num2 = num;
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num2 != null) {
                            return new PaymentInstrumentsQuery.OnLinkedGiftCard(str, str2, zBooleanValue, str3, str4, num2.intValue(), errorBanner, str5);
                        }
                        Assertions.a(reader, "amountRedeem");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnLinkedGiftCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20390a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isSelected");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "amountTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("amountValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("amountRedeem");
            d.y(value.f, Adapters.b, writer, customScalarAdapters, "errorBanner");
            Adapters.b(Adapters.c(ErrorBanner.f20436a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("snackBarMessage");
            Adapters.i.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnLinkedGiftCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnLinkedPayPal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnLinkedPayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLinkedPayPal implements Adapter<PaymentInstrumentsQuery.OnLinkedPayPal> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20448a = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", "isSelected", "amountTitle", "amountValue", "amountToPay", "id");

        public static PaymentInstrumentsQuery.OnLinkedPayPal a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(f20448a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num == null) {
                            Assertions.a(reader, "amountToPay");
                            throw null;
                        }
                        int iIntValue = num.intValue();
                        if (str5 != null) {
                            return new PaymentInstrumentsQuery.OnLinkedPayPal(iIntValue, str, str2, str3, str4, str5, zBooleanValue);
                        }
                        Assertions.a(reader, "id");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnLinkedPayPal value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20391a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isSelected");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "amountTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("amountValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("amountToPay");
            d.y(value.f, Adapters.b, writer, customScalarAdapters, "id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnLinkedPayPal) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnPaymentInstrumentResponseSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPaymentInstrumentResponseSuccess;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentInstrumentResponseSuccess implements Adapter<PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20449a = CollectionsKt.R("giftCardSection", "paymentMethodSection", "paymentInstrumentTotalDetails", "snackBarMessage", "footerMessageMd", "analytics");

        public static PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PaymentInstrumentsQuery.GiftCardSection giftCardSection = null;
            PaymentInstrumentsQuery.PaymentMethodSection paymentMethodSection = null;
            PaymentInstrumentsQuery.PaymentInstrumentTotalDetails paymentInstrumentTotalDetails = null;
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f20449a);
                if (iO2 == 0) {
                    giftCardSection = (PaymentInstrumentsQuery.GiftCardSection) Adapters.c(GiftCardSection.f20439a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    paymentMethodSection = (PaymentInstrumentsQuery.PaymentMethodSection) Adapters.c(PaymentMethodSection.f20458a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    paymentInstrumentTotalDetails = (PaymentInstrumentsQuery.PaymentInstrumentTotalDetails) Adapters.c(PaymentInstrumentTotalDetails.f20455a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Analytic.f20426a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (giftCardSection == null) {
                Assertions.a(reader, "giftCardSection");
                throw null;
            }
            if (paymentMethodSection == null) {
                Assertions.a(reader, "paymentMethodSection");
                throw null;
            }
            if (paymentInstrumentTotalDetails == null) {
                Assertions.a(reader, "paymentInstrumentTotalDetails");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess(giftCardSection, paymentMethodSection, paymentInstrumentTotalDetails, str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("giftCardSection");
            Adapters.c(GiftCardSection.f20439a, false).toJson(writer, customScalarAdapters, value.f20392a);
            writer.F1("paymentMethodSection");
            Adapters.c(PaymentMethodSection.f20458a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("paymentInstrumentTotalDetails");
            Adapters.c(PaymentInstrumentTotalDetails.f20455a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("snackBarMessage");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("footerMessageMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.a(Adapters.c(Analytic.f20426a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnPaymentInstrumentResponseValidationFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPaymentInstrumentResponseValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentInstrumentResponseValidationFailure implements Adapter<PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20450a = CollectionsKt.R("errorMessage", "errorTitle", "impressionAnalytics");

        public static PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            PaymentInstrumentsQuery.ImpressionAnalytics impressionAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f20450a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    impressionAnalytics = (PaymentInstrumentsQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f20440a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (str2 != null) {
                return new PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure(str, str2, impressionAnalytics);
            }
            Assertions.a(reader, "errorTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20393a);
            writer.F1("errorTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f20440a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnPlaceOrderButtonDefault;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPlaceOrderButtonDefault;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPlaceOrderButtonDefault implements Adapter<PaymentInstrumentsQuery.OnPlaceOrderButtonDefault> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20451a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "isEnabled", "analytics");

        public static PaymentInstrumentsQuery.OnPlaceOrderButtonDefault a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            PaymentInstrumentsQuery.Analytics2 analytics2 = null;
            while (true) {
                int iO2 = reader.o2(f20451a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    analytics2 = (PaymentInstrumentsQuery.Analytics2) Adapters.c(Analytics2.f20429a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isEnabled");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (analytics2 != null) {
                return new PaymentInstrumentsQuery.OnPlaceOrderButtonDefault(str, zBooleanValue, analytics2);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnPlaceOrderButtonDefault value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20394a);
            writer.F1("isEnabled");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "analytics");
            Adapters.c(Analytics2.f20429a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnPlaceOrderButtonDefault) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnPlaceOrderButtonGooglePay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnPlaceOrderButtonGooglePay;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPlaceOrderButtonGooglePay implements Adapter<PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20452a = CollectionsKt.Q("analytics");

        public static PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PaymentInstrumentsQuery.Analytics3 analytics3 = null;
            while (reader.o2(f20452a) == 0) {
                analytics3 = (PaymentInstrumentsQuery.Analytics3) Adapters.c(Analytics3.f20430a, true).fromJson(reader, customScalarAdapters);
            }
            if (analytics3 != null) {
                return new PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay(analytics3);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.c(Analytics3.f20430a, true).toJson(writer, customScalarAdapters, value.f20395a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnPlaceOrderButtonGooglePay) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnUnlinkedCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnUnlinkedCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUnlinkedCreditCard implements Adapter<PaymentInstrumentsQuery.OnUnlinkedCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20453a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, BarcodePickDeserializer.FIELD_ICON, "isSelected", "amountTitle", "amountValue", "amountToPay");

        public static PaymentInstrumentsQuery.OnUnlinkedCreditCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f20453a)) {
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
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str5 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num != null) {
                            return new PaymentInstrumentsQuery.OnUnlinkedCreditCard(num.intValue(), str, str2, str3, str4, str5, str6, zBooleanValue);
                        }
                        Assertions.a(reader, "amountToPay");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnUnlinkedCreditCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20396a);
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
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.h));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnUnlinkedCreditCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$OnUnlinkedGiftCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$OnUnlinkedGiftCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUnlinkedGiftCard implements Adapter<PaymentInstrumentsQuery.OnUnlinkedGiftCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20454a = CollectionsKt.R("number", "pin", "title", "isSelected", "amountTitle", "amountValue", "amountRedeem", "errorBanner", "snackBarMessage");

        public static PaymentInstrumentsQuery.OnUnlinkedGiftCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            String str5 = null;
            PaymentInstrumentsQuery.ErrorBanner1 errorBanner1 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f20454a)) {
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
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        errorBanner1 = (PaymentInstrumentsQuery.ErrorBanner1) Adapters.b(Adapters.c(ErrorBanner1.f20437a, false)).fromJson(reader, customScalarAdapters);
                        bool2 = bool2;
                        num = num;
                        continue;
                    case 8:
                        bool = bool2;
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "number");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "pin");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Integer num2 = num;
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str4 == null) {
                            Assertions.a(reader, "amountTitle");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "amountValue");
                            throw null;
                        }
                        if (num2 != null) {
                            return new PaymentInstrumentsQuery.OnUnlinkedGiftCard(str, str2, str3, zBooleanValue, str4, str5, num2.intValue(), errorBanner1, str6);
                        }
                        Assertions.a(reader, "amountRedeem");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentInstrumentsQuery.OnUnlinkedGiftCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("number");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20397a);
            writer.F1("pin");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("isSelected");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "amountTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("amountValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("amountRedeem");
            d.y(value.g, Adapters.b, writer, customScalarAdapters, "errorBanner");
            Adapters.b(Adapters.c(ErrorBanner1.f20437a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("snackBarMessage");
            Adapters.i.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentInstrumentsQuery.OnUnlinkedGiftCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$PaymentInstrumentTotalDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentInstrumentTotalDetails;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentInstrumentTotalDetails implements Adapter<PaymentInstrumentsQuery.PaymentInstrumentTotalDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentInstrumentTotalDetails f20455a = new PaymentInstrumentTotalDetails();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "button", "panelMarkdown");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            PaymentInstrumentsQuery.Button button = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    button = (PaymentInstrumentsQuery.Button) Adapters.c(Button.f20431a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
            if (button != null) {
                return new PaymentInstrumentsQuery.PaymentInstrumentTotalDetails(str, str2, button, str3);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.PaymentInstrumentTotalDetails value = (PaymentInstrumentsQuery.PaymentInstrumentTotalDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20398a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button.f20431a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("panelMarkdown");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$PaymentInstruments;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentInstruments;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentInstruments implements Adapter<PaymentInstrumentsQuery.PaymentInstruments> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentInstruments f20456a = new PaymentInstruments();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess onPaymentInstrumentResponseSuccessA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure onPaymentInstrumentResponseValidationFailureA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentInstrumentResponseSuccess"))) {
                reader.o();
                onPaymentInstrumentResponseSuccessA = OnPaymentInstrumentResponseSuccess.a(reader, customScalarAdapters);
            } else {
                onPaymentInstrumentResponseSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentInstrumentResponseValidationFailure"))) {
                reader.o();
                onPaymentInstrumentResponseValidationFailureA = OnPaymentInstrumentResponseValidationFailure.a(reader, customScalarAdapters);
            }
            return new PaymentInstrumentsQuery.PaymentInstruments(str, onPaymentInstrumentResponseSuccessA, onPaymentInstrumentResponseValidationFailureA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.PaymentInstruments value = (PaymentInstrumentsQuery.PaymentInstruments) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20399a);
            PaymentInstrumentsQuery.OnPaymentInstrumentResponseSuccess onPaymentInstrumentResponseSuccess = value.b;
            if (onPaymentInstrumentResponseSuccess != null) {
                OnPaymentInstrumentResponseSuccess.b(writer, customScalarAdapters, onPaymentInstrumentResponseSuccess);
            }
            PaymentInstrumentsQuery.OnPaymentInstrumentResponseValidationFailure onPaymentInstrumentResponseValidationFailure = value.c;
            if (onPaymentInstrumentResponseValidationFailure != null) {
                OnPaymentInstrumentResponseValidationFailure.b(writer, customScalarAdapters, onPaymentInstrumentResponseValidationFailure);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$PaymentMethod;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentMethod;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethod implements Adapter<PaymentInstrumentsQuery.PaymentMethod> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethod f20457a = new PaymentMethod();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PaymentInstrumentsQuery.OnAddCreditCard onAddCreditCardA;
            PaymentInstrumentsQuery.OnAddPayPal onAddPayPalA;
            PaymentInstrumentsQuery.OnLinkedCreditCard onLinkedCreditCardA;
            PaymentInstrumentsQuery.OnUnlinkedCreditCard onUnlinkedCreditCardA;
            PaymentInstrumentsQuery.OnExpiredCreditCard onExpiredCreditCardA;
            PaymentInstrumentsQuery.OnLinkedPayPal onLinkedPayPalA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PaymentInstrumentsQuery.OnGooglePay onGooglePayA = null;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("AddPayPal"))) {
                reader.o();
                onAddPayPalA = OnAddPayPal.a(reader, customScalarAdapters);
            } else {
                onAddPayPalA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LinkedCreditCard"))) {
                reader.o();
                onLinkedCreditCardA = OnLinkedCreditCard.a(reader, customScalarAdapters);
            } else {
                onLinkedCreditCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UnlinkedCreditCard"))) {
                reader.o();
                onUnlinkedCreditCardA = OnUnlinkedCreditCard.a(reader, customScalarAdapters);
            } else {
                onUnlinkedCreditCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ExpiredCreditCard"))) {
                reader.o();
                onExpiredCreditCardA = OnExpiredCreditCard.a(reader, customScalarAdapters);
            } else {
                onExpiredCreditCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LinkedPayPal"))) {
                reader.o();
                onLinkedPayPalA = OnLinkedPayPal.a(reader, customScalarAdapters);
            } else {
                onLinkedPayPalA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GooglePay"), BooleanExpressions.d("isGooglePayEnabled")))) {
                reader.o();
                onGooglePayA = OnGooglePay.a(reader, customScalarAdapters);
            }
            return new PaymentInstrumentsQuery.PaymentMethod(str, onAddCreditCardA, onAddPayPalA, onLinkedCreditCardA, onUnlinkedCreditCardA, onExpiredCreditCardA, onLinkedPayPalA, onGooglePayA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.PaymentMethod value = (PaymentInstrumentsQuery.PaymentMethod) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20400a);
            PaymentInstrumentsQuery.OnAddCreditCard onAddCreditCard = value.b;
            if (onAddCreditCard != null) {
                OnAddCreditCard.b(writer, customScalarAdapters, onAddCreditCard);
            }
            PaymentInstrumentsQuery.OnAddPayPal onAddPayPal = value.c;
            if (onAddPayPal != null) {
                OnAddPayPal.b(writer, customScalarAdapters, onAddPayPal);
            }
            PaymentInstrumentsQuery.OnLinkedCreditCard onLinkedCreditCard = value.d;
            if (onLinkedCreditCard != null) {
                OnLinkedCreditCard.b(writer, customScalarAdapters, onLinkedCreditCard);
            }
            PaymentInstrumentsQuery.OnUnlinkedCreditCard onUnlinkedCreditCard = value.e;
            if (onUnlinkedCreditCard != null) {
                OnUnlinkedCreditCard.b(writer, customScalarAdapters, onUnlinkedCreditCard);
            }
            PaymentInstrumentsQuery.OnExpiredCreditCard onExpiredCreditCard = value.f;
            if (onExpiredCreditCard != null) {
                OnExpiredCreditCard.b(writer, customScalarAdapters, onExpiredCreditCard);
            }
            PaymentInstrumentsQuery.OnLinkedPayPal onLinkedPayPal = value.g;
            if (onLinkedPayPal != null) {
                OnLinkedPayPal.b(writer, customScalarAdapters, onLinkedPayPal);
            }
            PaymentInstrumentsQuery.OnGooglePay onGooglePay = value.h;
            if (onGooglePay != null) {
                OnGooglePay.b(writer, customScalarAdapters, onGooglePay);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/PaymentInstrumentsQuery_ResponseAdapter$PaymentMethodSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/PaymentInstrumentsQuery$PaymentMethodSection;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodSection implements Adapter<PaymentInstrumentsQuery.PaymentMethodSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentMethodSection f20458a = new PaymentMethodSection();
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
                    arrayListFromJson = Adapters.a(Adapters.c(PaymentMethod.f20457a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new PaymentInstrumentsQuery.PaymentMethodSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "paymentMethods");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentInstrumentsQuery.PaymentMethodSection value = (PaymentInstrumentsQuery.PaymentMethodSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20401a);
            writer.F1("paymentMethods");
            Adapters.a(Adapters.c(PaymentMethod.f20457a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
