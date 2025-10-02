package au.com.woolworths.shop.aem.components.recipes.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragmentImpl_ResponseAdapter;", "", "RecipeSummaryCardFragment", "RecipePrepDuration", "RecipeCookDuration", "RecipeCostPerServe", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecipeSummaryCardFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragmentImpl_ResponseAdapter$RecipeCookDuration;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipeCookDuration;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeCookDuration implements Adapter<RecipeSummaryCardFragment.RecipeCookDuration> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeCookDuration f10204a = new RecipeCookDuration();
        public static final List b = CollectionsKt.R("duration", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                Assertions.a(reader, "duration");
                throw null;
            }
            if (str2 != null) {
                return new RecipeSummaryCardFragment.RecipeCookDuration(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeSummaryCardFragment.RecipeCookDuration value = (RecipeSummaryCardFragment.RecipeCookDuration) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("duration");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10201a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragmentImpl_ResponseAdapter$RecipeCostPerServe;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipeCostPerServe;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeCostPerServe implements Adapter<RecipeSummaryCardFragment.RecipeCostPerServe> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeCostPerServe f10205a = new RecipeCostPerServe();
        public static final List b = CollectionsKt.Q("recipeCostPerServePrice");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            while (reader.o2(b) == 0) {
                d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
            }
            if (d != null) {
                return new RecipeSummaryCardFragment.RecipeCostPerServe(d.doubleValue());
            }
            Assertions.a(reader, "recipeCostPerServePrice");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeSummaryCardFragment.RecipeCostPerServe value = (RecipeSummaryCardFragment.RecipeCostPerServe) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recipeCostPerServePrice");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f10202a));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragmentImpl_ResponseAdapter$RecipePrepDuration;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipePrepDuration;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipePrepDuration implements Adapter<RecipeSummaryCardFragment.RecipePrepDuration> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipePrepDuration f10206a = new RecipePrepDuration();
        public static final List b = CollectionsKt.R("duration", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                Assertions.a(reader, "duration");
                throw null;
            }
            if (str2 != null) {
                return new RecipeSummaryCardFragment.RecipePrepDuration(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeSummaryCardFragment.RecipePrepDuration value = (RecipeSummaryCardFragment.RecipePrepDuration) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("duration");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10203a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragmentImpl_ResponseAdapter$RecipeSummaryCardFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeSummaryCardFragment implements Adapter<au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10207a = CollectionsKt.R("title", "image", "id", k.a.g, "sourceName", "isVideoAvailable", "recipePrepDuration", "recipeCookDuration", "recipeCostPerServe");

        public static au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            String str4 = null;
            Boolean bool = null;
            RecipeSummaryCardFragment.RecipePrepDuration recipePrepDuration = null;
            RecipeSummaryCardFragment.RecipeCookDuration recipeCookDuration = null;
            RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe = null;
            while (true) {
                switch (reader.o2(f10207a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        list = (List) Adapters.b(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        recipePrepDuration = (RecipeSummaryCardFragment.RecipePrepDuration) Adapters.b(Adapters.c(RecipePrepDuration.f10206a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        recipeCookDuration = (RecipeSummaryCardFragment.RecipeCookDuration) Adapters.b(Adapters.c(RecipeCookDuration.f10204a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        recipeCostPerServe = (RecipeSummaryCardFragment.RecipeCostPerServe) Adapters.b(Adapters.c(RecipeCostPerServe.f10205a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str4 != null) {
                            return new au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment(str, str2, str3, list, str4, bool, recipePrepDuration, recipeCookDuration, recipeCostPerServe);
                        }
                        Assertions.a(reader, "sourceName");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10200a);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(adapters$StringAdapter$1)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("sourceName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("isVideoAvailable");
            Adapters.l.toJson(writer, customScalarAdapters, value.f);
            writer.F1("recipePrepDuration");
            Adapters.b(Adapters.c(RecipePrepDuration.f10206a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("recipeCookDuration");
            Adapters.b(Adapters.c(RecipeCookDuration.f10204a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("recipeCostPerServe");
            Adapters.b(Adapters.c(RecipeCostPerServe.f10205a, false)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment) obj);
        }
    }
}
