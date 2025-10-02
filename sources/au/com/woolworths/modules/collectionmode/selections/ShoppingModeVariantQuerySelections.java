package au.com.woolworths.modules.collectionmode.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariant;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/selections/ShoppingModeVariantQuerySelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeVariantQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9163a;
    public static final List b;

    static {
        ShoppingModeVariantState.e.getClass();
        List listQ = CollectionsKt.Q(new CompiledField.Builder("state", CompiledGraphQL.b(ShoppingModeVariantState.f)).c());
        f9163a = listQ;
        CompiledField.Builder builder = new CompiledField.Builder("shoppingMode", CompiledGraphQL.b(ShoppingModeVariant.f11917a));
        new CompiledArgument.Builder(Query.j1);
        builder.d = a.v();
        builder.e = listQ;
        b = CollectionsKt.Q(builder.c());
    }
}
