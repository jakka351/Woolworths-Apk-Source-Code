package com.woolworths.rewards.offers.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.ActivationDetails;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import au.com.woolworths.rewards.graphql.type.OfferActivation;
import au.com.woolworths.rewards.graphql.type.OfferFeed;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.rewards.offers.fragment.selections.RewardsOfferFeedFieldsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/selections/ActivateSectionInFeedMutationSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivateSectionInFeedMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21045a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("OfferFeed", CollectionsKt.Q("OfferFeed"));
        builder.b(RewardsOfferFeedFieldsSelections.o);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21045a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c());
        b = listQ;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ActivationDetailsError", CollectionsKt.Q("ActivationDetailsError"));
        builder2.d = listQ;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        c = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("offerFeed", CompiledGraphQL.b(OfferFeed.f9694a));
        builder3.e = listR;
        CompiledField compiledFieldC3 = builder3.c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("activatedOfferIds", a.e(GraphQLID.f9615a)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("activationDetails", ActivationDetails.f9401a);
        builder4.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, builder4.c());
        d = listR3;
        CompiledField.Builder builder5 = new CompiledField.Builder("activateAllOffersInFeed", OfferActivation.f9674a);
        new CompiledArgument.Builder(Mutation.o);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.n);
        builder5.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder5.e = listR3;
        e = CollectionsKt.Q(builder5.c());
    }
}
