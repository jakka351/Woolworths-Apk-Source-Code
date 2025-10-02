package com.salesforce.marketingcloud.sfmcsdk.components.http;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Callback;", "", "onResponse", "", "request", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request;", "response", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Callback {
    void onResponse(@NotNull Request request, @NotNull Response response);
}
