package com.woolworths.product.list.legacy.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.Chip;
import au.com.woolworths.shop.graphql.type.ContentCta;
import au.com.woolworths.shop.graphql.type.FilterMenuItem;
import au.com.woolworths.shop.graphql.type.GoogleAdBannerCard;
import au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.HorizontalListItem;
import au.com.woolworths.shop.graphql.type.InfoSection;
import au.com.woolworths.shop.graphql.type.InfoSectionFooter;
import au.com.woolworths.shop.graphql.type.InfoSectionItem;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MarketplaceEducationBottomSheet;
import au.com.woolworths.shop.graphql.type.ProductCategoryTile;
import au.com.woolworths.shop.graphql.type.ProductFilter;
import au.com.woolworths.shop.graphql.type.ProductFilterSwitch;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListAnalytics;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import au.com.woolworths.shop.graphql.type.ProductListZeroResult;
import au.com.woolworths.shop.graphql.type.ProductListZeroResultItem;
import au.com.woolworths.shop.graphql.type.ProductSortOption;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import au.com.woolworths.shop.graphql.type.UniversalInventoryNextBestAction;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.legacy.fragment.selections.InsetBannerSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/woolworths/product/list/legacy/selections/ProductsBySearchQuerySelections;", "", "<init>", "()V", "__onAdobeTargetAnalytics", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__analytics", "__onActionableCard", "__onGoogleAdBannerCard", "__googleAdBannerCard", "__onActionableCard1", "__nextBestAction", "__onUniversalInventoryContainer", "__action", "__onInsetBanner", "__onProductCard", "__productsFeed", "__filterItems", "__action1", "__banner", "__filters", "__sortOptions", "__sortOptionsBanner", "__buttonCta", "__marketplaceFilterSwitch", "__items", "__footer", "__marketplaceInfo", "__primaryCta", "__secondaryCta", "__marketplaceBottomSheet", "__text", "__chips", "__text2", "__facetChips", "__productCategoryTileAction", "__zeroResultProductCategoriesItems", "__onZeroResultProductCategories", "__onProductCard1", "__items2", "__onHorizontalList", "__items1", "__zeroResultContent", "__productsBySearch", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsBySearchQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductsBySearchQuerySelections INSTANCE = new ProductsBySearchQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __action;

    @NotNull
    private static final List<CompiledSelection> __action1;

    @NotNull
    private static final List<CompiledSelection> __analytics;

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __buttonCta;

    @NotNull
    private static final List<CompiledSelection> __chips;

    @NotNull
    private static final List<CompiledSelection> __facetChips;

    @NotNull
    private static final List<CompiledSelection> __filterItems;

    @NotNull
    private static final List<CompiledSelection> __filters;

    @NotNull
    private static final List<CompiledSelection> __footer;

    @NotNull
    private static final List<CompiledSelection> __googleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __items;

    @NotNull
    private static final List<CompiledSelection> __items1;

    @NotNull
    private static final List<CompiledSelection> __items2;

    @NotNull
    private static final List<CompiledSelection> __marketplaceBottomSheet;

    @NotNull
    private static final List<CompiledSelection> __marketplaceFilterSwitch;

    @NotNull
    private static final List<CompiledSelection> __marketplaceInfo;

    @NotNull
    private static final List<CompiledSelection> __nextBestAction;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard1;

    @NotNull
    private static final List<CompiledSelection> __onAdobeTargetAnalytics;

    @NotNull
    private static final List<CompiledSelection> __onGoogleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __onHorizontalList;

    @NotNull
    private static final List<CompiledSelection> __onInsetBanner;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __onProductCard1;

    @NotNull
    private static final List<CompiledSelection> __onUniversalInventoryContainer;

    @NotNull
    private static final List<CompiledSelection> __onZeroResultProductCategories;

    @NotNull
    private static final List<CompiledSelection> __primaryCta;

    @NotNull
    private static final List<CompiledSelection> __productCategoryTileAction;

    @NotNull
    private static final List<CompiledSelection> __productsBySearch;

    @NotNull
    private static final List<CompiledSelection> __productsFeed;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __secondaryCta;

    @NotNull
    private static final List<CompiledSelection> __sortOptions;

    @NotNull
    private static final List<CompiledSelection> __sortOptionsBanner;

    @NotNull
    private static final List<CompiledSelection> __text;

    @NotNull
    private static final List<CompiledSelection> __text2;

    @NotNull
    private static final List<CompiledSelection> __zeroResultContent;

    @NotNull
    private static final List<CompiledSelection> __zeroResultProductCategoriesItems;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List<CompiledSelection> listR = CollectionsKt.R(new CompiledField.Builder("tnta", customScalarType).c(), d.g("pe", customScalarType));
        __onAdobeTargetAnalytics = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("AdobeTargetAnalytics", CollectionsKt.Q("AdobeTargetAnalytics"));
        builder.d = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        __analytics = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c();
        CardHeight.e.getClass();
        EnumType enumType = CardHeight.f;
        CompiledField compiledFieldC4 = new CompiledField.Builder("cardHeight", CompiledGraphQL.b(enumType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = TealiumAnalytics.f11963a;
        CompiledField compiledFieldC6 = new CompiledField.Builder("analytics", customScalarType2).c();
        CustomScalarType customScalarType3 = GraphQLBoolean.f11439a;
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, new CompiledField.Builder("_excluded", customScalarType3).c());
        __onActionableCard = listR3;
        CompiledField compiledFieldC7 = new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType4 = GoogleAdCustomTargeting.f11436a;
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, new CompiledField.Builder("targeting", customScalarType4).c(), d.g("iabSize", customScalarType), d.g("correlator", customScalarType));
        __onGoogleAdBannerCard = listR4;
        CompiledField compiledFieldC9 = new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("iabSpec", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldG = d.g("iabSize", customScalarType);
        AdBannerNativeSize.e.getClass();
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC9, compiledFieldC10, compiledFieldC11, compiledFieldG, new CompiledField.Builder("height", CompiledGraphQL.b(AdBannerNativeSize.f)).c(), d.g("targeting", customScalarType4), d.g("correlator", customScalarType), d.g("_excluded", customScalarType3));
        __googleAdBannerCard = listR5;
        List<CompiledSelection> listR6 = CollectionsKt.R(new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("cardHeight", CompiledGraphQL.b(enumType)).c(), d.g("analytics", customScalarType2), d.g("_excluded", customScalarType3));
        __onActionableCard1 = listR6;
        CompiledField compiledFieldC12 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder2.d = listR6;
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC12, builder2.a());
        __nextBestAction = listR7;
        CompiledField.Builder builder3 = new CompiledField.Builder("googleAdBannerCard", GoogleAdBannerCard.f11435a);
        builder3.e = listR5;
        CompiledField compiledFieldC13 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("nextBestAction", UniversalInventoryNextBestAction.f11980a);
        builder4.e = listR7;
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldC13, builder4.c());
        __onUniversalInventoryContainer = listR8;
        InsetBannerActionPlacement.e.getClass();
        EnumType enumType2 = InsetBannerActionPlacement.f;
        CompiledField compiledFieldC14 = new CompiledField.Builder("placement", CompiledGraphQL.b(enumType2)).c();
        InsetBannerActionType.e.getClass();
        EnumType enumType3 = InsetBannerActionType.f;
        List<CompiledSelection> listR9 = CollectionsKt.R(compiledFieldC14, new CompiledField.Builder("type", CompiledGraphQL.b(enumType3)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action = listR9;
        InsetBannerDisplayType.e.getClass();
        EnumType enumType4 = InsetBannerDisplayType.f;
        CompiledField compiledFieldC15 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType4)).c();
        CompiledField compiledFieldC16 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC17 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG2 = d.g("iconUrl", customScalarType);
        ObjectType objectType = InsetBannerAction.f11510a;
        CompiledField.Builder builder5 = new CompiledField.Builder(UrlHandler.ACTION, objectType);
        builder5.e = listR9;
        List<CompiledSelection> listR10 = CollectionsKt.R(compiledFieldC15, compiledFieldC16, compiledFieldC17, compiledFieldG2, builder5.c());
        __onInsetBanner = listR10;
        CompiledField compiledFieldC18 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        List list = ProductCardSelections.A;
        builder6.b(list);
        List<CompiledSelection> listR11 = CollectionsKt.R(compiledFieldC18, builder6.a());
        __onProductCard = listR11;
        CompiledField compiledFieldC19 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder7.d = listR3;
        CompiledFragment compiledFragmentA = builder7.a();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("GoogleAdBannerCard", CollectionsKt.Q("GoogleAdBannerCard"));
        builder8.c = a.s("includeUniversalInventoryFallback", true);
        builder8.d = listR4;
        CompiledFragment compiledFragmentA2 = builder8.a();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("UniversalInventoryContainer", CollectionsKt.Q("UniversalInventoryContainer"));
        builder9.c = a.s("includeUniversalInventoryFallback", false);
        builder9.d = listR8;
        CompiledFragment compiledFragmentA3 = builder9.a();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder10.d = listR10;
        CompiledFragment compiledFragmentA4 = builder10.a();
        CompiledFragment.Builder builder11 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder11.d = listR11;
        List<CompiledSelection> listR12 = CollectionsKt.R(compiledFieldC19, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, builder11.a());
        __productsFeed = listR12;
        List<CompiledSelection> listR13 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("parentKey", customScalarType), new CompiledField.Builder("hasChildren", CompiledGraphQL.b(customScalarType3)).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType3)).c());
        __filterItems = listR13;
        List<CompiledSelection> listR14 = CollectionsKt.R(new CompiledField.Builder("placement", CompiledGraphQL.b(enumType2)).c(), new CompiledField.Builder("type", CompiledGraphQL.b(enumType3)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action1 = listR14;
        CompiledField compiledFieldC20 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType4)).c();
        CompiledField compiledFieldC21 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG3 = d.g("iconUrl", customScalarType);
        CompiledField.Builder builder12 = new CompiledField.Builder(UrlHandler.ACTION, objectType);
        builder12.e = listR14;
        List<CompiledSelection> listR15 = CollectionsKt.R(compiledFieldC20, compiledFieldC21, compiledFieldG3, builder12.c(), new CompiledField.Builder("title", customScalarType).c());
        __banner = listR15;
        CompiledField compiledFieldC22 = new CompiledField.Builder("headerKey", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC23 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder13 = new CompiledField.Builder("filterItems", a.f(FilterMenuItem.f11386a));
        builder13.e = listR13;
        CompiledField compiledFieldC24 = builder13.c();
        ObjectType objectType2 = InsetBanner.f11509a;
        CompiledField.Builder builder14 = new CompiledField.Builder("banner", objectType2);
        builder14.e = listR15;
        List<CompiledSelection> listR16 = CollectionsKt.R(compiledFieldC22, compiledFieldC23, compiledFieldC24, builder14.c());
        __filters = listR16;
        List<CompiledSelection> listR17 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType3)).c());
        __sortOptions = listR17;
        CompiledField compiledFieldC25 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder15 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder15.b(InsetBannerSelections.INSTANCE.get__root());
        List<CompiledSelection> listR18 = CollectionsKt.R(compiledFieldC25, builder15.a());
        __sortOptionsBanner = listR18;
        List<CompiledSelection> listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __buttonCta = listQ;
        CompiledField compiledFieldC26 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG4 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldG5 = d.g("imageUrl", customScalarType);
        ObjectType objectType3 = ContentCta.f11282a;
        CompiledField.Builder builder16 = new CompiledField.Builder("buttonCta", objectType3);
        builder16.e = listQ;
        List<CompiledSelection> listR19 = CollectionsKt.R(compiledFieldC26, compiledFieldG4, compiledFieldG5, builder16.c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType3)).c());
        __marketplaceFilterSwitch = listR19;
        List<CompiledSelection> listR20 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c());
        __items = listR20;
        List<CompiledSelection> listR21 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("linkUrl", CompiledGraphQL.b(customScalarType)).c());
        __footer = listR21;
        CompiledField compiledFieldC27 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder17 = new CompiledField.Builder("items", a.f(InfoSectionItem.f11497a));
        builder17.e = listR20;
        CompiledField compiledFieldC28 = builder17.c();
        CompiledField.Builder builder18 = new CompiledField.Builder("footer", InfoSectionFooter.f11496a);
        builder18.e = listR21;
        List<CompiledSelection> listR22 = CollectionsKt.R(compiledFieldC27, compiledFieldC28, builder18.c());
        __marketplaceInfo = listR22;
        List<CompiledSelection> listQ2 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __primaryCta = listQ2;
        List<CompiledSelection> listQ3 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __secondaryCta = listQ3;
        CompiledField compiledFieldC29 = new CompiledField.Builder("bottomSheetTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC30 = new CompiledField.Builder("bottomSheetBody", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder19 = new CompiledField.Builder("primaryCta", objectType3);
        builder19.e = listQ2;
        CompiledField compiledFieldC31 = builder19.c();
        CompiledField.Builder builder20 = new CompiledField.Builder("secondaryCta", objectType3);
        builder20.e = listQ3;
        List<CompiledSelection> listR23 = CollectionsKt.R(compiledFieldC29, compiledFieldC30, compiledFieldC31, builder20.c(), d.g("showOnceOnly", customScalarType3));
        __marketplaceBottomSheet = listR23;
        List<CompiledSelection> listR24 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __text = listR24;
        CustomScalarType customScalarType5 = GraphQLID.f11441a;
        CompiledField compiledFieldC32 = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType5)).c();
        CompiledField compiledFieldC33 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(customScalarType3)).c();
        ObjectType objectType4 = TextWithAlt.f11967a;
        CompiledField.Builder builder21 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(objectType4));
        builder21.e = listR24;
        List<CompiledSelection> listR25 = CollectionsKt.R(compiledFieldC32, compiledFieldC33, builder21.c());
        __chips = listR25;
        List<CompiledSelection> listR26 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __text2 = listR26;
        CompiledField compiledFieldC34 = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType5)).c();
        CompiledField compiledFieldC35 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField.Builder builder22 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(objectType4));
        builder22.e = listR26;
        List<CompiledSelection> listR27 = CollectionsKt.R(compiledFieldC34, compiledFieldC35, builder22.c());
        __facetChips = listR27;
        ActionType.e.getClass();
        List<CompiledSelection> listR28 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        __productCategoryTileAction = listR28;
        CompiledField.Builder builder23 = new CompiledField.Builder("productCategoryTileAction", CompiledGraphQL.b(Action.f10997a));
        builder23.e = listR28;
        List<CompiledSelection> listR29 = CollectionsKt.R(builder23.c(), new CompiledField.Builder("productCategoryTileImageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("productCategoryTileLabel", CompiledGraphQL.b(customScalarType)).c());
        __zeroResultProductCategoriesItems = listR29;
        CompiledField compiledFieldG6 = d.g("zeroResultProductCategoriesTitle", customScalarType);
        CompiledField.Builder builder24 = new CompiledField.Builder("zeroResultProductCategoriesItems", a.f(ProductCategoryTile.f11720a));
        builder24.e = listR29;
        List<CompiledSelection> listR30 = CollectionsKt.R(compiledFieldG6, builder24.c());
        __onZeroResultProductCategories = listR30;
        CompiledField compiledFieldC36 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder25 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder25.b(list);
        List<CompiledSelection> listR31 = CollectionsKt.R(compiledFieldC36, builder25.a());
        __onProductCard1 = listR31;
        CompiledField compiledFieldC37 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder26 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder26.d = listR31;
        List<CompiledSelection> listR32 = CollectionsKt.R(compiledFieldC37, builder26.a());
        __items2 = listR32;
        CompiledField compiledFieldC38 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder27 = new CompiledField.Builder("items", d.j(HorizontalListItem.f11475a));
        builder27.e = listR32;
        List<CompiledSelection> listR33 = CollectionsKt.R(compiledFieldC38, builder27.c());
        __onHorizontalList = listR33;
        CompiledField compiledFieldC39 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder28 = new CompiledFragment.Builder("ZeroResultProductCategories", CollectionsKt.Q("ZeroResultProductCategories"));
        builder28.d = listR30;
        CompiledFragment compiledFragmentA5 = builder28.a();
        CompiledFragment.Builder builder29 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder29.d = listR33;
        List<CompiledSelection> listR34 = CollectionsKt.R(compiledFieldC39, compiledFragmentA5, builder29.a());
        __items1 = listR34;
        CompiledField compiledFieldG7 = d.g("title", customScalarType);
        CompiledField compiledFieldG8 = d.g("message", customScalarType);
        CompiledField.Builder builder30 = new CompiledField.Builder("items", d.j(ProductListZeroResultItem.f11757a));
        builder30.e = listR34;
        List<CompiledSelection> listR35 = CollectionsKt.R(compiledFieldG7, compiledFieldG8, builder30.c());
        __zeroResultContent = listR35;
        CustomScalarType customScalarType6 = GraphQLInt.f11442a;
        CompiledField compiledFieldC40 = new CompiledField.Builder("totalNumberOfProducts", customScalarType6).c();
        CompiledField compiledFieldG9 = d.g("nextPage", customScalarType6);
        CompiledField.Builder builder31 = new CompiledField.Builder("analytics", CompiledGraphQL.a(CompiledGraphQL.b(ProductListAnalytics.f11750a)));
        builder31.e = listR2;
        CompiledField compiledFieldC41 = builder31.c();
        CompiledField.Builder builder32 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder32.e = listR12;
        CompiledField compiledFieldC42 = builder32.c();
        CompiledField.Builder builder33 = new CompiledField.Builder("filters", a.f(ProductFilter.f11739a));
        builder33.e = listR16;
        CompiledField compiledFieldC43 = builder33.c();
        CompiledField.Builder builder34 = new CompiledField.Builder("sortOptions", a.f(ProductSortOption.f11786a));
        builder34.e = listR17;
        CompiledField compiledFieldC44 = builder34.c();
        CompiledField.Builder builder35 = new CompiledField.Builder("sortOptionsBanner", objectType2);
        builder35.c = a.s("includeUnitPriceInsetBanner", false);
        builder35.e = listR18;
        CompiledField compiledFieldC45 = builder35.c();
        CompiledField.Builder builder36 = new CompiledField.Builder("marketplaceFilterSwitch", ProductFilterSwitch.f11741a);
        builder36.e = listR19;
        CompiledField compiledFieldC46 = builder36.c();
        CompiledField.Builder builder37 = new CompiledField.Builder("marketplaceInfo", InfoSection.f11495a);
        builder37.e = listR22;
        CompiledField compiledFieldC47 = builder37.c();
        CompiledField.Builder builder38 = new CompiledField.Builder("marketplaceBottomSheet", MarketplaceEducationBottomSheet.f11556a);
        builder38.e = listR23;
        CompiledField compiledFieldC48 = builder38.c();
        ObjectType objectType5 = Chip.f11271a;
        CompiledField.Builder builder39 = new CompiledField.Builder("chips", CompiledGraphQL.a(CompiledGraphQL.b(objectType5)));
        builder39.e = listR25;
        CompiledField compiledFieldC49 = builder39.c();
        CompiledField.Builder builder40 = new CompiledField.Builder("facetChips", CompiledGraphQL.a(CompiledGraphQL.b(objectType5)));
        builder40.e = listR27;
        CompiledField compiledFieldC50 = builder40.c();
        CompiledField.Builder builder41 = new CompiledField.Builder("zeroResultContent", ProductListZeroResult.f11756a);
        builder41.c = a.s("includeZeroResultPage", false);
        builder41.e = listR35;
        List<CompiledSelection> listR36 = CollectionsKt.R(compiledFieldC40, compiledFieldG9, compiledFieldC41, compiledFieldC42, compiledFieldC43, compiledFieldC44, compiledFieldC45, compiledFieldC46, compiledFieldC47, compiledFieldC48, compiledFieldC49, compiledFieldC50, builder41.c());
        __productsBySearch = listR36;
        CompiledField.Builder builder42 = new CompiledField.Builder("productsBySearch", ProductList.f11749a);
        new CompiledArgument.Builder(Query.s0);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.t0);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.q0);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.m0);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Query.o0);
        CompiledArgument compiledArgument5 = new CompiledArgument();
        new CompiledArgument.Builder(Query.n0);
        CompiledArgument compiledArgument6 = new CompiledArgument();
        new CompiledArgument.Builder(Query.k0);
        CompiledArgument compiledArgument7 = new CompiledArgument();
        new CompiledArgument.Builder(Query.p0);
        CompiledArgument compiledArgument8 = new CompiledArgument();
        new CompiledArgument.Builder(Query.l0);
        CompiledArgument compiledArgument9 = new CompiledArgument();
        new CompiledArgument.Builder(Query.r0);
        builder42.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, compiledArgument5, compiledArgument6, compiledArgument7, compiledArgument8, compiledArgument9, new CompiledArgument());
        builder42.e = listR36;
        __root = CollectionsKt.Q(builder42.c());
        $stable = 8;
    }

    private ProductsBySearchQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
