package com.woolworths.shop.product.navigation.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CategoryMenuItem;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductCategories;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/navigation/selections/ProductCategoryQuerySelections;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductCategoryQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23620a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("iconUrl", customScalarType).c(), new CompiledField.Builder("isFinalLevel", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("categoryId", CompiledGraphQL.b(customScalarType)).c(), d.g("source", customScalarType));
        f23620a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("categories", CompiledGraphQL.a(CompiledGraphQL.b(CategoryMenuItem.f11171a)));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, builder.c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("productCategories", ProductCategories.f11718a);
        new CompiledArgument.Builder(Query.S0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.Q0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.R0);
        builder2.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder2.e = listR2;
        c = CollectionsKt.Q(builder2.c());
    }
}
