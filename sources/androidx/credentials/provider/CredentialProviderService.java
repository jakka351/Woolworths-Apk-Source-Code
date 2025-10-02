package androidx.credentials.provider;

import android.content.pm.SigningInfo;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) throws FrameworkClassParsingException {
        Intrinsics.h(request, "request");
        Intrinsics.h(cancellationSignal, "cancellationSignal");
        Intrinsics.h(callback, "callback");
        BeginCreateCredentialUtil.Companion.b(request);
        a();
    }

    public final void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) throws FrameworkClassParsingException {
        Intrinsics.h(request, "request");
        Intrinsics.h(cancellationSignal, "cancellationSignal");
        Intrinsics.h(callback, "callback");
        BeginGetCredentialUtil.Companion.b(request);
        b();
    }

    public final void onClearCredentialState(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) {
        Intrinsics.h(request, "request");
        Intrinsics.h(cancellationSignal, "cancellationSignal");
        Intrinsics.h(callback, "callback");
        String packageName = request.getCallingAppInfo().getPackageName();
        Intrinsics.g(packageName, "request.callingAppInfo.packageName");
        SigningInfo signingInfo = request.getCallingAppInfo().getSigningInfo();
        Intrinsics.g(signingInfo, "request.callingAppInfo.signingInfo");
        new CallingAppInfo(packageName, signingInfo, request.getCallingAppInfo().getOrigin());
        c();
    }
}
