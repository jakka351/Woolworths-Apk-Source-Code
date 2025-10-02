package me.oriient.internal.services.auth.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25048a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2) {
        super(1);
        this.f25048a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningString = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningString, "$this$postReturningString");
        postReturningString.setUrl(this.f25048a);
        postReturningString.setBody$internal_publishRelease(new HttpRequestBody.String(JsonSerializationKt.serializeToJsonString(new LoginRequestBody(this.b))));
        return Unit.f24250a;
    }
}
