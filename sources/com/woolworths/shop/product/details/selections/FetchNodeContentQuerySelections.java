package com.woolworths.shop.product.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.HorizontalListItem;
import au.com.woolworths.shop.graphql.type.NodeContent;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.shop.productcard.data.fragment.selections.ProductTileSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/selections/FetchNodeContentQuerySelections;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FetchNodeContentQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23601a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f23601a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductTile", CollectionsKt.Q("ProductTile"));
        builder2.b(ProductTileSelections.J);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("ProductTile", CollectionsKt.Q("ProductTile"));
        builder4.c = a.s("isProductTileUpliftEnabled", false);
        builder4.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, builder4.a());
        c = listR3;
        CompiledField.Builder builder5 = new CompiledField.Builder("items", d.j(HorizontalListItem.f11475a));
        builder5.e = listR3;
        List listQ = CollectionsKt.Q(builder5.c());
        d = listQ;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder6.d = listQ;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder6.a());
        e = listR4;
        CompiledField.Builder builder7 = new CompiledField.Builder("fetchNodeContent", NodeContent.f11616a);
        new CompiledArgument.Builder(Query.o);
        builder7.d = au.com.woolworths.android.onesite.a.v();
        builder7.e = listR4;
        f = CollectionsKt.Q(builder7.c());
    }
}
