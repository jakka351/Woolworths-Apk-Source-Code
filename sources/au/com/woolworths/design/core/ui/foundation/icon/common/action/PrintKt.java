package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrintKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4916a;

    public static final ImageVector a() {
        ImageVector imageVector = f4916a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-print", CollectionsKt.Q(new PathData("M16,8L16,5L8,5v3L6,8L6,4q0,-0.424 0.287,-0.712A0.97,0.97 0,0 1,7 3h10q0.424,0 0.712,0.288Q18,3.575 18,4v4zM18,12.5q0.424,0 0.712,-0.287A0.97,0.97 0,0 0,19 11.5a0.97,0.97 0,0 0,-0.288 -0.713A0.97,0.97 0,0 0,18 10.5a0.97,0.97 0,0 0,-0.712 0.287,0.97 0.97,0 0,0 -0.288,0.713q0,0.424 0.288,0.713 0.287,0.287 0.712,0.287M8,19h8v-4L8,15zM8,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,6 19v-2L3,17a0.97,0.97 0,0 1,-0.712 -0.288A0.97,0.97 0,0 1,2 16v-5q0,-1.275 0.875,-2.137T5,8h14q1.276,0 2.137,0.863Q22,9.725 22,11v5q0,0.424 -0.288,0.712A0.97,0.97 0,0 1,21 17h-3v2q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,16 21zM20,15v-4a0.97,0.97 0,0 0,-0.288 -0.713A0.97,0.97 0,0 0,19 10L5,10a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,4 11v4h2v-2h12v2z", 0)));
        f4916a = imageVectorA;
        return imageVectorA;
    }
}
