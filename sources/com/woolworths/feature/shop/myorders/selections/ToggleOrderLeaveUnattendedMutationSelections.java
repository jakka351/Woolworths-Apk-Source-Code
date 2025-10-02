package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedReason;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/ToggleOrderLeaveUnattendedMutationSelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleOrderLeaveUnattendedMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20202a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        ToggleOrderLeaveUnattendedReason.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("reason", ToggleOrderLeaveUnattendedReason.f).c(), new CompiledField.Builder("message", GraphQLString.f11443a).c());
        f20202a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("toggleOrderLeaveUnattended", CompiledGraphQL.b(ToggleOrderLeaveUnattendedResponse.f11971a));
        new CompiledArgument.Builder(Mutation.b0);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
