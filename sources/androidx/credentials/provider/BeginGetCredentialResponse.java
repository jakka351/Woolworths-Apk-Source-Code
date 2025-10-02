package androidx.credentials.provider;

import android.app.slice.Slice;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.b;
import androidx.credentials.provider.utils.c;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse;", "", "Api34Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetCredentialResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f2533a;
    public final List b;
    public final List c;
    public final RemoteEntry d;

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api34Impl;", "", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "response", "", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull Bundle bundle, @NotNull BeginGetCredentialResponse response) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(response, "response");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", BeginGetCredentialUtil.Companion.a(response));
        }

        @JvmStatic
        @DoNotInline
        @Nullable
        public static final BeginGetCredentialResponse b(@NotNull Bundle bundle) {
            Intrinsics.h(bundle, "bundle");
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", android.service.credentials.BeginGetCredentialResponse.class);
            RemoteEntry remoteEntryA = null;
            if (beginGetCredentialResponse == null) {
                return null;
            }
            Object objCollect = beginGetCredentialResponse.getCredentialEntries().stream().map(new b(3)).filter(new c(2)).map(new b(4)).collect(Collectors.toList());
            Intrinsics.g(objCollect, "response.credentialEntri…lect(Collectors.toList())");
            List list = (List) objCollect;
            Object objCollect2 = beginGetCredentialResponse.getActions().stream().map(new b(5)).filter(new c(3)).map(new b(6)).collect(Collectors.toList());
            Intrinsics.g(objCollect2, "response.actions.stream(…lect(Collectors.toList())");
            List list2 = (List) objCollect2;
            Object objCollect3 = beginGetCredentialResponse.getAuthenticationActions().stream().map(new b(7)).filter(new c(1)).map(new b(2)).collect(Collectors.toList());
            Intrinsics.g(objCollect3, "response.authenticationA…lect(Collectors.toList())");
            List list3 = (List) objCollect3;
            android.service.credentials.RemoteEntry remoteCredentialEntry = beginGetCredentialResponse.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                Slice slice = remoteCredentialEntry.getSlice();
                Intrinsics.g(slice, "it.slice");
                remoteEntryA = RemoteEntry.Companion.a(slice);
            }
            return new BeginGetCredentialResponse(list, list2, list3, remoteEntryA);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public BeginGetCredentialResponse(List list, List list2, List list3, RemoteEntry remoteEntry) {
        this.f2533a = list;
        this.b = list2;
        this.c = list3;
        this.d = remoteEntry;
    }
}
