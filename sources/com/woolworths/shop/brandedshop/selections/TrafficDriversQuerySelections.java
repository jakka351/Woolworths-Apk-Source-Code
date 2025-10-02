package com.woolworths.shop.brandedshop.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.TagLabel;
import au.com.woolworths.shop.graphql.type.TagStyle;
import au.com.woolworths.shop.graphql.type.TrafficDriver;
import au.com.woolworths.shop.graphql.type.TrafficDriverItem;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/brandedshop/selections/TrafficDriversQuerySelections;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrafficDriversQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21493a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        List list = AnalyticsFieldsSelections.b;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21493a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder2.d = list;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        ActionType.e.getClass();
        CompiledField compiledFieldC4 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("id", customScalarType);
        ObjectType objectType = Analytics.f11028a;
        CompiledField.Builder builder3 = new CompiledField.Builder("analytics", objectType);
        builder3.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldG, builder3.c());
        c = listR3;
        CompiledField compiledFieldC6 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c();
        TagStyle.e.getClass();
        List listR4 = CollectionsKt.R(compiledFieldC6, new CompiledField.Builder("style", TagStyle.f).c());
        d = listR4;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder4.d = list;
        List listR5 = CollectionsKt.R(compiledFieldC7, builder4.a());
        e = listR5;
        CompiledField compiledFieldC8 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG2 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldC10 = new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("keywords", a.e(customScalarType)).c();
        CompiledField.Builder builder5 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(Action.f10997a));
        builder5.e = listR3;
        CompiledField compiledFieldC12 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("tag", TagLabel.f11962a);
        builder6.e = listR4;
        CompiledField compiledFieldC13 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("impressionAnalytics", objectType);
        builder7.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC8, compiledFieldC9, compiledFieldG2, compiledFieldC10, compiledFieldC11, compiledFieldC12, compiledFieldC13, builder7.c());
        f = listR6;
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        CompiledField compiledFieldC15 = new CompiledField.Builder("numberOfItemsToDisplay", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC16 = new CompiledField.Builder("startingIndex", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder8 = new CompiledField.Builder("analytics", objectType);
        builder8.e = listR;
        CompiledField compiledFieldC17 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("items", a.f(TrafficDriverItem.f11977a));
        builder9.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC14, compiledFieldC15, compiledFieldC16, compiledFieldC17, builder9.c());
        g = listR7;
        CompiledField.Builder builder10 = new CompiledField.Builder("trafficDrivers", CompiledGraphQL.b(TrafficDriver.f11976a));
        builder10.e = listR7;
        h = CollectionsKt.Q(builder10.c());
    }
}
