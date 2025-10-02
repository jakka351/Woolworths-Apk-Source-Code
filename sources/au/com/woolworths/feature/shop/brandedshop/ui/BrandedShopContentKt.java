package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopFeedItem;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.ui.product.ProductCardKt;
import au.com.woolworths.feature.shop.brandedshop.ui.product.ProductSectionImpressionKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerStateKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionData;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionType;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import au.com.woolworths.shop.aem.components.ui.LinkKt;
import au.com.woolworths.shop.aem.components.ui.ParagraphMarkdownKt;
import au.com.woolworths.shop.aem.components.ui.TitleSectionKt;
import au.com.woolworths.shop.aem.components.ui.button.ButtonSectionKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthContentCardKt;
import au.com.woolworths.shop.aem.components.ui.contentcard.FullWidthImageCardKt;
import au.com.woolworths.shop.aem.components.ui.downloadableAsset.DownloadableAssetKt;
import au.com.woolworths.shop.aem.components.ui.product.ProductSectionHeaderKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "", "", "productHeaderElevationMap", "brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopContentKt {
    public static final void a(final Map map, final List contents, final Function1 onBrandedShopUiEvent, Function1 onItemSeen, BrandedShopProductGridConfig brandedShopProductGridConfig, final ProductClickListener productClickListener, boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        final BrandedShopProductGridConfig brandedShopProductGridConfig2;
        boolean z2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(contents, "contents");
        Intrinsics.h(onBrandedShopUiEvent, "onBrandedShopUiEvent");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(productClickListener, "productClickListener");
        ComposerImpl composerImplV = composer.v(-642877134);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(map) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(contents) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onBrandedShopUiEvent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onItemSeen) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            brandedShopProductGridConfig2 = brandedShopProductGridConfig;
            i2 |= composerImplV.n(brandedShopProductGridConfig2) ? 16384 : 8192;
        } else {
            brandedShopProductGridConfig2 = brandedShopProductGridConfig;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        int i3 = i2 | 12582912;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            final ListItemsTrackerState listItemsTrackerStateA = ListItemsTrackerStateKt.a(lazyListStateA, onItemSeen, composerImplV, (i3 >> 3) & 896);
            ListItemsSeenEffectKt.b(listItemsTrackerStateA, composerImplV, 0);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.d(new au.com.woolworths.design.wx.component.topbar.a(lazyListStateA, 3));
                composerImplV.A(objG);
            }
            final State state = (State) objG;
            composerImplV.V(false);
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 896) == 256) | composerImplV.I(contents) | composerImplV.I(map) | composerImplV.n(listItemsTrackerStateA) | ((i3 & 57344) == 16384) | composerImplV.I(productClickListener) | ((i3 & 3670016) == 1048576);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                final boolean z3 = z2;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.a
                    /* JADX WARN: Type inference failed for: r12v4, types: [au.com.woolworths.feature.shop.brandedshop.ui.b] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final int i4 = 0;
                        for (Object obj2 : contents) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            BrandedShopFeedItem brandedShopFeedItem = (BrandedShopFeedItem) obj2;
                            if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopHeroImage) {
                                BrandedShopFeedItem.BrandedShopHeroImage brandedShopHeroImage = (BrandedShopFeedItem.BrandedShopHeroImage) brandedShopFeedItem;
                                String key = brandedShopHeroImage.f6682a;
                                final DownloadableAssetData downloadableAssetData = brandedShopHeroImage.b;
                                Intrinsics.h(key, "key");
                                InvisibleStickyHeaderKt.a(LazyColumn, key);
                                LazyListScope.i(LazyColumn, key, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHeroImageKt$brandedShopHeroImage$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composer2);
                                            boolean z4 = i4 == 0;
                                            composer2.o(1849434622);
                                            Object objG3 = composer2.G();
                                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                            if (objG3 == composer$Companion$Empty$12) {
                                                objG3 = new au.com.woolworths.feature.shared.instore.wifi.ui.c(14);
                                                composer2.A(objG3);
                                            }
                                            Function1 function12 = (Function1) objG3;
                                            Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                                            if (objE == composer$Companion$Empty$12) {
                                                objE = new au.com.woolworths.feature.shared.instore.wifi.ui.c(15);
                                                composer2.A(objE);
                                            }
                                            composer2.l();
                                            DownloadableAssetKt.b(downloadableAssetData, BackgroundKt.b(ConditionalModifierKt.a(Modifier.Companion.d, z4, function12, (Function1) objE), ToneColors.j, RectangleShapeKt.f1779a), false, false, painterA, null, composer2, 0, 44);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1332757220), 2);
                            } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopTitle) {
                                BrandedShopFeedItem.BrandedShopTitle brandedShopTitle = (BrandedShopFeedItem.BrandedShopTitle) brandedShopFeedItem;
                                String key2 = brandedShopTitle.f6691a;
                                final TitleSectionData titleSectionData = brandedShopTitle.b;
                                Intrinsics.h(key2, "key");
                                InvisibleStickyHeaderKt.a(LazyColumn, key2);
                                LazyListScope.i(LazyColumn, key2, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopTitleKt$brandedShopTitle$1

                                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                    public /* synthetic */ class WhenMappings {

                                        /* renamed from: a, reason: collision with root package name */
                                        public static final /* synthetic */ int[] f6707a;

                                        static {
                                            int[] iArr = new int[TitleSectionType.values().length];
                                            try {
                                                iArr[TitleSectionType.PRIMARY.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            f6707a = iArr;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            TitleSectionData titleSectionData2 = titleSectionData;
                                            TitleSectionType type = titleSectionData2.getType();
                                            composer2.o(5004770);
                                            boolean zR = composer2.r(type.ordinal());
                                            Object objG3 = composer2.G();
                                            if (zR || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new Dp(WhenMappings.f6707a[titleSectionData2.getType().ordinal()] == 1 ? 8 : 16);
                                                composer2.A(objG3);
                                            }
                                            float f = ((Dp) objG3).d;
                                            composer2.l();
                                            float f2 = 16;
                                            TitleSectionKt.a(titleSectionData2, PaddingKt.i(SizeKt.e(Modifier.Companion.d, 1.0f), f2, f, f2, 8), 0, composer2, 0, 4);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1418387682), 2);
                            } else {
                                boolean z4 = brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopTabHeader;
                                final Function1 function12 = onBrandedShopUiEvent;
                                State state2 = state;
                                if (z4) {
                                    BrandedShopFeedItem.BrandedShopTabHeader brandedShopTabHeader = (BrandedShopFeedItem.BrandedShopTabHeader) brandedShopFeedItem;
                                    String key3 = brandedShopTabHeader.f6690a;
                                    final ArrayList arrayList = brandedShopTabHeader.b;
                                    Map map2 = map;
                                    Integer num = (Integer) map2.get(key3);
                                    final int iIntValue = num != null ? num.intValue() : 0;
                                    final g gVar = new g(1, map2, brandedShopTabHeader, function12);
                                    final String str = brandedShopTabHeader.c;
                                    Boolean bool = (Boolean) ((Map) state2.getD()).get(key3);
                                    final boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                    Intrinsics.h(key3, "key");
                                    if (!arrayList.isEmpty()) {
                                        LazyListScope.e(LazyColumn, key3, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopTabHeaderKt$brandedShopTabHeader$1
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                LazyItemScope stickyHeader = (LazyItemScope) obj3;
                                                ((Number) obj4).intValue();
                                                Composer composer2 = (Composer) obj5;
                                                int iIntValue2 = ((Number) obj6).intValue();
                                                Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                                if ((iIntValue2 & 129) == 128 && composer2.c()) {
                                                    composer2.j();
                                                } else {
                                                    Modifier.Companion companion = Modifier.Companion.d;
                                                    Modifier modifierB = BackgroundKt.b(SizeKt.e(companion, 1.0f), WxTheme.a(composer2).a(), RectangleShapeKt.f1779a);
                                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                                                    int p = composer2.getP();
                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                                                    ComposeUiNode.e3.getClass();
                                                    Function0 function0 = ComposeUiNode.Companion.b;
                                                    if (composer2.w() == null) {
                                                        ComposablesKt.b();
                                                        throw null;
                                                    }
                                                    composer2.i();
                                                    if (composer2.getO()) {
                                                        composer2.K(function0);
                                                    } else {
                                                        composer2.e();
                                                    }
                                                    Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                    Function2 function2 = ComposeUiNode.Companion.j;
                                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                                    }
                                                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                                    BrandedShopTabHeaderKt.a(arrayList, iIntValue, gVar, composer2, 0);
                                                    composer2.o(-728695247);
                                                    String str2 = str;
                                                    if (str2 != null) {
                                                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                                                        composer2.o(1849434622);
                                                        Object objG3 = composer2.G();
                                                        if (objG3 == Composer.Companion.f1624a) {
                                                            objG3 = new androidx.camera.core.processing.concurrent.b(3);
                                                            composer2.A(objG3);
                                                        }
                                                        composer2.l();
                                                        ProductSectionHeaderKt.a(zBooleanValue ? 4 : 0, 0, 0, composer2, ClipKt.a(modifierE, new GenericShape((Function3) objG3)), str2);
                                                    }
                                                    composer2.l();
                                                    composer2.f();
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, -1797474050), 2);
                                    }
                                } else {
                                    boolean z5 = brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopProductSectionImpression;
                                    final ListItemsTrackerState listItemsTrackerState = listItemsTrackerStateA;
                                    if (z5) {
                                        final BrandedShopFeedItem.BrandedShopProductSectionImpression brandedShopProductSectionImpression = (BrandedShopFeedItem.BrandedShopProductSectionImpression) brandedShopFeedItem;
                                        LazyListScope.i(LazyColumn, brandedShopProductSectionImpression.f6689a, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopContentKt$BrandedShopContent$1$1$1$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                LazyItemScope item = (LazyItemScope) obj3;
                                                Composer composer2 = (Composer) obj4;
                                                int iIntValue2 = ((Number) obj5).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                    composer2.j();
                                                } else {
                                                    BrandedShopFeedItem.BrandedShopProductSectionImpression brandedShopProductSectionImpression2 = brandedShopProductSectionImpression;
                                                    ProductSectionImpressionKt.a(brandedShopProductSectionImpression2.f6689a, brandedShopProductSectionImpression2.b, listItemsTrackerState, composer2, 64);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, 66307460), 2);
                                    } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopProductRow) {
                                        BrandedShopFeedItem.BrandedShopProductRow brandedShopProductRow = (BrandedShopFeedItem.BrandedShopProductRow) brandedShopFeedItem;
                                        String key4 = brandedShopProductRow.f6687a;
                                        final List products = brandedShopProductRow.b;
                                        Intrinsics.h(key4, "key");
                                        Intrinsics.h(products, "products");
                                        final ProductClickListener productClickListener2 = productClickListener;
                                        Intrinsics.h(productClickListener2, "productClickListener");
                                        final BrandedShopProductGridConfig brandedShopProductGridConfig3 = brandedShopProductGridConfig2;
                                        final boolean z6 = z3;
                                        LazyListScope.i(LazyColumn, key4, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopTabContentKt$brandedShopProductRow$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                LazyItemScope item = (LazyItemScope) obj3;
                                                Composer composer2 = (Composer) obj4;
                                                int iIntValue2 = ((Number) obj5).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                    composer2.j();
                                                } else {
                                                    BrandedShopProductGridConfig brandedShopProductGridConfig4 = brandedShopProductGridConfig3;
                                                    if (brandedShopProductGridConfig4 == null) {
                                                        brandedShopProductGridConfig4 = BrandedShopProductGridConfig.f;
                                                    }
                                                    boolean z7 = z6;
                                                    ProductCardKt.b(products, brandedShopProductGridConfig4, productClickListener2, z7, composer2, 0);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, 1435972098), 2);
                                    } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopHorizontalDivider) {
                                        final BrandedShopFeedItem.BrandedShopHorizontalDivider brandedShopHorizontalDivider = (BrandedShopFeedItem.BrandedShopHorizontalDivider) brandedShopFeedItem;
                                        LazyListScope.i(LazyColumn, brandedShopHorizontalDivider.f6683a, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopContentKt$BrandedShopContent$1$1$1$3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                LazyItemScope item = (LazyItemScope) obj3;
                                                Composer composer2 = (Composer) obj4;
                                                int iIntValue2 = ((Number) obj5).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                    composer2.j();
                                                } else {
                                                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 6, 0L, composer2, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, brandedShopHorizontalDivider.b, 7));
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, 1575407938), 2);
                                    } else {
                                        boolean z7 = brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopLink;
                                        final Modifier.Companion companion = Modifier.Companion.d;
                                        if (z7) {
                                            BrandedShopFeedItem.BrandedShopLink brandedShopLink = (BrandedShopFeedItem.BrandedShopLink) brandedShopFeedItem;
                                            String key5 = brandedShopLink.f6685a;
                                            final LinkData linkData = brandedShopLink.b;
                                            boolean z8 = brandedShopLink.c;
                                            final f fVar = new f(1, function12, brandedShopLink);
                                            Intrinsics.h(key5, "key");
                                            Intrinsics.h(linkData, "linkData");
                                            if (!z8) {
                                                InvisibleStickyHeaderKt.a(LazyColumn, key5);
                                            }
                                            LazyListScope.i(LazyColumn, key5, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopLinkKt$brandedShopLink$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        LinkKt.a(linkData, fVar, SizeKt.g(companion, 48), null, composer2, 8);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -998562062), 2);
                                        } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopButton) {
                                            final BrandedShopFeedItem.BrandedShopButton brandedShopButton = (BrandedShopFeedItem.BrandedShopButton) brandedShopFeedItem;
                                            String key6 = brandedShopButton.f6679a;
                                            final ButtonData buttonData = brandedShopButton.b;
                                            final ?? r12 = new Function1() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.b
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj3) {
                                                    ButtonData it = (ButtonData) obj3;
                                                    Intrinsics.h(it, "it");
                                                    function12.invoke(new UiEvent.OnButtonClick(brandedShopButton.b));
                                                    return Unit.f24250a;
                                                }
                                            };
                                            Intrinsics.h(key6, "key");
                                            InvisibleStickyHeaderKt.a(LazyColumn, key6);
                                            LazyListScope.i(LazyColumn, key6, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopButtonKt$brandedShopButton$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        ButtonSectionKt.a(buttonData, r12, PaddingKt.g(SizeKt.e(companion, 1.0f), 16, 8), null, composer2, 8);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -520235121), 2);
                                        } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopHorizontalList) {
                                            BrandedShopFeedItem.BrandedShopHorizontalList brandedShopHorizontalList = (BrandedShopFeedItem.BrandedShopHorizontalList) brandedShopFeedItem;
                                            String key7 = brandedShopHorizontalList.f6684a;
                                            final HorizontalListData horizontalListData = brandedShopHorizontalList.b;
                                            final au.com.woolworths.design.wx.component.searchbar.a aVar = new au.com.woolworths.design.wx.component.searchbar.a(12, function12);
                                            final au.com.woolworths.design.wx.component.searchbar.a aVar2 = new au.com.woolworths.design.wx.component.searchbar.a(13, function12);
                                            Intrinsics.h(key7, "key");
                                            InvisibleStickyHeaderKt.a(LazyColumn, key7);
                                            LazyListScope.i(LazyColumn, key7, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHorizontalListKt$brandedShopHorizontalList$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        BrandedShopHorizontalListKt.a(horizontalListData, aVar, aVar2, composer2, 8);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -2144500973), 2);
                                        } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopFullWidthImageCard) {
                                            BrandedShopFeedItem.BrandedShopFullWidthImageCard brandedShopFullWidthImageCard = (BrandedShopFeedItem.BrandedShopFullWidthImageCard) brandedShopFeedItem;
                                            final String key8 = brandedShopFullWidthImageCard.f6681a;
                                            final FullWidthImageCardData fullWidthImageCardData = brandedShopFullWidthImageCard.b;
                                            Intrinsics.h(key8, "key");
                                            InvisibleStickyHeaderKt.a(LazyColumn, key8);
                                            LazyListScope.i(LazyColumn, key8, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopFullWidthImageKt$brandedShopFullWidthImage$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        float f = 16;
                                                        Modifier modifierX = SizeKt.x(SizeKt.e(PaddingKt.i(Modifier.Companion.d, f, 8, f, f), 1.0f), Alignment.Companion.k, false);
                                                        FullWidthImageCardData fullWidthImageCardData2 = fullWidthImageCardData;
                                                        FullWidthImageCardKt.a(fullWidthImageCardData2, modifierX, composer2, 0);
                                                        composer2.o(-1746271574);
                                                        ListItemsTrackerState listItemsTrackerState2 = listItemsTrackerState;
                                                        boolean zN = composer2.n(listItemsTrackerState2);
                                                        String str2 = key8;
                                                        boolean zN2 = zN | composer2.n(str2) | composer2.I(fullWidthImageCardData2);
                                                        Object objG3 = composer2.G();
                                                        if (zN2 || objG3 == Composer.Companion.f1624a) {
                                                            objG3 = new BrandedShopFullWidthImageKt$brandedShopFullWidthImage$1$1$1(listItemsTrackerState2, str2, fullWidthImageCardData2, null);
                                                            composer2.A(objG3);
                                                        }
                                                        composer2.l();
                                                        EffectsKt.f(str2, fullWidthImageCardData2, (Function2) objG3, composer2);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -1077110520), 2);
                                        } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopFullWidthContentCard) {
                                            BrandedShopFeedItem.BrandedShopFullWidthContentCard brandedShopFullWidthContentCard = (BrandedShopFeedItem.BrandedShopFullWidthContentCard) brandedShopFeedItem;
                                            final String key9 = brandedShopFullWidthContentCard.f6680a;
                                            final FullWidthContentCardData fullWidthContentCardData = brandedShopFullWidthContentCard.b;
                                            final au.com.woolworths.design.wx.component.searchbar.a aVar3 = new au.com.woolworths.design.wx.component.searchbar.a(14, function12);
                                            Intrinsics.h(key9, "key");
                                            InvisibleStickyHeaderKt.a(LazyColumn, key9);
                                            LazyListScope.i(LazyColumn, key9, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        Orientation orientation = Orientation.d;
                                                        float f = 16;
                                                        Modifier modifierX = SizeKt.x(SizeKt.e(PaddingKt.i(Modifier.Companion.d, f, 8, f, f), 1.0f), Alignment.Companion.k, false);
                                                        FullWidthContentCardData fullWidthContentCardData2 = fullWidthContentCardData;
                                                        FullWidthContentCardKt.a(orientation, fullWidthContentCardData2, aVar3, modifierX, composer2, 70, 0);
                                                        composer2.o(-1746271574);
                                                        ListItemsTrackerState listItemsTrackerState2 = listItemsTrackerState;
                                                        boolean zN = composer2.n(listItemsTrackerState2);
                                                        String str2 = key9;
                                                        boolean zN2 = zN | composer2.n(str2) | composer2.I(fullWidthContentCardData2);
                                                        Object objG3 = composer2.G();
                                                        if (zN2 || objG3 == Composer.Companion.f1624a) {
                                                            objG3 = new BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1(listItemsTrackerState2, str2, fullWidthContentCardData2, null);
                                                            composer2.A(objG3);
                                                        }
                                                        composer2.l();
                                                        EffectsKt.f(str2, fullWidthContentCardData2, (Function2) objG3, composer2);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -336627615), 2);
                                        } else if (brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopParagraphText) {
                                            BrandedShopFeedItem.BrandedShopParagraphText brandedShopParagraphText = (BrandedShopFeedItem.BrandedShopParagraphText) brandedShopFeedItem;
                                            String key10 = brandedShopParagraphText.f6686a;
                                            final ParagraphTextItemData paragraphTextItemData = brandedShopParagraphText.b;
                                            Intrinsics.h(key10, "key");
                                            InvisibleStickyHeaderKt.a(LazyColumn, key10);
                                            LazyListScope.i(LazyColumn, key10, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopParagraphTextKt$brandedShopParagraphText$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    LazyItemScope item = (LazyItemScope) obj3;
                                                    Composer composer2 = (Composer) obj4;
                                                    int iIntValue2 = ((Number) obj5).intValue();
                                                    Intrinsics.h(item, "$this$item");
                                                    if ((iIntValue2 & 17) == 16 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        ParagraphMarkdownKt.a(paragraphTextItemData, SizeKt.x(SizeKt.e(PaddingKt.g(Modifier.Companion.d, 16, 8), 1.0f), Alignment.Companion.k, false), null, composer2, 48);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, 4201933), 2);
                                        } else {
                                            if (!(brandedShopFeedItem instanceof BrandedShopFeedItem.BrandedShopProductSectionHeader)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            BrandedShopFeedItem.BrandedShopProductSectionHeader brandedShopProductSectionHeader = (BrandedShopFeedItem.BrandedShopProductSectionHeader) brandedShopFeedItem;
                                            String key11 = brandedShopProductSectionHeader.f6688a;
                                            final String headerText = brandedShopProductSectionHeader.b;
                                            Boolean bool2 = (Boolean) ((Map) state2.getD()).get(key11);
                                            final boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                            Intrinsics.h(key11, "key");
                                            Intrinsics.h(headerText, "headerText");
                                            LazyListScope.e(LazyColumn, key11, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopProductSectionHeaderKt$brandedShopProductSectionHeader$1
                                                @Override // kotlin.jvm.functions.Function4
                                                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                    LazyItemScope stickyHeader = (LazyItemScope) obj3;
                                                    ((Number) obj4).intValue();
                                                    Composer composer2 = (Composer) obj5;
                                                    int iIntValue2 = ((Number) obj6).intValue();
                                                    Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                                    if ((iIntValue2 & 129) == 128 && composer2.c()) {
                                                        composer2.j();
                                                    } else {
                                                        ProductSectionHeaderKt.a(zBooleanValue2 ? 4 : 0, 0, 0, composer2, BackgroundKt.b(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), WxTheme.a(composer2).a(), RectangleShapeKt.f1779a), headerText);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, true, -211840514), 2);
                                        }
                                    }
                                }
                            }
                            i4 = i5;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG2 = function1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(fillElement, lazyListStateA, null, false, null, Alignment.Companion.n, null, false, null, (Function1) objG2, composerImpl, 196608, 476);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.g(map, contents, onBrandedShopUiEvent, onItemSeen, brandedShopProductGridConfig, productClickListener, z, modifier2, i);
        }
    }
}
