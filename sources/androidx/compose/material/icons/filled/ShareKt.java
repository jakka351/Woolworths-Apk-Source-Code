package androidx.compose.material.icons.filled;

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
public final class ShareKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f1368a;

    public static final ImageVector a() {
        ImageVector imageVector = f1368a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = VectorKt.f1820a;
        SolidColor solidColor = new SolidColor(Color.b);
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(18.0f, 16.08f);
        pathBuilder.c(-0.76f, BitmapDescriptorFactory.HUE_RED, -1.44f, 0.3f, -1.96f, 0.77f);
        pathBuilder.g(8.91f, 12.7f);
        pathBuilder.c(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        pathBuilder.k(-0.04f, -0.47f, -0.09f, -0.7f);
        pathBuilder.h(7.05f, -4.11f);
        pathBuilder.c(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        pathBuilder.c(1.66f, BitmapDescriptorFactory.HUE_RED, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.k(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.k(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.c(BitmapDescriptorFactory.HUE_RED, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        pathBuilder.g(8.04f, 9.81f);
        pathBuilder.b(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        pathBuilder.c(-1.66f, BitmapDescriptorFactory.HUE_RED, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.k(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.c(0.79f, BitmapDescriptorFactory.HUE_RED, 1.5f, -0.31f, 2.04f, -0.81f);
        pathBuilder.h(7.12f, 4.16f);
        pathBuilder.c(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        pathBuilder.c(BitmapDescriptorFactory.HUE_RED, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        pathBuilder.c(1.61f, BitmapDescriptorFactory.HUE_RED, 2.92f, -1.31f, 2.92f, -2.92f);
        pathBuilder.k(-1.31f, -2.92f, -2.92f, -2.92f);
        pathBuilder.a();
        builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
        ImageVector imageVectorD = builder.d();
        f1368a = imageVectorD;
        return imageVectorD;
    }
}
