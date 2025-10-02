package com.woolworths.product.list.legacy.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.Analytics;
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
import au.com.woolworths.shop.graphql.type.Link;
import au.com.woolworths.shop.graphql.type.MarketplaceEducationBottomSheet;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.ProductCategoryTile;
import au.com.woolworths.shop.graphql.type.ProductFilter;
import au.com.woolworths.shop.graphql.type.ProductFilterSwitch;
import au.com.woolworths.shop.graphql.type.ProductList;
import au.com.woolworths.shop.graphql.type.ProductListAnalytics;
import au.com.woolworths.shop.graphql.type.ProductListFeed;
import au.com.woolworths.shop.graphql.type.ProductListZeroResult;
import au.com.woolworths.shop.graphql.type.ProductListZeroResultItem;
import au.com.woolworths.shop.graphql.type.ProductListZeroResults;
import au.com.woolworths.shop.graphql.type.ProductSortOption;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import au.com.woolworths.shop.graphql.type.TextWithAlt;
import au.com.woolworths.shop.graphql.type.UniversalInventoryNextBestAction;
import au.com.woolworths.shop.graphql.type.VideoAd;
import au.com.woolworths.shop.graphql.type.VideoAdBottomSheet;
import au.com.woolworths.shop.graphql.type.VideoAdEventAnalytics;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.list.legacy.fragment.selections.InsetBannerSelections;
import com.woolworths.product.list.legacy.fragment.selections.VideoAdBottomSheetSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bh\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\bl\u0010m¨\u0006n"}, d2 = {"Lcom/woolworths/product/list/legacy/selections/ProductListQuerySelections;", "", "<init>", "()V", "__onAdobeTargetAnalytics", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__analytics", "__onActionableCard", "__onGoogleAdBannerCard", "__googleAdBannerCard", "__onActionableCard1", "__analytics3", "__bannerButtonAction", "__bannerButtonLabel", "__analytics4", "__bannerAction", "__bannerAnalytics", "__bannerImpressionAnalytics", "__commonAnalytics", "__onEdrOfferBanner", "__bannerImage", "__products", "__analytics5", "__bannerAction1", "__bannerAnalytics1", "__bannerImpressionAnalytics1", "__onPersonalisedProductsBanner", "__nextBestAction", "__onUniversalInventoryContainer", "__onProductCard", "__merchCardFullImageAction", "__merchCardFullImageBackgroundImageWithAlt", "__buttonAction", "__merchCardFullImageButton", "__onMerchCardFullImage", "__items", "__onHorizontalList", "__fallbackImage", "__transcript", "__termsAndConditions", "__analytics6", "__impression", "__videoPlay", "__videoPause", "__videoErrorImpression", "__eventAnalytics", "__videoAdUnitVideoAd", "__videoAdUnitProductCard", "__onVideoAdUnit", "__merchCardGridImageWithAlt", "__merchCardListImageWithAlt", "__analytics7", "__buttonAction1", "__merchCardButton", "__analytics8", "__merchCardAction", "__merchCardAnalytics", "__merchCardImpressionAnalytics", "__onMerchCard", "__action7", "__onInsetBanner", "__onProductCard1", "__productsFeed", "__filterItems", "__action8", "__banner", "__filters", "__sortOptions", "__sortOptionsBanner", "__buttonCta", "__marketplaceFilterSwitch", "__items1", "__footer", "__marketplaceInfo", "__primaryCta", "__secondaryCta", "__marketplaceBottomSheet", "__text1", "__chips", "__text3", "__facetChips", "__productCategoryTileAction", "__zeroResultProductCategoriesItems", "__onZeroResultProductCategories", "__onProductCard2", "__items3", "__onHorizontalList1", "__items2", "__zeroResultContent", "__productCategoryTileAction1", "__zeroResultProductCategoriesItems1", "__onZeroResultProductCategories1", "__onProductCard3", "__items5", "__onHorizontalList2", "__items4", "__onProductListZeroResult", "__analytics9", "__impressionAnalytics", "__linkTextWithAlt", "__analytics10", "__linkAction", "__cta", "__onProductListFullScreenError", "__zeroResult", "__productList", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductListQuerySelections {
    public static final int $stable;

    @NotNull
    public static final ProductListQuerySelections INSTANCE = new ProductListQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __action7;

    @NotNull
    private static final List<CompiledSelection> __action8;

    @NotNull
    private static final List<CompiledSelection> __analytics;

    @NotNull
    private static final List<CompiledSelection> __analytics10;

    @NotNull
    private static final List<CompiledSelection> __analytics3;

    @NotNull
    private static final List<CompiledSelection> __analytics4;

    @NotNull
    private static final List<CompiledSelection> __analytics5;

    @NotNull
    private static final List<CompiledSelection> __analytics6;

    @NotNull
    private static final List<CompiledSelection> __analytics7;

    @NotNull
    private static final List<CompiledSelection> __analytics8;

    @NotNull
    private static final List<CompiledSelection> __analytics9;

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __bannerAction;

    @NotNull
    private static final List<CompiledSelection> __bannerAction1;

    @NotNull
    private static final List<CompiledSelection> __bannerAnalytics;

    @NotNull
    private static final List<CompiledSelection> __bannerAnalytics1;

    @NotNull
    private static final List<CompiledSelection> __bannerButtonAction;

    @NotNull
    private static final List<CompiledSelection> __bannerButtonLabel;

    @NotNull
    private static final List<CompiledSelection> __bannerImage;

    @NotNull
    private static final List<CompiledSelection> __bannerImpressionAnalytics;

    @NotNull
    private static final List<CompiledSelection> __bannerImpressionAnalytics1;

    @NotNull
    private static final List<CompiledSelection> __buttonAction;

    @NotNull
    private static final List<CompiledSelection> __buttonAction1;

    @NotNull
    private static final List<CompiledSelection> __buttonCta;

    @NotNull
    private static final List<CompiledSelection> __chips;

    @NotNull
    private static final List<CompiledSelection> __commonAnalytics;

    @NotNull
    private static final List<CompiledSelection> __cta;

    @NotNull
    private static final List<CompiledSelection> __eventAnalytics;

    @NotNull
    private static final List<CompiledSelection> __facetChips;

    @NotNull
    private static final List<CompiledSelection> __fallbackImage;

    @NotNull
    private static final List<CompiledSelection> __filterItems;

    @NotNull
    private static final List<CompiledSelection> __filters;

    @NotNull
    private static final List<CompiledSelection> __footer;

    @NotNull
    private static final List<CompiledSelection> __googleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __impression;

    @NotNull
    private static final List<CompiledSelection> __impressionAnalytics;

    @NotNull
    private static final List<CompiledSelection> __items;

    @NotNull
    private static final List<CompiledSelection> __items1;

    @NotNull
    private static final List<CompiledSelection> __items2;

    @NotNull
    private static final List<CompiledSelection> __items3;

    @NotNull
    private static final List<CompiledSelection> __items4;

    @NotNull
    private static final List<CompiledSelection> __items5;

    @NotNull
    private static final List<CompiledSelection> __linkAction;

    @NotNull
    private static final List<CompiledSelection> __linkTextWithAlt;

    @NotNull
    private static final List<CompiledSelection> __marketplaceBottomSheet;

    @NotNull
    private static final List<CompiledSelection> __marketplaceFilterSwitch;

    @NotNull
    private static final List<CompiledSelection> __marketplaceInfo;

    @NotNull
    private static final List<CompiledSelection> __merchCardAction;

    @NotNull
    private static final List<CompiledSelection> __merchCardAnalytics;

    @NotNull
    private static final List<CompiledSelection> __merchCardButton;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageAction;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageBackgroundImageWithAlt;

    @NotNull
    private static final List<CompiledSelection> __merchCardFullImageButton;

    @NotNull
    private static final List<CompiledSelection> __merchCardGridImageWithAlt;

    @NotNull
    private static final List<CompiledSelection> __merchCardImpressionAnalytics;

    @NotNull
    private static final List<CompiledSelection> __merchCardListImageWithAlt;

    @NotNull
    private static final List<CompiledSelection> __nextBestAction;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard;

    @NotNull
    private static final List<CompiledSelection> __onActionableCard1;

    @NotNull
    private static final List<CompiledSelection> __onAdobeTargetAnalytics;

    @NotNull
    private static final List<CompiledSelection> __onEdrOfferBanner;

    @NotNull
    private static final List<CompiledSelection> __onGoogleAdBannerCard;

    @NotNull
    private static final List<CompiledSelection> __onHorizontalList;

    @NotNull
    private static final List<CompiledSelection> __onHorizontalList1;

    @NotNull
    private static final List<CompiledSelection> __onHorizontalList2;

    @NotNull
    private static final List<CompiledSelection> __onInsetBanner;

    @NotNull
    private static final List<CompiledSelection> __onMerchCard;

    @NotNull
    private static final List<CompiledSelection> __onMerchCardFullImage;

    @NotNull
    private static final List<CompiledSelection> __onPersonalisedProductsBanner;

    @NotNull
    private static final List<CompiledSelection> __onProductCard;

    @NotNull
    private static final List<CompiledSelection> __onProductCard1;

    @NotNull
    private static final List<CompiledSelection> __onProductCard2;

    @NotNull
    private static final List<CompiledSelection> __onProductCard3;

    @NotNull
    private static final List<CompiledSelection> __onProductListFullScreenError;

    @NotNull
    private static final List<CompiledSelection> __onProductListZeroResult;

    @NotNull
    private static final List<CompiledSelection> __onUniversalInventoryContainer;

    @NotNull
    private static final List<CompiledSelection> __onVideoAdUnit;

    @NotNull
    private static final List<CompiledSelection> __onZeroResultProductCategories;

    @NotNull
    private static final List<CompiledSelection> __onZeroResultProductCategories1;

    @NotNull
    private static final List<CompiledSelection> __primaryCta;

    @NotNull
    private static final List<CompiledSelection> __productCategoryTileAction;

    @NotNull
    private static final List<CompiledSelection> __productCategoryTileAction1;

    @NotNull
    private static final List<CompiledSelection> __productList;

    @NotNull
    private static final List<CompiledSelection> __products;

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
    private static final List<CompiledSelection> __termsAndConditions;

    @NotNull
    private static final List<CompiledSelection> __text1;

    @NotNull
    private static final List<CompiledSelection> __text3;

    @NotNull
    private static final List<CompiledSelection> __transcript;

    @NotNull
    private static final List<CompiledSelection> __videoAdUnitProductCard;

    @NotNull
    private static final List<CompiledSelection> __videoAdUnitVideoAd;

    @NotNull
    private static final List<CompiledSelection> __videoErrorImpression;

    @NotNull
    private static final List<CompiledSelection> __videoPause;

    @NotNull
    private static final List<CompiledSelection> __videoPlay;

    @NotNull
    private static final List<CompiledSelection> __zeroResult;

    @NotNull
    private static final List<CompiledSelection> __zeroResultContent;

    @NotNull
    private static final List<CompiledSelection> __zeroResultProductCategoriesItems;

    @NotNull
    private static final List<CompiledSelection> __zeroResultProductCategoriesItems1;

    static {
        List<CompiledSelection> listR = CollectionsKt.R(new CompiledField.Builder("tnta", GraphQLString.Companion.a()).c(), new CompiledField.Builder("pe", GraphQLString.Companion.a()).c());
        __onAdobeTargetAnalytics = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("AdobeTargetAnalytics", CollectionsKt.Q("AdobeTargetAnalytics"));
        builder.b(listR);
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        __analytics = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("image", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CardHeight.e.getClass();
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, new CompiledField.Builder("cardHeight", CompiledGraphQL.b(CardHeight.Companion.a())).c(), new CompiledField.Builder("link", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("analytics", TealiumAnalytics.Companion.a()).c(), new CompiledField.Builder("_excluded", GraphQLBoolean.Companion.a()).c());
        __onActionableCard = listR3;
        List<CompiledSelection> listR4 = CollectionsKt.R(new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("targeting", GoogleAdCustomTargeting.Companion.a()).c(), new CompiledField.Builder("iabSize", GraphQLString.Companion.a()).c(), new CompiledField.Builder("correlator", GraphQLString.Companion.a()).c());
        __onGoogleAdBannerCard = listR4;
        CompiledField compiledFieldC4 = new CompiledField.Builder(OutOfContextTestingActivity.AD_UNIT_KEY, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("nativeCustomTemplateId", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("iabSpec", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("iabSize", GraphQLString.Companion.a()).c();
        AdBannerNativeSize.e.getClass();
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldC7, new CompiledField.Builder("height", CompiledGraphQL.b(AdBannerNativeSize.Companion.a())).c(), new CompiledField.Builder("targeting", GoogleAdCustomTargeting.Companion.a()).c(), new CompiledField.Builder("correlator", GraphQLString.Companion.a()).c(), new CompiledField.Builder("_excluded", GraphQLBoolean.Companion.a()).c());
        __googleAdBannerCard = listR5;
        List<CompiledSelection> listR6 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("link", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("image", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("cardHeight", CompiledGraphQL.b(CardHeight.Companion.a())).c(), new CompiledField.Builder("analytics", TealiumAnalytics.Companion.a()).c(), new CompiledField.Builder("_excluded", GraphQLBoolean.Companion.a()).c());
        __onActionableCard1 = listR6;
        List<CompiledSelection> listR7 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics3 = listR7;
        CompiledField compiledFieldC8 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        ActionType.e.getClass();
        CompiledField compiledFieldC9 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        ObjectType objectType = Analytics.f11028a;
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder2.e(listR7);
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldC8, compiledFieldC9, compiledFieldC10, builder2.c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __bannerButtonAction = listR8;
        List<CompiledSelection> listR9 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __bannerButtonLabel = listR9;
        List<CompiledSelection> listR10 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics4 = listR10;
        CompiledField compiledFieldC11 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC12 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField compiledFieldC13 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder3.e(listR10);
        List<CompiledSelection> listR11 = CollectionsKt.R(compiledFieldC11, compiledFieldC12, compiledFieldC13, builder3.c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __bannerAction = listR11;
        List<CompiledSelection> listR12 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __bannerAnalytics = listR12;
        List<CompiledSelection> listR13 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __bannerImpressionAnalytics = listR13;
        List<CompiledSelection> listR14 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __commonAnalytics = listR14;
        CompiledField compiledFieldC14 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC15 = new CompiledField.Builder("offerId", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC16 = new CompiledField.Builder("offerIdV1", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC17 = new CompiledField.Builder("linkedEdrHashCrn", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC18 = new CompiledField.Builder("bannerTitle", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC19 = new CompiledField.Builder("bannerDescription", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC20 = new CompiledField.Builder("bannerIconUrl", GraphQLString.Companion.a()).c();
        ObjectType objectType2 = Action.f10997a;
        CompiledField.Builder builder4 = new CompiledField.Builder("bannerButtonAction", Action.Companion.a());
        builder4.e(listR8);
        CompiledField compiledFieldC21 = builder4.c();
        ObjectType objectType3 = TextWithAlt.f11967a;
        CompiledField.Builder builder5 = new CompiledField.Builder("bannerButtonLabel", TextWithAlt.Companion.a());
        builder5.e(listR9);
        CompiledField compiledFieldC22 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("bannerAction", Action.Companion.a());
        builder6.e(listR11);
        CompiledField compiledFieldC23 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("bannerAnalytics", Analytics.Companion.a());
        builder7.e(listR12);
        CompiledField compiledFieldC24 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("bannerImpressionAnalytics", Analytics.Companion.a());
        builder8.e(listR13);
        CompiledField compiledFieldC25 = builder8.c();
        CompiledField.Builder builder9 = new CompiledField.Builder("commonAnalytics", Analytics.Companion.a());
        builder9.e(listR14);
        List<CompiledSelection> listR15 = CollectionsKt.R(compiledFieldC14, compiledFieldC15, compiledFieldC16, compiledFieldC17, compiledFieldC18, compiledFieldC19, compiledFieldC20, compiledFieldC21, compiledFieldC22, compiledFieldC23, compiledFieldC24, compiledFieldC25, builder9.c());
        __onEdrOfferBanner = listR15;
        List<CompiledSelection> listR16 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __bannerImage = listR16;
        List<CompiledSelection> listR17 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("productId", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("productImage", GraphQLString.Companion.a()).c());
        __products = listR17;
        List<CompiledSelection> listR18 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics5 = listR18;
        CompiledField compiledFieldC26 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC27 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField compiledFieldC28 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder10 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder10.e(listR18);
        List<CompiledSelection> listR19 = CollectionsKt.R(compiledFieldC26, compiledFieldC27, compiledFieldC28, builder10.c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __bannerAction1 = listR19;
        List<CompiledSelection> listR20 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __bannerAnalytics1 = listR20;
        List<CompiledSelection> listR21 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __bannerImpressionAnalytics1 = listR21;
        CompiledField compiledFieldC29 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC30 = new CompiledField.Builder("bannerTitle", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC31 = new CompiledField.Builder("bannerForegroundColour", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC32 = new CompiledField.Builder("bannerBackgroundColour", GraphQLString.Companion.a()).c();
        ObjectType objectType4 = ImageWithAlt.f11487a;
        CompiledField.Builder builder11 = new CompiledField.Builder("bannerImage", ImageWithAlt.Companion.a());
        builder11.e(listR16);
        CompiledField compiledFieldC33 = builder11.c();
        ObjectType objectType5 = ProductCard.f11717a;
        CompiledField.Builder builder12 = new CompiledField.Builder("products", CompiledGraphQL.a(CompiledGraphQL.b(ProductCard.Companion.a())));
        builder12.e(listR17);
        CompiledField compiledFieldC34 = builder12.c();
        CompiledField.Builder builder13 = new CompiledField.Builder("bannerAction", Action.Companion.a());
        builder13.e(listR19);
        CompiledField compiledFieldC35 = builder13.c();
        CompiledField.Builder builder14 = new CompiledField.Builder("bannerAnalytics", Analytics.Companion.a());
        builder14.e(listR20);
        CompiledField compiledFieldC36 = builder14.c();
        CompiledField.Builder builder15 = new CompiledField.Builder("bannerImpressionAnalytics", Analytics.Companion.a());
        builder15.e(listR21);
        List<CompiledSelection> listR22 = CollectionsKt.R(compiledFieldC29, compiledFieldC30, compiledFieldC31, compiledFieldC32, compiledFieldC33, compiledFieldC34, compiledFieldC35, compiledFieldC36, builder15.c());
        __onPersonalisedProductsBanner = listR22;
        CompiledField compiledFieldC37 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder16 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder16.b(listR6);
        List<CompiledSelection> listR23 = CollectionsKt.R(compiledFieldC37, builder16.a(), d.i("includeNhpEdrBanner", false, new CompiledFragment.Builder("EdrOfferBanner", CollectionsKt.Q("EdrOfferBanner")), listR15), d.i("includeNhpPersonalisedProductsBanner", false, new CompiledFragment.Builder("PersonalisedProductsBanner", CollectionsKt.Q("PersonalisedProductsBanner")), listR22));
        __nextBestAction = listR23;
        ObjectType objectType6 = GoogleAdBannerCard.f11435a;
        CompiledField.Builder builder17 = new CompiledField.Builder("googleAdBannerCard", GoogleAdBannerCard.Companion.a());
        builder17.e(listR5);
        CompiledField compiledFieldC38 = builder17.c();
        UnionType unionType = UniversalInventoryNextBestAction.f11980a;
        CompiledField.Builder builder18 = new CompiledField.Builder("nextBestAction", UniversalInventoryNextBestAction.Companion.a());
        builder18.e(listR23);
        List<CompiledSelection> listR24 = CollectionsKt.R(compiledFieldC38, builder18.c());
        __onUniversalInventoryContainer = listR24;
        List<CompiledSelection> listR25 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.h(new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"))));
        __onProductCard = listR25;
        List<CompiledSelection> listR26 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __merchCardFullImageAction = listR26;
        List<CompiledSelection> listR27 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __merchCardFullImageBackgroundImageWithAlt = listR27;
        List<CompiledSelection> listR28 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __buttonAction = listR28;
        CompiledField compiledFieldC39 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC40 = new CompiledField.Builder("buttonId", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC41 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        ButtonStyle.e.getClass();
        CompiledField compiledFieldC42 = new CompiledField.Builder("style", ButtonStyle.Companion.a()).c();
        CompiledField compiledFieldC43 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c();
        CompiledField compiledFieldC44 = new CompiledField.Builder("iconUrl", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC45 = new CompiledField.Builder("altText", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder19 = new CompiledField.Builder("buttonAction", Action.Companion.a());
        builder19.e(listR28);
        List<CompiledSelection> listR29 = CollectionsKt.R(compiledFieldC39, compiledFieldC40, compiledFieldC41, compiledFieldC42, compiledFieldC43, compiledFieldC44, compiledFieldC45, builder19.c());
        __merchCardFullImageButton = listR29;
        CompiledField compiledFieldC46 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder20 = new CompiledField.Builder("merchCardFullImageAction", Action.Companion.a());
        builder20.e(listR26);
        CompiledField compiledFieldC47 = builder20.c();
        CompiledField.Builder builder21 = new CompiledField.Builder("merchCardFullImageBackgroundImageWithAlt", CompiledGraphQL.b(ImageWithAlt.Companion.a()));
        builder21.e(listR27);
        CompiledField compiledFieldC48 = builder21.c();
        ObjectType objectType7 = Button.f11080a;
        CompiledField.Builder builder22 = new CompiledField.Builder("merchCardFullImageButton", Button.Companion.a());
        builder22.e(listR29);
        List<CompiledSelection> listR30 = CollectionsKt.R(compiledFieldC46, compiledFieldC47, compiledFieldC48, builder22.c(), new CompiledField.Builder("merchCardFullImageTitle", GraphQLString.Companion.a()).c(), new CompiledField.Builder("merchCardFullImageDescription", GraphQLString.Companion.a()).c());
        __onMerchCardFullImage = listR30;
        CompiledField compiledFieldC49 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder23 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder23.b(listR25);
        CompiledFragment compiledFragmentA = builder23.a();
        CompiledFragment.Builder builder24 = new CompiledFragment.Builder("MerchCardFullImage", CollectionsKt.Q("MerchCardFullImage"));
        builder24.b(listR30);
        List<CompiledSelection> listR31 = CollectionsKt.R(compiledFieldC49, compiledFragmentA, builder24.a());
        __items = listR31;
        CompiledField compiledFieldC50 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC51 = new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC52 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC53 = new CompiledField.Builder("actionTitle", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC54 = new CompiledField.Builder("deepLink", GraphQLString.Companion.a()).c();
        UnionType unionType2 = HorizontalListItem.f11475a;
        CompiledField.Builder builder25 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(HorizontalListItem.Companion.a()))));
        builder25.e(listR31);
        List<CompiledSelection> listR32 = CollectionsKt.R(compiledFieldC50, compiledFieldC51, compiledFieldC52, compiledFieldC53, compiledFieldC54, builder25.c());
        __onHorizontalList = listR32;
        List<CompiledSelection> listR33 = CollectionsKt.R(new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __fallbackImage = listR33;
        CompiledField compiledFieldC55 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder26 = new CompiledFragment.Builder("VideoAdBottomSheet", CollectionsKt.Q("VideoAdBottomSheet"));
        VideoAdBottomSheetSelections videoAdBottomSheetSelections = VideoAdBottomSheetSelections.INSTANCE;
        builder26.b(videoAdBottomSheetSelections.get__root());
        List<CompiledSelection> listR34 = CollectionsKt.R(compiledFieldC55, builder26.a());
        __transcript = listR34;
        CompiledField compiledFieldC56 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder27 = new CompiledFragment.Builder("VideoAdBottomSheet", CollectionsKt.Q("VideoAdBottomSheet"));
        builder27.b(videoAdBottomSheetSelections.get__root());
        List<CompiledSelection> listR35 = CollectionsKt.R(compiledFieldC56, builder27.a());
        __termsAndConditions = listR35;
        List<CompiledSelection> listR36 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics6 = listR36;
        List<CompiledSelection> listR37 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __impression = listR37;
        List<CompiledSelection> listR38 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __videoPlay = listR38;
        List<CompiledSelection> listR39 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __videoPause = listR39;
        List<CompiledSelection> listR40 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __videoErrorImpression = listR40;
        CompiledField.Builder builder28 = new CompiledField.Builder("impression", Analytics.Companion.a());
        builder28.e(listR37);
        CompiledField compiledFieldC57 = builder28.c();
        CompiledField.Builder builder29 = new CompiledField.Builder("videoPlay", Analytics.Companion.a());
        builder29.e(listR38);
        CompiledField compiledFieldC58 = builder29.c();
        CompiledField.Builder builder30 = new CompiledField.Builder("videoPause", Analytics.Companion.a());
        builder30.e(listR39);
        CompiledField compiledFieldC59 = builder30.c();
        CompiledField.Builder builder31 = new CompiledField.Builder("videoErrorImpression", Analytics.Companion.a());
        builder31.e(listR40);
        List<CompiledSelection> listR41 = CollectionsKt.R(compiledFieldC57, compiledFieldC58, compiledFieldC59, builder31.c());
        __eventAnalytics = listR41;
        CompiledField compiledFieldC60 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC61 = new CompiledField.Builder("url", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder32 = new CompiledField.Builder("fallbackImage", ImageWithAlt.Companion.a());
        builder32.e(listR33);
        CompiledField compiledFieldC62 = builder32.c();
        CompiledField compiledFieldC63 = new CompiledField.Builder("duration", CompiledGraphQL.b(GraphQLInt.Companion.a())).c();
        ObjectType objectType8 = VideoAdBottomSheet.f12008a;
        CompiledField.Builder builder33 = new CompiledField.Builder("transcript", VideoAdBottomSheet.Companion.a());
        builder33.e(listR34);
        CompiledField compiledFieldC64 = builder33.c();
        CompiledField.Builder builder34 = new CompiledField.Builder("termsAndConditions", VideoAdBottomSheet.Companion.a());
        builder34.e(listR35);
        CompiledField compiledFieldC65 = builder34.c();
        CompiledField.Builder builder35 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder35.e(listR36);
        CompiledField compiledFieldC66 = builder35.c();
        CompiledField.Builder builder36 = new CompiledField.Builder("eventAnalytics", VideoAdEventAnalytics.f12009a);
        builder36.e(listR41);
        List<CompiledSelection> listR42 = CollectionsKt.R(compiledFieldC60, compiledFieldC61, compiledFieldC62, compiledFieldC63, compiledFieldC64, compiledFieldC65, compiledFieldC66, builder36.c());
        __videoAdUnitVideoAd = listR42;
        List<CompiledSelection> listR43 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.h(new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"))));
        __videoAdUnitProductCard = listR43;
        CompiledField compiledFieldC67 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder37 = new CompiledField.Builder("videoAdUnitVideoAd", CompiledGraphQL.b(VideoAd.f12007a));
        builder37.e(listR42);
        CompiledField compiledFieldC68 = builder37.c();
        CompiledField.Builder builder38 = new CompiledField.Builder("videoAdUnitProductCard", ProductCard.Companion.a());
        builder38.e(listR43);
        List<CompiledSelection> listR44 = CollectionsKt.R(compiledFieldC67, compiledFieldC68, builder38.c());
        __onVideoAdUnit = listR44;
        List<CompiledSelection> listR45 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __merchCardGridImageWithAlt = listR45;
        List<CompiledSelection> listR46 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __merchCardListImageWithAlt = listR46;
        List<CompiledSelection> listR47 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics7 = listR47;
        CompiledField compiledFieldC69 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC70 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField compiledFieldC71 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC72 = new CompiledField.Builder("id", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder39 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder39.e(listR47);
        List<CompiledSelection> listR48 = CollectionsKt.R(compiledFieldC69, compiledFieldC70, compiledFieldC71, compiledFieldC72, builder39.c());
        __buttonAction1 = listR48;
        CompiledField compiledFieldC73 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC74 = new CompiledField.Builder("buttonId", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC75 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC76 = new CompiledField.Builder("style", ButtonStyle.Companion.a()).c();
        CompiledField compiledFieldC77 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c();
        CompiledField compiledFieldC78 = new CompiledField.Builder("iconUrl", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC79 = new CompiledField.Builder("altText", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder40 = new CompiledField.Builder("buttonAction", Action.Companion.a());
        builder40.e(listR48);
        List<CompiledSelection> listR49 = CollectionsKt.R(compiledFieldC73, compiledFieldC74, compiledFieldC75, compiledFieldC76, compiledFieldC77, compiledFieldC78, compiledFieldC79, builder40.c());
        __merchCardButton = listR49;
        List<CompiledSelection> listR50 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics8 = listR50;
        CompiledField compiledFieldC80 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC81 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField compiledFieldC82 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC83 = new CompiledField.Builder("id", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder41 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder41.e(listR50);
        List<CompiledSelection> listR51 = CollectionsKt.R(compiledFieldC80, compiledFieldC81, compiledFieldC82, compiledFieldC83, builder41.c());
        __merchCardAction = listR51;
        List<CompiledSelection> listR52 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __merchCardAnalytics = listR52;
        List<CompiledSelection> listR53 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __merchCardImpressionAnalytics = listR53;
        CompiledField compiledFieldC84 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder42 = new CompiledField.Builder("merchCardGridImageWithAlt", CompiledGraphQL.b(ImageWithAlt.Companion.a()));
        builder42.e(listR45);
        CompiledField compiledFieldC85 = builder42.c();
        CompiledField.Builder builder43 = new CompiledField.Builder("merchCardListImageWithAlt", CompiledGraphQL.b(ImageWithAlt.Companion.a()));
        builder43.e(listR46);
        CompiledField compiledFieldC86 = builder43.c();
        CompiledField compiledFieldC87 = new CompiledField.Builder("merchCardTitle", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC88 = new CompiledField.Builder("merchCardDescription", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder44 = new CompiledField.Builder("merchCardButton", Button.Companion.a());
        builder44.e(listR49);
        CompiledField compiledFieldC89 = builder44.c();
        CompiledField.Builder builder45 = new CompiledField.Builder("merchCardAction", Action.Companion.a());
        builder45.e(listR51);
        CompiledField compiledFieldC90 = builder45.c();
        CompiledField.Builder builder46 = new CompiledField.Builder("merchCardAnalytics", Analytics.Companion.a());
        builder46.e(listR52);
        CompiledField compiledFieldC91 = builder46.c();
        CompiledField.Builder builder47 = new CompiledField.Builder("merchCardImpressionAnalytics", Analytics.Companion.a());
        builder47.e(listR53);
        List<CompiledSelection> listR54 = CollectionsKt.R(compiledFieldC84, compiledFieldC85, compiledFieldC86, compiledFieldC87, compiledFieldC88, compiledFieldC89, compiledFieldC90, compiledFieldC91, builder47.c());
        __onMerchCard = listR54;
        InsetBannerActionPlacement.e.getClass();
        CompiledField compiledFieldC92 = new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.Companion.a())).c();
        InsetBannerActionType.e.getClass();
        List<CompiledSelection> listR55 = CollectionsKt.R(compiledFieldC92, new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.Companion.a())).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("url", GraphQLString.Companion.a()).c());
        __action7 = listR55;
        InsetBannerDisplayType.e.getClass();
        CompiledField compiledFieldC93 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.Companion.a())).c();
        CompiledField compiledFieldC94 = new CompiledField.Builder("message", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder48 = new CompiledField.Builder("title", GraphQLString.Companion.a());
        builder48.a("bannerTitle");
        CompiledField compiledFieldC95 = builder48.c();
        CompiledField compiledFieldC96 = new CompiledField.Builder("iconUrl", GraphQLString.Companion.a()).c();
        ObjectType objectType9 = InsetBannerAction.f11510a;
        CompiledField.Builder builder49 = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.Companion.a());
        builder49.e(listR55);
        List<CompiledSelection> listR56 = CollectionsKt.R(compiledFieldC93, compiledFieldC94, compiledFieldC95, compiledFieldC96, builder49.c());
        __onInsetBanner = listR56;
        List<CompiledSelection> listR57 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.h(new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"))));
        __onProductCard1 = listR57;
        CompiledField compiledFieldC97 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder50 = new CompiledFragment.Builder("ActionableCard", CollectionsKt.Q("ActionableCard"));
        builder50.b(listR3);
        CompiledFragment compiledFragmentA2 = builder50.a();
        CompiledFragment compiledFragmentI = d.i("includeUniversalInventoryFallback", true, new CompiledFragment.Builder("GoogleAdBannerCard", CollectionsKt.Q("GoogleAdBannerCard")), listR4);
        CompiledFragment compiledFragmentI2 = d.i("includeUniversalInventoryFallback", false, new CompiledFragment.Builder("UniversalInventoryContainer", CollectionsKt.Q("UniversalInventoryContainer")), listR24);
        CompiledFragment compiledFragmentI3 = d.i("includeHorizontalList", false, new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList")), listR32);
        CompiledFragment compiledFragmentI4 = d.i("includeVideoAdUnit", false, new CompiledFragment.Builder("VideoAdUnit", CollectionsKt.Q("VideoAdUnit")), listR44);
        CompiledFragment compiledFragmentI5 = d.i("includeMerchCard", false, new CompiledFragment.Builder("MerchCard", CollectionsKt.Q("MerchCard")), listR54);
        CompiledFragment.Builder builder51 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder51.b(listR56);
        CompiledFragment compiledFragmentA3 = builder51.a();
        CompiledFragment.Builder builder52 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder52.b(listR57);
        List<CompiledSelection> listR58 = CollectionsKt.R(compiledFieldC97, compiledFragmentA2, compiledFragmentI, compiledFragmentI2, compiledFragmentI3, compiledFragmentI4, compiledFragmentI5, compiledFragmentA3, builder52.a());
        __productsFeed = listR58;
        List<CompiledSelection> listR59 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("parentKey", GraphQLString.Companion.a()).c(), new CompiledField.Builder("hasChildren", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c());
        __filterItems = listR59;
        List<CompiledSelection> listR60 = CollectionsKt.R(new CompiledField.Builder("placement", CompiledGraphQL.b(InsetBannerActionPlacement.Companion.a())).c(), new CompiledField.Builder("type", CompiledGraphQL.b(InsetBannerActionType.Companion.a())).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("url", GraphQLString.Companion.a()).c());
        __action8 = listR60;
        CompiledField compiledFieldC98 = new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.Companion.a())).c();
        CompiledField compiledFieldC99 = new CompiledField.Builder("message", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC100 = new CompiledField.Builder("iconUrl", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder53 = new CompiledField.Builder(UrlHandler.ACTION, InsetBannerAction.Companion.a());
        builder53.e(listR60);
        CompiledField compiledFieldC101 = builder53.c();
        CompiledField.Builder builder54 = new CompiledField.Builder("title", GraphQLString.Companion.a());
        builder54.a("bannerTitle");
        List<CompiledSelection> listR61 = CollectionsKt.R(compiledFieldC98, compiledFieldC99, compiledFieldC100, compiledFieldC101, builder54.c());
        __banner = listR61;
        CompiledField compiledFieldC102 = new CompiledField.Builder("headerKey", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC103 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        ObjectType objectType10 = FilterMenuItem.f11386a;
        CompiledField.Builder builder55 = new CompiledField.Builder("filterItems", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(FilterMenuItem.Companion.a()))));
        builder55.e(listR59);
        CompiledField compiledFieldC104 = builder55.c();
        ObjectType objectType11 = InsetBanner.f11509a;
        CompiledField.Builder builder56 = new CompiledField.Builder("banner", InsetBanner.Companion.a());
        builder56.e(listR61);
        List<CompiledSelection> listR62 = CollectionsKt.R(compiledFieldC102, compiledFieldC103, compiledFieldC104, builder56.c());
        __filters = listR62;
        List<CompiledSelection> listR63 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, GraphQLString.Companion.a()).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c());
        __sortOptions = listR63;
        CompiledField compiledFieldC105 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder57 = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder57.b(InsetBannerSelections.INSTANCE.get__root());
        List<CompiledSelection> listR64 = CollectionsKt.R(compiledFieldC105, builder57.a());
        __sortOptionsBanner = listR64;
        List<CompiledSelection> listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __buttonCta = listQ;
        CompiledField compiledFieldC106 = new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC107 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC108 = new CompiledField.Builder("imageUrl", GraphQLString.Companion.a()).c();
        ObjectType objectType12 = ContentCta.f11282a;
        CompiledField.Builder builder58 = new CompiledField.Builder("buttonCta", ContentCta.Companion.a());
        builder58.e(listQ);
        List<CompiledSelection> listR65 = CollectionsKt.R(compiledFieldC106, compiledFieldC107, compiledFieldC108, builder58.c(), new CompiledField.Builder("value", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c());
        __marketplaceFilterSwitch = listR65;
        List<CompiledSelection> listR66 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __items1 = listR66;
        List<CompiledSelection> listR67 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("linkUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __footer = listR67;
        CompiledField compiledFieldC109 = new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        ObjectType objectType13 = InfoSectionItem.f11497a;
        CompiledField.Builder builder59 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(InfoSectionItem.Companion.a()))));
        builder59.e(listR66);
        CompiledField compiledFieldC110 = builder59.c();
        ObjectType objectType14 = InfoSectionFooter.f11496a;
        CompiledField.Builder builder60 = new CompiledField.Builder("footer", InfoSectionFooter.Companion.a());
        builder60.e(listR67);
        List<CompiledSelection> listR68 = CollectionsKt.R(compiledFieldC109, compiledFieldC110, builder60.c());
        __marketplaceInfo = listR68;
        List<CompiledSelection> listQ2 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __primaryCta = listQ2;
        List<CompiledSelection> listQ3 = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __secondaryCta = listQ3;
        CompiledField compiledFieldC111 = new CompiledField.Builder("bottomSheetTitle", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC112 = new CompiledField.Builder("bottomSheetBody", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder61 = new CompiledField.Builder("primaryCta", ContentCta.Companion.a());
        builder61.e(listQ2);
        CompiledField compiledFieldC113 = builder61.c();
        CompiledField.Builder builder62 = new CompiledField.Builder("secondaryCta", ContentCta.Companion.a());
        builder62.e(listQ3);
        List<CompiledSelection> listR69 = CollectionsKt.R(compiledFieldC111, compiledFieldC112, compiledFieldC113, builder62.c(), new CompiledField.Builder("showOnceOnly", GraphQLBoolean.Companion.a()).c());
        __marketplaceBottomSheet = listR69;
        List<CompiledSelection> listR70 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __text1 = listR70;
        CompiledField compiledFieldC114 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.Companion.a())).c();
        CompiledField compiledFieldC115 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c();
        CompiledField.Builder builder63 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(TextWithAlt.Companion.a()));
        builder63.e(listR70);
        CompiledField compiledFieldC116 = builder63.c();
        CompiledField.Builder builder64 = new CompiledField.Builder("persistentId", GraphQLString.Companion.a());
        builder64.d(CollectionsKt.Q(new CompiledCondition("includeProductListPersistentChip", false)));
        List<CompiledSelection> listR71 = CollectionsKt.R(compiledFieldC114, compiledFieldC115, compiledFieldC116, builder64.c());
        __chips = listR71;
        List<CompiledSelection> listR72 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __text3 = listR72;
        CompiledField compiledFieldC117 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.Companion.a())).c();
        CompiledField compiledFieldC118 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(GraphQLBoolean.Companion.a())).c();
        CompiledField.Builder builder65 = new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(TextWithAlt.Companion.a()));
        builder65.e(listR72);
        List<CompiledSelection> listR73 = CollectionsKt.R(compiledFieldC117, compiledFieldC118, builder65.c());
        __facetChips = listR73;
        List<CompiledSelection> listR74 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __productCategoryTileAction = listR74;
        CompiledField.Builder builder66 = new CompiledField.Builder("productCategoryTileAction", CompiledGraphQL.b(Action.Companion.a()));
        builder66.e(listR74);
        List<CompiledSelection> listR75 = CollectionsKt.R(builder66.c(), new CompiledField.Builder("productCategoryTileImageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("productCategoryTileLabel", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __zeroResultProductCategoriesItems = listR75;
        CompiledField compiledFieldC119 = new CompiledField.Builder("zeroResultProductCategoriesTitle", GraphQLString.Companion.a()).c();
        ObjectType objectType15 = ProductCategoryTile.f11720a;
        CompiledField.Builder builder67 = new CompiledField.Builder("zeroResultProductCategoriesItems", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductCategoryTile.Companion.a()))));
        builder67.e(listR75);
        List<CompiledSelection> listR76 = CollectionsKt.R(compiledFieldC119, builder67.c());
        __onZeroResultProductCategories = listR76;
        List<CompiledSelection> listR77 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.h(new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"))));
        __onProductCard2 = listR77;
        CompiledField compiledFieldC120 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder68 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder68.b(listR77);
        List<CompiledSelection> listR78 = CollectionsKt.R(compiledFieldC120, builder68.a());
        __items3 = listR78;
        CompiledField compiledFieldC121 = new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder69 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(HorizontalListItem.Companion.a()))));
        builder69.e(listR78);
        List<CompiledSelection> listR79 = CollectionsKt.R(compiledFieldC121, builder69.c());
        __onHorizontalList1 = listR79;
        CompiledField compiledFieldC122 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder70 = new CompiledFragment.Builder("ZeroResultProductCategories", CollectionsKt.Q("ZeroResultProductCategories"));
        builder70.b(listR76);
        CompiledFragment compiledFragmentA4 = builder70.a();
        CompiledFragment.Builder builder71 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder71.b(listR79);
        List<CompiledSelection> listR80 = CollectionsKt.R(compiledFieldC122, compiledFragmentA4, builder71.a());
        __items2 = listR80;
        CompiledField compiledFieldC123 = new CompiledField.Builder("title", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC124 = new CompiledField.Builder("message", GraphQLString.Companion.a()).c();
        UnionType unionType3 = ProductListZeroResultItem.f11757a;
        CompiledField.Builder builder72 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductListZeroResultItem.Companion.a()))));
        builder72.e(listR80);
        List<CompiledSelection> listR81 = CollectionsKt.R(compiledFieldC123, compiledFieldC124, builder72.c());
        __zeroResultContent = listR81;
        List<CompiledSelection> listR82 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("id", GraphQLString.Companion.a()).c());
        __productCategoryTileAction1 = listR82;
        CompiledField.Builder builder73 = new CompiledField.Builder("productCategoryTileAction", CompiledGraphQL.b(Action.Companion.a()));
        builder73.e(listR82);
        List<CompiledSelection> listR83 = CollectionsKt.R(builder73.c(), new CompiledField.Builder("productCategoryTileImageUrl", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("productCategoryTileLabel", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __zeroResultProductCategoriesItems1 = listR83;
        CompiledField compiledFieldC125 = new CompiledField.Builder("zeroResultProductCategoriesTitle", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder74 = new CompiledField.Builder("zeroResultProductCategoriesItems", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductCategoryTile.Companion.a()))));
        builder74.e(listR83);
        List<CompiledSelection> listR84 = CollectionsKt.R(compiledFieldC125, builder74.c());
        __onZeroResultProductCategories1 = listR84;
        List<CompiledSelection> listR85 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.h(new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"))));
        __onProductCard3 = listR85;
        CompiledField compiledFieldC126 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder75 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder75.b(listR85);
        List<CompiledSelection> listR86 = CollectionsKt.R(compiledFieldC126, builder75.a());
        __items5 = listR86;
        CompiledField compiledFieldC127 = new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField.Builder builder76 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(HorizontalListItem.Companion.a()))));
        builder76.e(listR86);
        List<CompiledSelection> listR87 = CollectionsKt.R(compiledFieldC127, builder76.c());
        __onHorizontalList2 = listR87;
        CompiledField compiledFieldC128 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder77 = new CompiledFragment.Builder("ZeroResultProductCategories", CollectionsKt.Q("ZeroResultProductCategories"));
        builder77.b(listR84);
        CompiledFragment compiledFragmentA5 = builder77.a();
        CompiledFragment.Builder builder78 = new CompiledFragment.Builder("HorizontalList", CollectionsKt.Q("HorizontalList"));
        builder78.b(listR87);
        List<CompiledSelection> listR88 = CollectionsKt.R(compiledFieldC128, compiledFragmentA5, builder78.a());
        __items4 = listR88;
        CompiledField compiledFieldC129 = new CompiledField.Builder("title", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC130 = new CompiledField.Builder("message", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder79 = new CompiledField.Builder("items", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductListZeroResultItem.Companion.a()))));
        builder79.e(listR88);
        List<CompiledSelection> listR89 = CollectionsKt.R(compiledFieldC129, compiledFieldC130, builder79.c());
        __onProductListZeroResult = listR89;
        List<CompiledSelection> listR90 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics9 = listR90;
        List<CompiledSelection> listR91 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __impressionAnalytics = listR91;
        List<CompiledSelection> listR92 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(GraphQLString.Companion.a())).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(GraphQLString.Companion.a())).c());
        __linkTextWithAlt = listR92;
        List<CompiledSelection> listR93 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c(), d.D(new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"))));
        __analytics10 = listR93;
        CompiledField compiledFieldC131 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledField compiledFieldC132 = new CompiledField.Builder("id", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC133 = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.Companion.a())).c();
        CompiledField.Builder builder80 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder80.e(listR93);
        List<CompiledSelection> listR94 = CollectionsKt.R(compiledFieldC131, compiledFieldC132, compiledFieldC133, builder80.c());
        __linkAction = listR94;
        CompiledField compiledFieldC134 = new CompiledField.Builder("linkId", GraphQLString.Companion.a()).c();
        CompiledField.Builder builder81 = new CompiledField.Builder("linkTextWithAlt", CompiledGraphQL.b(TextWithAlt.Companion.a()));
        builder81.e(listR92);
        CompiledField compiledFieldC135 = builder81.c();
        CompiledField.Builder builder82 = new CompiledField.Builder("linkAction", CompiledGraphQL.b(Action.Companion.a()));
        builder82.e(listR94);
        List<CompiledSelection> listR95 = CollectionsKt.R(compiledFieldC134, compiledFieldC135, builder82.c());
        __cta = listR95;
        CompiledField.Builder builder83 = new CompiledField.Builder("analytics", Analytics.Companion.a());
        builder83.e(listR90);
        CompiledField compiledFieldC136 = builder83.c();
        CompiledField.Builder builder84 = new CompiledField.Builder("impressionAnalytics", Analytics.Companion.a());
        builder84.e(listR91);
        CompiledField compiledFieldC137 = builder84.c();
        CompiledField compiledFieldC138 = new CompiledField.Builder("image", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC139 = new CompiledField.Builder("title", GraphQLString.Companion.a()).c();
        CompiledField compiledFieldC140 = new CompiledField.Builder(lqlqqlq.mmm006Dm006Dm, GraphQLString.Companion.a()).c();
        ObjectType objectType16 = Link.f11514a;
        CompiledField.Builder builder85 = new CompiledField.Builder("cta", Link.Companion.a());
        builder85.e(listR95);
        List<CompiledSelection> listR96 = CollectionsKt.R(compiledFieldC136, compiledFieldC137, compiledFieldC138, compiledFieldC139, compiledFieldC140, builder85.c());
        __onProductListFullScreenError = listR96;
        CompiledField compiledFieldC141 = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.Companion.a())).c();
        CompiledFragment.Builder builder86 = new CompiledFragment.Builder("ProductListZeroResult", CollectionsKt.Q("ProductListZeroResult"));
        builder86.b(listR89);
        CompiledFragment compiledFragmentA6 = builder86.a();
        CompiledFragment.Builder builder87 = new CompiledFragment.Builder("ProductListFullScreenError", CollectionsKt.Q("ProductListFullScreenError"));
        builder87.b(listR96);
        List<CompiledSelection> listR97 = CollectionsKt.R(compiledFieldC141, compiledFragmentA6, builder87.a());
        __zeroResult = listR97;
        CompiledField compiledFieldC142 = new CompiledField.Builder("totalNumberOfProducts", GraphQLInt.Companion.a()).c();
        CompiledField compiledFieldC143 = new CompiledField.Builder("nextPage", GraphQLInt.Companion.a()).c();
        CompiledField compiledFieldC144 = new CompiledField.Builder("pageTitle", GraphQLString.Companion.a()).c();
        UnionType unionType4 = ProductListAnalytics.f11750a;
        CompiledField.Builder builder88 = new CompiledField.Builder("analytics", CompiledGraphQL.a(CompiledGraphQL.b(ProductListAnalytics.Companion.a())));
        builder88.e(listR2);
        CompiledField compiledFieldC145 = builder88.c();
        UnionType unionType5 = ProductListFeed.f11751a;
        CompiledField.Builder builder89 = new CompiledField.Builder("productsFeed", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductListFeed.Companion.a()))));
        builder89.e(listR58);
        CompiledField compiledFieldC146 = builder89.c();
        ObjectType objectType17 = ProductFilter.f11739a;
        CompiledField.Builder builder90 = new CompiledField.Builder("filters", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductFilter.Companion.a()))));
        builder90.e(listR62);
        CompiledField compiledFieldC147 = builder90.c();
        ObjectType objectType18 = ProductSortOption.f11786a;
        CompiledField.Builder builder91 = new CompiledField.Builder("sortOptions", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ProductSortOption.Companion.a()))));
        builder91.e(listR63);
        CompiledField compiledFieldC148 = builder91.c();
        CompiledField compiledFieldE = a.e("includeUnitPriceInsetBanner", false, new CompiledField.Builder("sortOptionsBanner", InsetBanner.Companion.a()), listR64);
        ObjectType objectType19 = ProductFilterSwitch.f11741a;
        CompiledField.Builder builder92 = new CompiledField.Builder("marketplaceFilterSwitch", ProductFilterSwitch.Companion.a());
        builder92.e(listR65);
        CompiledField compiledFieldC149 = builder92.c();
        ObjectType objectType20 = InfoSection.f11495a;
        CompiledField.Builder builder93 = new CompiledField.Builder("marketplaceInfo", InfoSection.Companion.a());
        builder93.e(listR68);
        CompiledField compiledFieldC150 = builder93.c();
        ObjectType objectType21 = MarketplaceEducationBottomSheet.f11556a;
        CompiledField.Builder builder94 = new CompiledField.Builder("marketplaceBottomSheet", MarketplaceEducationBottomSheet.Companion.a());
        builder94.e(listR69);
        CompiledField compiledFieldC151 = builder94.c();
        ObjectType objectType22 = Chip.f11271a;
        CompiledField.Builder builder95 = new CompiledField.Builder("chips", CompiledGraphQL.a(CompiledGraphQL.b(Chip.Companion.a())));
        builder95.e(listR71);
        CompiledField compiledFieldC152 = builder95.c();
        CompiledField.Builder builder96 = new CompiledField.Builder("facetChips", CompiledGraphQL.a(CompiledGraphQL.b(Chip.Companion.a())));
        builder96.e(listR73);
        List<CompiledSelection> listR98 = CollectionsKt.R(compiledFieldC142, compiledFieldC143, compiledFieldC144, compiledFieldC145, compiledFieldC146, compiledFieldC147, compiledFieldC148, compiledFieldE, compiledFieldC149, compiledFieldC150, compiledFieldC151, compiledFieldC152, builder96.c(), a.e("includeProductListPersistentChip", true, new CompiledField.Builder("zeroResultContent", ProductListZeroResult.f11756a), listR81), a.e("includeProductListPersistentChip", false, new CompiledField.Builder("zeroResult", ProductListZeroResults.f11758a), listR97));
        __productList = listR98;
        ObjectType objectType23 = ProductList.f11749a;
        CompiledField.Builder builder97 = new CompiledField.Builder("productList", CompiledGraphQL.b(ProductList.Companion.a()));
        new CompiledArgument.Builder(Query.F0);
        builder97.b(CollectionsKt.Q(CompiledArgument.Builder.a()));
        builder97.e(listR98);
        __root = CollectionsKt.Q(builder97.c());
        $stable = 8;
    }

    private ProductListQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
