package com.woolworths.rewards.offers.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsOfferResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.rewards.offers.fragment.fragment.selections.OfferDetailsFragmentSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/selections/OfferDetailsScreenQuerySelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsScreenQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21048a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RewardsOfferBase", CollectionsKt.R("PreactivatedRewardsOffer", "RewardsOffer"));
        builder.b(OfferDetailsFragmentSelections.j);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21048a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("cta", ContentCta.f9485a);
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder2.c());
        c = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("RewardsOffer", CollectionsKt.Q("RewardsOffer"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("RewardsOfferUnknown", CollectionsKt.Q("RewardsOfferUnknown"));
        builder4.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, compiledFragmentA, builder4.a());
        d = listR4;
        CompiledField.Builder builder5 = new CompiledField.Builder("rewardsOfferDetails", RewardsOfferResponse.f9842a);
        new CompiledArgument.Builder(Query.x);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.w);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.y);
        builder5.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder5.e = listR4;
        e = CollectionsKt.Q(builder5.c());
    }
}
