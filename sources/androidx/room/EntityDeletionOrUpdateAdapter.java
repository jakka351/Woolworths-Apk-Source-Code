package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/EntityDeletionOrUpdateAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/SharedSQLiteStatement;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    public abstract void d(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    public final int e(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementA = a();
        try {
            d(supportSQLiteStatementA, obj);
            return supportSQLiteStatementA.P();
        } finally {
            c(supportSQLiteStatementA);
        }
    }
}
