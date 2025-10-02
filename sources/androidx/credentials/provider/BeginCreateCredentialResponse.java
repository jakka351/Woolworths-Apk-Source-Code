package androidx.credentials.provider;

import android.app.slice.Slice;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.b;
import androidx.credentials.provider.utils.c;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse;", "", "Api34Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginCreateCredentialResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f2530a;
    public final RemoteEntry b;

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Api34Impl;", "", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "response", "", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialResponse;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull Bundle bundle, @NotNull BeginCreateCredentialResponse response) {
            Intrinsics.h(bundle, "bundle");
            Intrinsics.h(response, "response");
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", BeginCreateCredentialUtil.Companion.a(response));
        }

        @JvmStatic
        @DoNotInline
        @Nullable
        public static final BeginCreateCredentialResponse b(@NotNull Bundle bundle) {
            Intrinsics.h(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialResponse beginCreateCredentialResponse = (android.service.credentials.BeginCreateCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", android.service.credentials.BeginCreateCredentialResponse.class);
            RemoteEntry remoteEntryA = null;
            if (beginCreateCredentialResponse == null) {
                return null;
            }
            Object objCollect = beginCreateCredentialResponse.getCreateEntries().stream().map(new b(0)).filter(new c(0)).map(new b(1)).collect(Collectors.toList());
            Intrinsics.g(objCollect, "frameworkResponse.create…lect(Collectors.toList())");
            List list = (List) objCollect;
            android.service.credentials.RemoteEntry remoteCreateEntry = beginCreateCredentialResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                Slice slice = remoteCreateEntry.getSlice();
                Intrinsics.g(slice, "it.slice");
                remoteEntryA = RemoteEntry.Companion.a(slice);
            }
            return new BeginCreateCredentialResponse(list, remoteEntryA);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public BeginCreateCredentialResponse(List list, RemoteEntry remoteEntry) {
        this.f2530a = list;
        this.b = remoteEntry;
    }
}
