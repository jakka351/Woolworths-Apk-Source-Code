package au.com.woolworths.pay.internal.network;

import au.com.woolworths.pay.sdk.interfaces.PayError;

/* loaded from: classes4.dex */
public interface APICallback<T> {
    void a();

    void b(PayError payError);

    void c(APIResponse aPIResponse);
}
