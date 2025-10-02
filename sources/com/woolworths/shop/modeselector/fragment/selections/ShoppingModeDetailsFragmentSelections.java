package com.woolworths.shop.modeselector.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/ShoppingModeDetailsFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingModeDetailsFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23367a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f23367a = CollectionsKt.R(new CompiledField.Builder("displayName", customScalarType).c(), new CompiledField.Builder("mode", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("storeAddressId", GraphQLInt.f11442a).c());
    }
}
