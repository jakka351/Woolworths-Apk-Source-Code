package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.InitiateIdVerificationMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/InitiateIdVerificationMutation_ResponseAdapter;", "", "Data", "InitiateIdVerification", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitiateIdVerificationMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/InitiateIdVerificationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<InitiateIdVerificationMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21979a = new Data();
        public static final List b = CollectionsKt.Q("initiateIdVerification");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InitiateIdVerificationMutation.InitiateIdVerification initiateIdVerification = null;
            while (reader.o2(b) == 0) {
                initiateIdVerification = (InitiateIdVerificationMutation.InitiateIdVerification) Adapters.c(InitiateIdVerification.f21980a, false).fromJson(reader, customScalarAdapters);
            }
            if (initiateIdVerification != null) {
                return new InitiateIdVerificationMutation.Data(initiateIdVerification);
            }
            Assertions.a(reader, "initiateIdVerification");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InitiateIdVerificationMutation.Data value = (InitiateIdVerificationMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("initiateIdVerification");
            Adapters.c(InitiateIdVerification.f21980a, false).toJson(writer, customScalarAdapters, value.f21842a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/InitiateIdVerificationMutation_ResponseAdapter$InitiateIdVerification;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/InitiateIdVerificationMutation$InitiateIdVerification;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitiateIdVerification implements Adapter<InitiateIdVerificationMutation.InitiateIdVerification> {

        /* renamed from: a, reason: collision with root package name */
        public static final InitiateIdVerification f21980a = new InitiateIdVerification();
        public static final List b = CollectionsKt.R("verificationFormUrl", "callbackUrlPattern");

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
                Assertions.a(reader, "verificationFormUrl");
                throw null;
            }
            if (str2 != null) {
                return new InitiateIdVerificationMutation.InitiateIdVerification(str, str2);
            }
            Assertions.a(reader, "callbackUrlPattern");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InitiateIdVerificationMutation.InitiateIdVerification value = (InitiateIdVerificationMutation.InitiateIdVerification) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("verificationFormUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21843a);
            writer.F1("callbackUrlPattern");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
