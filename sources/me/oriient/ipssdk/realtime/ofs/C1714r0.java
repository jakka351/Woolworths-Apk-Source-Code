package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.api.models.IPSFloorImageData;

/* renamed from: me.oriient.ipssdk.realtime.ofs.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1714r0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSListener f26136a;
    public final /* synthetic */ IPSFloorImageData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714r0(IPSListener iPSListener, IPSFloorImageData iPSFloorImageData) {
        super(1);
        this.f26136a = iPSListener;
        this.b = iPSFloorImageData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit it = (Unit) obj;
        Intrinsics.h(it, "it");
        this.f26136a.onSuccess(this.b);
        return Unit.f24250a;
    }
}
