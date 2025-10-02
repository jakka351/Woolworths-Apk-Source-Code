package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbsDownFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4925a;

    public static final ImageVector a() {
        ImageVector imageVector = f4925a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-thumbs-down-fill", CollectionsKt.Q(new PathData("M3,16q-0.8,0 -1.4,-0.6T1,14v-2a2,2 0,0 1,0.15 -0.75l3,-7.05q0.225,-0.5 0.75,-0.85T6,3h8q0.825,0 1.412,0.587Q16,4.176 16,5v10.175q0,0.4 -0.162,0.762a2.1,2.1 0,0 1,-0.438 0.638l-5.425,5.4q-0.375,0.35 -0.887,0.425a1.58,1.58 0,0 1,-0.988 -0.175,1.5 1.5,0 0,1 -0.687,-0.7q-0.213,-0.45 -0.088,-0.925L8.45,16zM20,3q0.824,0 1.413,0.587Q22,4.176 22,5v9q0,0.825 -0.587,1.412A1.93,1.93 0,0 1,20 16q-0.824,0 -1.413,-0.588A1.93,1.93 0,0 1,18 14V5q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,20 3", 0)));
        f4925a = imageVectorA;
        return imageVectorA;
    }
}
