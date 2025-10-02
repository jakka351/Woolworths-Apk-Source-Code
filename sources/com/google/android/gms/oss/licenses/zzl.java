package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzl extends GmsClient {
    public zzl(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 185, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzb zzs() {
        try {
            return (zzb) getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        return iInterfaceQueryLocalInterface instanceof zzb ? (zzb) iInterfaceQueryLocalInterface : new zzb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean enableLocalFallback() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    public final synchronized String zzp(String str) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zzc(str);
    }

    public final synchronized String zzq(com.google.android.gms.internal.oss_licenses.zzg zzgVar) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zzd(zzgVar.zzb());
    }

    public final synchronized List zzr(List list) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zze(list);
    }
}
