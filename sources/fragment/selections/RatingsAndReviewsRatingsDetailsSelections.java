package fragment.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Link;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsRatingDistribution;
import au.com.woolworths.shop.graphql.type.RatingsDistributionItem;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/selections/RatingsAndReviewsRatingsDetailsSelections;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsRatingsDetailsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23835a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        f23835a = listR;
        ActionType.e.getClass();
        EnumType enumType = ActionType.f;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(enumType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        CompiledField compiledFieldG = d.g("linkId", customScalarType);
        ObjectType objectType = Action.f10997a;
        CompiledField.Builder builder = new CompiledField.Builder("linkAction", CompiledGraphQL.b(objectType));
        builder.e = listR2;
        CompiledField compiledFieldC = builder.c();
        ObjectType objectType2 = TextWithAlt.f11967a;
        CompiledField.Builder builder2 = new CompiledField.Builder("linkTextWithAlt", CompiledGraphQL.b(objectType2));
        builder2.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldG, compiledFieldC, builder2.c());
        d = listR4;
        CustomScalarType customScalarType2 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("averageRating", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("displayRatings", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("ratingText", CompiledGraphQL.b(objectType2));
        builder3.e = listR;
        CompiledField compiledFieldC4 = builder3.c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("maximumRating", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("totalReviewsText", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("cta", Link.f11514a);
        builder4.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, builder4.c());
        e = listR5;
        List listR6 = CollectionsKt.R(new CompiledField.Builder("ratingScore", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("percentage", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("ratingCount", CompiledGraphQL.b(customScalarType)).c());
        f = listR6;
        CompiledField.Builder builder5 = new CompiledField.Builder("items", a.f(RatingsDistributionItem.f11832a));
        builder5.e = listR6;
        List listQ = CollectionsKt.Q(builder5.c());
        g = listQ;
        List listR7 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(enumType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        h = listR7;
        CompiledField compiledFieldG2 = d.g("buttonId", customScalarType);
        CompiledField compiledFieldC7 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("buttonAction", objectType);
        builder6.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldG2, compiledFieldC7, compiledFieldC8, builder6.c(), d.g("iconUrl", customScalarType), d.g("altText", customScalarType));
        i = listR8;
        CompiledField.Builder builder7 = new CompiledField.Builder("button", CompiledGraphQL.b(Button.f11080a));
        builder7.e = listR8;
        List listQ2 = CollectionsKt.Q(builder7.c());
        j = listQ2;
        CompiledField compiledFieldC9 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("RatingsAndReviewsRatingDistributionOverview", CollectionsKt.Q("RatingsAndReviewsRatingDistributionOverview"));
        builder8.d = listR5;
        CompiledFragment compiledFragmentA = builder8.a();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("RatingsAndReviewsRatingDistributionDetails", CollectionsKt.Q("RatingsAndReviewsRatingDistributionDetails"));
        builder9.d = listQ;
        CompiledFragment compiledFragmentA2 = builder9.a();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("RatingsAndReviewsRatingDistributionWriteReview", CollectionsKt.Q("RatingsAndReviewsRatingDistributionWriteReview"));
        builder10.d = listQ2;
        List listR9 = CollectionsKt.R(compiledFieldC9, compiledFragmentA, compiledFragmentA2, builder10.a());
        k = listR9;
        CompiledField.Builder builder11 = new CompiledField.Builder("sections", d.j(RatingsAndReviewsRatingDistribution.f11819a));
        builder11.e = listR9;
        l = CollectionsKt.Q(builder11.c());
    }
}
