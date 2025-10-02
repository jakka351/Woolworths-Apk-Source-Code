package com.adobe.marketing.mobile.internal.eventhub.history;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.adobe.marketing.mobile.internal.util.FileUtils;
import com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistoryDatabase;", "Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistoryDatabase;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEventHistoryDatabase implements EventHistoryDatabase {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13191a = new Object();
    public final File b;
    public SQLiteDatabase c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistoryDatabase$Companion;", "", "", "COLUMN_HASH", "Ljava/lang/String;", "COLUMN_TIMESTAMP", "DATABASE_NAME", "DATABASE_NAME_1X", "LOG_TAG", "QUERY_COUNT", "", "QUERY_COUNT_INDEX", "I", "QUERY_NEWEST", "QUERY_NEWEST_INDEX", "QUERY_OLDEST", "QUERY_OLDEST_INDEX", "TABLE_NAME", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public AndroidEventHistoryDatabase() throws EventHistoryDatabaseCreationException {
        File fileC;
        ServiceProvider.a().getClass();
        Context contextA = App.f13247a.a();
        if (contextA == null) {
            throw new EventHistoryDatabaseCreationException("Failed to create/open database com.adobe.module.core.eventhistory, error message: ApplicationContext is null");
        }
        File databasePath = contextA.getDatabasePath("com.adobe.module.core.eventhistory");
        if (!databasePath.exists() && (fileC = ServiceProvider.a().f13238a.c()) != null) {
            try {
                File file = new File(fileC, "EventHistory");
                if (file.exists()) {
                    FileUtils.a(file, databasePath);
                    Log.a();
                }
            } catch (Exception unused) {
                Log.a();
            }
        }
        this.b = databasePath;
        synchronized (this.f13191a) {
            if (!SQLiteDatabaseHelper.b(databasePath.getPath(), "CREATE TABLE IF NOT EXISTS Events (eventHash INTEGER, timestamp INTEGER);")) {
                throw new EventHistoryDatabaseCreationException("An error occurred while creating the Events table in the Android Event History database.");
            }
        }
    }

    public final void a() {
        SQLiteDatabaseHelper.a(this.c);
        this.c = null;
    }
}
