package au.com.woolworths.feature.shop.more.newbadge;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/newbadge/NewBadgeRepository;", "", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NewBadgeRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7632a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/more/newbadge/NewBadgeRepository$Companion;", "", "", "KEY_BADGE_TIME_STAMP", "Ljava/lang/String;", "KEY_HAS_INTERACTED_NEW_BADGE", "KEY_HAS_INTERACTED_UNREAD_MESSAGE", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public NewBadgeRepository(SharedPreferences sharedPreferences) {
        this.f7632a = sharedPreferences;
    }
}
