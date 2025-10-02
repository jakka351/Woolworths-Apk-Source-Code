package au.com.woolworths.sdui.legacy.scrollablelist;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.stable.button.d;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.sdui.legacy.banner.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScrollableListUiKt {
    public static final void a(ScrollableListActionState scrollableListActionState, Function0 function0, final String str, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1216061757);
        int i2 = i | (composerImplV.r(scrollableListActionState.ordinal()) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (scrollableListActionState != ScrollableListActionState.f) {
            float f = 8;
            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f1248a;
            ButtonKt.b(function0, null, false, null, null, null, ButtonDefaults.c(Color.j, 0L, 0L, composerImplV, 6), paddingValuesImpl, ComposableLambdaKt.c(885703312, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt$ScrollableListActionButton$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope OutlinedButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).q, composer2, 0, 0, 65534);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 907542528, 62);
            composerImplV.o(1765896747);
            if (scrollableListActionState == ScrollableListActionState.e) {
                SurfaceKt.a(BoxScopeInstance.f944a.i(), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(81694795, new ScrollableListUiKt$ScrollableListActionButton$1$2(), composerImplV), composerImplV, 1572864, 62);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(scrollableListActionState, function0, str, i, 15);
        }
    }

    public static final void b(String str, String str2, String str3, ScrollableListActionState scrollableListActionState, Function0 function0, boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        RowScopeInstance rowScopeInstance;
        float f;
        boolean z2;
        final ScrollableListActionState scrollableListActionState2;
        final Function0 function02;
        Unit unit;
        final String str4 = str3;
        ComposerImpl composerImplV = composer.v(329036436);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.r(scrollableListActionState.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            scrollableListActionState2 = scrollableListActionState;
            function02 = function0;
            composerImpl = composerImplV;
        } else {
            float f2 = 16;
            float f3 = (str != null && !StringsKt.D(str)) || str2 != null || str4 != null ? 12 : 0;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.j(companion, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 6), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            Modifier modifierA = rowScopeInstance2.a(companion, 1.0f, true);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(9);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierA, true, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(1425619655);
            if (str == null || StringsKt.D(str)) {
                composerImpl = composerImplV;
                rowScopeInstance = rowScopeInstance2;
                f = f2;
            } else {
                rowScopeInstance = rowScopeInstance2;
                f = f2;
                TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composerImplV).k, composerImplV, i2 & 14, 3120, 55294);
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            composerImpl.o(1425628996);
            if (str2 == null) {
                z2 = false;
            } else {
                ComposerImpl composerImpl2 = composerImpl;
                TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composerImpl).r, composerImpl2, 0, 3120, 55294);
                composerImpl = composerImpl2;
                z2 = false;
            }
            composerImpl.V(z2);
            composerImpl.V(true);
            composerImpl.o(139759172);
            str4 = str3;
            if (str4 == null) {
                unit = null;
                scrollableListActionState2 = scrollableListActionState;
                function02 = function0;
            } else {
                scrollableListActionState2 = scrollableListActionState;
                function02 = function0;
                final ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2001038553, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt$ScrollableListHeaderUi$1$3$actionButton$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ScrollableListUiKt.a(scrollableListActionState2, function02, str4, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl);
                if (z) {
                    composerImpl.o(1814414742);
                    ThemeKt.a(48, composerImpl, ComposableLambdaKt.c(350027387, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt$ScrollableListHeaderUi$1$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composableLambdaImplC.invoke(composer2, 6);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImpl));
                    composerImpl.V(z2);
                } else {
                    composerImpl.o(1814517259);
                    composableLambdaImplC.invoke(composerImpl, 6);
                    composerImpl.V(z2);
                }
                unit = Unit.f24250a;
            }
            composerImpl.V(z2);
            composerImpl.o(139758794);
            if (unit == null) {
                SpacerKt.d(rowScopeInstance, f, composerImpl, 54);
            }
            composerImpl.V(z2);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, str2, str4, scrollableListActionState2, function02, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.jvm.functions.Function0 r19, au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState r20, androidx.compose.ui.Modifier r21, boolean r22, androidx.compose.runtime.internal.ComposableLambdaImpl r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt.c(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
