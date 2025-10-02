package au.com.woolworths.shop.ratings.and.reviews.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Link;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsDetailsResponse;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsPageInfo;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsReviewItem;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsReviewItemSections;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import fragment.selections.RatingsAndReviewsRatingsDetailsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/selections/ProductRatingsAndReviewsDetailsQuerySelections;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductRatingsAndReviewsDetailsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12765a;
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
    public static final List m;
    public static final List n;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RatingsAndReviewsRatingsDetails", CollectionsKt.Q("RatingsAndReviewsRatingsDetails"));
        builder.b(RatingsAndReviewsRatingsDetailsSelections.l);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f12765a = listR;
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("rating", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("maximumRating", CompiledGraphQL.b(customScalarType2)).c(), d.g(TextBundle.TEXT_ENTRY, customScalarType));
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        c = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder(TextBundle.TEXT_ENTRY, customScalarType).c());
        d = listQ2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("userName", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("createdAt", CompiledGraphQL.b(customScalarType)).c());
        e = listR3;
        List listQ3 = CollectionsKt.Q(new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        f = listQ3;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemRating", CollectionsKt.Q("RatingsAndReviewsReviewItemRating"));
        builder2.d = listR2;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemReviewTitle", CollectionsKt.Q("RatingsAndReviewsReviewItemReviewTitle"));
        builder3.d = listQ;
        CompiledFragment compiledFragmentA2 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemRecommendation", CollectionsKt.Q("RatingsAndReviewsReviewItemRecommendation"));
        builder4.d = listQ2;
        CompiledFragment compiledFragmentA3 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemInfo", CollectionsKt.Q("RatingsAndReviewsReviewItemInfo"));
        builder5.d = listR3;
        CompiledFragment compiledFragmentA4 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemBody", CollectionsKt.Q("RatingsAndReviewsReviewItemBody"));
        builder6.d = listQ3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, builder6.a());
        g = listR4;
        CompiledField.Builder builder7 = new CompiledField.Builder("sections", d.j(RatingsAndReviewsReviewItemSections.f11831a));
        builder7.e = listR4;
        List listQ4 = CollectionsKt.Q(builder7.c());
        h = listQ4;
        ActionType.e.getClass();
        List listR5 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        i = listR5;
        List listR6 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        j = listR6;
        CompiledField compiledFieldG = d.g("linkId", customScalarType);
        CompiledField.Builder builder8 = new CompiledField.Builder("linkAction", CompiledGraphQL.b(Action.f10997a));
        builder8.e = listR5;
        CompiledField compiledFieldC3 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("linkTextWithAlt", CompiledGraphQL.b(TextWithAlt.f11967a));
        builder9.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldG, compiledFieldC3, builder9.c());
        k = listR7;
        List listQ5 = CollectionsKt.Q(new CompiledField.Builder("nextPage", customScalarType2).c());
        l = listQ5;
        CompiledField.Builder builder10 = new CompiledField.Builder("ratings", RatingsAndReviewsRatingsDetails.f11823a);
        builder10.e = listR;
        CompiledField compiledFieldC4 = builder10.c();
        CompiledField.Builder builder11 = new CompiledField.Builder("reviews", a.f(RatingsAndReviewsReviewItem.f11825a));
        builder11.e = listQ4;
        CompiledField compiledFieldC5 = builder11.c();
        CompiledField.Builder builder12 = new CompiledField.Builder("cta", Link.f11514a);
        builder12.e = listR7;
        CompiledField compiledFieldC6 = builder12.c();
        CompiledField.Builder builder13 = new CompiledField.Builder("pageInfo", RatingsAndReviewsPageInfo.f11814a);
        builder13.e = listQ5;
        List listR8 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, builder13.c());
        m = listR8;
        CompiledField.Builder builder14 = new CompiledField.Builder("productRatingsAndReviewsDetails", RatingsAndReviewsDetailsResponse.f11813a);
        new CompiledArgument.Builder(Query.e1);
        builder14.d = au.com.woolworths.android.onesite.a.v();
        builder14.e = listR8;
        n = CollectionsKt.Q(builder14.c());
    }
}
