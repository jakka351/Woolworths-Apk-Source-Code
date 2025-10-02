package au.com.woolworths.feature.shop.more.newbadge;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.feature.shop.more.data.MoreTileType;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/more/newbadge/NewBadgeInteractor;", "", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewBadgeInteractor {
    public static final long b = TimeUnit.DAYS.toMillis(14);

    /* renamed from: a, reason: collision with root package name */
    public final NewBadgeRepository f7631a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/more/newbadge/NewBadgeInteractor$Companion;", "", "", "NEW_BADGE_EXPIRY_DURATION_IN_DAYS", "J", "NEW_BADGE_DISPLAY_INTERVAL_IN_MILLIS", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public NewBadgeInteractor(NewBadgeRepository newBadgeRepository) {
        this.f7631a = newBadgeRepository;
    }

    public final void a(MoreTileType moreTileType) {
        a.v(this.f7631a.f7632a, "has_interacted_new_badge_key" + moreTileType, true);
    }

    public final boolean b() {
        MoreTileType moreTileType = MoreTileType.i;
        NewBadgeRepository newBadgeRepository = this.f7631a;
        SharedPreferences sharedPreferences = newBadgeRepository.f7632a;
        long j = newBadgeRepository.f7632a.getLong("badge_time_stamp_key", 0L);
        if ((j == 0 ? null : Long.valueOf(j)) != null) {
            if (!sharedPreferences.getBoolean("has_interacted_new_badge_key" + moreTileType, false)) {
                long j2 = sharedPreferences.getLong("badge_time_stamp_key", 0L);
                Long lValueOf = j2 != 0 ? Long.valueOf(j2) : null;
                if (lValueOf == null) {
                    return true;
                }
                if (System.currentTimeMillis() <= lValueOf.longValue() + b) {
                    return true;
                }
            }
        }
        return false;
    }
}
