package com.woolworths.shop.checkout.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.SetFulfilmentWindowResultSuccess;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/selections/SetFulfilmentWindowMutationSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetFulfilmentWindowMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22562a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("_", GraphQLBoolean.f11439a).c();
        CollectionModeId.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("modeId", CompiledGraphQL.b(CollectionModeId.f)).c());
        f22562a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("setFulfilmentWindow", SetFulfilmentWindowResultSuccess.f11894a);
        new CompiledArgument.Builder(Mutation.g);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.f);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.h);
        builder.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
