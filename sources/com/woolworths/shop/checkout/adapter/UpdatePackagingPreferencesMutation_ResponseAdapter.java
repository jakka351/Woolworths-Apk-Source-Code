package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.UpdatePackagingPreferencesMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContent;
import com.woolworths.shop.checkout.fragment.CheckoutContentImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdatePackagingPreferencesMutation_ResponseAdapter;", "", "Data", "UpdatePackagingPreferences", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdatePackagingPreferencesMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdatePackagingPreferencesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdatePackagingPreferencesMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdatePackagingPreferencesMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22045a = new Data();
        public static final List b = CollectionsKt.Q("updatePackagingPreferences");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdatePackagingPreferencesMutation.UpdatePackagingPreferences updatePackagingPreferences = null;
            while (reader.o2(b) == 0) {
                updatePackagingPreferences = (UpdatePackagingPreferencesMutation.UpdatePackagingPreferences) Adapters.b(Adapters.c(UpdatePackagingPreferences.f22046a, true)).fromJson(reader, customScalarAdapters);
            }
            return new UpdatePackagingPreferencesMutation.Data(updatePackagingPreferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePackagingPreferencesMutation.Data value = (UpdatePackagingPreferencesMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updatePackagingPreferences");
            Adapters.b(Adapters.c(UpdatePackagingPreferences.f22046a, true)).toJson(writer, customScalarAdapters, value.f21922a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdatePackagingPreferencesMutation_ResponseAdapter$UpdatePackagingPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdatePackagingPreferencesMutation$UpdatePackagingPreferences;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatePackagingPreferences implements Adapter<UpdatePackagingPreferencesMutation.UpdatePackagingPreferences> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdatePackagingPreferences f22046a = new UpdatePackagingPreferences();
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
            CheckoutContent checkoutContentA = CheckoutContentImpl_ResponseAdapter.CheckoutContent.a(reader, customScalarAdapters);
            if (str != null) {
                return new UpdatePackagingPreferencesMutation.UpdatePackagingPreferences(str, checkoutContentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdatePackagingPreferencesMutation.UpdatePackagingPreferences value = (UpdatePackagingPreferencesMutation.UpdatePackagingPreferences) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21923a);
            List list = CheckoutContentImpl_ResponseAdapter.CheckoutContent.f22152a;
            CheckoutContentImpl_ResponseAdapter.CheckoutContent.b(writer, customScalarAdapters, value.b);
        }
    }
}
