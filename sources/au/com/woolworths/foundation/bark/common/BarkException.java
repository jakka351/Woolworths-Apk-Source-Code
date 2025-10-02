package au.com.woolworths.foundation.bark.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalBarkApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/bark/common/BarkException;", "", "Companion", "common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BarkException extends Throwable {
    public static final /* synthetic */ int e = 0;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/bark/common/BarkException$Companion;", "", "common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static BarkException a(String message, String str) {
            Intrinsics.h(message, "message");
            return new BarkCollectTemp(message, str, null);
        }

        public static BarkException b(String str, Throwable throwable) {
            Intrinsics.h(throwable, "throwable");
            return new BarkCollectTemp(str, null, throwable);
        }

        public static BarkException c(String message, String str) {
            Intrinsics.h(message, "message");
            return new BarkError(message, str, null);
        }

        public static BarkException d(String str, String str2, Throwable throwable) {
            Intrinsics.h(throwable, "throwable");
            return new BarkError(str, str2, throwable);
        }
    }

    public BarkException(String str, String str2, Throwable th) {
        super(str, th);
        this.d = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
