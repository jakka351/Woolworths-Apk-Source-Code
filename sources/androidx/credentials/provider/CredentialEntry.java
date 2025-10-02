package androidx.credentials.provider;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/CredentialEntry;", "", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CredentialEntry {

    /* renamed from: a, reason: collision with root package name */
    public final String f2536a;
    public final BeginGetCredentialOption b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption) {
        this.f2536a = str;
        this.b = beginGetCredentialOption;
    }

    /* renamed from: a, reason: from getter */
    public String getF2536a() {
        return this.f2536a;
    }
}
