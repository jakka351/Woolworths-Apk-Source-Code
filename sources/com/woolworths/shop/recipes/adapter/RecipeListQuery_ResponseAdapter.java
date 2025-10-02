package com.woolworths.shop.recipes.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.woolworths.shop.recipes.RecipeListQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "RecipeSearch", "RecipeListFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnRecipeSummaryCard", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecipeListQuery_ResponseAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final RecipeListQuery_ResponseAdapter INSTANCE = new RecipeListQuery_ResponseAdapter();

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RecipeListQuery.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("recipeSearch");
        public static final int $stable = 8;

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeListQuery.RecipeSearch recipeSearch = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                recipeSearch = (RecipeListQuery.RecipeSearch) Adapters.b(Adapters.c(RecipeSearch.INSTANCE, false)).fromJson(reader, customScalarAdapters);
            }
            return new RecipeListQuery.Data(recipeSearch);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recipeSearch");
            Adapters.b(Adapters.c(RecipeSearch.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getRecipeSearch());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$GoogleAdBannerCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<RecipeListQuery.GoogleAdBannerCard> {

        @NotNull
        public static final GoogleAdBannerCard INSTANCE = new GoogleAdBannerCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");
        public static final int $stable = 8;

        private GoogleAdBannerCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.GoogleAdBannerCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(RESPONSE_NAMES)) {
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
                            return new RecipeListQuery.GoogleAdBannerCard(str, str2, str3, zBooleanValue, str4, adBannerNativeSizeA, googleAdCustomTargeting, str5, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.GoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.get__typename());
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAdUnit());
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getNativeCustomTemplateId());
            writer.F1("iabSpec");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIabSpec()));
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIabSize());
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.getHeight());
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.getTargeting());
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getCorrelator());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$NextBestAction;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<RecipeListQuery.NextBestAction> {

        @NotNull
        public static final NextBestAction INSTANCE = new NextBestAction();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private NextBestAction() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.NextBestAction fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeListQuery.OnActionableCard1 onActionableCard1FromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1FromJson = OnActionableCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new RecipeListQuery.NextBestAction(str, onActionableCard1FromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.NextBestAction value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnActionableCard() != null) {
                OnActionableCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnActionableCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<RecipeListQuery.OnActionableCard> {

        @NotNull
        public static final OnActionableCard INSTANCE = new OnActionableCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");
        public static final int $stable = 8;

        private OnActionableCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.OnActionableCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(RESPONSE_NAMES)) {
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
                            return new RecipeListQuery.OnActionableCard(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.get__typename());
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLink());
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImage());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.getCardHeight());
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<RecipeListQuery.OnActionableCard1> {

        @NotNull
        public static final OnActionableCard1 INSTANCE = new OnActionableCard1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");
        public static final int $stable = 8;

        private OnActionableCard1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.OnActionableCard1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(RESPONSE_NAMES)) {
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
                            return new RecipeListQuery.OnActionableCard1(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.get__typename());
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLink());
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImage());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.getCardHeight());
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<RecipeListQuery.OnGoogleAdBannerCard> {

        @NotNull
        public static final OnGoogleAdBannerCard INSTANCE = new OnGoogleAdBannerCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("__typename", OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");
        public static final int $stable = 8;

        private OnGoogleAdBannerCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.OnGoogleAdBannerCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(RESPONSE_NAMES)) {
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
                            return new RecipeListQuery.OnGoogleAdBannerCard(str, str2, str3, zBooleanValue, str4, adBannerNativeSizeA, googleAdCustomTargeting, str5, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.get__typename());
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAdUnit());
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getNativeCustomTemplateId());
            writer.F1("iabSpec");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIabSpec()));
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIabSize());
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.getHeight());
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.getTargeting());
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getCorrelator());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<RecipeListQuery.OnRecipeSummaryCard> {

        @NotNull
        public static final OnRecipeSummaryCard INSTANCE = new OnRecipeSummaryCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnRecipeSummaryCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.OnRecipeSummaryCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new RecipeListQuery.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.getRecipeSummaryCardFragment());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<RecipeListQuery.OnUniversalInventoryContainer> {

        @NotNull
        public static final OnUniversalInventoryContainer INSTANCE = new OnUniversalInventoryContainer();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("googleAdBannerCard", "nextBestAction");
        public static final int $stable = 8;

        private OnUniversalInventoryContainer() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.OnUniversalInventoryContainer fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeListQuery.GoogleAdBannerCard googleAdBannerCard = null;
            RecipeListQuery.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    googleAdBannerCard = (RecipeListQuery.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new RecipeListQuery.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (RecipeListQuery.NextBestAction) Adapters.b(Adapters.c(NextBestAction.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getGoogleAdBannerCard());
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getNextBestAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$RecipeListFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeListFeed;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeListFeed implements Adapter<RecipeListQuery.RecipeListFeed> {

        @NotNull
        public static final RecipeListFeed INSTANCE = new RecipeListFeed();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private RecipeListFeed() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.RecipeListFeed fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            RecipeListQuery.OnActionableCard onActionableCardFromJson;
            RecipeListQuery.OnGoogleAdBannerCard onGoogleAdBannerCardFromJson;
            RecipeListQuery.OnUniversalInventoryContainer onUniversalInventoryContainerFromJson;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RecipeListQuery.OnRecipeSummaryCard onRecipeSummaryCardFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardFromJson = OnActionableCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onActionableCardFromJson = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GoogleAdBannerCard"), new BooleanExpression.Not(BooleanExpressions.d("includeUniversalInventoryFallback"))))) {
                reader.o();
                onGoogleAdBannerCardFromJson = OnGoogleAdBannerCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardFromJson = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("UniversalInventoryContainer"), BooleanExpressions.d("includeUniversalInventoryFallback")))) {
                reader.o();
                onUniversalInventoryContainerFromJson = OnUniversalInventoryContainer.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onUniversalInventoryContainerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCardFromJson = OnRecipeSummaryCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new RecipeListQuery.RecipeListFeed(str, onActionableCardFromJson, onGoogleAdBannerCardFromJson, onUniversalInventoryContainerFromJson, onRecipeSummaryCardFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.RecipeListFeed value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnActionableCard() != null) {
                OnActionableCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnActionableCard());
            }
            if (value.getOnGoogleAdBannerCard() != null) {
                OnGoogleAdBannerCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnGoogleAdBannerCard());
            }
            if (value.getOnUniversalInventoryContainer() != null) {
                OnUniversalInventoryContainer.INSTANCE.toJson(writer, customScalarAdapters, value.getOnUniversalInventoryContainer());
            }
            if (value.getOnRecipeSummaryCard() != null) {
                OnRecipeSummaryCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRecipeSummaryCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_ResponseAdapter$RecipeSearch;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeSearch implements Adapter<RecipeListQuery.RecipeSearch> {

        @NotNull
        public static final RecipeSearch INSTANCE = new RecipeSearch();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("totalNumberOfRecipes", "nextPage", "recipeListFeed", "title");
        public static final int $stable = 8;

        private RecipeSearch() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public RecipeListQuery.RecipeSearch fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            ArrayList arrayListFromJson = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(RecipeListFeed.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "totalNumberOfRecipes");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListFromJson != null) {
                return new RecipeListQuery.RecipeSearch(iIntValue, num2, arrayListFromJson, str);
            }
            Assertions.a(reader, "recipeListFeed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull RecipeListQuery.RecipeSearch value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfRecipes");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.getTotalNumberOfRecipes()));
            writer.F1("nextPage");
            Adapters.k.toJson(writer, customScalarAdapters, value.getNextPage());
            writer.F1("recipeListFeed");
            Adapters.a(Adapters.b(Adapters.c(RecipeListFeed.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getRecipeListFeed());
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.getTitle());
        }
    }

    private RecipeListQuery_ResponseAdapter() {
    }
}
