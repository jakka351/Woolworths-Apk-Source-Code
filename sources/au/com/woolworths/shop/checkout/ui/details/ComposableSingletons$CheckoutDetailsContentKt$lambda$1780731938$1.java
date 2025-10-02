package au.com.woolworths.shop.checkout.ui.details;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CheckoutDetailsContentKt$lambda$1780731938$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CheckoutDetailsContentKt$lambda$1780731938$1 d = new ComposableSingletons$CheckoutDetailsContentKt$lambda$1780731938$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.i, composer, null);
        }
        return Unit.f24250a;
    }
}
