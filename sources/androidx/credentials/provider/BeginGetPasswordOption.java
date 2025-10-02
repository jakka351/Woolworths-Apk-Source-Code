package androidx.credentials.provider;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetPasswordOption extends BeginGetCredentialOption {
    public final Set d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static BeginGetPasswordOption a(Bundle bundle, String id) {
            Intrinsics.h(id, "id");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
            return new BeginGetPasswordOption(stringArrayList != null ? CollectionsKt.L0(stringArrayList) : EmptySet.d, bundle, id);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPasswordOption(Set set, Bundle bundle, String id) {
        super(id, "android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        Intrinsics.h(id, "id");
        this.d = set;
    }
}
