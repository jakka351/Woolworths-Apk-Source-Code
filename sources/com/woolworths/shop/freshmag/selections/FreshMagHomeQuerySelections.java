package com.woolworths.shop.freshmag.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.aem.components.recipes.fragment.selections.RecipeSummaryCardFragmentSelections;
import au.com.woolworths.shop.graphql.type.ActionMetaData;
import au.com.woolworths.shop.graphql.type.FreshMagHome;
import au.com.woolworths.shop.graphql.type.FreshMagHomeItem;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.HorizontalListItem;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/selections/FreshMagHomeQuerySelections;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FreshMagHomeQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22735a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("coverImageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("magazineId", CompiledGraphQL.b(customScalarType)).c(), d.g("buttonTitle", customScalarType));
        f22735a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RecipeSummaryCard", CollectionsKt.Q("RecipeSummaryCard"));
        builder.b(RecipeSummaryCardFragmentSelections.d);
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(k.a.g, a.e(customScalarType)).c());
        c = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("source", CompiledGraphQL.b(customScalarType)).c());
        d = listQ2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("RecipeTagList", CollectionsKt.Q("RecipeTagList"));
        builder2.d = listQ;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("RecipeSource", CollectionsKt.Q("RecipeSource"));
        builder3.d = listQ2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, builder3.a());
        e = listR3;
        CompiledField.Builder builder4 = new CompiledField.Builder("actionMetadata", d.j(ActionMetaData.f10998a));
        builder4.e = listR3;
        List listQ3 = CollectionsKt.Q(builder4.c());
        f = listQ3;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("RecipeSummaryCard", CollectionsKt.Q("RecipeSummaryCard"));
        builder5.d = listR2;
        CompiledFragment compiledFragmentA2 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("RecipeMoreCard", CollectionsKt.Q("RecipeMoreCard"));
        builder6.d = listQ3;
        List listR4 = CollectionsKt.R(compiledFieldC3, compiledFragmentA2, builder6.a());
        g = listR4;
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField.Builder builder7 = new CompiledField.Builder("items", d.j(HorizontalListItem.f11475a));
        builder7.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC4, compiledFieldG, builder7.c(), d.g("actionTitle", customScalarType), d.g("deepLink", customScalarType));
        h = listR5;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("FreshMagSummary", CollectionsKt.Q("FreshMagSummary"));
        builder8.d = listR;
        CompiledFragment compiledFragmentA3 = builder8.a();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder9.d = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC5, compiledFragmentA3, builder9.a());
        i = listR6;
        CompiledField.Builder builder10 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(FreshMagHomeItem.f11401a)));
        builder10.e = listR6;
        List listQ4 = CollectionsKt.Q(builder10.c());
        j = listQ4;
        CompiledField.Builder builder11 = new CompiledField.Builder("freshMagHome", FreshMagHome.f11400a);
        builder11.e = listQ4;
        k = CollectionsKt.Q(builder11.c());
    }
}
