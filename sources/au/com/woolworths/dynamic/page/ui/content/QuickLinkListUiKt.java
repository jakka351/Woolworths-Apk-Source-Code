package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.QuickLinkListData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class QuickLinkListUiKt {
    public static final void a(QuickLinkListData data, Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        Function2 function22;
        int i3;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        ComposerImpl composerImplV = composer.v(1726280800);
        int i4 = i | (composerImplV.I(data) ? 4 : 2);
        int i5 = i4 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 432;
            function22 = function2;
        } else {
            function22 = function2;
            i3 = i5 | (composerImplV.I(function22) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new androidx.navigation.compose.h(22, (byte) 0);
                    composerImplV.A(objG);
                }
                function22 = (Function2) objG;
                composerImplV.V(false);
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(SizeKt.e(companion, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 4, 5);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(10);
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 896) == 256) | composerImplV.I(data);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new f(data, function22, 2);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.d(modifierJ, null, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG2, composerImpl, 24960, 490);
            modifier2 = companion;
        }
        Function2 function23 = function22;
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(i, i2, 12, modifier2, data, function23);
        }
    }
}
