package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.FileManager;

/* renamed from: me.oriient.navigation.ondevice.navgraph.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1804j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26314a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804j(v vVar, String str, String str2, String str3) {
        super(1);
        this.f26314a = vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        FileManager fileManager = this.f26314a.b;
        StringBuilder sb = new StringBuilder("/nav_graphs/");
        sb.append(this.b);
        sb.append('/');
        FileManager.DefaultImpls.deleteFiles$default(fileManager, androidx.camera.core.impl.b.r(sb, this.c, '/'), false, C1803i.f26313a, 2, null);
        ((me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) queries).a(this.b, this.c, this.d);
        return Unit.f24250a;
    }
}
