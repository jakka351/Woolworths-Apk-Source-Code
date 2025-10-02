package com.dynatrace.android.agent.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class EventsDbHelper extends SQLiteOpenHelper {
    public static final String g;
    public final SQLiteStatement d;
    public final SQLiteStatement e;
    public final SQLiteStatement f;

    static {
        boolean z = Global.f14077a;
        g = "dtxEventsDbHelper";
    }

    public EventsDbHelper(Context context) {
        super(context, "DTXDb", (SQLiteDatabase.CursorFactory) null, 10);
        this.d = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ?");
        this.e = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ? AND event_id <> 50");
        this.f = getWritableDatabase().compileStatement("DELETE FROM Events WHERE event_id= ? AND id NOT IN (SELECT id FROM Events WHERE event_id= ? ORDER BY (session_start + event_start) DESC LIMIT ?)");
    }

    public final void a(long j, boolean z) {
        SQLiteStatement sQLiteStatement = z ? this.e : this.d;
        sQLiteStatement.bindLong(1, j);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (Global.f14077a) {
            Utility.h(g, "Rows deleted: " + iExecuteUpdateDelete);
        }
    }

    public final void b(int i) {
        long j = 50;
        SQLiteStatement sQLiteStatement = this.f;
        sQLiteStatement.bindLong(1, j);
        sQLiteStatement.bindLong(2, j);
        sQLiteStatement.bindLong(3, i);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (Global.f14077a) {
            Utility.h(g, "Rows deleted: " + iExecuteUpdateDelete);
        }
    }

    public final void c(long j, int i, int i2, long j2, long j3) {
        int iDelete = getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ? AND sequence_nr= ? AND server_id= ? AND id<= ?", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i), String.valueOf(i2), String.valueOf(j3)});
        if (Global.f14077a) {
            Utility.h(g, "Rows removed: " + iDelete);
        }
    }

    public final void d(LinkedList linkedList) {
        if (linkedList.isEmpty()) {
            return;
        }
        Iterator it = linkedList.iterator();
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            while (it.hasNext()) {
                try {
                    DatabaseWriteQueue.DatabaseRecord databaseRecord = (DatabaseWriteQueue.DatabaseRecord) it.next();
                    if (databaseRecord.c.f()) {
                        Session session = databaseRecord.c;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("visitor_id", Long.valueOf(session.b));
                        contentValues.put("session_id", Long.valueOf(session.c));
                        contentValues.put("sequence_nr", (Integer) 0);
                        contentValues.put("basic_segment", databaseRecord.f14115a);
                        contentValues.put("event_segment", databaseRecord.b);
                        contentValues.put("event_id", Integer.valueOf(databaseRecord.d));
                        contentValues.put("session_start", Long.valueOf(session.f14113a));
                        contentValues.put("event_start", Long.valueOf(databaseRecord.e));
                        int i = session.d;
                        if (i == -1) {
                            i = 1;
                        }
                        contentValues.put("multiplicity", Integer.valueOf(i));
                        contentValues.put("server_id", Integer.valueOf(databaseRecord.f));
                        contentValues.put("app_id", databaseRecord.g);
                        contentValues.put("sr_param", (String) null);
                        writableDatabase.insert("Events", null, contentValues);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.j(g, "Error inserting batch record into database.", e);
            }
        }
    }

    public final void e(SQLiteDatabase sQLiteDatabase, int i, int i2, String str) throws SQLException {
        boolean z = Global.f14077a;
        String str2 = g;
        if (z) {
            Utility.h(str2, str + " Db.Table(DTXDb.Events) from version " + i + " to " + i2 + ".");
        }
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Events");
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.j(str2, "could not delete table Events", e);
            }
        }
        onCreate(sQLiteDatabase);
    }

    public final boolean f(Session session) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multiplicity", Integer.valueOf(session.d));
        contentValues.put("sr_param", (String) null);
        return getWritableDatabase().update("Events", contentValues, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(session.b), String.valueOf(session.c)}) > 0;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean z = Global.f14077a;
        String str = g;
        if (z) {
            Utility.h(str, "Creating Db.Table(DTXDb.Events)");
        }
        try {
            sQLiteDatabase.execSQL("CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);");
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.j(str, "CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        e(sQLiteDatabase, i, i2, "Downgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        e(sQLiteDatabase, i, i2, "Upgrading");
    }
}
