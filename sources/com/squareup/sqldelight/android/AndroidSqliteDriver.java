package com.squareup.sqldelight.android;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.AfterVersionWithDriver;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.db.SqlDriverKt$migrateWithCallbacks$$inlined$sortedBy$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver;", "Lcom/squareup/sqldelight/db/SqlDriver;", "Callback", "Transaction", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidSqliteDriver implements SqlDriver {
    public final SupportSQLiteOpenHelper d;
    public final ThreadLocal e;
    public final Lazy f;
    public final AndroidSqliteDriver$statements$1 g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver$Callback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class Callback extends SupportSQLiteOpenHelper.Callback {
        public final SqlDriver.Schema b;
        public final AfterVersionWithDriver[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Callback(SqlDriver.Schema schema) {
            super(schema.getVersion());
            Intrinsics.h(schema, "schema");
            AfterVersionWithDriver[] callbacks = (AfterVersionWithDriver[]) Arrays.copyOf(new AfterVersionWithDriver[0], 0);
            Intrinsics.h(callbacks, "callbacks");
            this.b = schema;
            this.c = callbacks;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.b.create(new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, frameworkSQLiteDatabase, 1));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            AfterVersionWithDriver[] afterVersionWithDriverArr = this.c;
            int length = afterVersionWithDriverArr.length;
            SqlDriver.Schema schema = this.b;
            if (length == 0) {
                schema.migrate(new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, frameworkSQLiteDatabase, 1), i, i2);
                return;
            }
            AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver((SupportSQLiteOpenHelper) null, frameworkSQLiteDatabase, 1);
            AfterVersionWithDriver[] callbacks = (AfterVersionWithDriver[]) Arrays.copyOf(afterVersionWithDriverArr, afterVersionWithDriverArr.length);
            Intrinsics.h(schema, "<this>");
            Intrinsics.h(callbacks, "callbacks");
            ArrayList arrayList = new ArrayList();
            for (AfterVersionWithDriver afterVersionWithDriver : callbacks) {
                afterVersionWithDriver.getClass();
                if (i <= 0 && i2 > 0) {
                    arrayList.add(afterVersionWithDriver);
                }
            }
            Iterator it = CollectionsKt.u0(new SqlDriverKt$migrateWithCallbacks$$inlined$sortedBy$1(), arrayList).iterator();
            if (it.hasNext()) {
                ((AfterVersionWithDriver) it.next()).getClass();
                schema.migrate(androidSqliteDriver, i, 1);
                throw null;
            }
            if (i < i2) {
                schema.migrate(androidSqliteDriver, i, i2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidSqliteDriver$Transaction;", "Lcom/squareup/sqldelight/Transacter$Transaction;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class Transaction extends Transacter.Transaction {
        public final Transacter.Transaction g;

        public Transaction(Transacter.Transaction transaction) {
            this.g = transaction;
        }

        @Override // com.squareup.sqldelight.Transacter.Transaction
        public final void a(boolean z) {
            AndroidSqliteDriver androidSqliteDriver = AndroidSqliteDriver.this;
            Transacter.Transaction transaction = this.g;
            if (transaction == null) {
                if (z) {
                    androidSqliteDriver.b().o1();
                    androidSqliteDriver.b().v1();
                } else {
                    androidSqliteDriver.b().v1();
                }
            }
            androidSqliteDriver.e.set(transaction);
        }

        @Override // com.squareup.sqldelight.Transacter.Transaction
        /* renamed from: b, reason: from getter */
        public final Transacter.Transaction getG() {
            return this.g;
        }
    }

    public AndroidSqliteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper, final FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i) {
        this.d = supportSQLiteOpenHelper;
        if (!((supportSQLiteOpenHelper != null) ^ (frameworkSQLiteDatabase != null))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e = new ThreadLocal();
        this.f = LazyKt.b(new Function0<SupportSQLiteDatabase>() { // from class: com.squareup.sqldelight.android.AndroidSqliteDriver$database$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = this.h.d;
                SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper2 == null ? null : supportSQLiteOpenHelper2.getWritableDatabase();
                if (writableDatabase != null) {
                    return writableDatabase;
                }
                SupportSQLiteDatabase supportSQLiteDatabase = frameworkSQLiteDatabase;
                Intrinsics.e(supportSQLiteDatabase);
                return supportSQLiteDatabase;
            }
        });
        this.g = new AndroidSqliteDriver$statements$1(i);
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction L1() {
        ThreadLocal threadLocal = this.e;
        Transacter.Transaction transaction = (Transacter.Transaction) threadLocal.get();
        Transaction transaction2 = new Transaction(transaction);
        threadLocal.set(transaction2);
        if (transaction == null) {
            b().W();
        }
        return transaction2;
    }

    public final Object a(Integer num, Function0 function0, Function1 function1, Function1 function12) {
        AndroidSqliteDriver$statements$1 androidSqliteDriver$statements$1 = this.g;
        AndroidStatement androidStatementRemove = num != null ? androidSqliteDriver$statements$1.remove(num) : null;
        if (androidStatementRemove == null) {
            androidStatementRemove = (AndroidStatement) function0.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(androidStatementRemove);
            } catch (Throwable th) {
                if (num != null) {
                    AndroidStatement androidStatementPut = androidSqliteDriver$statements$1.put(num, androidStatementRemove);
                    if (androidStatementPut != null) {
                        androidStatementPut.close();
                    }
                } else {
                    androidStatementRemove.close();
                }
                throw th;
            }
        }
        Object objInvoke = function12.invoke(androidStatementRemove);
        if (num == null) {
            androidStatementRemove.close();
            return objInvoke;
        }
        AndroidStatement androidStatementPut2 = androidSqliteDriver$statements$1.put(num, androidStatementRemove);
        if (androidStatementPut2 == null) {
            return objInvoke;
        }
        androidStatementPut2.close();
        return objInvoke;
    }

    public final SupportSQLiteDatabase b() {
        return (SupportSQLiteDatabase) this.f.getD();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Unit unit;
        this.g.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.d;
        if (supportSQLiteOpenHelper == null) {
            unit = null;
        } else {
            supportSQLiteOpenHelper.close();
            unit = Unit.f24250a;
        }
        if (unit == null) {
            b().close();
        }
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final SqlCursor s0(Integer num, final String sql, final int i, Function1 function1) {
        Intrinsics.h(sql, "sql");
        return (SqlCursor) a(num, new Function0<AndroidStatement>(sql, this, i) { // from class: com.squareup.sqldelight.android.AndroidSqliteDriver$executeQuery$1
            public final /* synthetic */ String h;
            public final /* synthetic */ AndroidSqliteDriver i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AndroidQuery(this.h, this.i.b());
            }
        }, function1, AndroidSqliteDriver$executeQuery$2.d);
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final void t1(Integer num, final String sql, Function1 function1) {
        Intrinsics.h(sql, "sql");
        a(num, new Function0<AndroidStatement>() { // from class: com.squareup.sqldelight.android.AndroidSqliteDriver$execute$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AndroidPreparedStatement(this.h.b().S1(sql));
            }
        }, function1, AndroidSqliteDriver$execute$2.d);
    }

    @Override // com.squareup.sqldelight.db.SqlDriver
    public final Transacter.Transaction x0() {
        return (Transacter.Transaction) this.e.get();
    }

    public AndroidSqliteDriver(SqlDriver.Schema schema, Context context, String str) {
        FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
        Callback callback = new Callback(schema);
        Intrinsics.h(schema, "schema");
        Intrinsics.h(context, "context");
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a(context);
        builderA.c = callback;
        builderA.b = str;
        builderA.d = false;
        this(frameworkSQLiteOpenHelperFactory.d(builderA.a()), (FrameworkSQLiteDatabase) null, 20);
    }
}
