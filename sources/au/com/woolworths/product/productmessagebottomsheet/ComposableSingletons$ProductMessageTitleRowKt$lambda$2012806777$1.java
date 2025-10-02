package au.com.woolworths.product.productmessagebottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.productmessagebottomsheet.ComposableSingletons$ProductMessageTitleRowKt$lambda$-2012806777$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductMessageTitleRowKt$lambda$2012806777$1 implements Function3<String, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMessageTitleRowKt$lambda$2012806777$1 d = new ComposableSingletons$ProductMessageTitleRowKt$lambda$2012806777$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String it = (String) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_info_round, 6, composer), "", null, AccentColors.b, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
