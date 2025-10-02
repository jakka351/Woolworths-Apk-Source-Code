package com.woolworths.shop.modeselector.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/ModeSelectorV1AddressDetailsDeliveryFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModeSelectorV1AddressDetailsDeliveryFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23365a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("modeId", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        f23365a = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("addressId", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("addressText", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("isPrimary", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("postcode", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("street1", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("street2", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("suburbId", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("suburbName", CompiledGraphQL.b(customScalarType)).c());
    }
}
