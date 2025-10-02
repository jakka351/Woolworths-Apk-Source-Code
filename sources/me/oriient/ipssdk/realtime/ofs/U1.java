package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.ipssdk.realtime.services.tag.model.TagRequest;

/* loaded from: classes8.dex */
public final class U1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26015a;
    public final /* synthetic */ TagRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(String str, TagRequest tagRequest) {
        super(1);
        this.f26015a = str;
        this.b = tagRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningUnit = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningUnit, "$this$postReturningUnit");
        postReturningUnit.url(this.f26015a);
        postReturningUnit.body(new HttpRequestBody.String(JsonSerializationKt.serializeToJsonString(this.b)));
        return Unit.f24250a;
    }
}
