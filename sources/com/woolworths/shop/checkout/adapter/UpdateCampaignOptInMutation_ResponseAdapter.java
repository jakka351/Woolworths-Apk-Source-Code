package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.UpdateCampaignOptInMutation;
import com.woolworths.shop.checkout.fragment.CheckoutContent;
import com.woolworths.shop.checkout.fragment.CheckoutContentImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateCampaignOptInMutation_ResponseAdapter;", "", "Data", "UpdateCampaignOptIn", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCampaignOptInMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateCampaignOptInMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdateCampaignOptInMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateCampaignOptInMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22037a = new Data();
        public static final List b = CollectionsKt.Q("updateCampaignOptIn");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateCampaignOptInMutation.UpdateCampaignOptIn updateCampaignOptIn = null;
            while (reader.o2(b) == 0) {
                updateCampaignOptIn = (UpdateCampaignOptInMutation.UpdateCampaignOptIn) Adapters.b(Adapters.c(UpdateCampaignOptIn.f22038a, true)).fromJson(reader, customScalarAdapters);
            }
            return new UpdateCampaignOptInMutation.Data(updateCampaignOptIn);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCampaignOptInMutation.Data value = (UpdateCampaignOptInMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateCampaignOptIn");
            Adapters.b(Adapters.c(UpdateCampaignOptIn.f22038a, true)).toJson(writer, customScalarAdapters, value.f21910a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/UpdateCampaignOptInMutation_ResponseAdapter$UpdateCampaignOptIn;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/UpdateCampaignOptInMutation$UpdateCampaignOptIn;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateCampaignOptIn implements Adapter<UpdateCampaignOptInMutation.UpdateCampaignOptIn> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateCampaignOptIn f22038a = new UpdateCampaignOptIn();
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
                return new UpdateCampaignOptInMutation.UpdateCampaignOptIn(str, checkoutContentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateCampaignOptInMutation.UpdateCampaignOptIn value = (UpdateCampaignOptInMutation.UpdateCampaignOptIn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21911a);
            List list = CheckoutContentImpl_ResponseAdapter.CheckoutContent.f22152a;
            CheckoutContentImpl_ResponseAdapter.CheckoutContent.b(writer, customScalarAdapters, value.b);
        }
    }
}
