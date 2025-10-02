package com.woolworths.rewards.offers.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsOfferBase;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.woolworths.rewards.offers.fragment.fragment.selections.OfferDetailsFragmentSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/selections/OfferDetailsQuerySelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21047a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f9617a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RewardsOfferBase", CollectionsKt.R("PreactivatedRewardsOffer", "RewardsOffer"));
        builder.b(OfferDetailsFragmentSelections.j);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21047a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("rewardsOffer", RewardsOfferBase.f9838a);
        new CompiledArgument.Builder(Query.u);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.t);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.v);
        builder2.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
