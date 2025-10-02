package au.com.woolworths.modules.address.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.Address;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/selections/SaveAddressMutationSelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaveAddressMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9078a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("isPrimary", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), new CompiledField.Builder("postalCode", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("street1", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("street2", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("suburbId", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("suburbName", CompiledGraphQL.b(customScalarType2)).c());
        f9078a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("saveAddress", Address.f11011a);
        new CompiledArgument.Builder(Mutation.E0);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
