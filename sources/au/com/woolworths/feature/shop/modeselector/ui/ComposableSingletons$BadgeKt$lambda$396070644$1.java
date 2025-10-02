package au.com.woolworths.feature.shop.modeselector.ui;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.badge.BadgeBrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ComposableSingletons$BadgeKt$lambda$-396070644$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$BadgeKt$lambda$396070644$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Parcelable.Creator<BadgeBrandLabelType> creator = BadgeBrandLabelType.CREATOR;
            BadgeKt.a("badge", R.color.color_black_100, R.color.color_black_900, null, composer, 6, 8);
        }
        return Unit.f24250a;
    }
}
