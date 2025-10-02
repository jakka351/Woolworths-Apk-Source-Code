package com.woolworths.feature.shop.wpay.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.UnlinkCreditCardResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/selections/UnlinkCreditCardMutationSelections;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlinkCreditCardMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20475a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        List listQ = CollectionsKt.Q(new CompiledField.Builder("_", GraphQLBoolean.f11439a).c());
        f20475a = listQ;
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        List list = AnalyticsFieldsSelections.b;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("errorTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("errorButton", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = Analytics.f11028a;
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", CompiledGraphQL.b(objectType));
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, builder2.c());
        c = listR2;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder3.d = list;
        List listR3 = CollectionsKt.R(compiledFieldC5, builder3.a());
        d = listR3;
        CompiledField compiledFieldC6 = new CompiledField.Builder("errorMessage", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("analytics", CompiledGraphQL.b(objectType));
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC6, builder4.c());
        e = listR4;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("UnlinkCreditCardSuccess", CollectionsKt.Q("UnlinkCreditCardSuccess"));
        builder5.d = listQ;
        CompiledFragment compiledFragmentA = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("UnlinkCreditCardValidationFailure", CollectionsKt.Q("UnlinkCreditCardValidationFailure"));
        builder6.d = listR2;
        CompiledFragment compiledFragmentA2 = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("UnlinkCreditCardFailure", CollectionsKt.Q("UnlinkCreditCardFailure"));
        builder7.d = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC7, compiledFragmentA, compiledFragmentA2, builder7.a());
        f = listR5;
        CompiledField.Builder builder8 = new CompiledField.Builder("unlinkCreditCard", CompiledGraphQL.b(UnlinkCreditCardResponse.f11982a));
        new CompiledArgument.Builder(Mutation.S);
        builder8.d = a.v();
        builder8.e = listR5;
        g = CollectionsKt.Q(builder8.c());
    }
}
