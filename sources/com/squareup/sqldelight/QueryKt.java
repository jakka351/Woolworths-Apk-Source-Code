package com.squareup.sqldelight;

import com.squareup.sqldelight.db.SqlDriver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryKt {
    public static final Query a(int i, List queries, SqlDriver driver, String str, String str2, String str3, Function1 mapper) {
        Intrinsics.h(queries, "queries");
        Intrinsics.h(driver, "driver");
        Intrinsics.h(mapper, "mapper");
        return new SimpleQuery(i, queries, driver, str, str2, str3, mapper);
    }
}
