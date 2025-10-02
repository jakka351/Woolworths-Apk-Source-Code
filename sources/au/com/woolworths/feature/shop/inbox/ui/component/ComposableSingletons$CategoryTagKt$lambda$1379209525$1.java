package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CategoryTagKt$lambda$1379209525$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CategoryTagKt.a(InboxMessage.Category.h, null, composer, 6);
        }
        return Unit.f24250a;
    }
}
