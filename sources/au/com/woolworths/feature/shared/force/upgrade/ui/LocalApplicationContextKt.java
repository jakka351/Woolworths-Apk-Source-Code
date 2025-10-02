package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalApplicationContextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f6514a = new StaticProvidableCompositionLocal(new au.com.woolworths.feature.rewards.offers.home.ui.a(25));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ApplicationType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ApplicationType applicationType = ApplicationType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
