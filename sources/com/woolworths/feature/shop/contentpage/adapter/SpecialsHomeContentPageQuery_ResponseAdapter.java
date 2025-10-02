package com.woolworths.feature.shop.contentpage.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.contentpage.SpecialsHomeContentPageQuery;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import com.woolworths.feature.shop.contentpage.fragment.ContentPageImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/SpecialsHomeContentPageQuery_ResponseAdapter;", "", "Data", "SpecialsHome", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpecialsHomeContentPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/SpecialsHomeContentPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$Data;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SpecialsHomeContentPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19522a = new Data();
        public static final List b = CollectionsKt.Q("specialsHome");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SpecialsHomeContentPageQuery.SpecialsHome specialsHome = null;
            while (reader.o2(b) == 0) {
                specialsHome = (SpecialsHomeContentPageQuery.SpecialsHome) Adapters.b(Adapters.c(SpecialsHome.f19523a, true)).fromJson(reader, customScalarAdapters);
            }
            return new SpecialsHomeContentPageQuery.Data(specialsHome);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeContentPageQuery.Data value = (SpecialsHomeContentPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("specialsHome");
            Adapters.b(Adapters.c(SpecialsHome.f19523a, true)).toJson(writer, customScalarAdapters, value.f19514a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/SpecialsHomeContentPageQuery_ResponseAdapter$SpecialsHome;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/SpecialsHomeContentPageQuery$SpecialsHome;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpecialsHome implements Adapter<SpecialsHomeContentPageQuery.SpecialsHome> {

        /* renamed from: a, reason: collision with root package name */
        public static final SpecialsHome f19523a = new SpecialsHome();
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
            ContentPage contentPageA = ContentPageImpl_ResponseAdapter.ContentPage.a(reader, customScalarAdapters);
            if (str != null) {
                return new SpecialsHomeContentPageQuery.SpecialsHome(str, contentPageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpecialsHomeContentPageQuery.SpecialsHome value = (SpecialsHomeContentPageQuery.SpecialsHome) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19515a);
            List list = ContentPageImpl_ResponseAdapter.ContentPage.f19663a;
            ContentPageImpl_ResponseAdapter.ContentPage.b(writer, customScalarAdapters, value.b);
        }
    }
}
