package au.com.woolworths.shop.receipts.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.ReceiptFeedItem;
import au.com.woolworths.shop.graphql.type.ReceiptListPageInfo;
import au.com.woolworths.shop.graphql.type.ReceiptsList;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/selections/ReceiptsListingQuerySelections;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptsListingQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12878a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        f12878a = listQ;
        List listR = CollectionsKt.R(new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c(), new CompiledField.Builder("displayDate", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("displayValue", CompiledGraphQL.b(customScalarType)).c());
        b = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ReceiptFeedGroupHeader", CollectionsKt.Q("ReceiptFeedGroupHeader"));
        builder.d = listQ;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ReceiptItem", CollectionsKt.Q("ReceiptItem"));
        builder2.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
        c = listR2;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("nextPage", GraphQLInt.f11442a).c());
        d = listQ2;
        CompiledField.Builder builder3 = new CompiledField.Builder("items", d.j(ReceiptFeedItem.f11851a));
        builder3.e = listR2;
        CompiledField compiledFieldC2 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("pageInfo", CompiledGraphQL.b(ReceiptListPageInfo.f11853a));
        builder4.e = listQ2;
        List listR3 = CollectionsKt.R(compiledFieldC2, builder4.c());
        e = listR3;
        CompiledField.Builder builder5 = new CompiledField.Builder("receipts", ReceiptsList.f11854a);
        new CompiledArgument.Builder(Query.i1);
        builder5.d = a.v();
        builder5.e = listR3;
        f = CollectionsKt.Q(builder5.c());
    }
}
