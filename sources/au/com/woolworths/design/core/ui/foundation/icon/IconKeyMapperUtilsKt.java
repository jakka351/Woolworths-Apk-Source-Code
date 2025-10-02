package au.com.woolworths.design.core.ui.foundation.icon;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconKeyMapperUtilsKt {
    public static final ImageVector a(CoreIcons coreIcons, String iconKey) {
        Intrinsics.h(coreIcons, "<this>");
        Intrinsics.h(iconKey, "iconKey");
        ImageVector imageVectorA = IconBuilderKt.a("icon-status-warning-fill", MissingIconPlaceholderKt.f4895a);
        ImageVector imageVectorA2 = IconKeyMapperKt.a(coreIcons, iconKey);
        return imageVectorA2 == null ? imageVectorA : imageVectorA2;
    }
}
