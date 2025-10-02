package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzjl implements zzjh {
    private final AtomicBoolean zza = new AtomicBoolean();

    @Nullable
    @GuardedBy
    private HashMap zzb = null;

    @GuardedBy
    private final HashMap zzc = new HashMap(16, 1.0f);

    @GuardedBy
    private final HashMap zzd = new HashMap(16, 1.0f);

    @GuardedBy
    private final HashMap zze = new HashMap(16, 1.0f);

    @GuardedBy
    private final HashMap zzf = new HashMap(16, 1.0f);

    @Nullable
    @GuardedBy
    private Object zzg = null;

    @GuardedBy
    private boolean zzh = false;

    @GuardedBy
    private final String[] zzi = new String[0];

    @Override // com.google.android.gms.internal.measurement.zzjh
    @Nullable
    public final String zza(@Nullable ContentResolver contentResolver, String str, @Nullable String str2) throws zzjk {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.zzb == null) {
                    this.zza.set(false);
                    this.zzb = new HashMap(16, 1.0f);
                    this.zzg = new Object();
                    contentResolver.registerContentObserver(zzjg.zza, true, new zzjj(this, null));
                } else if (this.zza.getAndSet(false)) {
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd.clear();
                    this.zze.clear();
                    this.zzf.clear();
                    this.zzg = new Object();
                    this.zzh = false;
                }
                Object obj = this.zzg;
                if (this.zzb.containsKey(str)) {
                    String str4 = (String) this.zzb.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = zzjg.zza;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new zzjk("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new zzjk("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.zzg) {
                                            this.zzb.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e) {
                            throw new zzjk("ContentProvider query failed", e);
                        }
                    } catch (Throwable th) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th;
                    }
                } catch (zzjk unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ AtomicBoolean zzb() {
        return this.zza;
    }
}
