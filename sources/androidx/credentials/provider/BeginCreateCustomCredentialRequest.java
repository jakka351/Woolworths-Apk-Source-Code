package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginCreateCustomCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class BeginCreateCustomCredentialRequest extends BeginCreateCredentialRequest {
    public BeginCreateCustomCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        super(str, bundle, callingAppInfo);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
