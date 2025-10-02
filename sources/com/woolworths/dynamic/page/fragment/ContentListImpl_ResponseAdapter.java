package com.woolworths.dynamic.page.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.dynamic.page.fragment.ContentList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentListImpl_ResponseAdapter;", "", "ContentList", "ContentListItem", "Cta", "Analytics", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentListImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentListImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/fragment/ContentList$Analytics;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ContentList.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f19294a = new Analytics();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentList.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentList.Analytics value = (ContentList.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19291a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentListImpl_ResponseAdapter$ContentList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/fragment/ContentList;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentList implements Adapter<com.woolworths.dynamic.page.fragment.ContentList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19295a = CollectionsKt.R("contentListTitle", "contentListItems");

        public static com.woolworths.dynamic.page.fragment.ContentList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f19295a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ContentListItem.f19296a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.dynamic.page.fragment.ContentList(str, arrayListFromJson);
            }
            Assertions.a(reader, "contentListItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.dynamic.page.fragment.ContentList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("contentListTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f19290a);
            writer.F1("contentListItems");
            Adapters.a(Adapters.c(ContentListItem.f19296a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.dynamic.page.fragment.ContentList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentListImpl_ResponseAdapter$ContentListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/fragment/ContentList$ContentListItem;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentListItem implements Adapter<ContentList.ContentListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentListItem f19296a = new ContentListItem();
        public static final List b = CollectionsKt.R("title", "imageUrl", "imageAltText", NotificationMessage.NOTIF_KEY_SUB_TITLE, "cta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ContentList.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    cta = (ContentList.Cta) Adapters.b(Adapters.c(Cta.f19297a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new ContentList.ContentListItem(str, str2, str3, str4, cta);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentList.ContentListItem value = (ContentList.ContentListItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19292a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageAltText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f19297a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/ContentListImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/dynamic/page/fragment/ContentList$Cta;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<ContentList.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f19297a = new Cta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ContentList.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    analytics = (ContentList.Analytics) Adapters.b(Adapters.c(Analytics.f19294a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new ContentList.Cta(str, str2, analytics);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentList.Cta value = (ContentList.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19293a);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f19294a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
