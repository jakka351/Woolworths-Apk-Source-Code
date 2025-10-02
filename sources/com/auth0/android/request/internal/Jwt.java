package com.auth0.android.request.internal;

import android.util.Base64;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/request/internal/Jwt;", "", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Jwt {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13687a;
    public final Map b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Date k;
    public final Date l;
    public final String m;
    public final Date n;
    public final List o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/internal/Jwt$Companion;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public Jwt(String str) throws IOException {
        String[] strArr = (String[]) StringsKt.T(str, new String[]{"."}, 6).toArray(new String[0]);
        if (strArr.length == 2 && StringsKt.v(str, ".", false)) {
            strArr = new String[]{strArr[0], strArr[1], ""};
        }
        if (strArr.length != 3) {
            throw new IllegalArgumentException(String.format("The token was expected to have 3 parts, but got %s.", Arrays.copyOf(new Object[]{Integer.valueOf(strArr.length)}, 1)));
        }
        this.c = strArr;
        String encoded = strArr[0];
        Intrinsics.h(encoded, "encoded");
        byte[] bArrDecode = Base64.decode(encoded, 11);
        Intrinsics.g(bArrDecode, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
        Charset charset = Charsets.f24671a;
        String str2 = new String(bArrDecode, charset);
        String encoded2 = strArr[1];
        Intrinsics.h(encoded2, "encoded");
        byte[] bArrDecode2 = Base64.decode(encoded2, 11);
        Intrinsics.g(bArrDecode2, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
        String str3 = new String(bArrDecode2, charset);
        TypeAdapter typeAdapterG = GsonProvider.f13685a.g(new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.Jwt$mapAdapter$1
        });
        Object objFromJson = typeAdapterG.fromJson(str2);
        Intrinsics.g(objFromJson, "mapAdapter.fromJson(jsonHeader)");
        Map map = (Map) objFromJson;
        this.f13687a = map;
        Object objFromJson2 = typeAdapterG.fromJson(str3);
        Intrinsics.g(objFromJson2, "mapAdapter.fromJson(jsonPayload)");
        Map map2 = (Map) objFromJson2;
        this.b = map2;
        Object obj = map.get(JwsHeader.ALGORITHM);
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.String");
        this.d = (String) obj;
        this.e = (String) map.get(JwsHeader.KEY_ID);
        this.f = (String) map2.get(Claims.SUBJECT);
        this.g = (String) map2.get(Claims.ISSUER);
        this.h = (String) map2.get("nonce");
        this.i = (String) map2.get("org_id");
        this.j = (String) map2.get("org_name");
        Object obj2 = map2.get(Claims.ISSUED_AT);
        Double d = obj2 instanceof Double ? (Double) obj2 : null;
        this.k = d != null ? new Date(((long) d.doubleValue()) * 1000) : null;
        Object obj3 = map2.get(Claims.EXPIRATION);
        Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
        this.l = d2 != null ? new Date(((long) d2.doubleValue()) * 1000) : null;
        this.m = (String) map2.get("azp");
        Object obj4 = map2.get("auth_time");
        Double d3 = obj4 instanceof Double ? (Double) obj4 : null;
        this.n = d3 != null ? new Date(((long) d3.doubleValue()) * 1000) : null;
        Object obj5 = map2.get(Claims.AUDIENCE);
        this.o = obj5 instanceof String ? CollectionsKt.Q(obj5) : obj5 instanceof List ? (List) obj5 : EmptyList.d;
    }
}
