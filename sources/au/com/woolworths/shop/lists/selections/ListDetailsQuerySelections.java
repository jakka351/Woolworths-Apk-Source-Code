package au.com.woolworths.shop.lists.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ListDetailsProductAction;
import au.com.woolworths.shop.graphql.type.ListDetailsResponse;
import au.com.woolworths.shop.graphql.type.ListDetailsTotal;
import au.com.woolworths.shop.graphql.type.ListDetailsTotalDisclaimer;
import au.com.woolworths.shop.graphql.type.ListDetailsTotalOverview;
import au.com.woolworths.shop.graphql.type.ListDetailsTotalSectionSubItem;
import au.com.woolworths.shop.graphql.type.ListDetailsTotalSummary;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/selections/ListDetailsQuerySelections;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12298a;
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

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c());
        f12298a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c(), d.g("imageUrl", customScalarType));
        c = listR3;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ListDetailsTotalSectionHeader", CollectionsKt.Q("ListDetailsTotalSectionHeader"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ListDetailsPotentialSavings", CollectionsKt.Q("ListDetailsPotentialSavings"));
        builder2.d = listR2;
        CompiledFragment compiledFragmentA2 = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ListDetailsRewardsSummary", CollectionsKt.Q("ListDetailsRewardsSummary"));
        builder3.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC, compiledFragmentA, compiledFragmentA2, builder3.a());
        d = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder("sections", d.j(ListDetailsTotalSectionSubItem.f11532a));
        builder4.e = listR4;
        List listQ = CollectionsKt.Q(builder4.c());
        e = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        f = listQ2;
        List listR5 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        g = listR5;
        CompiledField.Builder builder5 = new CompiledField.Builder(ErrorBundle.SUMMARY_ENTRY, ListDetailsTotalSummary.f11534a);
        builder5.e = listQ;
        CompiledField compiledFieldC2 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("disclaimer", ListDetailsTotalDisclaimer.f11528a);
        builder6.e = listQ2;
        CompiledField compiledFieldC3 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("overview", ListDetailsTotalOverview.f11529a);
        builder7.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder7.c());
        h = listR6;
        List listR7 = CollectionsKt.R(new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        i = listR7;
        CompiledField.Builder builder8 = new CompiledField.Builder("total", ListDetailsTotal.f11527a);
        builder8.e = listR6;
        CompiledField compiledFieldC4 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("productActions", CompiledGraphQL.a(CompiledGraphQL.b(ListDetailsProductAction.f11524a)));
        builder9.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldC4, builder9.c());
        j = listR8;
        CompiledField.Builder builder10 = new CompiledField.Builder("listDetails", CompiledGraphQL.b(ListDetailsResponse.f11525a));
        new CompiledArgument.Builder(Query.A);
        builder10.d = a.v();
        builder10.e = listR8;
        k = CollectionsKt.Q(builder10.c());
    }
}
