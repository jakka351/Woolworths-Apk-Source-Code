package com.woolworths.rewards.offers.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.OffersSections;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsCtaFooter;
import au.com.woolworths.rewards.graphql.type.RewardsEmptyState;
import au.com.woolworths.rewards.graphql.type.RewardsOffersListPage;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.rewards.offers.fragment.fragment.selections.OffersSectionsFragmentSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/selections/OfferListPageQuerySelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferListPageQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21050a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("OffersSections", CollectionsKt.R("StandardOffersSection", "ProductOffersSection", "OnboardingBanner", "StandardBanner", "SpinSurpriseBanner", "OfferFeedInlineBanner", "PersonalisedOffersBanner", "RewardsCtaCard", "MandyBanner", "NoOffersCard"));
        builder.b(OffersSectionsFragmentSelections.r);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21050a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("isExternalUrl", GraphQLBoolean.f9613a).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("cta", CompiledGraphQL.b(ContentCta.f9485a));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(builder2.c(), d.g("title", customScalarType));
        c = listR3;
        CompiledField compiledFieldG = d.g("navigationTitle", customScalarType);
        CompiledField.Builder builder3 = new CompiledField.Builder("sections", d.j(OffersSections.f9698a));
        builder3.e = listR;
        CompiledField compiledFieldC2 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("footer", RewardsCtaFooter.f9813a);
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldG, compiledFieldC2, builder4.c());
        d = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        e = listR5;
        CompiledField compiledFieldG2 = d.g("navigationTitle", customScalarType);
        CompiledField.Builder builder5 = new CompiledField.Builder("state", CompiledGraphQL.b(RewardsEmptyState.f9825a));
        builder5.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldG2, builder5.c());
        f = listR6;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("RewardsOffersSection", CollectionsKt.Q("RewardsOffersSection"));
        builder6.d = listR4;
        CompiledFragment compiledFragmentA = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("RewardsEmptyPage", CollectionsKt.Q("RewardsEmptyPage"));
        builder7.d = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, builder7.a());
        g = listR7;
        CompiledField.Builder builder8 = new CompiledField.Builder("rewardsOffersListPage", RewardsOffersListPage.f9846a);
        new CompiledArgument.Builder(Query.p);
        builder8.d = a.v();
        builder8.e = listR7;
        h = CollectionsKt.Q(builder8.c());
    }
}
