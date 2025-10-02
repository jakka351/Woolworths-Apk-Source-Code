package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl;

/* loaded from: classes8.dex */
public final class B2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapsRestServiceImpl f25915a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ User d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(MapsRestServiceImpl mapsRestServiceImpl, String str, String str2, User user, String str3) {
        super(1);
        this.f25915a = mapsRestServiceImpl;
        this.b = str;
        this.c = str2;
        this.d = user;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RequestBuilder getString = (RequestBuilder) obj;
        Intrinsics.h(getString, "$this$getString");
        getString.url(MapsRestServiceImpl.access$getOriientApiProvider(this.f25915a).getOriientApi().getApiUrl() + "/v5/buildings/" + this.b + "/floors/" + this.c + "/all-map-entities?spaceId=" + this.d.getSpace().getId() + "&userSessionId=" + this.e + "&regionUseTriggers=true");
        return Unit.f24250a;
    }
}
