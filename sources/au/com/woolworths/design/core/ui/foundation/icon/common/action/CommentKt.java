package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4901a;

    public static final ImageVector a() {
        ImageVector imageVector = f4901a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-comment", CollectionsKt.Q(new PathData("M11,12v2q0,0.424 0.287,0.713 0.288,0.287 0.713,0.287 0.424,0 0.713,-0.287A0.97,0.97 0,0 0,13 14v-2h2q0.424,0 0.713,-0.287A0.97,0.97 0,0 0,16 11a0.97,0.97 0,0 0,-0.287 -0.713A0.97,0.97 0,0 0,15 10h-2L13,8a0.97,0.97 0,0 0,-0.287 -0.713A0.97,0.97 0,0 0,12 7a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,11 8v2L9,10a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,8 11q0,0.424 0.287,0.713Q8.576,12 9,12zM6,19 L3.7,21.3q-0.476,0.475 -1.088,0.212Q2,21.25 2,20.575L2,5q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,4 3h16q0.824,0 1.413,0.587Q22,4.176 22,5v12q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,20 19zM4,17h16L20,5L4,5z", 0)));
        f4901a = imageVectorA;
        return imageVectorA;
    }
}
