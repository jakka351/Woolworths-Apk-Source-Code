package com.woolworths.shop.catalogue.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.CatalogueBrowsePromotionPageItem;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/selections/CatalogueBrowsePromotionPageSelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueBrowsePromotionPageSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21785a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c());
        f21785a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("Button", CollectionsKt.Q("Button"));
        builder2.b(CatalogueButtonSelections.f21786a);
        List listR3 = CollectionsKt.R(compiledFieldC2, builder2.a());
        c = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("button", CompiledGraphQL.b(Button.f11080a));
        builder3.e = listR3;
        List listQ = CollectionsKt.Q(builder3.c());
        d = listQ;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("CatalogueBrowsePromotionPageHeader", CollectionsKt.Q("CatalogueBrowsePromotionPageHeader"));
        builder4.d = listR;
        CompiledFragment compiledFragmentA = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder5.d = listR2;
        CompiledFragment compiledFragmentA2 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("CatalogueBrowsePromotionPageButton", CollectionsKt.Q("CatalogueBrowsePromotionPageButton"));
        builder6.d = listQ;
        List listR4 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, builder6.a());
        e = listR4;
        CompiledField compiledFieldC4 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("pageNumber", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("backgroundUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("backgroundColor", customScalarType);
        CompiledField.Builder builder7 = new CompiledField.Builder("items", d.j(CatalogueBrowsePromotionPageItem.f11134a));
        builder7.e = listR4;
        f = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldG, builder7.c());
    }
}
