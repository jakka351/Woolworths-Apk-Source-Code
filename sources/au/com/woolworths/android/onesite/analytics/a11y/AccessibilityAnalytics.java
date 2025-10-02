package au.com.woolworths.android.onesite.analytics.a11y;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.DeviceAccessibilityTracker;
import au.com.woolworths.android.onesite.analytics.FontScale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics;", "", "DeviceData", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AccessibilityAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final DeviceAccessibilityTracker f4064a;
    public final AnalyticsManager b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics$DeviceData;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeviceData {
        public static final /* synthetic */ DeviceData[] e;
        public static final /* synthetic */ EnumEntries f;
        public final String d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics.DeviceData.DARK_MODE", "Lau/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics$DeviceData;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DARK_MODE extends DeviceData {
            @Override // au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics.DeviceData
            public final boolean a(DeviceAccessibilityTracker deviceAccessibilityTracker) {
                Intrinsics.h(deviceAccessibilityTracker, "<this>");
                return deviceAccessibilityTracker.d();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics.DeviceData.DYNAMIC_TYPE", "Lau/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics$DeviceData;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DYNAMIC_TYPE extends DeviceData {
            @Override // au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics.DeviceData
            public final boolean a(DeviceAccessibilityTracker deviceAccessibilityTracker) {
                Intrinsics.h(deviceAccessibilityTracker, "<this>");
                return deviceAccessibilityTracker.b().d > 1.0f;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics.DeviceData.VOICE_OVER", "Lau/com/woolworths/android/onesite/analytics/a11y/AccessibilityAnalytics$DeviceData;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class VOICE_OVER extends DeviceData {
            @Override // au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics.DeviceData
            public final boolean a(DeviceAccessibilityTracker deviceAccessibilityTracker) {
                Intrinsics.h(deviceAccessibilityTracker, "<this>");
                return deviceAccessibilityTracker.a();
            }
        }

        static {
            DeviceData[] deviceDataArr = {new DARK_MODE("DARK_MODE", 0, "device dark mode"), new VOICE_OVER("VOICE_OVER", 1, "device voice over"), new DYNAMIC_TYPE("DYNAMIC_TYPE", 2, "device dynamic type")};
            e = deviceDataArr;
            f = EnumEntriesKt.a(deviceDataArr);
        }

        public DeviceData(String str, int i, String str2) {
            this.d = str2;
        }

        public static DeviceData valueOf(String str) {
            return (DeviceData) Enum.valueOf(DeviceData.class, str);
        }

        public static DeviceData[] values() {
            return (DeviceData[]) e.clone();
        }

        public abstract boolean a(DeviceAccessibilityTracker deviceAccessibilityTracker);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4065a;

        static {
            int[] iArr = new int[FontScale.values().length];
            try {
                FontScale.Companion companion = FontScale.f;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4065a = iArr;
        }
    }

    public AccessibilityAnalytics(DeviceAccessibilityTracker deviceA11yTracker, AnalyticsManager analyticsManager) {
        Intrinsics.h(deviceA11yTracker, "deviceA11yTracker");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f4064a = deviceA11yTracker;
        this.b = analyticsManager;
    }
}
