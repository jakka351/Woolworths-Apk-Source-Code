package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4919a;

    public static final ImageVector a() {
        ImageVector imageVector = f4919a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-search", CollectionsKt.Q(new PathData("M9.5,16q-2.725,0 -4.612,-1.887T3,9.5t1.888,-4.612T9.5,3t4.613,1.888T16,9.5a6.1,6.1 0,0 1,-1.3 3.8l5.6,5.6a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7 0.95,0.95 0,0 1,-0.7 0.275,0.95 0.95,0 0,1 -0.7,-0.275l-5.6,-5.6q-0.75,0.6 -1.725,0.95T9.5,16m0,-2q1.875,0 3.188,-1.312Q14,11.375 14,9.5t-1.312,-3.187T9.5,5 6.313,6.313 5,9.5t1.313,3.188T9.5,14", 0)));
        f4919a = imageVectorA;
        return imageVectorA;
    }
}
