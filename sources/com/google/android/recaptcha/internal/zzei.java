package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzei extends SQLiteOpenHelper {

    @NotNull
    public static final zzeg zza = new zzeg(null);
    private static final int zzb = zzeg.zzc("18.6.1");

    @NotNull
    private static final String zzc = zzeg.zzd("18.6.1");

    @Nullable
    private static zzei zzd;

    public /* synthetic */ zzei(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(@NotNull SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(@NotNull List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(CollectionsKt.M(list, ", ", "(", ")", zzeh.zza, 24))), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
        cursorRawQuery.close();
        return i;
    }

    @NotNull
    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    Intrinsics.e(string);
                    arrayList.add(new zzej(string, j, i));
                } catch (Exception unused) {
                    arrayList = EmptyList.d;
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(@NotNull zzej zzejVar) {
        return zza(CollectionsKt.Q(zzejVar)) == 1;
    }
}
