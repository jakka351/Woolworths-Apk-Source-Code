package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbsDownKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4926a;

    public static final ImageVector a() {
        ImageVector imageVector = f4926a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-thumbs-down", CollectionsKt.Q(new PathData("M3,16q-0.8,0 -1.4,-0.6T1,14v-2q0,-0.175 0.05,-0.375t0.1,-0.375l3,-7.05q0.225,-0.5 0.75,-0.85T6,3h11v13l-6,5.95q-0.375,0.375 -0.887,0.438 -0.513,0.062 -0.988,-0.188a1.58,1.58 0,0 1,-0.7 -0.7q-0.225,-0.45 -0.1,-0.925L9.45,16zM15,15.15L15,5L6,5l-3,7v2h9l-1.35,5.5zM20,3q0.824,0 1.413,0.587Q22,4.176 22,5v9q0,0.825 -0.587,1.412A1.93,1.93 0,0 1,20 16h-3v-2h3L20,5h-3L17,3z", 0)));
        f4926a = imageVectorA;
        return imageVectorA;
    }
}
