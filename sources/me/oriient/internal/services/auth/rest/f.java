package me.oriient.internal.services.auth.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
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
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25047a = new f();

    public f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws ParsingError {
        Object next;
        HttpResponse.StringResponse stringResponse = (HttpResponse.StringResponse) obj;
        Intrinsics.h(stringResponse, "stringResponse");
        LoginResponse loginResponse = (LoginResponse) JsonSerializationKt.parseAsJson(stringResponse.getString(), Reflection.b(LoginResponse.class));
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
        if (httpCookie == null) {
            throw new ParsingError("refreshTokenCookie");
        }
        boolean zE = loginResponse.getF25041a();
        V v = new V(new W(loginResponse.getB(), loginResponse.getC()), new W(httpCookie.getRawCookie(), httpCookie.getExpiresAtMillis()));
        List listD = loginResponse.getD();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listD, 10));
        Iterator it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SpaceResponse) it2.next()).a());
        }
        return new l(zE, v, arrayList);
    }
}
