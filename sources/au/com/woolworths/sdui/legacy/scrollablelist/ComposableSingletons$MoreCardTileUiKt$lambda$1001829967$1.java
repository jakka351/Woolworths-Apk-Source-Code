package au.com.woolworths.sdui.legacy.scrollablelist;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.rounded.KeyboardArrowRightKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.sdui.legacy.scrollablelist.ComposableSingletons$MoreCardTileUiKt$lambda$-1001829967$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MoreCardTileUiKt$lambda$1001829967$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MoreCardTileUiKt$lambda$1001829967$1 d = new ComposableSingletons$MoreCardTileUiKt$lambda$1001829967$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 56);
            ImageVector imageVectorD = KeyboardArrowRightKt.f1372a;
            if (imageVectorD == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = VectorKt.f1820a;
                SolidColor solidColor = new SolidColor(Color.b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(9.29f, 15.88f);
                pathBuilder.g(13.17f, 12.0f);
                pathBuilder.g(9.29f, 8.12f);
                pathBuilder.c(-0.39f, -0.39f, -0.39f, -1.02f, BitmapDescriptorFactory.HUE_RED, -1.41f);
                pathBuilder.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, BitmapDescriptorFactory.HUE_RED);
                pathBuilder.h(4.59f, 4.59f);
                pathBuilder.c(0.39f, 0.39f, 0.39f, 1.02f, BitmapDescriptorFactory.HUE_RED, 1.41f);
                pathBuilder.g(10.7f, 17.3f);
                pathBuilder.c(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, BitmapDescriptorFactory.HUE_RED);
                pathBuilder.c(-0.38f, -0.39f, -0.39f, -1.03f, BitmapDescriptorFactory.HUE_RED, -1.42f);
                pathBuilder.a();
                builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                imageVectorD = builder.d();
                KeyboardArrowRightKt.f1372a = imageVectorD;
            }
            IconKt.b(imageVectorD, null, modifierQ, CoreTheme.b(composer).c.c.f4824a.f4825a.f4826a, composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
