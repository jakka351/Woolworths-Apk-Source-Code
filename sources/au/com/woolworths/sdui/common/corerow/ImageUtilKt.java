package au.com.woolworths.sdui.common.corerow;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperUtilsKt;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageUtilKt {
    public static final CoreRowSpec.Image a(IconAsset toCoreRowImage, float f, Painter painter, Composer composer, int i) {
        CoreRowSpec.Image remoteImage;
        Intrinsics.h(toCoreRowImage, "$this$toCoreRowImage");
        composer.o(328739588);
        if ((i & 2) != 0) {
            painter = null;
        }
        if (toCoreRowImage instanceof IconAsset.CoreIcon) {
            remoteImage = new CoreRowSpec.Image.LocalImage(IconKeyMapperUtilsKt.a(CoreTheme.e(composer), ((IconAsset.CoreIcon) toCoreRowImage).d), ImageUtilKt$toCoreRowImage$1.d, f);
        } else {
            if (!(toCoreRowImage instanceof IconAsset.HostedIcon)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteImage = new CoreRowSpec.Image.RemoteImage(((IconAsset.HostedIcon) toCoreRowImage).d, painter, f);
        }
        composer.l();
        return remoteImage;
    }
}
