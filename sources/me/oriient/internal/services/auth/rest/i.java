package me.oriient.internal.services.auth.rest;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.rest.HttpCookie;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.services.auth.V;
import me.oriient.internal.services.auth.W;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f25050a = new i();

    public i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws ParsingError {
        Object next;
        HttpResponse.StringResponse stringResponse = (HttpResponse.StringResponse) obj;
        Intrinsics.h(stringResponse, "stringResponse");
        RefreshJwtResponse refreshJwtResponse = (RefreshJwtResponse) JsonSerializationKt.parseAsJson(stringResponse.getString(), Reflection.b(RefreshJwtResponse.class));
        Iterator<T> it = stringResponse.getCookies().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((HttpCookie) next).getName(), "refreshToken")) {
                break;
            }
        }
        HttpCookie httpCookie = (HttpCookie) next;
        if (httpCookie != null) {
            return new V(new W(refreshJwtResponse.getF25042a(), refreshJwtResponse.getB()), new W(httpCookie.getRawCookie(), httpCookie.getExpiresAtMillis()));
        }
        throw new ParsingError("refreshTokenCookie");
    }
}
