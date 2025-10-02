package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zznf implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zznl zza;
    private volatile boolean zzb;
    private volatile zzgo zzc;

    public zznf(zznl zznlVar) {
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzu.zzaW().zzj(new zzna(this, (zzgb) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) throws IllegalStateException {
        zznl zznlVar = this.zza;
        zznlVar.zzu.zzaW().zzd();
        zzgu zzguVarZzf = zznlVar.zzu.zzf();
        if (zzguVarZzf != null) {
            zzguVarZzf.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaW().zzj(new zzne(this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) throws IllegalStateException {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service connection suspended");
        zzicVar.zzaW().zzj(new zznb(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
            zzgb zzfzVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfzVar = iInterfaceQueryLocalInterface instanceof zzgb ? (zzgb) iInterfaceQueryLocalInterface : new zzfz(iBinder);
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzu.zzaV().zzb().zza("Service connect failed to get IMeasurementService");
            }
            if (zzfzVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    zznl zznlVar = this.zza;
                    connectionTracker.unbindService(zznlVar.zzu.zzaY(), zznlVar.zzY());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaW().zzj(new zzmy(this, zzfzVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service disconnected");
        zzicVar.zzaW().zzj(new zzmz(this, componentName));
    }

    @WorkerThread
    public final void zza(Intent intent) {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context contextZzaY = zznlVar.zzu.zzaY();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                zznl zznlVar2 = this.zza;
                zznlVar2.zzu.zzaV().zzk().zza("Using local app measurement service");
                this.zzb = true;
                connectionTracker.bindService(contextZzaY, intent, zznlVar2.zzY(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @WorkerThread
    public final void zzc() {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context contextZzaY = zznlVar.zzu.zzaY();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzgo(contextZzaY, Looper.getMainLooper(), this, this);
                this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zzb = false;
    }
}
