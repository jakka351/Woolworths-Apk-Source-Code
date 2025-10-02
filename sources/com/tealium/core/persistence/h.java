package com.tealium.core.persistence;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.RequestConfiguration;
import com.tealium.core.TealiumConfig;
import com.tealium.core.persistence.i0;
import com.tealium.test.OpenForTesting;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/h;", "Landroid/database/sqlite/SQLiteOpenHelper;", "b", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
@OpenForTesting
/* loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {
    public static final List f = CollectionsKt.Q(new i());
    public final ConcurrentLinkedQueue d;
    public SQLiteDatabase e;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "", "a", "(Landroid/database/sqlite/SQLiteDatabase;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends Lambda implements Function1<SQLiteDatabase, Unit> {
        public static final a h = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws SQLException {
            SQLiteDatabase it = (SQLiteDatabase) obj;
            Intrinsics.h(it, "it");
            it.execSQL(i0.b.a("visitors"));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tealium/core/persistence/h$b;", "", "", "DATABASE_VERSION", "I", "", "Lcom/tealium/core/persistence/i;", "databaseUpgrades", "Ljava/util/List;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ((i) obj).getClass();
                ((i) obj2).getClass();
                return ComparisonsKt.a(2, 2);
            }
        }
    }

    public h(TealiumConfig tealiumConfig) {
        File file = tealiumConfig.j;
        char c = File.separatorChar;
        String str = tealiumConfig.b;
        String str2 = tealiumConfig.c;
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        sb.append(c);
        sb.append("tealium-");
        sb.append(str);
        sb.append("-");
        super(tealiumConfig.f19129a.getApplicationContext(), YU.a.o(sb, str2, ".db"), (SQLiteDatabase.CursorFactory) null, 2);
        this.d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.sqlite.SQLiteDatabase a() {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r5.e
            if (r0 != 0) goto L35
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L12
            if (r1 == 0) goto L14
            boolean r2 = r1.isReadOnly()     // Catch: android.database.sqlite.SQLiteException -> L12
            if (r2 != 0) goto L14
            goto L30
        L12:
            r1 = move-exception
            goto L16
        L14:
            r1 = r0
            goto L30
        L16:
            com.tealium.core.Logger$Companion r2 = com.tealium.core.Logger.f19124a
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error fetching database: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "Tealium-1.6.0"
            r2.b(r3, r1)
            goto L14
        L30:
            if (r1 == 0) goto L35
            r5.e = r1
            r0 = r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.persistence.h.a():android.database.sqlite.SQLiteDatabase");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(i0.b.a("datalayer"));
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(i0.b.a("dispatches"));
        }
        onUpgrade(sQLiteDatabase, 1, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (sQLiteDatabase != null) {
            List upgrades = f;
            Intrinsics.h(upgrades, "upgrades");
            ArrayList arrayList = new ArrayList();
            for (Object obj : upgrades) {
                ((i) obj).getClass();
                if (i < 2) {
                    arrayList.add(obj);
                }
            }
            Iterator it = CollectionsKt.u0(new b.a(), arrayList).iterator();
            while (it.hasNext()) {
                ((i) it.next()).getClass();
                a.h.invoke(sQLiteDatabase);
            }
        }
    }
}
