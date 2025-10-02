package com.woolworths.shop.payment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.payment.fragment.PaymentResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter;", "", "PaymentResponse", "OnPaymentSuccess", "OnPaymentFailure", "PaymentError", "StepUp", "OnPaymentValidationFailure", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentResponseImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$OnPaymentFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentFailure;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentFailure implements Adapter<PaymentResponse.OnPaymentFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23385a = CollectionsKt.Q("paymentErrors");

        public static PaymentResponse.OnPaymentFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23385a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(PaymentError.f23388a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new PaymentResponse.OnPaymentFailure(arrayListFromJson);
            }
            Assertions.a(reader, "paymentErrors");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentResponse.OnPaymentFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("paymentErrors");
            Adapters.a(Adapters.c(PaymentError.f23388a, false)).toJson(writer, customScalarAdapters, value.f23380a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentResponse.OnPaymentFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$OnPaymentSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentSuccess implements Adapter<PaymentResponse.OnPaymentSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23386a = CollectionsKt.R("orderId", "placed");

        public static PaymentResponse.OnPaymentSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f23386a);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "orderId");
                throw null;
            }
            int iIntValue = num.intValue();
            if (bool != null) {
                return new PaymentResponse.OnPaymentSuccess(iIntValue, bool.booleanValue());
            }
            Assertions.a(reader, "placed");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentResponse.OnPaymentSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            d.y(value.f23381a, Adapters.b, writer, customScalarAdapters, "placed");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentResponse.OnPaymentSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$OnPaymentValidationFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse$OnPaymentValidationFailure;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentValidationFailure implements Adapter<PaymentResponse.OnPaymentValidationFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23387a = CollectionsKt.R("errorMessage", "errorCode");

        public static PaymentResponse.OnPaymentValidationFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23387a);
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
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (str2 != null) {
                return new PaymentResponse.OnPaymentValidationFailure(str, str2);
            }
            Assertions.a(reader, "errorCode");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PaymentResponse.OnPaymentValidationFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23382a);
            writer.F1("errorCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PaymentResponse.OnPaymentValidationFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$PaymentError;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse$PaymentError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentError implements Adapter<PaymentResponse.PaymentError> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentError f23388a = new PaymentError();
        public static final List b = CollectionsKt.R("paymentInstrumentId", "errorCode", "errorMessage", "stepUp");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            PaymentResponse.StepUp stepUp = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new PaymentResponse.PaymentError(str, str2, str3, stepUp);
                    }
                    stepUp = (PaymentResponse.StepUp) Adapters.b(Adapters.c(StepUp.f23390a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentResponse.PaymentError value = (PaymentResponse.PaymentError) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("paymentInstrumentId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23383a);
            writer.F1("errorCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("errorMessage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("stepUp");
            Adapters.b(Adapters.c(StepUp.f23390a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$PaymentResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentResponse implements Adapter<com.woolworths.shop.payment.fragment.PaymentResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23389a = CollectionsKt.Q("__typename");

        public static com.woolworths.shop.payment.fragment.PaymentResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            PaymentResponse.OnPaymentSuccess onPaymentSuccessA;
            PaymentResponse.OnPaymentFailure onPaymentFailureA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            PaymentResponse.OnPaymentValidationFailure onPaymentValidationFailureA = null;
            String str = null;
            while (reader.o2(f23389a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentSuccess"))) {
                reader.o();
                onPaymentSuccessA = OnPaymentSuccess.a(reader, customScalarAdapters);
            } else {
                onPaymentSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentFailure"))) {
                reader.o();
                onPaymentFailureA = OnPaymentFailure.a(reader, customScalarAdapters);
            } else {
                onPaymentFailureA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentValidationFailure"))) {
                reader.o();
                onPaymentValidationFailureA = OnPaymentValidationFailure.a(reader, customScalarAdapters);
            }
            return new com.woolworths.shop.payment.fragment.PaymentResponse(str, onPaymentSuccessA, onPaymentFailureA, onPaymentValidationFailureA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.payment.fragment.PaymentResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23379a);
            PaymentResponse.OnPaymentSuccess onPaymentSuccess = value.b;
            if (onPaymentSuccess != null) {
                OnPaymentSuccess.b(writer, customScalarAdapters, onPaymentSuccess);
            }
            PaymentResponse.OnPaymentFailure onPaymentFailure = value.c;
            if (onPaymentFailure != null) {
                OnPaymentFailure.b(writer, customScalarAdapters, onPaymentFailure);
            }
            PaymentResponse.OnPaymentValidationFailure onPaymentValidationFailure = value.d;
            if (onPaymentValidationFailure != null) {
                OnPaymentValidationFailure.b(writer, customScalarAdapters, onPaymentValidationFailure);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.payment.fragment.PaymentResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/PaymentResponseImpl_ResponseAdapter$StepUp;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/PaymentResponse$StepUp;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StepUp implements Adapter<PaymentResponse.StepUp> {

        /* renamed from: a, reason: collision with root package name */
        public static final StepUp f23390a = new StepUp();
        public static final List b = CollectionsKt.R("mandatory", "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new PaymentResponse.StepUp(bool.booleanValue(), str);
            }
            Assertions.a(reader, "mandatory");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PaymentResponse.StepUp value = (PaymentResponse.StepUp) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("mandatory");
            d.B(value.f23384a, Adapters.f, writer, customScalarAdapters, "url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
