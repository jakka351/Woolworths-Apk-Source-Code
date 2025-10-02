package com.woolworths.product.list.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CustomMessageFeed;
import au.com.woolworths.shop.graphql.type.DownloadableAsset;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/woolworths/product/list/selections/ProductsByRewardsOffersQuerySelections;", "", "<init>", "()V", "__onProductCard", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__productsFeed", "__onPopupMessage", "__messageAsset", "__messageButtons", "__onFullScreenMessage", "__customMessages", "__productsByRewardsOffers", "__root", "get__root", "()Ljava/util/List;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsByRewardsOffersQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductsByRewardsOffersQuerySelections INSTANCE = new ProductsByRewardsOffersQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __customMessages;

    @NotNull
    private static final List<CompiledSelection> __messageAsset;

    @NotNull
    private static final List<CompiledSelection> __messageButtons;

    @NotNull
    private static final List<CompiledSelection> __onFullScreenMessage;

    @NotNull
    private static final List<CompiledSelection> __onPopupMessage;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __productsByRewardsOffers;

    @NotNull
    private static final List<CompiledSelection> __productsFeed;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __onProductCard = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder2.d = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        __productsFeed = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(d.g("messageTitle", customScalarType), d.g("messageDescription", customScalarType), d.g("messageCtaLabel", customScalarType));
        __onPopupMessage = listR3;
        DownloadableAssetType.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("assetType", CompiledGraphQL.b(DownloadableAssetType.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("assetUrl", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f11442a;
        CompiledField compiledFieldC5 = new CompiledField.Builder("assetWidth", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("assetHeight", CompiledGraphQL.b(customScalarType2)).c();
        DownloadableAssetFit.e.getClass();
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, new CompiledField.Builder("fit", DownloadableAssetFit.f).c(), d.g("altText", customScalarType));
        __messageAsset = listR4;
        CompiledField compiledFieldC7 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC7, new CompiledField.Builder("style", ButtonStyle.f).c(), new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c(), d.g(UrlHandler.ACTION, customScalarType), d.g("url", customScalarType));
        __messageButtons = listR5;
        CompiledField compiledFieldG = d.g("messageTitle", customScalarType);
        CompiledField compiledFieldG2 = d.g("messageDescription", customScalarType);
        CompiledField.Builder builder3 = new CompiledField.Builder("messageAsset", DownloadableAsset.f11349a);
        builder3.e = listR4;
        CompiledField compiledFieldC8 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("messageButtons", a.f(Button.f11080a));
        builder4.e = listR5;
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldG, compiledFieldG2, compiledFieldC8, builder4.c());
        __onFullScreenMessage = listR6;
        CompiledField compiledFieldC9 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("PopupMessage", CollectionsKt.Q("PopupMessage"));
        builder5.d = listR3;
        CompiledFragment compiledFragmentA = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("FullScreenMessage", CollectionsKt.Q("FullScreenMessage"));
        builder6.d = listR6;
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC9, compiledFragmentA, builder6.a());
        __customMessages = listR7;
        CompiledField compiledFieldG3 = d.g("totalNumberOfProducts", customScalarType2);
        CompiledField.Builder builder7 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder7.e = listR2;
        CompiledField compiledFieldC10 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("customMessages", d.j(CustomMessageFeed.f11306a));
        builder8.e = listR7;
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldG3, compiledFieldC10, builder8.c());
        __productsByRewardsOffers = listR8;
        CompiledField.Builder builder9 = new CompiledField.Builder("productsByRewardsOffers", ProductList.f11749a);
        new CompiledArgument.Builder(Query.B0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.C0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.A0);
        builder9.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder9.e = listR8;
        __root = CollectionsKt.Q(builder9.c());
        $stable = 8;
    }

    private ProductsByRewardsOffersQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
