package com.tealium.core.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tealium.core.messaging.NewSessionListener;
import com.tealium.core.persistence.Expiry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/tealium/core/persistence/g0;", "Lcom/tealium/core/persistence/KeyValueDao;", "", "Lcom/tealium/core/persistence/e0;", "Lcom/tealium/core/messaging/NewSessionListener;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class g0 implements KeyValueDao<String, e0>, NewSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.tealium.core.persistence.h f19170a;
    public final String b;
    public final boolean c;
    public final Function2 d;
    public final Function1 e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/g0$a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class b extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            g0 g0Var = g0.this;
            List listF = g0Var.F();
            database.delete(g0Var.b, null, null);
            Function1 function1 = g0Var.e;
            if (function1 != null) {
                function1.invoke(CollectionsKt.L0(listF));
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class c extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Function1 function1;
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            g0 g0Var = g0.this;
            String str = g0Var.b;
            String str2 = this.i;
            if (database.delete(str, "key = ?", new String[]{str2}) > 0 && (function1 = g0Var.e) != null) {
                function1.invoke(SetsKt.i(str2));
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class d extends Lambda implements Function1<SQLiteDatabase, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
        final class a extends Lambda implements Function1<String, CharSequence> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                Intrinsics.h(it, "it");
                return "?";
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class e extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public final /* synthetic */ e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var) {
            super(1);
            this.i = e0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Function2 function2;
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            g0 g0Var = g0.this;
            String str = g0Var.b;
            e0 e0Var = this.i;
            if (database.insertWithOnConflict(str, null, e0Var.a(), 5) > 0 && (function2 = g0Var.d) != null) {
                function2.invoke(e0Var.f19168a, e0Var);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class f extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            String[] strArr = {String.valueOf(-2L)};
            g0 g0Var = g0.this;
            LinkedHashMap linkedHashMapR = g0Var.r("expiry = ?", strArr);
            if (!linkedHashMapR.isEmpty()) {
                database.delete(g0Var.b, "expiry = ?", strArr);
                Function1 function1 = g0Var.e;
                if (function1 != null) {
                    ArrayList arrayList = new ArrayList(linkedHashMapR.size());
                    Iterator it = linkedHashMapR.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                    function1.invoke(CollectionsKt.L0(arrayList));
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class g extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            long jA = n0.a();
            String[] strArr = {String.valueOf(jA)};
            g0 g0Var = g0.this;
            LinkedHashMap linkedHashMapR = g0Var.r("(expiry >= 0 AND expiry < ?)", strArr);
            if (!linkedHashMapR.isEmpty()) {
                database.delete(g0Var.b, "(expiry >= 0 AND expiry < ?)", new String[]{String.valueOf(jA)});
                Function1 function1 = g0Var.e;
                if (function1 != null) {
                    ArrayList arrayList = new ArrayList(linkedHashMapR.size());
                    Iterator it = linkedHashMapR.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                    function1.invoke(CollectionsKt.L0(arrayList));
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class h extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public final /* synthetic */ e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e0 e0Var) {
            super(1);
            this.i = e0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Function2 function2;
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            g0 g0Var = g0.this;
            String str = g0Var.b;
            e0 e0Var = this.i;
            ContentValues contentValuesA = e0Var.a();
            String str2 = e0Var.f19168a;
            if (database.update(str, contentValuesA, "key = ?", new String[]{str2}) > 0 && (function2 = g0Var.d) != null) {
                function2.invoke(str2, e0Var);
            }
            return Unit.f24250a;
        }
    }

    public g0(com.tealium.core.persistence.h dbHelper, String str, boolean z, Function2 function2, Function1 function1) {
        Intrinsics.h(dbHelper, "dbHelper");
        this.f19170a = dbHelper;
        this.b = str;
        this.c = z;
        this.d = function2;
        this.e = function1;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final List F() {
        boolean z = this.c;
        String str = z ? null : "(expiry < 0 OR expiry > ?)";
        String[] strArr = z ? null : new String[]{String.valueOf(n0.a())};
        ArrayList arrayList = new ArrayList();
        com.tealium.core.persistence.h hVar = this.f19170a;
        if (hVar.a() != null) {
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            Cursor cursorQuery = sQLiteDatabaseA != null ? sQLiteDatabaseA.query(this.b, new String[]{"key"}, str, strArr, null, null, null, null) : null;
            if (cursorQuery != null) {
                int columnIndex = cursorQuery.getColumnIndex("key");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    Intrinsics.g(string, "it.getString(columnIndex)");
                    arrayList.add(string);
                }
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void c(e0 e0Var) {
        e0 e0VarB = b(e0Var.f19168a);
        com.tealium.core.persistence.h hVar = this.f19170a;
        Expiry expiry = Expiry.f19166a;
        if (e0VarB != null) {
            if (e0Var.c == null && Expiry.Companion.b(e0VarB.c)) {
                e0Var.c = expiry;
            }
            n0.c(hVar, "Error while trying to update item", new h(e0Var));
            return;
        }
        Expiry expiry2 = e0Var.c;
        if (expiry2 != null) {
            expiry = expiry2;
        }
        e0Var.c = expiry;
        n0.c(hVar, "Error while trying to insert item", new e(e0Var));
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void clear() {
        n0.c(this.f19170a, "Error while trying to clear database", new b());
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final int count() {
        boolean z = this.c;
        String str = z ? "" : "WHERE (expiry < 0 OR expiry > ?)";
        String[] strArr = z ? null : new String[]{String.valueOf(n0.a())};
        com.tealium.core.persistence.h hVar = this.f19170a;
        if (hVar.a() == null) {
            return 0;
        }
        SQLiteDatabase sQLiteDatabaseA = hVar.a();
        Cursor cursorRawQuery = sQLiteDatabaseA != null ? sQLiteDatabaseA.rawQuery(YU.a.i("SELECT COUNT(*) from ", this.b, " ", str), strArr) : null;
        if (cursorRawQuery == null) {
            return 0;
        }
        cursorRawQuery.moveToFirst();
        int i = cursorRawQuery.getInt(0);
        cursorRawQuery.close();
        return i;
    }

    @Override // com.tealium.core.messaging.NewSessionListener
    public final void f(long j) {
        n0.c(this.f19170a, "Error while trying to update session data", new f());
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final Map getAll() {
        boolean z = this.c;
        return r(z ? null : "(expiry < 0 OR expiry > ?)", z ? null : new String[]{String.valueOf(n0.a())});
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void h(Object obj) {
        String key = (String) obj;
        Intrinsics.h(key, "key");
        n0.c(this.f19170a, "Error while trying to delete key: ".concat(key), new c(key));
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void i() {
        n0.c(this.f19170a, "Error while trying to purge expired data", new g());
    }

    public final LinkedHashMap r(String str, String[] strArr) {
        Serialization serialization;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.tealium.core.persistence.h hVar = this.f19170a;
        if (hVar.a() != null) {
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            Cursor cursorQuery = sQLiteDatabaseA != null ? sQLiteDatabaseA.query(this.b, null, str, strArr, null, null, null) : null;
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("key");
                int columnIndex2 = cursorQuery.getColumnIndex("value");
                int columnIndex3 = cursorQuery.getColumnIndex("type");
                int columnIndex4 = cursorQuery.getColumnIndex("timestamp");
                int columnIndex5 = cursorQuery.getColumnIndex("expiry");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    Intrinsics.g(string, "it.getString(columnKeyIndex)");
                    String string2 = cursorQuery.getString(columnIndex2);
                    Intrinsics.g(string2, "it.getString(columnValueIndex)");
                    Expiry expiryA = Expiry.Companion.a(cursorQuery.getLong(columnIndex5));
                    Long lValueOf = cursorQuery.isNull(columnIndex4) ? null : Long.valueOf(cursorQuery.getLong(columnIndex4));
                    Serialization[] serializationArrValues = Serialization.values();
                    int length = serializationArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            serialization = null;
                            break;
                        }
                        Serialization serialization2 = serializationArrValues[i];
                        if (serialization2.d == cursorQuery.getInt(columnIndex3)) {
                            serialization = serialization2;
                            break;
                        }
                        i++;
                    }
                    if (serialization == null) {
                        serialization = Serialization.STRING;
                    }
                    linkedHashMap.put(string, new e0(string, string2, expiryA, lValueOf, serialization));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return linkedHashMap;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final e0 b(String key) {
        Intrinsics.h(key, "key");
        boolean z = this.c;
        String str = z ? "key = ?" : "key = ? AND (expiry < 0 OR expiry > ?)";
        int i = 0;
        String[] strArr = z ? new String[]{key} : new String[]{key, String.valueOf(n0.a())};
        com.tealium.core.persistence.h hVar = this.f19170a;
        e0 e0Var = null;
        Serialization serialization = null;
        e0Var = null;
        e0Var = null;
        if (hVar.a() != null) {
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            Cursor cursorQuery = sQLiteDatabaseA != null ? sQLiteDatabaseA.query(this.b, new String[]{"value", "type", "expiry", "timestamp"}, str, strArr, null, null, null) : null;
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex("value");
                    int columnIndex2 = cursorQuery.getColumnIndex("type");
                    int columnIndex3 = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex4 = cursorQuery.getColumnIndex("expiry");
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(columnIndex);
                    Intrinsics.g(string, "it.getString(columnValueIndex)");
                    Expiry expiryA = Expiry.Companion.a(cursorQuery.getLong(columnIndex4));
                    Long lValueOf = cursorQuery.isNull(columnIndex3) ? null : Long.valueOf(cursorQuery.getLong(columnIndex3));
                    Serialization[] serializationArrValues = Serialization.values();
                    int length = serializationArrValues.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Serialization serialization2 = serializationArrValues[i];
                        if (serialization2.d == cursorQuery.getInt(columnIndex2)) {
                            serialization = serialization2;
                            break;
                        }
                        i++;
                    }
                    if (serialization == null) {
                        serialization = Serialization.STRING;
                    }
                    e0Var = new e0(key, string, expiryA, lValueOf, serialization);
                }
                cursorQuery.close();
            }
        }
        return e0Var;
    }
}
