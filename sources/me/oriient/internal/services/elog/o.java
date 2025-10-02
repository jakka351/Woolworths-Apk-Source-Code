package me.oriient.internal.services.elog;

import java.net.URL;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes7.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f25450a;
    public final /* synthetic */ RequestBuilder b;
    public final /* synthetic */ HttpResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(URL url, RequestBuilder requestBuilder, HttpResponse httpResponse) {
        super(0);
        this.f25450a = url;
        this.b = requestBuilder;
        this.c = httpResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("baseUrl", this.f25450a.getProtocol() + "://" + this.f25450a.getHost()), new Pair("absoluteUrl", this.b.getUrl()), new Pair("method", this.b.getMethodForLogs()), new Pair("responseCode", Integer.valueOf(this.c.getCode())), new Pair("responseBodySize", Integer.valueOf(this.c.getContentSize())));
    }
}
