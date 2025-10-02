package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f26332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f26332a = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
        Intrinsics.h(executeQuery, "$this$executeQuery");
        executeQuery.c(1, Long.valueOf(this.f26332a.f26333a));
        return Unit.f24250a;
    }
}
