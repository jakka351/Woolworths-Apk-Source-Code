package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Companion", "Delegate", "ValidationResult", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public DatabaseConfiguration b;
    public final Delegate c;
    public final String d;
    public final String e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static abstract class Delegate {

        /* renamed from: a, reason: collision with root package name */
        public final int f3721a;

        public Delegate(int i) {
            this.f3721a = i;
        }

        public abstract void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public ValidationResult g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    /* loaded from: classes2.dex */
    public static class ValidationResult {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3722a;
        public final String b;

        public ValidationResult(boolean z, String str) {
            this.f3722a = z;
            this.b = str;
        }
    }

    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.f3721a);
        this.b = databaseConfiguration;
        this.c = delegate;
        this.d = str;
        this.e = str2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException, SQLException {
        Cursor cursorA = frameworkSQLiteDatabase.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorA.moveToFirst()) {
                if (cursorA.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorA.close();
            Delegate delegate = this.c;
            delegate.a(frameworkSQLiteDatabase);
            if (!z) {
                ValidationResult validationResultG = delegate.g(frameworkSQLiteDatabase);
                if (!validationResultG.f3722a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultG.b);
                }
            }
            g(frameworkSQLiteDatabase);
            delegate.c(frameworkSQLiteDatabase);
        } finally {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) throws SQLException {
        f(frameworkSQLiteDatabase, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.sqlite.db.framework.FrameworkSQLiteDatabase r6) throws java.io.IOException, android.database.SQLException {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.a(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L8c
        L18:
            r1 = r2
        L19:
            r0.close()
            androidx.room.RoomOpenHelper$Delegate r0 = r5.c
            r3 = 0
            if (r1 == 0) goto L62
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.g0(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r6 = move-exception
            goto L5c
        L39:
            r2 = r3
        L3a:
            r1.close()
            java.lang.String r1 = r5.d
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L70
            java.lang.String r4 = r5.e
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4e
            goto L70
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = YU.a.i(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L5c:
            throw r6     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r1, r6)
            throw r0
        L62:
            androidx.room.RoomOpenHelper$ValidationResult r1 = r0.g(r6)
            boolean r2 = r1.f3722a
            if (r2 == 0) goto L76
            r0.e(r6)
            r5.g(r6)
        L70:
            r0.d(r6)
            r5.b = r3
            return
        L76:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L8c:
            throw r6     // Catch: java.lang.Throwable -> L8d
        L8d:
            r1 = move-exception
            kotlin.io.CloseableKt.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.e(androidx.sqlite.db.framework.FrameworkSQLiteDatabase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007f A[EDGE_INSN: B:73:0x007f->B:37:0x007f BREAK  A[LOOP:1: B:12:0x001e->B:76:?], SYNTHETIC] */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.sqlite.db.framework.FrameworkSQLiteDatabase r13, int r14, int r15) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.f(androidx.sqlite.db.framework.FrameworkSQLiteDatabase, int, int):void");
    }

    public final void g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws SQLException {
        frameworkSQLiteDatabase.c1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        frameworkSQLiteDatabase.c1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.d + "')");
    }
}
