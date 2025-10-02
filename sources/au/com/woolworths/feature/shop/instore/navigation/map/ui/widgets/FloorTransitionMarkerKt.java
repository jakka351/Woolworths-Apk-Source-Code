package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorTransitionType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FloorTransitionMarkerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FloorTransitionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FloorTransitionType.Companion companion = FloorTransitionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FloorTransitionType.Companion companion2 = FloorTransitionType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FloorTransitionType.Companion companion3 = FloorTransitionType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(FloorTransitionType floorTransitionType, Modifier modifier, float f, Composer composer, int i) {
        int i2;
        int i3;
        ComposerImpl composerImplV = composer.v(1217689458);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(floorTransitionType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 432) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            f = 50;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int iOrdinal = floorTransitionType.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_stairs;
            } else if (iOrdinal == 1) {
                i3 = R.drawable.ic_elevator;
            } else if (iOrdinal == 2) {
                i3 = R.drawable.ic_escalator;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.drawable.ic_ramp;
            }
            IconKt.a(PainterResources_androidKt.a(i3, 0, composerImplV), null, SizeKt.q(companion, f), ToneColors.f5162a, composerImplV, 48, 0);
            composerImplV.V(true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.progressindicator.b(floorTransitionType, modifier, f, i);
        }
    }
}
