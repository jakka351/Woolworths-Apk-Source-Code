package au.com.woolworths.shop.checkout.ui.shopperNote;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.shopperNote.ComposableSingletons$ShopperNoteScreenKt$lambda$-1423793752$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ShopperNoteScreenKt$lambda$1423793752$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShopperNoteScreenKt$lambda$1423793752$1 d = new ComposableSingletons$ShopperNoteScreenKt$lambda$1423793752$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.shoppernote_screen_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return Unit.f24250a;
    }
}
