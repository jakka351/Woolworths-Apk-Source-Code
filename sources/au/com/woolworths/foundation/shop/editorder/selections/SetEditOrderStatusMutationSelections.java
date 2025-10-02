package au.com.woolworths.foundation.shop.editorder.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.EditOrderMode;
import au.com.woolworths.shop.graphql.type.EditOrderReason;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.SetEditOrderStatusResponse;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/selections/SetEditOrderStatusMutationSelections;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SetEditOrderStatusMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8741a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        EditOrderReason.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("reason", EditOrderReason.f).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("message", GraphQLString.f11443a).c();
        EditOrderMode.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, new CompiledField.Builder("currentMode", CompiledGraphQL.b(EditOrderMode.f)).c());
        f8741a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("setEditOrderStatus", CompiledGraphQL.b(SetEditOrderStatusResponse.f11893a));
        new CompiledArgument.Builder(Mutation.C0);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
