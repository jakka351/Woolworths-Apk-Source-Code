package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/AkamaiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AkamaiException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkamaiException(String message) {
        super(message);
        Intrinsics.h(message, "message");
    }
}
