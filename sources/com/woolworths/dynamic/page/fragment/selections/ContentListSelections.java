package com.woolworths.dynamic.page.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.ContentListItem;
import au.com.woolworths.shop.graphql.type.DynamicPageAction;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/selections/ContentListSelections;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentListSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19301a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder.b(AnalyticsFieldsSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f19301a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", Analytics.f11028a);
        builder2.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder2.c());
        b = listR2;
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("imageAltText", customScalarType);
        CompiledField compiledFieldG2 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField.Builder builder3 = new CompiledField.Builder("cta", DynamicPageAction.f11356a);
        builder3.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldG, compiledFieldG2, builder3.c());
        c = listR3;
        CompiledField compiledFieldG3 = d.g("contentListTitle", customScalarType);
        CompiledField.Builder builder4 = new CompiledField.Builder("contentListItems", a.f(ContentListItem.f11284a));
        builder4.e = listR3;
        d = CollectionsKt.R(compiledFieldG3, builder4.c());
    }
}
