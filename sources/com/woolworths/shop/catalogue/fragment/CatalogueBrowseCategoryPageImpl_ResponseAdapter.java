package com.woolworths.shop.catalogue.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage;
import com.woolworths.shop.catalogue.fragment.CatalogueButtonImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter;", "", "CatalogueBrowseCategoryPage", "Item", "OnCatalogueBrowseCategoryPageHeader", "OnProductCard", "OnCatalogueBrowseCategoryPageButton", "Button", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueBrowseCategoryPageImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$Button;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<CatalogueBrowseCategoryPage.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f21755a = new Button();
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
                return new CatalogueBrowseCategoryPage.Button(str, catalogueButtonA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueBrowseCategoryPage.Button value = (CatalogueBrowseCategoryPage.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21750a);
            List list = CatalogueButtonImpl_ResponseAdapter.CatalogueButton.f21774a;
            CatalogueButtonImpl_ResponseAdapter.CatalogueButton.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$CatalogueBrowseCategoryPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueBrowseCategoryPage implements Adapter<com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21756a = CollectionsKt.R("id", "pageNumber", "backgroundUrl", "backgroundColor", "items");

        public static com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f21756a);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = num2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = num2;
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f21757a, true)).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (num3 == null) {
                Assertions.a(reader, "pageNumber");
                throw null;
            }
            int iIntValue = num3.intValue();
            if (str2 == null) {
                Assertions.a(reader, "backgroundUrl");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage(str, iIntValue, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21749a);
            writer.F1("pageNumber");
            d.y(value.b, Adapters.b, writer, customScalarAdapters, "backgroundUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("backgroundColor");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21757a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.catalogue.fragment.CatalogueBrowseCategoryPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$Item;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CatalogueBrowseCategoryPage.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21757a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader onCatalogueBrowseCategoryPageHeaderA;
            CatalogueBrowseCategoryPage.OnProductCard onProductCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton onCatalogueBrowseCategoryPageButtonA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueBrowseCategoryPageHeader"))) {
                reader.o();
                onCatalogueBrowseCategoryPageHeaderA = OnCatalogueBrowseCategoryPageHeader.a(reader, customScalarAdapters);
            } else {
                onCatalogueBrowseCategoryPageHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CatalogueBrowseCategoryPageButton"))) {
                reader.o();
                onCatalogueBrowseCategoryPageButtonA = OnCatalogueBrowseCategoryPageButton.a(reader, customScalarAdapters);
            }
            return new CatalogueBrowseCategoryPage.Item(str, onCatalogueBrowseCategoryPageHeaderA, onProductCardA, onCatalogueBrowseCategoryPageButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CatalogueBrowseCategoryPage.Item value = (CatalogueBrowseCategoryPage.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21751a);
            CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader onCatalogueBrowseCategoryPageHeader = value.b;
            if (onCatalogueBrowseCategoryPageHeader != null) {
                OnCatalogueBrowseCategoryPageHeader.b(writer, customScalarAdapters, onCatalogueBrowseCategoryPageHeader);
            }
            CatalogueBrowseCategoryPage.OnProductCard onProductCard = value.c;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton onCatalogueBrowseCategoryPageButton = value.d;
            if (onCatalogueBrowseCategoryPageButton != null) {
                OnCatalogueBrowseCategoryPageButton.b(writer, customScalarAdapters, onCatalogueBrowseCategoryPageButton);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$OnCatalogueBrowseCategoryPageButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnCatalogueBrowseCategoryPageButton;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueBrowseCategoryPageButton implements Adapter<CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21758a = CollectionsKt.Q("button");

        public static CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CatalogueBrowseCategoryPage.Button button = null;
            while (reader.o2(f21758a) == 0) {
                button = (CatalogueBrowseCategoryPage.Button) Adapters.c(Button.f21755a, true).fromJson(reader, customScalarAdapters);
            }
            if (button != null) {
                return new CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton(button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f21755a, true).toJson(writer, customScalarAdapters, value.f21752a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$OnCatalogueBrowseCategoryPageHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnCatalogueBrowseCategoryPageHeader;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueBrowseCategoryPageHeader implements Adapter<CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21759a = CollectionsKt.R("title", "iconUrl");

        public static CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f21759a);
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
                return new CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader(str, str2);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21753a);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueBrowseCategoryPage.OnCatalogueBrowseCategoryPageHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPageImpl_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnProductCard;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<CatalogueBrowseCategoryPage.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21760a = CollectionsKt.Q("__typename");

        public static CatalogueBrowseCategoryPage.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21760a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new CatalogueBrowseCategoryPage.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CatalogueBrowseCategoryPage.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21754a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CatalogueBrowseCategoryPage.OnProductCard) obj);
        }
    }
}
