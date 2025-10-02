package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    long D();

    long D0();

    void N();

    List O();

    void O1(int i);

    SupportSQLiteStatement S1(String str);

    void W();

    void a2(Object[] objArr);

    void c1(String str);

    boolean c2();

    boolean e0();

    Cursor g0(SupportSQLiteQuery supportSQLiteQuery);

    boolean g1();

    String getPath();

    int getVersion();

    boolean isReadOnly();

    boolean l2();

    void o1();

    boolean r2();

    void v1();

    int v2(ContentValues contentValues, Object[] objArr);
}
