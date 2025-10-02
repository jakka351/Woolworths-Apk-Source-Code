package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbUpFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4924a;

    public static final ImageVector a() {
        ImageVector imageVector = f4924a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-thumb-up-fill", CollectionsKt.Q(new PathData("M21,8q0.8,0 1.4,0.6T23,10v2a2,2 0,0 1,-0.15 0.75l-3,7.05q-0.225,0.5 -0.75,0.85T18,21h-8q-0.825,0 -1.412,-0.588A1.93,1.93 0,0 1,8 19V8.825q0,-0.4 0.162,-0.763 0.164,-0.362 0.438,-0.637l5.425,-5.4q0.375,-0.35 0.887,-0.425 0.513,-0.075 0.988,0.175 0.476,0.25 0.687,0.7 0.213,0.45 0.088,0.925L15.55,8zM4,21q-0.824,0 -1.412,-0.588A1.93,1.93 0,0 1,2 19v-9q0,-0.825 0.587,-1.413A1.93,1.93 0,0 1,4 8q0.824,0 1.412,0.587Q6,9.175 6,10v9q0,0.825 -0.588,1.412A1.93,1.93 0,0 1,4 21", 0)));
        f4924a = imageVectorA;
        return imageVectorA;
    }
}
