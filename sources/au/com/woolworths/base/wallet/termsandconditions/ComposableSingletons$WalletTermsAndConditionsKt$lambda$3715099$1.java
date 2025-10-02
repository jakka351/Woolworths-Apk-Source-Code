package au.com.woolworths.base.wallet.termsandconditions;

import androidx.compose.runtime.Composer;
import androidx.navigation.compose.h;
import au.com.woolworths.base.wallet.data.CtaAction;
import au.com.woolworths.base.wallet.data.MessageModelCta;
import au.com.woolworths.base.wallet.data.PrivacyPolicyContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.base.wallet.termsandconditions.ComposableSingletons$WalletTermsAndConditionsKt$lambda$-3715099$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$WalletTermsAndConditionsKt$lambda$3715099$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$WalletTermsAndConditionsKt$lambda$3715099$1 d = new ComposableSingletons$WalletTermsAndConditionsKt$lambda$3715099$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CtaAction ctaAction = CtaAction.WEB_LINK;
            PrivacyPolicyContent privacyPolicyContent = new PrivacyPolicyContent("Privacy Policy", "To understand how we manage your personal information view our Privacy Policy and Collection Notice", CollectionsKt.R(new MessageModelCta("Woolworths Privacy Policy", ctaAction, "https://www.everyday.com.au/privacy.html"), new MessageModelCta("Everyday Pay Collection Notice", ctaAction, "https://www.everyday.com.au/privacy/collection-and-usage.html")));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(7, (byte) 0);
                composer.A(objG);
            }
            composer.l();
            WalletTermsAndConditionsKt.b((Function2) objG, null, privacyPolicyContent, composer, 54, 20);
        }
        return Unit.f24250a;
    }
}
