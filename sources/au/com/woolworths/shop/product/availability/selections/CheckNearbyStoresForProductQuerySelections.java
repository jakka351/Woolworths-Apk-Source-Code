package au.com.woolworths.shop.product.availability.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GeoInfo;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.StoreAddress;
import au.com.woolworths.shop.graphql.type.StoreProductAvailability;
import au.com.woolworths.shop.graphql.type.StoreProductAvailabilityList;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/availability/selections/CheckNearbyStoresForProductQuerySelections;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckNearbyStoresForProductQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12548a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("line1", CompiledGraphQL.b(customScalarType)).c());
        f12548a = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("distance", GraphQLFloat.f11440a).c());
        b = listQ2;
        CompiledField compiledFieldC = new CompiledField.Builder("storeId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("address", CompiledGraphQL.b(StoreAddress.f11934a));
        builder.e = listQ;
        CompiledField compiledFieldC3 = builder.c();
        CompiledField.Builder builder2 = new CompiledField.Builder("geo", CompiledGraphQL.b(GeoInfo.f11429a));
        builder2.e = listQ2;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, builder2.c(), new CompiledField.Builder("isProductAvailable", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        c = listR;
        CompiledField.Builder builder3 = new CompiledField.Builder("stores", a.f(StoreProductAvailability.f11935a));
        builder3.e = listR;
        List listQ3 = CollectionsKt.Q(builder3.c());
        d = listQ3;
        CompiledField.Builder builder4 = new CompiledField.Builder("checkNearbyStoresForProduct", StoreProductAvailabilityList.f11936a);
        new CompiledArgument.Builder(Query.l1);
        builder4.d = au.com.woolworths.android.onesite.a.v();
        builder4.e = listQ3;
        e = CollectionsKt.Q(builder4.c());
    }
}
