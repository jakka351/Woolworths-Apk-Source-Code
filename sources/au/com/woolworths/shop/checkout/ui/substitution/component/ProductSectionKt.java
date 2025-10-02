package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.c;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductSectionKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(576003073);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(ClipKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), RoundedCornerShapeKt.b(8)), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            CoreRowSpec.Image.RemoteImage remoteImage = new CoreRowSpec.Image.RemoteImage(str2, PainterResources_androidKt.a(R.drawable.ic_campaign_default, 0, composerImplV), CoreRowSpec.ImageSize.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SimpleRowKt.a(str, (Function0) objG, modifierB, null, null, remoteImage, null, null, null, composerImplV, (i2 & 14) | 262192, 472);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, i, 3);
        }
    }
}
