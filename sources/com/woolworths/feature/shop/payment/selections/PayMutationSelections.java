package com.woolworths.feature.shop.payment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.payment.graphql.type.Analytics;
import au.com.woolworths.payment.graphql.type.GraphQLBoolean;
import au.com.woolworths.payment.graphql.type.GraphQLInt;
import au.com.woolworths.payment.graphql.type.GraphQLString;
import au.com.woolworths.payment.graphql.type.Mutation;
import au.com.woolworths.payment.graphql.type.WpayPaymentResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.woolworths.feature.shop.payment.fragment.selections.AnalyticsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/payment/selections/PayMutationSelections;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20226a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        List listQ = CollectionsKt.Q(new CompiledField.Builder("orderId", CompiledGraphQL.b(GraphQLInt.f9198a)).c());
        f20226a = listQ;
        CustomScalarType customScalarType = GraphQLString.f9199a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        List list = AnalyticsSelections.b;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = Analytics.f9195a;
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", CompiledGraphQL.b(objectType));
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.c(), new CompiledField.Builder("regenerateIdempotencyKey", CompiledGraphQL.b(GraphQLBoolean.f9197a)).c());
        c = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder3.d = list;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder3.a());
        d = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("errorTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("analytics", CompiledGraphQL.b(objectType));
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, builder4.c());
        e = listR4;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("WpayPaymentSuccess", CollectionsKt.Q("WpayPaymentSuccess"));
        builder5.d = listQ;
        CompiledFragment compiledFragmentA = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("WpayPaymentFailure", CollectionsKt.Q("WpayPaymentFailure"));
        builder6.d = listR2;
        CompiledFragment compiledFragmentA2 = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("WpayPaymentValidationFailure", CollectionsKt.Q("WpayPaymentValidationFailure"));
        builder7.d = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC6, compiledFragmentA, compiledFragmentA2, builder7.a());
        f = listR5;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("WpayPaymentResponse", CollectionsKt.R("WpayPaymentSuccess", "WpayPaymentFailure", "WpayPaymentValidationFailure"));
        builder8.d = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC7, builder8.a());
        g = listR6;
        CompiledField.Builder builder9 = new CompiledField.Builder("pay", CompiledGraphQL.b(WpayPaymentResponse.f9212a));
        new CompiledArgument.Builder(Mutation.b);
        builder9.d = a.v();
        builder9.e = listR6;
        h = CollectionsKt.Q(builder9.c());
    }
}
