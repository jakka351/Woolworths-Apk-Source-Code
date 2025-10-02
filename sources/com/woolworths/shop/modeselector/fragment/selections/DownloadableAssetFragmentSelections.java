package com.woolworths.shop.modeselector.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/DownloadableAssetFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadableAssetFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23363a;

    static {
        DownloadableAssetType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("assetType", CompiledGraphQL.b(DownloadableAssetType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("assetUrl", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        CompiledField compiledFieldC3 = new CompiledField.Builder("assetWidth", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("assetHeight", CompiledGraphQL.b(customScalarType2)).c();
        DownloadableAssetFit.e.getClass();
        f23363a = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("fit", DownloadableAssetFit.f).c(), d.g("altText", customScalarType));
    }
}
