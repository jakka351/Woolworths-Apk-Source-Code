package me.oriient.internal.services.remoteLog.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J»\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u001d\u001a\u00020\u0005H&JX\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000526\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002H\u000b0\u001eH&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\u0006\u0010\u001f\u001a\u00020\u000fH&Jm\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000f2K\u0010\r\u001aG\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002H\u000b0\"H&J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0017\u001a\u00020\u0005H&JÃ\u0001\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00052 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J»\u0001\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J»\u0001\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J»\u0001\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J»\u0001\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b\"\b\b\u0000\u0010\u000b*\u00020\f2 \u0001\u0010\r\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H\u000b0\u000eH&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH&J\u0016\u0010+\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0-H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000fH&J\u0016\u0010/\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050-H&J@\u00101\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H&J \u00102\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u000fH&¨\u00063"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabaseQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearBatches", "", "timeToDelete", "", "clearMessages", "countMessages", "Lcom/squareup/sqldelight/Query;", "getBatches", "Lme/oriient/internal/services/remoteLog/database/RemoteLogBatchConfigTable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "url", "time", "", "retries", "timeToSend", "", "requireCharger", "allowMeteredNetworks", "getLastMessagesShort", "Lme/oriient/internal/services/remoteLog/database/GetLastMessagesShort;", "amount", "Lkotlin/Function2;", "batchId", "getMessagesForBatch", "Lme/oriient/internal/services/remoteLog/database/RemoteLogMessagesTable;", "Lkotlin/Function3;", "", "message", "getPassedTimeBatches", "getScheduledBatches", "getScheduledMeteredBatches", "getScheduledNotChargerBatches", "getScheduledNotChargerMeteredBatches", "removeBatchConfig", "removeBatchConfigsWithoutMessages", "ids", "", "removeBatchMessages", "removeMessages", "msgTimes", "upsertBatchConfig", "upsertMessage", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RemoteLogDatabaseQueries extends Transacter {
    void clearBatches(long timeToDelete);

    void clearMessages(long timeToDelete);

    @NotNull
    Query<Long> countMessages();

    @NotNull
    Query<RemoteLogBatchConfigTable> getBatches();

    @NotNull
    <T> Query<T> getBatches(@NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    @NotNull
    Query<GetLastMessagesShort> getLastMessagesShort(long amount);

    @NotNull
    <T> Query<T> getLastMessagesShort(long amount, @NotNull Function2<? super Long, ? super String, ? extends T> mapper);

    @NotNull
    Query<RemoteLogMessagesTable> getMessagesForBatch(@NotNull String batchId);

    @NotNull
    <T> Query<T> getMessagesForBatch(@NotNull String batchId, @NotNull Function3<? super Long, ? super byte[], ? super String, ? extends T> mapper);

    @NotNull
    Query<RemoteLogBatchConfigTable> getPassedTimeBatches(long timeToSend);

    @NotNull
    <T> Query<T> getPassedTimeBatches(long timeToSend, @NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    @NotNull
    Query<RemoteLogBatchConfigTable> getScheduledBatches();

    @NotNull
    <T> Query<T> getScheduledBatches(@NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    @NotNull
    Query<RemoteLogBatchConfigTable> getScheduledMeteredBatches();

    @NotNull
    <T> Query<T> getScheduledMeteredBatches(@NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    @NotNull
    Query<RemoteLogBatchConfigTable> getScheduledNotChargerBatches();

    @NotNull
    <T> Query<T> getScheduledNotChargerBatches(@NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    @NotNull
    Query<RemoteLogBatchConfigTable> getScheduledNotChargerMeteredBatches();

    @NotNull
    <T> Query<T> getScheduledNotChargerMeteredBatches(@NotNull Function7<? super String, ? super String, ? super Long, ? super Integer, ? super Long, ? super Boolean, ? super Boolean, ? extends T> mapper);

    void removeBatchConfig(@NotNull String id);

    void removeBatchConfigsWithoutMessages(@NotNull Collection<String> ids);

    void removeBatchMessages(@NotNull String batchId);

    void removeMessages(@NotNull Collection<Long> msgTimes);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertBatchConfig(@NotNull String id, @NotNull String url, long time, int retries, long timeToSend, boolean requireCharger, boolean allowMeteredNetworks);

    void upsertMessage(long time, @NotNull byte[] message, @NotNull String batchId);
}
