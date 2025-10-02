package coil3.compose.internal;

import androidx.compose.runtime.Stable;
import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/internal/AsyncImageState;", "", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncImageState {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13069a;
    public final AsyncImageModelEqualityDelegate b;
    public final ImageLoader c;

    public AsyncImageState(Object obj, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, ImageLoader imageLoader) {
        this.f13069a = obj;
        this.b = asyncImageModelEqualityDelegate;
        this.c = imageLoader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImageState)) {
            return false;
        }
        AsyncImageState asyncImageState = (AsyncImageState) obj;
        AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate = asyncImageState.b;
        AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate2 = this.b;
        return Intrinsics.c(asyncImageModelEqualityDelegate2, asyncImageModelEqualityDelegate) && asyncImageModelEqualityDelegate2.equals(this.f13069a, asyncImageState.f13069a) && Intrinsics.c(this.c, asyncImageState.c);
    }

    public final int hashCode() {
        AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate = this.b;
        return this.c.hashCode() + ((asyncImageModelEqualityDelegate.hashCode(this.f13069a) + (asyncImageModelEqualityDelegate.hashCode() * 31)) * 31);
    }
}
