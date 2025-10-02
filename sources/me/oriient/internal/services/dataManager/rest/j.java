package me.oriient.internal.services.dataManager.rest;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpContent;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PostRequestBuilder;

/* loaded from: classes7.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25408a;
    public final /* synthetic */ HttpRequestBody b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, HttpRequestBody httpRequestBody, boolean z, boolean z2) {
        super(1);
        this.f25408a = str;
        this.b = httpRequestBody;
        this.c = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostRequestBuilder invoke = (PostRequestBuilder) obj;
        Intrinsics.h(invoke, "$this$invoke");
        invoke.setUrl(this.f25408a);
        invoke.setBody$internal_publishRelease(this.b);
        invoke.setPrintResponseBodyToLog(this.c);
        if (this.d) {
            invoke.setContentType(HttpContent.CONTENT_NONE);
        }
        return Unit.f24250a;
    }
}
