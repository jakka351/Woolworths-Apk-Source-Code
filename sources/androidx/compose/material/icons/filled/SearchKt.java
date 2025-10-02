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
public final class SearchKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f1367a;

    public static final ImageVector a() {
        ImageVector imageVector = f1367a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = VectorKt.f1820a;
        SolidColor solidColor = new SolidColor(Color.b);
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(15.5f, 14.0f);
        pathBuilder.f(-0.79f);
        pathBuilder.h(-0.28f, -0.27f);
        pathBuilder.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        pathBuilder.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        pathBuilder.j(3.0f, 5.91f, 3.0f, 9.5f);
        pathBuilder.j(5.91f, 16.0f, 9.5f, 16.0f);
        pathBuilder.c(1.61f, BitmapDescriptorFactory.HUE_RED, 3.09f, -0.59f, 4.23f, -1.57f);
        pathBuilder.h(0.27f, 0.28f);
        pathBuilder.m(0.79f);
        pathBuilder.h(5.0f, 4.99f);
        pathBuilder.g(20.49f, 19.0f);
        pathBuilder.h(-4.99f, -5.0f);
        pathBuilder.a();
        pathBuilder.i(9.5f, 14.0f);
        pathBuilder.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        pathBuilder.j(7.01f, 5.0f, 9.5f, 5.0f);
        pathBuilder.j(14.0f, 7.01f, 14.0f, 9.5f);
        pathBuilder.j(11.99f, 14.0f, 9.5f, 14.0f);
        pathBuilder.a();
        builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
        ImageVector imageVectorD = builder.d();
        f1367a = imageVectorD;
        return imageVectorD;
    }
}
