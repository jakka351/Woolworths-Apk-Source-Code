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
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.payment.fragment.ZeroPaymentResponse;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponseImpl_ResponseAdapter;", "", "ZeroPaymentResponse", "OnPaymentSuccess", "OnPaymentValidationFailure", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ZeroPaymentResponseImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponseImpl_ResponseAdapter$OnPaymentSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse$OnPaymentSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentSuccess implements Adapter<ZeroPaymentResponse.OnPaymentSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23394a = CollectionsKt.R("orderId", "placed");

        public static ZeroPaymentResponse.OnPaymentSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f23394a);
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
                return new ZeroPaymentResponse.OnPaymentSuccess(iIntValue, bool.booleanValue());
            }
            Assertions.a(reader, "placed");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ZeroPaymentResponse.OnPaymentSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("orderId");
            d.y(value.f23392a, Adapters.b, writer, customScalarAdapters, "placed");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ZeroPaymentResponse.OnPaymentSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponseImpl_ResponseAdapter$OnPaymentValidationFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse$OnPaymentValidationFailure;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPaymentValidationFailure implements Adapter<ZeroPaymentResponse.OnPaymentValidationFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23395a = CollectionsKt.R("errorMessage", "errorCode");

        public static ZeroPaymentResponse.OnPaymentValidationFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23395a);
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
                return new ZeroPaymentResponse.OnPaymentValidationFailure(str, str2);
            }
            Assertions.a(reader, "errorCode");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ZeroPaymentResponse.OnPaymentValidationFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23393a);
            writer.F1("errorCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ZeroPaymentResponse.OnPaymentValidationFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponseImpl_ResponseAdapter$ZeroPaymentResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/payment/fragment/ZeroPaymentResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroPaymentResponse implements Adapter<com.woolworths.shop.payment.fragment.ZeroPaymentResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23396a = CollectionsKt.Q("__typename");

        public static com.woolworths.shop.payment.fragment.ZeroPaymentResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ZeroPaymentResponse.OnPaymentSuccess onPaymentSuccessA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ZeroPaymentResponse.OnPaymentValidationFailure onPaymentValidationFailureA = null;
            String str = null;
            while (reader.o2(f23396a) == 0) {
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("PaymentValidationFailure"))) {
                reader.o();
                onPaymentValidationFailureA = OnPaymentValidationFailure.a(reader, customScalarAdapters);
            }
            return new com.woolworths.shop.payment.fragment.ZeroPaymentResponse(str, onPaymentSuccessA, onPaymentValidationFailureA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.payment.fragment.ZeroPaymentResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23391a);
            ZeroPaymentResponse.OnPaymentSuccess onPaymentSuccess = value.b;
            if (onPaymentSuccess != null) {
                OnPaymentSuccess.b(writer, customScalarAdapters, onPaymentSuccess);
            }
            ZeroPaymentResponse.OnPaymentValidationFailure onPaymentValidationFailure = value.c;
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
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.payment.fragment.ZeroPaymentResponse) obj);
        }
    }
}
