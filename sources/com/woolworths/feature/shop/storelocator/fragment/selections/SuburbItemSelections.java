package com.woolworths.feature.shop.storelocator.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/selections/SuburbItemSelections;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SuburbItemSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20351a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f20351a = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), d.g("postcode", customScalarType), d.g("state", customScalarType), d.g(TextBundle.TEXT_ENTRY, customScalarType));
    }
}
