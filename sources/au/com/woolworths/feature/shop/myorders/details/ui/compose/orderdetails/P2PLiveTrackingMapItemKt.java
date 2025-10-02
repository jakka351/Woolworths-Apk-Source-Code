package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isVisible", "my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class P2PLiveTrackingMapItemKt {
    public static final void a(int i, Composer composer, Modifier modifier, String liveTrackingMapUrl) {
        Intrinsics.h(liveTrackingMapUrl, "liveTrackingMapUrl");
        ComposerImpl composerImplV = composer.v(-1069039684);
        int i2 = (composerImplV.n(liveTrackingMapUrl) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(5004770, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new P2PLiveTrackingMapItemKt$P2PLiveTrackingMapItem$1$1(mutableState, null);
                composerImplV.A(objD);
            }
            composerImplV.V(false);
            int i3 = i2 & 14;
            EffectsKt.e(composerImplV, liveTrackingMapUrl, (Function2) objD);
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion, 1));
            if (((Boolean) mutableState.getD()).booleanValue()) {
                Modifier modifierA = AspectRatioKt.a(SizeKt.e(companion, 1.0f), 1.0f);
                composerImplV.o(-1633490746);
                boolean z = i3 == 4;
                Object objG2 = composerImplV.G();
                if (z || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(15, liveTrackingMapUrl, mutableState);
                    composerImplV.A(objG2);
                }
                Function1 function1 = (Function1) objG2;
                Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
                if (objD2 == composer$Companion$Empty$1) {
                    objD2 = new l(3);
                    composerImplV.A(objD2);
                }
                Function1 function12 = (Function1) objD2;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z2 = i3 == 4;
                Object objG3 = composerImplV.G();
                if (z2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(liveTrackingMapUrl, 12);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                AndroidView_androidKt.b(function1, modifierA, null, function12, (Function1) objG3, composerImplV, 3072, 4);
            }
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(liveTrackingMapUrl, modifier, i, 8);
        }
    }
}
