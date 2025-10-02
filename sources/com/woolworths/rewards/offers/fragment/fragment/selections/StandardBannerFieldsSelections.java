package com.woolworths.rewards.offers.fragment.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/selections/StandardBannerFieldsSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandardBannerFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21039a;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("bannerId", CompiledGraphQL.b(GraphQLID.f9615a)).c();
        CustomScalarType customScalarType = GraphQLString.f9617a;
        f21039a = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("bannerTitle", CompiledGraphQL.b(customScalarType)).c(), d.g("bannerImageUrl", customScalarType), d.g("bannerDescription", customScalarType), d.g("bannerActionUrl", customScalarType), d.g("bannerActionLabel", customScalarType), d.g("bannerActionAccessibilityHint", customScalarType));
    }
}
