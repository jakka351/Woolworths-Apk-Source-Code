package com.woolworths.shop.payment.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.payment.graphql.type.GraphQLBoolean;
import au.com.woolworths.payment.graphql.type.GraphQLInt;
import au.com.woolworths.payment.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/selections/ZeroPaymentResponseSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ZeroPaymentResponseSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23398a;
    public static final List b;
    public static final List c;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("orderId", CompiledGraphQL.b(GraphQLInt.f9198a)).c(), new CompiledField.Builder("placed", CompiledGraphQL.b(GraphQLBoolean.f9197a)).c());
        f23398a = listR;
        CustomScalarType customScalarType = GraphQLString.f9199a;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("errorCode", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("PaymentSuccess", CollectionsKt.Q("PaymentSuccess"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("PaymentValidationFailure", CollectionsKt.Q("PaymentValidationFailure"));
        builder2.d = listR2;
        c = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
    }
}
