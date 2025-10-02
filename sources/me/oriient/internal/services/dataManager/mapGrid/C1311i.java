package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1311i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1321t f25214a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311i(C1321t c1321t, String str, String str2, String str3, String str4) {
        super(1);
        this.f25214a = c1321t;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        FileManager.DefaultImpls.deleteFiles$default(this.f25214a.c, "/maps/" + this.b + '/' + this.c + '/' + this.d, false, C1310h.f25213a, 2, null);
        queries.removeMapGrid(this.b, this.c, this.d, this.e);
        return Unit.f24250a;
    }
}
