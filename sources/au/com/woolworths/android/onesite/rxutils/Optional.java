package au.com.woolworths.android.onesite.rxutils;

import androidx.camera.core.impl.b;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/rxutils/Optional;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "None", "Some", "Lau/com/woolworths/android/onesite/rxutils/Optional$None;", "Lau/com/woolworths/android/onesite/rxutils/Optional$Some;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Optional<T> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/rxutils/Optional$None;", "Lau/com/woolworths/android/onesite/rxutils/Optional;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends Optional {

        /* renamed from: a, reason: collision with root package name */
        public static final None f4589a = new None();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/rxutils/Optional$Some;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lau/com/woolworths/android/onesite/rxutils/Optional;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Some<T> extends Optional<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f4590a;

        public Some(Object obj) {
            this.f4590a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Some) && Intrinsics.c(this.f4590a, ((Some) obj).f4590a);
        }

        public final int hashCode() {
            Object obj = this.f4590a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return b.n(this.f4590a, "Some(value=", ")");
        }
    }
}
