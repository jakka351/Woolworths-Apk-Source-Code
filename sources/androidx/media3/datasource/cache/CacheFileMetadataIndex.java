package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.database.VersionTable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class CacheFileMetadataIndex {
    public static final String[] c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final StandaloneDatabaseProvider f2976a;
    public String b;

    public CacheFileMetadataIndex(StandaloneDatabaseProvider standaloneDatabaseProvider) {
        this.f2976a = standaloneDatabaseProvider;
    }

    public final HashMap a() {
        try {
            this.b.getClass();
            Cursor cursorQuery = this.f2976a.getReadableDatabase().query(this.b, c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new CacheFileMetadata(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final void b(long j) {
        StandaloneDatabaseProvider standaloneDatabaseProvider = this.f2976a;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (VersionTable.a(standaloneDatabaseProvider.getReadableDatabase(), hexString, 2) != 1) {
                SQLiteDatabase writableDatabase = standaloneDatabaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.b(writableDatabase, hexString, 2);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
                    writableDatabase.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final void c(Set set) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f2976a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final void d(long j, long j2, String str) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f2976a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
