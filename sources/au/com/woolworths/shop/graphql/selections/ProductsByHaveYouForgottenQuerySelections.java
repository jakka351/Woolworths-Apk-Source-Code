package au.com.woolworths.shop.graphql.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/selections/ProductsByHaveYouForgottenQuerySelections;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductsByHaveYouForgottenQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10993a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f10993a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder2.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("totalNumberOfProducts", GraphQLInt.f11442a).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder3.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder3.c());
        c = listR3;
        CompiledField.Builder builder4 = new CompiledField.Builder("productsByHaveYouForgotten", ProductList.f11749a);
        builder4.e = listR3;
        d = CollectionsKt.Q(builder4.c());
    }
}
