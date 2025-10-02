package au.com.woolworths.design.core.ui.foundation.icon.common.view;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListViewKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5058a;

    public static final ImageVector a() {
        ImageVector imageVector = f5058a;
        if (imageVector != null) {
            return imageVector;
        }
        PathData pathData = new PathData("M5,11q-0.824,0 -1.412,-0.588A1.93,1.93 0,0 1,3 9L3,5q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,5 3h4q0.825,0 1.412,0.587Q11,4.176 11,5v4q0,0.825 -0.588,1.412A1.93,1.93 0,0 1,9 11zM5,9h4L9,5L5,5zM5,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,3 19v-4q0,-0.825 0.587,-1.412A1.93,1.93 0,0 1,5 13h4q0.825,0 1.412,0.588Q11,14.175 11,15v4q0,0.824 -0.588,1.413A1.93,1.93 0,0 1,9 21zM5,19h4v-4L5,15z", 1);
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-view-list-view", CollectionsKt.R(pathData, new PathData("M13,5c0,-0.552 0.398,-1 0.889,-1h6.222c0.491,0 0.889,0.448 0.889,1s-0.398,1 -0.889,1H13.89c-0.492,0 -0.89,-0.448 -0.89,-1m0.889,9c-0.491,0 -0.889,0.448 -0.889,1s0.398,1 0.889,1h6.222c0.491,0 0.889,-0.448 0.889,-1s-0.398,-1 -0.889,-1zM13,9c0,-0.552 0.398,-1 0.889,-1h6.222c0.491,0 0.889,0.448 0.889,1s-0.398,1 -0.889,1H13.89c-0.492,0 -0.89,-0.448 -0.89,-1m0.889,9c-0.491,0 -0.889,0.448 -0.889,1s0.398,1 0.889,1h6.222c0.491,0 0.889,-0.448 0.889,-1s-0.398,-1 -0.889,-1z", 0)));
        f5058a = imageVectorA;
        return imageVectorA;
    }
}
