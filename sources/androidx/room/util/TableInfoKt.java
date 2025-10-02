package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TableInfoKt {
    public static final List a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        ListBuilder listBuilderV = CollectionsKt.v();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.g(string2, "cursor.getString(toColumnIndex)");
            listBuilderV.add(new TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        return CollectionsKt.t0(CollectionsKt.q(listBuilderV));
    }

    public static final TableInfo.Index b(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str, boolean z) throws IOException {
        Cursor cursorA = frameworkSQLiteDatabase.a("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorA.getColumnIndex("seqno");
            int columnIndex2 = cursorA.getColumnIndex(lqlllll.lqqllll.k006B006Bk006B006B006B);
            int columnIndex3 = cursorA.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = cursorA.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorA.moveToNext()) {
                    if (cursorA.getInt(columnIndex2) >= 0) {
                        int i = cursorA.getInt(columnIndex);
                        String columnName = cursorA.getString(columnIndex3);
                        String str2 = cursorA.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        Intrinsics.g(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.g(collectionValues, "columnsMap.values");
                List listG0 = CollectionsKt.G0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.g(collectionValues2, "ordersMap.values");
                TableInfo.Index index = new TableInfo.Index(str, z, listG0, CollectionsKt.G0(collectionValues2));
                cursorA.close();
                return index;
            }
            cursorA.close();
            return null;
        } finally {
        }
    }
}
