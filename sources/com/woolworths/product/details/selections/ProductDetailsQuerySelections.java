package com.woolworths.product.details.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.ContentCta;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.CouponBannerTermsAndConditions;
import au.com.woolworths.shop.graphql.type.FormattedBannerStyle;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.HealthierLink;
import au.com.woolworths.shop.graphql.type.HealthierLinkedInfo;
import au.com.woolworths.shop.graphql.type.HealthierOption;
import au.com.woolworths.shop.graphql.type.HorizontalListItem;
import au.com.woolworths.shop.graphql.type.ImageContent;
import au.com.woolworths.shop.graphql.type.InfoSection;
import au.com.woolworths.shop.graphql.type.InfoSectionFooter;
import au.com.woolworths.shop.graphql.type.InfoSectionItem;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerAction;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MarketplaceEducationBottomSheet;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.ProductDetails;
import au.com.woolworths.shop.graphql.type.ProductDetailsFeedItem;
import au.com.woolworths.shop.graphql.type.ProductImage;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsSummaryCta;
import au.com.woolworths.shop.graphql.type.PromotionContent;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsPreviewResponse;
import au.com.woolworths.shop.graphql.type.RatingsAndReviewsPreviewSections;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledArgumentDefinition;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import fragment.selections.RatingsAndReviewsPreviewCtaSelections;
import fragment.selections.RatingsAndReviewsPreviewHeaderSelections;
import fragment.selections.RatingsAndReviewsRatingsDetailsSelections;
import fragment.selections.RatingsAndReviewsReviewDetailsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b6\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/woolworths/product/details/selections/ProductDetailsQuerySelections;", "", "<init>", "()V", "__onActionableCard", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__couponBannerTermsAndConditions", "__onCouponBanner", "__onFormattedBanner", "__onProductCard", "__action", "__onInsetBanner", "__ratingText", "__ctaText", "__action1", "__cta", "__onProductRatingsAndReviewsSummary", "__action3", "__banner", "__onPromotionMarkdownContent", "__promotionContent", "__onPromotionBanner", "__onFormattedContent", "__onProductDisclaimer", "__countryOfOrigin", "__healthStarRating", "__onProductOriginAndHealthInfo", "__onProductNutritionInfo", "__items", "__footer", "__info", "__primaryCta", "__secondaryCta", "__bottomSheet", "__onProductDetailsMarketplace", "__links", "__linkedInfo", "__productCard", "__healthStarRating1", "__healthierOptions", "__onHealthierHorizontalList", "__onDividerCard", "__buttons", "__onFooter", "__onProductCard1", "__items1", "__onProductHorizontalList", "__feed", "__imageList", "__productDetails", "__onRatingsAndReviewsPreviewHeader", "__onRatingsAndReviewsRatingsDetails", "__onRatingsAndReviewsReviewDetails", "__onRatingsAndReviewsPreviewCta", "__sections", "__productRatingsAndReviewsPreview", "__root", "get__root", "()Ljava/util/List;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductDetailsQuerySelections INSTANCE = new ProductDetailsQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __action;

    @NotNull
    private static final List<CompiledSelection> __action1;

    @NotNull
    private static final List<CompiledSelection> __action3;

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __bottomSheet;

    @NotNull
    private static final List<CompiledSelection> __buttons;

    @NotNull
    private static final List<CompiledSelection> __countryOfOrigin;

    @NotNull
    private static final List<CompiledSelection> __couponBannerTermsAndConditions;

    @NotNull
    private static final List<CompiledSelection> __cta;

    @NotNull
    private static final List<CompiledSelection> __ctaText;

    @NotNull
    private static final List<CompiledSelection> __feed;

    @NotNull
    private static final List<CompiledSelection> __footer;

    @NotNull
    private static final List<CompiledSelection> __healthStarRating;

    @NotNull
    private static final List<CompiledSelection> __healthStarRating1;

    @NotNull
    private static final List<CompiledSelection> __healthierOptions;

    @NotNull
    private static final List<CompiledSelection> __imageList;

    @NotNull
    private static final List<CompiledSelection> __info;

    @NotNull
    private static final List<CompiledSelection> __items;

    @NotNull
    private static final List<CompiledSelection> __items1;

    @NotNull
    private static final List<CompiledSelection> __linkedInfo;

    @NotNull
    private static final List<CompiledSelection> __links;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard;

    @NotNull
    private static final List<CompiledSelection> __onCouponBanner;

    @NotNull
    private static final List<CompiledSelection> __onDividerCard;

    @NotNull
    private static final List<CompiledSelection> __onFooter;

    @NotNull
    private static final List<CompiledSelection> __onFormattedBanner;

    @NotNull
    private static final List<CompiledSelection> __onFormattedContent;

    @NotNull
    private static final List<CompiledSelection> __onHealthierHorizontalList;

    @NotNull
    private static final List<CompiledSelection> __onInsetBanner;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __onProductCard1;

    @NotNull
    private static final List<CompiledSelection> __onProductDetailsMarketplace;

    @NotNull
    private static final List<CompiledSelection> __onProductDisclaimer;

    @NotNull
    private static final List<CompiledSelection> __onProductHorizontalList;

    @NotNull
    private static final List<CompiledSelection> __onProductNutritionInfo;

    @NotNull
    private static final List<CompiledSelection> __onProductOriginAndHealthInfo;

    @NotNull
    private static final List<CompiledSelection> __onProductRatingsAndReviewsSummary;

    @NotNull
    private static final List<CompiledSelection> __onPromotionBanner;

    @NotNull
    private static final List<CompiledSelection> __onPromotionMarkdownContent;

    @NotNull
    private static final List<CompiledSelection> __onRatingsAndReviewsPreviewCta;

    @NotNull
    private static final List<CompiledSelection> __onRatingsAndReviewsPreviewHeader;

    @NotNull
    private static final List<CompiledSelection> __onRatingsAndReviewsRatingsDetails;

    @NotNull
    private static final List<CompiledSelection> __onRatingsAndReviewsReviewDetails;

    @NotNull
    private static final List<CompiledSelection> __primaryCta;

    @NotNull
    private static final List<CompiledSelection> __productCard;

    @NotNull
    private static final List<CompiledSelection> __productDetails;

    @NotNull
    private static final List<CompiledSelection> __productRatingsAndReviewsPreview;

    @NotNull
    private static final List<CompiledSelection> __promotionContent;

    @NotNull
    private static final List<CompiledSelection> __ratingText;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __secondaryCta;

    @NotNull
    private static final List<CompiledSelection> __sections;

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
        List<CompiledSelection> listR2 = CollectionsKt.R(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        __couponBannerTermsAndConditions = listR2;
        CouponBannerColorTheme.e.getClass();
        CompiledField compiledFieldC6 = new CompiledField.Builder("couponBannerColorTheme", CompiledGraphQL.b(CouponBannerColorTheme.f)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("couponBannerCouponCode", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("couponBannerDescription", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("couponBannerImage", customScalarType);
        CompiledField compiledFieldC9 = new CompiledField.Builder("couponBannerMinimumSpend", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("couponBannerTermsAndConditions", CompiledGraphQL.b(CouponBannerTermsAndConditions.f11296a));
        builder.e = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldG, compiledFieldC9, builder.c());
        __onCouponBanner = listR3;
        CompiledField compiledFieldC10 = new CompiledField.Builder("hasIcon", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c();
        FormattedBannerStyle.e.getClass();
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC10, compiledFieldC11, new CompiledField.Builder("style", CompiledGraphQL.b(FormattedBannerStyle.f)).c());
        __onFormattedBanner = listR4;
        CompiledField compiledFieldC12 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        List list = ProductCardSelections.A;
        builder2.b(list);
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC12, builder2.a());
        __onProductCard = listR5;
        InsetBannerActionPlacement.e.getClass();
        EnumType enumType = InsetBannerActionPlacement.f;
        CompiledField compiledFieldC13 = new CompiledField.Builder("placement", CompiledGraphQL.b(enumType)).c();
        InsetBannerActionType.e.getClass();
        EnumType enumType2 = InsetBannerActionType.f;
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldC13, new CompiledField.Builder("type", CompiledGraphQL.b(enumType2)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action = listR6;
        InsetBannerDisplayType.e.getClass();
        EnumType enumType3 = InsetBannerDisplayType.f;
        CompiledField compiledFieldC14 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType3)).c();
        CompiledField compiledFieldC15 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC16 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField compiledFieldG2 = d.g("iconUrl", customScalarType);
        ObjectType objectType = InsetBannerAction.f11510a;
        CompiledField.Builder builder3 = new CompiledField.Builder(UrlHandler.ACTION, objectType);
        builder3.e = listR6;
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC14, compiledFieldC15, compiledFieldC16, compiledFieldG2, builder3.c());
        __onInsetBanner = listR7;
        List<CompiledSelection> listR8 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __ratingText = listR8;
        List<CompiledSelection> listR9 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __ctaText = listR9;
        ActionType.e.getClass();
        List<CompiledSelection> listR10 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        __action1 = listR10;
        ObjectType objectType2 = TextWithAlt.f11967a;
        CompiledField.Builder builder4 = new CompiledField.Builder("ctaText", CompiledGraphQL.b(objectType2));
        builder4.e = listR9;
        CompiledField compiledFieldC17 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(Action.f10997a));
        builder5.e = listR10;
        List<CompiledSelection> listR11 = CollectionsKt.R(compiledFieldC17, builder5.c());
        __cta = listR11;
        CustomScalarType customScalarType3 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC18 = new CompiledField.Builder("averageRatings", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldC19 = new CompiledField.Builder("displayRatings", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldC20 = new CompiledField.Builder("maximumRating", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("ratingText", CompiledGraphQL.b(objectType2));
        builder6.e = listR8;
        CompiledField compiledFieldC21 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("cta", ProductRatingsAndReviewsSummaryCta.f11767a);
        builder7.e = listR11;
        List<CompiledSelection> listR12 = CollectionsKt.R(compiledFieldC18, compiledFieldC19, compiledFieldC20, compiledFieldC21, builder7.c());
        __onProductRatingsAndReviewsSummary = listR12;
        List<CompiledSelection> listR13 = CollectionsKt.R(new CompiledField.Builder("placement", CompiledGraphQL.b(enumType)).c(), new CompiledField.Builder("type", CompiledGraphQL.b(enumType2)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        __action3 = listR13;
        CompiledField compiledFieldC22 = new CompiledField.Builder("displayType", CompiledGraphQL.b(enumType3)).c();
        CompiledField compiledFieldC23 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG3 = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldC24 = new CompiledField.Builder("title", customScalarType).c();
        CompiledField.Builder builder8 = new CompiledField.Builder(UrlHandler.ACTION, objectType);
        builder8.e = listR13;
        List<CompiledSelection> listR14 = CollectionsKt.R(compiledFieldC22, compiledFieldC23, compiledFieldG3, compiledFieldC24, builder8.c());
        __banner = listR14;
        List<CompiledSelection> listR15 = CollectionsKt.R(new CompiledField.Builder("promotionMarkdownTitle", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("promotionMarkdownText", CompiledGraphQL.b(customScalarType)).c());
        __onPromotionMarkdownContent = listR15;
        CompiledField compiledFieldC25 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("PromotionMarkdownContent", CollectionsKt.Q("PromotionMarkdownContent"));
        builder9.d = listR15;
        List<CompiledSelection> listR16 = CollectionsKt.R(compiledFieldC25, builder9.a());
        __promotionContent = listR16;
        CompiledField.Builder builder10 = new CompiledField.Builder("banner", CompiledGraphQL.b(InsetBanner.f11509a));
        builder10.e = listR14;
        CompiledField compiledFieldC26 = builder10.c();
        CompiledField.Builder builder11 = new CompiledField.Builder("promotionContent", PromotionContent.f11800a);
        builder11.e = listR16;
        List<CompiledSelection> listR17 = CollectionsKt.R(compiledFieldC26, builder11.c());
        __onPromotionBanner = listR17;
        List<CompiledSelection> listR18 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c(), d.g("framedContent", customScalarType), new CompiledField.Builder("isCollapsable", CompiledGraphQL.b(customScalarType2)).c());
        __onFormattedContent = listR18;
        List<CompiledSelection> listQ = CollectionsKt.Q(new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        __onProductDisclaimer = listQ;
        List<CompiledSelection> listR19 = CollectionsKt.R(d.g("url", customScalarType), d.g(TextBundle.TEXT_ENTRY, customScalarType), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __countryOfOrigin = listR19;
        List<CompiledSelection> listR20 = CollectionsKt.R(d.g("url", customScalarType), d.g(TextBundle.TEXT_ENTRY, customScalarType), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __healthStarRating = listR20;
        ObjectType objectType3 = ImageContent.f11485a;
        CompiledField.Builder builder12 = new CompiledField.Builder("countryOfOrigin", objectType3);
        builder12.e = listR19;
        CompiledField compiledFieldC27 = builder12.c();
        CompiledField.Builder builder13 = new CompiledField.Builder("healthStarRating", objectType3);
        builder13.e = listR20;
        List<CompiledSelection> listR21 = CollectionsKt.R(compiledFieldC27, builder13.c());
        __onProductOriginAndHealthInfo = listR21;
        List<CompiledSelection> listR22 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("servingsPerPack", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("servingSize", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("bottomCaption", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("tableHeaderRow", a.e(customScalarType)).c(), new CompiledField.Builder("tableRows", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(customScalarType)))))).c());
        __onProductNutritionInfo = listR22;
        List<CompiledSelection> listR23 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c());
        __items = listR23;
        List<CompiledSelection> listR24 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("linkUrl", CompiledGraphQL.b(customScalarType)).c());
        __footer = listR24;
        CompiledField compiledFieldC28 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder14 = new CompiledField.Builder("items", a.f(InfoSectionItem.f11497a));
        builder14.e = listR23;
        CompiledField compiledFieldC29 = builder14.c();
        CompiledField.Builder builder15 = new CompiledField.Builder("footer", InfoSectionFooter.f11496a);
        builder15.e = listR24;
        List<CompiledSelection> listR25 = CollectionsKt.R(compiledFieldC28, compiledFieldC29, builder15.c());
        __info = listR25;
        List<CompiledSelection> listQ2 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __primaryCta = listQ2;
        List<CompiledSelection> listQ3 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        __secondaryCta = listQ3;
        CompiledField compiledFieldC30 = new CompiledField.Builder("bottomSheetTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC31 = new CompiledField.Builder("bottomSheetBody", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType4 = ContentCta.f11282a;
        CompiledField.Builder builder16 = new CompiledField.Builder("primaryCta", objectType4);
        builder16.e = listQ2;
        CompiledField compiledFieldC32 = builder16.c();
        CompiledField.Builder builder17 = new CompiledField.Builder("secondaryCta", objectType4);
        builder17.e = listQ3;
        List<CompiledSelection> listR26 = CollectionsKt.R(compiledFieldC30, compiledFieldC31, compiledFieldC32, builder17.c(), d.g("showOnceOnly", customScalarType2));
        __bottomSheet = listR26;
        CompiledField compiledFieldC33 = new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC34 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC35 = new CompiledField.Builder("dispatchNote", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC36 = new CompiledField.Builder("sellerName", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC37 = new CompiledField.Builder("brandName", CompiledGraphQL.b(customScalarType)).c();
        ProductListChannelType.e.getClass();
        CompiledField compiledFieldC38 = new CompiledField.Builder("channel", CompiledGraphQL.b(ProductListChannelType.f)).c();
        ProductListFacetType.e.getClass();
        CompiledField compiledFieldC39 = new CompiledField.Builder("facet", CompiledGraphQL.b(ProductListFacetType.f)).c();
        CompiledField.Builder builder18 = new CompiledField.Builder("info", InfoSection.f11495a);
        builder18.e = listR25;
        CompiledField compiledFieldC40 = builder18.c();
        CompiledField.Builder builder19 = new CompiledField.Builder("bottomSheet", MarketplaceEducationBottomSheet.f11556a);
        builder19.e = listR26;
        List<CompiledSelection> listR27 = CollectionsKt.R(compiledFieldC33, compiledFieldC34, compiledFieldC35, compiledFieldC36, compiledFieldC37, compiledFieldC38, compiledFieldC39, compiledFieldC40, builder19.c());
        __onProductDetailsMarketplace = listR27;
        List<CompiledSelection> listR28 = CollectionsKt.R(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        __links = listR28;
        CompiledField compiledFieldC41 = new CompiledField.Builder("buttonLabel", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC42 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC43 = new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder20 = new CompiledField.Builder("markdownContent", customScalarType);
        builder20.c = a.s("isMarkdownEnabled", false);
        CompiledField compiledFieldC44 = builder20.c();
        CompiledField.Builder builder21 = new CompiledField.Builder("links", a.f(HealthierLink.f11447a));
        builder21.e = listR28;
        List<CompiledSelection> listR29 = CollectionsKt.R(compiledFieldC41, compiledFieldC42, compiledFieldC43, compiledFieldC44, builder21.c());
        __linkedInfo = listR29;
        CompiledField compiledFieldC45 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder22 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder22.b(list);
        List<CompiledSelection> listR30 = CollectionsKt.R(compiledFieldC45, builder22.a());
        __productCard = listR30;
        List<CompiledSelection> listR31 = CollectionsKt.R(d.g("url", customScalarType), d.g(TextBundle.TEXT_ENTRY, customScalarType), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        __healthStarRating1 = listR31;
        CompiledField.Builder builder23 = new CompiledField.Builder("productCard", CompiledGraphQL.b(ProductCard.f11717a));
        builder23.e = listR30;
        CompiledField compiledFieldC46 = builder23.c();
        CompiledField.Builder builder24 = new CompiledField.Builder("healthStarRating", objectType3);
        builder24.e = listR31;
        List<CompiledSelection> listR32 = CollectionsKt.R(compiledFieldC46, builder24.c());
        __healthierOptions = listR32;
        CompiledField compiledFieldC47 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG4 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField.Builder builder25 = new CompiledField.Builder("linkedInfo", HealthierLinkedInfo.f11448a);
        builder25.e = listR29;
        CompiledField compiledFieldC48 = builder25.c();
        CompiledField.Builder builder26 = new CompiledField.Builder("healthierOptions", a.f(HealthierOption.f11449a));
        builder26.e = listR32;
        List<CompiledSelection> listR33 = CollectionsKt.R(compiledFieldC47, compiledFieldG4, compiledFieldC48, builder26.c());
        __onHealthierHorizontalList = listR33;
        List<CompiledSelection> listQ4 = CollectionsKt.Q(new CompiledField.Builder("_", customScalarType2).c());
        __onDividerCard = listQ4;
        CompiledField compiledFieldC49 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG5 = d.g(UrlHandler.ACTION, customScalarType);
        ButtonStyle.e.getClass();
        List<CompiledSelection> listR34 = CollectionsKt.R(compiledFieldC49, compiledFieldG5, new CompiledField.Builder("style", ButtonStyle.f).c(), new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c());
        __buttons = listR34;
        CompiledField.Builder builder27 = new CompiledField.Builder("buttons", CompiledGraphQL.b(CompiledGraphQL.a(Button.f11080a)));
        builder27.e = listR34;
        List<CompiledSelection> listQ5 = CollectionsKt.Q(builder27.c());
        __onFooter = listQ5;
        CompiledField compiledFieldC50 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder28 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder28.b(list);
        List<CompiledSelection> listR35 = CollectionsKt.R(compiledFieldC50, builder28.a());
        __onProductCard1 = listR35;
        CompiledField compiledFieldC51 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder29 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder29.d = listR35;
        List<CompiledSelection> listR36 = CollectionsKt.R(compiledFieldC51, builder29.a());
        __items1 = listR36;
        CompiledField compiledFieldC52 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG6 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldG7 = d.g("deepLink", customScalarType);
        CompiledField compiledFieldG8 = d.g("actionTitle", customScalarType);
        CompiledField.Builder builder30 = new CompiledField.Builder("items", d.j(HorizontalListItem.f11475a));
        builder30.e = listR36;
        List<CompiledSelection> listR37 = CollectionsKt.R(compiledFieldC52, compiledFieldG6, compiledFieldG7, compiledFieldG8, builder30.c());
        __onProductHorizontalList = listR37;
        CompiledField compiledFieldC53 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment compiledFragmentI = d.i("includeActionableCard", false, new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard")), listR);
        CompiledFragment.Builder builder31 = new CompiledFragment.Builder("CouponBanner", CollectionsKt.Q("CouponBanner"));
        builder31.b(listR3);
        CompiledFragment compiledFragmentA = builder31.a();
        CompiledFragment.Builder builder32 = new CompiledFragment.Builder("FormattedBanner", CollectionsKt.Q("FormattedBanner"));
        builder32.b(listR4);
        CompiledFragment compiledFragmentA2 = builder32.a();
        CompiledFragment.Builder builder33 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder33.b(listR5);
        CompiledFragment compiledFragmentA3 = builder33.a();
        CompiledFragment.Builder builder34 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder34.b(listR7);
        CompiledFragment compiledFragmentA4 = builder34.a();
        CompiledFragment compiledFragmentI2 = d.i("isRatingsAndReviewsSummaryEnabled", false, new CompiledFragment.Builder("ProductRatingsAndReviewsSummary", CollectionsKt.Q("ProductRatingsAndReviewsSummary")), listR12);
        CompiledFragment.Builder builder35 = new CompiledFragment.Builder("PromotionBanner", CollectionsKt.Q("PromotionBanner"));
        builder35.b(listR17);
        CompiledFragment compiledFragmentA5 = builder35.a();
        CompiledFragment.Builder builder36 = new CompiledFragment.Builder("FormattedContent", CollectionsKt.Q("FormattedContent"));
        builder36.b(listR18);
        CompiledFragment compiledFragmentA6 = builder36.a();
        CompiledFragment.Builder builder37 = new CompiledFragment.Builder("ProductDisclaimer", CollectionsKt.Q("ProductDisclaimer"));
        builder37.b(listQ);
        CompiledFragment compiledFragmentA7 = builder37.a();
        CompiledFragment.Builder builder38 = new CompiledFragment.Builder("ProductOriginAndHealthInfo", CollectionsKt.Q("ProductOriginAndHealthInfo"));
        builder38.b(listR21);
        CompiledFragment compiledFragmentA8 = builder38.a();
        CompiledFragment.Builder builder39 = new CompiledFragment.Builder("ProductNutritionInfo", CollectionsKt.Q("ProductNutritionInfo"));
        builder39.b(listR22);
        CompiledFragment compiledFragmentA9 = builder39.a();
        CompiledFragment.Builder builder40 = new CompiledFragment.Builder("ProductDetailsMarketplace", CollectionsKt.Q("ProductDetailsMarketplace"));
        builder40.b(listR27);
        CompiledFragment compiledFragmentA10 = builder40.a();
        CompiledFragment.Builder builder41 = new CompiledFragment.Builder("HealthierHorizontalList", CollectionsKt.Q("HealthierHorizontalList"));
        builder41.b(listR33);
        CompiledFragment compiledFragmentA11 = builder41.a();
        CompiledFragment.Builder builder42 = new CompiledFragment.Builder("DividerCard", CollectionsKt.Q("DividerCard"));
        builder42.b(listQ4);
        CompiledFragment compiledFragmentA12 = builder42.a();
        CompiledFragment.Builder builder43 = new CompiledFragment.Builder("Footer", CollectionsKt.Q("Footer"));
        builder43.b(listQ5);
        CompiledFragment compiledFragmentA13 = builder43.a();
        CompiledFragment.Builder builder44 = new CompiledFragment.Builder("ProductHorizontalList", CollectionsKt.Q("ProductHorizontalList"));
        builder44.b(listR37);
        List<CompiledSelection> listR38 = CollectionsKt.R(compiledFieldC53, compiledFragmentI, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, compiledFragmentI2, compiledFragmentA5, compiledFragmentA6, compiledFragmentA7, compiledFragmentA8, compiledFragmentA9, compiledFragmentA10, compiledFragmentA11, compiledFragmentA12, compiledFragmentA13, builder44.a());
        __feed = listR38;
        List<CompiledSelection> listR39 = CollectionsKt.R(new CompiledField.Builder("largeUrl", GraphQLString.Companion.a()).c(), new CompiledField.Builder("altText", GraphQLString.Companion.a()).c());
        __imageList = listR39;
        UnionType unionType = ProductDetailsFeedItem.f11725a;
        CompiledField.Builder builder45 = new CompiledField.Builder("feed", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductDetailsFeedItem.f11725a))));
        builder45.e(listR38);
        CompiledField compiledFieldC54 = builder45.c();
        CompiledField.Builder builder46 = new CompiledField.Builder("imageList", CompiledGraphQL.b(CompiledGraphQL.a(ProductImage.f11745a)));
        builder46.e(listR39);
        List<CompiledSelection> listR40 = CollectionsKt.R(compiledFieldC54, builder46.c());
        __productDetails = listR40;
        CompiledField compiledFieldC55 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder47 = new CompiledFragment.Builder("RatingsAndReviewsPreviewHeader", CollectionsKt.Q("RatingsAndReviewsPreviewHeader"));
        builder47.b(RatingsAndReviewsPreviewHeaderSelections.f23834a);
        List<CompiledSelection> listR41 = CollectionsKt.R(compiledFieldC55, builder47.a());
        __onRatingsAndReviewsPreviewHeader = listR41;
        CompiledField compiledFieldC56 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder48 = new CompiledFragment.Builder("RatingsAndReviewsRatingsDetails", CollectionsKt.Q("RatingsAndReviewsRatingsDetails"));
        builder48.b(RatingsAndReviewsRatingsDetailsSelections.l);
        List<CompiledSelection> listR42 = CollectionsKt.R(compiledFieldC56, builder48.a());
        __onRatingsAndReviewsRatingsDetails = listR42;
        CompiledField compiledFieldC57 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder49 = new CompiledFragment.Builder("RatingsAndReviewsReviewDetails", CollectionsKt.Q("RatingsAndReviewsReviewDetails"));
        builder49.b(RatingsAndReviewsReviewDetailsSelections.h);
        List<CompiledSelection> listR43 = CollectionsKt.R(compiledFieldC57, builder49.a());
        __onRatingsAndReviewsReviewDetails = listR43;
        CompiledField compiledFieldC58 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder50 = new CompiledFragment.Builder("RatingsAndReviewsPreviewCta", CollectionsKt.Q("RatingsAndReviewsPreviewCta"));
        builder50.b(RatingsAndReviewsPreviewCtaSelections.c);
        List<CompiledSelection> listR44 = CollectionsKt.R(compiledFieldC58, builder50.a());
        __onRatingsAndReviewsPreviewCta = listR44;
        CompiledField compiledFieldC59 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder51 = new CompiledFragment.Builder("RatingsAndReviewsPreviewHeader", CollectionsKt.Q("RatingsAndReviewsPreviewHeader"));
        builder51.b(listR41);
        CompiledFragment compiledFragmentA14 = builder51.a();
        CompiledFragment.Builder builder52 = new CompiledFragment.Builder("RatingsAndReviewsRatingsDetails", CollectionsKt.Q("RatingsAndReviewsRatingsDetails"));
        builder52.b(listR42);
        CompiledFragment compiledFragmentA15 = builder52.a();
        CompiledFragment.Builder builder53 = new CompiledFragment.Builder("RatingsAndReviewsReviewDetails", CollectionsKt.Q("RatingsAndReviewsReviewDetails"));
        builder53.b(listR43);
        CompiledFragment compiledFragmentA16 = builder53.a();
        CompiledFragment.Builder builder54 = new CompiledFragment.Builder("RatingsAndReviewsPreviewCta", CollectionsKt.Q("RatingsAndReviewsPreviewCta"));
        builder54.b(listR44);
        List<CompiledSelection> listR45 = CollectionsKt.R(compiledFieldC59, compiledFragmentA14, compiledFragmentA15, compiledFragmentA16, builder54.a());
        __sections = listR45;
        CompiledField.Builder builder55 = new CompiledField.Builder("sections", d.j(RatingsAndReviewsPreviewSections.f11818a));
        builder55.e(listR45);
        List<CompiledSelection> listQ6 = CollectionsKt.Q(builder55.c());
        __productRatingsAndReviewsPreview = listQ6;
        ObjectType objectType5 = ProductDetails.f11721a;
        CompiledField.Builder builder56 = new CompiledField.Builder("productDetails", ProductDetails.f11721a);
        CompiledArgumentDefinition compiledArgumentDefinition = Query.f11808a;
        new CompiledArgument.Builder(Query.L);
        CompiledArgument compiledArgumentA = CompiledArgument.Builder.a();
        new CompiledArgument.Builder(Query.M);
        CompiledArgument compiledArgumentA2 = CompiledArgument.Builder.a();
        new CompiledArgument.Builder(Query.K);
        CompiledArgument compiledArgumentA3 = CompiledArgument.Builder.a();
        new CompiledArgument.Builder(Query.N);
        CompiledArgument compiledArgumentA4 = CompiledArgument.Builder.a();
        new CompiledArgument.Builder(Query.O);
        builder56.b(CollectionsKt.R(compiledArgumentA, compiledArgumentA2, compiledArgumentA3, compiledArgumentA4, CompiledArgument.Builder.a()));
        builder56.e(listR40);
        CompiledField compiledFieldC60 = builder56.c();
        CompiledField.Builder builder57 = new CompiledField.Builder("productRatingsAndReviewsPreview", RatingsAndReviewsPreviewResponse.f11817a);
        builder57.d(CollectionsKt.Q(new CompiledCondition("isRatingsAndReviewsSummaryEnabled", false)));
        new CompiledArgument.Builder(Query.f1);
        builder57.b(CollectionsKt.Q(CompiledArgument.Builder.a()));
        builder57.e(listQ6);
        __root = CollectionsKt.R(compiledFieldC60, builder57.c());
        $stable = 8;
    }

    private ProductDetailsQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
