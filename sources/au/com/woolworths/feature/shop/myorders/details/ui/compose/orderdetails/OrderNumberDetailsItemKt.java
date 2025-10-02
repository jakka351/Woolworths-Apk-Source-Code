package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderNumberDetailsItemKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        int i3;
        String str3;
        int i4;
        Function0 function02;
        int i5;
        Function0 function03;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Function0 function04;
        String str4;
        ComposerImpl composerImplV = composer.v(-1307548039);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 432;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i6 | (composerImplV.n(str3) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i5 = i4 | (composerImplV.I(function02) ? 2048 : 1024);
        }
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            str4 = str3;
            function04 = function02;
            composerImpl = composerImplV;
        } else {
            if (i7 != 0) {
                str3 = "Order number";
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
            float fA = PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding);
            float fA2 = PrimitiveResources_androidKt.a(composerImplV, R.dimen.quarter_default_padding);
            float f = (float) 17.5d;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = PaddingKt.i(companion, fA, f, fA2, f);
            composerImplV.o(5004770);
            boolean z = (i5 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(6, function03);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierI, true, (Function1) objG2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function05 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function05);
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
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierB2 = rowScopeInstance.b(companion, vertical);
            String str5 = str3;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            int i11 = i5;
            if (composerImplV.O) {
                composerImplV.K(function05);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            final Function0 function06 = function03;
            TextKt.b(str5, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, (i11 >> 6) & 14, 0, 65534);
            composerImplV.o(5004770);
            int i12 = i11 & 14;
            boolean z2 = i12 == 4;
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str, 11);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            TextKt.b(str, SemanticsModifierKt.b(companion, false, (Function1) objG3), WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, i12, 0, 65528);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
            SpacerKt.a(composerImpl, rowScopeInstance.a(modifier2, 1.0f, true));
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(-1908313443, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderNumberDetailsItemKt$OrderNumberDetailsItem$3$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierQ = SizeKt.q(RowScopeInstance.f974a.b(Modifier.Companion.d, Alignment.Companion.k), 48);
                        composer2.o(1849434622);
                        Object objG4 = composer2.G();
                        if (objG4 == Composer.Companion.f1624a) {
                            objG4 = new l(1);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        IconButtonKt.a(function06, TestTagKt.a(SemanticsModifierKt.a(modifierQ, (Function1) objG4), "Copy order number"), false, ComposableSingletons$OrderNumberDetailsItemKt.f7793a, composer2, 3072, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 56);
            composerImpl.V(true);
            function04 = function06;
            str4 = str5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.instore.navigation.productfinder.a(str, modifier2, str4, function04, i, i2);
        }
    }
}
