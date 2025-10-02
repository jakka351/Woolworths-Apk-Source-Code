package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PauseKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4911a;

    public static final ImageVector a() {
        ImageVector imageVector = f4911a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-pause", CollectionsKt.Q(new PathData("M16,19q-0.825,0 -1.412,-0.587A1.93,1.93 0,0 1,14 17V7q0,-0.824 0.588,-1.412A1.93,1.93 0,0 1,16 5q0.824,0 1.413,0.588Q18,6.175 18,7v10q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,16 19m-8,0q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,6 17V7q0,-0.824 0.588,-1.412A1.93,1.93 0,0 1,8 5q0.825,0 1.412,0.588Q10,6.175 10,7v10q0,0.824 -0.588,1.413A1.93,1.93 0,0 1,8 19", 0)));
        f4911a = imageVectorA;
        return imageVectorA;
    }
}
