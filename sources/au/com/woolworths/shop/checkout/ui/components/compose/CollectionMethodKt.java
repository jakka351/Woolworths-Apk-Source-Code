package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CollectionMethodKt {
    public static final void a(int i, Composer composer, String title, List options, Function1 onOptionSelected) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(title, "title");
        Intrinsics.h(options, "options");
        Intrinsics.h(onOptionSelected, "onOptionSelected");
        ComposerImpl composerImplV = composer.v(-444514803);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.I(options) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onOptionSelected) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f = 16;
            int i5 = i3;
            TextKt.b(title, PaddingKt.f(companion, f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, (i3 & 14) | 48, 0, 65532);
            composerImpl = composerImplV;
            composerImpl.o(1849434622);
            Object objG = composerImpl.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(5);
                composerImpl.A(objG);
            }
            composerImpl.V(false);
            Modifier.Companion companion2 = companion;
            float f2 = 1.0f;
            Modifier modifierE = SizeKt.e(SemanticsModifierKt.b(companion2, false, (Function1) objG), 1.0f);
            float f3 = 8;
            Modifier modifierJ = PaddingKt.j(modifierE, f3, BitmapDescriptorFactory.HUE_RED, f3, f, 2);
            float f4 = f3;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImpl, 0);
            int i6 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierJ);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, rowMeasurePolicyA, function2);
            Updater.b(composerImpl, persistentCompositionLocalMapQ2, function22);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImpl, i6, function23);
            }
            Updater.b(composerImpl, modifierD2, function24);
            composerImpl.o(349202318);
            Iterator it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final CollectionMethodOption collectionMethodOption = (CollectionMethodOption) it.next();
                Modifier modifierA = TestTagKt.a(RowScopeInstance.f974a.a(SizeKt.g(PaddingKt.h(companion2, f4, BitmapDescriptorFactory.HUE_RED, 2), 48), f2, true), collectionMethodOption.f10594a);
                boolean z = collectionMethodOption.c;
                composerImpl.o(-1633490746);
                float f5 = f4;
                boolean zN = composerImpl.n(collectionMethodOption) | ((i5 & 896) == 256);
                Object objG2 = composerImpl.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.sdui.common.alert.a(25, onOptionSelected, collectionMethodOption);
                    composerImpl.A(objG2);
                }
                composerImpl.V(false);
                ComposerImpl composerImpl2 = composerImpl;
                FilterChipKt.a(true, z, (Function0) objG2, modifierA, null, 0L, 0L, null, null, null, ComposableLambdaKt.c(-209709168, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.CollectionMethodKt$CollectionMethod$1$2$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope FilterChip = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(FilterChip, "$this$FilterChip");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierE2 = SizeKt.e(Modifier.Companion.d, 1.0f);
                            TextKt.b(collectionMethodOption.f10594a, modifierE2, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 48, 0, 65020);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl), composerImpl2, 6, 48, 2032);
                composerImpl = composerImpl2;
                f2 = 1.0f;
                companion2 = companion2;
                f4 = f5;
                composer$Companion$Empty$1 = composer$Companion$Empty$1;
            }
            android.support.v4.media.session.a.C(composerImpl, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(title, options, onOptionSelected, i, 0);
        }
    }
}
