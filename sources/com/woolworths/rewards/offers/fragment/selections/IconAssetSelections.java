package com.woolworths.rewards.offers.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/selections/IconAssetSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconAssetSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21040a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        LocalAssetIconName.e.getClass();
        List listQ = CollectionsKt.Q(new CompiledField.Builder("iconName", CompiledGraphQL.b(LocalAssetIconName.f)).c());
        f21040a = listQ;
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        b = listQ2;
        List listR = CollectionsKt.R(new CompiledField.Builder("coreIconName", CompiledGraphQL.b(customScalarType)).c(), d.g("coreWebIconName", customScalarType));
        c = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("LocalAsset", CollectionsKt.Q("LocalAsset"));
        builder.d = listQ;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder2.d = listQ2;
        CompiledFragment compiledFragmentA2 = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("CoreIcon", CollectionsKt.Q("CoreIcon"));
        builder3.d = listR;
        d = CollectionsKt.R(compiledFieldC, compiledFragmentA, compiledFragmentA2, builder3.a());
    }
}
