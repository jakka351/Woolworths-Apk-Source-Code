package com.woolworths.shop.payment.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.payment.graphql.type.GraphQLBoolean;
import au.com.woolworths.payment.graphql.type.GraphQLInt;
import au.com.woolworths.payment.graphql.type.GraphQLString;
import au.com.woolworths.payment.graphql.type.PaymentError;
import au.com.woolworths.payment.graphql.type.StepUp;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/payment/fragment/selections/PaymentResponseSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentResponseSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23397a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("orderId", CompiledGraphQL.b(GraphQLInt.f9198a)).c();
        CustomScalarType customScalarType = GraphQLBoolean.f9197a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("placed", CompiledGraphQL.b(customScalarType)).c());
        f23397a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("mandatory", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f9199a;
        List listR2 = CollectionsKt.R(compiledFieldC2, new CompiledField.Builder("url", customScalarType2).c());
        b = listR2;
        CompiledField compiledFieldG = d.g("paymentInstrumentId", customScalarType2);
        CompiledField compiledFieldG2 = d.g("errorCode", customScalarType2);
        CompiledField compiledFieldG3 = d.g("errorMessage", customScalarType2);
        CompiledField.Builder builder = new CompiledField.Builder("stepUp", StepUp.f9210a);
        builder.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldG, compiledFieldG2, compiledFieldG3, builder.c());
        c = listR3;
        CompiledField.Builder builder2 = new CompiledField.Builder("paymentErrors", a.f(PaymentError.f9202a));
        builder2.e = listR3;
        List listQ = CollectionsKt.Q(builder2.c());
        d = listQ;
        List listR4 = CollectionsKt.R(new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("errorCode", CompiledGraphQL.b(customScalarType2)).c());
        e = listR4;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("PaymentSuccess", CollectionsKt.Q("PaymentSuccess"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("PaymentFailure", CollectionsKt.Q("PaymentFailure"));
        builder4.d = listQ;
        CompiledFragment compiledFragmentA2 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("PaymentValidationFailure", CollectionsKt.Q("PaymentValidationFailure"));
        builder5.d = listR4;
        f = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, builder5.a());
    }
}
