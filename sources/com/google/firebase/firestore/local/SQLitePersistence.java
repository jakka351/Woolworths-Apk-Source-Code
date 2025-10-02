package com.google.firebase.firestore.local;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.firestore.util.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class SQLitePersistence extends Persistence {

    /* renamed from: a, reason: collision with root package name */
    public final OpenHelper f15513a;
    public final LocalSerializer b;
    public final SQLiteTargetCache c;
    public final SQLiteBundleCache d;
    public final SQLiteRemoteDocumentCache e;
    public final SQLiteLruReferenceDelegate f;
    public final SQLiteTransactionListener g;
    public SQLiteDatabase h;
    public boolean i;

    @VisibleForTesting
    public static class OpenHelper extends SQLiteOpenHelper {
        public final LocalSerializer d;
        public boolean e;

        public OpenHelper(Context context, LocalSerializer localSerializer, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 17);
            this.d = localSerializer;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.e = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (!this.e) {
                onConfigure(sQLiteDatabase);
            }
            new SQLiteSchema(sQLiteDatabase, this.d).b(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (this.e) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.e) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (!this.e) {
                onConfigure(sQLiteDatabase);
            }
            new SQLiteSchema(sQLiteDatabase, this.d).b(i);
        }
    }

    public static class Query {

        /* renamed from: a, reason: collision with root package name */
        public final SQLiteDatabase f15516a;
        public final String b;
        public s c;

        public Query(SQLiteDatabase sQLiteDatabase, String str) {
            this.f15516a = sQLiteDatabase;
            this.b = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.firestore.local.s] */
        public final void a(final Object... objArr) {
            this.c = new SQLiteDatabase.CursorFactory() { // from class: com.google.firebase.firestore.local.s
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    SQLitePersistence.n(sQLiteQuery, objArr);
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
        }

        public final int b(Consumer consumer) {
            Cursor cursorE = e();
            try {
                if (!cursorE.moveToFirst()) {
                    cursorE.close();
                    return 0;
                }
                consumer.accept(cursorE);
                cursorE.close();
                return 1;
            } catch (Throwable th) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final int c(Consumer consumer) {
            Cursor cursorE = e();
            int i = 0;
            while (cursorE.moveToNext()) {
                try {
                    i++;
                    consumer.accept(cursorE);
                } catch (Throwable th) {
                    if (cursorE != null) {
                        try {
                            cursorE.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorE.close();
            return i;
        }

        public final boolean d() {
            Cursor cursorE = e();
            try {
                boolean z = !cursorE.moveToFirst();
                cursorE.close();
                return z;
            } catch (Throwable th) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final Cursor e() {
            s sVar = this.c;
            String str = this.b;
            SQLiteDatabase sQLiteDatabase = this.f15516a;
            return sVar != null ? sQLiteDatabase.rawQueryWithFactory(sVar, str, null, null) : sQLiteDatabase.rawQuery(str, null);
        }
    }

    public SQLitePersistence(Context context, String str, DatabaseId databaseId, LocalSerializer localSerializer, LruGarbageCollector.Params params) {
        try {
            OpenHelper openHelper = new OpenHelper(context, localSerializer, "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(databaseId.d, "utf-8") + "." + URLEncoder.encode(databaseId.e, "utf-8"));
            this.g = new SQLiteTransactionListener() { // from class: com.google.firebase.firestore.local.SQLitePersistence.1
                @Override // android.database.sqlite.SQLiteTransactionListener
                public final void onBegin() {
                    SQLitePersistence.this.f.c();
                }

                @Override // android.database.sqlite.SQLiteTransactionListener
                public final void onCommit() {
                    SQLitePersistence.this.f.onTransactionCommitted();
                }

                @Override // android.database.sqlite.SQLiteTransactionListener
                public final void onRollback() {
                }
            };
            this.f15513a = openHelper;
            this.b = localSerializer;
            this.c = new SQLiteTargetCache(this, localSerializer);
            this.d = new SQLiteBundleCache();
            this.e = new SQLiteRemoteDocumentCache(this, localSerializer);
            this.f = new SQLiteLruReferenceDelegate(this, params);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static void n(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    Assert.a("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i + 1, (byte[]) obj);
            }
        }
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final BundleCache a() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final DocumentOverlayCache b(User user) {
        return new SQLiteDocumentOverlayCache(this, this.b, user);
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final GlobalsCache c() {
        return new SQLiteGlobalsCache();
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final IndexManager d(User user) {
        return new SQLiteIndexManager(this, this.b, user);
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final MutationQueue e(User user, IndexManager indexManager) {
        return new SQLiteMutationQueue(this, this.b, user, indexManager);
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final OverlayMigrationManager f() {
        return new SQLiteOverlayMigrationManager(this);
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final ReferenceDelegate g() {
        return this.f;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final RemoteDocumentCache h() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final TargetCache i() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final boolean j() {
        return this.i;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final Object k(String str, Supplier supplier) {
        Logger.a("Persistence", "Starting transaction: %s", str);
        this.h.beginTransactionWithListener(this.g);
        try {
            Object obj = supplier.get();
            this.h.setTransactionSuccessful();
            return obj;
        } finally {
            this.h.endTransaction();
        }
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final void l(Runnable runnable, String str) {
        Logger.a("Persistence", "Starting transaction: %s", str);
        this.h.beginTransactionWithListener(this.g);
        try {
            runnable.run();
            this.h.setTransactionSuccessful();
        } finally {
            this.h.endTransaction();
        }
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final void m() {
        Assert.b(!this.i, "SQLitePersistence double-started!", new Object[0]);
        this.i = true;
        try {
            this.h = this.f15513a.getWritableDatabase();
            SQLiteTargetCache sQLiteTargetCache = this.c;
            Assert.b(sQLiteTargetCache.f15519a.p("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").b(new n(sQLiteTargetCache, 1)) == 1, "Missing target_globals entry", new Object[0]);
            long j = sQLiteTargetCache.d;
            SQLiteLruReferenceDelegate sQLiteLruReferenceDelegate = this.f;
            sQLiteLruReferenceDelegate.getClass();
            ListenSequence listenSequence = new ListenSequence();
            listenSequence.f15455a = j;
            sQLiteLruReferenceDelegate.b = listenSequence;
        } catch (SQLiteDatabaseLockedException e) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    public final void o(String str, Object... objArr) {
        this.h.execSQL(str, objArr);
    }

    public final Query p(String str) {
        return new Query(this.h, str);
    }

    public static class LongQuery {

        /* renamed from: a, reason: collision with root package name */
        public final SQLitePersistence f15515a;
        public final String b;
        public final String c;
        public final List d;
        public int e;
        public final Iterator f;

        public LongQuery(SQLitePersistence sQLitePersistence, String str, ArrayList arrayList, String str2) {
            this.e = 0;
            this.f15515a = sQLitePersistence;
            this.b = str;
            this.d = Collections.EMPTY_LIST;
            this.c = str2;
            this.f = arrayList.iterator();
        }

        public final Object[] a() {
            List list = this.d;
            ArrayList arrayList = new ArrayList(list);
            int i = 0;
            while (true) {
                Iterator it = this.f;
                if (!it.hasNext() || i >= 900 - list.size()) {
                    break;
                }
                arrayList.add(it.next());
                i++;
            }
            return arrayList.toArray();
        }

        public final Query b() {
            this.e++;
            Object[] objArrA = a();
            Query queryP = this.f15515a.p(this.b + ((Object) Util.g(objArrA.length, "?", ", ")) + this.c);
            queryP.a(objArrA);
            return queryP;
        }

        public LongQuery(SQLitePersistence sQLitePersistence, String str, List list, ArrayList arrayList, String str2) {
            this.e = 0;
            this.f15515a = sQLitePersistence;
            this.b = str;
            this.d = list;
            this.c = str2;
            this.f = arrayList.iterator();
        }
    }
}
