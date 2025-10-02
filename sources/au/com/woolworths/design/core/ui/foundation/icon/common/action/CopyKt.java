package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CopyKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4902a;

    public static final ImageVector a() {
        ImageVector imageVector = f4902a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-copy", CollectionsKt.Q(new PathData("M6,22q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,4 20L4,7q0,-0.424 0.287,-0.713A0.97,0.97 0,0 1,5 6q0.424,0 0.713,0.287Q6,6.576 6,7v13h10q0.424,0 0.712,0.288 0.288,0.287 0.288,0.712 0,0.424 -0.288,0.712A0.97,0.97 0,0 1,16 22zM10,18q-0.825,0 -1.412,-0.587A1.93,1.93 0,0 1,8 16L8,4q0,-0.824 0.588,-1.412A1.93,1.93 0,0 1,10 2h9q0.824,0 1.413,0.587Q21,3.176 21,4v12q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,19 18zM10,16h9L19,4h-9z", 0)));
        f4902a = imageVectorA;
        return imageVectorA;
    }
}
