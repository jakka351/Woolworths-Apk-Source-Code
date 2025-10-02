package com.woolworths.rewards.redemptionsettings.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import au.com.woolworths.rewards.graphql.type.SecureRewardsDollars;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/selections/SecureRewardsDollarsMutationSelections;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecureRewardsDollarsMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21129a;
    public static final List b;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f9613a)).c(), new CompiledField.Builder("message", GraphQLString.f9617a).c());
        f21129a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("secureRewardsDollars", SecureRewardsDollars.f9900a);
        new CompiledArgument.Builder(Mutation.s);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
