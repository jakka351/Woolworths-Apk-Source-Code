package me.oriient.internal.services.dataManager.obstacles;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.ObstaclesQueries;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1347s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25261a;
    public final /* synthetic */ C1348t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347s(w wVar, C1348t c1348t) {
        super(1);
        this.f25261a = wVar;
        this.b = c1348t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        ObstaclesQueries queries = (ObstaclesQueries) obj;
        Intrinsics.h(queries, "queries");
        byte[] byteArray = ByteArrayExtensionsKt.toByteArray(this.f25261a.d);
        StringBuilder sb = new StringBuilder("/maps/");
        sb.append(this.f25261a.b);
        sb.append('/');
        String strO = YU.a.o(sb, this.f25261a.c, "/obstacles");
        this.b.c.writeFile(this.b.c.getOrCreateFile(strO), byteArray);
        w wVar = this.f25261a;
        queries.upsertObstacles(wVar.b, wVar.c, wVar.f25264a, wVar.d.getMapVersion(), strO, ((TimeProvider) this.b.e.getD()).getCurrentTimeMillis());
        return Unit.f24250a;
    }
}
