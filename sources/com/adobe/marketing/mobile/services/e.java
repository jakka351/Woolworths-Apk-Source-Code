package com.adobe.marketing.mobile.services;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import com.adobe.marketing.mobile.internal.util.DatabaseProcessing;
import com.adobe.marketing.mobile.services.ServiceProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements DatabaseProcessing {
    @Override // com.adobe.marketing.mobile.internal.util.DatabaseProcessing
    public final boolean a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM TB_AEP_DATA_ENTITY WHERE id in (SELECT id from TB_AEP_DATA_ENTITY order by id ASC limit 1)");
            try {
                int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                String.format("remove n - Removed %d DataEntities", Integer.valueOf(iExecuteUpdateDelete));
                Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                boolean z = iExecuteUpdateDelete > -1;
                sQLiteStatementCompileStatement.close();
                return z;
            } finally {
            }
        } catch (SQLiteException e) {
            e.getMessage();
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        }
    }
}
