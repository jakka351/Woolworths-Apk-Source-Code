package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Companion", "DBRefHolder", "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public final Context d;
    public final String e;
    public final SupportSQLiteOpenHelper.Callback f;
    public final boolean g;
    public final boolean h;
    public final Lazy i;
    public boolean j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DBRefHolder {

        /* renamed from: a, reason: collision with root package name */
        public FrameworkSQLiteDatabase f3767a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "CallbackException", "CallbackName", "Companion", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int k = 0;
        public final Context d;
        public final DBRefHolder e;
        public final SupportSQLiteOpenHelper.Callback f;
        public final boolean g;
        public boolean h;
        public final ProcessLock i;
        public boolean j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CallbackException extends RuntimeException {
            public final CallbackName d;
            public final Throwable e;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.d = callbackName;
                this.e = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.e;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class CallbackName {
            public static final CallbackName d;
            public static final CallbackName e;
            public static final CallbackName f;
            public static final CallbackName g;
            public static final CallbackName h;
            public static final /* synthetic */ CallbackName[] i;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                d = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                e = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                f = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                g = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                h = callbackName5;
                i = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) i.clone();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public static FrameworkSQLiteDatabase a(DBRefHolder refHolder, SQLiteDatabase sQLiteDatabase) {
                Intrinsics.h(refHolder, "refHolder");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f3767a;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.d.equals(sQLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
                refHolder.f3767a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.f3764a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.b
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.k;
                    SupportSQLiteOpenHelper.Callback callback2 = callback;
                    Intrinsics.h(callback2, "$callback");
                    Intrinsics.g(dbObj, "dbObj");
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseA = FrameworkSQLiteOpenHelper.OpenHelper.Companion.a(dBRefHolder, dbObj);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseA + ".path");
                    SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabaseA.d;
                    if (!sQLiteDatabase.isOpen()) {
                        String path = sQLiteDatabase.getPath();
                        if (path != null) {
                            SupportSQLiteOpenHelper.Callback.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    Intrinsics.g(obj, "p.second");
                                    SupportSQLiteOpenHelper.Callback.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase.getPath();
                                if (path2 != null) {
                                    SupportSQLiteOpenHelper.Callback.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        frameworkSQLiteDatabaseA.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            Intrinsics.h(callback, "callback");
            this.d = context;
            this.e = dBRefHolder;
            this.f = callback;
            this.g = z;
            this.i = new ProcessLock(str == null ? androidx.constraintlayout.core.state.a.h("randomUUID().toString()") : str, context.getCacheDir(), false);
        }

        public final SupportSQLiteDatabase a(boolean z) throws IOException {
            ProcessLock processLock = this.i;
            try {
                processLock.a((this.j || getDatabaseName() == null) ? false : true);
                this.h = false;
                SQLiteDatabase sQLiteDatabaseC = c(z);
                if (!this.h) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseA = Companion.a(this.e, sQLiteDatabaseC);
                    processLock.b();
                    return frameworkSQLiteDatabaseA;
                }
                close();
                SupportSQLiteDatabase supportSQLiteDatabaseA = a(z);
                processLock.b();
                return supportSQLiteDatabaseA;
            } catch (Throwable th) {
                processLock.b();
                throw th;
            }
        }

        public final SQLiteDatabase b(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase c(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.j;
            Context context = this.d;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return b(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return b(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        int iOrdinal = callbackException.d.ordinal();
                        Throwable th2 = callbackException.e;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.g) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return b(z);
                    } catch (CallbackException e) {
                        throw e.e;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() throws IOException {
            ProcessLock processLock = this.i;
            try {
                processLock.a(processLock.f3770a);
                super.close();
                this.e.f3767a = null;
                this.j = false;
            } finally {
                processLock.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db) {
            Intrinsics.h(db, "db");
            boolean z = this.h;
            SupportSQLiteOpenHelper.Callback callback = this.f;
            if (!z && callback.f3764a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                callback.b(Companion.a(this.e, db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.h(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f.c(Companion.a(this.e, sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.e, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db, int i, int i2) {
            Intrinsics.h(db, "db");
            this.h = true;
            try {
                this.f.d(Companion.a(this.e, db), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.g, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db) {
            Intrinsics.h(db, "db");
            if (!this.h) {
                try {
                    this.f.e(Companion.a(this.e, db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.h, th);
                }
            }
            this.j = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.h(sqLiteDatabase, "sqLiteDatabase");
            this.h = true;
            try {
                this.f.f(Companion.a(this.e, sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f, th);
            }
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        Intrinsics.h(callback, "callback");
        this.d = context;
        this.e = str;
        this.f = callback;
        this.g = z;
        this.h = z2;
        this.i = LazyKt.b(new Function0<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.h;
                Context context2 = frameworkSQLiteOpenHelper.d;
                String str2 = frameworkSQLiteOpenHelper.e;
                if (str2 == null || !frameworkSQLiteOpenHelper.g) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, frameworkSQLiteOpenHelper.e, new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f, frameworkSQLiteOpenHelper.h);
                } else {
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    Intrinsics.g(noBackupFilesDir, "context.noBackupFilesDir");
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, new File(noBackupFilesDir, str2).getAbsolutePath(), new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f, frameworkSQLiteOpenHelper.h);
                }
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.j);
                return openHelper;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Lazy lazy = this.i;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getD()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((OpenHelper) this.i.getD()).a(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        Lazy lazy = this.i;
        if (lazy.isInitialized()) {
            OpenHelper sQLiteOpenHelper = (OpenHelper) lazy.getD();
            Intrinsics.h(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.j = z;
    }
}
