package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.button.ButtonTextKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ContentPageShareButtonKt$lambda$373238679$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ContentPageShareButtonKt$lambda$373238679$1 d = new ComposableSingletons$ContentPageShareButtonKt$lambda$373238679$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TertiaryButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TertiaryButton, "$this$TertiaryButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ImageVector imageVectorA = ShareKt.a();
            long j = ToneColors.d;
            IconKt.b(imageVectorA, null, null, j, composer, 48, 4);
            ButtonTextKt.b(StringResources_androidKt.c(composer, R.string.share), PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j, false, null, null, composer, 48, 56);
        }
        return Unit.f24250a;
    }
}
