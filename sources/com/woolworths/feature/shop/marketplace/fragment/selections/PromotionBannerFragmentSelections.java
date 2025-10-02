package com.woolworths.feature.shop.marketplace.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.PromotionContent;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/selections/PromotionBannerFragmentSelections;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionBannerFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19848a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.f)).c();
        InsetBannerActionType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f19848a = listR;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldC5 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField.Builder builder = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.f11510a);
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldG, compiledFieldC5, builder.c());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("promotionMarkdownTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("promotionMarkdownText", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("PromotionMarkdownContent", CollectionsKt.Q("PromotionMarkdownContent"));
        builder2.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC6, builder2.a());
        d = listR4;
        CompiledField.Builder builder3 = new CompiledField.Builder("banner", CompiledGraphQL.b(InsetBanner.f11509a));
        builder3.e = listR2;
        CompiledField compiledFieldC7 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("promotionContent", PromotionContent.f11800a);
        builder4.e = listR4;
        e = CollectionsKt.R(compiledFieldC7, builder4.c());
    }
}
