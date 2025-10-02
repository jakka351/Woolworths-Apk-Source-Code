package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderStoreDetailsItemKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i3;
        boolean z2;
        int i4;
        Function0 function02;
        int i5;
        Function0 function03;
        ComposerImpl composerImpl;
        final Function0 function04;
        boolean z3;
        Function0 function05;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1933089845);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        int i6 = i3 | KyberEngine.KyberPolyBytes;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3456;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (composerImplV.p(z2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            function02 = function0;
        } else {
            function02 = function0;
            i5 = i4 | (composerImplV.I(function02) ? 16384 : 8192);
        }
        if ((i5 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
            z3 = z2;
            function05 = function02;
        } else {
            if (i7 != 0) {
                z2 = false;
            }
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i8 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                function03 = (Function0) objG;
                composerImplV.V(false);
            } else {
                function03 = function02;
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion, 1.0f), PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding), PrimitiveResources_androidKt.a(composerImplV, R.dimen.one_and_half_padding));
            composerImplV.o(-1633490746);
            boolean z4 = ((i5 & 7168) == 2048) | ((57344 & i5) == 16384);
            Object objG2 = composerImplV.G();
            if (z4 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b(z2, function03, 1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierG, true, (Function1) objG2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function06 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function06);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function06);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            boolean z5 = z2;
            Function0 function07 = function03;
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).y, composerImplV, i5 & 14, 0, 65534);
            TextKt.b(str2, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, (i5 >> 3) & 14, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
            SpacerKt.a(composerImpl, RowScopeInstance.f974a.a(companion, 1.0f, true));
            composerImpl.o(390072841);
            if (z5) {
                function04 = function07;
                CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(-698436620, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderStoreDetailsItemKt$OrderStoreDetailsItem$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierB2 = RowScopeInstance.f974a.b(Modifier.Companion.d, Alignment.Companion.k);
                            composer2.o(5004770);
                            Function0 function08 = function04;
                            boolean zN = composer2.n(function08);
                            Object objG3 = composer2.G();
                            if (zN || objG3 == Composer.Companion.f1624a) {
                                objG3 = new k(3, function08);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_direction, 0, composer2), StringResources_androidKt.c(composer2, R.string.content_description_open_navigation), ClickableKt.d(modifierB2, false, null, null, (Function0) objG3, 7), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 0, 120);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl), composerImpl, 56);
            } else {
                function04 = function07;
            }
            composerImpl.V(false);
            composerImpl.V(true);
            z3 = z5;
            function05 = function04;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.ui.c(str, str2, modifier2, z3, function05, i, i2);
        }
    }
}
