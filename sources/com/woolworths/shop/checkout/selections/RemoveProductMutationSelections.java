package com.woolworths.shop.checkout.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.CheckoutContent;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.woolworths.shop.checkout.fragment.selections.CheckoutContentSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/selections/RemoveProductMutationSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoveProductMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22559a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CheckoutContent", CollectionsKt.Q("CheckoutContent"));
        builder.b(CheckoutContentSelections.B0);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f22559a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("removeProduct", CheckoutContent.f11192a);
        new CompiledArgument.Builder(Mutation.y0);
        builder2.d = a.v();
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
