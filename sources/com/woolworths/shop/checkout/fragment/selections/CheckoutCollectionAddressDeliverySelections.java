package com.woolworths.shop.checkout.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/selections/CheckoutCollectionAddressDeliverySelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutCollectionAddressDeliverySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22538a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CollectionModeId.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("modeId", CompiledGraphQL.b(CollectionModeId.f)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        f22538a = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("addressId", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("displayName", CompiledGraphQL.b(customScalarType)).c(), d.g("addressImageUrl", customScalarType), new CompiledField.Builder("buttonText", CompiledGraphQL.b(customScalarType)).c(), d.g("expressDeliveryStoreId", customScalarType2));
    }
}
