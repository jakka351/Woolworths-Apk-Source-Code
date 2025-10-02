package com.woolworths.shop.checkout.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.IdVerificationInitResponse;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/selections/InitiateIdVerificationMutationSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitiateIdVerificationMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22554a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("verificationFormUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("callbackUrlPattern", CompiledGraphQL.b(customScalarType)).c());
        f22554a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("initiateIdVerification", CompiledGraphQL.b(IdVerificationInitResponse.f11484a));
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
