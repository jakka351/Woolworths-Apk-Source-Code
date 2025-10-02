package com.woolworths.feature.shop.shippingcalculator.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.SuburbItem;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/selections/SearchSuburbsByTermQuerySelections;", "", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSuburbsByTermQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20322a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("postcode", customScalarType).c(), d.g("state", customScalarType), d.g(TextBundle.TEXT_ENTRY, customScalarType));
        f20322a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("searchSuburbsByTerm", CompiledGraphQL.a(SuburbItem.f11951a));
        new CompiledArgument.Builder(Query.E2);
        builder.d = a.v();
        builder.e = listR;
        b = CollectionsKt.Q(builder.c());
    }
}
