package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4903a;

    public static final ImageVector a() {
        ImageVector imageVector = f4903a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-download", CollectionsKt.Q(new PathData("M12.25,15.325q-0.2,0 -0.375,-0.062a0.9,0.9 0,0 1,-0.325 -0.213l-3.6,-3.6a0.95,0.95 0,0 1,-0.275 -0.7q0,-0.425 0.275,-0.7 0.274,-0.275 0.712,-0.288t0.713,0.263L11.25,11.9V4.75q0,-0.424 0.287,-0.713a0.97,0.97 0,0 1,0.713 -0.287q0.424,0 0.713,0.287 0.287,0.288 0.287,0.713v7.15l1.875,-1.875q0.274,-0.274 0.713,-0.263 0.437,0.014 0.712,0.288a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7l-3.6,3.6q-0.15,0.15 -0.325,0.212a1.1,1.1 0,0 1,-0.375 0.063m-6,4.425q-0.824,0 -1.412,-0.587a1.93,1.93 0,0 1,-0.588 -1.413v-2q0,-0.424 0.287,-0.713a0.97,0.97 0,0 1,0.713 -0.287q0.424,0 0.713,0.287 0.287,0.288 0.287,0.713v2h12v-2q0,-0.424 0.288,-0.713a0.97,0.97 0,0 1,0.712 -0.287q0.424,0 0.712,0.287 0.288,0.288 0.288,0.713v2q0,0.824 -0.587,1.413a1.93,1.93 0,0 1,-1.413 0.587z", 0)));
        f4903a = imageVectorA;
        return imageVectorA;
    }
}
