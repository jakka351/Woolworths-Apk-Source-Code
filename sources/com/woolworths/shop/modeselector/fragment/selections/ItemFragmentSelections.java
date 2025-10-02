package com.woolworths.shop.modeselector.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ShoppingModeSelectorOptionState;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/ItemFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23364a;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("price", customScalarType).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        ShoppingModeSelectorOptionState.e.getClass();
        f23364a = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("state", CompiledGraphQL.b(ShoppingModeSelectorOptionState.f)).c());
    }
}
