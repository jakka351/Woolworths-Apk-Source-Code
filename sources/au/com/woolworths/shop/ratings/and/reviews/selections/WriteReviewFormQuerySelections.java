package au.com.woolworths.shop.ratings.and.reviews.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.WriteReviewFormResponse;
import au.com.woolworths.shop.graphql.type.WriteReviewFormReviewItem;
import au.com.woolworths.shop.graphql.type.WriteReviewFormSections;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/selections/WriteReviewFormQuerySelections;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WriteReviewFormQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12767a;
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
        List listR = CollectionsKt.R(new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(customScalarType)).c(), d.g("productImage", customScalarType));
        f12767a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("product", CompiledGraphQL.b(ProductCard.f11717a));
        builder.e = listR;
        List listR2 = CollectionsKt.R(builder.c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        c = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        d = listQ2;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("isOptional", CompiledGraphQL.b(customScalarType2)).c();
        CustomScalarType customScalarType3 = GraphQLInt.f11442a;
        List listR3 = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("minCharacterCount", customScalarType3).c(), new CompiledField.Builder("maxCharacterCount", CompiledGraphQL.b(customScalarType3)).c(), d.g("helpText", customScalarType), d.g("placeholderText", customScalarType));
        e = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("isOptional", CompiledGraphQL.b(customScalarType2)).c(), d.g("minCharacterCount", customScalarType3), new CompiledField.Builder("maxCharacterCount", CompiledGraphQL.b(customScalarType3)).c(), d.g("helpText", customScalarType), d.g("placeholderText", customScalarType));
        f = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("isOptional", CompiledGraphQL.b(customScalarType2)).c(), d.g("minCharacterCount", customScalarType3), new CompiledField.Builder("maxCharacterCount", CompiledGraphQL.b(customScalarType3)).c(), d.g("helpText", customScalarType), d.g("placeholderText", customScalarType));
        g = listR5;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("WriteReviewFormReviewItemTitle", CollectionsKt.Q("WriteReviewFormReviewItemTitle"));
        builder2.d = listQ;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("WriteReviewFormRatings", CollectionsKt.Q("WriteReviewFormRatings"));
        builder3.d = listQ2;
        CompiledFragment compiledFragmentA2 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("WriteReviewFormReviewTitle", CollectionsKt.Q("WriteReviewFormReviewTitle"));
        builder4.d = listR3;
        CompiledFragment compiledFragmentA3 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("WriteReviewFormReviewBody", CollectionsKt.Q("WriteReviewFormReviewBody"));
        builder5.d = listR4;
        CompiledFragment compiledFragmentA4 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("WriteReviewFormNameField", CollectionsKt.Q("WriteReviewFormNameField"));
        builder6.d = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, builder6.a());
        h = listR6;
        CompiledField.Builder builder7 = new CompiledField.Builder("items", d.j(WriteReviewFormReviewItem.f12025a));
        builder7.e = listR6;
        List listQ3 = CollectionsKt.Q(builder7.c());
        i = listQ3;
        List listR7 = CollectionsKt.R(d.g("markdownText", customScalarType), d.g("additionalTermsText", customScalarType));
        j = listR7;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("WriteReviewFormTargetProduct", CollectionsKt.Q("WriteReviewFormTargetProduct"));
        builder8.d = listR2;
        CompiledFragment compiledFragmentA5 = builder8.a();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("WriteReviewFormReview", CollectionsKt.Q("WriteReviewFormReview"));
        builder9.d = listQ3;
        CompiledFragment compiledFragmentA6 = builder9.a();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("WriteReviewFormTermsConditions", CollectionsKt.Q("WriteReviewFormTermsConditions"));
        builder10.d = listR7;
        List listR8 = CollectionsKt.R(compiledFieldC4, compiledFragmentA5, compiledFragmentA6, builder10.a());
        k = listR8;
        CompiledField compiledFieldC5 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        List listR9 = CollectionsKt.R(compiledFieldC5, new CompiledField.Builder("style", ButtonStyle.f).c(), new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c(), d.g("altText", customScalarType));
        l = listR9;
        CompiledField compiledFieldC6 = new CompiledField.Builder("pageTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder11 = new CompiledField.Builder("sections", d.j(WriteReviewFormSections.f12028a));
        builder11.e = listR8;
        CompiledField compiledFieldC7 = builder11.c();
        CompiledField.Builder builder12 = new CompiledField.Builder("submitButton", CompiledGraphQL.b(Button.f11080a));
        builder12.e = listR9;
        List listR10 = CollectionsKt.R(compiledFieldC6, compiledFieldC7, builder12.c());
        m = listR10;
        CompiledField.Builder builder13 = new CompiledField.Builder("writeReviewForm", CompiledGraphQL.b(WriteReviewFormResponse.f12022a));
        new CompiledArgument.Builder(Query.g1);
        builder13.d = a.v();
        builder13.e = listR10;
        n = CollectionsKt.Q(builder13.c());
    }
}
