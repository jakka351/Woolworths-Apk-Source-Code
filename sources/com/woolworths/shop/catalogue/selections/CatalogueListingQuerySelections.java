package com.woolworths.shop.catalogue.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.CatalogueListing;
import au.com.woolworths.shop.graphql.type.CatalogueListingHeader;
import au.com.woolworths.shop.graphql.type.CatalogueListingItem;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/selections/CatalogueListingQuerySelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueListingQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21793a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g("backgroundImageUrl", customScalarType), d.g("backgroundColor", customScalarType));
        f21793a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder2.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC2, builder2.a());
        c = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("header", CatalogueListingHeader.f11156a);
        builder3.e = listR;
        CompiledField compiledFieldC3 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("items", d.j(CatalogueListingItem.f11158a));
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC3, builder4.c());
        d = listR4;
        CompiledField.Builder builder5 = new CompiledField.Builder("catalogueListing", CatalogueListing.f11155a);
        new CompiledArgument.Builder(Query.Q1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.P1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.S1);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.R1);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Query.T1);
        CompiledArgument compiledArgument5 = new CompiledArgument();
        new CompiledArgument.Builder(Query.O1);
        builder5.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, compiledArgument5, new CompiledArgument());
        builder5.e = listR4;
        e = CollectionsKt.Q(builder5.c());
    }
}
