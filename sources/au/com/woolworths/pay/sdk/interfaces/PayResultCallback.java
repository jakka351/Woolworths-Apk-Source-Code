package au.com.woolworths.pay.sdk.interfaces;

import au.com.woolworths.pay.sdk.hooks.Retryable;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface PayResultCallback<T> extends Serializable {
    void A(Retryable retryable);

    void k0(Object obj);

    void v(PayError payError);
}
