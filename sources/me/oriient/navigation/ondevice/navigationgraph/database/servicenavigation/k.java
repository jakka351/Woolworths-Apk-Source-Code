package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j) {
        super(1);
        this.f26342a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        Intrinsics.h(execute, "$this$execute");
        execute.c(1, Long.valueOf(this.f26342a));
        return Unit.f24250a;
    }
}
