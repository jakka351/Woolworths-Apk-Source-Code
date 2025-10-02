package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.ComposableSingletons$FreshMagAsyncImageKt$lambda$-526465155$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FreshMagAsyncImageKt$lambda$526465155$1 implements Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> {
    public static final ComposableSingletons$FreshMagAsyncImageKt$lambda$526465155$1 d = new ComposableSingletons$FreshMagAsyncImageKt$lambda$526465155$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
        AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
        Intrinsics.h(it, "it");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            ImageKt.a(PainterResources_androidKt.a(R.drawable.fresh_mag_placeholder, 0, composer), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer, 48, 124);
        }
        return Unit.f24250a;
    }
}
