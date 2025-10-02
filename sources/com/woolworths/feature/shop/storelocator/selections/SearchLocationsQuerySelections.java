package com.woolworths.feature.shop.storelocator.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.LocationSearchResult;
import au.com.woolworths.shop.graphql.type.LocationSearchResults;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.feature.shop.storelocator.fragment.selections.StoreSelections;
import com.woolworths.feature.shop.storelocator.fragment.selections.SuburbItemSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/selections/SearchLocationsQuerySelections;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchLocationsQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20353a;
    public static final List b;
    public static final List c;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Store", CollectionsKt.Q("Store"));
        builder.b(StoreSelections.c);
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("SuburbItem", CollectionsKt.Q("SuburbItem"));
        builder2.b(SuburbItemSelections.f20351a);
        List listR = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
        f20353a = listR;
        CompiledField.Builder builder3 = new CompiledField.Builder(lqlqqlq.m006Dm006Dm006Dm, d.j(LocationSearchResult.f11539a));
        builder3.e = listR;
        List listQ = CollectionsKt.Q(builder3.c());
        b = listQ;
        CompiledField.Builder builder4 = new CompiledField.Builder("searchLocations", CompiledGraphQL.b(LocationSearchResults.f11540a));
        new CompiledArgument.Builder(Query.o1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.m1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.n1);
        builder4.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder4.e = listQ;
        c = CollectionsKt.Q(builder4.c());
    }
}
