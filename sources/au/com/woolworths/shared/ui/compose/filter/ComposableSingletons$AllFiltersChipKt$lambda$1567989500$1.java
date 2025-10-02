package au.com.woolworths.shared.ui.compose.filter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$AllFiltersChipKt$lambda$1567989500$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AllFiltersChipKt$lambda$1567989500$1 d = new ComposableSingletons$AllFiltersChipKt$lambda$1567989500$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierQ = SizeKt.q(PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 14);
            ImageVector imageVectorD = CheckCircleKt.f1356a;
            if (imageVectorD == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = VectorKt.f1820a;
                SolidColor solidColor = new SolidColor(Color.b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(12.0f, 2.0f);
                pathBuilder.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                pathBuilder.k(4.48f, 10.0f, 10.0f, 10.0f);
                pathBuilder.k(10.0f, -4.48f, 10.0f, -10.0f);
                pathBuilder.j(17.52f, 2.0f, 12.0f, 2.0f);
                pathBuilder.a();
                pathBuilder.i(10.0f, 17.0f);
                pathBuilder.h(-5.0f, -5.0f);
                pathBuilder.h(1.41f, -1.41f);
                pathBuilder.g(10.0f, 14.17f);
                pathBuilder.h(7.59f, -7.59f);
                pathBuilder.g(19.0f, 8.0f);
                pathBuilder.h(-9.0f, 9.0f);
                pathBuilder.a();
                builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                imageVectorD = builder.d();
                CheckCircleKt.f1356a = imageVectorD;
            }
            IconKt.b(imageVectorD, null, modifierQ, WxTheme.a(composer).h(), composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
