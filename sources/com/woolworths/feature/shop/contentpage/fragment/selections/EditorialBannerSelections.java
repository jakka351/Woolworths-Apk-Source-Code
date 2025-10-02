package com.woolworths.feature.shop.contentpage.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import au.com.woolworths.shop.graphql.type.BannerTextPosition;
import au.com.woolworths.shop.graphql.type.EditorialBannerFooter;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ImageWithAlt;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/selections/EditorialBannerSelections;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditorialBannerSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19788a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        f19788a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Action", CollectionsKt.Q("Action"));
        builder.b(ActionFieldsSelections.b);
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        FooterStyle.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("style", CompiledGraphQL.b(FooterStyle.f)).c();
        CompiledField compiledFieldG = d.g(TextBundle.TEXT_ENTRY, customScalarType);
        ObjectType objectType = ImageWithAlt.f11487a;
        CompiledField.Builder builder2 = new CompiledField.Builder("logo", objectType);
        builder2.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder2.c());
        d = listR4;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder3.b(AnalyticsFieldsSelections.b);
        List listR5 = CollectionsKt.R(compiledFieldC3, builder3.a());
        e = listR5;
        CompiledField compiledFieldC4 = new CompiledField.Builder("editorialBannerId", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("editorialBannerBackgroundColour", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("editorialBannerImage", objectType);
        builder4.e = listR;
        CompiledField compiledFieldC6 = builder4.c();
        CompiledField compiledFieldG2 = d.g("editorialBannerTitle", customScalarType);
        CompiledField compiledFieldG3 = d.g("editorialBannerSubtitle", customScalarType);
        CompiledField.Builder builder5 = new CompiledField.Builder("editorialBannerAction", Action.f10997a);
        builder5.e = listR2;
        CompiledField compiledFieldC7 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("editorialBannerFooter", EditorialBannerFooter.f11375a);
        builder6.e = listR4;
        CompiledField compiledFieldC8 = builder6.c();
        BannerImageFormat.e.getClass();
        CompiledField compiledFieldC9 = new CompiledField.Builder("editorialBannerImageFormat", CompiledGraphQL.b(BannerImageFormat.f)).c();
        BannerTextPosition.e.getClass();
        CompiledField compiledFieldC10 = new CompiledField.Builder("editorialBannerTextPosition", BannerTextPosition.f).c();
        CompiledField.Builder builder7 = new CompiledField.Builder("editorialBannerAnalytics", Analytics.f11028a);
        builder7.e = listR5;
        f = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldG2, compiledFieldG3, compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, builder7.c());
    }
}
