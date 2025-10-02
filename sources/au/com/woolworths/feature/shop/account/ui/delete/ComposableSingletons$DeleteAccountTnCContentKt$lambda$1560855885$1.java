package au.com.woolworths.feature.shop.account.ui.delete;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.feature.shop.account.model.delete.DeleteButtonData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$DeleteAccountTnCContentKt$lambda$1560855885$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DeleteAccountTnCData deleteAccountTnCData = new DeleteAccountTnCData("Are you sure you want to close your account?", "#### What will happen if you close your account? \n - You will no longer be able to use this account to shop with Woolworths Online, using the website or the mobile apps. \n - You will no longer receive marketing communications with offers via email or SMS from Woolworths Online after 3 working days, and \n  - You will still be able to use the website and mobile apps of Woolworths online, as a guest user. \n\n#### What will not be closed? \n##### Personal information \nWoolworths Online account deletion does not close all of your personal information that was collected in your interactions with the Woolworths Group. \n - Some account and transaction information will be retained by Woolworths Online to meet our mutual obligations. Some examples include requirements to keep records of purchases of certain kinds of products, such as if you have purchased alcohol or tobacco via delivery, or we may need to contact you in the event of a recall of a product you have purchased. \n - Personal information associated with other Woolworths Group accounts or collected for other purposes by the Woolworths Group will not be closed, for example Everyday Rewards account information or in-store purchases that are not linked to this account. \n\nYou can read more about how Woolworths Group collects, uses and secures personal information in the [Woolworths Privacy Policy](https://www.woolworths.com.au/shop/discover/about-us/privacy). \n\nIf you have any questions or concerns you can contact the Woolworths Privacy Officer at [privacy@woolworths.com.au](mailto:privacy@woolworths.com.au) or [1300 908 631](tel:1300908631).\n\n##### Subscriptions \nClosing your Woolworths Online account does not cancel any subscriptions, including any Delivery Unlimited or Everyday Extra subscriptions, you may have with us. If you decide Delivery Unlimited isn’t for you, you can cancel your subscription at any time via the “Delivery Unlimited” section of your account or by contacting our Priority Customer Care Line on 1300 969 609. Please note that your Delivery Unlimited benefits will still be available to use for the remaining period of your subscription, i.e. until the end of the current monthly or annual period. For details on how to cancel your Everyday Extra subscription, please see these [FAQs](https://www.everyday.com.au/support.html).", "I've read and understood these conditions.", new DeleteButtonData("Confirm and close account"));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            DeleteAccountTnCContentKt.a(deleteAccountTnCData, function1, (Function0) objE, false, composer, 432, 8);
        }
        return Unit.f24250a;
    }
}
