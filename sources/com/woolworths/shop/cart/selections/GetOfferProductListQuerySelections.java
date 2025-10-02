package com.woolworths.shop.cart.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.OfferProductListResponse;
import au.com.woolworths.shop.graphql.type.OfferType;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.ProgressStepType;
import au.com.woolworths.shop.graphql.type.ProgressStepper;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.TooltipType;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/selections/GetOfferProductListQuerySelections;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetOfferProductListQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21638a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("currentStep", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("currentStepPosition", CompiledGraphQL.b(customScalarType2)).c();
        ProgressStepType.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("currentStepType", CompiledGraphQL.b(ProgressStepType.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("totalSteps", CompiledGraphQL.b(customScalarType2)).c();
        TooltipType.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("imageName", TooltipType.f).c());
        f21638a = listR;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR2 = CollectionsKt.R(compiledFieldC5, builder.a());
        b = listR2;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder2.b(AnalyticsFieldsSelections.b);
        List listR3 = CollectionsKt.R(compiledFieldC6, builder2.a());
        c = listR3;
        CompiledField compiledFieldC7 = new CompiledField.Builder("isApplied", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("badgeImage", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("progress", CompiledGraphQL.b(ProgressStepper.f11795a));
        builder3.e = listR;
        CompiledField compiledFieldC11 = builder3.c();
        OfferType.e.getClass();
        CompiledField compiledFieldC12 = new CompiledField.Builder("offerType", CompiledGraphQL.b(OfferType.f)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("offerProducts", a.f(ProductCard.f11717a));
        builder4.e = listR2;
        CompiledField compiledFieldC13 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("impressionAnalytics", CompiledGraphQL.b(Analytics.f11028a));
        builder5.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldC11, compiledFieldC12, compiledFieldC13, builder5.c());
        d = listR4;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("errorDescription", CompiledGraphQL.b(customScalarType)).c());
        e = listQ;
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("OfferProductListResponseSuccess", CollectionsKt.Q("OfferProductListResponseSuccess"));
        builder6.d = listR4;
        CompiledFragment compiledFragmentA = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("OfferProductListResponseFailure", CollectionsKt.Q("OfferProductListResponseFailure"));
        builder7.d = listQ;
        List listR5 = CollectionsKt.R(compiledFieldC14, compiledFragmentA, builder7.a());
        f = listR5;
        CompiledField.Builder builder8 = new CompiledField.Builder("getOfferProductList", CompiledGraphQL.b(OfferProductListResponse.f11620a));
        new CompiledArgument.Builder(Query.G2);
        builder8.d = au.com.woolworths.android.onesite.a.v();
        builder8.e = listR5;
        g = CollectionsKt.Q(builder8.c());
    }
}
