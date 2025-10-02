package com.woolworths.shop.homepage.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.homepage.DismissBottomSheetMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/DismissBottomSheetMutation_ResponseAdapter;", "", "Data", "DismissBottomSheet", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DismissBottomSheetMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/DismissBottomSheetMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DismissBottomSheetMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23000a = new Data();
        public static final List b = CollectionsKt.Q("dismissBottomSheet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DismissBottomSheetMutation.DismissBottomSheet dismissBottomSheet = null;
            while (reader.o2(b) == 0) {
                dismissBottomSheet = (DismissBottomSheetMutation.DismissBottomSheet) Adapters.b(Adapters.c(DismissBottomSheet.f23001a, false)).fromJson(reader, customScalarAdapters);
            }
            return new DismissBottomSheetMutation.Data(dismissBottomSheet);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DismissBottomSheetMutation.Data value = (DismissBottomSheetMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("dismissBottomSheet");
            Adapters.b(Adapters.c(DismissBottomSheet.f23001a, false)).toJson(writer, customScalarAdapters, value.f22777a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/DismissBottomSheetMutation_ResponseAdapter$DismissBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/DismissBottomSheetMutation$DismissBottomSheet;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DismissBottomSheet implements Adapter<DismissBottomSheetMutation.DismissBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final DismissBottomSheet f23001a = new DismissBottomSheet();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new DismissBottomSheetMutation.DismissBottomSheet(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DismissBottomSheetMutation.DismissBottomSheet value = (DismissBottomSheetMutation.DismissBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22778a);
        }
    }
}
