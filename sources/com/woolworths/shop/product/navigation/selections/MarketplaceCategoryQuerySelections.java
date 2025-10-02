package com.woolworths.shop.product.navigation.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CategoryMenuItem;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.graphql.type.ProductCategories;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/navigation/selections/MarketplaceCategoryQuerySelections;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MarketplaceCategoryQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23619a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("iconUrl", customScalarType).c(), new CompiledField.Builder("isFinalLevel", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("categoryId", CompiledGraphQL.b(customScalarType)).c(), d.g("source", customScalarType));
        f23619a = listR;
        ProductListChannelType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("channel", CompiledGraphQL.b(ProductListChannelType.f)).c();
        ProductListFacetType.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("facet", CompiledGraphQL.b(ProductListFacetType.f)).c());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("categories", CompiledGraphQL.a(CompiledGraphQL.b(CategoryMenuItem.f11171a)));
        builder.e = listR;
        CompiledField compiledFieldC3 = builder.c();
        CompiledField.Builder builder2 = new CompiledField.Builder("marketplace", CompiledGraphQL.b(MarketplaceCategoriesInfo.f11555a));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder2.c());
        c = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("productCategories", ProductCategories.f11718a);
        new CompiledArgument.Builder(Query.S0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.Q0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.R0);
        builder3.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder3.e = listR3;
        d = CollectionsKt.Q(builder3.c());
    }
}
