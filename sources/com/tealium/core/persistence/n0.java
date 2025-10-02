package com.tealium.core.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.tealium.core.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"tealiumlibrary_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "", "a", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 6, 0})
    final class a extends Lambda implements Function1<Exception, Unit> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Exception it = (Exception) obj;
            Intrinsics.h(it, "it");
            Logger.f19124a.b("Tealium-1.6.0", this.h);
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    final class b extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public final /* synthetic */ Lambda h;
        public final /* synthetic */ Function1 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Function1 function12) {
            super(1);
            this.h = (Lambda) function1;
            this.i = function12;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SQLiteDatabase database = (SQLiteDatabase) obj;
            Intrinsics.h(database, "database");
            try {
                database.beginTransactionNonExclusive();
            } catch (Exception e) {
                Logger.f19124a.b("Tealium-1.6.0", "Could not begin transaction: " + e.getMessage());
            }
            try {
                try {
                    this.h.invoke(database);
                    database.setTransactionSuccessful();
                } catch (Exception e2) {
                    ((a) this.i).invoke(e2);
                    database.endTransaction();
                }
                return Unit.f24250a;
            } finally {
                database.endTransaction();
            }
        }
    }

    public static final long a() {
        return System.currentTimeMillis() / 1000;
    }

    public static final Object b(e0 e0Var) {
        Deserializer b2;
        Serde xVar;
        Intrinsics.h(e0Var, "<this>");
        LinkedHashMap linkedHashMap = h0.f19171a;
        Class clazz = e0Var.e.e;
        Intrinsics.h(clazz, "clazz");
        LinkedHashMap linkedHashMap2 = h0.f19171a;
        Serde serdeB = (Serde) linkedHashMap2.get(clazz);
        if (serdeB == null) {
            if (clazz.equals(String.class)) {
                serdeB = h0.e();
            } else if (clazz.equals(Integer.TYPE)) {
                serdeB = h0.a();
            } else {
                Class cls = Double.TYPE;
                if (clazz.equals(cls)) {
                    xVar = h0.e;
                    if (xVar == null) {
                        xVar = new q();
                    }
                    h0.e = xVar;
                    linkedHashMap2.put(cls, xVar);
                } else if (clazz.equals(Long.TYPE)) {
                    serdeB = h0.c();
                } else {
                    Class cls2 = Boolean.TYPE;
                    if (clazz.equals(cls2)) {
                        xVar = h0.f;
                        if (xVar == null) {
                            xVar = new f();
                        }
                        h0.f = xVar;
                        linkedHashMap2.put(cls2, xVar);
                    } else if (clazz.equals(String[].class)) {
                        serdeB = h0.d();
                    } else if (clazz.equals(int[].class)) {
                        xVar = h0.h;
                        if (xVar == null) {
                            xVar = new t();
                        }
                        h0.h = xVar;
                        linkedHashMap2.put(int[].class, xVar);
                    } else if (clazz.equals(double[].class)) {
                        xVar = h0.j;
                        if (xVar == null) {
                            xVar = new o();
                        }
                        h0.j = xVar;
                        linkedHashMap2.put(double[].class, xVar);
                    } else if (clazz.equals(long[].class)) {
                        xVar = h0.i;
                        if (xVar == null) {
                            xVar = new b0();
                        }
                        h0.i = xVar;
                        linkedHashMap2.put(long[].class, xVar);
                    } else if (clazz.equals(boolean[].class)) {
                        xVar = h0.k;
                        if (xVar == null) {
                            xVar = new d();
                        }
                        h0.k = xVar;
                        linkedHashMap2.put(boolean[].class, xVar);
                    } else if (clazz.equals(JSONObject.class)) {
                        serdeB = h0.b();
                    } else if (clazz.equals(JSONArray.class)) {
                        xVar = h0.m;
                        if (xVar == null) {
                            xVar = new x();
                        }
                        h0.m = xVar;
                        linkedHashMap2.put(JSONArray.class, xVar);
                    } else {
                        serdeB = null;
                    }
                }
                serdeB = xVar;
            }
        }
        if (serdeB == null || (b2 = serdeB.getB()) == null) {
            return null;
        }
        return b2.a(e0Var.b);
    }

    public static final void c(h hVar, String errorMessage, Function1 function1) {
        Intrinsics.h(hVar, "<this>");
        Intrinsics.h(errorMessage, "errorMessage");
        b bVar = new b(function1, new a(errorMessage));
        ConcurrentLinkedQueue concurrentLinkedQueue = hVar.d;
        SQLiteDatabase sQLiteDatabaseA = hVar.a();
        if (sQLiteDatabaseA == null || sQLiteDatabaseA.isReadOnly()) {
            Logger.f19124a.b("Tealium-1.6.0", "Database is not in a writable state");
            concurrentLinkedQueue.add(bVar);
            return;
        }
        if (!concurrentLinkedQueue.isEmpty()) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                Function1 function12 = (Function1) it.next();
                function12.invoke(sQLiteDatabaseA);
                concurrentLinkedQueue.remove(function12);
            }
        }
        bVar.invoke(sQLiteDatabaseA);
    }
}
