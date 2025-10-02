package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.platform.InspectionModeKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"image-gallery_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GalleryAsyncImageKt {
    public static final void a(String str, String str2, final ColorPainter colorPainter, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1274358674);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.I(colorPainter) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
            composerImplV.o(-1203009852);
            ImageKt.a(colorPainter, null, modifier, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, ((i2 >> 6) & 14) | 48 | ((i2 >> 3) & 896), 120);
            composerImplV.V(false);
        } else {
            composerImplV.o(-1202847102);
            SingletonSubcomposeAsyncImageKt.b(str, str2, modifier, ComposableSingletons$GalleryAsyncImageKt.f8924a, ComposableLambdaKt.c(1249068879, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryAsyncImageKt$GalleryAsyncImage$1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 129) == 128 && composer2.c()) {
                        composer2.j();
                    } else {
                        ImageKt.a(colorPainter, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, composerImplV, ((i2 >> 3) & 896) | (i2 & 14) | 1597440 | (i2 & 112) | 100663296, 0, 65192);
            composerImplV = composerImplV;
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(str, str2, colorPainter, modifier, i, 25);
        }
    }
}
