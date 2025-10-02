package au.com.woolworths.pay.sdk.hooks;

import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;

/* loaded from: classes4.dex */
public class Retryable {

    /* renamed from: a, reason: collision with root package name */
    public BaseAPIService f9190a;
    public AccessTokenManager b;
    public PayResultCallback c;

    public final void a(String str) {
        this.b.f9177a = str;
        this.f9190a.a(this.c);
    }
}
