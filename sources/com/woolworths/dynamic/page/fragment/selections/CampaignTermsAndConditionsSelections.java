package com.woolworths.dynamic.page.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/selections/CampaignTermsAndConditionsSelections;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CampaignTermsAndConditionsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19300a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f19300a = CollectionsKt.R(new CompiledField.Builder("termsAndConditionsTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("markdownText", CompiledGraphQL.b(customScalarType)).c());
    }
}
