package com.woolworths.rewards.offers.fragment.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.Analytics;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.sdui.rewards.fragment.selections.AnalyticsFieldsSelections;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/selections/ContentCtaFieldsSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCtaFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21036a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder.b(AnalyticsFieldsSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21036a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("url", customScalarType);
        CompiledField compiledFieldC3 = new CompiledField.Builder("isExternalUrl", GraphQLBoolean.f9613a).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("onCtaClickAnalytics", Analytics.f9421a);
        builder2.e = listR;
        b = CollectionsKt.R(compiledFieldC2, compiledFieldG, compiledFieldC3, builder2.c());
    }
}
