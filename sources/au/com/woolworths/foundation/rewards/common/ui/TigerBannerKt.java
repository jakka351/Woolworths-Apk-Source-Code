package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TigerBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TigerBannerStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TigerBannerStatus tigerBannerStatus = TigerBannerStatus.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TigerBannerStatus tigerBannerStatus2 = TigerBannerStatus.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1471624606);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            Modifier modifierA = ClipKt.a(BackgroundKt.b(ShadowKt.a(SizeKt.k(modifier, 48), 2, roundedCornerShape, false, 0L, 0L, 24), WxTheme.a(composerImplV).a(), roundedCornerShape), roundedCornerShape);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.recipes.recipes.list.b(25);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BoxKt.a(SemanticsModifierKt.a(modifierA, (Function1) objG), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 22, modifier);
        }
    }

    public static final void b(TigerBannerStatus tigerBannerStatus, final String str, Composer composer, int i) {
        PulsingIndicatorColor pulsingIndicatorColor;
        boolean z;
        ComposerImpl composerImplV = composer.v(-643756104);
        if ((((composerImplV.r(tigerBannerStatus.ordinal()) ? 4 : 2) | i | (composerImplV.n(str) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a(OffsetKt.c(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), composerImplV, 6);
            a(OffsetKt.c(companion, 8, BitmapDescriptorFactory.HUE_RED, 2), composerImplV, 6);
            SurfaceKt.a(null, tigerBannerStatus == TigerBannerStatus.f ? RoundedCornerShapeKt.f1100a : OneEarBearShape.f8569a, 0L, 0L, null, 2, ComposableLambdaKt.c(-1447666762, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt$StackedThumbnails$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SingletonAsyncImageKt.a(str, null, SizeKt.k(ClipKt.a(PaddingKt.f(Modifier.Companion.d, 8), RoundedCornerShapeKt.f1100a), 32), null, null, composer2, 48, 2040);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 29);
            int iOrdinal = tigerBannerStatus.ordinal();
            if (iOrdinal == 0) {
                pulsingIndicatorColor = PulsingIndicatorColor.d;
            } else if (iOrdinal == 1) {
                pulsingIndicatorColor = PulsingIndicatorColor.e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pulsingIndicatorColor = null;
            }
            composerImplV.o(780147425);
            if (pulsingIndicatorColor != null) {
                float f = -2;
                z = false;
                PulsingIndicatorKt.a(pulsingIndicatorColor, OffsetKt.b(companion, f, f), composerImplV, 48, 0);
            } else {
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(tigerBannerStatus, i, 0, str);
        }
    }

    public static final void c(final TigerBannerStatus tigerBannerStatus, final String str, final String str2, final String str3, final Modifier modifier, final Function0 onClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(839569460);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(tigerBannerStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onClick) ? 131072 : 65536;
        }
        if ((i2 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(1046692935, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt$TigerBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(modifier, 1.0f);
                        final String str4 = str2;
                        final String str5 = str3;
                        final TigerBannerStatus tigerBannerStatus2 = tigerBannerStatus;
                        final String str6 = str;
                        CardKt.b(onClick, modifierE, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-280920403, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt$TigerBanner$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierF = PaddingKt.f(companion, 16);
                                    Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 48);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierF);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, rowMeasurePolicyA, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function24);
                                    TigerBannerKt.b(tigerBannerStatus2, str6, composer3, 0);
                                    SpacerKt.a(composer3, SizeKt.u(companion, 32));
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(4), Alignment.Companion.m, composer3, 6);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, companion);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, function2);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        androidx.camera.core.impl.b.z(p2, composer3, p2, function23);
                                    }
                                    Updater.b(composer3, modifierD2, function24);
                                    TextKt.b(str4, null, WxTheme.a(composer3).c(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composer3).m, composer3, 0, 3120, 55290);
                                    TextKt.b(str5, null, WxTheme.a(composer3).f(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composer3).o, composer3, 0, 3120, 55290);
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 508);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(tigerBannerStatus, str, str2, str3, modifier, onClick, i);
        }
    }
}
