package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSError;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OriientErrorKt {
    public static final OriientError a(IPSError iPSError) {
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.u), "IPSError = " + iPSError.getCode() + ", message = " + iPSError.getMessage(), null, 12);
        int recoveryStrategy = iPSError.getRecoveryStrategy();
        if (recoveryStrategy == 0 || recoveryStrategy != 1) {
            OriientErrorRecoveryStrategy[] oriientErrorRecoveryStrategyArr = OriientErrorRecoveryStrategy.d;
        } else {
            OriientErrorRecoveryStrategy[] oriientErrorRecoveryStrategyArr2 = OriientErrorRecoveryStrategy.d;
        }
        int code = iPSError.getCode();
        if (code == 9) {
            return new OriientError.MissingSensors();
        }
        if (code == 12) {
            String message = iPSError.getMessage();
            Intrinsics.g(message, "getMessage(...)");
            return new OriientError.NotInStore(message);
        }
        if (code == 13) {
            return new OriientError.NoBarometerInMultiFloorBuilding("Error: Your device does not have the pressure sensor so you can not use the positioning in a multi-floor building");
        }
        iPSError.getCode();
        String message2 = iPSError.getMessage();
        Intrinsics.g(message2, "getMessage(...)");
        return new OriientError.SdkError(message2);
    }
}
