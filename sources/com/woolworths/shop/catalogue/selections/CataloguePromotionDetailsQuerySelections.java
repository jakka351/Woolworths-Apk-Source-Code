package com.woolworths.shop.catalogue.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.CataloguePromotionDetails;
import au.com.woolworths.shop.graphql.type.CataloguePromotionDetailsItem;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.shop.catalogue.fragment.selections.CatalogueInsetBannerSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/selections/CataloguePromotionDetailsQuerySelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CataloguePromotionDetailsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21794a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("promotionDetailsHeaderTitle", CompiledGraphQL.b(customScalarType)).c(), d.g("promotionDetailsHeaderTitleColor", customScalarType), d.g("promotionDetailsHeaderSubtitle", customScalarType), d.g("promotionDetailsHeaderImage", customScalarType));
        f21794a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder.b(CatalogueInsetBannerSelections.b);
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("termsAndConditionsTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("termsAndConditionsContent", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder2.b(ProductCardSelections.A);
        List listR4 = CollectionsKt.R(compiledFieldC2, builder2.a());
        d = listR4;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("PromotionDetailsHeader", CollectionsKt.Q("PromotionDetailsHeader"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder4.d = listR2;
        CompiledFragment compiledFragmentA2 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("TermsAndConditions", CollectionsKt.Q("TermsAndConditions"));
        builder5.d = listR3;
        CompiledFragment compiledFragmentA3 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder6.d = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, builder6.a());
        e = listR5;
        CompiledField.Builder builder7 = new CompiledField.Builder("items", d.j(CataloguePromotionDetailsItem.f11161a));
        builder7.e = listR5;
        List listQ = CollectionsKt.Q(builder7.c());
        f = listQ;
        CompiledField.Builder builder8 = new CompiledField.Builder("cataloguePromotionDetails", CataloguePromotionDetails.f11159a);
        new CompiledArgument.Builder(Query.U1);
        builder8.d = a.v();
        builder8.e = listQ;
        g = CollectionsKt.Q(builder8.c());
    }
}
