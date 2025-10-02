package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SortKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4923a;

    public static final ImageVector a() {
        ImageVector imageVector = f4923a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-sort", CollectionsKt.Q(new PathData("M14,18.175V12q0,-0.424 0.287,-0.713A0.97,0.97 0,0 1,15 11q0.424,0 0.713,0.287 0.287,0.288 0.287,0.713v6.175l1.875,-1.875a0.98,0.98 0,0 1,0.688 -0.288,0.93 0.93,0 0,1 0.712,0.288q0.3,0.274 0.313,0.688a0.93,0.93 0,0 1,-0.288 0.712l-3.6,3.6q-0.15,0.15 -0.325,0.212a1.1,1.1 0,0 1,-0.375 0.063q-0.2,0 -0.375,-0.062a0.9,0.9 0,0 1,-0.325 -0.213l-3.6,-3.6a0.93,0.93 0,0 1,-0.275 -0.687q0,-0.413 0.3,-0.713 0.3,-0.275 0.7,-0.288t0.7,0.288zM8,5.825 L6.125,7.7Q5.8,8.025 5.4,8a1,1 0,0 1,-0.675 -0.3q-0.3,-0.3 -0.3,-0.712 0,-0.413 0.275,-0.688l3.6,-3.6q0.15,-0.15 0.325,-0.212 0.175,-0.063 0.375,-0.063t0.375,0.063A0.9,0.9 0,0 1,9.7 2.7l3.6,3.6a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7q-0.3,0.3 -0.713,0.3a0.97,0.97 0,0 1,-0.712 -0.3L10,5.825V12q0,0.424 -0.287,0.713A0.97,0.97 0,0 1,9 13a0.97,0.97 0,0 1,-0.712 -0.287A0.97,0.97 0,0 1,8 12z", 0)));
        f4923a = imageVectorA;
        return imageVectorA;
    }
}
