package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes8.dex */
public final class L extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str) {
        super(1);
        this.f25966a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder getString = (RequestBuilder) obj;
        Intrinsics.h(getString, "$this$getString");
        getString.url(this.f25966a);
        return Unit.f24250a;
    }
}
