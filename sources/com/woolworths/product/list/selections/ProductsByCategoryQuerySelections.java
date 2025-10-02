package com.woolworths.product.list.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
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
import au.com.woolworths.shop.graphql.type.ImageWithAlt;
import au.com.woolworths.shop.graphql.type.InfoSection;
import au.com.woolworths.shop.graphql.type.InfoSectionFooter;
import au.com.woolworths.shop.graphql.type.InfoSectionItem;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MarketplaceEducationBottomSheet;
import au.com.woolworths.shop.graphql.type.ProductFilter;
import au.com.woolworths.shop.graphql.type.ProductFilterSwitch;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListAnalytics;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
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
import com.woolworths.product.list.fragment.selections.InsetBannerSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/woolworths/product/list/selections/ProductsByCategoryQuerySelections;", "", "<init>", "()V", "__onAdobeTargetAnalytics", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__analytics", "__onActionableCard", "__onGoogleAdBannerCard", "__googleAdBannerCard", "__onActionableCard1", "__nextBestAction", "__onUniversalInventoryContainer", "__onProductCard", "__merchCardFullImageAction", "__merchCardFullImageBackgroundImageWithAlt", "__buttonAction", "__merchCardFullImageButton", "__onMerchCardFullImage", "__items", "__onHorizontalList", "__action2", "__onInsetBanner", "__onProductCard1", "__productsFeed", "__filterItems", "__action3", "__banner", "__filters", "__sortOptions", "__sortOptionsBanner", "__buttonCta", "__marketplaceFilterSwitch", "__items1", "__footer", "__marketplaceInfo", "__primaryCta", "__secondaryCta", "__marketplaceBottomSheet", "__text", "__chips", "__productsByCategory", "__root", "get__root", "()Ljava/util/List;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductsByCategoryQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductsByCategoryQuerySelections INSTANCE = new ProductsByCategoryQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __action2;

    @NotNull
    private static final List<CompiledSelection> __action3;

    @NotNull
    private static final List<CompiledSelection> __analytics;

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __buttonAction;

    @NotNull
    private static final List<CompiledSelection> __buttonCta;

    @NotNull
    private static final List<CompiledSelection> __chips;

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
    private static final List<CompiledSelection> __marketplaceBottomSheet;

    @NotNull
    private static final List<CompiledSelection> __marketplaceFilterSwitch;

    @NotNull
    private static final List<CompiledSelection> __marketplaceInfo;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageAction;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageBackgroundImageWithAlt;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageButton;

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
    private static final List<CompiledSelection> __onMerchCardFullImage;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __onProductCard1;

    @NotNull
    private static final List<CompiledSelection> __onUniversalInventoryContainer;

    @NotNull
    private static final List<CompiledSelection> __primaryCta;

    @NotNull
    private static final List<CompiledSelection> __productsByCategory;

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
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, new CompiledField.Builder("targeting", customScalarType4).c(), d.g("correlator", customScalarType));
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
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        List list = ProductCardSelections.A;
        builder5.b(list);
        List<CompiledSelection> listR9 = CollectionsKt.R(compiledFieldC14, builder5.a());
        __onProductCard = listR9;
        CompiledField compiledFieldC15 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        ActionType.e.getClass();
        EnumType enumType2 = ActionType.f;
        List<CompiledSelection> listR10 = CollectionsKt.R(compiledFieldC15, new CompiledField.Builder("type", CompiledGraphQL.b(enumType2)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        __merchCardFullImageAction = listR10;
        List<CompiledSelection> listR11 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __merchCardFullImageBackgroundImageWithAlt = listR11;
        List<CompiledSelection> listR12 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("type", CompiledGraphQL.b(enumType2)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        __buttonAction = listR12;
        CompiledField compiledFieldC16 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG2 = d.g("buttonId", customScalarType);
        CompiledField compiledFieldC17 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        CompiledField compiledFieldC18 = new CompiledField.Builder("style", ButtonStyle.f).c();
        CompiledField compiledFieldC19 = new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldG3 = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldG4 = d.g("altText", customScalarType);
        ObjectType objectType = Action.f10997a;
        CompiledField.Builder builder6 = new CompiledField.Builder("buttonAction", objectType);
        builder6.e = listR12;
        List<CompiledSelection> listR13 = CollectionsKt.R(compiledFieldC16, compiledFieldG2, compiledFieldC17, compiledFieldC18, compiledFieldC19, compiledFieldG3, compiledFieldG4, builder6.c());
        __merchCardFullImageButton = listR13;
        CompiledField compiledFieldC20 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder7 = new CompiledField.Builder("merchCardFullImageAction", objectType);
        builder7.e = listR10;
        CompiledField compiledFieldC21 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("merchCardFullImageBackgroundImageWithAlt", CompiledGraphQL.b(ImageWithAlt.f11487a));
        builder8.e = listR11;
        CompiledField compiledFieldC22 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("merchCardFullImageButton", Button.f11080a);
        builder9.e = listR13;
        List<CompiledSelection> listR14 = CollectionsKt.R(compiledFieldC20, compiledFieldC21, compiledFieldC22, builder9.c(), d.g("merchCardFullImageTitle", customScalarType), d.g("merchCardFullImageDescription", customScalarType));
        __onMerchCardFullImage = listR14;
        CompiledField compiledFieldC23 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder10.d = listR9;
        CompiledFragment compiledFragmentA = builder10.a();
        CompiledFragment.Builder builder11 = new CompiledFragment.Builder("MerchCardFullImage", CollectionsKt.Q("MerchCardFullImage"));
        builder11.d = listR14;
        List<CompiledSelection> listR15 = CollectionsKt.R(compiledFieldC23, compiledFragmentA, builder11.a());
        __items = listR15;
        CompiledField compiledFieldC24 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC25 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG5 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldG6 = d.g("actionTitle", customScalarType);
        CompiledField compiledFieldG7 = d.g("deepLink", customScalarType);
        CompiledField.Builder builder12 = new CompiledField.Builder("items", d.j(HorizontalListItem.f11475a));
        builder12.e = listR15;
        List<CompiledSelection> listR16 = CollectionsKt.R(compiledFieldC24, compiledFieldC25, compiledFieldG5, compiledFieldG6, compiledFieldG7, builder12.c());
        __onHorizontalList = listR16;
        InsetBannerActionPlacement.e.getClass();
        EnumType enumType3 = InsetBannerActionPlacement.f;
        CompiledField compiledFieldC26 = new CompiledField.Builder("placement", CompiledGraphQL.b(enumType3)).c();
        InsetBannerActionType.e.getClass();
        EnumType enumType4 = InsetBannerActionType.f;
        List<CompiledSelection> listR17 = CollectionsKt.R(compiledFieldC26, new CompiledField.Builder("type", CompiledGraphQL.b(enumType4)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action2 = listR17;
        InsetBannerDisplayType.e.getClass();
        EnumType enumType5 = InsetBannerDisplayType.f;
        CompiledField compiledFieldC27 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType5)).c();
        CompiledField compiledFieldC28 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC29 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG8 = d.g("iconUrl", customScalarType);
        ObjectType objectType2 = InsetBannerAction.f11510a;
        CompiledField.Builder builder13 = new CompiledField.Builder(UrlHandler.ACTION, objectType2);
        builder13.e = listR17;
        List<CompiledSelection> listR18 = CollectionsKt.R(compiledFieldC27, compiledFieldC28, compiledFieldC29, compiledFieldG8, builder13.c());
        __onInsetBanner = listR18;
        CompiledField compiledFieldC30 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder14 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder14.b(list);
        List<CompiledSelection> listR19 = CollectionsKt.R(compiledFieldC30, builder14.a());
        __onProductCard1 = listR19;
        CompiledField compiledFieldC31 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder15 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder15.d = listR3;
        CompiledFragment compiledFragmentA2 = builder15.a();
        CompiledFragment.Builder builder16 = new CompiledFragment.Builder("GoogleAdBannerCard", CollectionsKt.Q("GoogleAdBannerCard"));
        builder16.c = a.s("includeUniversalInventoryFallback", true);
        builder16.d = listR4;
        CompiledFragment compiledFragmentA3 = builder16.a();
        CompiledFragment.Builder builder17 = new CompiledFragment.Builder("UniversalInventoryContainer", CollectionsKt.Q("UniversalInventoryContainer"));
        builder17.c = a.s("includeUniversalInventoryFallback", false);
        builder17.d = listR8;
        CompiledFragment compiledFragmentA4 = builder17.a();
        CompiledFragment.Builder builder18 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder18.c = a.s("includeHorizontalList", false);
        builder18.d = listR16;
        CompiledFragment compiledFragmentA5 = builder18.a();
        CompiledFragment.Builder builder19 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder19.d = listR18;
        CompiledFragment compiledFragmentA6 = builder19.a();
        CompiledFragment.Builder builder20 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder20.d = listR19;
        List<CompiledSelection> listR20 = CollectionsKt.R(compiledFieldC31, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, compiledFragmentA5, compiledFragmentA6, builder20.a());
        __productsFeed = listR20;
        List<CompiledSelection> listR21 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("parentKey", customScalarType), new CompiledField.Builder("hasChildren", CompiledGraphQL.b(customScalarType3)).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType3)).c());
        __filterItems = listR21;
        List<CompiledSelection> listR22 = CollectionsKt.R(new CompiledField.Builder("placement", CompiledGraphQL.b(enumType3)).c(), new CompiledField.Builder("type", CompiledGraphQL.b(enumType4)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action3 = listR22;
        CompiledField compiledFieldC32 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType5)).c();
        CompiledField compiledFieldC33 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC34 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG9 = d.g("iconUrl", customScalarType);
        CompiledField.Builder builder21 = new CompiledField.Builder(UrlHandler.ACTION, objectType2);
        builder21.e = listR22;
        List<CompiledSelection> listR23 = CollectionsKt.R(compiledFieldC32, compiledFieldC33, compiledFieldC34, compiledFieldG9, builder21.c());
        __banner = listR23;
        CompiledField compiledFieldC35 = new CompiledField.Builder("headerKey", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC36 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder22 = new CompiledField.Builder("filterItems", a.f(FilterMenuItem.f11386a));
        builder22.e = listR21;
        CompiledField compiledFieldC37 = builder22.c();
        ObjectType objectType3 = InsetBanner.f11509a;
        CompiledField.Builder builder23 = new CompiledField.Builder("banner", objectType3);
        builder23.e = listR23;
        List<CompiledSelection> listR24 = CollectionsKt.R(compiledFieldC35, compiledFieldC36, compiledFieldC37, builder23.c());
        __filters = listR24;
        List<CompiledSelection> listR25 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType3)).c());
        __sortOptions = listR25;
        CompiledField compiledFieldC38 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder24 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder24.b(InsetBannerSelections.INSTANCE.get__root());
        List<CompiledSelection> listR26 = CollectionsKt.R(compiledFieldC38, builder24.a());
        __sortOptionsBanner = listR26;
        List<CompiledSelection> listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __buttonCta = listQ;
        CompiledField compiledFieldC39 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG10 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldG11 = d.g("imageUrl", customScalarType);
        ObjectType objectType4 = ContentCta.f11282a;
        CompiledField.Builder builder25 = new CompiledField.Builder("buttonCta", objectType4);
        builder25.e = listQ;
        List<CompiledSelection> listR27 = CollectionsKt.R(compiledFieldC39, compiledFieldG10, compiledFieldG11, builder25.c(), new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType3)).c());
        __marketplaceFilterSwitch = listR27;
        List<CompiledSelection> listR28 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c());
        __items1 = listR28;
        List<CompiledSelection> listR29 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("linkUrl", CompiledGraphQL.b(customScalarType)).c());
        __footer = listR29;
        CompiledField compiledFieldC40 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder26 = new CompiledField.Builder("items", a.f(InfoSectionItem.f11497a));
        builder26.e = listR28;
        CompiledField compiledFieldC41 = builder26.c();
        CompiledField.Builder builder27 = new CompiledField.Builder("footer", InfoSectionFooter.f11496a);
        builder27.e = listR29;
        List<CompiledSelection> listR30 = CollectionsKt.R(compiledFieldC40, compiledFieldC41, builder27.c());
        __marketplaceInfo = listR30;
        List<CompiledSelection> listQ2 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __primaryCta = listQ2;
        List<CompiledSelection> listQ3 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __secondaryCta = listQ3;
        CompiledField compiledFieldC42 = new CompiledField.Builder("bottomSheetTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC43 = new CompiledField.Builder("bottomSheetBody", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder28 = new CompiledField.Builder("primaryCta", objectType4);
        builder28.e = listQ2;
        CompiledField compiledFieldC44 = builder28.c();
        CompiledField.Builder builder29 = new CompiledField.Builder("secondaryCta", objectType4);
        builder29.e = listQ3;
        List<CompiledSelection> listR31 = CollectionsKt.R(compiledFieldC42, compiledFieldC43, compiledFieldC44, builder29.c(), d.g("showOnceOnly", customScalarType3));
        __marketplaceBottomSheet = listR31;
        List<CompiledSelection> listR32 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __text = listR32;
        CompiledField compiledFieldC45 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField compiledFieldC46 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField.Builder builder30 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(TextWithAlt.f11967a));
        builder30.e = listR32;
        List<CompiledSelection> listR33 = CollectionsKt.R(compiledFieldC45, compiledFieldC46, builder30.c());
        __chips = listR33;
        CustomScalarType customScalarType5 = GraphQLInt.f11442a;
        CompiledField compiledFieldC47 = new CompiledField.Builder("totalNumberOfProducts", customScalarType5).c();
        CompiledField compiledFieldG12 = d.g("nextPage", customScalarType5);
        CompiledField.Builder builder31 = new CompiledField.Builder("analytics", CompiledGraphQL.a(CompiledGraphQL.b(ProductListAnalytics.f11750a)));
        builder31.e = listR2;
        CompiledField compiledFieldC48 = builder31.c();
        CompiledField.Builder builder32 = new CompiledField.Builder("productsFeed", d.j(ProductListFeed.f11751a));
        builder32.e = listR20;
        CompiledField compiledFieldC49 = builder32.c();
        CompiledField.Builder builder33 = new CompiledField.Builder("filters", a.f(ProductFilter.f11739a));
        builder33.e = listR24;
        CompiledField compiledFieldC50 = builder33.c();
        CompiledField.Builder builder34 = new CompiledField.Builder("sortOptions", a.f(ProductSortOption.f11786a));
        builder34.e = listR25;
        CompiledField compiledFieldC51 = builder34.c();
        CompiledField.Builder builder35 = new CompiledField.Builder("sortOptionsBanner", objectType3);
        builder35.c = a.s("includeUnitPriceInsetBanner", false);
        builder35.e = listR26;
        CompiledField compiledFieldC52 = builder35.c();
        CompiledField.Builder builder36 = new CompiledField.Builder("marketplaceFilterSwitch", ProductFilterSwitch.f11741a);
        builder36.e = listR27;
        CompiledField compiledFieldC53 = builder36.c();
        CompiledField.Builder builder37 = new CompiledField.Builder("marketplaceInfo", InfoSection.f11495a);
        builder37.e = listR30;
        CompiledField compiledFieldC54 = builder37.c();
        CompiledField.Builder builder38 = new CompiledField.Builder("marketplaceBottomSheet", MarketplaceEducationBottomSheet.f11556a);
        builder38.e = listR31;
        CompiledField compiledFieldC55 = builder38.c();
        CompiledField.Builder builder39 = new CompiledField.Builder("chips", CompiledGraphQL.a(CompiledGraphQL.b(Chip.f11271a)));
        builder39.e = listR33;
        List<CompiledSelection> listR34 = CollectionsKt.R(compiledFieldC47, compiledFieldG12, compiledFieldC48, compiledFieldC49, compiledFieldC50, compiledFieldC51, compiledFieldC52, compiledFieldC53, compiledFieldC54, compiledFieldC55, builder39.c());
        __productsByCategory = listR34;
        CompiledField.Builder builder40 = new CompiledField.Builder("productsByCategory", ProductList.f11749a);
        new CompiledArgument.Builder(Query.Q);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.Z);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Query.W);
        CompiledArgument compiledArgument3 = new CompiledArgument();
        new CompiledArgument.Builder(Query.U);
        CompiledArgument compiledArgument4 = new CompiledArgument();
        new CompiledArgument.Builder(Query.T);
        CompiledArgument compiledArgument5 = new CompiledArgument();
        new CompiledArgument.Builder(Query.S);
        CompiledArgument compiledArgument6 = new CompiledArgument();
        new CompiledArgument.Builder(Query.V);
        CompiledArgument compiledArgument7 = new CompiledArgument();
        new CompiledArgument.Builder(Query.Y);
        CompiledArgument compiledArgument8 = new CompiledArgument();
        new CompiledArgument.Builder(Query.R);
        CompiledArgument compiledArgument9 = new CompiledArgument();
        new CompiledArgument.Builder(Query.X);
        builder40.d = CollectionsKt.R(compiledArgument, compiledArgument2, compiledArgument3, compiledArgument4, compiledArgument5, compiledArgument6, compiledArgument7, compiledArgument8, compiledArgument9, new CompiledArgument());
        builder40.e = listR34;
        __root = CollectionsKt.Q(builder40.c());
        $stable = 8;
    }

    private ProductsByCategoryQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
