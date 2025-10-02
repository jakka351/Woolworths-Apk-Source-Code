package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(1);
        this.f26340a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        Intrinsics.h(execute, "$this$execute");
        execute.z(1, this.f26340a);
        return Unit.f24250a;
    }
}
