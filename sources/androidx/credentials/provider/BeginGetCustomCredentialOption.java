package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(String id, String str, Bundle bundle) {
        super(id, str, bundle);
        Intrinsics.h(id, "id");
        if (id.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
