package au.com.woolworths.foundation.rewards.cart.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.CartInfo;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/selections/CartInfoQuerySelections;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartInfoQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8554a;
    public static final List b;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("totalQuantity", CompiledGraphQL.b(GraphQLInt.f9616a)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.f9617a)).c());
        f8554a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("cartInfo", CartInfo.f9452a);
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
