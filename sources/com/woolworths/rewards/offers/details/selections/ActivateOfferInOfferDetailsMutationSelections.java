package com.woolworths.rewards.offers.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import au.com.woolworths.rewards.graphql.type.OfferDetailsMutationResponse;
import au.com.woolworths.rewards.graphql.type.OfferDetailsPage;
import au.com.woolworths.rewards.graphql.type.RewardsOfferBase;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.rewards.offers.details.fragment.selections.OfferDetailsPageFragmentSelections;
import com.woolworths.rewards.offers.fragment.selections.RewardsOfferFieldsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/selections/ActivateOfferInOfferDetailsMutationSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivateOfferInOfferDetailsMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20884a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RewardsOffer", CollectionsKt.Q("RewardsOffer"));
        builder.b(RewardsOfferFieldsSelections.q);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f20884a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("OfferDetailsPage", CollectionsKt.Q("OfferDetailsPage"));
        builder2.b(OfferDetailsPageFragmentSelections.t);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("rewardsOffer", CompiledGraphQL.b(RewardsOfferBase.f9838a));
        builder3.e = listR;
        CompiledField compiledFieldC3 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("offerDetailsPage", CompiledGraphQL.b(OfferDetailsPage.f9684a));
        builder4.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder4.c());
        c = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("OfferDetailsMutationResult", CollectionsKt.Q("OfferDetailsMutationResult"));
        builder5.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder5.a());
        d = listR4;
        CompiledField.Builder builder6 = new CompiledField.Builder("activateOfferInOfferDetails", CompiledGraphQL.b(OfferDetailsMutationResponse.f9682a));
        new CompiledArgument.Builder(Mutation.j);
        builder6.d = a.v();
        builder6.e = listR4;
        e = CollectionsKt.Q(builder6.c());
    }
}
