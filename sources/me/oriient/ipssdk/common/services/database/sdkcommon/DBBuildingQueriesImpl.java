package me.oriient.ipssdk.common.services.database.sdkcommon;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.QueryKt;
import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import com.squareup.sqldelight.db.SqlPreparedStatement;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.services.database.DBBuilding;
import me.oriient.ipssdk.common.services.database.DBBuildingQueries;
import me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016JÐ\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00120\n\"\b\b\u0000\u0010\u0012*\u00020\u00132µ\u0002\u0010\u0014\u001a°\u0002\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010$\u001a\u00020\u0016H\u0016JØ\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00120\n\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010$\u001a\u00020\u00162µ\u0002\u0010\u0014\u001a°\u0002\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160'H\u0016JÞ\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00120\n\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160'2µ\u0002\u0010\u0014\u001a°\u0002\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(&\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016J\b\u0010(\u001a\u00020)H\u0016Jz\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006-"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/DBBuildingQueries;", "database", "Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "getAll", "", "Lcom/squareup/sqldelight/Query;", "getGetAll$me_oriient_sdk_common", "()Ljava/util/List;", "getAllForSpace", "getGetAllForSpace$me_oriient_sdk_common", "getWithIds", "getGetWithIds$me_oriient_sdk_common", "Lme/oriient/ipssdk/common/services/database/DBBuilding;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function14;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "", "rotation", h.a.b, h.a.c, "altitude", "geofence_latitude", "geofence_longitude", "geofence_altitude", "geofenceRadius", "primaryFloorId", "spaceId", "clientBuildingId", "displayName", "", "removeAll", "", "upsert", "GetAllForSpaceQuery", "GetWithIdsQuery", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DBBuildingQueriesImpl extends TransacterImpl implements DBBuildingQueries {

    @NotNull
    private final IpsCommonDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAll;

    @NotNull
    private final List<Query<?>> getAllForSpace;

    @NotNull
    private final List<Query<?>> getWithIds;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl$GetAllForSpaceQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "spaceId", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getSpaceId", "()Ljava/lang/String;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetAllForSpaceQuery<T> extends Query<T> {

        @NotNull
        private final String spaceId;
        final /* synthetic */ DBBuildingQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllForSpaceQuery(@NotNull DBBuildingQueriesImpl dBBuildingQueriesImpl, @NotNull String spaceId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBBuildingQueriesImpl.getGetAllForSpace$me_oriient_sdk_common(), mapper);
            Intrinsics.h(spaceId, "spaceId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBBuildingQueriesImpl;
            this.spaceId = spaceId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-1901442986, "SELECT * FROM DBBuilding WHERE spaceId LIKE ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl$GetAllForSpaceQuery$execute$1
                final /* synthetic */ DBBuildingQueriesImpl.GetAllForSpaceQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getSpaceId());
                }
            });
        }

        @NotNull
        public final String getSpaceId() {
            return this.spaceId;
        }

        @NotNull
        public String toString() {
            return "DBBuilding.sq:getAllForSpace";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl$GetWithIdsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "id", "", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/util/Collection;", "execute", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetWithIdsQuery<T> extends Query<T> {

        @NotNull
        private final Collection<String> id;
        final /* synthetic */ DBBuildingQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetWithIdsQuery(@NotNull DBBuildingQueriesImpl dBBuildingQueriesImpl, @NotNull Collection<String> id, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dBBuildingQueriesImpl.getGetWithIds$me_oriient_sdk_common(), mapper);
            Intrinsics.h(id, "id");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dBBuildingQueriesImpl;
            this.id = id;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(null, YU.a.A("SELECT * FROM DBBuilding WHERE id IN ", this.this$0.createArguments(this.id.size())), this.id.size(), new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl$GetWithIdsQuery$execute$1
                final /* synthetic */ DBBuildingQueriesImpl.GetWithIdsQuery<T> this$0;

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
                    int i = 0;
                    for (Object obj : this.this$0.getId()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        executeQuery.z(i2, (String) obj);
                        i = i2;
                    }
                }
            });
        }

        @NotNull
        public final Collection<String> getId() {
            return this.id;
        }

        @NotNull
        public String toString() {
            return "DBBuilding.sq:getWithIds";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBBuildingQueriesImpl(@NotNull IpsCommonDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getWithIds = new CopyOnWriteArrayList();
        this.getAll = new CopyOnWriteArrayList();
        this.getAllForSpace = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public <T> Query<T> getAll(@NotNull final Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        Intrinsics.h(mapper, "mapper");
        return QueryKt.a(-1800379527, this.getAll, this.driver, "DBBuilding.sq", "getAll", "SELECT * FROM DBBuilding", new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, T> function14 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Double d = cursor.getDouble(2);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 3);
                Double d2 = cursor.getDouble(4);
                Double dC2 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 5);
                Double d3 = cursor.getDouble(6);
                Double dC3 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d3, cursor, 7);
                Double d4 = cursor.getDouble(8);
                Double dC4 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d4, cursor, 9);
                String string2 = cursor.getString(10);
                String strA2 = a.a(string2, cursor, 11);
                String string3 = cursor.getString(12);
                String string4 = cursor.getString(13);
                Intrinsics.e(string4);
                return (T) function14.invoke(string, strA, d, dC, d2, dC2, d3, dC3, d4, dC4, string2, strA2, string3, string4);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public <T> Query<T> getAllForSpace(@NotNull String spaceId, @NotNull final Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(mapper, "mapper");
        return new GetAllForSpaceQuery(this, spaceId, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getAllForSpace.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, T> function14 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Double d = cursor.getDouble(2);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 3);
                Double d2 = cursor.getDouble(4);
                Double dC2 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 5);
                Double d3 = cursor.getDouble(6);
                Double dC3 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d3, cursor, 7);
                Double d4 = cursor.getDouble(8);
                Double dC4 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d4, cursor, 9);
                String string2 = cursor.getString(10);
                String strA2 = a.a(string2, cursor, 11);
                String string3 = cursor.getString(12);
                String string4 = cursor.getString(13);
                Intrinsics.e(string4);
                return (T) function14.invoke(string, strA, d, dC, d2, dC2, d3, dC3, d4, dC4, string2, strA2, string3, string4);
            }
        });
    }

    @NotNull
    public final List<Query<?>> getGetAll$me_oriient_sdk_common() {
        return this.getAll;
    }

    @NotNull
    public final List<Query<?>> getGetAllForSpace$me_oriient_sdk_common() {
        return this.getAllForSpace;
    }

    @NotNull
    public final List<Query<?>> getGetWithIds$me_oriient_sdk_common() {
        return this.getWithIds;
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public <T> Query<T> getWithIds(@NotNull Collection<String> id, @NotNull final Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        Intrinsics.h(id, "id");
        Intrinsics.h(mapper, "mapper");
        return new GetWithIdsQuery(this, id, new Function1<SqlCursor, T>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getWithIds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, T> function14 = mapper;
                String string = cursor.getString(0);
                String strA = a.a(string, cursor, 1);
                Double d = cursor.getDouble(2);
                Double dC = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d, cursor, 3);
                Double d2 = cursor.getDouble(4);
                Double dC2 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d2, cursor, 5);
                Double d3 = cursor.getDouble(6);
                Double dC3 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d3, cursor, 7);
                Double d4 = cursor.getDouble(8);
                Double dC4 = kotlin.reflect.jvm.internal.impl.types.checker.a.c(d4, cursor, 9);
                String string2 = cursor.getString(10);
                String strA2 = a.a(string2, cursor, 11);
                String string3 = cursor.getString(12);
                String string4 = cursor.getString(13);
                Intrinsics.e(string4);
                return (T) function14.invoke(string, strA, d, dC, d2, dC2, d3, dC3, d4, dC4, string2, strA2, string3, string4);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    public void removeAll() {
        this.driver.t1(1446416047, "DELETE FROM DBBuilding", null);
        notifyQueries(1446416047, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.removeAll.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetWithIds$me_oriient_sdk_common(), CollectionsKt.c0(DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetAll$me_oriient_sdk_common(), DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetAllForSpace$me_oriient_sdk_common()));
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    public void upsert(@NotNull final String id, @NotNull final String name, final double rotation, final double latitude, final double longitude, final double altitude, final double geofence_latitude, final double geofence_longitude, final double geofence_altitude, final double geofenceRadius, @NotNull final String primaryFloorId, @NotNull final String spaceId, @Nullable final String clientBuildingId, @NotNull final String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(displayName, "displayName");
        this.driver.t1(-1389407683, "INSERT OR REPLACE INTO DBBuilding(id, name, rotation, latitude, longitude, altitude, geofence_latitude, geofence_longitude, geofence_altitude, geofenceRadius, primaryFloorId, spaceId, clientBuildingId, displayName) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.upsert.1
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
                execute.z(1, id);
                execute.z(2, name);
                execute.b(3, Double.valueOf(rotation));
                execute.b(4, Double.valueOf(latitude));
                execute.b(5, Double.valueOf(longitude));
                execute.b(6, Double.valueOf(altitude));
                execute.b(7, Double.valueOf(geofence_latitude));
                execute.b(8, Double.valueOf(geofence_longitude));
                execute.b(9, Double.valueOf(geofence_altitude));
                execute.b(10, Double.valueOf(geofenceRadius));
                execute.z(11, primaryFloorId);
                execute.z(12, spaceId);
                execute.z(13, clientBuildingId);
                execute.z(14, displayName);
            }
        });
        notifyQueries(-1389407683, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.upsert.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetWithIds$me_oriient_sdk_common(), CollectionsKt.c0(DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetAll$me_oriient_sdk_common(), DBBuildingQueriesImpl.this.database.getDBBuildingQueries().getGetAllForSpace$me_oriient_sdk_common()));
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public Query<DBBuilding> getAllForSpace(@NotNull String spaceId) {
        Intrinsics.h(spaceId, "spaceId");
        return getAllForSpace(spaceId, new Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, DBBuilding>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getAllForSpace.2
            @Override // kotlin.jvm.functions.Function14
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).doubleValue(), ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue(), ((Number) obj8).doubleValue(), ((Number) obj9).doubleValue(), ((Number) obj10).doubleValue(), (String) obj11, (String) obj12, (String) obj13, (String) obj14);
            }

            @NotNull
            public final DBBuilding invoke(@NotNull String id, @NotNull String name, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NotNull String primaryFloorId, @NotNull String spaceId_, @Nullable String str, @NotNull String displayName) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(primaryFloorId, "primaryFloorId");
                Intrinsics.h(spaceId_, "spaceId_");
                Intrinsics.h(displayName, "displayName");
                return new DBBuilding(id, name, d, d2, d3, d4, d5, d6, d7, d8, primaryFloorId, spaceId_, str, displayName);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public Query<DBBuilding> getWithIds(@NotNull Collection<String> id) {
        Intrinsics.h(id, "id");
        return getWithIds(id, new Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, DBBuilding>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getWithIds.2
            @Override // kotlin.jvm.functions.Function14
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).doubleValue(), ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue(), ((Number) obj8).doubleValue(), ((Number) obj9).doubleValue(), ((Number) obj10).doubleValue(), (String) obj11, (String) obj12, (String) obj13, (String) obj14);
            }

            @NotNull
            public final DBBuilding invoke(@NotNull String id_, @NotNull String name, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NotNull String primaryFloorId, @NotNull String spaceId, @Nullable String str, @NotNull String displayName) {
                Intrinsics.h(id_, "id_");
                Intrinsics.h(name, "name");
                Intrinsics.h(primaryFloorId, "primaryFloorId");
                Intrinsics.h(spaceId, "spaceId");
                Intrinsics.h(displayName, "displayName");
                return new DBBuilding(id_, name, d, d2, d3, d4, d5, d6, d7, d8, primaryFloorId, spaceId, str, displayName);
            }
        });
    }

    @Override // me.oriient.ipssdk.common.services.database.DBBuildingQueries
    @NotNull
    public Query<DBBuilding> getAll() {
        return getAll(new Function14<String, String, Double, Double, Double, Double, Double, Double, Double, Double, String, String, String, String, DBBuilding>() { // from class: me.oriient.ipssdk.common.services.database.sdkcommon.DBBuildingQueriesImpl.getAll.2
            @Override // kotlin.jvm.functions.Function14
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                return invoke((String) obj, (String) obj2, ((Number) obj3).doubleValue(), ((Number) obj4).doubleValue(), ((Number) obj5).doubleValue(), ((Number) obj6).doubleValue(), ((Number) obj7).doubleValue(), ((Number) obj8).doubleValue(), ((Number) obj9).doubleValue(), ((Number) obj10).doubleValue(), (String) obj11, (String) obj12, (String) obj13, (String) obj14);
            }

            @NotNull
            public final DBBuilding invoke(@NotNull String id, @NotNull String name, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, @NotNull String primaryFloorId, @NotNull String spaceId, @Nullable String str, @NotNull String displayName) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(primaryFloorId, "primaryFloorId");
                Intrinsics.h(spaceId, "spaceId");
                Intrinsics.h(displayName, "displayName");
                return new DBBuilding(id, name, d, d2, d3, d4, d5, d6, d7, d8, primaryFloorId, spaceId, str, displayName);
            }
        });
    }
}
