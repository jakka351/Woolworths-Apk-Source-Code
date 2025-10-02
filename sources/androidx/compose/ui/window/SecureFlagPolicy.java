package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecureFlagPolicy {
    public static final SecureFlagPolicy d;
    public static final SecureFlagPolicy e;
    public static final /* synthetic */ SecureFlagPolicy[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        d = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        e = secureFlagPolicy2;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
        f = secureFlagPolicyArr;
        g = EnumEntriesKt.a(secureFlagPolicyArr);
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f.clone();
    }
}
