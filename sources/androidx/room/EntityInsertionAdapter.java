package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/EntityInsertionAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/SharedSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    public abstract void d(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final void e(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            d(supportSQLiteStatementA, obj);
            supportSQLiteStatementA.M1();
        } finally {
            c(supportSQLiteStatementA);
        }
    }

    public final void f(ArrayList arrayList) {
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d(supportSQLiteStatementA, it.next());
                supportSQLiteStatementA.M1();
            }
        } finally {
            c(supportSQLiteStatementA);
        }
    }
}
