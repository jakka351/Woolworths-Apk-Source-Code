package me.oriient.internal.services.cachedDataProvider;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25062a;
    public final /* synthetic */ HttpRequestBody b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, HttpRequestBody httpRequestBody) {
        super(1);
        this.f25062a = str;
        this.b = httpRequestBody;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningString = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningString, "$this$postReturningString");
        postReturningString.url(this.f25062a);
        postReturningString.body(this.b);
        return Unit.f24250a;
    }
}
