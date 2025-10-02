package com.woolworths.feature.shop.wpay.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.LinkCreditCardResponse;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/selections/LinkCreditCardMutationSelections;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkCreditCardMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20472a;
    public static final List b;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("paymentMethodId", GraphQLString.f11443a).c());
        f20472a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("linkCreditCard", CompiledGraphQL.b(LinkCreditCardResponse.f11516a));
        new CompiledArgument.Builder(Mutation.Q);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
