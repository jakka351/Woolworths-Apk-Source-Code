package com.woolworths.product.list.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/product/list/selections/ProductsByPriceFamilyQuerySelections;", "", "<init>", "()V", "__onProductCard", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__productsFeed", "__productsByPriceFamily", "__root", "get__root", "()Ljava/util/List;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsByPriceFamilyQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductsByPriceFamilyQuerySelections INSTANCE = new ProductsByPriceFamilyQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __productsByPriceFamily;

    @NotNull
    private static final List<CompiledSelection> __productsFeed;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __onProductCard = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder2.d = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        __productsFeed = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("totalNumberOfProducts", GraphQLInt.f11442a).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder3.e = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC3, builder3.c());
        __productsByPriceFamily = listR3;
        CompiledField.Builder builder4 = new CompiledField.Builder("productsByPriceFamily", ProductList.f11749a);
        new CompiledArgument.Builder(Query.D0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.E0);
        builder4.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder4.e = listR3;
        __root = CollectionsKt.Q(builder4.c());
        $stable = 8;
    }

    private ProductsByPriceFamilyQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
