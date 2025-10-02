package com.woolworths.product.list.legacy.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/selections/InsetBannerSelections;", "", "<init>", "()V", "__action", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsetBannerSelections {
    public static final int $stable;

    @NotNull
    public static final InsetBannerSelections INSTANCE = new InsetBannerSelections();

    @NotNull
    private static final List<CompiledSelection> __action;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.f)).c();
        InsetBannerActionType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action = listR;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG = d.g("iconUrl", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.f11510a);
        builder.e = listR;
        __root = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldG, builder.c());
        $stable = 8;
    }

    private InsetBannerSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
