package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class KeyboardArrowRightKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f1353a;

    public static final ImageVector a() {
        ImageVector imageVector = f1353a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
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
        ImageVector imageVectorD = builder.d();
        f1353a = imageVectorD;
        return imageVectorD;
    }
}
