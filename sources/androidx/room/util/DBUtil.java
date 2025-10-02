package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.IOException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DBUtil {
    public static final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException, SQLException {
        ListBuilder listBuilderV = CollectionsKt.v();
        Cursor cursorA = frameworkSQLiteDatabase.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorA.moveToNext()) {
            try {
                listBuilderV.add(cursorA.getString(0));
            } finally {
            }
        }
        cursorA.close();
        ListIterator listIterator = CollectionsKt.q(listBuilderV).listIterator(0);
        while (listIterator.hasNext()) {
            String triggerName = (String) listIterator.next();
            Intrinsics.g(triggerName, "triggerName");
            if (StringsKt.W(triggerName, "room_fts_content_sync_", false)) {
                frameworkSQLiteDatabase.c1("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static final Cursor b(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z) {
        Intrinsics.h(db, "db");
        Intrinsics.h(sqLiteQuery, "sqLiteQuery");
        Cursor cursorO = db.o(sqLiteQuery);
        if (z && (cursorO instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorO;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorO.getColumnNames(), cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        Object[] objArr = new Object[cursorO.getColumnCount()];
                        int columnCount = cursorO.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorO.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorO.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorO.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorO.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorO.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorO.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorO;
    }
}
