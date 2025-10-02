package androidx.navigation.compose.internal;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat;", "BackEventCompat", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavComposeUtils_androidKt {
    public static final void a(boolean z, Function2 function2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1818896922);
        int i2 = (composerImplV.p(z) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            PredictiveBackHandlerKt.a(z, function2, composerImplV, i2 & 126);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, function2, i);
        }
    }
}
