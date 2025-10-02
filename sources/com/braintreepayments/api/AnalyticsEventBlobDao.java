package com.braintreepayments.api;

import androidx.room.Dao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEventBlobDao;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface AnalyticsEventBlobDao {
    void a(List list);

    void b(AnalyticsEventBlob analyticsEventBlob);

    ArrayList c();
}
