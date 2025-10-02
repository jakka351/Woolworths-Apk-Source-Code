package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ErrorScreenKt {
    public static final void a(Function1 onRetry, Function1 onTrackEvent, Composer composer, int i) {
        InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onTrackEvent, "onTrackEvent");
        ComposerImpl composerImplV = composer.v(-1214558808);
        int i2 = (composerImplV.r(0) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16) | (composerImplV.I(onTrackEvent) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1040096089);
            String strC = StringResources_androidKt.c(composerImplV, R.string.error_description_server);
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.v2.ui.f(onRetry);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            FullPageMessageSpec fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, strC, null, (Function0) objG, composerImplV, 23);
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(-1746271574);
            boolean zI = (i3 == 4) | composerImplV.I(context) | ((i2 & 896) == 256);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new ErrorScreenKt$ErrorScreen$1$1(context, onTrackEvent, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, instoreMapErrorState, (Function2) objG2);
            composerImplV = composerImplV;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(onRetry, onTrackEvent, i);
        }
    }
}
