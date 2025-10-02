package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.PickupOrderLocationUpdateResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/UpdatePickupOrderLocationMutationSelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdatePickupOrderLocationMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20203a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        List listR = CollectionsKt.R(new CompiledField.Builder("travelTimeInSec", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("bufferTimeInSec", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("stopLocationTracking", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        f20203a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("updatePickupOrderLocation", PickupOrderLocationUpdateResponse.f11698a);
        new CompiledArgument.Builder(Mutation.t);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
