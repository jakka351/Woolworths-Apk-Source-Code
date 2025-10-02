package coil3.compose;

import androidx.compose.runtime.Stable;
import coil3.annotation.ExperimentalCoilApi;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImageModelEqualityDelegate;", "", "Companion", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalCoilApi
/* loaded from: classes.dex */
public interface AsyncImageModelEqualityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final AsyncImageModelEqualityDelegate$Companion$Default$1 f13057a = new AsyncImageModelEqualityDelegate$Companion$Default$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcoil3/compose/AsyncImageModelEqualityDelegate$Companion;", "", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "Default", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "AllProperties", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
