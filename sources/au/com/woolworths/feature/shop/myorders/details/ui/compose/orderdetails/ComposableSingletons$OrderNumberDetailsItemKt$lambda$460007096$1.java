package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OrderNumberDetailsItemKt$lambda$460007096$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OrderNumberDetailsItemKt$lambda$460007096$1 d = new ComposableSingletons$OrderNumberDetailsItemKt$lambda$460007096$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_copy, 0, composer), StringResources_androidKt.c(composer, R.string.content_description_copy_order_number), null, WxTheme.a(composer).h(), composer, 0, 4);
        }
        return Unit.f24250a;
    }
}
