package au.com.woolworths.design.core.ui.foundation.icon.common.contact;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MailKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4934a;

    public static final ImageVector a() {
        ImageVector imageVector = f4934a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-contact-mail", CollectionsKt.Q(new PathData("M4,20q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,2 18L2,6q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,4 4h16q0.824,0 1.413,0.588Q22,5.175 22,6v12q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,20 20zM20,8l-7.475,4.675a1.04,1.04 0,0 1,-0.525 0.15,1.04 1.04,0 0,1 -0.525,-0.15L4,8v10h16zM12,11 L20,6L4,6zM4,8.25L4,6.775 4,6.8v-0.013z", 0)));
        f4934a = imageVectorA;
        return imageVectorA;
    }
}
