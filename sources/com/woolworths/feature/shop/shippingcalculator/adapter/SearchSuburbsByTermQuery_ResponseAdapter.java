package com.woolworths.feature.shop.shippingcalculator.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/adapter/SearchSuburbsByTermQuery_ResponseAdapter;", "", "Data", "SearchSuburbsByTerm", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSuburbsByTermQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/adapter/SearchSuburbsByTermQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$Data;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SearchSuburbsByTermQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20320a = new Data();
        public static final List b = CollectionsKt.Q("searchSuburbsByTerm");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.o2(b) == 0) {
                list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(SearchSuburbsByTerm.f20321a, false)))).fromJson(reader, customScalarAdapters);
            }
            return new SearchSuburbsByTermQuery.Data(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SearchSuburbsByTermQuery.Data value = (SearchSuburbsByTermQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("searchSuburbsByTerm");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(SearchSuburbsByTerm.f20321a, false)))).toJson(writer, customScalarAdapters, value.f20318a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/adapter/SearchSuburbsByTermQuery_ResponseAdapter$SearchSuburbsByTerm;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$SearchSuburbsByTerm;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchSuburbsByTerm implements Adapter<SearchSuburbsByTermQuery.SearchSuburbsByTerm> {

        /* renamed from: a, reason: collision with root package name */
        public static final SearchSuburbsByTerm f20321a = new SearchSuburbsByTerm();
        public static final List b = CollectionsKt.R("postcode", "state", TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new SearchSuburbsByTermQuery.SearchSuburbsByTerm(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SearchSuburbsByTermQuery.SearchSuburbsByTerm value = (SearchSuburbsByTermQuery.SearchSuburbsByTerm) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("postcode");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20319a);
            writer.F1("state");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
