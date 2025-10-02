package me.oriient.internal.services.remoteLog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpContent;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me.oriient.internal.services.remoteLog.models.a f25525a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(me.oriient.internal.services.remoteLog.models.a aVar, String str) {
        super(1);
        this.f25525a = aVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder postReturningUnit = (PostRequestBuilder) obj;
        Intrinsics.h(postReturningUnit, "$this$postReturningUnit");
        postReturningUnit.setContentType(HttpContent.CONTENT_APPLICATION_JSON);
        postReturningUnit.url(this.f25525a.b);
        postReturningUnit.body(new HttpRequestBody.String(this.b));
        postReturningUnit.setShouldReportRequest(false);
        return Unit.f24250a;
    }
}
