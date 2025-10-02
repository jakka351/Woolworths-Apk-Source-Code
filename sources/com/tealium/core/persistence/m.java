package com.tealium.core.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tealium.core.persistence.Expiry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/persistence/m;", "Lcom/tealium/core/persistence/QueueingDao;", "", "Lcom/tealium/core/persistence/e0;", "Lcom/tealium/core/persistence/KeyValueDao;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m implements QueueingDao<String, e0>, KeyValueDao<String, e0> {

    /* renamed from: a, reason: collision with root package name */
    public final h f19176a;
    public final String b;
    public final KeyValueDao c;
    public int d;
    public int e;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class a extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public final /* synthetic */ ArrayList h;
        public final /* synthetic */ m i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, m mVar) {
            super(1);
            this.h = arrayList;
            this.i = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.h((SQLiteDatabase) obj, "<anonymous parameter 0>");
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                this.i.c.h(((e0) it.next()).f19168a);
            }
            return Unit.f24250a;
        }
    }

    public m(h dbHelper) {
        g0 g0Var = new g0(dbHelper, "dispatches", false, null, null);
        Intrinsics.h(dbHelper, "dbHelper");
        this.f19176a = dbHelper;
        this.b = "dispatches";
        this.c = g0Var;
        this.d = -1;
        this.e = -1;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final List F() {
        return this.c.F();
    }

    public final void a(e0 e0Var) {
        int i = this.d;
        KeyValueDao keyValueDao = this.c;
        int iCount = i == -1 ? 0 : (keyValueDao.count() + 1) - this.d;
        if (iCount > 0) {
            d(iCount);
        }
        Expiry aVar = e0Var.c;
        if (aVar == null) {
            int i2 = this.e;
            if (i2 < 0) {
                aVar = Expiry.b;
            } else {
                TimeUnit unit = TimeUnit.DAYS;
                long jA = n0.a();
                Intrinsics.h(unit, "unit");
                aVar = new Expiry.a(unit.toSeconds(i2), jA);
            }
        }
        e0Var.c = aVar;
        Long lValueOf = e0Var.d;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(n0.a());
        }
        e0Var.d = lValueOf;
        keyValueDao.c(e0Var);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void c(e0 e0Var) {
        a(e0Var);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void clear() {
        this.c.clear();
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final int count() {
        return this.c.count();
    }

    public final ArrayList d(int i) {
        ArrayList arrayList = new ArrayList();
        h hVar = this.f19176a;
        if (hVar.a() != null) {
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            Cursor cursorQuery = null;
            if (sQLiteDatabaseA != null) {
                cursorQuery = sQLiteDatabaseA.query(this.b, null, "(expiry < 0 OR expiry > ?)", new String[]{String.valueOf(n0.a())}, null, null, "timestamp ASC", i > 0 ? String.valueOf(i) : null);
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("key");
                int columnIndex2 = cursorQuery.getColumnIndex("value");
                int columnIndex3 = cursorQuery.getColumnIndex("timestamp");
                int columnIndex4 = cursorQuery.getColumnIndex("expiry");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    Intrinsics.g(string, "it.getString(columnKeyIndex)");
                    String string2 = cursorQuery.getString(columnIndex2);
                    Intrinsics.g(string2, "it.getString(columnValueIndex)");
                    arrayList.add(new e0(string, string2, Expiry.Companion.a(cursorQuery.getLong(columnIndex4)), Long.valueOf(cursorQuery.getLong(columnIndex3)), Serialization.JSON_OBJECT));
                }
            }
            n0.c(hVar, "Error while trying to delete items", new a(arrayList, this));
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void h(String key) {
        Intrinsics.h(key, "key");
        this.c.h(key);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e0 b(String key) {
        Intrinsics.h(key, "key");
        return (e0) this.c.b(key);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final Map getAll() {
        return this.c.getAll();
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void i() {
        this.c.i();
    }
}
