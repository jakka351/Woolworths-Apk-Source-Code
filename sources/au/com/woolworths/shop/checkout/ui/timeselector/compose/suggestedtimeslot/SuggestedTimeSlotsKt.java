package au.com.woolworths.shop.checkout.ui.timeselector.compose.suggestedtimeslot;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSlotItemKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedTimeSlotsKt {
    public static final void a(String str, FulfilmentBottomSheet fulfilmentBottomSheet, List list, Function1 onClick, Function1 onClickTooltip, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Function1 function1;
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        Object obj = fulfilmentBottomSheet;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(onClickTooltip, "onClickTooltip");
        ComposerImpl composerImplV = composer.v(-151643159);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(obj) ? 32 : 16) | (composerImplV.I(list) ? 256 : 128) | (composerImplV.I(onClick) ? 2048 : 1024) | (composerImplV.I(onClickTooltip) ? 16384 : 8192) | (composerImplV.n(modifier) ? 131072 : 65536);
        if ((i2 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            function1 = onClickTooltip;
            composerImpl = composerImplV;
        } else {
            float f = 16;
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(modifier, CoreTheme.b(composerImplV).b.f4803a.c, RectangleShapeKt.f1779a), f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(-935472480);
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (str == null) {
                function1 = onClickTooltip;
                companion = companion2;
                composerImpl = composerImplV;
                z = false;
                z2 = true;
            } else {
                Modifier modifierJ = PaddingKt.j(SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    b.B(i4, composerImplV, i4, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                composerImpl = composerImplV;
                function1 = onClickTooltip;
                companion = companion2;
                TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImpl, i2 & 14, 1012);
                composerImpl.o(1570118109);
                if (fulfilmentBottomSheet == null) {
                    obj = fulfilmentBottomSheet;
                } else {
                    ImageVector imageVector = CoreTheme.e(composerImpl).i.c;
                    composerImpl.o(-1633490746);
                    boolean z3 = ((i2 & 57344) == 16384) | ((i2 & 112) == 32);
                    Object objG = composerImpl.G();
                    if (z3 || objG == Composer.Companion.f1624a) {
                        obj = fulfilmentBottomSheet;
                        objG = new c(11, function1, obj);
                        composerImpl.A(objG);
                    } else {
                        obj = fulfilmentBottomSheet;
                    }
                    composerImpl.V(false);
                    IconKt.b(imageVector, "Tooltip", ClickableKt.d(companion, false, null, null, (Function0) objG, 7), 0L, composerImpl, 48, 8);
                    composerImpl = composerImpl;
                }
                z = false;
                composerImpl.V(false);
                z2 = true;
                composerImpl.V(true);
            }
            composerImpl.V(z);
            composerImpl.o(-935445763);
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TimeSlotItemKt.a((FulfilmentSlot) obj2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, i5 == 0 ? 0 : 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), onClick, composerImpl, (i2 >> 3) & 896, 0);
                i5 = i6;
            }
            composerImpl.V(false);
            composerImpl.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(str, obj, list, onClick, function1, modifier, i, 12);
        }
    }
}
