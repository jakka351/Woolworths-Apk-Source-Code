package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BadgeKt {
    public static final void a(String text, int i, int i2, Modifier modifier, Composer composer, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        ComposerImpl composerImpl;
        Modifier modifier3;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-538473461);
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerImplV.n(text) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i7 = i5 | (composerImplV.r(i) ? 32 : 16) | (composerImplV.r(i2) ? 256 : 128);
        int i8 = i4 & 8;
        if (i8 != 0) {
            i6 = i7 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i6 = i7 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        if ((i6 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i8 != 0 ? Modifier.Companion.d : modifier2;
            composerImpl = composerImplV;
            TextKt.b(text, PaddingKt.g(BackgroundKt.b(modifier4, ColorResources_androidKt.a(composerImplV, i), RoundedCornerShapeKt.b(3)), 4, 2), ColorResources_androidKt.a(composerImplV, i2), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImpl, i6 & 14, 0, 65528);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(text, i, i2, modifier3, i3, i4);
        }
    }
}
