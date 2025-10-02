package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper;

/* loaded from: classes8.dex */
public final class R3 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f26001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(List list) {
        super(1);
        this.f26001a = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocalProximityEventWrapper it = (LocalProximityEventWrapper) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(CollectionsKt.t(this.f26001a, it.getEvent().getGroupId()));
    }
}
