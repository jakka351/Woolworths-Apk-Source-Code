package au.com.woolworths.foundation.rewards.cart.update.data.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.Decimal;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import au.com.woolworths.rewards.graphql.type.UpdateCartQuantitiesPage;
import au.com.woolworths.rewards.graphql.type.UpdateCartQuantitiesPageResponse;
import au.com.woolworths.rewards.graphql.type.UpdatedCartQuantity;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/selections/UpdateCartQuantitiesMutationSelections;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateCartQuantitiesMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8568a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f9616a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("updatedQuantity", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f9613a)).c());
        f8568a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("productCount", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder = new CompiledField.Builder("updatedCartQuantities", CompiledGraphQL.a(CompiledGraphQL.b(UpdatedCartQuantity.f9938a)));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder.c(), new CompiledField.Builder("totalProductCount", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("totalProductCountAltText", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("totalPrice", CompiledGraphQL.b(Decimal.f9493a)).c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("updateCartQuantitiesPage", UpdateCartQuantitiesPage.f9934a);
        builder2.e = listR2;
        List listQ = CollectionsKt.Q(builder2.c());
        c = listQ;
        CompiledField.Builder builder3 = new CompiledField.Builder("updateCartQuantitiesPage", CompiledGraphQL.b(UpdateCartQuantitiesPageResponse.f9936a));
        new CompiledArgument.Builder(Mutation.v);
        builder3.d = a.v();
        builder3.e = listQ;
        d = CollectionsKt.Q(builder3.c());
    }
}
