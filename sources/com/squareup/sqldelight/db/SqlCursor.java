package com.squareup.sqldelight.db;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/sqldelight/db/SqlCursor;", "Ljava/io/Closeable;", "Lcom/squareup/sqldelight/db/Closeable;", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface SqlCursor extends Closeable {
    byte[] getBytes(int i);

    Double getDouble(int i);

    Long getLong(int i);

    String getString(int i);

    boolean next();
}
