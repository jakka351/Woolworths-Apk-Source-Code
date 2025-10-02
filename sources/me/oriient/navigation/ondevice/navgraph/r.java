package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;

/* loaded from: classes8.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me.oriient.navigation.ondevice.navigationgraph.database.a f26322a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(me.oriient.navigation.ondevice.navigationgraph.database.a aVar, String str, String str2, String str3) {
        super(1);
        this.f26322a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] it = (byte[]) obj;
        Intrinsics.h(it, "it");
        NavGraph navGraph = (NavGraph) ByteArrayExtensionsKt.toSerializableObject(it);
        return new NavGraphRecord(this.b, this.c, this.d, this.f26322a.e, navGraph);
    }
}
