package au.com.woolworths.shop.aem.components.offercard.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ImageWithAlt;
import au.com.woolworths.shop.graphql.type.OfferCardPriceInfo;
import au.com.woolworths.shop.graphql.type.OfferCardTextColor;
import au.com.woolworths.shop.graphql.type.OfferCardVariant;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/offercard/fragment/selections/OfferCardSelections;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferCardSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10199a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        f10199a = listR;
        List listR2 = CollectionsKt.R(d.g("offerCardPriceInfoPriceDollars", customScalarType), d.g("offerCardPriceInfoPriceCents", customScalarType), d.g("offerCardPriceInfoPrefix1", customScalarType), d.g("offerCardPriceInfoPrefix2", customScalarType), d.g("offerCardPriceInfoSuffix", customScalarType));
        b = listR2;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        List list = AnalyticsFieldsSelections.b;
        builder.b(list);
        List listR3 = CollectionsKt.R(compiledFieldC, builder.a());
        c = listR3;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder2.d = list;
        List listR4 = CollectionsKt.R(compiledFieldC2, builder2.a());
        d = listR4;
        CompiledField compiledFieldC3 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = Analytics.f11028a;
        CompiledField.Builder builder3 = new CompiledField.Builder("analytics", objectType);
        builder3.e = listR4;
        CompiledField compiledFieldC4 = builder3.c();
        ActionType.e.getClass();
        List listR5 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c());
        e = listR5;
        CompiledField compiledFieldC5 = new CompiledField.Builder("offerCardImageUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("offerCardTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("offerCardDescription", customScalarType);
        CompiledField.Builder builder4 = new CompiledField.Builder("offerCardBadgeImage", ImageWithAlt.f11487a);
        builder4.e = listR;
        CompiledField compiledFieldC7 = builder4.c();
        OfferCardTextColor.e.getClass();
        CompiledField compiledFieldC8 = new CompiledField.Builder("offerCardTextColor", CompiledGraphQL.b(OfferCardTextColor.f)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("offerCardTextBackgroundColor", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder5 = new CompiledField.Builder("offerCardPriceInfo", OfferCardPriceInfo.f11619a);
        builder5.e = listR2;
        CompiledField compiledFieldC10 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("offerCardAnalytics", objectType);
        builder6.e = listR3;
        CompiledField compiledFieldC11 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("offerCardAction", Action.f10997a);
        builder7.e = listR5;
        CompiledField compiledFieldC12 = builder7.c();
        OfferCardVariant.e.getClass();
        f = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldG, compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldC11, compiledFieldC12, new CompiledField.Builder("offerCardVariant", OfferCardVariant.f).c());
    }

    public static List a() {
        return f;
    }
}
