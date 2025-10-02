package com.woolworths.feature.shop.myorders.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.SubmitDriverRatingSurveyMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/SubmitDriverRatingSurveyMutation_ResponseAdapter;", "", "Data", "SubmitDriverRatingSurvey", "Error", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubmitDriverRatingSurveyMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/SubmitDriverRatingSurveyMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SubmitDriverRatingSurveyMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20185a = new Data();
        public static final List b = CollectionsKt.Q("submitDriverRatingSurvey");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey submitDriverRatingSurvey = null;
            while (reader.o2(b) == 0) {
                submitDriverRatingSurvey = (SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey) Adapters.c(SubmitDriverRatingSurvey.f20187a, false).fromJson(reader, customScalarAdapters);
            }
            if (submitDriverRatingSurvey != null) {
                return new SubmitDriverRatingSurveyMutation.Data(submitDriverRatingSurvey);
            }
            Assertions.a(reader, "submitDriverRatingSurvey");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitDriverRatingSurveyMutation.Data value = (SubmitDriverRatingSurveyMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("submitDriverRatingSurvey");
            Adapters.c(SubmitDriverRatingSurvey.f20187a, false).toJson(writer, customScalarAdapters, value.f20019a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/SubmitDriverRatingSurveyMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Error;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<SubmitDriverRatingSurveyMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f20186a = new Error();
        public static final List b = CollectionsKt.R("code", "message");

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
                Assertions.a(reader, "code");
                throw null;
            }
            if (str2 != null) {
                return new SubmitDriverRatingSurveyMutation.Error(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitDriverRatingSurveyMutation.Error value = (SubmitDriverRatingSurveyMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("code");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20020a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/myorders/adapter/SubmitDriverRatingSurveyMutation_ResponseAdapter$SubmitDriverRatingSurvey;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$SubmitDriverRatingSurvey;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubmitDriverRatingSurvey implements Adapter<SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitDriverRatingSurvey f20187a = new SubmitDriverRatingSurvey();
        public static final List b = CollectionsKt.R("success", "message", "error");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            SubmitDriverRatingSurveyMutation.Error error = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    error = (SubmitDriverRatingSurveyMutation.Error) Adapters.b(Adapters.c(Error.f20186a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey(zBooleanValue, str, error);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey value = (SubmitDriverRatingSurveyMutation.SubmitDriverRatingSurvey) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f20021a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("error");
            Adapters.b(Adapters.c(Error.f20186a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
