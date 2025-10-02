package au.com.woolworths.shop.weblink.selections;

import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.WebLink;
import au.com.woolworths.shop.graphql.type.WebLinkCookie;
import au.com.woolworths.shop.graphql.type.WebLinkHeader;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.config.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/weblink/selections/ShopMagicLinksQuerySelections;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopMagicLinksQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12953a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("domain", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder(a.j, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("maxAge", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, new CompiledField.Builder("httpOnly", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("secure", CompiledGraphQL.b(customScalarType2)).c());
        f12953a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField compiledFieldC6 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("cookies", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.f(WebLinkCookie.f12016a));
        builder.e = listR;
        CompiledField compiledFieldC8 = builder.c();
        CompiledField.Builder builder2 = new CompiledField.Builder("headers", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.f(WebLinkHeader.f12017a));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldC8, builder2.c());
        c = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("magicLink", CompiledGraphQL.b(WebLink.f12015a));
        new CompiledArgument.Builder(Query.k1);
        builder3.d = au.com.woolworths.android.onesite.a.v();
        builder3.e = listR3;
        d = CollectionsKt.Q(builder3.c());
    }
}
