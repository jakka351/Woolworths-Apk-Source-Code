package au.com.woolworths.pay.internal.services.transactions;

import androidx.annotation.Keep;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
class TransactionHistoryResponse {

    @JSONField
    Transaction[] transactions;
}
