package me.oriient.internal.services.uploadingManager.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderItem f25647a;
    public final /* synthetic */ DataUploaderRestImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataUploaderItem dataUploaderItem, DataUploaderRestImpl dataUploaderRestImpl) {
        super(1);
        this.f25647a = dataUploaderItem;
        this.b = dataUploaderRestImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningUnit = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningUnit, "$this$postReturningUnit");
        postReturningUnit.setUrl(this.f25647a.getMetadata().getUploadingUrl() + "/api/upload/v1/end-chunk?" + this.b.applyQueryParams(this.f25647a));
        postReturningUnit.setBody$internal_publishRelease(new HttpRequestBody.String(JsonSerializationKt.serializeToJsonString(new EndChunkRequestBody(this.f25647a))));
        return Unit.f24250a;
    }
}
