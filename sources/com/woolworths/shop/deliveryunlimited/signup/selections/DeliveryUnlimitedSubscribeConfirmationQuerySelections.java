package com.woolworths.shop.deliveryunlimited.signup.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeConfirmation;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeConfirmationAnalytics;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeConfirmationFeedItem;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/selections/DeliveryUnlimitedSubscribeConfirmationQuerySelections;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeConfirmationQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22670a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", customScalarType).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("iconUrl", customScalarType));
        f22670a = listR;
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.f)).c();
        InsetBannerActionType.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.f)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        b = listR2;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField.Builder builder = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.f11510a);
        builder.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, builder.c());
        c = listR3;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("DeliveryUnlimitedSubscribeConfirmationLineItem", CollectionsKt.Q("DeliveryUnlimitedSubscribeConfirmationLineItem"));
        builder2.d = listR;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder3.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC5, compiledFragmentA, builder3.a());
        d = listR4;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("subscriptionType", CompiledGraphQL.b(customScalarType)).c());
        e = listQ;
        CompiledField.Builder builder4 = new CompiledField.Builder("feed", d.j(DeliveryUnlimitedSubscribeConfirmationFeedItem.f11323a));
        builder4.e = listR4;
        CompiledField compiledFieldC6 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("analytics", CompiledGraphQL.b(DeliveryUnlimitedSubscribeConfirmationAnalytics.f11322a));
        builder5.e = listQ;
        List listR5 = CollectionsKt.R(compiledFieldC6, builder5.c());
        f = listR5;
        CompiledField.Builder builder6 = new CompiledField.Builder("deliveryUnlimitedSubscribeConfirmation", CompiledGraphQL.b(DeliveryUnlimitedSubscribeConfirmation.f11321a));
        builder6.e = listR5;
        g = CollectionsKt.Q(builder6.c());
    }
}
