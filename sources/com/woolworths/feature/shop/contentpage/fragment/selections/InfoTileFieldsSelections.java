package com.woolworths.feature.shop.contentpage.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InfoTileCta;
import au.com.woolworths.shop.graphql.type.InfoTileIcon;
import au.com.woolworths.shop.graphql.type.InfoTileIconSlot;
import au.com.woolworths.shop.graphql.type.InfoTileIconSlotSize;
import au.com.woolworths.shop.graphql.type.InfoTileStyle;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/selections/InfoTileFieldsSelections;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoTileFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19790a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder.b(HostedIconFieldsSelections.f19789a);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f19790a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("number", CompiledGraphQL.b(customScalarType)).c());
        b = listQ;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder2.d = listR;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("InfoTileBadge", CollectionsKt.Q("InfoTileBadge"));
        builder3.d = listQ;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, builder3.a());
        c = listR2;
        CompiledField.Builder builder4 = new CompiledField.Builder(BarcodePickDeserializer.FIELD_ICON, CompiledGraphQL.b(InfoTileIcon.f11502a));
        builder4.e = listR2;
        CompiledField compiledFieldC3 = builder4.c();
        InfoTileIconSlotSize.e.getClass();
        List listR3 = CollectionsKt.R(compiledFieldC3, new CompiledField.Builder("size", CompiledGraphQL.b(InfoTileIconSlotSize.f)).c());
        d = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("Action", CollectionsKt.Q("Action"));
        builder5.b(ActionFieldsSelections.b);
        List listR4 = CollectionsKt.R(compiledFieldC4, builder5.a());
        e = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("infoTileCtaLabel", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("infoTileCtaAction", CompiledGraphQL.b(Action.f10997a));
        builder6.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC5, builder6.c());
        f = listR5;
        CompiledField.Builder builder7 = new CompiledField.Builder("infoTileIconSlot", InfoTileIconSlot.f11503a);
        builder7.e = listR3;
        CompiledField compiledFieldC6 = builder7.c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("infoTileTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("infoTileBodyMarkdown", customScalarType);
        CompiledField.Builder builder8 = new CompiledField.Builder("infoTileCta", InfoTileCta.f11501a);
        builder8.e = listR5;
        CompiledField compiledFieldC8 = builder8.c();
        InfoTileStyle.e.getClass();
        g = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldG, compiledFieldC8, new CompiledField.Builder("infoTileStyle", CompiledGraphQL.b(InfoTileStyle.f)).c());
    }
}
