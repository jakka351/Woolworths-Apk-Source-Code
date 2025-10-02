package com.woolworths.rewards.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/selections/RewardsNewBadgeDismissedMutationSelections;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsNewBadgeDismissedMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20646a;

    static {
        CompiledField.Builder builder = new CompiledField.Builder("rewardsNewBadgeDismissed", GraphQLBoolean.f9613a);
        new CompiledArgument.Builder(Mutation.f9661a);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.b);
        builder.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        f20646a = CollectionsKt.Q(builder.c());
    }
}
