package com.woolworths.scanlibrary.ui.transaction;

import com.woolworths.scanlibrary.models.transactions.Transaction;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionListPresenter$GetTxnListObserver$groupTransactions$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(((Transaction) obj2).getTxnTime(), ((Transaction) obj).getTxnTime());
    }
}
