package com.woolworths.rewards.offers.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.OffersSections;
import au.com.woolworths.rewards.graphql.type.RewardsErrorDialog;
import au.com.woolworths.rewards.graphql.type.RewardsOffersHeader;
import au.com.woolworths.rewards.graphql.type.RewardsSummaryContent;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.rewards.offers.fragment.fragment.selections.ContentCtaFieldsSelections;
import com.woolworths.rewards.offers.fragment.fragment.selections.OffersSectionsFragmentSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/selections/RewardsHomeOfferFeedFieldsSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsHomeOfferFeedFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21041a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        f21041a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ContentCta", CollectionsKt.Q("ContentCta"));
        List list = ContentCtaFieldsSelections.b;
        builder.b(list);
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("RewardsSummaryText", CollectionsKt.Q("RewardsSummaryText"));
        builder2.d = listQ;
        List listR = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
        b = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder(ErrorBundle.SUMMARY_ENTRY, RewardsSummaryContent.f9873a);
        builder3.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder3.c());
        c = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("ContentCta", CollectionsKt.Q("ContentCta"));
        builder4.d = list;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder4.a());
        d = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ContentCta", CollectionsKt.Q("ContentCta"));
        builder5.d = list;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder5.a());
        e = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g(lqlqqlq.mmm006Dm006Dm, customScalarType);
        ObjectType objectType = ContentCta.f9485a;
        CompiledField.Builder builder6 = new CompiledField.Builder("primaryCta", objectType);
        builder6.e = listR3;
        CompiledField compiledFieldC6 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("secondaryCta", objectType);
        builder7.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, compiledFieldG, compiledFieldC6, builder7.c());
        f = listR5;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("OffersSections", CollectionsKt.R("StandardOffersSection", "ProductOffersSection", "OnboardingBanner", "StandardBanner", "SpinSurpriseBanner", "OfferFeedInlineBanner", "PersonalisedOffersBanner", "RewardsCtaCard", "MandyBanner", "NoOffersCard"));
        builder8.b(OffersSectionsFragmentSelections.r);
        List listR6 = CollectionsKt.R(compiledFieldC7, builder8.a());
        g = listR6;
        CompiledField.Builder builder9 = new CompiledField.Builder("header", RewardsOffersHeader.f9845a);
        builder9.e = listR2;
        CompiledField compiledFieldC8 = builder9.c();
        CompiledField.Builder builder10 = new CompiledField.Builder("errorMessage", RewardsErrorDialog.f9826a);
        builder10.e = listR5;
        CompiledField compiledFieldC9 = builder10.c();
        CompiledField.Builder builder11 = new CompiledField.Builder("sections", d.j(OffersSections.f9698a));
        builder11.e = listR6;
        CompiledField compiledFieldC10 = builder11.c();
        CompiledField compiledFieldG2 = d.g("onLoadDeepLinkUrl", customScalarType);
        CustomScalarType customScalarType2 = GraphQLBoolean.f9613a;
        h = CollectionsKt.R(compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldG2, new CompiledField.Builder("eligibleForOnboardingBanner", customScalarType2).c(), new CompiledField.Builder("isAutoBoostEnabled", CompiledGraphQL.b(customScalarType2)).c());
    }
}
