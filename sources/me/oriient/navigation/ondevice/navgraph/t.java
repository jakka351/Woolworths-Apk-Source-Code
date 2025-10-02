package me.oriient.navigation.ondevice.navgraph;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes8.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26324a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, String str, String str2, String str3) {
        super(1);
        this.f26324a = vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File fileOrNull;
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        me.oriient.navigation.ondevice.navigationgraph.database.a aVar = (me.oriient.navigation.ondevice.navigationgraph.database.a) queries.transactionWithResult(false, new s(queries, this.b, this.c, this.d, this.f26324a));
        if (aVar != null && (fileOrNull = this.f26324a.b.getFileOrNull(aVar.f)) != null) {
            return this.f26324a.b.readFile(fileOrNull).mapFailure(C1811q.f26321a).map(new r(aVar, this.b, this.c, this.d));
        }
        return new Outcome.Success(null);
    }
}
