package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public abstract class SharedSQLiteStatement {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3725a;
    public final AtomicBoolean b;
    public final Lazy c;

    public SharedSQLiteStatement(RoomDatabase database) {
        Intrinsics.h(database, "database");
        this.f3725a = database;
        this.b = new AtomicBoolean(false);
        this.c = LazyKt.b(new Function0<SupportSQLiteStatement>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedSQLiteStatement sharedSQLiteStatement = this.h;
                return sharedSQLiteStatement.f3725a.d(sharedSQLiteStatement.b());
            }
        });
    }

    public final SupportSQLiteStatement a() {
        RoomDatabase roomDatabase = this.f3725a;
        roomDatabase.a();
        return this.b.compareAndSet(false, true) ? (SupportSQLiteStatement) this.c.getD() : roomDatabase.d(b());
    }

    public abstract String b();

    public final void c(SupportSQLiteStatement statement) {
        Intrinsics.h(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.c.getD())) {
            this.b.set(false);
        }
    }
}
