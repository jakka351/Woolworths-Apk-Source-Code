package androidx.compose.material3;

import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$DatePickerKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$DatePickerKt$lambda2$1 h = new ComposableSingletons$DatePickerKt$lambda2$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageVector imageVectorD = DateRangeKt.f1359a;
            if (imageVectorD == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = VectorKt.f1820a;
                SolidColor solidColor = new SolidColor(Color.b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(9.0f, 11.0f);
                pathBuilder.g(7.0f, 11.0f);
                pathBuilder.m(2.0f);
                pathBuilder.f(2.0f);
                pathBuilder.m(-2.0f);
                pathBuilder.a();
                pathBuilder.i(13.0f, 11.0f);
                pathBuilder.f(-2.0f);
                pathBuilder.m(2.0f);
                pathBuilder.f(2.0f);
                pathBuilder.m(-2.0f);
                pathBuilder.a();
                pathBuilder.i(17.0f, 11.0f);
                pathBuilder.f(-2.0f);
                pathBuilder.m(2.0f);
                pathBuilder.f(2.0f);
                pathBuilder.m(-2.0f);
                pathBuilder.a();
                pathBuilder.i(19.0f, 4.0f);
                pathBuilder.f(-1.0f);
                pathBuilder.g(18.0f, 2.0f);
                pathBuilder.f(-2.0f);
                pathBuilder.m(2.0f);
                pathBuilder.g(8.0f, 4.0f);
                pathBuilder.g(8.0f, 2.0f);
                pathBuilder.g(6.0f, 2.0f);
                pathBuilder.m(2.0f);
                pathBuilder.g(5.0f, 4.0f);
                pathBuilder.c(-1.11f, BitmapDescriptorFactory.HUE_RED, -1.99f, 0.9f, -1.99f, 2.0f);
                pathBuilder.g(3.0f, 20.0f);
                pathBuilder.c(BitmapDescriptorFactory.HUE_RED, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                pathBuilder.f(14.0f);
                pathBuilder.c(1.1f, BitmapDescriptorFactory.HUE_RED, 2.0f, -0.9f, 2.0f, -2.0f);
                pathBuilder.g(21.0f, 6.0f);
                pathBuilder.c(BitmapDescriptorFactory.HUE_RED, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                pathBuilder.a();
                pathBuilder.i(19.0f, 20.0f);
                pathBuilder.g(5.0f, 20.0f);
                pathBuilder.g(5.0f, 9.0f);
                pathBuilder.f(14.0f);
                pathBuilder.m(11.0f);
                pathBuilder.a();
                builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                imageVectorD = builder.d();
                DateRangeKt.f1359a = imageVectorD;
            }
            IconKt.b(imageVectorD, Strings_androidKt.a(composer, com.woolworths.R.string.m3c_date_picker_switch_to_calendar_mode), null, 0L, composer, 0, 12);
        }
        return Unit.f24250a;
    }
}
