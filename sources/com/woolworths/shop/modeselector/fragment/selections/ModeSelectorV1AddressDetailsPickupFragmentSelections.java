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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/ModeSelectorV1AddressDetailsPickupFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModeSelectorV1AddressDetailsPickupFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23366a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f23366a = CollectionsKt.R(new CompiledField.Builder("modeId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("storeId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("addressId", CompiledGraphQL.b(GraphQLInt.f11442a)).c(), new CompiledField.Builder("addressText", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("displayName", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
    }
}
