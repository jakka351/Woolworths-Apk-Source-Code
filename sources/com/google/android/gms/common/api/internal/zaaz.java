package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
public final class zaaz extends GoogleApiClient implements zabu {

    @Nullable
    @VisibleForTesting
    zabs zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;

    @Nullable
    Set zah;
    final zacu zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zaax zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    @Nullable
    private zabv zal = null;

    @VisibleForTesting
    final Queue zaa = new LinkedList();

    public zaaz(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaat zaatVar = new zaat(this);
        this.zax = zaatVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaatVar);
        this.zao = looper;
        this.zas = new zaax(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i;
        if (i >= 0) {
            this.zaw = Integer.valueOf(i2);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zacu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zai((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zaf(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z) ? 2 : 1;
        }
        return 3;
    }

    public static String zag(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    private final void zal(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zaaw(this, statusPendingResult, z, googleApiClient));
    }

    private final void zam(int i) {
        zaaz zaazVar;
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String strZag = zag(this.zaw.intValue());
            String strZag2 = zag(i);
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.l(new StringBuilder(strZag.length() + strZag2.length() + 51), "Cannot use sign-in mode: ", strZag2, ". Mode was already set to ", strZag));
        }
        if (this.zal != null) {
            return;
        }
        Map map = this.zac;
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : map.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue == 1) {
            zaazVar = this;
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (iIntValue == 2 && zRequiresSignIn) {
                this.zal = zax.zaa(this.zan, this, this.zaj, this.zao, this.zat, map, this.zae, this.zaf, this.zag, this.zav);
                return;
            }
            zaazVar = this;
        }
        zaazVar.zal = new zabd(zaazVar.zan, zaazVar, zaazVar.zaj, zaazVar.zao, zaazVar.zat, map, zaazVar.zae, zaazVar.zaf, zaazVar.zag, zaazVar.zav, this);
    }

    private final void zan() {
        this.zak.zab();
        ((zabv) Preconditions.checkNotNull(this.zal)).zae();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock = this.zaj;
        lock.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZaf = ((zabv) Preconditions.checkNotNull(this.zal)).zaf();
            lock.unlock();
            return connectionResultZaf;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zal(this, statusPendingResult, false);
            return statusPendingResult;
        }
        AtomicReference atomicReference = new AtomicReference();
        zaau zaauVar = new zaau(this, atomicReference, statusPendingResult);
        zaav zaavVar = new zaav(this, statusPendingResult);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
        builder.addApi(Common.API);
        builder.addConnectionCallbacks(zaauVar);
        builder.addOnConnectionFailedListener(zaavVar);
        builder.setHandler(this.zas);
        GoogleApiClient googleApiClientBuild = builder.build();
        atomicReference.set(googleApiClientBuild);
        googleApiClientBuild.connect();
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.zaj;
        lock.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    Preconditions.checkArgument(z, sb.toString());
                    zam(i);
                    zan();
                    this.zaj.unlock();
                    return;
                }
                i = iIntValue;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 22);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                Preconditions.checkArgument(z, sb2.toString());
                zam(i);
                zan();
                this.zaj.unlock();
                return;
            } finally {
                this.zaj.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock = this.zaj;
        lock.lock();
        try {
            this.zai.zab();
            zabv zabvVar = this.zal;
            if (zabvVar != null) {
                zabvVar.zah();
            }
            this.zau.zab();
            Queue<BaseImplementation.ApiMethodImpl> queue = this.zaa;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : queue) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            queue.clear();
            if (this.zal != null) {
                zad();
                this.zak.zaa();
            }
            lock.unlock();
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zan(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean zContainsKey = this.zac.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        Lock lock = this.zaj;
        lock.lock();
        try {
            zabv zabvVar = this.zal;
            if (zabvVar == null) {
                this.zaa.add(t);
            } else {
                t = (T) zabvVar.zab(t);
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Map map = this.zac;
        Api<?> api = t.getApi();
        boolean zContainsKey = map.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        Lock lock = this.zaj;
        lock.lock();
        try {
            zabv zabvVar = this.zal;
            if (zabvVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.zap) {
                return (T) zabvVar.zac(t);
            }
            Queue queue = this.zaa;
            queue.add(t);
            while (!queue.isEmpty()) {
                BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) queue.remove();
                this.zai.zaa(apiMethodImpl);
                apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
            lock.unlock();
            return t;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock = this.zaj;
        lock.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zac())) {
                String strZad = api.zad();
                StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 42);
                sb.append(strZad);
                sb.append(" was never registered with GoogleApiClient");
                throw new IllegalArgumentException(sb.toString());
            }
            ConnectionResult connectionResultZad = ((zabv) Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                lock.unlock();
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
            } else {
                Log.w("GoogleApiClientImpl", zae());
                String strZad2 = api.zad();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZad2).length() + 100);
                sb2.append(strZad2);
                sb2.append(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                Log.wtf("GoogleApiClientImpl", sb2.toString(), new Exception());
                connectionResult = new ConnectionResult(8, null);
            }
            lock.unlock();
            return connectionResult;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zac.containsKey(api.zac());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        return isConnected() && (client = (Api.Client) this.zac.get(api.zac())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zai();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zaj();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zag(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zaj(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zak(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zam();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        int i = this.zam;
        if (i < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zac(i);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(@Nullable Bundle bundle) {
        while (true) {
            Queue queue = this.zaa;
            if (queue.isEmpty()) {
                this.zak.zac(bundle);
                return;
            }
            execute((BaseImplementation.ApiMethodImpl) queue.remove());
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zab(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zad();
        }
        if (this.zap) {
            return;
        }
        com.google.android.gms.common.internal.zak zakVar = this.zak;
        zakVar.zae(connectionResult);
        zakVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zaf(this.zan.getApplicationContext(), new zaay(this));
                    } catch (SecurityException unused) {
                    }
                }
                zaax zaaxVar = this.zas;
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(1), this.zaq);
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(2), this.zar);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zacu.zaa);
        }
        com.google.android.gms.common.internal.zak zakVar = this.zak;
        zakVar.zad(i);
        zakVar.zaa();
        if (i == 2) {
            zan();
        }
    }

    public final boolean zad() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        zaax zaaxVar = this.zas;
        zaaxVar.removeMessages(2);
        zaaxVar.removeMessages(1);
        zabs zabsVar = this.zab;
        if (zabsVar != null) {
            zabsVar.zab();
            this.zab = null;
        }
        return true;
    }

    public final String zae() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final /* synthetic */ void zah(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        zal(googleApiClient, statusPendingResult, true);
    }

    public final /* synthetic */ void zai() {
        this.zaj.lock();
        try {
            if (this.zap) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    public final /* synthetic */ void zaj() {
        this.zaj.lock();
        try {
            if (zad()) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    public final /* synthetic */ Context zak() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zacs zacsVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zacsVar);
            this.zaj.unlock();
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zacs zacsVar) {
        Lock lock = this.zaj;
        lock.lock();
        try {
            Set set = this.zah;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (set.remove(zacsVar)) {
                lock.lock();
                try {
                    Set set2 = this.zah;
                    if (set2 == null) {
                        lock.unlock();
                    } else {
                        boolean zIsEmpty = set2.isEmpty();
                        this.zaj.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    zabv zabvVar = this.zal;
                    if (zabvVar != null) {
                        zabvVar.zal();
                    }
                } finally {
                    this.zaj.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        Lock lock = this.zaj;
        lock.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZag = ((zabv) Preconditions.checkNotNull(this.zal)).zag(j, timeUnit);
            lock.unlock();
            return connectionResultZag;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.zaj.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            zam(i);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
