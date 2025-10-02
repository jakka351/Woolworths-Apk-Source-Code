package androidx.credentials.provider;

import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.a;
import androidx.credentials.provider.utils.b;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest;", "", "Api34Impl", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetCredentialRequest {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2532a;
    public final CallingAppInfo b;

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api34Impl;", "", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "request", "", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull Bundle bundle, @NotNull BeginGetCredentialRequest request) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(request, "request");
            BeginGetCredentialRequest.Builder builderI = a.i();
            CallingAppInfo callingAppInfo = request.b;
            if (callingAppInfo != null) {
                androidx.credentials.a.B();
                builderI.setCallingAppInfo(androidx.credentials.a.m(callingAppInfo.f2534a, callingAppInfo.b, callingAppInfo.c));
            }
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequestBuild = builderI.setBeginGetCredentialOptions((List) request.f2532a.stream().map(new b(8)).collect(Collectors.toList())).build();
            Intrinsics.g(beginGetCredentialRequestBuild, "builder.setBeginGetCrede…\n                .build()");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", beginGetCredentialRequestBuild);
        }

        @JvmStatic
        @DoNotInline
        @Nullable
        public static final BeginGetCredentialRequest b(@NotNull Bundle bundle) {
            Intrinsics.h(bundle, "bundle");
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return BeginGetCredentialUtil.Companion.b(beginGetCredentialRequest);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public BeginGetCredentialRequest(ArrayList arrayList, CallingAppInfo callingAppInfo) {
        this.f2532a = arrayList;
        this.b = callingAppInfo;
    }
}
