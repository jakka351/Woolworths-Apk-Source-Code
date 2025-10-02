package com.woolworths.feature.shop.wpay.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.LinkPayPalResponse;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/selections/LinkPayPalQuerySelections;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkPayPalQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20473a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("redirectUrl", CompiledGraphQL.b(customScalarType)).c());
        f20473a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("linkPayPal", CompiledGraphQL.b(LinkPayPalResponse.f11517a));
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
