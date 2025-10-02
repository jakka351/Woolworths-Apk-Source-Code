package com.woolworths.feature.shop.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.UnlinkPayPalMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkPayPalMutation_ResponseAdapter;", "", "Data", "UnlinkPayPal", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlinkPayPalMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkPayPalMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UnlinkPayPalMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20468a = new Data();
        public static final List b = CollectionsKt.Q("unlinkPayPal");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UnlinkPayPalMutation.UnlinkPayPal unlinkPayPal = null;
            while (reader.o2(b) == 0) {
                unlinkPayPal = (UnlinkPayPalMutation.UnlinkPayPal) Adapters.c(UnlinkPayPal.f20469a, false).fromJson(reader, customScalarAdapters);
            }
            if (unlinkPayPal != null) {
                return new UnlinkPayPalMutation.Data(unlinkPayPal);
            }
            Assertions.a(reader, "unlinkPayPal");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkPayPalMutation.Data value = (UnlinkPayPalMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("unlinkPayPal");
            Adapters.c(UnlinkPayPal.f20469a, false).toJson(writer, customScalarAdapters, value.f20414a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkPayPalMutation_ResponseAdapter$UnlinkPayPal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$UnlinkPayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlinkPayPal implements Adapter<UnlinkPayPalMutation.UnlinkPayPal> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnlinkPayPal f20469a = new UnlinkPayPal();
        public static final List b = CollectionsKt.R("success", "message");

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
                return new UnlinkPayPalMutation.UnlinkPayPal(bool.booleanValue(), str);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkPayPalMutation.UnlinkPayPal value = (UnlinkPayPalMutation.UnlinkPayPal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f20415a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
