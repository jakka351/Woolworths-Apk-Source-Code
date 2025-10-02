package au.com.woolworths.rewards.base.homepage;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/base/homepage/RewardsBannerInteractor;", "", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsBannerInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Application f9369a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/rewards/base/homepage/RewardsBannerInteractor$Companion;", "", "", "REWARDS_BANNER_PREFERENCES", "Ljava/lang/String;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CacheType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CacheType[] cacheTypeArr = CacheType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RewardsBannerInteractor(Application application) {
        this.f9369a = application;
    }

    public final void a(String bannerDataId) {
        CacheType[] cacheTypeArr = CacheType.d;
        Intrinsics.h(bannerDataId, "bannerDataId");
        this.c.add(bannerDataId);
    }

    public final void b() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
    }

    public final boolean c(String str) {
        if (CollectionsKt.t(this.c, str)) {
            return true;
        }
        Application application = this.f9369a;
        String packageName = application.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".rewards_banner_preferences");
        return application.getSharedPreferences(sb.toString(), 0).getBoolean(str, false);
    }
}
