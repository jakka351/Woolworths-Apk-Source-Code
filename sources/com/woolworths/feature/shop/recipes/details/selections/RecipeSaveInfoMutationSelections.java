package com.woolworths.feature.shop.recipes.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.RecipeSaveInfo;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/recipes/details/selections/RecipeSaveInfoMutationSelections;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeSaveInfoMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20316a;
    public static final List b;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("isSaved", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(GraphQLString.f11443a)).c());
        f20316a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("toggleRecipeSave", RecipeSaveInfo.f11868a);
        new CompiledArgument.Builder(Mutation.h0);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
