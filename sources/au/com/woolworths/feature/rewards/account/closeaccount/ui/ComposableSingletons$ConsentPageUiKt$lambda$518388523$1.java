package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.account.closeaccount.ui.ComposableSingletons$ConsentPageUiKt$lambda$-518388523$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ConsentPageUiKt$lambda$518388523$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DeleteAccountConfirmation deleteAccountConfirmation = new DeleteAccountConfirmation("Delete Account", "Request to delete account completed", "Your request to delete your account has been sent.", new ContentCta("Finish", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(28);
                composer.A(objG);
            }
            composer.l();
            ConsentPageUiKt.b(deleteAccountConfirmation, null, (Function1) objG, composer, KyberEngine.KyberPolyBytes, 2);
        }
        return Unit.f24250a;
    }
}
