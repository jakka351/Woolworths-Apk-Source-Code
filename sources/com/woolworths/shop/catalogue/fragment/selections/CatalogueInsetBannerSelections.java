package com.woolworths.shop.catalogue.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/selections/CatalogueInsetBannerSelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueInsetBannerSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21788a;
    public static final List b;

    static {
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.f)).c();
        InsetBannerActionType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f21788a = listR;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG = d.g("iconUrl", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.f11510a);
        builder.e = listR;
        b = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldG, builder.c());
    }
}
