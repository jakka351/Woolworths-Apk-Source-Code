package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.PickupCheckInResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/OrderCheckInMutationSelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderCheckInMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20199a;
    public static final List b;

    static {
        List listQ = CollectionsKt.Q(new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        f20199a = listQ;
        CompiledField.Builder builder = new CompiledField.Builder("orderCheckIn", CompiledGraphQL.b(PickupCheckInResponse.f11695a));
        new CompiledArgument.Builder(Mutation.r);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.q);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.p);
        builder.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder.e = listQ;
        b = CollectionsKt.Q(builder.c());
    }
}
