package com.salesforce.marketingcloud.messages;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.location.LatLon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@MCKeep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/messages/MessageResponse;", "", "refreshCenter", "Lcom/salesforce/marketingcloud/location/LatLon;", "getRefreshCenter", "()Lcom/salesforce/marketingcloud/location/LatLon;", "refreshRadius", "", "getRefreshRadius", "()I", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageResponse {
    @NotNull
    LatLon getRefreshCenter();

    int getRefreshRadius();
}
