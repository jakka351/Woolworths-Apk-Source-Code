package com.woolworths.shop.checkout.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.CheckoutContent;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.RemoveCheckoutPromoCodeResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.shop.checkout.fragment.selections.CheckoutContentSummarySelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/selections/RemoveCheckoutPromoCodeMutationSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveCheckoutPromoCodeMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22558a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CheckoutContent", CollectionsKt.Q("CheckoutContent"));
        builder.b(CheckoutContentSummarySelections.w0);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f22558a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("checkoutSummary", CheckoutContent.f11192a);
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder2.c());
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("removeCheckoutPromoCode", CompiledGraphQL.b(RemoveCheckoutPromoCodeResponse.f11878a));
        new CompiledArgument.Builder(Mutation.X);
        builder3.d = a.v();
        builder3.e = listR2;
        c = CollectionsKt.Q(builder3.c());
    }
}
