package com.squareup.sqldelight.android;

import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/android/AndroidStatement;", "Lcom/squareup/sqldelight/db/SqlPreparedStatement;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface AndroidStatement extends SqlPreparedStatement {
    void close();

    void execute();

    SqlCursor executeQuery();
}
