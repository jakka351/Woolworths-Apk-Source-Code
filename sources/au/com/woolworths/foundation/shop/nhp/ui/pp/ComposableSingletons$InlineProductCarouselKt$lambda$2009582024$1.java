package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonAsyncImagePainterKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$InlineProductCarouselKt$lambda$2009582024$1 implements Function3<String, Composer, Integer, Unit> {
    public static final ComposableSingletons$InlineProductCarouselKt$lambda$2009582024$1 d = new ComposableSingletons$InlineProductCarouselKt$lambda$2009582024$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(str) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            AsyncImagePainter asyncImagePainterA = SingletonAsyncImagePainterKt.a(iIntValue & 14, composer, str);
            AsyncImagePainter.State state = (AsyncImagePainter.State) SnapshotStateKt.a(asyncImagePainterA.x, composer).getD();
            if (state instanceof AsyncImagePainter.State.Success) {
                composer.o(-90851499);
                ImageKt.a(asyncImagePainterA, null, PaddingKt.f(SizeKt.c, 8), null, null, BitmapDescriptorFactory.HUE_RED, null, composer, 432, 120);
                composer.l();
            } else if (state instanceof AsyncImagePainter.State.Error) {
                composer.o(-90495371);
                SurfaceKt.b(PaddingKt.f(SizeKt.c, 8), RoundedCornerShapeKt.b(4), CoreTheme.b(composer).e.f4848a.d, 0L, null, null, ComposableSingletons$InlineProductCarouselKt.b, composer, 56);
                composer.l();
            } else {
                composer.o(-1526917076);
                composer.l();
            }
        }
        return Unit.f24250a;
    }
}
