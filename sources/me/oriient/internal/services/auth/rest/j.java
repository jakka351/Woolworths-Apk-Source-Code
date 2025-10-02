package me.oriient.internal.services.auth.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.services.auth.V;

/* loaded from: classes7.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25051a;
    public final /* synthetic */ V b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, V v) {
        super(1);
        this.f25051a = str;
        this.b = v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningString = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningString, "$this$postReturningString");
        postReturningString.setUrl(this.f25051a);
        postReturningString.setBody$internal_publishRelease(null);
        postReturningString.header("Cookie", this.b.b.f25022a);
        return Unit.f24250a;
    }
}
