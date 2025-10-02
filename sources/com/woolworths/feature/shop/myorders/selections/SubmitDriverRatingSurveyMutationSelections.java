package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.SubmitDriverRatingResponse;
import au.com.woolworths.shop.graphql.type.SubmitDriverRatingResponseError;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/SubmitDriverRatingSurveyMutationSelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubmitDriverRatingSurveyMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20201a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("code", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        f20201a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("error", SubmitDriverRatingResponseError.f11939a);
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, builder.c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("submitDriverRatingSurvey", CompiledGraphQL.b(SubmitDriverRatingResponse.f11938a));
        new CompiledArgument.Builder(Mutation.f0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.d0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.g0);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.e0);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.c0);
        builder2.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, new CompiledArgument());
        builder2.e = listR2;
        c = CollectionsKt.Q(builder2.c());
    }
}
