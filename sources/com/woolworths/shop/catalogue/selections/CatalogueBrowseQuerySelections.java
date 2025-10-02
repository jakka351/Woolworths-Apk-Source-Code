package com.woolworths.shop.catalogue.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CatalogueBrowse;
import au.com.woolworths.shop.graphql.type.CatalogueBrowsePageItem;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.shop.catalogue.fragment.selections.CatalogueBrowseCategoryPageSelections;
import com.woolworths.shop.catalogue.fragment.selections.CatalogueBrowsePromotionPageSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/selections/CatalogueBrowseQuerySelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueBrowseQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21790a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CatalogueBrowseCategoryPage", CollectionsKt.Q("CatalogueBrowseCategoryPage"));
        builder.b(CatalogueBrowseCategoryPageSelections.f);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21790a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("CatalogueBrowsePromotionPage", CollectionsKt.Q("CatalogueBrowsePromotionPage"));
        builder2.b(CatalogueBrowsePromotionPageSelections.f);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("CatalogueBrowseCategoryPage", CollectionsKt.Q("CatalogueBrowseCategoryPage"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("CatalogueBrowsePromotionPage", CollectionsKt.Q("CatalogueBrowsePromotionPage"));
        builder4.c = a.s("includePromotionPage", false);
        builder4.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, builder4.a());
        c = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("totalNumberOfPages", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField.Builder builder5 = new CompiledField.Builder("pages", d.j(CatalogueBrowsePageItem.f11130a));
        builder5.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC4, builder5.c());
        d = listR4;
        CompiledField.Builder builder6 = new CompiledField.Builder("catalogueBrowse", CatalogueBrowse.f11125a);
        new CompiledArgument.Builder(Query.H1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.E1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.G1);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.F1);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Query.D1);
        builder6.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, new CompiledArgument());
        builder6.e = listR4;
        e = CollectionsKt.Q(builder6.c());
    }
}
