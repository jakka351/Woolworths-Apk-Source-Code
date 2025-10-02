package com.woolworths.feature.shop.recipes.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.adapter.ToggleRecipeSaveInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.recipes.details.adapter.RecipeSaveInfoMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$Data;", "Data", "ToggleRecipeSave", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeSaveInfoMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f20269a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ToggleRecipeSave f20270a;

        public Data(ToggleRecipeSave toggleRecipeSave) {
            this.f20270a = toggleRecipeSave;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20270a, ((Data) obj).f20270a);
        }

        public final int hashCode() {
            ToggleRecipeSave toggleRecipeSave = this.f20270a;
            if (toggleRecipeSave == null) {
                return 0;
            }
            return toggleRecipeSave.hashCode();
        }

        public final String toString() {
            return "Data(toggleRecipeSave=" + this.f20270a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/RecipeSaveInfoMutation$ToggleRecipeSave;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleRecipeSave {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20271a;
        public final String b;

        public ToggleRecipeSave(boolean z, String str) {
            this.f20271a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleRecipeSave)) {
                return false;
            }
            ToggleRecipeSave toggleRecipeSave = (ToggleRecipeSave) obj;
            return this.f20271a == toggleRecipeSave.f20271a && Intrinsics.c(this.b, toggleRecipeSave.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f20271a) * 31);
        }

        public final String toString() {
            return a.m("ToggleRecipeSave(isSaved=", this.f20271a, ", message=", this.b, ")");
        }
    }

    public RecipeSaveInfoMutation(Optional.Present present) {
        this.f20269a = present;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RecipeSaveInfoMutation_ResponseAdapter.Data.f20312a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RecipeSaveInfo($input: ToggleRecipeSaveInput) { toggleRecipeSave(input: $input) { isSaved message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipeSaveInfoMutation) && this.f20269a.equals(((RecipeSaveInfoMutation) obj).f20269a);
    }

    public final int hashCode() {
        return this.f20269a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2537fe5e200523a4965b744bff9cff4a92b9bf9cb0af1f394de52d1e170638b5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RecipeSaveInfo";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.d(Adapters.b(Adapters.c(ToggleRecipeSaveInput_InputAdapter.f12130a, false))).toJson(jsonWriter, customScalarAdapters, this.f20269a);
    }

    public final String toString() {
        return "RecipeSaveInfoMutation(input=" + this.f20269a + ")";
    }
}
