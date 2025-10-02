package au.com.woolworths.pay.internal.services.transactions;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONField;
import java.math.BigDecimal;
import java.util.Date;

@Keep
/* loaded from: classes4.dex */
public class TransactionHistoryQuery {

    @Nullable
    @JSONField
    public BigDecimal amount;

    @Nullable
    @JSONField
    public String clientReference;
    public Date endDate;

    @Nullable
    @JSONField("endDate")
    public String endDateStr;

    @Nullable
    @JSONField
    public Integer maxRecords;

    @Nullable
    @JSONField
    public String orderNumber;
    public Date startDate;

    @Nullable
    @JSONField("startDate")
    public String startDateStr;

    @Nullable
    @JSONField("transactionRef")
    public String transactionReference;

    @NonNull
    @JSONField
    public String[] transactionTypes;

    public TransactionHistoryQuery(String[] strArr) {
        this.transactionTypes = strArr;
    }
}
