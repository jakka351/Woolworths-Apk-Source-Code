package androidx.compose.foundation.layout;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Lkotlin/Lazy;", "", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LazyImpl implements Lazy<Integer> {
    public final Lambda d;
    public final String e;
    public int f = -1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl$Companion;", "", "", "UNINITIALIZED_VALUE", "I", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyImpl(String str, Function0 function0) {
        this.d = (Lambda) function0;
        this.e = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.Lazy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer getD() {
        if (this.f == -1) {
            this.f = ((Number) this.d.invoke()).intValue();
        }
        int i = this.f;
        if (i != -1) {
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(this.e);
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f != -1;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getD().intValue()) : this.e;
    }
}
