package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f26334a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
        Intrinsics.h(executeQuery, "$this$executeQuery");
        executeQuery.z(1, this.f26334a.f26335a);
        executeQuery.z(2, this.f26334a.b);
        executeQuery.z(3, this.f26334a.c);
        return Unit.f24250a;
    }
}
