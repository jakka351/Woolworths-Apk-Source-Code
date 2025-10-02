package au.com.woolworths.feature.shop.myorders.details.perfectorder;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/perfectorder/PerfectOrderDataSource;", "", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PerfectOrderDataSource {
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7779a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/perfectorder/PerfectOrderDataSource$Companion;", "", "", "DATE_FORMAT", "Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "LAST_VISIT_TIMESTAMP_KEY", "ORDER_ID_SET_KEY", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PerfectOrderDataSource(SharedPreferences sharedPreferences) {
        this.f7779a = sharedPreferences;
    }
}
