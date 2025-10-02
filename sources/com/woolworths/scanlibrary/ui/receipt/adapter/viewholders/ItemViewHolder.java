package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ReceiptItemBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/ItemViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptItemBinding f21308a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemViewHolder(ReceiptItemBinding receiptItemBinding) {
        View view = receiptItemBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21308a = receiptItemBinding;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry r8) {
        /*
            r7 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            boolean r0 = r8 instanceof com.woolworths.scanlibrary.ui.receipt.adapter.Item
            if (r0 == 0) goto L104
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            com.woolworths.scanlibrary.ui.receipt.adapter.Item r8 = (com.woolworths.scanlibrary.ui.receipt.adapter.Item) r8
            com.woolworths.scanlibrary.models.receipt.ReceiptItem r8 = r8.b
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r8, r1)
            com.woolworths.scanlibrary.models.receipt.ReceiptItemIs r2 = r8.getItemIs()
            boolean r2 = r2.getPromotionalItem()
            if (r2 == 0) goto L2c
            com.woolworths.scanlibrary.models.receipt.ReceiptItemIs r2 = r8.getItemIs()
            boolean r2 = r2.getLinkedPromo()
            if (r2 != 0) goto L2c
            goto L43
        L2c:
            kotlin.jvm.internal.Intrinsics.h(r8, r1)
            com.woolworths.scanlibrary.models.receipt.ReceiptItemIs r1 = r8.getItemIs()
            boolean r1 = r1.getPromotionalItem()
            if (r1 == 0) goto L48
            com.woolworths.scanlibrary.models.receipt.ReceiptItemIs r1 = r8.getItemIs()
            boolean r1 = r1.getLinkedPromo()
            if (r1 == 0) goto L48
        L43:
            r1 = 42
            r0.append(r1)
        L48:
            com.woolworths.scanlibrary.models.receipt.ReceiptItemIs r1 = r8.getItemIs()
            boolean r1 = r1.getTaxedItem()
            if (r1 == 0) goto L57
            r1 = 35
            r0.append(r1)
        L57:
            java.lang.String r1 = r8.getDescription()
            r0.append(r1)
            com.woolworths.scanlibrary.databinding.ReceiptItemBinding r1 = r7.f21308a
            android.widget.TextView r2 = r1.y
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            android.widget.TextView r0 = r1.z
            java.math.BigDecimal r2 = r8.getSalePrice()
            java.lang.String r2 = com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt.a(r2)
            r0.setText(r2)
            boolean r0 = com.woolworths.scanlibrary.models.receipt.ReceiptItemKt.isMeasuredByNumber(r8)
            r2 = 0
            java.lang.String r3 = "getString(...)"
            r4 = 8
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r8.getQuantity()
            int r0 = java.lang.Integer.parseInt(r0)
            r5 = 1
            if (r0 != r5) goto L92
            android.widget.TextView r8 = r1.A
            r8.setVisibility(r4)
            goto L101
        L92:
            android.widget.TextView r0 = r1.A
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            r5 = 2132019704(0x7f1409f8, float:1.967775E38)
            java.lang.String r4 = r4.getString(r5)
            kotlin.jvm.internal.Intrinsics.g(r4, r3)
            java.lang.String r3 = r8.getQuantity()
            java.math.BigDecimal r8 = r8.getUnitPrice()
            java.lang.String r8 = com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt.a(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r8}
            r3 = 2
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(r8, r3, r4, r0)
            android.widget.TextView r8 = r1.A
            r8.setVisibility(r2)
            goto L101
        Lbe:
            java.lang.String r0 = r8.getQuantity()
            int r0 = r0.length()
            if (r0 <= 0) goto Lfc
            android.widget.TextView r0 = r1.A
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            r5 = 2132019705(0x7f1409f9, float:1.9677752E38)
            java.lang.String r4 = r4.getString(r5)
            kotlin.jvm.internal.Intrinsics.g(r4, r3)
            java.lang.String r3 = r8.getQuantity()
            java.lang.String r5 = r8.getUom()
            java.math.BigDecimal r6 = r8.getUnitPrice()
            java.lang.String r6 = com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt.a(r6)
            java.lang.String r8 = r8.getUom()
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r5, r6, r8}
            r3 = 4
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(r8, r3, r4, r0)
            android.widget.TextView r8 = r1.A
            r8.setVisibility(r2)
            goto L101
        Lfc:
            android.widget.TextView r8 = r1.A
            r8.setVisibility(r4)
        L101:
            r1.l()
        L104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.ItemViewHolder.c(com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry):void");
    }
}
