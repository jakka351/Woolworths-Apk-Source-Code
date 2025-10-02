package com.woolworths.feature.shop.contentpage.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.contentpage.MoreMenuQuery;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import com.woolworths.feature.shop.contentpage.fragment.ContentPageImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/MoreMenuQuery_ResponseAdapter;", "", "Data", "MenuPage", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreMenuQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/MoreMenuQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/MoreMenuQuery$Data;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MoreMenuQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19520a = new Data();
        public static final List b = CollectionsKt.Q("menuPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            MoreMenuQuery.MenuPage menuPage = null;
            while (reader.o2(b) == 0) {
                menuPage = (MoreMenuQuery.MenuPage) Adapters.c(MenuPage.f19521a, true).fromJson(reader, customScalarAdapters);
            }
            if (menuPage != null) {
                return new MoreMenuQuery.Data(menuPage);
            }
            Assertions.a(reader, "menuPage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreMenuQuery.Data value = (MoreMenuQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("menuPage");
            Adapters.c(MenuPage.f19521a, true).toJson(writer, customScalarAdapters, value.f19511a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/adapter/MoreMenuQuery_ResponseAdapter$MenuPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/MoreMenuQuery$MenuPage;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MenuPage implements Adapter<MoreMenuQuery.MenuPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final MenuPage f19521a = new MenuPage();
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
                return new MoreMenuQuery.MenuPage(str, contentPageA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            MoreMenuQuery.MenuPage value = (MoreMenuQuery.MenuPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19512a);
            List list = ContentPageImpl_ResponseAdapter.ContentPage.f19663a;
            ContentPageImpl_ResponseAdapter.ContentPage.b(writer, customScalarAdapters, value.b);
        }
    }
}
