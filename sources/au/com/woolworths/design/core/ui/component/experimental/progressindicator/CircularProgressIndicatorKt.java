package au.com.woolworths.design.core.ui.component.experimental.progressindicator;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CircularProgressIndicatorKt {
    public static final void a(Function0 progress, Modifier modifier, float f, int i, Composer composer, int i2) {
        float f2;
        int i3;
        float f3;
        int i4;
        Intrinsics.h(progress, "progress");
        ComposerImpl composerImplV = composer.v(660387078);
        if (((i2 | 1408) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
            i4 = i;
        } else {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                f2 = 4;
                i3 = 1;
            } else {
                composerImplV.j();
                f2 = f;
                i3 = i;
            }
            composerImplV.W();
            ProgressIndicatorKt.a(progress, modifier, CoreTheme.b(composerImplV).e.c.f4854a, f2, CoreTheme.b(composerImplV).e.f4848a.c, i3, BitmapDescriptorFactory.HUE_RED, composerImplV, 3126, 64);
            f3 = f2;
            i4 = i3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(progress, modifier, f3, i4, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r17, long r18, float r20, int r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt.b(androidx.compose.ui.Modifier, long, float, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
