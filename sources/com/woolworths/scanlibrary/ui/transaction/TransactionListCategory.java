package com.woolworths.scanlibrary.ui.transaction;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.transactions.Transaction;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory;", "", "TransactionLineItem", "TransactionGroupHeader", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory$TransactionGroupHeader;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory$TransactionLineItem;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TransactionListCategory {

    /* renamed from: a, reason: collision with root package name */
    public final int f21357a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory$TransactionGroupHeader;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionGroupHeader extends TransactionListCategory {
        public final String b;
        public final int c;

        public TransactionGroupHeader(String str, int i) {
            super(0);
            this.b = str;
            this.c = i;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory$TransactionLineItem;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListCategory;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionLineItem extends TransactionListCategory {
        public final Transaction b;

        public TransactionLineItem(Transaction transaction) {
            super(1);
            this.b = transaction;
        }
    }

    public TransactionListCategory(int i) {
        this.f21357a = i;
    }
}
