package au.com.woolworths.shop.lists.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.MagicMatchProductList;
import au.com.woolworths.shop.graphql.type.MagicMatchResponse;
import au.com.woolworths.shop.graphql.type.MagicMatchResult;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/selections/MagicMatchProductListQuerySelections;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MagicMatchProductListQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12299a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        List list = ProductCardSelections.A;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f12299a = listR;
        CustomScalarType customScalarType2 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("quantity", CompiledGraphQL.b(customScalarType2)).c();
        ObjectType objectType = ProductCard.f11717a;
        CompiledField.Builder builder2 = new CompiledField.Builder("product", CompiledGraphQL.b(objectType));
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.c());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder3.d = list;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder3.a());
        c = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("quantity", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("product", CompiledGraphQL.b(objectType));
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder4.c());
        d = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("searchText", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("listItemId", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        ObjectType objectType2 = MagicMatchResult.f11547a;
        CompiledField.Builder builder5 = new CompiledField.Builder("matchedProduct", objectType2);
        builder5.e = listR2;
        CompiledField compiledFieldC7 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder(SuggestedProductListQuery.OPERATION_NAME, a.f(objectType2));
        builder6.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, builder6.c());
        e = listR5;
        CompiledField.Builder builder7 = new CompiledField.Builder("productList", a.f(MagicMatchProductList.f11545a));
        builder7.e = listR5;
        List listQ = CollectionsKt.Q(builder7.c());
        f = listQ;
        CompiledField.Builder builder8 = new CompiledField.Builder("magicMatchProductList", CompiledGraphQL.b(MagicMatchResponse.f11546a));
        new CompiledArgument.Builder(Query.B);
        builder8.d = au.com.woolworths.android.onesite.a.v();
        builder8.e = listQ;
        g = CollectionsKt.Q(builder8.c());
    }
}
