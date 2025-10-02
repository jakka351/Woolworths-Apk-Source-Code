package au.com.woolworths.foundation.shop.nhp.datasource.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.BoostEdrOfferResponse;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.RtlBoostState;
import au.com.woolworths.shop.graphql.type.RtlOfferStatus;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/selections/BoostEdrOfferMutationSelections;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostEdrOfferMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8776a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        ActionType.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        f8776a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        List list = AnalyticsFieldsSelections.b;
        builder.b(list);
        List listR3 = CollectionsKt.R(compiledFieldC2, builder.a());
        c = listR3;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("offerType", customScalarType);
        CompiledField compiledFieldC5 = new CompiledField.Builder("linkedEdrHashCrn", CompiledGraphQL.b(customScalarType)).c();
        RtlBoostState.e.getClass();
        CompiledField compiledFieldC6 = new CompiledField.Builder("offerBoostState", RtlBoostState.f).c();
        RtlOfferStatus.e.getClass();
        CompiledField compiledFieldC7 = new CompiledField.Builder("offerStatus", RtlOfferStatus.f).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("offerButtonAction", Action.f10997a);
        builder2.e = listR;
        CompiledField compiledFieldC8 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("offerButtonLabel", TextWithAlt.f11967a);
        builder3.e = listR2;
        CompiledField compiledFieldC9 = builder3.c();
        ObjectType objectType = Analytics.f11028a;
        CompiledField.Builder builder4 = new CompiledField.Builder("analytics", objectType);
        builder4.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldG, compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldC9, builder4.c());
        d = listR4;
        CompiledField compiledFieldC10 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder5.d = list;
        List listR5 = CollectionsKt.R(compiledFieldC10, builder5.a());
        e = listR5;
        CompiledField compiledFieldC11 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder6.d = list;
        List listR6 = CollectionsKt.R(compiledFieldC11, builder6.a());
        f = listR6;
        CompiledField compiledFieldC12 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC13 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC14 = new CompiledField.Builder("eventSource", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder7 = new CompiledField.Builder("analytics", objectType);
        builder7.e = listR5;
        CompiledField compiledFieldC15 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("impressionAnalytics", objectType);
        builder8.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC12, compiledFieldC13, compiledFieldC14, compiledFieldC15, builder8.c());
        g = listR7;
        CompiledField compiledFieldC16 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("EdrOffer", CollectionsKt.Q("EdrOffer"));
        builder9.d = listR4;
        CompiledFragment compiledFragmentA = builder9.a();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("SnackBar", CollectionsKt.Q("SnackBar"));
        builder10.d = listR7;
        List listR8 = CollectionsKt.R(compiledFieldC16, compiledFragmentA, builder10.a());
        h = listR8;
        CompiledField.Builder builder11 = new CompiledField.Builder("boostEdrOffer", CompiledGraphQL.b(BoostEdrOfferResponse.f11049a));
        new CompiledArgument.Builder(Mutation.b);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.f11604a);
        builder11.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder11.e = listR8;
        i = CollectionsKt.Q(builder11.c());
    }
}
