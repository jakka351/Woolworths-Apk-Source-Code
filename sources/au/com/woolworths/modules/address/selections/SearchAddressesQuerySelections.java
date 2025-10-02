package au.com.woolworths.modules.address.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AddressItem;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/selections/SearchAddressesQuerySelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchAddressesQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9079a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("id", customScalarType).c(), d.g(TextBundle.TEXT_ENTRY, customScalarType), d.g("postcode", customScalarType));
        f9079a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("searchAddresses", CompiledGraphQL.a(AddressItem.f11013a));
        new CompiledArgument.Builder(Query.F2);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
