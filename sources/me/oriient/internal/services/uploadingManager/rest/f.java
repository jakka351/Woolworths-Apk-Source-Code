package me.oriient.internal.services.uploadingManager.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderItem f25650a;
    public final /* synthetic */ DataUploaderRestImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DataUploaderItem dataUploaderItem, DataUploaderRestImpl dataUploaderRestImpl) {
        super(1);
        this.f25650a = dataUploaderItem;
        this.b = dataUploaderRestImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        PostRequestBuilder postReturningString = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningString, "$this$postReturningString");
        postReturningString.setUrl(this.f25650a.getMetadata().getUploadingUrl() + "/api/upload/v1/start-chunk?" + this.b.applyQueryParams(this.f25650a));
        k kVar = new k(this.f25650a, this.b.sdkType, this.b.getTimeProvider(), this.b.getOsData(), this.b.getBuildData());
        this.b.getLogger().d("DataUploaderRest", "sendStartChunk: body - " + kVar);
        try {
            postReturningString.body(new HttpRequestBody.String(JsonSerializationKt.serializeToJsonString(JsonHelpersKt.toJsonableMap(kVar.f25655a).toJsonElement())));
            return Unit.f24250a;
        } catch (Exception e) {
            this.b.getLogger().e("DataUploaderRest", "failed to strigify body", e);
            throw e;
        }
    }
}
