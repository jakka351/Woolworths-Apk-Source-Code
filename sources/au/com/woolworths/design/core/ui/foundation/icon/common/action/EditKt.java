package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4904a;

    public static final ImageVector a() {
        ImageVector imageVector = f4904a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-edit", CollectionsKt.Q(new PathData("M5,19.25h1.4l8.625,-8.625 -1.4,-1.4L5,17.85zM19.3,9.175l-4.25,-4.2 1.4,-1.4A1.92,1.92 0,0 1,17.863 3q0.837,0 1.412,0.575l1.4,1.4q0.574,0.575 0.6,1.388a1.8,1.8 0,0 1,-0.55 1.387zM4,21.25a0.97,0.97 0,0 1,-0.712 -0.288A0.97,0.97 0,0 1,3 20.25v-2.825q0,-0.2 0.075,-0.387A1,1 0,0 1,3.3 16.7L13.6,6.4l4.25,4.25 -10.3,10.3q-0.15,0.15 -0.337,0.225t-0.388,0.075z", 0)));
        f4904a = imageVectorA;
        return imageVectorA;
    }
}
