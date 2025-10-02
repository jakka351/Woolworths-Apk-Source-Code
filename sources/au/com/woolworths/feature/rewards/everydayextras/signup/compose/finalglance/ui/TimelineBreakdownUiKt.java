package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TimelineBreakdownUiKt {
    public static final void a(List list, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-393717129);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 3) != 2 || !composerImplV.c()) {
            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1607017853);
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    composerImplV.V(false);
                    composerImplV.V(true);
                    break;
                }
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem timelineBreakdownItem = (EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem) next;
                if (i3 >= list.size() - 1) {
                    z = false;
                }
                b(timelineBreakdownItem, z, null, composerImplV, 0);
                i3 = i4;
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 0, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public static final void b(EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem timelineBreakdownItem, boolean z, Modifier modifier, Composer composer, int i) {
        boolean z2;
        boolean z3;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(461548273);
        int i2 = i | (composerImplV.n(timelineBreakdownItem) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            composerImplV.o(5004770);
            boolean z4 = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z4 || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.fragment.e(timelineBreakdownItem, 29);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = SemanticsModifierKt.a(companion, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f = 24;
            Modifier modifierU = SizeKt.u(companion, f);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, Alignment.Companion.n, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierU);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            SingletonAsyncImageKt.a(timelineBreakdownItem.c, null, SizeKt.q(companion, 20), null, null, composerImplV, 432, 2040);
            composerImplV.o(1201684493);
            if (z) {
                z2 = 0;
                BoxKt.a(TestTagKt.a(BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.u(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 8, 1), 2), 36), RoundedCornerShapeKt.b(60)), ToneColors.g, RectangleShapeKt.f1779a), "TimeLineTag"), composerImplV, 0);
            } else {
                z2 = 0;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composerImplV, z2);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(-1111240273);
            if (timelineBreakdownItem.f6150a != null) {
                z3 = z2;
                TextKt.b(timelineBreakdownItem.f6150a, PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, 48, 0, 65020);
                composerImpl = composerImplV;
            } else {
                z3 = z2;
                composerImpl = composerImplV;
            }
            composerImpl.V(z3);
            composerImpl.o(-1111228069);
            ComposerImpl composerImpl3 = composerImpl;
            if (timelineBreakdownItem.b != null) {
                float f2 = 16;
                ComposerImpl composerImpl4 = composerImpl;
                TextKt.b(timelineBreakdownItem.b, PaddingKt.i(SizeKt.e(companion, 1.0f), f2, 8, f2, f), WxTheme.a(composerImpl).f(), 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).l, composerImpl4, 0, 0, 65016);
                composerImpl3 = composerImpl4;
            }
            android.support.v4.media.session.a.C(composerImpl3, z3, true, true);
            modifier2 = companion;
            composerImpl2 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(timelineBreakdownItem, z, modifier2, i, 4);
        }
    }
}
