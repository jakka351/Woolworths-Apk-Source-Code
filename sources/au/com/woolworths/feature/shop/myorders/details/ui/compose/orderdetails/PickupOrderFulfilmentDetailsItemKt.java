package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickupOrderFulfilmentDetailsItemKt {
    public static final void a(String str, List list, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-762723613);
        int i2 = ((i & 6) == 0 ? (composerImplV.n(str) ? 4 : 2) | i : i) | (composerImplV.I(list) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long j = CoreTheme.b(composerImplV).e.f4848a.c;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), BitmapDescriptorFactory.HUE_RED, 24, 1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
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
            TextKt.a(str, CoreTheme.f(composerImplV).d.c.b, PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes, 1008);
            composerImplV.o(-2008149444);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                OrderDetailFulfilmentData orderDetailFulfilmentData = (OrderDetailFulfilmentData) obj;
                String str2 = orderDetailFulfilmentData.b;
                String str3 = orderDetailFulfilmentData.f7797a;
                Function0 function02 = orderDetailFulfilmentData.d;
                ImageVector imageVector = orderDetailFulfilmentData.c;
                SimpleRowKt.a(str2, function02, null, null, str3, null, imageVector != null ? new CoreRowSpec.Image.LocalImage(imageVector, null, BitmapDescriptorFactory.HUE_RED, 6) : null, null, i4 == CollectionsKt.I(list) ? CoreRowSpec.DividerType.d : CoreRowSpec.DividerType.f, composerImplV, 0, 172);
                i4 = i5;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, i, 5, list);
        }
    }
}
