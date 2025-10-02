package com.woolworths.feature.shop.recipes.details;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.recipes.details.adapter.GetIngredientsQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$Data;", "Data", "GetIngredients", "ServesInfo", "Companion", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetIngredientsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f20227a;
    public final Optional.Present b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final GetIngredients f20228a;

        public Data(GetIngredients getIngredients) {
            this.f20228a = getIngredients;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20228a, ((Data) obj).f20228a);
        }

        public final int hashCode() {
            GetIngredients getIngredients = this.f20228a;
            if (getIngredients == null) {
                return 0;
            }
            return getIngredients.hashCode();
        }

        public final String toString() {
            return "Data(getIngredients=" + this.f20228a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$GetIngredients;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetIngredients {

        /* renamed from: a, reason: collision with root package name */
        public final ServesInfo f20229a;
        public final ArrayList b;

        public GetIngredients(ServesInfo servesInfo, ArrayList arrayList) {
            this.f20229a = servesInfo;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetIngredients)) {
                return false;
            }
            GetIngredients getIngredients = (GetIngredients) obj;
            return Intrinsics.c(this.f20229a, getIngredients.f20229a) && this.b.equals(getIngredients.b);
        }

        public final int hashCode() {
            ServesInfo servesInfo = this.f20229a;
            return this.b.hashCode() + ((servesInfo == null ? 0 : servesInfo.hashCode()) * 31);
        }

        public final String toString() {
            return "GetIngredients(servesInfo=" + this.f20229a + ", ingredients=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/GetIngredientsQuery$ServesInfo;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServesInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f20230a;
        public final String b;
        public final int c;
        public final int d;

        public ServesInfo(int i, int i2, int i3, String str) {
            this.f20230a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServesInfo)) {
                return false;
            }
            ServesInfo servesInfo = (ServesInfo) obj;
            return this.f20230a == servesInfo.f20230a && Intrinsics.c(this.b, servesInfo.b) && this.c == servesInfo.c && this.d == servesInfo.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + b.a(this.c, b.c(Integer.hashCode(this.f20230a) * 31, 31, this.b), 31);
        }

        public final String toString() {
            return a.i(this.c, this.d, ", maximum=", ")", androidx.constraintlayout.core.state.a.p("ServesInfo(quantity=", this.f20230a, ", title=", this.b, ", minimum="));
        }
    }

    public GetIngredientsQuery(Optional.Present present, Optional.Present present2) {
        this.f20227a = present;
        this.b = present2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetIngredientsQuery_ResponseAdapter.Data.f20272a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query GetIngredients($recipeId: String, $serves: Int) { getIngredients(recipeId: $recipeId, serves: $serves) { servesInfo { quantity title minimum maximum } ingredients } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetIngredientsQuery)) {
            return false;
        }
        GetIngredientsQuery getIngredientsQuery = (GetIngredientsQuery) obj;
        return this.f20227a.equals(getIngredientsQuery.f20227a) && this.b.equals(getIngredientsQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20227a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6f80f34b4d5c45a43e3b59da7180d75db6a4a7f5f17b1fcda99d99c1444127f0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "GetIngredients";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("recipeId");
        Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f20227a);
        jsonWriter.F1("serves");
        Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return "GetIngredientsQuery(recipeId=" + this.f20227a + ", serves=" + this.b + ")";
    }
}
