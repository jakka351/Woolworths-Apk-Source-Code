package com.woolworths.foundation.rewards.userattribution.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.AnalyticsService;
import au.com.woolworths.rewards.graphql.type.AnalyticsServiceAttributionData;
import au.com.woolworths.rewards.graphql.type.AttributionProperty;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.UserAttribution;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/foundation/rewards/userattribution/selections/UserAttributionQuerySelections;", "", "userattribution-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserAttributionQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20490a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("boolValue", CompiledGraphQL.b(GraphQLBoolean.f9613a)).c();
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c());
        f20490a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("stringValue", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("BoolAttributionProperty", CollectionsKt.Q("BoolAttributionProperty"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("StringAttributionProperty", CollectionsKt.Q("StringAttributionProperty"));
        builder2.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, builder2.a());
        c = listR3;
        AnalyticsService.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("service", CompiledGraphQL.b(AnalyticsService.f)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("properties", d.j(AttributionProperty.f9429a));
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC3, builder3.c());
        d = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder("serviceData", a.f(AnalyticsServiceAttributionData.f9423a));
        builder4.e = listR4;
        List listQ = CollectionsKt.Q(builder4.c());
        e = listQ;
        CompiledField.Builder builder5 = new CompiledField.Builder("userAttribution", CompiledGraphQL.b(UserAttribution.f9940a));
        builder5.e = listQ;
        f = CollectionsKt.Q(builder5.c());
    }
}
