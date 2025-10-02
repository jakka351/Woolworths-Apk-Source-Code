package au.com.woolworths.base.rewards.account.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AccountHomeFooterItemKt$PreviewAccountHomeFooterItem$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AccountHomeFooter $footer;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f24250a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            AccountHomeFooterItemKt.AccountHomeFooterItem(this.$footer, null, null, composer, 0, 6);
        }
    }
}
