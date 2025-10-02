package com.woolworths.feature.shop.myorders.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.Orders;
import au.com.woolworths.shop.graphql.type.OrdersFeedItem;
import au.com.woolworths.shop.graphql.type.OrdersMessage;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/selections/MyOrdersQuerySelections;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MyOrdersQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20198a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLID.f11441a;
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("date", CompiledGraphQL.b(customScalarType2)).c();
        OrderStatus.e.getClass();
        EnumType enumType = OrderStatus.f;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("status", enumType).c(), new CompiledField.Builder("total", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("timeLabel", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("timeValue", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("actionPath", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("actionTitle", CompiledGraphQL.b(customScalarType2)).c());
        f20198a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("date", CompiledGraphQL.b(customScalarType2)).c(), a.d("status", enumType), new CompiledField.Builder("total", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("timeLabel", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("timeValue", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("location", CompiledGraphQL.b(customScalarType2)).c(), d.g("windowTime", customScalarType2), d.g("windowDate", customScalarType2));
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType2)).c(), a.d("status", enumType), new CompiledField.Builder("total", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("date", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType2)).c());
        c = listR3;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("PickUpOrder", CollectionsKt.Q("PickUpOrder"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("DeliveryOrder", CollectionsKt.Q("DeliveryOrder"));
        builder2.d = listR2;
        CompiledFragment compiledFragmentA2 = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("CompactOrder", CollectionsKt.Q("CompactOrder"));
        builder3.c = a.s("isOrdersHistoryEnabled", false);
        builder3.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC5, compiledFragmentA, compiledFragmentA2, builder3.a());
        d = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType2)).c());
        e = listR5;
        CustomScalarType customScalarType3 = GraphQLInt.f11442a;
        CompiledField compiledFieldC6 = new CompiledField.Builder("totalItemCount", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldG = d.g("nextPage", customScalarType3);
        CompiledField.Builder builder4 = new CompiledField.Builder("feed", CompiledGraphQL.a(CompiledGraphQL.b(OrdersFeedItem.f11677a)));
        builder4.e = listR4;
        CompiledField compiledFieldC7 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("message", OrdersMessage.f11678a);
        builder5.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC6, compiledFieldG, compiledFieldC7, builder5.c());
        f = listR6;
        CompiledField.Builder builder6 = new CompiledField.Builder("orders", CompiledGraphQL.b(Orders.f11676a));
        new CompiledArgument.Builder(Query.i2);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.h2);
        builder6.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder6.e = listR6;
        g = CollectionsKt.Q(builder6.c());
    }
}
