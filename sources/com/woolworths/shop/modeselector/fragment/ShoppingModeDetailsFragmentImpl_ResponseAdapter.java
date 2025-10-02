package com.woolworths.shop.modeselector.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ShoppingModeDetailsFragmentImpl_ResponseAdapter;", "", "ShoppingModeDetailsFragment", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingModeDetailsFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ShoppingModeDetailsFragmentImpl_ResponseAdapter$ShoppingModeDetailsFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/fragment/ShoppingModeDetailsFragment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeDetailsFragment implements Adapter<com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23361a = CollectionsKt.R("displayName", "mode", "storeAddressId");

        public static com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(f23361a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment(str, str2, num);
            }
            Assertions.a(reader, "mode");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayName");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23360a);
            writer.F1("mode");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("storeAddressId");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment) obj);
        }
    }
}
