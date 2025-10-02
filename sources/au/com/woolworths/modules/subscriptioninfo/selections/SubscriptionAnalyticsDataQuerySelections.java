package au.com.woolworths.modules.subscriptioninfo.selections;

import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.SubscriptionAnalyticsData;
import au.com.woolworths.shop.graphql.type.SubscriptionsInfo;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/subscriptioninfo/selections/SubscriptionAnalyticsDataQuerySelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscriptionAnalyticsDataQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9172a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("subscriptionTypes", CompiledGraphQL.a(customScalarType)).c(), new CompiledField.Builder("subscriptionBillingPeriods", CompiledGraphQL.a(customScalarType)).c(), new CompiledField.Builder("subscriptionAllowedUsageTypes", CompiledGraphQL.a(customScalarType)).c(), new CompiledField.Builder("subscriptionIds", CompiledGraphQL.a(customScalarType)).c(), new CompiledField.Builder("userStatus", CompiledGraphQL.a(customScalarType)).c(), new CompiledField.Builder("userSubscriberTypes", CompiledGraphQL.a(customScalarType)).c());
        f9172a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("SubscriptionAnalyticsData", CollectionsKt.Q("SubscriptionAnalyticsData"));
        builder.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("analyticsData", SubscriptionAnalyticsData.f11944a);
        builder2.e = listR2;
        List listQ = CollectionsKt.Q(builder2.c());
        c = listQ;
        CompiledField.Builder builder3 = new CompiledField.Builder("subscriptions", SubscriptionsInfo.f11945a);
        builder3.e = listQ;
        d = CollectionsKt.Q(builder3.c());
    }
}
