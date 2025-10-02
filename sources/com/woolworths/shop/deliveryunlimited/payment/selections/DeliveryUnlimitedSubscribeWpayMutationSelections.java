package com.woolworths.shop.deliveryunlimited.payment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscriptionWpayResponse;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/selections/DeliveryUnlimitedSubscribeWpayMutationSelections;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeWpayMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22608a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder.b(AnalyticsFieldsSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f22608a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldG = d.g("message", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("errorAnalytics", Analytics.f11028a);
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder2.c());
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("deliveryUnlimitedSubscribeWpay", CompiledGraphQL.b(DeliveryUnlimitedSubscriptionWpayResponse.f11343a));
        new CompiledArgument.Builder(Mutation.d);
        builder3.d = a.v();
        builder3.e = listR2;
        c = CollectionsKt.Q(builder3.c());
    }
}
