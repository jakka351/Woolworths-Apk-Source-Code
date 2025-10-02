package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EllipsisKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4905a;

    public static final ImageVector a() {
        ImageVector imageVector = f4905a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-ellipsis", CollectionsKt.Q(new PathData("M6,14q-0.824,0 -1.412,-0.588A1.93,1.93 0,0 1,4 12q0,-0.825 0.588,-1.412A1.93,1.93 0,0 1,6 10q0.824,0 1.412,0.588Q8,11.175 8,12t-0.588,1.412A1.93,1.93 0,0 1,6 14m6,0q-0.825,0 -1.412,-0.588A1.93,1.93 0,0 1,10 12q0,-0.825 0.588,-1.412A1.93,1.93 0,0 1,12 10q0.825,0 1.412,0.588Q14,11.175 14,12t-0.588,1.412A1.93,1.93 0,0 1,12 14m6,0q-0.824,0 -1.413,-0.588A1.93,1.93 0,0 1,16 12q0,-0.825 0.587,-1.412A1.93,1.93 0,0 1,18 10q0.824,0 1.413,0.588Q20,11.175 20,12t-0.587,1.412A1.93,1.93 0,0 1,18 14", 0)));
        f4905a = imageVectorA;
        return imageVectorA;
    }
}
