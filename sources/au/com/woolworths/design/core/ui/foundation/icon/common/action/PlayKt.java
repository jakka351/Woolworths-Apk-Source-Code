package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlayKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4912a;

    public static final ImageVector a() {
        ImageVector imageVector = f4912a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-play", CollectionsKt.Q(new PathData("M9.525,18.023q-0.499,0.325 -1.013,0.037Q8,17.773 8,17.173V6.823q0,-0.6 0.512,-0.888 0.513,-0.288 1.013,0.038l8.15,5.175q0.45,0.3 0.45,0.85t-0.45,0.85z", 0)));
        f4912a = imageVectorA;
        return imageVectorA;
    }
}
