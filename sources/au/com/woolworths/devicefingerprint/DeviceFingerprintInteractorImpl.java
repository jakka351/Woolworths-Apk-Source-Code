package au.com.woolworths.devicefingerprint;

import android.app.Application;
import au.com.woolworths.android.onesite.devicefingerprint.DeviceFingerprintConfigData;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.lexisnexisrisk.threatmetrix.rl.TMXConfig;
import com.lexisnexisrisk.threatmetrix.rl.TMXEndNotifier;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfiling;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingHandle;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingOptions;
import com.lexisnexisrisk.threatmetrix.rl.TMXStatusCode;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.TMXProfilingConnections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractorImpl;", "Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractor;", "Companion", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeviceFingerprintInteractorImpl implements DeviceFingerprintInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DeviceFingerprintConfigData f5171a;
    public final Application b;
    public boolean c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/devicefingerprint/DeviceFingerprintInteractorImpl$Companion;", "", "", "TIMEOUT_SECONDS", "I", "RETRY_COUNT", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DeviceFingerprintInteractorImpl(DeviceFingerprintConfigData configData, Application application) {
        Intrinsics.h(configData, "configData");
        this.f5171a = configData;
        this.b = application;
    }

    @Override // au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor
    public final void a() {
        if (this.c) {
            return;
        }
        TMXConfig tMXConfig = new TMXConfig();
        DeviceFingerprintConfigData deviceFingerprintConfigData = this.f5171a;
        tMXConfig.setOrgId(deviceFingerprintConfigData.f4246a).setFPServer(deviceFingerprintConfigData.b);
        tMXConfig.setContext(this.b.getApplicationContext());
        TMXProfilingConnections tMXProfilingConnections = new TMXProfilingConnections();
        tMXProfilingConnections.setConnectionTimeout(10, TimeUnit.SECONDS);
        tMXProfilingConnections.setRetryTimes(3);
        tMXConfig.setProfilingConnections(tMXProfilingConnections);
        try {
            TMXProfiling.getInstance().init(tMXConfig);
            this.c = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.p), "[dfp] init error: " + e, null);
        } catch (IllegalArgumentException e2) {
            Bark.Companion companion2 = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.p), "[dfp] init error: " + e2, null);
        } catch (IllegalStateException e3) {
            Bark.Companion companion3 = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.p), "[dfp] init error: " + e3, null);
        }
    }

    @Override // au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor
    public final Object b(final String str, String str2, ContinuationImpl continuationImpl) {
        TMXProfilingOptions sessionID = new TMXProfilingOptions().setCustomAttributes(null).setSessionID(str + str2);
        Intrinsics.g(sessionID, "setSessionID(...)");
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.o();
        if (this.c) {
            TMXProfiling.getInstance().profile(sessionID, new TMXEndNotifier() { // from class: au.com.woolworths.devicefingerprint.DeviceFingerprintInteractorImpl$doProfileWithSessionId$2$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f5173a;

                    static {
                        int[] iArr = new int[TMXStatusCode.values().length];
                        try {
                            iArr[TMXStatusCode.TMX_OK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f5173a = iArr;
                    }
                }

                @Override // com.lexisnexisrisk.threatmetrix.rl.TMXEndNotifier
                public final void complete(TMXProfilingHandle.Result result) {
                    TMXStatusCode status = result != null ? result.getStatus() : null;
                    int i = status == null ? -1 : WhenMappings.f5173a[status.ordinal()];
                    CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    if (i != 1) {
                        cancellableContinuationImpl2.resumeWith(new DeviceFingerprintInteractor.ProfileResult.Failure(status != null ? status.toString() : null));
                        return;
                    }
                    String sessionID2 = result.getSessionID();
                    Intrinsics.g(sessionID2, "getSessionID(...)");
                    cancellableContinuationImpl2.resumeWith(new DeviceFingerprintInteractor.ProfileResult.Success(StringsKt.L(str, sessionID2)));
                }
            });
        } else {
            cancellableContinuationImpl.resumeWith(new DeviceFingerprintInteractor.ProfileResult.Failure("DFP profiler not initialised"));
        }
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
