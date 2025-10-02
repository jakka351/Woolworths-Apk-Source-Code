package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/PagingConfig;", "", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagingConfig {

    /* renamed from: a, reason: collision with root package name */
    public final int f3572a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagingConfig$Companion;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public PagingConfig(int i, int i2, int i3, int i4, boolean z) {
        i2 = (i4 & 2) != 0 ? i : i2;
        z = (i4 & 4) != 0 ? true : z;
        i3 = (i4 & 8) != 0 ? i * 3 : i3;
        this.f3572a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = Integer.MAX_VALUE;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
