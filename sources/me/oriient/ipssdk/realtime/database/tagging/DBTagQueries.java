package me.oriient.ipssdk.realtime.database.tagging;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0091\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2w\u0010\u000b\u001as\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0099\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052w\u0010\u000b\u001as\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u0002H\t0\fH&J2\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/realtime/database/tagging/DBTagQueries;", "Lcom/squareup/sqldelight/Transacter;", "delete", "", "timestampMillis", "", "getAll", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/ipssdk/realtime/database/tagging/DBTag;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function5;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "payload", "status", "retries", "", "spaceId", "getBatch", "limit", "upsert", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DBTagQueries extends Transacter {
    void delete(long timestampMillis);

    @NotNull
    Query<DBTag> getAll();

    @NotNull
    <T> Query<T> getAll(@NotNull Function5<? super Long, ? super byte[], ? super Long, ? super Long, ? super String, ? extends T> mapper);

    @NotNull
    Query<DBTag> getBatch(long limit);

    @NotNull
    <T> Query<T> getBatch(long limit, @NotNull Function5<? super Long, ? super byte[], ? super Long, ? super Long, ? super String, ? extends T> mapper);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsert(long timestampMillis, @NotNull byte[] payload, long status, long retries, @Nullable String spaceId);
}
