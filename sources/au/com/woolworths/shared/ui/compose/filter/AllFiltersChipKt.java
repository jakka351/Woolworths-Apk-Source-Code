package au.com.woolworths.shared.ui.compose.filter;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.BadgeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.sdui.legacy.banner.c;
import au.com.woolworths.shared.ui.compose.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AllFiltersChipKt {
    public static final void a(boolean z, final boolean z2, final String str, Function0 onFilterClicked, Modifier modifier, String str2, String str3, Function2 function2, Function2 function22, Composer composer, int i, int i2, int i3) {
        boolean z3;
        int i4;
        String str4;
        Function2 function23;
        Function2 function24;
        int i5;
        String strC;
        int i6;
        final String strB;
        int i7;
        final String str5;
        Modifier modifier2;
        Function2 function25;
        Function2 function26;
        ComposerImpl composerImpl;
        String str6;
        String str7;
        Function2 function27;
        Function2 function28;
        Modifier modifier3;
        Intrinsics.h(onFilterClicked, "onFilterClicked");
        ComposerImpl composerImplV = composer.v(-58671355);
        if ((i & 6) == 0) {
            z3 = z;
            i4 = (composerImplV.p(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onFilterClicked) ? 2048 : 1024;
        }
        int i8 = i4 | 221184;
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                str4 = str2;
                int i9 = composerImplV.n(str4) ? 1048576 : 524288;
                i8 |= i9;
            } else {
                str4 = str2;
            }
            i8 |= i9;
        } else {
            str4 = str2;
        }
        int i10 = 12582912 | i8;
        if ((100663296 & i) == 0) {
            i10 = 46137344 | i8;
        }
        if ((805306368 & i) == 0) {
            if ((i3 & 512) == 0) {
                function23 = function2;
                int i11 = composerImplV.I(function23) ? 536870912 : 268435456;
                i10 |= i11;
            } else {
                function23 = function2;
            }
            i10 |= i11;
        } else {
            function23 = function2;
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = 6;
            function24 = function22;
        } else if ((i2 & 6) == 0) {
            function24 = function22;
            i5 = i2 | (composerImplV.I(function24) ? 4 : 2);
        } else {
            function24 = function22;
            i5 = i2;
        }
        if ((306783379 & i10) == 306783378 && (i5 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            str7 = str3;
            composerImpl = composerImplV;
            function27 = function23;
            str6 = str4;
            function28 = function24;
            modifier3 = modifier;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i3 & 64) != 0) {
                    strC = StringResources_androidKt.c(composerImplV, R.string.all_filter);
                    i10 &= -3670017;
                } else {
                    strC = str4;
                }
                if (str == null) {
                    i6 = -2113929217;
                    strB = null;
                } else {
                    i6 = -2113929217;
                    strB = StringResources_androidKt.b(R.string.all_filter_count_content_description, new Object[]{str}, composerImplV);
                }
                int i13 = i10 & (-234881025);
                if ((i3 & 512) != 0) {
                    function23 = ComposableSingletons$AllFiltersChipKt.f10096a;
                    i7 = i10 & i6;
                } else {
                    i7 = i13;
                }
                Function2 function29 = function23;
                str5 = strC;
                modifier2 = Modifier.Companion.d;
                function25 = function29;
                function26 = i12 != 0 ? null : function24;
            } else {
                composerImplV.j();
                if ((i3 & 64) != 0) {
                    i10 &= -3670017;
                }
                int i14 = i10 & (-234881025);
                if ((i3 & 512) != 0) {
                    i14 = i10 & (-2113929217);
                }
                i7 = i14;
                function25 = function23;
                str5 = str4;
                function26 = function24;
                modifier2 = modifier;
                strB = str3;
            }
            composerImplV.W();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(15);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i15 = i7 >> 3;
            composerImpl = composerImplV;
            Modifier modifier4 = modifier2;
            FilterChipKt.a(z3, false, onFilterClicked, SemanticsModifierKt.b(modifier2, true, (Function1) objG), RoundedCornerShapeKt.a(50), 0L, 0L, null, function25, function26, ComposableLambdaKt.c(1930878596, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.filter.AllFiltersChipKt$AllFiltersChip$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier.Companion companion;
                    Modifier.Companion companion2;
                    RowScope FilterChip = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FilterChip, "$this$FilterChip");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion3 = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion3);
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
                        Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function210 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function210);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-1565150584);
                        String str8 = str5;
                        if (str8 != null) {
                            composer2.o(-1565148214);
                            composer2.l();
                            companion = companion3;
                            TextKt.b(str8, companion, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 0, 0, 65532);
                            composer2 = composer2;
                        } else {
                            companion = companion3;
                        }
                        composer2.l();
                        composer2.o(-1565136056);
                        final String str9 = str;
                        if (str9 != null) {
                            Modifier.Companion companion4 = companion;
                            Modifier modifierJ = PaddingKt.j(companion4, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                            companion2 = companion4;
                            long jH = WxTheme.a(composer2).h();
                            long jE = WxTheme.a(composer2).e();
                            final String str10 = strB;
                            BadgeKt.a(modifierJ, jH, jE, ComposableLambdaKt.c(-2134800447, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.filter.AllFiltersChipKt$AllFiltersChip$3$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    RowScope Badge = (RowScope) obj4;
                                    Composer composer3 = (Composer) obj5;
                                    int iIntValue2 = ((Number) obj6).intValue();
                                    Intrinsics.h(Badge, "$this$Badge");
                                    if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        composer3.o(1451140450);
                                        Modifier modifierB = Modifier.Companion.d;
                                        String str11 = str10;
                                        if (str11 != null) {
                                            composer3.o(5004770);
                                            boolean zN = composer3.n(str11);
                                            Object objG2 = composer3.G();
                                            if (zN || objG2 == Composer.Companion.f1624a) {
                                                objG2 = new a(str11, 4);
                                                composer3.A(objG2);
                                            }
                                            composer3.l();
                                            modifierB = SemanticsModifierKt.b(modifierB, false, (Function1) objG2);
                                        }
                                        composer3.l();
                                        TextKt.b(str9, modifierB, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).r, composer3, 0, 0, 65532);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 3078, 0);
                        } else {
                            companion2 = companion;
                        }
                        composer2.l();
                        composer2.o(-1565110087);
                        if (z2) {
                            float f = 8;
                            Modifier modifierQ = SizeKt.q(PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), f);
                            composer2.o(1849434622);
                            Object objG2 = composer2.G();
                            if (objG2 == Composer.Companion.f1624a) {
                                objG2 = new c(16);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            CanvasKt.a(modifierQ, (Function1) objG2, composer2, 54);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i7 & 14) | ((i7 >> 12) & 112) | (i15 & 896) | (i15 & 234881024), (i5 & 14) | 48, 736);
            str6 = str5;
            str7 = strB;
            function27 = function25;
            function28 = function26;
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.a(z, z2, str, onFilterClicked, modifier3, str6, str7, function27, function28, i, i2, i3);
        }
    }
}
