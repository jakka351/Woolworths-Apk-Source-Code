package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1338i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1348t f25251a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338i(C1348t c1348t, String str, String str2, String str3) {
        super(1);
        this.f25251a = c1348t;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        FileManager fileManager = this.f25251a.c;
        StringBuilder sb = new StringBuilder("/maps/");
        sb.append(this.b);
        sb.append('/');
        FileManager.DefaultImpls.deleteFiles$default(fileManager, me.oriient.internal.infra.rest.e.a(sb, this.c, '/'), false, C1337h.f25250a, 2, null);
        queries.removeObstacles(this.b, this.c, this.d);
        return Unit.f24250a;
    }
}
