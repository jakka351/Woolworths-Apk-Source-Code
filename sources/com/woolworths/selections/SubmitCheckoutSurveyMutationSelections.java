package com.woolworths.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/selections/SubmitCheckoutSurveyMutationSelections;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubmitCheckoutSurveyMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21388a;

    static {
        CompiledField.Builder builder = new CompiledField.Builder("submitCheckoutSurvey", CompiledGraphQL.b(GraphQLBoolean.f11439a));
        new CompiledArgument.Builder(Mutation.J);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.K);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.H);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.G);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.I);
        CompiledArgument compiledArgument5 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.F);
        CompiledArgument compiledArgument6 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.E);
        builder.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, compiledArgument5, compiledArgument6, new CompiledArgument());
        f21388a = CollectionsKt.Q(builder.c());
    }
}
