package androidx.credentials.provider;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.a;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "Api34Impl", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BeginCreateCredentialRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f2529a;
    public final Bundle b;
    public final CallingAppInfo c;

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api34Impl;", "", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "request", "", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialRequest;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull Bundle bundle, @NotNull BeginCreateCredentialRequest request) {
            android.service.credentials.CallingAppInfo callingAppInfoM;
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(request, "request");
            CallingAppInfo callingAppInfo = request.c;
            if (callingAppInfo != null) {
                a.B();
                callingAppInfoM = a.m(callingAppInfo.f2534a, callingAppInfo.b, callingAppInfo.c);
            } else {
                callingAppInfoM = null;
            }
            a.C();
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", a.j(request.f2529a, request.b, callingAppInfoM));
        }

        @JvmStatic
        @DoNotInline
        @Nullable
        public static final BeginCreateCredentialRequest b(@NotNull Bundle bundle) {
            Intrinsics.h(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return BeginCreateCredentialUtil.Companion.b(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public BeginCreateCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        this.f2529a = str;
        this.b = bundle;
        this.c = callingAppInfo;
    }
}
