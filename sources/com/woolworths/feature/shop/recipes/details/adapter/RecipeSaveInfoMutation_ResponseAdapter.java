package com.woolworths.feature.shop.recipes.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.recipes.details.RecipeSaveInfoMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeSaveInfoMutation_ResponseAdapter;", "", "Data", "ToggleRecipeSave", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeSaveInfoMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeSaveInfoMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RecipeSaveInfoMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20312a = new Data();
        public static final List b = CollectionsKt.Q("toggleRecipeSave");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RecipeSaveInfoMutation.ToggleRecipeSave toggleRecipeSave = null;
            while (reader.o2(b) == 0) {
                toggleRecipeSave = (RecipeSaveInfoMutation.ToggleRecipeSave) Adapters.b(Adapters.c(ToggleRecipeSave.f20313a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RecipeSaveInfoMutation.Data(toggleRecipeSave);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeSaveInfoMutation.Data value = (RecipeSaveInfoMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("toggleRecipeSave");
            Adapters.b(Adapters.c(ToggleRecipeSave.f20313a, false)).toJson(writer, customScalarAdapters, value.f20270a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/adapter/RecipeSaveInfoMutation_ResponseAdapter$ToggleRecipeSave;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$ToggleRecipeSave;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleRecipeSave implements Adapter<RecipeSaveInfoMutation.ToggleRecipeSave> {

        /* renamed from: a, reason: collision with root package name */
        public static final ToggleRecipeSave f20313a = new ToggleRecipeSave();
        public static final List b = CollectionsKt.R("isSaved", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "isSaved");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new RecipeSaveInfoMutation.ToggleRecipeSave(zBooleanValue, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RecipeSaveInfoMutation.ToggleRecipeSave value = (RecipeSaveInfoMutation.ToggleRecipeSave) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isSaved");
            d.B(value.f20271a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
