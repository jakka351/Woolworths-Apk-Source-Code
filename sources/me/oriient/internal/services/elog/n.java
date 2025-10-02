package me.oriient.internal.services.elog;

import java.net.URL;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.RequestBuilder;
import me.oriient.internal.infra.utils.core.OriientError;

/* loaded from: classes7.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f25449a;
    public final /* synthetic */ RequestBuilder b;
    public final /* synthetic */ int c;
    public final /* synthetic */ OriientError d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(URL url, RequestBuilder requestBuilder, int i, OriientError oriientError) {
        super(0);
        this.f25449a = url;
        this.b = requestBuilder;
        this.c = i;
        this.d = oriientError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("baseUrl", this.f25449a.getProtocol() + "://" + this.f25449a.getHost()), new Pair("absoluteUrl", this.b.getUrl()), new Pair("method", this.b.getMethodForLogs()), new Pair("responseCode", Integer.valueOf(this.c)), new Pair("errorMessage", this.d.getMessage()));
    }
}
