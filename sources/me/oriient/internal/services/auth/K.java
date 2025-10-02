package me.oriient.internal.services.auth;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.PostRequestBuilder;

/* loaded from: classes7.dex */
public final class K extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25018a;
    public final /* synthetic */ AuthenticatedRestServiceImpl b;
    public final /* synthetic */ Credentials c;
    public final /* synthetic */ V d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Function1 function1, AuthenticatedRestServiceImpl authenticatedRestServiceImpl, Credentials credentials, V v) {
        super(1);
        this.f25018a = function1;
        this.b = authenticatedRestServiceImpl;
        this.c = credentials;
        this.d = v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder invoke = (PostRequestBuilder) obj;
        Intrinsics.h(invoke, "$this$invoke");
        this.f25018a.invoke(invoke);
        this.b.addAuth(invoke, this.c, this.d);
        return Unit.f24250a;
    }
}
