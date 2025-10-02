package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.icon.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReviewTextFieldKt$lambda$1481617745$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ReviewTextFieldKt$lambda$1481617745$1 d = new ComposableSingletons$ReviewTextFieldKt$lambda$1481617745$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            float f = 24;
            IconKt.a(PainterResources_androidKt.a(R.drawable.icon_submit_review_error_fill, 0, composer), null, SizeKt.u(SizeKt.g(Modifier.Companion.d, f), f), CoreTheme.b(composer).b.b.f4805a, composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
