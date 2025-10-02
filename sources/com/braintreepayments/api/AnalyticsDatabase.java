package com.braintreepayments.api;

import androidx.room.Database;
import androidx.room.DeleteTable;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import kotlin.Metadata;

@Database
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "DeleteAnalyticsEventTableAutoMigration", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AnalyticsDatabase extends RoomDatabase {
    public static final Companion m = new Companion();
    public static volatile AnalyticsDatabase n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase$Companion;", "", "Lcom/braintreepayments/api/AnalyticsDatabase;", "INSTANCE", "Lcom/braintreepayments/api/AnalyticsDatabase;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    @DeleteTable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase$DeleteAnalyticsEventTableAutoMigration;", "Landroidx/room/migration/AutoMigrationSpec;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DeleteAnalyticsEventTableAutoMigration implements AutoMigrationSpec {
    }

    public abstract AnalyticsEventBlobDao t();
}
