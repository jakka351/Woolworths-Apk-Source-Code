package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26348a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, String str3, int i, String str4, long j) {
        super(1);
        this.f26348a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        Intrinsics.h(execute, "$this$execute");
        execute.z(1, this.f26348a);
        execute.z(2, this.b);
        execute.z(3, this.c);
        execute.c(4, Long.valueOf(this.d));
        execute.z(5, this.e);
        execute.c(6, Long.valueOf(this.f));
        return Unit.f24250a;
    }
}
