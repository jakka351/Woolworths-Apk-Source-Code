package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

@WorkerThread
/* loaded from: classes5.dex */
public interface zacl {
    void zaa(ConnectionResult connectionResult);

    void zab(int i);

    void zac(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set set);
}
