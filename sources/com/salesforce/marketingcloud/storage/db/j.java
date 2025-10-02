package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SuppressLint
/* loaded from: classes6.dex */
public final class j extends b implements com.salesforce.marketingcloud.storage.l {
    public static final String e = "regions";
    public static final String f = "region_messages";
    static final String g = com.salesforce.marketingcloud.g.a("RegionDbStorage");

    public j(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE regions(id TEXT PRIMARY KEY, latitude TEXT, longitude TEXT, radius INTEGER, beacon_guid TEXT, beacon_major INTEGER, beacon_minor INTEGER, description TEXT, name TEXT, location_type INTEGER, is_inside SMALLINT);");
    }

    public static void c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
    }

    private static boolean e(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT region_id,message_id FROM region_messages");
            return true;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(g, e2, "%s is invalid", f);
            return false;
        }
    }

    public static boolean g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        boolean zF = f(sQLiteDatabase);
        if (!zF) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
                b(sQLiteDatabase);
                zF = f(sQLiteDatabase);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(g, e2, "Unable to recover %s", "regions");
            }
        }
        boolean zE = e(sQLiteDatabase);
        if (zF && !zE) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                a(sQLiteDatabase);
                zE = e(sQLiteDatabase);
            } catch (Exception e3) {
                com.salesforce.marketingcloud.g.b(g, e3, "Unable to recover %s", f);
            }
        }
        return zF && zE;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void a(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        this.c.insertWithOnConflict("regions", null, c(region, cVar), 5);
        if (region.messages().isEmpty()) {
            return;
        }
        Iterator<Message> it = region.messages().iterator();
        while (it.hasNext()) {
            this.c.insertWithOnConflict(f, null, a(region, it.next()), 5);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<String> d(int i) {
        List<String> list = Collections.EMPTY_LIST;
        Cursor cursorRawQuery = this.c.rawQuery("SELECT id FROM regions WHERE location_type=?", new String[]{String.valueOf(i)});
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                do {
                    arrayList.add(cursorRawQuery.getString(columnIndex));
                } while (cursorRawQuery.moveToNext());
                list = arrayList;
            }
            cursorRawQuery.close();
        }
        return list;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public int f(int i) {
        return this.c.delete("regions", "location_type=?", new String[]{String.valueOf(i)});
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", (Integer) 0);
        this.c.update("regions", contentValues, null, null);
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public Region m(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorRawQuery = this.c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{Region.MAGIC_REGION_ID});
        Region regionA = null;
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                try {
                    regionA = com.salesforce.marketingcloud.internal.j.a(new LatLon(Double.valueOf(cVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(h.a.b)))).doubleValue(), Double.valueOf(cVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(h.a.c)))).doubleValue()), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("radius")));
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(g, e2, "Unable to read magic region from DB.", new Object[0]);
                }
            }
            cursorRawQuery.close();
        }
        return regionA;
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return "regions";
    }

    private static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE region_messages (region_id TEXT,  message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
    }

    public static void d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    private static boolean f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.compileStatement("SELECT id,latitude,longitude,radius,beacon_guid,beacon_major,beacon_minor,description,name,location_type,is_inside FROM regions");
            return true;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(g, e2, "%s is invalid", "regions");
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<String> c(@NonNull String str, int i) {
        ArrayList arrayList;
        Cursor cursorRawQuery = this.c.rawQuery("SELECT message_id FROM region_messages INNER JOIN messages on region_messages.message_id = messages.id WHERE region_id = ? AND messages.message_type = ?", new String[]{str, String.valueOf(i)});
        if (cursorRawQuery.moveToFirst()) {
            arrayList = new ArrayList(cursorRawQuery.getCount());
            int columnIndex = cursorRawQuery.getColumnIndex("message_id");
            do {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            } while (cursorRawQuery.moveToNext());
        } else {
            arrayList = null;
        }
        cursorRawQuery.close();
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }

    private static ContentValues c(Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", region.id());
        contentValues.put(h.a.b, cVar.a(String.valueOf(region.center().latitude())));
        contentValues.put(h.a.c, cVar.a(String.valueOf(region.center().longitude())));
        contentValues.put("radius", Integer.valueOf(region.radius()));
        contentValues.put("beacon_guid", cVar.a(region.proximityUuid()));
        contentValues.put("beacon_major", Integer.valueOf(region.major()));
        contentValues.put("beacon_minor", Integer.valueOf(region.minor()));
        contentValues.put(lqlqqlq.mmm006Dm006Dm, cVar.a(region.description()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, cVar.a(region.name()));
        contentValues.put("location_type", Integer.valueOf(region.regionType()));
        contentValues.put("is_inside", Integer.valueOf(com.salesforce.marketingcloud.internal.j.a(region) ? 1 : 0));
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public Region a(String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorRawQuery = this.c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{str});
        if (cursorRawQuery != null) {
            regionC = cursorRawQuery.moveToFirst() ? d.c(cursorRawQuery, cVar) : null;
            cursorRawQuery.close();
        }
        return regionC;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<Region> a(int i, com.salesforce.marketingcloud.util.c cVar) {
        List<Region> list = Collections.EMPTY_LIST;
        Cursor cursorRawQuery = this.c.rawQuery("SELECT * FROM regions WHERE location_type=?", new String[]{String.valueOf(i)});
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
                do {
                    Region regionC = d.c(cursorRawQuery, cVar);
                    if (regionC != null) {
                        arrayList.add(regionC);
                    }
                } while (cursorRawQuery.moveToNext());
                list = arrayList;
            }
            cursorRawQuery.close();
        }
        return list;
    }

    private static ContentValues a(Region region, Message message) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("region_id", region.id());
        contentValues.put("message_id", message.id());
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void a(@NonNull String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", Integer.valueOf(z ? 1 : 0));
        this.c.update("regions", contentValues, "id=?", new String[]{str});
    }
}
