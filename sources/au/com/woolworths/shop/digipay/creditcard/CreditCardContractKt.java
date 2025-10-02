package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.shop.digipay.creditcard.CreditCardContract;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-digipay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreditCardContractKt {
    public static final AddNewCreditCard a(CreditCardContract.ViewState viewState) {
        Intrinsics.h(viewState, "<this>");
        List list = viewState.f10914a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AddNewCreditCard) {
                arrayList.add(obj);
            }
        }
        return (AddNewCreditCard) CollectionsKt.F(arrayList);
    }

    public static final SavedCreditCard b(CreditCardContract.ViewState viewState) {
        Object next;
        Intrinsics.h(viewState, "<this>");
        List list = viewState.f10914a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SavedCreditCard) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SavedCreditCard) next).e) {
                break;
            }
        }
        return (SavedCreditCard) next;
    }
}
