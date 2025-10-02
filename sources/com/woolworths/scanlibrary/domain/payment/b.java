package com.woolworths.scanlibrary.domain.payment;

import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharDirectionality;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                return new DefaultRetryService();
            case 1:
                return new DefaultRetryService();
            case 2:
                int i2 = ExitScanCodeActivity.I;
                return unit;
            case 3:
                int i3 = AddPaymentActivity.M;
                return unit;
            case 4:
                return new DefaultRetryService();
            case 5:
                int i4 = UpdateCreditCardActivity.L;
                return unit;
            case 6:
                return new DefaultRetryService();
            case 7:
                int i5 = ReceiptActivity.N;
                return unit;
            case 8:
                int i6 = TapActivity.W;
                return unit;
            default:
                List list = CharDirectionality.g;
                int iH = MapsKt.h(CollectionsKt.s(list, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                Iterator it = ((AbstractList) list).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(Integer.valueOf(((CharDirectionality) next).d), next);
                }
                return linkedHashMap;
        }
    }
}
