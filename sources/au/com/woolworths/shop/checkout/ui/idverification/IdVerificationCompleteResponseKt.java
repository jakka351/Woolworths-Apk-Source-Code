package au.com.woolworths.shop.checkout.ui.idverification;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.shop.checkout.CompleteIdVerificationMutation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdVerificationCompleteResponseKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [au.com.woolworths.base.shopapp.modules.button.ButtonApiData] */
    /* JADX WARN: Type inference failed for: r8v0, types: [au.com.woolworths.base.shopapp.modules.button.ButtonApiData] */
    public static final IdVerificationCompleteResponse a(CompleteIdVerificationMutation.CompleteIdVerification completeIdVerification) {
        ButtonApiData buttonApiData;
        CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess onIdVerificationCompleteSuccess = completeIdVerification.b;
        if (onIdVerificationCompleteSuccess != null) {
            return new IdVerificationCompleteSuccess(onIdVerificationCompleteSuccess.f21833a);
        }
        CompleteIdVerificationMutation.OnIdVerificationCompleteFail onIdVerificationCompleteFail = completeIdVerification.c;
        if (onIdVerificationCompleteFail == null) {
            throw new IllegalStateException("Neither success or fail. Check with BFF");
        }
        CompleteIdVerificationMutation.IdVerificationBottomSheet idVerificationBottomSheet = onIdVerificationCompleteFail.f21832a;
        String str = idVerificationBottomSheet.f21831a;
        String str2 = idVerificationBottomSheet.b;
        ArrayList arrayList = idVerificationBottomSheet.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        CompleteIdVerificationMutation.PrimaryButton primaryButton = idVerificationBottomSheet.d;
        if (primaryButton != null) {
            String str3 = primaryButton.f21834a;
            ButtonStyle buttonStyle = primaryButton.b;
            buttonApiData = new ButtonApiData(str3, null, buttonStyle != null ? ButtonStyleExtKt.a(buttonStyle) : null, primaryButton.c, null, null, null, null, null, 498, null);
        } else {
            buttonApiData = null;
        }
        CompleteIdVerificationMutation.SecondaryButton secondaryButton = idVerificationBottomSheet.e;
        if (secondaryButton != null) {
            String str4 = secondaryButton.f21835a;
            ButtonStyle buttonStyle2 = secondaryButton.b;
            buttonApiData = new ButtonApiData(str4, null, buttonStyle2 != null ? ButtonStyleExtKt.a(buttonStyle2) : null, secondaryButton.c, null, null, null, null, null, 498, null);
        }
        return new IdVerificationCompleteFail(new IdVerificationBottomSheet(str, str2, arrayList2, buttonApiData, buttonApiData));
    }
}
