package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.VideoAdUnitCarousel;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VideoAdUnitContentUiKt {
    public static final void a(final VideoAdUnitCarousel videoAdUnitCarousel, final ProductCardConfig productCardConfig, final ProductClickListener productClickListener, final List list, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(542749595);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(videoAdUnitCarousel) : composerImplV.I(videoAdUnitCarousel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = au.com.woolworths.dynamic.page.ui.content.d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            float f = 12;
            float f2 = 16;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f2, 5);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(f2, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerImplV.I(videoAdUnitCarousel))) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerImplV.I(productCardConfig))) | composerImplV.I(list) | composerImplV.I(productClickListener) | ((i2 & 57344) == 16384);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                final boolean z3 = z2;
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.shop.contentpage.ui.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyRow = (LazyListScope) obj;
                        Intrinsics.h(LazyRow, "$this$LazyRow");
                        for (HorizontalListItem horizontalListItem : videoAdUnitCarousel.getItems()) {
                            if (horizontalListItem instanceof ProductCard) {
                                final ProductCard productCard = (ProductCard) horizontalListItem;
                                final ProductCardConfig productCardConfig2 = productCardConfig;
                                final List list2 = list;
                                final ProductClickListener productClickListener2 = productClickListener;
                                final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                final boolean z4 = z3;
                                LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.VideoAdUnitContentUiKt$ProductListCarousel$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            ProductCardConfig productCardConfig3 = productCardConfig2;
                                            boolean zIsInstoreMode = productCardConfig3.isInstoreMode();
                                            List list3 = list2;
                                            ProductCard productCard2 = productCard;
                                            ContentPageProductCardKt.a(productCard2, productClickListener2, zIsInstoreMode, "Video Ad", ProductCardExtKt.t(productCard2, list3), productCardConfig3.isWatchlistEnabled(), false, sharedIntrinsicHeightState2, z4, null, false, null, composer2, ProductCard.$stable | 14158848, 3584);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -2074106082), 3);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG2 = function1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.d(modifierJ, null, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImpl, 24966, 490);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(videoAdUnitCarousel, productCardConfig, productClickListener, list, z, i);
        }
    }

    public static final void b(final VideoAdUnitData videoAdUnitData, final VideoAdPlayerState videoAdPlayerState, final ProductClickListener productClickListener, final ProductCardConfig productCardConfig, final boolean z, final List list, final Function1 onVideoAdPlayerStateChange, final Function3 onVideoAdPositionChange, final Function1 onVideoAdAnalyticsEvent, Function1 function1, final Function1 function12, Composer composer, final int i) {
        int i2;
        Function1 function13;
        boolean z2;
        Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(onVideoAdPlayerStateChange, "onVideoAdPlayerStateChange");
        Intrinsics.h(onVideoAdPositionChange, "onVideoAdPositionChange");
        Intrinsics.h(onVideoAdAnalyticsEvent, "onVideoAdAnalyticsEvent");
        ComposerImpl composerImplV = composer.v(1390538948);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(videoAdUnitData) : composerImplV.I(videoAdUnitData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(videoAdPlayerState) : composerImplV.I(videoAdPlayerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerImplV.I(list) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(onVideoAdPlayerStateChange) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(onVideoAdPositionChange) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(onVideoAdAnalyticsEvent) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerImplV.I(function1) ? 536870912 : 268435456;
        }
        char c = composerImplV.I(function12) ? (char) 4 : (char) 2;
        if ((i2 & 306783379) == 306783378 && (c & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            function13 = function1;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 16, 1), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            int i4 = i2;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            VideoAdData videoAd = videoAdUnitData.getVideoAd();
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(5004770);
            boolean z3 = (i4 & 1879048192) == 536870912;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z3 || objG == composer$Companion$Empty$1) {
                function13 = function1;
                objG = new c(14, function13);
                composerImplV.A(objG);
            } else {
                function13 = function1;
            }
            composerImplV.V(false);
            int i5 = i4 >> 12;
            VideoAdUnitKt.b(videoAd, videoAdPlayerState, (Function1) objG, onVideoAdPositionChange, onVideoAdAnalyticsEvent, modifierE, onVideoAdPlayerStateChange, composerImplV, (i5 & 57344) | 196616 | (i4 & 112) | (i5 & 7168) | (i4 & 3670016));
            final VideoAdUnitCarousel videoAdUnitCarousel = videoAdUnitData.getVideoAdUnitCarousel();
            composerImplV.o(-2065180710);
            if (videoAdUnitCarousel != null) {
                ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1318667391, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.VideoAdUnitContentUiKt$VideoAdUnitContentUi$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            VideoAdUnitContentUiKt.a(videoAdUnitCarousel, productCardConfig, productClickListener, list, z, composer2, VideoAdUnitCarousel.$stable | (ProductCardConfig.$stable << 3));
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
            }
            composerImplV.V(false);
            LinkData link = videoAdUnitData.getLink();
            composerImplV.o(-2065165937);
            if (link == null) {
                z2 = false;
            } else {
                String strA = StringKt.a(link.c.f10170a, Locale.Companion.a());
                Modifier modifierJ = PaddingKt.j(SizeKt.z(companion, null, 3), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7);
                composerImplV.o(-1633490746);
                boolean zI = ((c & 14) == 4) | composerImplV.I(link);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new n(0, function12, link);
                    composerImplV.A(objG2);
                }
                z2 = false;
                composerImplV.V(false);
                TextButtonKt.a((Function0) objG2, strA, modifierJ, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 504);
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function1 function14 = function13;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.contentpage.ui.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    VideoAdUnitContentUiKt.b(videoAdUnitData, videoAdPlayerState, productClickListener, productCardConfig, z, list, onVideoAdPlayerStateChange, onVideoAdPositionChange, onVideoAdAnalyticsEvent, function14, function12, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
