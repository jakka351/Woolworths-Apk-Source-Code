package au.com.woolworths.shop.cart.data.selections;

import au.com.woolworths.shop.cart.data.common.fragment.selections.CartSelections;
import au.com.woolworths.shop.graphql.type.CartResponse;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/selections/CartQuerySelections;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10425a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CartResponse", CollectionsKt.Q("CartResponse"));
        builder.b(CartSelections.R);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f10425a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("cart", CompiledGraphQL.b(CartResponse.f11122a));
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
