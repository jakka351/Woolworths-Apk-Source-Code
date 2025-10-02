package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption;", "", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BeginGetCredentialOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f2531a;
    public final String b;
    public final Bundle c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public BeginGetCredentialOption(String id, String str, Bundle bundle) {
        Intrinsics.h(id, "id");
        this.f2531a = id;
        this.b = str;
        this.c = bundle;
    }
}
