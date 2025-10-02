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
public final class AddKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f1354a;

    public static final ImageVector a() {
        ImageVector imageVector = f1354a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = VectorKt.f1820a;
        SolidColor solidColor = new SolidColor(Color.b);
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(19.0f, 13.0f);
        pathBuilder.f(-6.0f);
        pathBuilder.m(6.0f);
        pathBuilder.f(-2.0f);
        pathBuilder.m(-6.0f);
        pathBuilder.e(5.0f);
        pathBuilder.m(-2.0f);
        pathBuilder.f(6.0f);
        pathBuilder.l(5.0f);
        pathBuilder.f(2.0f);
        pathBuilder.m(6.0f);
        pathBuilder.f(6.0f);
        pathBuilder.m(2.0f);
        pathBuilder.a();
        builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
        ImageVector imageVectorD = builder.d();
        f1354a = imageVectorD;
        return imageVectorD;
    }
}
