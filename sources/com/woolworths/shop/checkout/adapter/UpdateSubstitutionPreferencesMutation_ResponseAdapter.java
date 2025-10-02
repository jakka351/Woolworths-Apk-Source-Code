package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.UpdateSubstitutionPreferencesMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateSubstitutionPreferencesMutation_ResponseAdapter;", "", "Data", "UpdateSubstitutionPreferences", "OnUpdateSubstitutionPreferencesSuccessResponse", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateSubstitutionPreferencesMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateSubstitutionPreferencesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateSubstitutionPreferencesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22055a = new Data();
        public static final List b = CollectionsKt.Q("updateSubstitutionPreferences");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences updateSubstitutionPreferences = null;
            while (reader.o2(b) == 0) {
                updateSubstitutionPreferences = (UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences) Adapters.c(UpdateSubstitutionPreferences.f22057a, true).fromJson(reader, customScalarAdapters);
            }
            if (updateSubstitutionPreferences != null) {
                return new UpdateSubstitutionPreferencesMutation.Data(updateSubstitutionPreferences);
            }
            Assertions.a(reader, "updateSubstitutionPreferences");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateSubstitutionPreferencesMutation.Data value = (UpdateSubstitutionPreferencesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateSubstitutionPreferences");
            Adapters.c(UpdateSubstitutionPreferences.f22057a, true).toJson(writer, customScalarAdapters, value.f21937a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateSubstitutionPreferencesMutation_ResponseAdapter$OnUpdateSubstitutionPreferencesSuccessResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$OnUpdateSubstitutionPreferencesSuccessResponse;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUpdateSubstitutionPreferencesSuccessResponse implements Adapter<UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22056a = CollectionsKt.Q("isSuccess");

        public static UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f22056a) == 0) {
                bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse(bool.booleanValue());
            }
            Assertions.a(reader, "isSuccess");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isSuccess");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f21938a));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateSubstitutionPreferencesMutation_ResponseAdapter$UpdateSubstitutionPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdateSubstitutionPreferencesMutation$UpdateSubstitutionPreferences;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateSubstitutionPreferences implements Adapter<UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateSubstitutionPreferences f22057a = new UpdateSubstitutionPreferences();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse onUpdateSubstitutionPreferencesSuccessResponseA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("UpdateSubstitutionPreferencesSuccessResponse"))) {
                reader.o();
                onUpdateSubstitutionPreferencesSuccessResponseA = OnUpdateSubstitutionPreferencesSuccessResponse.a(reader, customScalarAdapters);
            }
            return new UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences(str, onUpdateSubstitutionPreferencesSuccessResponseA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences value = (UpdateSubstitutionPreferencesMutation.UpdateSubstitutionPreferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21939a);
            UpdateSubstitutionPreferencesMutation.OnUpdateSubstitutionPreferencesSuccessResponse onUpdateSubstitutionPreferencesSuccessResponse = value.b;
            if (onUpdateSubstitutionPreferencesSuccessResponse != null) {
                OnUpdateSubstitutionPreferencesSuccessResponse.b(writer, customScalarAdapters, onUpdateSubstitutionPreferencesSuccessResponse);
            }
        }
    }
}
