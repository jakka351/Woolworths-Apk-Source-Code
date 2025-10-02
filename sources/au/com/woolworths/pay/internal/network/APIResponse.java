package au.com.woolworths.pay.internal.network;

import java.util.Map;

/* loaded from: classes4.dex */
public class APIResponse<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f9180a;
    public final Map b;
    public final Object c;
    public final APIError d;

    public APIResponse(int i, Map map, Object obj, APIError aPIError) {
        this.f9180a = i;
        this.b = map;
        this.c = obj;
        this.d = aPIError;
    }
}
