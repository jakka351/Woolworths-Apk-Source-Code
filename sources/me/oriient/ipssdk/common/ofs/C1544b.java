package me.oriient.ipssdk.common.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.infra.rest.RequestBuilder;

/* renamed from: me.oriient.ipssdk.common.ofs.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1544b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f25740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544b(Ref.ObjectRef objectRef) {
        super(1);
        this.f25740a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder getString = (RequestBuilder) obj;
        Intrinsics.h(getString, "$this$getString");
        getString.url((String) this.f25740a.d);
        return Unit.f24250a;
    }
}
