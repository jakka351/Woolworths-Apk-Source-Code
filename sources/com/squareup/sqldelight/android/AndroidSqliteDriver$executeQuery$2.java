package com.squareup.sqldelight.android;

import com.squareup.sqldelight.db.SqlCursor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AndroidSqliteDriver$executeQuery$2 extends FunctionReferenceImpl implements Function1<AndroidStatement, SqlCursor> {
    public static final AndroidSqliteDriver$executeQuery$2 d = new AndroidSqliteDriver$executeQuery$2(1, AndroidStatement.class, "executeQuery", "executeQuery()Lcom/squareup/sqldelight/db/SqlCursor;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AndroidStatement p0 = (AndroidStatement) obj;
        Intrinsics.h(p0, "p0");
        return p0.executeQuery();
    }
}
