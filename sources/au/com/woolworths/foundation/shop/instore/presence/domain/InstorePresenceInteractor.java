package au.com.woolworths.foundation.shop.instore.presence.domain;

import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/domain/InstorePresenceInteractor;", "", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InstorePresenceInteractor {
    void a(boolean z);

    boolean b();

    void c();

    void d();

    boolean e();

    Object f(ContinuationImpl continuationImpl);

    void g(InstorePresencePrompt instorePresencePrompt);

    void h(InstorePresencePrompt instorePresencePrompt);

    void i(InstorePresencePrompt instorePresencePrompt);

    Object j(ContinuationImpl continuationImpl);
}
