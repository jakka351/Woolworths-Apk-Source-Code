package com.woolworths.feature.shop.payment.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.payment.PayMutation;
import com.woolworths.feature.shop.payment.fragment.AnalyticsImpl_ResponseAdapter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter;", "", "Data", "Pay", "OnWpayPaymentResponse", "OnWpayPaymentSuccess", "OnWpayPaymentFailure", "Analytics", "OnWpayPaymentValidationFailure", "Analytics1", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$Analytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<PayMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20213a = new Analytics();
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
            com.woolworths.feature.shop.payment.fragment.Analytics analyticsA = AnalyticsImpl_ResponseAdapter.Analytics.a(reader, customScalarAdapters);
            if (str != null) {
                return new PayMutation.Analytics(str, analyticsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayMutation.Analytics value = (PayMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20205a);
            List list = AnalyticsImpl_ResponseAdapter.Analytics.f20223a;
            AnalyticsImpl_ResponseAdapter.Analytics.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$Analytics1;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<PayMutation.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f20214a = new Analytics1();
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
            com.woolworths.feature.shop.payment.fragment.Analytics analyticsA = AnalyticsImpl_ResponseAdapter.Analytics.a(reader, customScalarAdapters);
            if (str != null) {
                return new PayMutation.Analytics1(str, analyticsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayMutation.Analytics1 value = (PayMutation.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20206a);
            List list = AnalyticsImpl_ResponseAdapter.Analytics.f20223a;
            AnalyticsImpl_ResponseAdapter.Analytics.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<PayMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20215a = new Data();
        public static final List b = CollectionsKt.Q("pay");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PayMutation.Pay pay = null;
            while (reader.o2(b) == 0) {
                pay = (PayMutation.Pay) Adapters.c(Pay.f20220a, true).fromJson(reader, customScalarAdapters);
            }
            if (pay != null) {
                return new PayMutation.Data(pay);
            }
            Assertions.a(reader, "pay");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayMutation.Data value = (PayMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pay");
            Adapters.c(Pay.f20220a, true).toJson(writer, customScalarAdapters, value.f20207a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$OnWpayPaymentFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWpayPaymentFailure implements Adapter<PayMutation.OnWpayPaymentFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20216a = CollectionsKt.R("errorMessage", "analytics", "regenerateIdempotencyKey");

        public static PayMutation.OnWpayPaymentFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            PayMutation.Analytics analytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20216a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    analytics = (PayMutation.Analytics) Adapters.c(Analytics.f20213a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (analytics == null) {
                Assertions.a(reader, "analytics");
                throw null;
            }
            if (bool != null) {
                return new PayMutation.OnWpayPaymentFailure(str, analytics, bool.booleanValue());
            }
            Assertions.a(reader, "regenerateIdempotencyKey");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PayMutation.OnWpayPaymentFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20208a);
            writer.F1("analytics");
            Adapters.c(Analytics.f20213a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("regenerateIdempotencyKey");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PayMutation.OnWpayPaymentFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$OnWpayPaymentResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentResponse;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWpayPaymentResponse implements Adapter<PayMutation.OnWpayPaymentResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20217a = CollectionsKt.Q("__typename");

        public static PayMutation.OnWpayPaymentResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PayMutation.OnWpayPaymentSuccess onWpayPaymentSuccessA;
            PayMutation.OnWpayPaymentFailure onWpayPaymentFailureA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PayMutation.OnWpayPaymentValidationFailure onWpayPaymentValidationFailureA = null;
            String str = null;
            while (reader.o2(f20217a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WpayPaymentSuccess"))) {
                reader.o();
                onWpayPaymentSuccessA = OnWpayPaymentSuccess.a(reader, customScalarAdapters);
            } else {
                onWpayPaymentSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WpayPaymentFailure"))) {
                reader.o();
                onWpayPaymentFailureA = OnWpayPaymentFailure.a(reader, customScalarAdapters);
            } else {
                onWpayPaymentFailureA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WpayPaymentValidationFailure"))) {
                reader.o();
                onWpayPaymentValidationFailureA = OnWpayPaymentValidationFailure.a(reader, customScalarAdapters);
            }
            return new PayMutation.OnWpayPaymentResponse(str, onWpayPaymentSuccessA, onWpayPaymentFailureA, onWpayPaymentValidationFailureA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PayMutation.OnWpayPaymentResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20209a);
            PayMutation.OnWpayPaymentSuccess onWpayPaymentSuccess = value.b;
            if (onWpayPaymentSuccess != null) {
                OnWpayPaymentSuccess.b(writer, customScalarAdapters, onWpayPaymentSuccess);
            }
            PayMutation.OnWpayPaymentFailure onWpayPaymentFailure = value.c;
            if (onWpayPaymentFailure != null) {
                OnWpayPaymentFailure.b(writer, customScalarAdapters, onWpayPaymentFailure);
            }
            PayMutation.OnWpayPaymentValidationFailure onWpayPaymentValidationFailure = value.d;
            if (onWpayPaymentValidationFailure != null) {
                OnWpayPaymentValidationFailure.b(writer, customScalarAdapters, onWpayPaymentValidationFailure);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PayMutation.OnWpayPaymentResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$OnWpayPaymentSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentSuccess;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWpayPaymentSuccess implements Adapter<PayMutation.OnWpayPaymentSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20218a = CollectionsKt.Q("orderId");

        public static PayMutation.OnWpayPaymentSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(f20218a) == 0) {
                num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new PayMutation.OnWpayPaymentSuccess(num.intValue());
            }
            Assertions.a(reader, "orderId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PayMutation.OnWpayPaymentSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f20210a));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PayMutation.OnWpayPaymentSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$OnWpayPaymentValidationFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$OnWpayPaymentValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWpayPaymentValidationFailure implements Adapter<PayMutation.OnWpayPaymentValidationFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20219a = CollectionsKt.R("errorMessage", "errorTitle", "analytics");

        public static PayMutation.OnWpayPaymentValidationFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            PayMutation.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(f20219a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    analytics1 = (PayMutation.Analytics1) Adapters.c(Analytics1.f20214a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "errorTitle");
                throw null;
            }
            if (analytics1 != null) {
                return new PayMutation.OnWpayPaymentValidationFailure(str, str2, analytics1);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PayMutation.OnWpayPaymentValidationFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20211a);
            writer.F1("errorTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.c(Analytics1.f20214a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PayMutation.OnWpayPaymentValidationFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/payment/adapter/PayMutation_ResponseAdapter$Pay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/payment/PayMutation$Pay;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pay implements Adapter<PayMutation.Pay> {

        /* renamed from: a, reason: collision with root package name */
        public static final Pay f20220a = new Pay();
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
            PayMutation.OnWpayPaymentResponse onWpayPaymentResponseA = OnWpayPaymentResponse.a(reader, customScalarAdapters);
            if (str != null) {
                return new PayMutation.Pay(str, onWpayPaymentResponseA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PayMutation.Pay value = (PayMutation.Pay) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20212a);
            List list = OnWpayPaymentResponse.f20217a;
            OnWpayPaymentResponse.b(writer, customScalarAdapters, value.b);
        }
    }
}
