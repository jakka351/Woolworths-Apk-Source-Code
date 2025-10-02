package com.woolworths.shop.catalogue.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/selections/CatalogueHomeCardSelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueHomeCardSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21787a;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f21787a = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
    }
}
