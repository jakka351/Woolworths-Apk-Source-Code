package au.com.woolworths.android.onesite.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/TrackableErrorType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class TrackableErrorType {
    public static final TrackableErrorType d;
    public static final TrackableErrorType e;
    public static final TrackableErrorType f;
    public static final /* synthetic */ TrackableErrorType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TrackableErrorType trackableErrorType = new TrackableErrorType() { // from class: au.com.woolworths.android.onesite.analytics.TrackableErrorType.FULL_SCREEN
            @Override // java.lang.Enum
            public final String toString() {
                return "Full Screen";
            }
        };
        d = trackableErrorType;
        TrackableErrorType trackableErrorType2 = new TrackableErrorType() { // from class: au.com.woolworths.android.onesite.analytics.TrackableErrorType.INLINE_MESSAGE
            @Override // java.lang.Enum
            public final String toString() {
                return "Inline Message";
            }
        };
        e = trackableErrorType2;
        TrackableErrorType trackableErrorType3 = new TrackableErrorType() { // from class: au.com.woolworths.android.onesite.analytics.TrackableErrorType.SNACKBAR
            @Override // java.lang.Enum
            public final String toString() {
                return "Snackbar";
            }
        };
        f = trackableErrorType3;
        TrackableErrorType[] trackableErrorTypeArr = {trackableErrorType, trackableErrorType2, trackableErrorType3};
        g = trackableErrorTypeArr;
        h = EnumEntriesKt.a(trackableErrorTypeArr);
    }

    public static TrackableErrorType valueOf(String str) {
        return (TrackableErrorType) Enum.valueOf(TrackableErrorType.class, str);
    }

    public static TrackableErrorType[] values() {
        return (TrackableErrorType[]) g.clone();
    }
}
