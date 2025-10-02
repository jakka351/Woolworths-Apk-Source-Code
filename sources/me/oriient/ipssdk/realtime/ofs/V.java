package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes8.dex */
public final class V extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f26018a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Ref.ObjectRef objectRef) {
        super(1);
        this.f26018a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder getString = (RequestBuilder) obj;
        Intrinsics.h(getString, "$this$getString");
        getString.url((String) this.f26018a.d);
        return Unit.f24250a;
    }
}
