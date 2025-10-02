package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26344a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, String str3) {
        super(1);
        this.f26344a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlPreparedStatement execute = (SqlPreparedStatement) obj;
        Intrinsics.h(execute, "$this$execute");
        execute.z(1, this.f26344a);
        execute.z(2, this.b);
        execute.z(3, this.c);
        return Unit.f24250a;
    }
}
