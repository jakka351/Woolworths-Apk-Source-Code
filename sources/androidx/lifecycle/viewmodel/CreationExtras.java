package androidx.lifecycle.viewmodel;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Key", "Empty", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CreationExtras {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2811a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Companion;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends CreationExtras {
        public static final Empty b = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public final Object a(Key key) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Key<T> {
    }

    public abstract Object a(Key key);

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            return Intrinsics.c(this.f2811a, ((CreationExtras) obj).f2811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2811a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f2811a + ')';
    }
}
