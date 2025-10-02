package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
public final class zabd implements zabv, zat {
    final Map zaa;

    @Nullable
    final ClientSettings zac;
    final Map zad;

    @Nullable
    final Api.AbstractClientBuilder zae;
    int zaf;
    final zaaz zag;
    final zabu zah;
    private final Lock zai;
    private final Condition zaj;
    private final Context zak;
    private final GoogleApiAvailabilityLight zal;
    private final zabc zam;
    private volatile zaba zan;
    final Map zab = new HashMap();

    @Nullable
    private ConnectionResult zao = null;

    public zabd(Context context, zaaz zaazVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, @Nullable ClientSettings clientSettings, Map map2, @Nullable Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabu zabuVar) {
        this.zak = context;
        this.zai = lock;
        this.zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.zac = clientSettings;
        this.zad = map2;
        this.zae = abstractClientBuilder;
        this.zag = zaazVar;
        this.zah = zabuVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zas) arrayList.get(i)).zaa(this);
        }
        this.zam = new zabc(this, looper);
        this.zaj = lock.newCondition();
        this.zan = new zaas(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.zai.lock();
        try {
            this.zan.zaf(bundle);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zai.lock();
        try {
            this.zan.zah(i);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zat
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api api, boolean z) {
        this.zai.lock();
        try {
            this.zan.zag(connectionResult, api, z);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl zab(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zan.zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl zac(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.zan.zac(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    @Nullable
    public final ConnectionResult zad(@NonNull Api api) {
        Map map = this.zaa;
        Api.AnyClientKey anyClientKeyZac = api.zac();
        if (!map.containsKey(anyClientKeyZac)) {
            return null;
        }
        if (((Api.Client) map.get(anyClientKeyZac)).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        Map map2 = this.zab;
        if (map2.containsKey(anyClientKeyZac)) {
            return (ConnectionResult) map2.get(anyClientKeyZac);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zae() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final ConnectionResult zaf() throws InterruptedException {
        zae();
        while (this.zan instanceof zaar) {
            try {
                this.zaj.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.zan instanceof zaag) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final ConnectionResult zag(long j, TimeUnit timeUnit) throws InterruptedException {
        zae();
        long nanos = timeUnit.toNanos(j);
        while (this.zan instanceof zaar) {
            if (nanos <= 0) {
                zah();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.zaj.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.zan instanceof zaag) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zah() {
        if (this.zan.zad()) {
            this.zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zai() {
        return this.zan instanceof zaag;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zaj() {
        return this.zan instanceof zaar;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zak(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zal() {
        if (this.zan instanceof zaag) {
            ((zaag) this.zan).zai();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zam() {
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.zan);
        for (Api api : this.zad.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.get(api.zac()))).dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    public final void zao() throws Throwable {
        zabd zabdVar;
        Lock lock = this.zai;
        lock.lock();
        try {
            zabdVar = this;
        } catch (Throwable th) {
            th = th;
            zabdVar = this;
        }
        try {
            zabdVar.zan = new zaar(zabdVar, this.zac, this.zad, this.zal, this.zae, lock, this.zak);
            zabdVar.zan.zaa();
            zabdVar.zaj.signalAll();
            zabdVar.zai.unlock();
        } catch (Throwable th2) {
            th = th2;
            zabdVar.zai.unlock();
            throw th;
        }
    }

    public final void zap() {
        this.zai.lock();
        try {
            this.zag.zad();
            this.zan = new zaag(this);
            this.zan.zaa();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    public final void zaq(@Nullable ConnectionResult connectionResult) {
        this.zai.lock();
        try {
            this.zao = connectionResult;
            this.zan = new zaas(this);
            this.zan.zaa();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    public final void zar(zabb zabbVar) {
        zabc zabcVar = this.zam;
        zabcVar.sendMessage(zabcVar.obtainMessage(1, zabbVar));
    }

    public final void zas(RuntimeException runtimeException) {
        zabc zabcVar = this.zam;
        zabcVar.sendMessage(zabcVar.obtainMessage(2, runtimeException));
    }

    public final /* synthetic */ Lock zat() {
        return this.zai;
    }

    public final /* synthetic */ zaba zau() {
        return this.zan;
    }
}
