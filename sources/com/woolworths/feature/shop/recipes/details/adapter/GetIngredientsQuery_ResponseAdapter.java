package com.woolworths.feature.shop.recipes.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.recipes.details.GetIngredientsQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/GetIngredientsQuery_ResponseAdapter;", "", "Data", "GetIngredients", "ServesInfo", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetIngredientsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/GetIngredientsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetIngredientsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20272a = new Data();
        public static final List b = CollectionsKt.Q("getIngredients");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetIngredientsQuery.GetIngredients getIngredients = null;
            while (reader.o2(b) == 0) {
                getIngredients = (GetIngredientsQuery.GetIngredients) Adapters.b(Adapters.c(GetIngredients.f20273a, false)).fromJson(reader, customScalarAdapters);
            }
            return new GetIngredientsQuery.Data(getIngredients);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetIngredientsQuery.Data value = (GetIngredientsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("getIngredients");
            Adapters.b(Adapters.c(GetIngredients.f20273a, false)).toJson(writer, customScalarAdapters, value.f20228a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/GetIngredientsQuery_ResponseAdapter$GetIngredients;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$GetIngredients;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GetIngredients implements Adapter<GetIngredientsQuery.GetIngredients> {

        /* renamed from: a, reason: collision with root package name */
        public static final GetIngredients f20273a = new GetIngredients();
        public static final List b = CollectionsKt.R("servesInfo", "ingredients");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            GetIngredientsQuery.ServesInfo servesInfo = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    servesInfo = (GetIngredientsQuery.ServesInfo) Adapters.b(Adapters.c(ServesInfo.f20274a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new GetIngredientsQuery.GetIngredients(servesInfo, arrayListFromJson);
            }
            Assertions.a(reader, "ingredients");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetIngredientsQuery.GetIngredients value = (GetIngredientsQuery.GetIngredients) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("servesInfo");
            Adapters.b(Adapters.c(ServesInfo.f20274a, false)).toJson(writer, customScalarAdapters, value.f20229a);
            writer.F1("ingredients");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/GetIngredientsQuery_ResponseAdapter$ServesInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$ServesInfo;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServesInfo implements Adapter<GetIngredientsQuery.ServesInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ServesInfo f20274a = new ServesInfo();
        public static final List b = CollectionsKt.R("quantity", "title", "minimum", "maximum");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (num2 == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (num3 != null) {
                return new GetIngredientsQuery.ServesInfo(iIntValue, iIntValue2, num3.intValue(), str);
            }
            Assertions.a(reader, "maximum");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            GetIngredientsQuery.ServesInfo value = (GetIngredientsQuery.ServesInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("quantity");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f20230a, adapters$IntAdapter$1, writer, customScalarAdapters, "title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("minimum");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "maximum");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.d));
        }
    }
}
