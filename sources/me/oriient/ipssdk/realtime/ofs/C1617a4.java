package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.utils.models.TriggerEvent;

/* renamed from: me.oriient.ipssdk.realtime.ofs.a4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1617a4 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1617a4 f26043a = new C1617a4();

    public C1617a4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TriggerEvent it = (TriggerEvent) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.getType() == 2);
    }
}
