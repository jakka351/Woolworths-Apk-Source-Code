package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzecn extends zzfqp {
    private final Context zza;
    private final zzgpd zzb;

    public zzecn(Context context, zzgpd zzgpdVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzje)).intValue(), zzfqr.zza);
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    public static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    public static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String[] strArr;
        String string;
        String string2;
        sQLiteDatabase.beginTransaction();
        try {
            strArr = new String[]{"timestamp", "url"};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = 1");
            string = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string, null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr2 = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex2);
                    if (string3 == null) {
                        string2 = "";
                    } else {
                        Uri uri = Uri.parse(string3);
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        String strValueOf = String.valueOf(builderClearQuery.build());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                        sb2.append(strValueOf);
                        sb2.append("&");
                        sb2.append(encodedQuery);
                        string2 = sb2.toString();
                    }
                    strArr2[i] = string2;
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzuVar.zza(strArr2[i2]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zza(zzfgm zzfgmVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzgpd zzgpdVar = this.zzb;
        zzgot.zzq(zzgpdVar.submit(callable), new zzecg(this, zzfgmVar), zzgpdVar);
    }

    public final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                zzecn.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfgm(this) { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzecn.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzecp zzecpVar) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzh(zzecpVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final /* synthetic */ Void zzh(zzecp zzecpVar, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzecpVar.zza));
        contentValues.put("gws_query_id", zzecpVar.zzb);
        contentValues.put("url", zzecpVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzecpVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzboVarZzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        if (zzboVarZzD != null) {
            try {
                zzboVarZzD.zzf(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
