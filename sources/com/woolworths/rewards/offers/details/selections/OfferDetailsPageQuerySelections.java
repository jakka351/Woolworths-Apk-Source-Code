package com.woolworths.rewards.offers.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.IconAsset;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.OfferDetailsPageResponse;
import au.com.woolworths.rewards.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.rewards.offers.details.fragment.selections.OfferDetailsPageFragmentSelections;
import com.woolworths.rewards.offers.fragment.fragment.selections.ContentCtaFieldsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/selections/OfferDetailsPageQuerySelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsPageQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20885a;
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
        CompiledFragment.Builder builder = new CompiledFragment.Builder("OfferDetailsPage", CollectionsKt.Q("OfferDetailsPage"));
        builder.b(OfferDetailsPageFragmentSelections.t);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f20885a = listR;
        LocalAssetIconName.e.getClass();
        List listQ = CollectionsKt.Q(new CompiledField.Builder("iconName", CompiledGraphQL.b(LocalAssetIconName.f)).c());
        b = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        c = listQ2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("LocalAsset", CollectionsKt.Q("LocalAsset"));
        builder2.d = listQ;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder3.d = listQ2;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, builder3.a());
        d = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("ContentCta", CollectionsKt.Q("ContentCta"));
        builder4.b(ContentCtaFieldsSelections.b);
        List listR3 = CollectionsKt.R(compiledFieldC3, builder4.a());
        e = listR3;
        CompiledField.Builder builder5 = new CompiledField.Builder("emptyStateIconAsset", IconAsset.f9623a);
        builder5.e = listR2;
        CompiledField compiledFieldC4 = builder5.c();
        CompiledField compiledFieldG = d.g("emptyStateTitle", customScalarType);
        CompiledField compiledFieldG2 = d.g("emptyStateMessage", customScalarType);
        CompiledField.Builder builder6 = new CompiledField.Builder("emptyStateAction", ContentCta.f9485a);
        builder6.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, compiledFieldG, compiledFieldG2, builder6.c());
        f = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("OfferDetailsPage", CollectionsKt.Q("OfferDetailsPage"));
        builder7.d = listR;
        CompiledFragment compiledFragmentA2 = builder7.a();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("RewardsErrorEmptyState", CollectionsKt.Q("RewardsErrorEmptyState"));
        builder8.d = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, compiledFragmentA2, builder8.a());
        g = listR5;
        CompiledField.Builder builder9 = new CompiledField.Builder("offerDetails", CompiledGraphQL.b(OfferDetailsPageResponse.f9686a));
        new CompiledArgument.Builder(Query.j);
        builder9.d = a.v();
        builder9.e = listR5;
        h = CollectionsKt.Q(builder9.c());
    }
}
