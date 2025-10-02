package com.woolworths.rewards.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsWebLink;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/selections/RewardsMagicLinkQuerySelections;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsMagicLinkQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20645a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        f20645a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("rewardsMagicLink", RewardsWebLink.f9878a);
        new CompiledArgument.Builder(Query.r);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.s);
        builder.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
