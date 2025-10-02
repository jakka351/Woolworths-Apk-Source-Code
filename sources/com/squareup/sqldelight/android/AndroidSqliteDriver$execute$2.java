package com.squareup.sqldelight.android;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AndroidSqliteDriver$execute$2 extends FunctionReferenceImpl implements Function1<AndroidStatement, Unit> {
    public static final AndroidSqliteDriver$execute$2 d = new AndroidSqliteDriver$execute$2(1, AndroidStatement.class, "execute", "execute()V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AndroidStatement p0 = (AndroidStatement) obj;
        Intrinsics.h(p0, "p0");
        p0.execute();
        return Unit.f24250a;
    }
}
