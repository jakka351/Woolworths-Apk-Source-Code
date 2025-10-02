package au.com.woolworths.foundation.shop.editorder.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.EditOrderBanner;
import au.com.woolworths.shop.graphql.type.EditOrderConfirmation;
import au.com.woolworths.shop.graphql.type.EditOrderDetails;
import au.com.woolworths.shop.graphql.type.EditOrderMessage;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.EditOrderStatus;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/selections/EditOrderStatusQuerySelections;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderStatusQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8740a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        f8740a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("buttonTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("confirmation", CompiledGraphQL.b(EditOrderConfirmation.f11366a));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, builder.c());
        b = listR2;
        CompiledField compiledFieldC4 = new CompiledField.Builder("orderId", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("banner", CompiledGraphQL.b(EditOrderBanner.f11364a));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC4, builder2.c());
        c = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("buttonTitle", CompiledGraphQL.b(customScalarType)).c());
        d = listR4;
        EditOrderMode.e.getClass();
        CompiledField compiledFieldC5 = new CompiledField.Builder("mode", CompiledGraphQL.b(EditOrderMode.f)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder(ErrorBundle.DETAIL_ENTRY, EditOrderDetails.f11367a);
        builder3.e = listR3;
        CompiledField compiledFieldC6 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("message", EditOrderMessage.f11370a);
        builder4.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, builder4.c());
        e = listR5;
        CompiledField.Builder builder5 = new CompiledField.Builder("editOrderStatus", CompiledGraphQL.b(EditOrderStatus.f11371a));
        new CompiledArgument.Builder(Query.C2);
        builder5.d = a.v();
        builder5.e = listR5;
        f = CollectionsKt.Q(builder5.c());
    }
}
