package au.com.woolworths.pay.internal.services.transactions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.internal.network.JSONHelper;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import java.text.SimpleDateFormat;

/* loaded from: classes4.dex */
class TransactionHistoryRequest extends APIRequest {

    @NonNull
    private TransactionHistoryQuery query;

    public TransactionHistoryRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull TransactionHistoryQuery transactionHistoryQuery) {
        super(str, configuration);
        this.query = transactionHistoryQuery;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONEncodingException {
        try {
            TransactionHistoryQuery transactionHistoryQuery = this.query;
            if (transactionHistoryQuery.startDate != null && transactionHistoryQuery.endDate != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ");
                TransactionHistoryQuery transactionHistoryQuery2 = this.query;
                transactionHistoryQuery2.startDateStr = simpleDateFormat.format(transactionHistoryQuery2.startDate);
                TransactionHistoryQuery transactionHistoryQuery3 = this.query;
                transactionHistoryQuery3.endDateStr = simpleDateFormat.format(transactionHistoryQuery3.endDate);
            }
            return JSONHelper.d(this.query).toString();
        } catch (Exception e) {
            throw new JSONEncodingException(e.getLocalizedMessage());
        }
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getMethod() {
        return "POST";
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getRelativePath() {
        return "/transactions";
    }
}
