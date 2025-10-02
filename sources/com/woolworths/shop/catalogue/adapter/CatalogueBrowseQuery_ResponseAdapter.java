package com.woolworths.shop.catalogue.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.CatalogueBrowseQuery;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPageImpl_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowsePromotionPage;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowsePromotionPageImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter;", "", "Data", "CatalogueBrowse", "Page", "OnCatalogueBrowseCategoryPage", "OnCatalogueBrowsePromotionPage", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueBrowseQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter$CatalogueBrowse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$CatalogueBrowse;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueBrowse implements Adapter<CatalogueBrowseQuery.CatalogueBrowse> {

        /* renamed from: a, reason: collision with root package name */
        public static final CatalogueBrowse f21699a = new CatalogueBrowse();
        public static final List b = CollectionsKt.R("totalNumberOfPages", "pages");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Page.f21703a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "totalNumberOfPages");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListFromJson != null) {
                return new CatalogueBrowseQuery.CatalogueBrowse(iIntValue, arrayListFromJson);
            }
            Assertions.a(reader, "pages");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueBrowseQuery.CatalogueBrowse value = (CatalogueBrowseQuery.CatalogueBrowse) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfPages");
            d.y(value.f21646a, Adapters.b, writer, customScalarAdapters, "pages");
            Adapters.a(Adapters.c(Page.f21703a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CatalogueBrowseQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21700a = new Data();
        public static final List b = CollectionsKt.Q("catalogueBrowse");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CatalogueBrowseQuery.CatalogueBrowse catalogueBrowse = null;
            while (reader.o2(b) == 0) {
                catalogueBrowse = (CatalogueBrowseQuery.CatalogueBrowse) Adapters.b(Adapters.c(CatalogueBrowse.f21699a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CatalogueBrowseQuery.Data(catalogueBrowse);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueBrowseQuery.Data value = (CatalogueBrowseQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("catalogueBrowse");
            Adapters.b(Adapters.c(CatalogueBrowse.f21699a, false)).toJson(writer, customScalarAdapters, value.f21647a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter$OnCatalogueBrowseCategoryPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$OnCatalogueBrowseCategoryPage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueBrowseCategoryPage implements Adapter<CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21701a = CollectionsKt.Q("__typename");

        public static CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21701a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CatalogueBrowseCategoryPage catalogueBrowseCategoryPageA = CatalogueBrowseCategoryPageImpl_ResponseAdapter.CatalogueBrowseCategoryPage.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage(str, catalogueBrowseCategoryPageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21648a);
            List list = CatalogueBrowseCategoryPageImpl_ResponseAdapter.CatalogueBrowseCategoryPage.f21756a;
            CatalogueBrowseCategoryPageImpl_ResponseAdapter.CatalogueBrowseCategoryPage.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter$OnCatalogueBrowsePromotionPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$OnCatalogueBrowsePromotionPage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueBrowsePromotionPage implements Adapter<CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21702a = CollectionsKt.Q("__typename");

        public static CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21702a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CatalogueBrowsePromotionPage catalogueBrowsePromotionPageA = CatalogueBrowsePromotionPageImpl_ResponseAdapter.CatalogueBrowsePromotionPage.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage(str, catalogueBrowsePromotionPageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21649a);
            List list = CatalogueBrowsePromotionPageImpl_ResponseAdapter.CatalogueBrowsePromotionPage.f21768a;
            CatalogueBrowsePromotionPageImpl_ResponseAdapter.CatalogueBrowsePromotionPage.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueBrowseQuery_ResponseAdapter$Page;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueBrowseQuery$Page;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Page implements Adapter<CatalogueBrowseQuery.Page> {

        /* renamed from: a, reason: collision with root package name */
        public static final Page f21703a = new Page();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage onCatalogueBrowseCategoryPageA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage onCatalogueBrowsePromotionPageA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueBrowseCategoryPage"))) {
                reader.o();
                onCatalogueBrowseCategoryPageA = OnCatalogueBrowseCategoryPage.a(reader, customScalarAdapters);
            } else {
                onCatalogueBrowseCategoryPageA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CatalogueBrowsePromotionPage"), BooleanExpressions.d("includePromotionPage")))) {
                reader.o();
                onCatalogueBrowsePromotionPageA = OnCatalogueBrowsePromotionPage.a(reader, customScalarAdapters);
            }
            return new CatalogueBrowseQuery.Page(str, onCatalogueBrowseCategoryPageA, onCatalogueBrowsePromotionPageA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueBrowseQuery.Page value = (CatalogueBrowseQuery.Page) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21650a);
            CatalogueBrowseQuery.OnCatalogueBrowseCategoryPage onCatalogueBrowseCategoryPage = value.b;
            if (onCatalogueBrowseCategoryPage != null) {
                OnCatalogueBrowseCategoryPage.b(writer, customScalarAdapters, onCatalogueBrowseCategoryPage);
            }
            CatalogueBrowseQuery.OnCatalogueBrowsePromotionPage onCatalogueBrowsePromotionPage = value.c;
            if (onCatalogueBrowsePromotionPage != null) {
                OnCatalogueBrowsePromotionPage.b(writer, customScalarAdapters, onCatalogueBrowsePromotionPage);
            }
        }
    }
}
