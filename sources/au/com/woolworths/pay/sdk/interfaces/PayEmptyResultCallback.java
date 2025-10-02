package au.com.woolworths.pay.sdk.interfaces;

import au.com.woolworths.pay.sdk.hooks.Retryable;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface PayEmptyResultCallback extends Serializable {
    void A(Retryable retryable);

    void d2();

    void v(PayError payError);
}
