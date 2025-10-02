package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ComposableSingletons$ListDetailsEmptyUiKt$lambda$-1324417743$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListDetailsEmptyUiKt$lambda$1324417743$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ListDetailsEmptyUiKt$lambda$1324417743$1 d = new ComposableSingletons$ListDetailsEmptyUiKt$lambda$1324417743$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_camera_icon, 0, composer), null, SizeKt.q(Modifier.Companion.d, 24), Color.k, composer, 3504, 0);
        }
        return Unit.f24250a;
    }
}
