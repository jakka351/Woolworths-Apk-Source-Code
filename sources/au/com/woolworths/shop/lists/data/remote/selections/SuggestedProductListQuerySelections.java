package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.ProductList;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/SuggestedProductListQuerySelections;", "", "<init>", "()V", "__products", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__suggestedListItems", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedProductListQuerySelections {

    @NotNull
    public static final SuggestedProductListQuerySelections INSTANCE = new SuggestedProductListQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __products;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __suggestedListItems;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __products = listR;
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("totalNumberOfProducts", customScalarType).c();
        CompiledField compiledFieldG = d.g("nextPage", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("products", a.f(ProductCard.f11717a));
        builder2.e = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder2.c());
        __suggestedListItems = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("suggestedListItems", ProductList.f11749a);
        new CompiledArgument.Builder(Query.v1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.x1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.w1);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.u1);
        builder3.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, new CompiledArgument());
        builder3.e = listR2;
        __root = CollectionsKt.Q(builder3.c());
    }

    private SuggestedProductListQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
