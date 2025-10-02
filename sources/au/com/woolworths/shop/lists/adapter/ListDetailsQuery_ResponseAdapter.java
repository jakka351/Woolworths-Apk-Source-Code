package au.com.woolworths.shop.lists.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.lists.ListDetailsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter;", "", "Data", "ListDetails", "Total", "Summary", "Section", "OnListDetailsTotalSectionHeader", "OnListDetailsPotentialSavings", "OnListDetailsRewardsSummary", "Disclaimer", "Overview", "ProductAction", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Data;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ListDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12235a = new Data();
        public static final List b = CollectionsKt.Q("listDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ListDetailsQuery.ListDetails listDetails = null;
            while (reader.o2(b) == 0) {
                listDetails = (ListDetailsQuery.ListDetails) Adapters.c(ListDetails.f12237a, false).fromJson(reader, customScalarAdapters);
            }
            if (listDetails != null) {
                return new ListDetailsQuery.Data(listDetails);
            }
            Assertions.a(reader, "listDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Data value = (ListDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("listDetails");
            Adapters.c(ListDetails.f12237a, false).toJson(writer, customScalarAdapters, value.f12216a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Disclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Disclaimer;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Disclaimer implements Adapter<ListDetailsQuery.Disclaimer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Disclaimer f12236a = new Disclaimer();
        public static final List b = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ListDetailsQuery.Disclaimer(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Disclaimer value = (ListDetailsQuery.Disclaimer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12217a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$ListDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$ListDetails;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ListDetails implements Adapter<ListDetailsQuery.ListDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ListDetails f12237a = new ListDetails();
        public static final List b = CollectionsKt.R("total", "productActions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ListDetailsQuery.Total total = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    total = (ListDetailsQuery.Total) Adapters.b(Adapters.c(Total.f12245a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ListDetailsQuery.ListDetails(total, list);
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ProductAction.f12242a, false))).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.ListDetails value = (ListDetailsQuery.ListDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("total");
            Adapters.b(Adapters.c(Total.f12245a, false)).toJson(writer, customScalarAdapters, value.f12218a);
            writer.F1("productActions");
            Adapters.b(Adapters.a(Adapters.c(ProductAction.f12242a, false))).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$OnListDetailsPotentialSavings;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsPotentialSavings;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnListDetailsPotentialSavings implements Adapter<ListDetailsQuery.OnListDetailsPotentialSavings> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12238a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "value");

        public static ListDetailsQuery.OnListDetailsPotentialSavings a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f12238a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new ListDetailsQuery.OnListDetailsPotentialSavings(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ListDetailsQuery.OnListDetailsPotentialSavings value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12219a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ListDetailsQuery.OnListDetailsPotentialSavings) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$OnListDetailsRewardsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsRewardsSummary;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnListDetailsRewardsSummary implements Adapter<ListDetailsQuery.OnListDetailsRewardsSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12239a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "value", "imageUrl");

        public static ListDetailsQuery.OnListDetailsRewardsSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f12239a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new ListDetailsQuery.OnListDetailsRewardsSummary(str, str2, str3);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ListDetailsQuery.OnListDetailsRewardsSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12220a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ListDetailsQuery.OnListDetailsRewardsSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$OnListDetailsTotalSectionHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsTotalSectionHeader;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnListDetailsTotalSectionHeader implements Adapter<ListDetailsQuery.OnListDetailsTotalSectionHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12240a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "value");

        public static ListDetailsQuery.OnListDetailsTotalSectionHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f12240a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new ListDetailsQuery.OnListDetailsTotalSectionHeader(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ListDetailsQuery.OnListDetailsTotalSectionHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12221a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ListDetailsQuery.OnListDetailsTotalSectionHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Overview;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Overview;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Overview implements Adapter<ListDetailsQuery.Overview> {

        /* renamed from: a, reason: collision with root package name */
        public static final Overview f12241a = new Overview();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "value", "altText");

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
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "value");
                throw null;
            }
            if (str3 != null) {
                return new ListDetailsQuery.Overview(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Overview value = (ListDetailsQuery.Overview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12222a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$ProductAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$ProductAction;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductAction implements Adapter<ListDetailsQuery.ProductAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductAction f12242a = new ProductAction();
        public static final List b = CollectionsKt.R("productId", UrlHandler.ACTION, AnnotatedPrivateKey.LABEL);

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
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (str3 != null) {
                return new ListDetailsQuery.ProductAction(str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.ProductAction value = (ListDetailsQuery.ProductAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12223a);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Section;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<ListDetailsQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f12243a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ListDetailsQuery.OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeaderA;
            ListDetailsQuery.OnListDetailsPotentialSavings onListDetailsPotentialSavingsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ListDetailsQuery.OnListDetailsRewardsSummary onListDetailsRewardsSummaryA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ListDetailsTotalSectionHeader"))) {
                reader.o();
                onListDetailsTotalSectionHeaderA = OnListDetailsTotalSectionHeader.a(reader, customScalarAdapters);
            } else {
                onListDetailsTotalSectionHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ListDetailsPotentialSavings"))) {
                reader.o();
                onListDetailsPotentialSavingsA = OnListDetailsPotentialSavings.a(reader, customScalarAdapters);
            } else {
                onListDetailsPotentialSavingsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ListDetailsRewardsSummary"))) {
                reader.o();
                onListDetailsRewardsSummaryA = OnListDetailsRewardsSummary.a(reader, customScalarAdapters);
            }
            return new ListDetailsQuery.Section(str, onListDetailsTotalSectionHeaderA, onListDetailsPotentialSavingsA, onListDetailsRewardsSummaryA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Section value = (ListDetailsQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12224a);
            ListDetailsQuery.OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeader = value.b;
            if (onListDetailsTotalSectionHeader != null) {
                OnListDetailsTotalSectionHeader.b(writer, customScalarAdapters, onListDetailsTotalSectionHeader);
            }
            ListDetailsQuery.OnListDetailsPotentialSavings onListDetailsPotentialSavings = value.c;
            if (onListDetailsPotentialSavings != null) {
                OnListDetailsPotentialSavings.b(writer, customScalarAdapters, onListDetailsPotentialSavings);
            }
            ListDetailsQuery.OnListDetailsRewardsSummary onListDetailsRewardsSummary = value.d;
            if (onListDetailsRewardsSummary != null) {
                OnListDetailsRewardsSummary.b(writer, customScalarAdapters, onListDetailsRewardsSummary);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Summary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Summary;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Summary implements Adapter<ListDetailsQuery.Summary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Summary f12244a = new Summary();
        public static final List b = CollectionsKt.Q("sections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.f12243a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ListDetailsQuery.Summary(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Summary value = (ListDetailsQuery.Summary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f12243a, true)).toJson(writer, customScalarAdapters, value.f12225a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/adapter/ListDetailsQuery_ResponseAdapter$Total;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Total;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Total implements Adapter<ListDetailsQuery.Total> {

        /* renamed from: a, reason: collision with root package name */
        public static final Total f12245a = new Total();
        public static final List b = CollectionsKt.R(ErrorBundle.SUMMARY_ENTRY, "disclaimer", "overview");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ListDetailsQuery.Summary summary = null;
            ListDetailsQuery.Disclaimer disclaimer = null;
            ListDetailsQuery.Overview overview = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    summary = (ListDetailsQuery.Summary) Adapters.b(Adapters.c(Summary.f12244a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    disclaimer = (ListDetailsQuery.Disclaimer) Adapters.b(Adapters.c(Disclaimer.f12236a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new ListDetailsQuery.Total(summary, disclaimer, overview);
                    }
                    overview = (ListDetailsQuery.Overview) Adapters.b(Adapters.c(Overview.f12241a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ListDetailsQuery.Total value = (ListDetailsQuery.Total) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            Adapters.b(Adapters.c(Summary.f12244a, false)).toJson(writer, customScalarAdapters, value.f12226a);
            writer.F1("disclaimer");
            Adapters.b(Adapters.c(Disclaimer.f12236a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("overview");
            Adapters.b(Adapters.c(Overview.f12241a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
