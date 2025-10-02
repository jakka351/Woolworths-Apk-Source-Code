package com.woolworths.product.list.legacy.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.FilterMenuItem;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductFilter;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import au.com.woolworths.shop.graphql.type.ProductSortOption;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.legacy.fragment.selections.InsetBannerSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/list/legacy/selections/ProductsByPastShopQuerySelections;", "", "<init>", "()V", "__onActionableCard", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__onProductCard", "__onImageTextBanner", "__productsFeed", "__filterItems", "__action", "__banner", "__filters", "__sortOptions", "__sortOptionsBanner", "__purchaseHistory", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsByPastShopQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductsByPastShopQuerySelections INSTANCE = new ProductsByPastShopQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __action;

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __filterItems;

    @NotNull
    private static final List<CompiledSelection> __filters;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard;

    @NotNull
    private static final List<CompiledSelection> __onImageTextBanner;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __productsFeed;

    @NotNull
    private static final List<CompiledSelection> __purchaseHistory;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __sortOptions;

    @NotNull
    private static final List<CompiledSelection> __sortOptionsBanner;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c();
        CardHeight.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("cardHeight", CompiledGraphQL.b(CardHeight.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("analytics", TealiumAnalytics.f11963a).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, new CompiledField.Builder("_excluded", customScalarType2).c());
        __onActionableCard = listR;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder.b(ProductCardSelections.A);
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC6, builder.a());
        __onProductCard = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        __onImageTextBanner = listR3;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder2.c = a.s("fetchActionableCard", false);
        builder2.d = listR;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder3.d = listR2;
        CompiledFragment compiledFragmentA2 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("ImageTextBanner", CollectionsKt.Q("ImageTextBanner"));
        builder4.d = listR3;
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC7, compiledFragmentA, compiledFragmentA2, builder4.a());
        __productsFeed = listR4;
        List<CompiledSelection> listR5 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("parentKey", customScalarType), new CompiledField.Builder("hasChildren", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType2)).c());
        __filterItems = listR5;
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC8 = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.f)).c();
        InsetBannerActionType.e.getClass();
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldC8, new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.f)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action = listR6;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC9 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("iconUrl", customScalarType);
        CompiledField.Builder builder5 = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.f11510a);
        builder5.e = listR6;
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC9, compiledFieldC10, compiledFieldG, builder5.c(), new CompiledField.Builder("title", customScalarType).c());
        __banner = listR7;
        CompiledField compiledFieldC11 = new CompiledField.Builder("headerKey", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC12 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("filterItems", a.f(FilterMenuItem.f11386a));
        builder6.e = listR5;
        CompiledField compiledFieldC13 = builder6.c();
        ObjectType objectType = InsetBanner.f11509a;
        CompiledField.Builder builder7 = new CompiledField.Builder("banner", objectType);
        builder7.e = listR7;
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldC11, compiledFieldC12, compiledFieldC13, builder7.c());
        __filters = listR8;
        List<CompiledSelection> listR9 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType2)).c());
        __sortOptions = listR9;
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder8.b(InsetBannerSelections.INSTANCE.get__root());
        List<CompiledSelection> listR10 = CollectionsKt.R(compiledFieldC14, builder8.a());
        __sortOptionsBanner = listR10;
        CustomScalarType customScalarType3 = GraphQLInt.f11442a;
        CompiledField compiledFieldC15 = new CompiledField.Builder("totalNumberOfProducts", customScalarType3).c();
        CompiledField compiledFieldG2 = d.g("nextPage", customScalarType3);
        CompiledField.Builder builder9 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder9.e = listR4;
        CompiledField compiledFieldC16 = builder9.c();
        CompiledField.Builder builder10 = new CompiledField.Builder("filters", a.f(ProductFilter.f11739a));
        builder10.e = listR8;
        CompiledField compiledFieldC17 = builder10.c();
        CompiledField.Builder builder11 = new CompiledField.Builder("sortOptions", a.f(ProductSortOption.f11786a));
        builder11.e = listR9;
        CompiledField compiledFieldC18 = builder11.c();
        CompiledField.Builder builder12 = new CompiledField.Builder("sortOptionsBanner", objectType);
        builder12.c = a.s("includeUnitPriceInsetBanner", false);
        builder12.e = listR10;
        List<CompiledSelection> listR11 = CollectionsKt.R(compiledFieldC15, compiledFieldG2, compiledFieldC16, compiledFieldC17, compiledFieldC18, builder12.c());
        __purchaseHistory = listR11;
        CompiledField.Builder builder13 = new CompiledField.Builder("purchaseHistory", ProductList.f11749a);
        new CompiledArgument.Builder(Query.Z0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.b1);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.a1);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.Y0);
        builder13.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, new CompiledArgument());
        builder13.e = listR11;
        __root = CollectionsKt.Q(builder13.c());
        $stable = 8;
    }

    private ProductsByPastShopQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
