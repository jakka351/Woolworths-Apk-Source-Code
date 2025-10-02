package au.com.woolworths.shop.legacy.graphql.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ListSectionHeaderTypes;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ListSectionHeaderTypes_ResponseAdapter;
import au.com.woolworths.shop.legacy.graphql.ProductsByRecipeQuery;
import au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter;", "", "Data", "ProductsByRecipe", "ProductsFeed", "OnIngredientCard", "SwapButton", "AlternativeProduct", "Analytics", "OnListSectionHeader", "OnProductCard", "OnDietaryDisclaimer", "InsetBanner", "Action", "DietaryInfo", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductsByRecipeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$Action;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductsByRecipeQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f12197a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductsByRecipeQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.Action value = (ProductsByRecipeQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f12165a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$AlternativeProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$AlternativeProduct;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AlternativeProduct implements Adapter<ProductsByRecipeQuery.AlternativeProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final AlternativeProduct f12198a = new AlternativeProduct();
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
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsByRecipeQuery.AlternativeProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.AlternativeProduct value = (ProductsByRecipeQuery.AlternativeProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12166a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$Analytics;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ProductsByRecipeQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f12199a = new Analytics();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductsByRecipeQuery.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.Analytics value = (ProductsByRecipeQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12167a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$Data;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductsByRecipeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12200a = new Data();
        public static final List b = CollectionsKt.Q("productsByRecipe");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsByRecipeQuery.ProductsByRecipe productsByRecipe = null;
            while (reader.o2(b) == 0) {
                productsByRecipe = (ProductsByRecipeQuery.ProductsByRecipe) Adapters.b(Adapters.c(ProductsByRecipe.f12207a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductsByRecipeQuery.Data(productsByRecipe);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.Data value = (ProductsByRecipeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productsByRecipe");
            Adapters.b(Adapters.c(ProductsByRecipe.f12207a, false)).toJson(writer, customScalarAdapters, value.f12168a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$DietaryInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$DietaryInfo;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DietaryInfo implements Adapter<ProductsByRecipeQuery.DietaryInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final DietaryInfo f12201a = new DietaryInfo();
        public static final List b = CollectionsKt.R("title", "content");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductsByRecipeQuery.DietaryInfo(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.DietaryInfo value = (ProductsByRecipeQuery.DietaryInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12169a);
            writer.F1("content");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$InsetBanner;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<ProductsByRecipeQuery.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f12202a = new InsetBanner();
        public static final List b = CollectionsKt.R("displayType", "message", "title", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            ProductsByRecipeQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    action = (ProductsByRecipeQuery.Action) Adapters.b(Adapters.c(Action.f12197a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductsByRecipeQuery.InsetBanner(insetBannerDisplayTypeA, str, str2, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.InsetBanner value = (ProductsByRecipeQuery.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f12170a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f12197a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$OnDietaryDisclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$OnDietaryDisclaimer;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDietaryDisclaimer implements Adapter<ProductsByRecipeQuery.OnDietaryDisclaimer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12203a = CollectionsKt.R("insetBanner", "dietaryInfo");

        public static ProductsByRecipeQuery.OnDietaryDisclaimer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductsByRecipeQuery.InsetBanner insetBanner = null;
            ProductsByRecipeQuery.DietaryInfo dietaryInfo = null;
            while (true) {
                int iO2 = reader.o2(f12203a);
                if (iO2 == 0) {
                    insetBanner = (ProductsByRecipeQuery.InsetBanner) Adapters.c(InsetBanner.f12202a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    dietaryInfo = (ProductsByRecipeQuery.DietaryInfo) Adapters.b(Adapters.c(DietaryInfo.f12201a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBanner != null) {
                return new ProductsByRecipeQuery.OnDietaryDisclaimer(insetBanner, dietaryInfo);
            }
            Assertions.a(reader, "insetBanner");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductsByRecipeQuery.OnDietaryDisclaimer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetBanner");
            Adapters.c(InsetBanner.f12202a, false).toJson(writer, customScalarAdapters, value.f12171a);
            writer.F1("dietaryInfo");
            Adapters.b(Adapters.c(DietaryInfo.f12201a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductsByRecipeQuery.OnDietaryDisclaimer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$OnIngredientCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$OnIngredientCard;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIngredientCard implements Adapter<ProductsByRecipeQuery.OnIngredientCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12204a = CollectionsKt.R("ingredientDetails", "swapButton", AlternativeProductsQuery.OPERATION_NAME, "analytics");

        public static ProductsByRecipeQuery.OnIngredientCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductsByRecipeQuery.SwapButton swapButton = null;
            ArrayList arrayListFromJson = null;
            ProductsByRecipeQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(f12204a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    swapButton = (ProductsByRecipeQuery.SwapButton) Adapters.b(Adapters.c(SwapButton.f12209a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(AlternativeProduct.f12198a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (ProductsByRecipeQuery.Analytics) Adapters.c(Analytics.f12199a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "ingredientDetails");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, AlternativeProductsQuery.OPERATION_NAME);
                throw null;
            }
            if (analytics != null) {
                return new ProductsByRecipeQuery.OnIngredientCard(str, swapButton, arrayListFromJson, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductsByRecipeQuery.OnIngredientCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ingredientDetails");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12172a);
            writer.F1("swapButton");
            Adapters.b(Adapters.c(SwapButton.f12209a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1(AlternativeProductsQuery.OPERATION_NAME);
            Adapters.a(Adapters.c(AlternativeProduct.f12198a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.c(Analytics.f12199a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductsByRecipeQuery.OnIngredientCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$OnListSectionHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$OnListSectionHeader;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnListSectionHeader implements Adapter<ProductsByRecipeQuery.OnListSectionHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12205a = CollectionsKt.R("listSectionHeaderType", "listSectionHeaderText");

        public static ProductsByRecipeQuery.OnListSectionHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ListSectionHeaderTypes listSectionHeaderTypesA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f12205a);
                if (iO2 == 0) {
                    listSectionHeaderTypesA = ListSectionHeaderTypes_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (listSectionHeaderTypesA == null) {
                Assertions.a(reader, "listSectionHeaderType");
                throw null;
            }
            if (str != null) {
                return new ProductsByRecipeQuery.OnListSectionHeader(listSectionHeaderTypesA, str);
            }
            Assertions.a(reader, "listSectionHeaderText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductsByRecipeQuery.OnListSectionHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("listSectionHeaderType");
            ListSectionHeaderTypes_ResponseAdapter.b(writer, customScalarAdapters, value.f12173a);
            writer.F1("listSectionHeaderText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductsByRecipeQuery.OnListSectionHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$OnProductCard;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductsByRecipeQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12206a = CollectionsKt.Q("__typename");

        public static ProductsByRecipeQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12206a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductsByRecipeQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductsByRecipeQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12174a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductsByRecipeQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$ProductsByRecipe;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$ProductsByRecipe;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsByRecipe implements Adapter<ProductsByRecipeQuery.ProductsByRecipe> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsByRecipe f12207a = new ProductsByRecipe();
        public static final List b = CollectionsKt.R("totalNumberOfProducts", "nextPage", "productsFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ProductsFeed.f12208a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductsByRecipeQuery.ProductsByRecipe(num, num2, arrayListFromJson);
            }
            Assertions.a(reader, "productsFeed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.ProductsByRecipe value = (ProductsByRecipeQuery.ProductsByRecipe) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12175a);
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productsFeed");
            Adapters.a(Adapters.c(ProductsFeed.f12208a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$ProductsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$ProductsFeed;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsFeed implements Adapter<ProductsByRecipeQuery.ProductsFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsFeed f12208a = new ProductsFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductsByRecipeQuery.OnIngredientCard onIngredientCardA;
            ProductsByRecipeQuery.OnListSectionHeader onListSectionHeaderA;
            ProductsByRecipeQuery.OnProductCard onProductCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductsByRecipeQuery.OnDietaryDisclaimer onDietaryDisclaimerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IngredientCard"))) {
                reader.o();
                onIngredientCardA = OnIngredientCard.a(reader, customScalarAdapters);
            } else {
                onIngredientCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ListSectionHeader"))) {
                reader.o();
                onListSectionHeaderA = OnListSectionHeader.a(reader, customScalarAdapters);
            } else {
                onListSectionHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("DietaryDisclaimer"), BooleanExpressions.d("showNutritionInfo")))) {
                reader.o();
                onDietaryDisclaimerA = OnDietaryDisclaimer.a(reader, customScalarAdapters);
            }
            return new ProductsByRecipeQuery.ProductsFeed(str, onIngredientCardA, onListSectionHeaderA, onProductCardA, onDietaryDisclaimerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.ProductsFeed value = (ProductsByRecipeQuery.ProductsFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12176a);
            ProductsByRecipeQuery.OnIngredientCard onIngredientCard = value.b;
            if (onIngredientCard != null) {
                OnIngredientCard.b(writer, customScalarAdapters, onIngredientCard);
            }
            ProductsByRecipeQuery.OnListSectionHeader onListSectionHeader = value.c;
            if (onListSectionHeader != null) {
                OnListSectionHeader.b(writer, customScalarAdapters, onListSectionHeader);
            }
            ProductsByRecipeQuery.OnProductCard onProductCard = value.d;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            ProductsByRecipeQuery.OnDietaryDisclaimer onDietaryDisclaimer = value.e;
            if (onDietaryDisclaimer != null) {
                OnDietaryDisclaimer.b(writer, customScalarAdapters, onDietaryDisclaimer);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/legacy/graphql/adapter/ProductsByRecipeQuery_ResponseAdapter$SwapButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/legacy/graphql/ProductsByRecipeQuery$SwapButton;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SwapButton implements Adapter<ProductsByRecipeQuery.SwapButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SwapButton f12209a = new SwapButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url", "iconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            ButtonStyle buttonStyle = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new ProductsByRecipeQuery.SwapButton(buttonStyle, str, str2, str3, str4, bool3.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductsByRecipeQuery.SwapButton value = (ProductsByRecipeQuery.SwapButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12177a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }
}
