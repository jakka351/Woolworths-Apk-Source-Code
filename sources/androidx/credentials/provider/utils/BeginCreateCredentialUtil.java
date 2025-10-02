package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.BeginCreateCredentialRequest;
import androidx.credentials.provider.BeginCreateCustomCredentialRequest;
import androidx.credentials.provider.BeginCreatePasswordCredentialRequest;
import androidx.credentials.provider.BeginCreatePublicKeyCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.RemoteEntry;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil;", "", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginCreateCredentialUtil {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static BeginCreateCredentialResponse a(androidx.credentials.provider.BeginCreateCredentialResponse response) {
            Intrinsics.h(response, "response");
            BeginCreateCredentialResponse.Builder builderK = androidx.credentials.a.k();
            Iterator it = response.f2530a.iterator();
            while (it.hasNext()) {
                builderK.addCreateEntry(androidx.credentials.a.n(CreateEntry.Companion.a((CreateEntry) it.next())));
            }
            RemoteEntry remoteEntry = response.b;
            if (remoteEntry != null) {
                androidx.credentials.a.D();
                builderK.setRemoteCreateEntry(androidx.credentials.a.o(RemoteEntry.Companion.b(remoteEntry)));
            }
            BeginCreateCredentialResponse beginCreateCredentialResponseBuild = builderK.build();
            Intrinsics.g(beginCreateCredentialResponseBuild, "frameworkBuilder.build()");
            return beginCreateCredentialResponseBuild;
        }

        public static BeginCreateCredentialRequest b(android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest) throws FrameworkClassParsingException {
            CallingAppInfo callingAppInfo;
            CallingAppInfo callingAppInfo2;
            CallingAppInfo callingAppInfo3;
            CallingAppInfo callingAppInfo4 = null;
            try {
                String type = beginCreateCredentialRequest.getType();
                int iHashCode = type.hashCode();
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        Bundle data = beginCreateCredentialRequest.getData();
                        Intrinsics.g(data, "request.data");
                        android.service.credentials.CallingAppInfo callingAppInfo5 = beginCreateCredentialRequest.getCallingAppInfo();
                        if (callingAppInfo5 != null) {
                            String packageName = callingAppInfo5.getPackageName();
                            Intrinsics.g(packageName, "it.packageName");
                            SigningInfo signingInfo = callingAppInfo5.getSigningInfo();
                            Intrinsics.g(signingInfo, "it.signingInfo");
                            callingAppInfo3 = new CallingAppInfo(packageName, signingInfo, callingAppInfo5.getOrigin());
                        } else {
                            callingAppInfo3 = null;
                        }
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                            Intrinsics.e(string);
                            BeginCreatePublicKeyCredentialRequest beginCreatePublicKeyCredentialRequest = new BeginCreatePublicKeyCredentialRequest("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data, callingAppInfo3);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    data.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", string);
                                    return beginCreatePublicKeyCredentialRequest;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    Bundle data2 = beginCreateCredentialRequest.getData();
                    Intrinsics.g(data2, "request.data");
                    android.service.credentials.CallingAppInfo callingAppInfo6 = beginCreateCredentialRequest.getCallingAppInfo();
                    if (callingAppInfo6 != null) {
                        String packageName2 = callingAppInfo6.getPackageName();
                        Intrinsics.g(packageName2, "it.packageName");
                        SigningInfo signingInfo2 = callingAppInfo6.getSigningInfo();
                        Intrinsics.g(signingInfo2, "it.signingInfo");
                        callingAppInfo = new CallingAppInfo(packageName2, signingInfo2, callingAppInfo6.getOrigin());
                    } else {
                        callingAppInfo = null;
                    }
                    try {
                        return new BeginCreatePasswordCredentialRequest("android.credentials.TYPE_PASSWORD_CREDENTIAL", data2, callingAppInfo);
                    } catch (Exception unused3) {
                        throw new FrameworkClassParsingException();
                    }
                }
                String type2 = beginCreateCredentialRequest.getType();
                Intrinsics.g(type2, "request.type");
                Bundle data3 = beginCreateCredentialRequest.getData();
                Intrinsics.g(data3, "request.data");
                android.service.credentials.CallingAppInfo callingAppInfo7 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo7 != null) {
                    String packageName3 = callingAppInfo7.getPackageName();
                    Intrinsics.g(packageName3, "it.packageName");
                    SigningInfo signingInfo3 = callingAppInfo7.getSigningInfo();
                    Intrinsics.g(signingInfo3, "it.signingInfo");
                    callingAppInfo2 = new CallingAppInfo(packageName3, signingInfo3, callingAppInfo7.getOrigin());
                } else {
                    callingAppInfo2 = null;
                }
                return new BeginCreateCustomCredentialRequest(type2, data3, callingAppInfo2);
            } catch (FrameworkClassParsingException unused4) {
                String type3 = beginCreateCredentialRequest.getType();
                Intrinsics.g(type3, "request.type");
                Bundle data4 = beginCreateCredentialRequest.getData();
                Intrinsics.g(data4, "request.data");
                android.service.credentials.CallingAppInfo callingAppInfo8 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo8 != null) {
                    String packageName4 = callingAppInfo8.getPackageName();
                    Intrinsics.g(packageName4, "it.packageName");
                    SigningInfo signingInfo4 = callingAppInfo8.getSigningInfo();
                    Intrinsics.g(signingInfo4, "it.signingInfo");
                    callingAppInfo4 = new CallingAppInfo(packageName4, signingInfo4, callingAppInfo8.getOrigin());
                }
                return new BeginCreateCustomCredentialRequest(type3, data4, callingAppInfo4);
            }
        }
    }
}
