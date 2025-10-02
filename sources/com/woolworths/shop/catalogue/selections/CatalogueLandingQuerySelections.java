package com.woolworths.shop.catalogue.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CatalogueLanding;
import au.com.woolworths.shop.graphql.type.CatalogueLandingItem;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.woolworths.shop.catalogue.fragment.selections.CatalogueActionableCardSelections;
import com.woolworths.shop.catalogue.fragment.selections.CatalogueLandingCardSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/selections/CatalogueLandingQuerySelections;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogueLandingQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21792a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("headerImage", CompiledGraphQL.b(customScalarType)).c());
        f21792a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CatalogueLandingCard", CollectionsKt.R("CatalogueLandingCategoryCard", "CatalogueLandingPrimaryContentCard"));
        builder.b(CatalogueLandingCardSelections.f21789a);
        List listR = CollectionsKt.R(compiledFieldC, builder.a(), new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c());
        b = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder2.b(CatalogueActionableCardSelections.f21783a);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        c = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("CatalogueLandingHeader", CollectionsKt.Q("CatalogueLandingHeader"));
        builder3.d = listQ;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("CatalogueLandingCategoryCard", CollectionsKt.Q("CatalogueLandingCategoryCard"));
        builder4.d = listR;
        CompiledFragment compiledFragmentA2 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder5.c = a.s("includeActionableCard", false);
        builder5.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, builder5.a());
        d = listR3;
        CompiledField.Builder builder6 = new CompiledField.Builder("items", d.j(CatalogueLandingItem.f11153a));
        builder6.e = listR3;
        List listQ2 = CollectionsKt.Q(builder6.c());
        e = listQ2;
        CompiledField.Builder builder7 = new CompiledField.Builder("catalogueLanding", CatalogueLanding.f11149a);
        new CompiledArgument.Builder(Query.M1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.L1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.N1);
        builder7.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder7.e = listQ2;
        f = CollectionsKt.Q(builder7.c());
    }
}
