package androidx.room.util;

import YU.a;
import android.database.Cursor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CursorUtil {
    public static final int a(Cursor c, String str) {
        Intrinsics.h(c, "c");
        int columnIndex = c.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor c, String str) {
        String strU;
        Intrinsics.h(c, "c");
        int iA = a(c, str);
        if (iA >= 0) {
            return iA;
        }
        try {
            String[] columnNames = c.getColumnNames();
            Intrinsics.g(columnNames, "c.columnNames");
            strU = ArraysKt.U(columnNames, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strU = j.h;
        }
        throw new IllegalArgumentException(a.i("column '", str, "' does not exist. Available columns: ", strU));
    }
}
