package me.oriient.ipssdk.realtime.database.sdkrealtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.QueryKt;
import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.db.SqlPreparedStatement;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl;
import me.oriient.ipssdk.realtime.database.tagging.DBTag;
import me.oriient.ipssdk.realtime.database.tagging.DBTagQueries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J\u0091\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152w\u0010\u0016\u001as\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010 \u001a\u00020\u0012H\u0016J\u0099\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00140\n\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010 \u001a\u00020\u00122w\u0010\u0016\u001as\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J2\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/realtime/database/sdkrealtime/DBTagQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/realtime/database/tagging/DBTagQueries;", "database", "Lme/oriient/ipssdk/realtime/database/sdkrealtime/TaggingSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/realtime/database/sdkrealtime/TaggingSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_realtime", "()Ljava/util/List;", "getBatch", "getGetBatch$me_oriient_sdk_realtime", "delete", "", "timestampMillis", "", "Lme/oriient/ipssdk/realtime/database/tagging/DBTag;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function5;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "payload", "status", "retries", "", "spaceId", "limit", "upsert", "GetBatchQuery", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DBTagQueriesImpl extends TransacterImpl implements DBTagQueries {

    @NotNull
    private final TaggingSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getBatch;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/database/sdkrealtime/DBTagQueriesImpl$GetBatchQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "limit", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/realtime/database/sdkrealtime/DBTagQueriesImpl;JLkotlin/jvm/functions/Function1;)V", "getLimit", "()J", "execute", "toString", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetBatchQuery<T> extends Query<T> {
        private final long limit;
        final /* synthetic */ DBTagQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetBatchQuery(DBTagQueriesImpl dBTagQueriesImpl, @NotNull long j, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBTagQueriesImpl.getGetBatch$me_oriient_sdk_realtime(), mapper);
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBTagQueriesImpl;
            this.limit = j;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-938695627, "SELECT * FROM DBTag WHERE status == 0 ORDER BY timestampMillis LIMIT ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl$GetBatchQuery$execute$1
                final /* synthetic */ DBTagQueriesImpl.GetBatchQuery<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SqlPreparedStatement) obj);
                    return Unit.f24250a;
                }

                public final void invoke(@NotNull SqlPreparedStatement executeQuery) {
                    Intrinsics.h(executeQuery, "$this$executeQuery");
                    executeQuery.c(1, Long.valueOf(this.this$0.getLimit()));
                }
            });
        }

        public final long getLimit() {
            return this.limit;
        }

        @NotNull
        public String toString() {
            return "DBTag.sq:getBatch";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBTagQueriesImpl(@NotNull TaggingSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getBatch = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    public void delete(final long timestampMillis) {
        this.driver.t1(-1110530916, "DELETE FROM DBTag WHERE timestampMillis == ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.delete.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SqlPreparedStatement) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull SqlPreparedStatement execute) {
                Intrinsics.h(execute, "$this$execute");
                execute.c(1, Long.valueOf(timestampMillis));
            }
        });
        notifyQueries(-1110530916, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.delete.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBTagQueriesImpl.this.database.getDBTagQueries().getGetBatch$me_oriient_sdk_realtime(), DBTagQueriesImpl.this.database.getDBTagQueries().getGetAll$me_oriient_sdk_realtime());
            }
        });
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function5<? super Long, ? super byte[], ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-1024439972, this.getAll, this.driver, "DBTag.sq", "getAll", "SELECT * FROM DBTag", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function5<Long, byte[], Long, Long, String, T> function5 = mapper;
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                byte[] bytes = cursor.getBytes(1);
                Intrinsics.e(bytes);
                Long l2 = cursor.getLong(2);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(3);
                Intrinsics.e(l3);
                return (T) function5.invoke(l, bytes, l2, l3, cursor.getString(4));
            }
        });
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    @NotNull
    public <T> Query<T> getBatch(long limit, @NotNull final Function5<? super Long, ? super byte[], ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return new GetBatchQuery(this, limit, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.getBatch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function5<Long, byte[], Long, Long, String, T> function5 = mapper;
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                byte[] bytes = cursor.getBytes(1);
                Intrinsics.e(bytes);
                Long l2 = cursor.getLong(2);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(3);
                Intrinsics.e(l3);
                return (T) function5.invoke(l, bytes, l2, l3, cursor.getString(4));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetAll$me_oriient_sdk_realtime() {
        return this.getAll;
    }

    @NotNull
    public final List<Query<?>> getGetBatch$me_oriient_sdk_realtime() {
        return this.getBatch;
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    public void upsert(final long timestampMillis, @NotNull final byte[] payload, final long status, final long retries, @Nullable final String spaceId) {
        Intrinsics.h(payload, "payload");
        this.driver.t1(-613468128, "INSERT OR REPLACE INTO DBTag(timestampMillis, payload, status, retries, spaceId)  VALUES (?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.upsert.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SqlPreparedStatement) obj);
                return Unit.f24250a;
            }

            public final void invoke(@NotNull SqlPreparedStatement execute) {
                Intrinsics.h(execute, "$this$execute");
                execute.c(1, Long.valueOf(timestampMillis));
                execute.e(2, payload);
                execute.c(3, Long.valueOf(status));
                execute.c(4, Long.valueOf(retries));
                execute.z(5, spaceId);
            }
        });
        notifyQueries(-613468128, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBTagQueriesImpl.this.database.getDBTagQueries().getGetBatch$me_oriient_sdk_realtime(), DBTagQueriesImpl.this.database.getDBTagQueries().getGetAll$me_oriient_sdk_realtime());
            }
        });
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    @NotNull
    public Query<DBTag> getBatch(long limit) {
        return getBatch(limit, new Function5<Long, byte[], Long, Long, String, DBTag>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.getBatch.2
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return invoke(((Number) obj).longValue(), (byte[]) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), (String) obj5);
            }

            @NotNull
            public final DBTag invoke(long j, @NotNull byte[] payload, long j2, long j3, @Nullable String str) {
                Intrinsics.h(payload, "payload");
                return new DBTag(j, payload, j2, j3, str);
            }
        });
    }

    @Override // me.oriient.ipssdk.realtime.database.tagging.DBTagQueries
    @NotNull
    public Query<DBTag> getAll() {
        return getAll(new Function5<Long, byte[], Long, Long, String, DBTag>() { // from class: me.oriient.ipssdk.realtime.database.sdkrealtime.DBTagQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return invoke(((Number) obj).longValue(), (byte[]) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), (String) obj5);
            }

            @NotNull
            public final DBTag invoke(long j, @NotNull byte[] payload, long j2, long j3, @Nullable String str) {
                Intrinsics.h(payload, "payload");
                return new DBTag(j, payload, j2, j3, str);
            }
        });
    }
}
