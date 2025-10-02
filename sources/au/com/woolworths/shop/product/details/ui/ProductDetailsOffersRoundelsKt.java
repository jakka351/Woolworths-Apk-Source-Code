package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsOffersRoundelsKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-161399752);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(str2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 << 3;
            b(RoudelSizes.e, str, str2, composerImplV, (i3 & 896) | (i3 & 112) | 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.preferences.g(str, str2, i, 4);
        }
    }

    public static final void b(RoudelSizes roudelSizes, String str, String str2, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(755918528);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(roudelSizes.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 2, BitmapDescriptorFactory.HUE_RED, 2);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            int i3 = i2 >> 3;
            SingletonAsyncImageKt.a(str, str2, BackgroundKt.b(BorderKt.a(SizeKt.q(ClipKt.a(modifierH, roundedCornerShape), roudelSizes.d), 1, Color.j, roundedCornerShape), CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a), null, ContentScale.Companion.d, composerImplV, (i3 & 14) | 1572864 | (i3 & 112), 1976);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(roudelSizes, str, str2, i, 24);
        }
    }

    public static final void c(String str, String str2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1742145030);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(str2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 << 3;
            b(RoudelSizes.f, str, str2, composerImplV, (i3 & 896) | (i3 & 112) | 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.preferences.g(str, str2, i, 5);
        }
    }
}
