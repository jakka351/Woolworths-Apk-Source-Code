package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagAsyncImageKt {
    public static final void a(String imageUrl, Modifier modifier, Function1 function1, Composer composer, int i) {
        Intrinsics.h(imageUrl, "imageUrl");
        ComposerImpl composerImplV = composer.v(1763903870);
        int i2 = i | (composerImplV.n(imageUrl) ? 4 : 2) | (composerImplV.n(modifier) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
            composerImplV.o(-464436626);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.fresh_mag_placeholder, 0, composerImplV), null, modifier, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, (i2 & 896) | 48, 120);
            composerImplV.V(false);
        } else {
            composerImplV.o(-464236180);
            SingletonSubcomposeAsyncImageKt.b(imageUrl, null, modifier, ComposableSingletons$FreshMagAsyncImageKt.f8049a, ComposableSingletons$FreshMagAsyncImageKt.b, function1, null, composerImplV, (i2 & 14) | 1597488 | (i2 & 896) | ((i2 << 15) & 234881024), 0, 65192);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(imageUrl, modifier, function1, i, 0);
        }
    }
}
