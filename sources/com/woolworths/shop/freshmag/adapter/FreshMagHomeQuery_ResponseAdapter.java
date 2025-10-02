package com.woolworths.shop.freshmag.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.shop.freshmag.FreshMagHomeQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter;", "", "Data", "FreshMagHome", "Item", "OnFreshMagSummary", "OnHorizontalList", "Item1", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FreshMagHomeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$ActionMetadatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$ActionMetadatum;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionMetadatum implements Adapter<FreshMagHomeQuery.ActionMetadatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionMetadatum f22724a = new ActionMetadatum();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FreshMagHomeQuery.OnRecipeTagList onRecipeTagListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FreshMagHomeQuery.OnRecipeSource onRecipeSourceA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeTagList"))) {
                reader.o();
                onRecipeTagListA = OnRecipeTagList.a(reader, customScalarAdapters);
            } else {
                onRecipeTagListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSource"))) {
                reader.o();
                onRecipeSourceA = OnRecipeSource.a(reader, customScalarAdapters);
            }
            return new FreshMagHomeQuery.ActionMetadatum(str, onRecipeTagListA, onRecipeSourceA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FreshMagHomeQuery.ActionMetadatum value = (FreshMagHomeQuery.ActionMetadatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22713a);
            FreshMagHomeQuery.OnRecipeTagList onRecipeTagList = value.b;
            if (onRecipeTagList != null) {
                OnRecipeTagList.b(writer, customScalarAdapters, onRecipeTagList);
            }
            FreshMagHomeQuery.OnRecipeSource onRecipeSource = value.c;
            if (onRecipeSource != null) {
                OnRecipeSource.b(writer, customScalarAdapters, onRecipeSource);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Data;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<FreshMagHomeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22725a = new Data();
        public static final List b = CollectionsKt.Q("freshMagHome");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FreshMagHomeQuery.FreshMagHome freshMagHome = null;
            while (reader.o2(b) == 0) {
                freshMagHome = (FreshMagHomeQuery.FreshMagHome) Adapters.b(Adapters.c(FreshMagHome.f22726a, false)).fromJson(reader, customScalarAdapters);
            }
            return new FreshMagHomeQuery.Data(freshMagHome);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FreshMagHomeQuery.Data value = (FreshMagHomeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("freshMagHome");
            Adapters.b(Adapters.c(FreshMagHome.f22726a, false)).toJson(writer, customScalarAdapters, value.f22714a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$FreshMagHome;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$FreshMagHome;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FreshMagHome implements Adapter<FreshMagHomeQuery.FreshMagHome> {

        /* renamed from: a, reason: collision with root package name */
        public static final FreshMagHome f22726a = new FreshMagHome();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f22727a, true))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new FreshMagHomeQuery.FreshMagHome(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FreshMagHomeQuery.FreshMagHome value = (FreshMagHomeQuery.FreshMagHome) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f22727a, true))).toJson(writer, customScalarAdapters, value.f22715a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Item;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<FreshMagHomeQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f22727a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FreshMagHomeQuery.OnFreshMagSummary onFreshMagSummaryA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FreshMagHomeQuery.OnHorizontalList onHorizontalListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FreshMagSummary"))) {
                reader.o();
                onFreshMagSummaryA = OnFreshMagSummary.a(reader, customScalarAdapters);
            } else {
                onFreshMagSummaryA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            }
            return new FreshMagHomeQuery.Item(str, onFreshMagSummaryA, onHorizontalListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FreshMagHomeQuery.Item value = (FreshMagHomeQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22716a);
            FreshMagHomeQuery.OnFreshMagSummary onFreshMagSummary = value.b;
            if (onFreshMagSummary != null) {
                OnFreshMagSummary.b(writer, customScalarAdapters, onFreshMagSummary);
            }
            FreshMagHomeQuery.OnHorizontalList onHorizontalList = value.c;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Item1;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<FreshMagHomeQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f22728a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            FreshMagHomeQuery.OnRecipeSummaryCard onRecipeSummaryCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            FreshMagHomeQuery.OnRecipeMoreCard onRecipeMoreCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCardA = OnRecipeSummaryCard.a(reader, customScalarAdapters);
            } else {
                onRecipeSummaryCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeMoreCard"))) {
                reader.o();
                onRecipeMoreCardA = OnRecipeMoreCard.a(reader, customScalarAdapters);
            }
            return new FreshMagHomeQuery.Item1(str, onRecipeSummaryCardA, onRecipeMoreCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FreshMagHomeQuery.Item1 value = (FreshMagHomeQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22717a);
            FreshMagHomeQuery.OnRecipeSummaryCard onRecipeSummaryCard = value.b;
            if (onRecipeSummaryCard != null) {
                OnRecipeSummaryCard.b(writer, customScalarAdapters, onRecipeSummaryCard);
            }
            FreshMagHomeQuery.OnRecipeMoreCard onRecipeMoreCard = value.c;
            if (onRecipeMoreCard != null) {
                OnRecipeMoreCard.b(writer, customScalarAdapters, onRecipeMoreCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnFreshMagSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnFreshMagSummary;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFreshMagSummary implements Adapter<FreshMagHomeQuery.OnFreshMagSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22729a = CollectionsKt.R("coverImageUrl", lqlqqlq.mmm006Dm006Dm, "magazineId", "buttonTitle");

        public static FreshMagHomeQuery.OnFreshMagSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f22729a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "coverImageUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new FreshMagHomeQuery.OnFreshMagSummary(str, str2, str3, str4);
            }
            Assertions.a(reader, "magazineId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnFreshMagSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coverImageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22718a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("magazineId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("buttonTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnFreshMagSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnHorizontalList;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<FreshMagHomeQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22730a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "items", "actionTitle", "deepLink");

        public static FreshMagHomeQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f22730a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f22728a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new FreshMagHomeQuery.OnHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22719a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f22728a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnRecipeMoreCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeMoreCard;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeMoreCard implements Adapter<FreshMagHomeQuery.OnRecipeMoreCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22731a = CollectionsKt.Q("actionMetadata");

        public static FreshMagHomeQuery.OnRecipeMoreCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f22731a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ActionMetadatum.f22724a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new FreshMagHomeQuery.OnRecipeMoreCard(arrayListFromJson);
            }
            Assertions.a(reader, "actionMetadata");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnRecipeMoreCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionMetadata");
            Adapters.a(Adapters.c(ActionMetadatum.f22724a, true)).toJson(writer, customScalarAdapters, value.f22720a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnRecipeMoreCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnRecipeSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeSource;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSource implements Adapter<FreshMagHomeQuery.OnRecipeSource> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22732a = CollectionsKt.Q("source");

        public static FreshMagHomeQuery.OnRecipeSource a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22732a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new FreshMagHomeQuery.OnRecipeSource(str);
            }
            Assertions.a(reader, "source");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnRecipeSource value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22721a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnRecipeSource) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeSummaryCard;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<FreshMagHomeQuery.OnRecipeSummaryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22733a = CollectionsKt.Q("__typename");

        public static FreshMagHomeQuery.OnRecipeSummaryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f22733a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new FreshMagHomeQuery.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22722a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnRecipeSummaryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/freshmag/adapter/FreshMagHomeQuery_ResponseAdapter$OnRecipeTagList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeTagList;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeTagList implements Adapter<FreshMagHomeQuery.OnRecipeTagList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22734a = CollectionsKt.Q(k.a.g);

        public static FreshMagHomeQuery.OnRecipeTagList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f22734a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new FreshMagHomeQuery.OnRecipeTagList(arrayListFromJson);
            }
            Assertions.a(reader, k.a.g);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FreshMagHomeQuery.OnRecipeTagList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(k.a.g);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.f22723a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (FreshMagHomeQuery.OnRecipeTagList) obj);
        }
    }
}
