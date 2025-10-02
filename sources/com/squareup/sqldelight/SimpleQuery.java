package com.squareup.sqldelight;

import com.squareup.sqldelight.db.SqlCursor;
import com.squareup.sqldelight.db.SqlDriver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/sqldelight/SimpleQuery;", "", "RowType", "Lcom/squareup/sqldelight/Query;", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class SimpleQuery<RowType> extends Query<RowType> {
    public final int e;
    public final SqlDriver f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleQuery(int i, List queries, SqlDriver driver, String str, String str2, String str3, Function1 mapper) {
        super(queries, mapper);
        Intrinsics.h(queries, "queries");
        Intrinsics.h(driver, "driver");
        Intrinsics.h(mapper, "mapper");
        this.e = i;
        this.f = driver;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }

    @Override // com.squareup.sqldelight.Query
    public final SqlCursor execute() {
        return this.f.s0(Integer.valueOf(this.e), this.i, 0, null);
    }

    public final String toString() {
        return this.g + ':' + this.h;
    }
}
