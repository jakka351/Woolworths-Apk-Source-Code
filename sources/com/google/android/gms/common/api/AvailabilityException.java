package com.google.android.gms.common.api;

import YU.a;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class AvailabilityException extends Exception {
    private final ArrayMap zaa;

    public AvailabilityException(@NonNull ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ArrayMap arrayMap = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        Object obj = arrayMap.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, a.p(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) arrayMap.get(apiKey));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = this.zaa;
        boolean z = true;
        for (ApiKey apiKey : arrayMap.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) arrayMap.get(apiKey));
            z &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(c.f(2, strZaa) + strValueOf.length());
            sb.append(strZaa);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ArrayMap arrayMap = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object obj = arrayMap.get(apiKey);
        String strZaa = apiKey.zaa();
        Preconditions.checkArgument(obj != null, a.p(new StringBuilder(String.valueOf(strZaa).length() + 58), "The given API (", strZaa, ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) arrayMap.get(apiKey));
    }
}
