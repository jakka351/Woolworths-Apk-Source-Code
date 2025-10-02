package au.com.woolworths.foundation.wxid.shop.selections;

import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.WXIDDetails;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/wxid/shop/selections/WxidDetailsQuerySelections;", "", "wxid-data-shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WxidDetailsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8945a;
    public static final List b;

    static {
        List listR = CollectionsKt.R(new CompiledField.Builder("wxid", GraphQLString.f11443a).c(), new CompiledField.Builder("nextFetchTime", CompiledGraphQL.b(GraphQLFloat.f11440a)).c());
        f8945a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("wxidDetails", CompiledGraphQL.b(WXIDDetails.f12014a));
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
