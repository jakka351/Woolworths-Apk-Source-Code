package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ReceiptGeneralVoucherBinding;
import com.woolworths.scanlibrary.models.receipt.VoucherInfo;
import com.woolworths.scanlibrary.ui.receipt.adapter.GeneralVoucher;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/GeneralVoucherViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GeneralVoucherViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptGeneralVoucherBinding f21306a;

    /* JADX WARN: Illegal instructions before constructor call */
    public GeneralVoucherViewHolder(ReceiptGeneralVoucherBinding receiptGeneralVoucherBinding) {
        View view = receiptGeneralVoucherBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21306a = receiptGeneralVoucherBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof GeneralVoucher) {
            TextView textView = this.f21306a.y;
            VoucherInfo voucherInfo = ((GeneralVoucher) entry).b;
            Intrinsics.h(voucherInfo, "<this>");
            ArrayList arrayList = new ArrayList();
            Scanner scanner = new Scanner(StringsKt.k0(voucherInfo.getVoucherMessage()).toString());
            while (scanner.hasNext()) {
                String strNextLine = scanner.nextLine();
                Intrinsics.g(strNextLine, "nextLine(...)");
                arrayList.add(strNextLine);
            }
            List<Integer> boldLines = voucherInfo.getBoldLines();
            if (boldLines != null) {
                Iterator<Integer> it = boldLines.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (iIntValue < arrayList.size()) {
                        arrayList.set(iIntValue, "<b>" + arrayList.get(iIntValue) + "</b>");
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                sb.append((String) it2.next());
                if (i != arrayList.size() - 1) {
                    sb.append("<br>");
                }
                i = i2;
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            textView.setText(Html.fromHtml(string, 63));
        }
    }
}
