package androidx.credentials.provider;

import android.content.pm.SigningInfo;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo;", "", "Companion", "SignatureVerifierApi28", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CallingAppInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f2534a;
    public final SigningInfo b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$Companion;", "", "", "TAG", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$SignatureVerifierApi28;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SignatureVerifierApi28 {
    }

    public CallingAppInfo(String str, SigningInfo signingInfo, String str2) {
        this.f2534a = str;
        this.b = signingInfo;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }
}
