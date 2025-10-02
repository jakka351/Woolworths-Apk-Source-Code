package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InvoiceErrorReason;
import au.com.woolworths.shop.graphql.type.OrderInvoice;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/GetOrderInvoiceQuerySelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetOrderInvoiceQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20194a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        f20194a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        InvoiceErrorReason.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("reason", CompiledGraphQL.b(InvoiceErrorReason.f)).c());
        b = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("OrderInvoiceDetail", CollectionsKt.Q("OrderInvoiceDetail"));
        builder.d = listQ;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("OrderInvoiceError", CollectionsKt.Q("OrderInvoiceError"));
        builder2.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, builder2.a());
        c = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("orderInvoice", CompiledGraphQL.b(OrderInvoice.f11655a));
        new CompiledArgument.Builder(Query.g2);
        builder3.d = a.v();
        builder3.e = listR2;
        d = CollectionsKt.Q(builder3.c());
    }
}
