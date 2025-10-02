package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zac(@NonNull Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zae(@NonNull zaaa zaaaVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabk zabkVar) throws DeadObjectException {
        try {
            zag(zabkVar);
        } catch (DeadObjectException e) {
            zac(zai.zah(e));
            throw e;
        } catch (RemoteException e2) {
            zac(zai.zah(e2));
        } catch (RuntimeException e3) {
            this.zaa.trySetException(e3);
        }
    }

    public abstract void zag(zabk zabkVar) throws RemoteException;
}
