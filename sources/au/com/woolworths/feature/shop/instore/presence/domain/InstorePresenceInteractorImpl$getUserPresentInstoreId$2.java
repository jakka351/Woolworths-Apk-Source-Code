package au.com.woolworths.feature.shop.instore.presence.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InstorePresenceInteractorImpl$getUserPresentInstoreId$2 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        ((InstorePresenceInteractorImpl) this.receiver).getClass();
        return Boolean.valueOf(!(str == null || StringsKt.D(str)));
    }
}
