package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zal {
    private int zad;
    private final ArrayMap zab = new ArrayMap(0);
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final ArrayMap zaa = new ArrayMap(0);

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.getSize();
    }

    public final Set zaa() {
        return this.zaa.keySet();
    }

    public final Task zab() {
        return this.zac.getTask();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        ArrayMap arrayMap = this.zaa;
        arrayMap.put(apiKey, connectionResult);
        ArrayMap arrayMap2 = this.zab;
        arrayMap2.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(arrayMap2);
            } else {
                this.zac.setException(new AvailabilityException(arrayMap));
            }
        }
    }
}
