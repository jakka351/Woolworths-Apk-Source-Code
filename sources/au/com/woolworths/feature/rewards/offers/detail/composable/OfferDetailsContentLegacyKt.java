package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.offers.ui.OfferDetailMechanicsCarouselKt;
import au.com.woolworths.feature.rewards.offers.ui.StandardBannerKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanics;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextSpec;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsContentLegacyKt {
    public static final void a(final String str, final RewardsOfferData data, final Function0 onBannerClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        Intrinsics.h(onBannerClick, "onBannerClick");
        ComposerImpl composerImplV = composer.v(471042326);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.I(data) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(onBannerClick) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion.d : modifier2;
            Modifier modifierH = PaddingKt.h(TestTagKt.a(modifier4, "offer_details_content"), 16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(-1224400529);
            boolean zI = ((i4 & 14) == 4) | composerImplV.I(data) | ((i4 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.f6332a, 1);
                        final String str2 = str;
                        final RewardsOfferData rewardsOfferData = data;
                        if (str2 != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        TintableTextSpec tintableTextSpecC = RewardsOfferDataExtKt.c(rewardsOfferData, str2, composer2, 0);
                                        if (tintableTextSpecC != null) {
                                            TintableTextKt.a(tintableTextSpecC, BackgroundKt.b(ClipKt.a(Modifier.Companion.d, RoundedCornerShapeKt.b(4)), WxTheme.a(composer2).a(), RectangleShapeKt.f1779a), composer2, 0);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -2083037722), 3);
                            LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.b, 1);
                        }
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    TextKt.b(rewardsOfferData.g, TestTagKt.a(Modifier.Companion.d, "title"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).f, composer2, 48, 0, 65532);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 216035210), 3);
                        LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.c, 1);
                        final String str3 = rewardsOfferData.j;
                        if (str3 != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$3$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        long jH = WxTheme.a(composer2).h();
                                        MarkdownTextViewStyle markdownTextViewStyle = new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).f(), WxTheme.b(composer2).n, (TextAlign) null, 24);
                                        Color color = new Color(jH);
                                        composer2.o(1849434622);
                                        Object objG2 = composer2.G();
                                        if (objG2 == Composer.Companion.f1624a) {
                                            objG2 = new a0(19);
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        MarkdownCompatKt.a(str3, null, markdownTextViewStyle, null, false, color, (Function2) objG2, false, null, null, composer2, 1572864, 922);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1920209409), 3);
                        }
                        final RewardsOfferMechanics rewardsOfferMechanics = rewardsOfferData.p;
                        if (rewardsOfferMechanics != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$4$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        OfferDetailMechanicsCarouselKt.a(rewardsOfferMechanics, null, composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -645981448), 3);
                            LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.d, 1);
                        }
                        LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.e, 1);
                        final StandardBanner standardBanner = rewardsOfferData.C;
                        if (standardBanner != null) {
                            final Function0 function0 = onBannerClick;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$5$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        StandardBanner standardBanner2 = standardBanner;
                                        StandardBannerKt.a(standardBanner2.f, standardBanner2.e, standardBanner2.i, standardBanner2.g, standardBanner2.j, function0, null, ToneColors.j, composer2, 0, 64);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1584553617), 3);
                            LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.f, 1);
                        }
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$OfferDetailsContentLegacyKt.g, 3);
                        LazyListScope.i(LazyColumn, null, "SpacerType", ComposableSingletons$OfferDetailsContentLegacyKt.h, 1);
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$OfferDetailsContentLegacyKt.i, 3);
                        final String str4 = rewardsOfferData.l;
                        if (str4 != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.OfferDetailsContentLegacyKt$OfferDetailsContentLegacy$1$1$6$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        long jH = WxTheme.a(composer2).h();
                                        MarkdownTextViewStyle markdownTextViewStyle = new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).f(), WxTheme.b(composer2).n, (TextAlign) null, 24);
                                        Color color = new Color(jH);
                                        composer2.o(1849434622);
                                        Object objG2 = composer2.G();
                                        if (objG2 == Composer.Companion.f1624a) {
                                            objG2 = new a0(20);
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        MarkdownCompatKt.a(str4, null, markdownTextViewStyle, null, true, color, (Function2) objG2, true, null, null, composer2, 14180352, 778);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1692615960), 3);
                        }
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$OfferDetailsContentLegacyKt.j, 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier3 = modifier4;
            composerImpl = composerImplV;
            LazyDslKt.b(modifierH, null, null, false, null, null, null, false, null, (Function1) objG, composerImpl, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b((Object) str, (Object) data, (Object) onBannerClick, modifier3, i, i2, 1);
        }
    }
}
