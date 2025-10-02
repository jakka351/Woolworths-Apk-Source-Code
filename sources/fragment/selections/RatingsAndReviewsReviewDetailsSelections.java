package fragment.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsReviewItem;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsReviewItemSections;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/selections/RatingsAndReviewsReviewDetailsSelections;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsReviewDetailsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23836a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("rating", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("maximumRating", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder(TextBundle.TEXT_ENTRY, customScalarType2).c());
        f23836a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c());
        b = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder(TextBundle.TEXT_ENTRY, customScalarType2).c());
        c = listQ2;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("userName", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("createdAt", CompiledGraphQL.b(customScalarType2)).c());
        d = listR2;
        List listQ3 = CollectionsKt.Q(new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType2)).c());
        e = listQ3;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RatingsAndReviewsReviewItemRating", CollectionsKt.Q("RatingsAndReviewsReviewItemRating"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemReviewTitle", CollectionsKt.Q("RatingsAndReviewsReviewItemReviewTitle"));
        builder2.d = listQ;
        CompiledFragment compiledFragmentA2 = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemRecommendation", CollectionsKt.Q("RatingsAndReviewsReviewItemRecommendation"));
        builder3.d = listQ2;
        CompiledFragment compiledFragmentA3 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemInfo", CollectionsKt.Q("RatingsAndReviewsReviewItemInfo"));
        builder4.d = listR2;
        CompiledFragment compiledFragmentA4 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("RatingsAndReviewsReviewItemBody", CollectionsKt.Q("RatingsAndReviewsReviewItemBody"));
        builder5.d = listQ3;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, builder5.a());
        f = listR3;
        CompiledField.Builder builder6 = new CompiledField.Builder("sections", d.j(RatingsAndReviewsReviewItemSections.f11831a));
        builder6.e = listR3;
        List listQ4 = CollectionsKt.Q(builder6.c());
        g = listQ4;
        CompiledField.Builder builder7 = new CompiledField.Builder("items", a.f(RatingsAndReviewsReviewItem.f11825a));
        builder7.e = listQ4;
        h = CollectionsKt.Q(builder7.c());
    }
}
