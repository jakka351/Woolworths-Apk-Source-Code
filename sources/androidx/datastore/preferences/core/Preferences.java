package androidx.datastore.preferences.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "Key", "Pair", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Preferences {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f2589a;

        public Key(String name) {
            Intrinsics.h(name, "name");
            this.f2589a = name;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            return Intrinsics.c(this.f2589a, ((Key) obj).f2589a);
        }

        public final int hashCode() {
            return this.f2589a.hashCode();
        }

        /* renamed from: toString, reason: from getter */
        public final String getF2589a() {
            return this.f2589a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pair<T> {
    }

    public abstract Map a();

    public abstract Object b(Key key);
}
