package au.com.woolworths.modules.address.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/address/selections/DeleteAddressMutationSelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeleteAddressMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9076a;

    static {
        CompiledField.Builder builder = new CompiledField.Builder("deleteAddress", GraphQLBoolean.f11439a);
        new CompiledArgument.Builder(Mutation.D0);
        builder.d = a.v();
        f9076a = CollectionsKt.Q(builder.c());
    }
}
