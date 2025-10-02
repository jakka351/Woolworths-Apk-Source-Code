package com.woolworths.shop.recipes.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.shop.recipes.RecipeListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/shop/recipes/adapter/RecipeListQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lcom/woolworths/shop/recipes/RecipeListQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecipeListQuery_VariablesAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final RecipeListQuery_VariablesAdapter INSTANCE = new RecipeListQuery_VariablesAdapter();

    private RecipeListQuery_VariablesAdapter() {
    }

    public final void serializeVariables(@NotNull JsonWriter writer, @NotNull RecipeListQuery value, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(value, "value");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        if (value.getShoppingMode() instanceof Optional.Present) {
            writer.F1("shoppingMode");
            Adapters.d(Adapters.b(ShoppingModeType_ResponseAdapter.f12118a)).toJson(writer, customScalarAdapters, (Optional.Present) value.getShoppingMode());
        }
        writer.F1(k.a.g);
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.getTags());
        if (value.getKey() instanceof Optional.Present) {
            writer.F1("key");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getKey());
        }
        if (value.getSource() instanceof Optional.Present) {
            writer.F1("source");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getSource());
        }
        if (value.getPageNumber() instanceof Optional.Present) {
            writer.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(writer, customScalarAdapters, (Optional.Present) value.getPageNumber());
        }
        if (value.getSearchTerm() instanceof Optional.Present) {
            writer.F1(RecentSearch.COLUMN_NAME_SEARCH_TERM);
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) value.getSearchTerm());
        }
        if (value.getSupportedLinks() instanceof Optional.Present) {
            writer.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(writer, customScalarAdapters, (Optional.Present) value.getSupportedLinks());
        }
        writer.F1("includeUniversalInventoryFallback");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getIncludeUniversalInventoryFallback()));
        if (value.isVideoTagOnRecipeCardEnabled() instanceof Optional.Present) {
            writer.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(writer, customScalarAdapters, (Optional.Present) value.isVideoTagOnRecipeCardEnabled());
        } else if (withDefaultValues) {
            writer.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.m.toJson(writer, customScalarAdapters, Boolean.FALSE);
        }
    }
}
