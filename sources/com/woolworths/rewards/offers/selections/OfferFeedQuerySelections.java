package com.woolworths.rewards.offers.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLFloat;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.OfferFeed;
import au.com.woolworths.rewards.graphql.type.PersonalisedOffersPage;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsBalance;
import au.com.woolworths.rewards.graphql.type.RewardsOffer;
import au.com.woolworths.rewards.graphql.type.RewardsPage;
import au.com.woolworths.rewards.graphql.type.RewardsPointsBalance;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/selections/OfferFeedQuerySelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferFeedQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21049a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLInt.f9616a;
        CompiledField compiledFieldC = new CompiledField.Builder("pointsBalance", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("creditsBalance", customScalarType);
        CompiledField compiledFieldC2 = new CompiledField.Builder("redemptionPercentage", CompiledGraphQL.b(GraphQLFloat.f9614a)).c();
        CustomScalarType customScalarType2 = GraphQLString.f9617a;
        CompiledField compiledFieldC3 = new CompiledField.Builder("displayMessage", CompiledGraphQL.b(customScalarType2)).c();
        CustomScalarType customScalarType3 = GraphQLBoolean.f9613a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldG, compiledFieldC2, compiledFieldC3, new CompiledField.Builder("showStatusMark", customScalarType3).c(), d.g("statusMarkUrl", customScalarType2));
        f21049a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("pointsBalance", CompiledGraphQL.b(RewardsPointsBalance.f9854a));
        builder.e = listR;
        List listQ = CollectionsKt.Q(builder.c());
        b = listQ;
        CompiledField.Builder builder2 = new CompiledField.Builder("balance", CompiledGraphQL.b(RewardsBalance.f9806a));
        builder2.e = listQ;
        List listQ2 = CollectionsKt.Q(builder2.c());
        c = listQ2;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("OfferFeed", CollectionsKt.Q("OfferFeed"));
        builder3.b(RewardsOfferFeedFieldsSelections.o);
        List listR2 = CollectionsKt.R(compiledFieldC4, builder3.a());
        d = listR2;
        List listQ3 = CollectionsKt.Q(new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType2)).c());
        e = listQ3;
        CompiledField.Builder builder4 = new CompiledField.Builder("offers", a.f(RewardsOffer.f9835a));
        builder4.e = listQ3;
        List listR3 = CollectionsKt.R(builder4.c(), new CompiledField.Builder("hasBoostedOffers", CompiledGraphQL.b(customScalarType3)).c(), new CompiledField.Builder("swapEnabled", CompiledGraphQL.b(customScalarType3)).c());
        f = listR3;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("AvailablePersonalisedOffers", CollectionsKt.Q("AvailablePersonalisedOffers"));
        builder5.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC5, builder5.a());
        g = listR4;
        CompiledField.Builder builder6 = new CompiledField.Builder("rewardsHomePage", RewardsPage.f9849a);
        builder6.e = listQ2;
        CompiledField compiledFieldC6 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("rewardsOfferFeed", OfferFeed.f9694a);
        new CompiledArgument.Builder(Query.o);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.n);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.m);
        builder7.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder7.e = listR2;
        CompiledField compiledFieldC7 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("personalisedOffers", CompiledGraphQL.b(PersonalisedOffersPage.f9738a));
        new CompiledArgument.Builder(Query.l);
        builder8.d = au.com.woolworths.android.onesite.a.v();
        builder8.e = listR4;
        h = CollectionsKt.R(compiledFieldC6, compiledFieldC7, builder8.c());
    }
}
