package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;

/* loaded from: classes8.dex */
public final class O extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContentRestServiceImpl f25984a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(ContentRestServiceImpl contentRestServiceImpl, String str, String str2, String str3) {
        super(1);
        this.f25984a = contentRestServiceImpl;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder getString = (RequestBuilder) obj;
        Intrinsics.h(getString, "$this$getString");
        getString.url(ContentRestServiceImpl.access$getOriientApiProvider(this.f25984a).getOriientApi().getApiUrl() + "/v5/buildings/" + this.b + "/regions?spaceId=" + this.c + "&userSessionId=" + this.d + "&regionUseMapPresentation=true");
        return Unit.f24250a;
    }
}
