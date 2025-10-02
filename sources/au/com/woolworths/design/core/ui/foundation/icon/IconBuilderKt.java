package au.com.woolworths.design.core.ui.foundation.icon;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IconBuilderKt {
    public static final ImageVector a(String str, List pathData) {
        Intrinsics.h(pathData, "pathData");
        ImageVector.Builder builder = new ImageVector.Builder(str, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS);
        Iterator it = pathData.iterator();
        while (it.hasNext()) {
            PathData pathData2 = (PathData) it.next();
            builder.b((14420 & 16) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, pathData2.b, 0, 2, new SolidColor(Color.b), (14420 & 32) != 0 ? null : null, "", VectorKt.a(pathData2.f4896a));
        }
        return builder.d();
    }
}
