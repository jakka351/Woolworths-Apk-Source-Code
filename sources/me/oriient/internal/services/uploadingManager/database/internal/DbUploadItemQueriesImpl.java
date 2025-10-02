package me.oriient.internal.services.uploadingManager.database.internal;

import YU.a;
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
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00040123B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u001b\u001a\u00020\u0019H\u0016JË\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00192¨\u0002\u0010\u001e\u001a£\u0002\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016JÓ\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192¨\u0002\u0010\u001e\u001a£\u0002\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016JË\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192¨\u0002\u0010\u001e\u001a£\u0002\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u0019H\u0016JÕ\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n\"\b\b\u0000\u0010\u001c*\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u00192¨\u0002\u0010\u001e\u001a£\u0002\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(,\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110#¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016Jz\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00192\b\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00192\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020#H\u0016R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u00064"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/uploadingManager/database/DbUploadItemQueries;", "database", "Lme/oriient/internal/services/uploadingManager/database/internal/UploadingSqlDatabaseImpl;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lme/oriient/internal/services/uploadingManager/database/internal/UploadingSqlDatabaseImpl;Lcom/squareup/sqldelight/db/SqlDriver;)V", "count", "", "Lcom/squareup/sqldelight/Query;", "getCount$internal_publishRelease", "()Ljava/util/List;", "getAllDataTypeItems", "getGetAllDataTypeItems$internal_publishRelease", "getAllSessionItems", "getGetAllSessionItems$internal_publishRelease", "getItem", "getGetItem$internal_publishRelease", "getItems", "getGetItems$internal_publishRelease", "", "deleteItem", "", "id", "", "Lme/oriient/internal/services/uploadingManager/database/DbUploadItem;", "dataType", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function13;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "sessionId", "", "isLast", "endReason", "uploadFilename", "uploadingStatus", "bytesCount", "stopTimeMillis", "compression", "", "metadata", "clientMetadata", "shouldBeUploaded", "upsertItem", "GetAllDataTypeItemsQuery", "GetAllSessionItemsQuery", "GetItemQuery", "GetItemsQuery", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DbUploadItemQueriesImpl extends TransacterImpl implements DbUploadItemQueries {

    @NotNull
    private final List<Query<?>> count;

    @NotNull
    private final UploadingSqlDatabaseImpl database;

    @NotNull
    private final SqlDriver driver;

    @NotNull
    private final List<Query<?>> getAllDataTypeItems;

    @NotNull
    private final List<Query<?>> getAllSessionItems;

    @NotNull
    private final List<Query<?>> getItem;

    @NotNull
    private final List<Query<?>> getItems;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl$GetAllDataTypeItemsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "dataType", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDataType", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetAllDataTypeItemsQuery<T> extends Query<T> {

        @NotNull
        private final String dataType;
        final /* synthetic */ DbUploadItemQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllDataTypeItemsQuery(@NotNull DbUploadItemQueriesImpl dbUploadItemQueriesImpl, @NotNull String dataType, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dbUploadItemQueriesImpl.getGetAllDataTypeItems$internal_publishRelease(), mapper);
            Intrinsics.h(dataType, "dataType");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dbUploadItemQueriesImpl;
            this.dataType = dataType;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1135268377, "SELECT * FROM DbUploadItem WHERE dataType = ?", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl$GetAllDataTypeItemsQuery$execute$1
                final /* synthetic */ DbUploadItemQueriesImpl.GetAllDataTypeItemsQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getDataType());
                }
            });
        }

        @NotNull
        public final String getDataType() {
            return this.dataType;
        }

        @NotNull
        public String toString() {
            return "DbUploadItem.sq:getAllDataTypeItems";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl$GetAllSessionItemsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "dataType", "", "sessionId", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDataType", "()Ljava/lang/String;", "getSessionId", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetAllSessionItemsQuery<T> extends Query<T> {

        @NotNull
        private final String dataType;

        @NotNull
        private final String sessionId;
        final /* synthetic */ DbUploadItemQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllSessionItemsQuery(@NotNull DbUploadItemQueriesImpl dbUploadItemQueriesImpl, @NotNull String dataType, @NotNull String sessionId, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dbUploadItemQueriesImpl.getGetAllSessionItems$internal_publishRelease(), mapper);
            Intrinsics.h(dataType, "dataType");
            Intrinsics.h(sessionId, "sessionId");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dbUploadItemQueriesImpl;
            this.dataType = dataType;
            this.sessionId = sessionId;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(-73619155, "SELECT * FROM DbUploadItem WHERE dataType = ? AND sessionId = ?", 2, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl$GetAllSessionItemsQuery$execute$1
                final /* synthetic */ DbUploadItemQueriesImpl.GetAllSessionItemsQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getDataType());
                    executeQuery.z(2, this.this$0.getSessionId());
                }
            });
        }

        @NotNull
        public final String getDataType() {
            return this.dataType;
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        public String toString() {
            return "DbUploadItem.sq:getAllSessionItems";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl$GetItemQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "id", "", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetItemQuery<T> extends Query<T> {

        @NotNull
        private final String id;
        final /* synthetic */ DbUploadItemQueriesImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetItemQuery(@NotNull DbUploadItemQueriesImpl dbUploadItemQueriesImpl, @NotNull String id, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dbUploadItemQueriesImpl.getGetItem$internal_publishRelease(), mapper);
            Intrinsics.h(id, "id");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dbUploadItemQueriesImpl;
            this.id = id;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(1592646193, "SELECT * FROM DbUploadItem WHERE id = ? LIMIT 1", 1, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl$GetItemQuery$execute$1
                final /* synthetic */ DbUploadItemQueriesImpl.GetItemQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getId());
                }
            });
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public String toString() {
            return "DbUploadItem.sq:getItem";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl$GetItemsQuery;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/squareup/sqldelight/Query;", "dataType", "", "uploadingStatus", "mapper", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/db/SqlCursor;", "(Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDataType", "()Ljava/lang/String;", "getUploadingStatus", "execute", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class GetItemsQuery<T> extends Query<T> {

        @NotNull
        private final String dataType;
        final /* synthetic */ DbUploadItemQueriesImpl this$0;

        @Nullable
        private final String uploadingStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetItemsQuery(@NotNull DbUploadItemQueriesImpl dbUploadItemQueriesImpl, @Nullable String dataType, @NotNull String str, Function1<? super SqlCursor, ? extends T> mapper) {
            super(dbUploadItemQueriesImpl.getGetItems$internal_publishRelease(), mapper);
            Intrinsics.h(dataType, "dataType");
            Intrinsics.h(mapper, "mapper");
            this.this$0 = dbUploadItemQueriesImpl;
            this.dataType = dataType;
            this.uploadingStatus = str;
        }

        @Override // com.squareup.sqldelight.Query
        @NotNull
        public SqlCursor execute() {
            return this.this$0.driver.s0(null, a.o(new StringBuilder("SELECT * FROM DbUploadItem WHERE dataType = ? AND uploadingStatus "), this.uploadingStatus == null ? "IS" : "=", " ?"), 2, new Function1<SqlPreparedStatement, Unit>(this) { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl$GetItemsQuery$execute$1
                final /* synthetic */ DbUploadItemQueriesImpl.GetItemsQuery<T> this$0;

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
                    executeQuery.z(1, this.this$0.getDataType());
                    executeQuery.z(2, this.this$0.getUploadingStatus());
                }
            });
        }

        @NotNull
        public final String getDataType() {
            return this.dataType;
        }

        @Nullable
        public final String getUploadingStatus() {
            return this.uploadingStatus;
        }

        @NotNull
        public String toString() {
            return "DbUploadItem.sq:getItems";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DbUploadItemQueriesImpl(@NotNull UploadingSqlDatabaseImpl database, @NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.database = database;
        this.driver = driver;
        this.getItem = new CopyOnWriteArrayList();
        this.getAllDataTypeItems = new CopyOnWriteArrayList();
        this.getAllSessionItems = new CopyOnWriteArrayList();
        this.getItems = new CopyOnWriteArrayList();
        this.count = new CopyOnWriteArrayList();
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public Query<Long> count() {
        return QueryKt.a(1102172599, this.count, this.driver, "DbUploadItem.sq", "count", "SELECT COUNT(*) FROM DbUploadItem", new Function1<SqlCursor, Long>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.count.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Long invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Long l = cursor.getLong(0);
                Intrinsics.e(l);
                return l;
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    public void deleteItem(@NotNull final String id) {
        Intrinsics.h(id, "id");
        this.driver.t1(-1369681994, "DELETE FROM DbUploadItem WHERE id = ?", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.deleteItem.1
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
            }
        });
        notifyQueries(-1369681994, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.deleteItem.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetItems$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetItem$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetAllDataTypeItems$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getCount$internal_publishRelease(), DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetAllSessionItems$internal_publishRelease()))));
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public <T> Query<T> getAllDataTypeItems(@NotNull String dataType, @NotNull final Function13<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? super byte[], ? super byte[], ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(mapper, "mapper");
        return new GetAllDataTypeItemsQuery(this, dataType, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getAllDataTypeItems.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, T> function13 = mapper;
                String string = cursor.getString(0);
                String strA = me.oriient.internal.services.dataManager.database.internal.a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                String string3 = cursor.getString(4);
                String string4 = cursor.getString(5);
                String string5 = cursor.getString(6);
                Long l2 = cursor.getLong(7);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(8);
                Intrinsics.e(l3);
                String string6 = cursor.getString(9);
                byte[] bytes = cursor.getBytes(10);
                Intrinsics.e(bytes);
                byte[] bytes2 = cursor.getBytes(11);
                Long l4 = cursor.getLong(12);
                Intrinsics.e(l4);
                return (T) function13.invoke(string, strA, string2, boolValueOf, string3, string4, string5, l2, l3, string6, bytes, bytes2, Boolean.valueOf(l4.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public <T> Query<T> getAllSessionItems(@NotNull String dataType, @NotNull String sessionId, @NotNull final Function13<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? super byte[], ? super byte[], ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(mapper, "mapper");
        return new GetAllSessionItemsQuery(this, dataType, sessionId, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getAllSessionItems.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, T> function13 = mapper;
                String string = cursor.getString(0);
                String strA = me.oriient.internal.services.dataManager.database.internal.a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                String string3 = cursor.getString(4);
                String string4 = cursor.getString(5);
                String string5 = cursor.getString(6);
                Long l2 = cursor.getLong(7);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(8);
                Intrinsics.e(l3);
                String string6 = cursor.getString(9);
                byte[] bytes = cursor.getBytes(10);
                Intrinsics.e(bytes);
                byte[] bytes2 = cursor.getBytes(11);
                Long l4 = cursor.getLong(12);
                Intrinsics.e(l4);
                return (T) function13.invoke(string, strA, string2, boolValueOf, string3, string4, string5, l2, l3, string6, bytes, bytes2, Boolean.valueOf(l4.longValue() == 1));
            }
        });
    }

    @NotNull
    public final List<Query<?>> getCount$internal_publishRelease() {
        return this.count;
    }

    @NotNull
    public final List<Query<?>> getGetAllDataTypeItems$internal_publishRelease() {
        return this.getAllDataTypeItems;
    }

    @NotNull
    public final List<Query<?>> getGetAllSessionItems$internal_publishRelease() {
        return this.getAllSessionItems;
    }

    @NotNull
    public final List<Query<?>> getGetItem$internal_publishRelease() {
        return this.getItem;
    }

    @NotNull
    public final List<Query<?>> getGetItems$internal_publishRelease() {
        return this.getItems;
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public <T> Query<T> getItem(@NotNull String id, @NotNull final Function13<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? super byte[], ? super byte[], ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(id, "id");
        Intrinsics.h(mapper, "mapper");
        return new GetItemQuery(this, id, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, T> function13 = mapper;
                String string = cursor.getString(0);
                String strA = me.oriient.internal.services.dataManager.database.internal.a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                String string3 = cursor.getString(4);
                String string4 = cursor.getString(5);
                String string5 = cursor.getString(6);
                Long l2 = cursor.getLong(7);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(8);
                Intrinsics.e(l3);
                String string6 = cursor.getString(9);
                byte[] bytes = cursor.getBytes(10);
                Intrinsics.e(bytes);
                byte[] bytes2 = cursor.getBytes(11);
                Long l4 = cursor.getLong(12);
                Intrinsics.e(l4);
                return (T) function13.invoke(string, strA, string2, boolValueOf, string3, string4, string5, l2, l3, string6, bytes, bytes2, Boolean.valueOf(l4.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public <T> Query<T> getItems(@NotNull String dataType, @Nullable String uploadingStatus, @NotNull final Function13<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super String, ? super byte[], ? super byte[], ? super Boolean, ? extends T> mapper) {
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(mapper, "mapper");
        return new GetItemsQuery(this, dataType, uploadingStatus, new Function1<SqlCursor, T>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getItems.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull SqlCursor cursor) {
                Intrinsics.h(cursor, "cursor");
                Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, T> function13 = mapper;
                String string = cursor.getString(0);
                String strA = me.oriient.internal.services.dataManager.database.internal.a.a(string, cursor, 1);
                String string2 = cursor.getString(2);
                Intrinsics.e(string2);
                Long l = cursor.getLong(3);
                Intrinsics.e(l);
                Boolean boolValueOf = Boolean.valueOf(l.longValue() == 1);
                String string3 = cursor.getString(4);
                String string4 = cursor.getString(5);
                String string5 = cursor.getString(6);
                Long l2 = cursor.getLong(7);
                Intrinsics.e(l2);
                Long l3 = cursor.getLong(8);
                Intrinsics.e(l3);
                String string6 = cursor.getString(9);
                byte[] bytes = cursor.getBytes(10);
                Intrinsics.e(bytes);
                byte[] bytes2 = cursor.getBytes(11);
                Long l4 = cursor.getLong(12);
                Intrinsics.e(l4);
                return (T) function13.invoke(string, strA, string2, boolValueOf, string3, string4, string5, l2, l3, string6, bytes, bytes2, Boolean.valueOf(l4.longValue() == 1));
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    public void upsertItem(@NotNull final String id, @NotNull final String sessionId, @NotNull final String dataType, final boolean isLast, @Nullable final String endReason, @Nullable final String uploadFilename, @Nullable final String uploadingStatus, final long bytesCount, final long stopTimeMillis, @Nullable final String compression, @NotNull final byte[] metadata, @Nullable final byte[] clientMetadata, final boolean shouldBeUploaded) {
        Intrinsics.h(id, "id");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(metadata, "metadata");
        this.driver.t1(448758074, "INSERT OR REPLACE INTO DbUploadItem(\n    id,\n    sessionId,\n    dataType,\n    isLast,\n    endReason,\n    uploadFilename,\n    uploadingStatus,\n    bytesCount,\n    stopTimeMillis,\n    compression,\n    metadata,\n    clientMetadata,\n    shouldBeUploaded\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1<SqlPreparedStatement, Unit>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.upsertItem.1
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
                execute.z(2, sessionId);
                execute.z(3, dataType);
                execute.c(4, Long.valueOf(isLast ? 1L : 0L));
                execute.z(5, endReason);
                execute.z(6, uploadFilename);
                execute.z(7, uploadingStatus);
                execute.c(8, Long.valueOf(bytesCount));
                execute.c(9, Long.valueOf(stopTimeMillis));
                execute.z(10, compression);
                execute.e(11, metadata);
                execute.e(12, clientMetadata);
                execute.c(13, Long.valueOf(shouldBeUploaded ? 1L : 0L));
            }
        });
        notifyQueries(448758074, new Function0<List<? extends Query<?>>>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.upsertItem.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Query<?>> invoke() {
                return CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetItems$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetItem$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetAllDataTypeItems$internal_publishRelease(), CollectionsKt.c0(DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getCount$internal_publishRelease(), DbUploadItemQueriesImpl.this.database.getDbUploadItemQueries().getGetAllSessionItems$internal_publishRelease()))));
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public Query<DbUploadItem> getAllDataTypeItems(@NotNull String dataType) {
        Intrinsics.h(dataType, "dataType");
        return getAllDataTypeItems(dataType, new Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, DbUploadItem>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getAllDataTypeItems.2
            @Override // kotlin.jvm.functions.Function13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6, (String) obj7, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10, (byte[]) obj11, (byte[]) obj12, ((Boolean) obj13).booleanValue());
            }

            @NotNull
            public final DbUploadItem invoke(@NotNull String id, @NotNull String sessionId, @NotNull String dataType_, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @NotNull byte[] metadata, @Nullable byte[] bArr, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(sessionId, "sessionId");
                Intrinsics.h(dataType_, "dataType_");
                Intrinsics.h(metadata, "metadata");
                return new DbUploadItem(id, sessionId, dataType_, z, str, str2, str3, j, j2, str4, metadata, bArr, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public Query<DbUploadItem> getAllSessionItems(@NotNull String dataType, @NotNull String sessionId) {
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(sessionId, "sessionId");
        return getAllSessionItems(dataType, sessionId, new Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, DbUploadItem>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getAllSessionItems.2
            @Override // kotlin.jvm.functions.Function13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6, (String) obj7, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10, (byte[]) obj11, (byte[]) obj12, ((Boolean) obj13).booleanValue());
            }

            @NotNull
            public final DbUploadItem invoke(@NotNull String id, @NotNull String sessionId_, @NotNull String dataType_, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @NotNull byte[] metadata, @Nullable byte[] bArr, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(sessionId_, "sessionId_");
                Intrinsics.h(dataType_, "dataType_");
                Intrinsics.h(metadata, "metadata");
                return new DbUploadItem(id, sessionId_, dataType_, z, str, str2, str3, j, j2, str4, metadata, bArr, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public Query<DbUploadItem> getItem(@NotNull String id) {
        Intrinsics.h(id, "id");
        return getItem(id, new Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, DbUploadItem>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getItem.2
            @Override // kotlin.jvm.functions.Function13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6, (String) obj7, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10, (byte[]) obj11, (byte[]) obj12, ((Boolean) obj13).booleanValue());
            }

            @NotNull
            public final DbUploadItem invoke(@NotNull String id_, @NotNull String sessionId, @NotNull String dataType, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @NotNull byte[] metadata, @Nullable byte[] bArr, boolean z2) {
                Intrinsics.h(id_, "id_");
                Intrinsics.h(sessionId, "sessionId");
                Intrinsics.h(dataType, "dataType");
                Intrinsics.h(metadata, "metadata");
                return new DbUploadItem(id_, sessionId, dataType, z, str, str2, str3, j, j2, str4, metadata, bArr, z2);
            }
        });
    }

    @Override // me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries
    @NotNull
    public Query<DbUploadItem> getItems(@NotNull String dataType, @Nullable String uploadingStatus) {
        Intrinsics.h(dataType, "dataType");
        return getItems(dataType, uploadingStatus, new Function13<String, String, String, Boolean, String, String, String, Long, Long, String, byte[], byte[], Boolean, DbUploadItem>() { // from class: me.oriient.internal.services.uploadingManager.database.internal.DbUploadItemQueriesImpl.getItems.2
            @Override // kotlin.jvm.functions.Function13
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                return invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6, (String) obj7, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10, (byte[]) obj11, (byte[]) obj12, ((Boolean) obj13).booleanValue());
            }

            @NotNull
            public final DbUploadItem invoke(@NotNull String id, @NotNull String sessionId, @NotNull String dataType_, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @NotNull byte[] metadata, @Nullable byte[] bArr, boolean z2) {
                Intrinsics.h(id, "id");
                Intrinsics.h(sessionId, "sessionId");
                Intrinsics.h(dataType_, "dataType_");
                Intrinsics.h(metadata, "metadata");
                return new DbUploadItem(id, sessionId, dataType_, z, str, str2, str3, j, j2, str4, metadata, bArr, z2);
            }
        });
    }
}
