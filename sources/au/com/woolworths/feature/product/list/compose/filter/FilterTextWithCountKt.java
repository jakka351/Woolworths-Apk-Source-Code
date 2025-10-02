package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterTextWithCountKt {
    public static final void a(String title, int i, long j, Composer composer, int i2) {
        long jH;
        int i3;
        ComposerImpl composerImpl;
        long j2;
        Intrinsics.h(title, "title");
        ComposerImpl composerImplV = composer.v(-1112000707);
        int i4 = i2 | (composerImplV.n(title) ? 32 : 16) | (composerImplV.r(i) ? 256 : 128) | 1024;
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                jH = WxTheme.a(composerImplV).h();
                i3 = i4 & (-7169);
            } else {
                composerImplV.j();
                i3 = i4 & (-7169);
                jH = j;
            }
            composerImplV.W();
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            long j3 = jH;
            TextKt.b(title, rowScopeInstance.a(companion, 1.0f, true), WxTheme.a(composerImplV).c(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i3 >> 3) & 14, 0, 65528);
            if (i > 0) {
                Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11);
                composerImplV.o(5004770);
                boolean zS = composerImplV.s(j3);
                Object objG = composerImplV.G();
                if (zS || objG == Composer.Companion.f1624a) {
                    objG = new e(j3, 0);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                j3 = j3;
                TextKt.b(String.valueOf(i), DrawModifierKt.b(modifierJ, (Function1) objG), WxTheme.a(composerImplV).e(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImplV, 0, 0, 65528);
                composerImpl = composerImplV;
            } else {
                composerImpl = composerImplV;
            }
            j2 = j3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(title, i, i2, j2, 0);
        }
    }
}
