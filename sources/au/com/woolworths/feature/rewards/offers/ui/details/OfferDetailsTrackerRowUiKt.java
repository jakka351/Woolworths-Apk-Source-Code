package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.offers.ui.details.TrailingStyle;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.rewards.base.data.IconAsset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsTrackerRowUiKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImpl;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(1790877065);
        int i4 = (composerImplV.n(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            composerImpl = composerImplV;
            modifier3 = i5 != 0 ? Modifier.Companion.d : modifier2;
            TextKt.b(str, modifier3, CoreTheme.b(composerImplV).d.d.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImpl, i3 & 126, 0, 65528);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier3, i, i2);
        }
    }

    public static final void b(final IconAsset iconAsset, final String str, final TrailingStyle trailingStyle, final Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1811735134);
        if ((((composerImplV.I(iconAsset) ? 4 : 2) | i | (composerImplV.n(str) ? 32 : 16) | (composerImplV.n(trailingStyle) ? 256 : 128)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            BoxWithConstraintsKt.a(null, null, false, ComposableLambdaKt.c(448618252, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsTrackerRowUiKt$OfferDetailsTrackerRowUi$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2;
                    Function2 function22;
                    Function2 function23;
                    Modifier.Companion companion;
                    int i2;
                    int i3;
                    Modifier modifier2;
                    int i4;
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = BoxWithConstraints.f();
                        boolean z = Float.compare(f, (float) DilithiumEngine.DilithiumPolyT1PackedBytes) <= 0;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifier);
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
                        Function2 function24 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function24);
                        Function2 function25 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function25);
                        Function2 function26 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function26);
                        }
                        Function2 function27 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function27);
                        composer2.o(-1899178059);
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        IconAsset iconAsset2 = iconAsset;
                        if (iconAsset2 == null) {
                            function22 = function27;
                            function2 = function26;
                            companion = companion2;
                            function23 = function25;
                        } else {
                            function2 = function26;
                            function22 = function27;
                            function23 = function25;
                            companion = companion2;
                            IconAssetUiKt.b(iconAsset2, Color.k, SizeKt.q(companion2, 24), composer2, 432, 0);
                            SpacerKt.a(composer2, SizeKt.u(companion, 16));
                        }
                        composer2.l();
                        String str2 = str;
                        TrailingStyle trailingStyle2 = trailingStyle;
                        if (z) {
                            composer2.o(1255324009);
                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p2 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE);
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
                            Updater.b(composer2, columnMeasurePolicyA, function24);
                            Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                androidx.camera.core.impl.b.z(p2, composer2, p2, function2);
                            }
                            Updater.b(composer2, modifierD2, function22);
                            composer2.o(-63277861);
                            if (str2 == null) {
                                i3 = 2;
                                modifier2 = null;
                                i4 = 0;
                            } else {
                                i3 = 2;
                                modifier2 = null;
                                i4 = 0;
                                OfferDetailsTrackerRowUiKt.a(0, 2, composer2, null, str2);
                            }
                            composer2.l();
                            composer2.o(-63274498);
                            if (trailingStyle2 != null) {
                                OfferDetailsTrackerRowUiKt.c(trailingStyle2, modifier2, composer2, i4, i3);
                            }
                            composer2.l();
                            composer2.f();
                            composer2.l();
                        } else {
                            composer2.o(1255668109);
                            composer2.o(-1899156717);
                            if (str2 == null) {
                                i2 = 1;
                            } else {
                                i2 = 1;
                                OfferDetailsTrackerRowUiKt.a(0, 0, composer2, RowScopeInstance.f974a.a(companion, 1.0f, true), str2);
                            }
                            composer2.l();
                            if (trailingStyle2 != null) {
                                OfferDetailsTrackerRowUiKt.c(trailingStyle2, PaddingKt.j(SizeKt.w(companion, BitmapDescriptorFactory.HUE_RED, f / 2, i2), 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), composer2, 0, 0);
                            }
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3072, 7);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(iconAsset, str, trailingStyle, modifier, i, 12);
        }
    }

    public static final void c(TrailingStyle trailingStyle, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        ComposerImpl composerImplV = composer.v(1122668915);
        int i4 = i | (composerImplV.n(trailingStyle) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier4 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier5 = i5 != 0 ? companion : modifier2;
            if (trailingStyle instanceof TrailingStyle.Label) {
                composerImplV.o(519503341);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier5);
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
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                MarkdownCompatKt.a(((TrailingStyle.Label) trailingStyle).f6413a, null, new MarkdownTextViewStyle((Density) composerImplV.x(CompositionLocalsKt.h), CoreTheme.b(composerImplV).e.d.b, CoreTheme.f(composerImplV).f5120a.b.f5123a, new TextAlign(5), 16), null, false, null, null, false, null, null, composerImplV, 0, 1018);
                composerImplV.V(true);
                composerImplV.V(false);
                modifier3 = modifier5;
            } else {
                Modifier modifier6 = modifier5;
                if (!(trailingStyle instanceof TrailingStyle.Points)) {
                    throw au.com.woolworths.android.onesite.a.w(848041128, composerImplV, false);
                }
                composerImplV.o(520086048);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                int i7 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                    androidx.camera.core.impl.b.B(i7, composerImplV, i7, function22);
                }
                Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                TrailingStyle.Points points = (TrailingStyle.Points) trailingStyle;
                String str = points.f6414a;
                composerImplV.o(-49707305);
                if (str == null) {
                    z = false;
                    modifier3 = modifier6;
                } else {
                    modifier3 = modifier6;
                    z = false;
                    TextKt.b(str.concat(" "), null, CoreTheme.b(composerImplV).e.d.f4856a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, 0, 0, 65530);
                    composerImplV = composerImplV;
                }
                composerImplV.V(z);
                ComposerImpl composerImpl = composerImplV;
                TextKt.b(points.b, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImpl, 0, 0, 65530);
                composerImplV = composerImpl;
                composerImplV.V(true);
                composerImplV.V(z);
            }
            modifier4 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(trailingStyle, modifier4, i, i2, 12);
        }
    }
}
