package com.squareup.sqldelight.db;

import com.squareup.sqldelight.Transacter;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/sqldelight/db/SqlDriver;", "Ljava/io/Closeable;", "Lcom/squareup/sqldelight/db/Closeable;", "Schema", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface SqlDriver extends Closeable {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Schema {
        void create(SqlDriver sqlDriver);

        int getVersion();

        void migrate(SqlDriver sqlDriver, int i, int i2);
    }

    Transacter.Transaction L1();

    SqlCursor s0(Integer num, String str, int i, Function1 function1);

    void t1(Integer num, String str, Function1 function1);

    Transacter.Transaction x0();
}
