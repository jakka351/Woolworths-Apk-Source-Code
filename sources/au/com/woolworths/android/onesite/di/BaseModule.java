package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.analytics.tealium.TealiumEnvironment;
import com.tealium.core.Environment;
import dagger.Module;
import dagger.hilt.InstallIn;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/di/BaseModule;", "", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
@InstallIn
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BaseModule {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TealiumEnvironment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TealiumEnvironment[] tealiumEnvironmentArr = TealiumEnvironment.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Environment.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
