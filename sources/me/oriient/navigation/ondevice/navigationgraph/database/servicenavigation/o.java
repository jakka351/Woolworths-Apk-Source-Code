package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26346a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j, String str, String str2, String str3) {
        super(1);
        this.f26346a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        Intrinsics.h(execute, "$this$execute");
        execute.c(1, Long.valueOf(this.f26346a));
        execute.z(2, this.b);
        execute.z(3, this.c);
        execute.z(4, this.d);
        return Unit.f24250a;
    }
}
