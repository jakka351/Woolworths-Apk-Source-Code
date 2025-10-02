package com.woolworths.shop.catalogue.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.CatalogueHomeCardTrackingValidity;
import au.com.woolworths.shop.graphql.type.adapter.CatalogueHomeCardTrackingValidity_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.catalogue.CatalogueHomeQuery;
import com.woolworths.shop.catalogue.fragment.CatalogueButton;
import com.woolworths.shop.catalogue.fragment.CatalogueButtonImpl_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueHomeCard;
import com.woolworths.shop.catalogue.fragment.CatalogueHomeCardImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter;", "", "Data", "CatalogueHome", "Item", "OnCatalogueHomeChangeStore", "Button", "OnCatalogueHomeCatalogueCard", "SneakPeek", "Tracking", "OnCatalogueHomeSpecialsCard", "OnCatalogueHomeTermsAndConditions", "Button1", "Term", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueHomeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Button;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<CatalogueHomeQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f21704a = new Button();
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
            CatalogueButton catalogueButtonA = CatalogueButtonImpl_ResponseAdapter.CatalogueButton.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueHomeQuery.Button(str, catalogueButtonA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Button value = (CatalogueHomeQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21652a);
            List list = CatalogueButtonImpl_ResponseAdapter.CatalogueButton.f21774a;
            CatalogueButtonImpl_ResponseAdapter.CatalogueButton.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Button1;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<CatalogueHomeQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f21705a = new Button1();
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
            CatalogueButton catalogueButtonA = CatalogueButtonImpl_ResponseAdapter.CatalogueButton.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueHomeQuery.Button1(str, catalogueButtonA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Button1 value = (CatalogueHomeQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21653a);
            List list = CatalogueButtonImpl_ResponseAdapter.CatalogueButton.f21774a;
            CatalogueButtonImpl_ResponseAdapter.CatalogueButton.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$CatalogueHome;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$CatalogueHome;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueHome implements Adapter<CatalogueHomeQuery.CatalogueHome> {

        /* renamed from: a, reason: collision with root package name */
        public static final CatalogueHome f21706a = new CatalogueHome();
        public static final List b = CollectionsKt.Q("items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f21708a, true))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new CatalogueHomeQuery.CatalogueHome(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.CatalogueHome value = (CatalogueHomeQuery.CatalogueHome) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f21708a, true))).toJson(writer, customScalarAdapters, value.f21654a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CatalogueHomeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21707a = new Data();
        public static final List b = CollectionsKt.Q("catalogueHome");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CatalogueHomeQuery.CatalogueHome catalogueHome = null;
            while (reader.o2(b) == 0) {
                catalogueHome = (CatalogueHomeQuery.CatalogueHome) Adapters.b(Adapters.c(CatalogueHome.f21706a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CatalogueHomeQuery.Data(catalogueHome);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Data value = (CatalogueHomeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("catalogueHome");
            Adapters.b(Adapters.c(CatalogueHome.f21706a, false)).toJson(writer, customScalarAdapters, value.f21655a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Item;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CatalogueHomeQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21708a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CatalogueHomeQuery.OnCatalogueHomeChangeStore onCatalogueHomeChangeStoreA;
            CatalogueHomeQuery.OnCatalogueHomeCatalogueCard onCatalogueHomeCatalogueCardA;
            CatalogueHomeQuery.OnCatalogueHomeSpecialsCard onCatalogueHomeSpecialsCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions onCatalogueHomeTermsAndConditionsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueHomeChangeStore"))) {
                reader.o();
                onCatalogueHomeChangeStoreA = OnCatalogueHomeChangeStore.a(reader, customScalarAdapters);
            } else {
                onCatalogueHomeChangeStoreA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueHomeCatalogueCard"))) {
                reader.o();
                onCatalogueHomeCatalogueCardA = OnCatalogueHomeCatalogueCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueHomeCatalogueCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueHomeSpecialsCard"))) {
                reader.o();
                onCatalogueHomeSpecialsCardA = OnCatalogueHomeSpecialsCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueHomeSpecialsCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueHomeTermsAndConditions"))) {
                reader.o();
                onCatalogueHomeTermsAndConditionsA = OnCatalogueHomeTermsAndConditions.a(reader, customScalarAdapters);
            }
            return new CatalogueHomeQuery.Item(str, onCatalogueHomeChangeStoreA, onCatalogueHomeCatalogueCardA, onCatalogueHomeSpecialsCardA, onCatalogueHomeTermsAndConditionsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Item value = (CatalogueHomeQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21656a);
            CatalogueHomeQuery.OnCatalogueHomeChangeStore onCatalogueHomeChangeStore = value.b;
            if (onCatalogueHomeChangeStore != null) {
                OnCatalogueHomeChangeStore.b(writer, customScalarAdapters, onCatalogueHomeChangeStore);
            }
            CatalogueHomeQuery.OnCatalogueHomeCatalogueCard onCatalogueHomeCatalogueCard = value.c;
            if (onCatalogueHomeCatalogueCard != null) {
                OnCatalogueHomeCatalogueCard.b(writer, customScalarAdapters, onCatalogueHomeCatalogueCard);
            }
            CatalogueHomeQuery.OnCatalogueHomeSpecialsCard onCatalogueHomeSpecialsCard = value.d;
            if (onCatalogueHomeSpecialsCard != null) {
                OnCatalogueHomeSpecialsCard.b(writer, customScalarAdapters, onCatalogueHomeSpecialsCard);
            }
            CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions onCatalogueHomeTermsAndConditions = value.e;
            if (onCatalogueHomeTermsAndConditions != null) {
                OnCatalogueHomeTermsAndConditions.b(writer, customScalarAdapters, onCatalogueHomeTermsAndConditions);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$OnCatalogueHomeCatalogueCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeCatalogueCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueHomeCatalogueCard implements Adapter<CatalogueHomeQuery.OnCatalogueHomeCatalogueCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21709a = CollectionsKt.R("__typename", "dateDisplay", "pagePath", "sneakPeek", "tracking");

        public static CatalogueHomeQuery.OnCatalogueHomeCatalogueCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            CatalogueHomeQuery.SneakPeek sneakPeek = null;
            CatalogueHomeQuery.Tracking tracking = null;
            while (true) {
                int iO2 = reader.o2(f21709a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    sneakPeek = (CatalogueHomeQuery.SneakPeek) Adapters.b(Adapters.c(SneakPeek.f21713a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    tracking = (CatalogueHomeQuery.Tracking) Adapters.c(Tracking.f21715a, false).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            CatalogueHomeCard catalogueHomeCardA = CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "dateDisplay");
                throw null;
            }
            if (tracking != null) {
                return new CatalogueHomeQuery.OnCatalogueHomeCatalogueCard(str, str2, str3, sneakPeek, tracking, catalogueHomeCardA);
            }
            Assertions.a(reader, "tracking");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueHomeQuery.OnCatalogueHomeCatalogueCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21657a);
            writer.F1("dateDisplay");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("pagePath");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("sneakPeek");
            Adapters.b(Adapters.c(SneakPeek.f21713a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("tracking");
            Adapters.c(Tracking.f21715a, false).toJson(writer, customScalarAdapters, value.e);
            List list = CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.f21776a;
            CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.b(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueHomeQuery.OnCatalogueHomeCatalogueCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$OnCatalogueHomeChangeStore;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeChangeStore;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueHomeChangeStore implements Adapter<CatalogueHomeQuery.OnCatalogueHomeChangeStore> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21710a = CollectionsKt.R("storeName", "postCode", "button");

        public static CatalogueHomeQuery.OnCatalogueHomeChangeStore a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CatalogueHomeQuery.Button button = null;
            while (true) {
                int iO2 = reader.o2(f21710a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    button = (CatalogueHomeQuery.Button) Adapters.c(Button.f21704a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "storeName");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "postCode");
                throw null;
            }
            if (button != null) {
                return new CatalogueHomeQuery.OnCatalogueHomeChangeStore(str, str2, button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueHomeQuery.OnCatalogueHomeChangeStore value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21658a);
            writer.F1("postCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button.f21704a, true).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueHomeQuery.OnCatalogueHomeChangeStore) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$OnCatalogueHomeSpecialsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeSpecialsCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueHomeSpecialsCard implements Adapter<CatalogueHomeQuery.OnCatalogueHomeSpecialsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21711a = CollectionsKt.Q("__typename");

        public static CatalogueHomeQuery.OnCatalogueHomeSpecialsCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21711a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CatalogueHomeCard catalogueHomeCardA = CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueHomeQuery.OnCatalogueHomeSpecialsCard(str, catalogueHomeCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueHomeQuery.OnCatalogueHomeSpecialsCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21659a);
            List list = CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.f21776a;
            CatalogueHomeCardImpl_ResponseAdapter.CatalogueHomeCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueHomeQuery.OnCatalogueHomeSpecialsCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$OnCatalogueHomeTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeTermsAndConditions;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueHomeTermsAndConditions implements Adapter<CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21712a = CollectionsKt.R("button", "terms");

        public static CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CatalogueHomeQuery.Button1 button1 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21712a);
                if (iO2 == 0) {
                    button1 = (CatalogueHomeQuery.Button1) Adapters.c(Button1.f21705a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Term.f21714a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (button1 == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions(button1, arrayListFromJson);
            }
            Assertions.a(reader, "terms");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button1.f21705a, true).toJson(writer, customScalarAdapters, value.f21660a);
            writer.F1("terms");
            Adapters.a(Adapters.c(Term.f21714a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueHomeQuery.OnCatalogueHomeTermsAndConditions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$SneakPeek;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$SneakPeek;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SneakPeek implements Adapter<CatalogueHomeQuery.SneakPeek> {

        /* renamed from: a, reason: collision with root package name */
        public static final SneakPeek f21713a = new SneakPeek();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "dateDisplay");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 != null) {
                return new CatalogueHomeQuery.SneakPeek(str, str2, str3);
            }
            Assertions.a(reader, "dateDisplay");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.SneakPeek value = (CatalogueHomeQuery.SneakPeek) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21661a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("dateDisplay");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Term;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Term;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Term implements Adapter<CatalogueHomeQuery.Term> {

        /* renamed from: a, reason: collision with root package name */
        public static final Term f21714a = new Term();
        public static final List b = CollectionsKt.R("title", "body");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new CatalogueHomeQuery.Term(str, str2);
            }
            Assertions.a(reader, "body");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Term value = (CatalogueHomeQuery.Term) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21662a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/adapter/CatalogueHomeQuery_ResponseAdapter$Tracking;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Tracking;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tracking implements Adapter<CatalogueHomeQuery.Tracking> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tracking f21715a = new Tracking();
        public static final List b = CollectionsKt.R("id", "postCode", "endDate", "publishDate", "startDate", "state", "type", "validity");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            CatalogueHomeCardTrackingValidity catalogueHomeCardTrackingValidityA = null;
            while (true) {
                switch (reader.o2(b)) {
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
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        catalogueHomeCardTrackingValidityA = CatalogueHomeCardTrackingValidity_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "postCode");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "endDate");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "publishDate");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "startDate");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "state");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "type");
                            throw null;
                        }
                        if (catalogueHomeCardTrackingValidityA != null) {
                            return new CatalogueHomeQuery.Tracking(str, str2, str3, str4, str5, str6, str7, catalogueHomeCardTrackingValidityA);
                        }
                        Assertions.a(reader, "validity");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueHomeQuery.Tracking value = (CatalogueHomeQuery.Tracking) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21663a);
            writer.F1("postCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("endDate");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("publishDate");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("startDate");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("state");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("type");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("validity");
            writer.v0(value.h.d);
        }
    }
}
