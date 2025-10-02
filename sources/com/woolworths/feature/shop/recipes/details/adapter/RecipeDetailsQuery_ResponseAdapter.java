package com.woolworths.feature.shop.recipes.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.FeatureType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FeatureType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.recipes.details.RecipeDetailsQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\bÇ\u0002\u0018\u00002\u00020\u0001:%\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter;", "", "Data", "RecipeDetails", "RecipeCostPerServe", "RecipeCostPerServeBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "BroadcastBannerAction", "Method", "Description", "Item", "Byline", "ImpressionAnalytics", "Analytics", "Feature", "OnRecipeSummaryFeature", "OnRecipeSummaryDifficulty", "LatestRecipes", "Item1", "OnRecipeSummaryCard", "ActionMetadatum", "OnRecipeTagList", "NutritionTile", "Feature1", "UserInteraction", "IngredientsSection", "ServesInfo", "UniversalInventory", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "ShopIngredientButton", "Button", "Video", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$ActionMetadatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ActionMetadatum;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionMetadatum implements Adapter<RecipeDetailsQuery.ActionMetadatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionMetadatum f20275a = new ActionMetadatum();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.OnRecipeTagList onRecipeTagListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("RecipeTagList"))) {
                reader.o();
                onRecipeTagListA = OnRecipeTagList.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.ActionMetadatum(str, onRecipeTagListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.ActionMetadatum value = (RecipeDetailsQuery.ActionMetadatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20232a);
            RecipeDetailsQuery.OnRecipeTagList onRecipeTagList = value.b;
            if (onRecipeTagList != null) {
                OnRecipeTagList.b(writer, customScalarAdapters, onRecipeTagList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Analytics;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<RecipeDetailsQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20276a = new Analytics();
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
                return new RecipeDetailsQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Analytics value = (RecipeDetailsQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20233a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$BroadcastBannerAction;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<RecipeDetailsQuery.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f20277a = new BroadcastBannerAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new RecipeDetailsQuery.BroadcastBannerAction(str, actionTypeA, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.BroadcastBannerAction value = (RecipeDetailsQuery.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20234a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$BroadcastBannerUI;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<RecipeDetailsQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f20278a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            RecipeDetailsQuery.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreBroadcastBannerStyleA = CoreBroadcastBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    icon = (RecipeDetailsQuery.Icon) Adapters.c(Icon.f20286a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (coreBroadcastBannerStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (icon != null) {
                return new RecipeDetailsQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.BroadcastBannerUI value = (RecipeDetailsQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20235a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f20286a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Button;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<RecipeDetailsQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f20279a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            String str2 = null;
            String str3 = null;
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
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new RecipeDetailsQuery.Button(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Button value = (RecipeDetailsQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20236a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Byline;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Byline;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Byline implements Adapter<RecipeDetailsQuery.Byline> {

        /* renamed from: a, reason: collision with root package name */
        public static final Byline f20280a = new Byline();
        public static final List b = CollectionsKt.R("title", "image");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RecipeDetailsQuery.Byline(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Byline value = (RecipeDetailsQuery.Byline) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20237a);
            writer.F1("image");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RecipeDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20281a = new Data();
        public static final List b = CollectionsKt.Q("recipeDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.RecipeDetails recipeDetails = null;
            while (reader.o2(b) == 0) {
                recipeDetails = (RecipeDetailsQuery.RecipeDetails) Adapters.b(Adapters.c(RecipeDetails.f20306a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.Data(recipeDetails);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Data value = (RecipeDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recipeDetails");
            Adapters.b(Adapters.c(RecipeDetails.f20306a, false)).toJson(writer, customScalarAdapters, value.f20238a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Description;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Description;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Description implements Adapter<RecipeDetailsQuery.Description> {

        /* renamed from: a, reason: collision with root package name */
        public static final Description f20282a = new Description();
        public static final List b = CollectionsKt.R("__typename", "title", "content");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new RecipeDetailsQuery.Description(str, str2, str3);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Description value = (RecipeDetailsQuery.Description) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20239a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Feature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Feature;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feature implements Adapter<RecipeDetailsQuery.Feature> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feature f20283a = new Feature();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RecipeDetailsQuery.OnRecipeSummaryFeature onRecipeSummaryFeatureA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RecipeDetailsQuery.OnRecipeSummaryDifficulty onRecipeSummaryDifficultyA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryFeature"))) {
                reader.o();
                onRecipeSummaryFeatureA = OnRecipeSummaryFeature.a(reader, customScalarAdapters);
            } else {
                onRecipeSummaryFeatureA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryDifficulty"))) {
                reader.o();
                onRecipeSummaryDifficultyA = OnRecipeSummaryDifficulty.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.Feature(str, onRecipeSummaryFeatureA, onRecipeSummaryDifficultyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Feature value = (RecipeDetailsQuery.Feature) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20240a);
            RecipeDetailsQuery.OnRecipeSummaryFeature onRecipeSummaryFeature = value.b;
            if (onRecipeSummaryFeature != null) {
                OnRecipeSummaryFeature.b(writer, customScalarAdapters, onRecipeSummaryFeature);
            }
            RecipeDetailsQuery.OnRecipeSummaryDifficulty onRecipeSummaryDifficulty = value.c;
            if (onRecipeSummaryDifficulty != null) {
                OnRecipeSummaryDifficulty.b(writer, customScalarAdapters, onRecipeSummaryDifficulty);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Feature1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Feature1;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feature1 implements Adapter<RecipeDetailsQuery.Feature1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feature1 f20284a = new Feature1();
        public static final List b = CollectionsKt.R("title", "value");

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
                return new RecipeDetailsQuery.Feature1(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Feature1 value = (RecipeDetailsQuery.Feature1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20241a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$GoogleAdBannerCard;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<RecipeDetailsQuery.GoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final GoogleAdBannerCard f20285a = new GoogleAdBannerCard();
        public static final List b = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            AdBannerNativeSize adBannerNativeSizeA = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str5 = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new RecipeDetailsQuery.GoogleAdBannerCard(str, str2, str3, zBooleanValue, str4, adBannerNativeSizeA, googleAdCustomTargeting, str5, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.GoogleAdBannerCard value = (RecipeDetailsQuery.GoogleAdBannerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20242a);
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iabSpec");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.f);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Icon;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<RecipeDetailsQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f20286a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.Icon(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Icon value = (RecipeDetailsQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20243a);
            RecipeDetailsQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ImpressionAnalytics;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<RecipeDetailsQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f20287a = new ImpressionAnalytics();
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
                return new RecipeDetailsQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.ImpressionAnalytics value = (RecipeDetailsQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20244a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$IngredientsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$IngredientsSection;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IngredientsSection implements Adapter<RecipeDetailsQuery.IngredientsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final IngredientsSection f20288a = new IngredientsSection();
        public static final List b = CollectionsKt.R("servesInfo", "ingredients");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.ServesInfo servesInfo = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    servesInfo = (RecipeDetailsQuery.ServesInfo) Adapters.b(Adapters.c(ServesInfo.f20307a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new RecipeDetailsQuery.IngredientsSection(servesInfo, arrayListFromJson);
            }
            Assertions.a(reader, "ingredients");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.IngredientsSection value = (RecipeDetailsQuery.IngredientsSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("servesInfo");
            Adapters.b(Adapters.c(ServesInfo.f20307a, false)).toJson(writer, customScalarAdapters, value.f20245a);
            writer.F1("ingredients");
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Item;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<RecipeDetailsQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20289a = new Item();
        public static final List b = CollectionsKt.R("__typename", "title", "content", "methodImage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new RecipeDetailsQuery.Item(str, str2, str3, str4);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Item value = (RecipeDetailsQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20246a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("methodImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Item1;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<RecipeDetailsQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f20290a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.OnRecipeSummaryCard onRecipeSummaryCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCardA = OnRecipeSummaryCard.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.Item1(str, onRecipeSummaryCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Item1 value = (RecipeDetailsQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20247a);
            RecipeDetailsQuery.OnRecipeSummaryCard onRecipeSummaryCard = value.b;
            if (onRecipeSummaryCard != null) {
                OnRecipeSummaryCard.b(writer, customScalarAdapters, onRecipeSummaryCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$LatestRecipes;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$LatestRecipes;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LatestRecipes implements Adapter<RecipeDetailsQuery.LatestRecipes> {

        /* renamed from: a, reason: collision with root package name */
        public static final LatestRecipes f20291a = new LatestRecipes();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "items", "actionTitle", "actionMetadata");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            String str3 = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f20290a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(ActionMetadatum.f20275a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "items");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new RecipeDetailsQuery.LatestRecipes(str, str2, arrayListFromJson, str3, arrayListFromJson2);
            }
            Assertions.a(reader, "actionMetadata");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.LatestRecipes value = (RecipeDetailsQuery.LatestRecipes) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20248a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f20290a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("actionMetadata");
            Adapters.a(Adapters.c(ActionMetadatum.f20275a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Method;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Method;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Method implements Adapter<RecipeDetailsQuery.Method> {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f20292a = new Method();
        public static final List b = CollectionsKt.R("__typename", lqlqqlq.mmm006Dm006Dm, "items", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RecipeDetailsQuery.Description description = null;
            ArrayList arrayListFromJson = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    description = (RecipeDetailsQuery.Description) Adapters.b(Adapters.c(Description.f20282a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f20289a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new RecipeDetailsQuery.Method(str, description, arrayListFromJson, str2);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Method value = (RecipeDetailsQuery.Method) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20249a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.b(Adapters.c(Description.f20282a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f20289a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("disclaimer");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$NextBestAction;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<RecipeDetailsQuery.NextBestAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NextBestAction f20293a = new NextBestAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.OnActionableCard1 onActionableCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1A = OnActionableCard1.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.NextBestAction(str, onActionableCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.NextBestAction value = (RecipeDetailsQuery.NextBestAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20250a);
            RecipeDetailsQuery.OnActionableCard1 onActionableCard1 = value.b;
            if (onActionableCard1 != null) {
                OnActionableCard1.b(writer, customScalarAdapters, onActionableCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$NutritionTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$NutritionTile;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NutritionTile implements Adapter<RecipeDetailsQuery.NutritionTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final NutritionTile f20294a = new NutritionTile();
        public static final List b = CollectionsKt.R("title", "perServeKilojoules", "perServeCalories", "dailyIntakePercentage", "dailyIntakeText", "disclaimer", "features");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.c(Feature1.f20284a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "perServeKilojoules");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "perServeCalories");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "dailyIntakePercentage");
                            throw null;
                        }
                        int iIntValue = num3.intValue();
                        if (str4 == null) {
                            Assertions.a(reader, "dailyIntakeText");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "disclaimer");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new RecipeDetailsQuery.NutritionTile(str, str2, str3, iIntValue, str4, str5, arrayListFromJson);
                        }
                        Assertions.a(reader, "features");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.NutritionTile value = (RecipeDetailsQuery.NutritionTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20251a);
            writer.F1("perServeKilojoules");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("perServeCalories");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("dailyIntakePercentage");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "dailyIntakeText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("disclaimer");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("features");
            Adapters.a(Adapters.c(Feature1.f20284a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnActionableCard;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<RecipeDetailsQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20295a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");

        public static RecipeDetailsQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f20295a)) {
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
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (cardHeightA != null) {
                            return new RecipeDetailsQuery.OnActionableCard(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20252a);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnActionableCard1;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<RecipeDetailsQuery.OnActionableCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20296a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");

        public static RecipeDetailsQuery.OnActionableCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f20296a)) {
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
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (cardHeightA != null) {
                            return new RecipeDetailsQuery.OnActionableCard1(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20253a);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnActionableCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnGoogleAdBannerCard;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<RecipeDetailsQuery.OnGoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20297a = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "_excluded");

        public static RecipeDetailsQuery.OnGoogleAdBannerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            AdBannerNativeSize adBannerNativeSizeA = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(f20297a)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new RecipeDetailsQuery.OnGoogleAdBannerCard(str, str2, zBooleanValue, str3, adBannerNativeSizeA, googleAdCustomTargeting, str4, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20254a);
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iabSpec");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "iabSize");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.f);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnGoogleAdBannerCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnHostedIcon;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<RecipeDetailsQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20298a = CollectionsKt.Q("url");

        public static RecipeDetailsQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20298a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RecipeDetailsQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20255a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryCard;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<RecipeDetailsQuery.OnRecipeSummaryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20299a = CollectionsKt.Q("__typename");

        public static RecipeDetailsQuery.OnRecipeSummaryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20299a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new RecipeDetailsQuery.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20256a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnRecipeSummaryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnRecipeSummaryDifficulty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryDifficulty;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryDifficulty implements Adapter<RecipeDetailsQuery.OnRecipeSummaryDifficulty> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20300a = CollectionsKt.R("title", "value", "maxValue", "altText");

        public static RecipeDetailsQuery.OnRecipeSummaryDifficulty a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20300a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "value");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                Assertions.a(reader, "maxValue");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (str2 != null) {
                return new RecipeDetailsQuery.OnRecipeSummaryDifficulty(str, iIntValue, iIntValue2, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnRecipeSummaryDifficulty value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20257a);
            writer.F1("value");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "maxValue");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnRecipeSummaryDifficulty) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnRecipeSummaryFeature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeSummaryFeature;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryFeature implements Adapter<RecipeDetailsQuery.OnRecipeSummaryFeature> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20301a = CollectionsKt.R("title", "amount", "unit", "altText", "featureType");

        public static RecipeDetailsQuery.OnRecipeSummaryFeature a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            FeatureType featureTypeA = null;
            while (true) {
                int iO2 = reader.o2(f20301a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    featureTypeA = FeatureType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (featureTypeA != null) {
                return new RecipeDetailsQuery.OnRecipeSummaryFeature(str, str2, str3, str4, featureTypeA);
            }
            Assertions.a(reader, "featureType");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnRecipeSummaryFeature value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20258a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("unit");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("featureType");
            writer.v0(value.e.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnRecipeSummaryFeature) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnRecipeTagList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnRecipeTagList;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeTagList implements Adapter<RecipeDetailsQuery.OnRecipeTagList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20302a = CollectionsKt.Q(k.a.g);

        public static RecipeDetailsQuery.OnRecipeTagList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f20302a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new RecipeDetailsQuery.OnRecipeTagList(arrayListFromJson);
            }
            Assertions.a(reader, k.a.g);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnRecipeTagList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(k.a.g);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.f20259a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnRecipeTagList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$OnUniversalInventoryContainer;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<RecipeDetailsQuery.OnUniversalInventoryContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20303a = CollectionsKt.R("googleAdBannerCard", "nextBestAction");

        public static RecipeDetailsQuery.OnUniversalInventoryContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.GoogleAdBannerCard googleAdBannerCard = null;
            RecipeDetailsQuery.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(f20303a);
                if (iO2 == 0) {
                    googleAdBannerCard = (RecipeDetailsQuery.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.f20285a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new RecipeDetailsQuery.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (RecipeDetailsQuery.NextBestAction) Adapters.b(Adapters.c(NextBestAction.f20293a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RecipeDetailsQuery.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.f20285a, false)).toJson(writer, customScalarAdapters, value.f20260a);
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.f20293a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RecipeDetailsQuery.OnUniversalInventoryContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$RecipeCostPerServe;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeCostPerServe;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeCostPerServe implements Adapter<RecipeDetailsQuery.RecipeCostPerServe> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeCostPerServe f20304a = new RecipeCostPerServe();
        public static final List b = CollectionsKt.R("recipeCostPerServePrice", "recipeCostPerServeBanner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            RecipeDetailsQuery.RecipeCostPerServeBanner recipeCostPerServeBanner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    recipeCostPerServeBanner = (RecipeDetailsQuery.RecipeCostPerServeBanner) Adapters.b(Adapters.c(RecipeCostPerServeBanner.f20305a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (d != null) {
                return new RecipeDetailsQuery.RecipeCostPerServe(d.doubleValue(), recipeCostPerServeBanner);
            }
            Assertions.a(reader, "recipeCostPerServePrice");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.RecipeCostPerServe value = (RecipeDetailsQuery.RecipeCostPerServe) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recipeCostPerServePrice");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f20261a));
            writer.F1("recipeCostPerServeBanner");
            Adapters.b(Adapters.c(RecipeCostPerServeBanner.f20305a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$RecipeCostPerServeBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeCostPerServeBanner;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeCostPerServeBanner implements Adapter<RecipeDetailsQuery.RecipeCostPerServeBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeCostPerServeBanner f20305a = new RecipeCostPerServeBanner();
        public static final List b = CollectionsKt.R("broadcastBannerUI", "broadcastBannerActionLabel", "broadcastBannerAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.BroadcastBannerUI broadcastBannerUI = null;
            String str = null;
            RecipeDetailsQuery.BroadcastBannerAction broadcastBannerAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    broadcastBannerUI = (RecipeDetailsQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f20278a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    broadcastBannerAction = (RecipeDetailsQuery.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f20277a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (broadcastBannerUI != null) {
                return new RecipeDetailsQuery.RecipeCostPerServeBanner(broadcastBannerUI, str, broadcastBannerAction);
            }
            Assertions.a(reader, "broadcastBannerUI");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.RecipeCostPerServeBanner value = (RecipeDetailsQuery.RecipeCostPerServeBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f20278a, false).toJson(writer, customScalarAdapters, value.f20262a);
            writer.F1("broadcastBannerActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f20277a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$RecipeDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$RecipeDetails;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeDetails implements Adapter<RecipeDetailsQuery.RecipeDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeDetails f20306a = new RecipeDetails();
        public static final List b = CollectionsKt.R("id", "recipeCostPerServe", "recipeUrl", "title", "image", "ingredientProductIds", "ingredients", "sourceName", k.a.g, "method", "byline", "impressionAnalytics", "analytics", "features", "latestRecipes", "nutritionTile", "userInteraction", "ingredientsSection", "universalInventory", "shopIngredientButton", "video");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RecipeDetailsQuery.RecipeCostPerServe recipeCostPerServe = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            String str5 = null;
            ArrayList arrayListFromJson3 = null;
            RecipeDetailsQuery.Method method = null;
            RecipeDetailsQuery.Byline byline = null;
            RecipeDetailsQuery.ImpressionAnalytics impressionAnalytics = null;
            RecipeDetailsQuery.Analytics analytics = null;
            List list = null;
            RecipeDetailsQuery.LatestRecipes latestRecipes = null;
            RecipeDetailsQuery.NutritionTile nutritionTile = null;
            RecipeDetailsQuery.UserInteraction userInteraction = null;
            RecipeDetailsQuery.IngredientsSection ingredientsSection = null;
            RecipeDetailsQuery.UniversalInventory universalInventory = null;
            RecipeDetailsQuery.ShopIngredientButton shopIngredientButton = null;
            RecipeDetailsQuery.Video video = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        recipeCostPerServe = (RecipeDetailsQuery.RecipeCostPerServe) Adapters.b(Adapters.c(RecipeCostPerServe.f20304a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson2 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        arrayListFromJson3 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        method = (RecipeDetailsQuery.Method) Adapters.c(Method.f20292a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        byline = (RecipeDetailsQuery.Byline) Adapters.b(Adapters.c(Byline.f20280a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        impressionAnalytics = (RecipeDetailsQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f20287a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        analytics = (RecipeDetailsQuery.Analytics) Adapters.b(Adapters.c(Analytics.f20276a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Feature.f20283a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        latestRecipes = (RecipeDetailsQuery.LatestRecipes) Adapters.b(Adapters.c(LatestRecipes.f20291a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        nutritionTile = (RecipeDetailsQuery.NutritionTile) Adapters.b(Adapters.c(NutritionTile.f20294a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        userInteraction = (RecipeDetailsQuery.UserInteraction) Adapters.b(Adapters.c(UserInteraction.f20310a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        ingredientsSection = (RecipeDetailsQuery.IngredientsSection) Adapters.c(IngredientsSection.f20288a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        universalInventory = (RecipeDetailsQuery.UniversalInventory) Adapters.b(Adapters.c(UniversalInventory.f20309a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        shopIngredientButton = (RecipeDetailsQuery.ShopIngredientButton) Adapters.c(ShopIngredientButton.f20308a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 20:
                        video = (RecipeDetailsQuery.Video) Adapters.b(Adapters.c(Video.f20311a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "ingredientProductIds");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "ingredients");
                            throw null;
                        }
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, k.a.g);
                            throw null;
                        }
                        if (method == null) {
                            Assertions.a(reader, "method");
                            throw null;
                        }
                        if (ingredientsSection == null) {
                            Assertions.a(reader, "ingredientsSection");
                            throw null;
                        }
                        if (shopIngredientButton != null) {
                            return new RecipeDetailsQuery.RecipeDetails(str, recipeCostPerServe, str2, str3, str4, arrayListFromJson, arrayListFromJson2, str5, arrayListFromJson3, method, byline, impressionAnalytics, analytics, list, latestRecipes, nutritionTile, userInteraction, ingredientsSection, universalInventory, shopIngredientButton, video);
                        }
                        Assertions.a(reader, "shopIngredientButton");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.RecipeDetails value = (RecipeDetailsQuery.RecipeDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20263a);
            writer.F1("recipeCostPerServe");
            Adapters.b(Adapters.c(RecipeCostPerServe.f20304a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("recipeUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("ingredientProductIds");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.f);
            writer.F1("ingredients");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.g);
            writer.F1("sourceName");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1(k.a.g);
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.i);
            writer.F1("method");
            Adapters.c(Method.f20292a, false).toJson(writer, customScalarAdapters, value.j);
            writer.F1("byline");
            Adapters.b(Adapters.c(Byline.f20280a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f20287a, true)).toJson(writer, customScalarAdapters, value.l);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f20276a, true)).toJson(writer, customScalarAdapters, value.m);
            writer.F1("features");
            Adapters.b(Adapters.a(Adapters.c(Feature.f20283a, true))).toJson(writer, customScalarAdapters, value.n);
            writer.F1("latestRecipes");
            Adapters.b(Adapters.c(LatestRecipes.f20291a, false)).toJson(writer, customScalarAdapters, value.o);
            writer.F1("nutritionTile");
            Adapters.b(Adapters.c(NutritionTile.f20294a, false)).toJson(writer, customScalarAdapters, value.p);
            writer.F1("userInteraction");
            Adapters.b(Adapters.c(UserInteraction.f20310a, false)).toJson(writer, customScalarAdapters, value.q);
            writer.F1("ingredientsSection");
            Adapters.c(IngredientsSection.f20288a, false).toJson(writer, customScalarAdapters, value.r);
            writer.F1("universalInventory");
            Adapters.b(Adapters.c(UniversalInventory.f20309a, true)).toJson(writer, customScalarAdapters, value.s);
            writer.F1("shopIngredientButton");
            Adapters.c(ShopIngredientButton.f20308a, false).toJson(writer, customScalarAdapters, value.t);
            writer.F1("video");
            Adapters.b(Adapters.c(Video.f20311a, false)).toJson(writer, customScalarAdapters, value.u);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$ServesInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ServesInfo;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServesInfo implements Adapter<RecipeDetailsQuery.ServesInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ServesInfo f20307a = new ServesInfo();
        public static final List b = CollectionsKt.R("quantity", "title", "minimum", "maximum");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (num2 == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            int iIntValue2 = num2.intValue();
            if (num3 != null) {
                return new RecipeDetailsQuery.ServesInfo(iIntValue, iIntValue2, num3.intValue(), str);
            }
            Assertions.a(reader, "maximum");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.ServesInfo value = (RecipeDetailsQuery.ServesInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("quantity");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f20264a, adapters$IntAdapter$1, writer, customScalarAdapters, "title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("minimum");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "maximum");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$ShopIngredientButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$ShopIngredientButton;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopIngredientButton implements Adapter<RecipeDetailsQuery.ShopIngredientButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopIngredientButton f20308a = new ShopIngredientButton();
        public static final List b = CollectionsKt.Q("button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeDetailsQuery.Button button = null;
            while (reader.o2(b) == 0) {
                button = (RecipeDetailsQuery.Button) Adapters.c(Button.f20279a, false).fromJson(reader, customScalarAdapters);
            }
            if (button != null) {
                return new RecipeDetailsQuery.ShopIngredientButton(button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.ShopIngredientButton value = (RecipeDetailsQuery.ShopIngredientButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f20279a, false).toJson(writer, customScalarAdapters, value.f20265a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$UniversalInventory;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$UniversalInventory;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UniversalInventory implements Adapter<RecipeDetailsQuery.UniversalInventory> {

        /* renamed from: a, reason: collision with root package name */
        public static final UniversalInventory f20309a = new UniversalInventory();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RecipeDetailsQuery.OnActionableCard onActionableCardA;
            RecipeDetailsQuery.OnGoogleAdBannerCard onGoogleAdBannerCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RecipeDetailsQuery.OnUniversalInventoryContainer onUniversalInventoryContainerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GoogleAdBannerCard"), new BooleanExpression.Not(BooleanExpressions.d("includeUniversalInventoryFallback"))))) {
                reader.o();
                onGoogleAdBannerCardA = OnGoogleAdBannerCard.a(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("UniversalInventoryContainer"), BooleanExpressions.d("includeUniversalInventoryFallback")))) {
                reader.o();
                onUniversalInventoryContainerA = OnUniversalInventoryContainer.a(reader, customScalarAdapters);
            }
            return new RecipeDetailsQuery.UniversalInventory(str, onActionableCardA, onGoogleAdBannerCardA, onUniversalInventoryContainerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.UniversalInventory value = (RecipeDetailsQuery.UniversalInventory) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20266a);
            RecipeDetailsQuery.OnActionableCard onActionableCard = value.b;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            RecipeDetailsQuery.OnGoogleAdBannerCard onGoogleAdBannerCard = value.c;
            if (onGoogleAdBannerCard != null) {
                OnGoogleAdBannerCard.b(writer, customScalarAdapters, onGoogleAdBannerCard);
            }
            RecipeDetailsQuery.OnUniversalInventoryContainer onUniversalInventoryContainer = value.d;
            if (onUniversalInventoryContainer != null) {
                OnUniversalInventoryContainer.b(writer, customScalarAdapters, onUniversalInventoryContainer);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$UserInteraction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$UserInteraction;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UserInteraction implements Adapter<RecipeDetailsQuery.UserInteraction> {

        /* renamed from: a, reason: collision with root package name */
        public static final UserInteraction f20310a = new UserInteraction();
        public static final List b = CollectionsKt.R("isSaved", "recipeUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new RecipeDetailsQuery.UserInteraction(str, bool);
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.UserInteraction value = (RecipeDetailsQuery.UserInteraction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isSaved");
            Adapters.l.toJson(writer, customScalarAdapters, value.f20267a);
            writer.F1("recipeUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeDetailsQuery_ResponseAdapter$Video;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeDetailsQuery$Video;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Video implements Adapter<RecipeDetailsQuery.Video> {

        /* renamed from: a, reason: collision with root package name */
        public static final Video f20311a = new Video();
        public static final List b = CollectionsKt.R("url", "title", "thumbnail", "duration", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "thumbnail");
                throw null;
            }
            if (str4 != null) {
                return new RecipeDetailsQuery.Video(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "duration");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeDetailsQuery.Video value = (RecipeDetailsQuery.Video) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20268a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("thumbnail");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("duration");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }
}
