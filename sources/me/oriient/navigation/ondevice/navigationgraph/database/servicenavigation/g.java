package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlCursor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f26338a = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor cursor = (SqlCursor) obj;
        Intrinsics.h(cursor, "cursor");
        h hVar = this.f26338a;
        String string = cursor.getString(0);
        Intrinsics.e(string);
        String string2 = cursor.getString(1);
        Intrinsics.e(string2);
        String string3 = cursor.getString(2);
        Intrinsics.e(string3);
        String string4 = cursor.getString(3);
        Intrinsics.e(string4);
        Long l = cursor.getLong(4);
        Intrinsics.e(l);
        Integer numValueOf = Integer.valueOf((int) l.longValue());
        String string5 = cursor.getString(5);
        Intrinsics.e(string5);
        Long l2 = cursor.getLong(6);
        Intrinsics.e(l2);
        return hVar.invoke(string, string2, string3, string4, numValueOf, string5, l2);
    }
}
