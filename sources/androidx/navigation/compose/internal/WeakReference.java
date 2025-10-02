package androidx.navigation.compose.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/compose/internal/WeakReference;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeakReference<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f3500a;

    public WeakReference(SaveableStateHolder saveableStateHolder) {
        this.f3500a = new java.lang.ref.WeakReference(saveableStateHolder);
    }
}
