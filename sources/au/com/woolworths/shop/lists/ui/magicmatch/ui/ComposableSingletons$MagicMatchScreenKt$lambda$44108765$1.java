package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.lists.ui.magicmatch.ui.ComposableSingletons$MagicMatchScreenKt$lambda$-44108765$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MagicMatchScreenKt$lambda$44108765$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/magicmatch/ui/ComposableSingletons$MagicMatchScreenKt$lambda$-44108765$1$1", "Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Listener;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.magicmatch.ui.ComposableSingletons$MagicMatchScreenKt$lambda$-44108765$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements MagicMatchContract.Listener {
        @Override // au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.Listener
        public final void s() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            MagicMatchScreenKt.a(new MagicMatchContract.ViewState(false), new byte[0], new AnonymousClass1(), composer, 0);
        }
        return Unit.f24250a;
    }
}
