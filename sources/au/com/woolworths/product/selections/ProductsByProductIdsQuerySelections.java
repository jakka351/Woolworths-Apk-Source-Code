package au.com.woolworths.product.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.ProductsInList;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/selections/ProductsByProductIdsQuerySelections;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductsByProductIdsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9336a;
    public static final List b;
    public static final List c;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f9336a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("products", a.f(ProductCard.f11717a));
        builder2.e = listR;
        List listQ = CollectionsKt.Q(builder2.c());
        b = listQ;
        CompiledField.Builder builder3 = new CompiledField.Builder("productsByProductIds", ProductsInList.f11794a);
        new CompiledArgument.Builder(Query.u0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.w0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.v0);
        builder3.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder3.e = listQ;
        c = CollectionsKt.Q(builder3.c());
    }
}
