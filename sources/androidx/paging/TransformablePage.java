package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/TransformablePage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TransformablePage<T> {
    public static final TransformablePage e = new TransformablePage(0, EmptyList.d);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3590a;
    public final List b;
    public final int c;
    public final List d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public TransformablePage(int[] originalPageOffsets, List data, int i, List list) {
        Intrinsics.h(originalPageOffsets, "originalPageOffsets");
        Intrinsics.h(data, "data");
        this.f3590a = originalPageOffsets;
        this.b = data;
        this.c = i;
        this.d = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        Intrinsics.e(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformablePage.class != obj.getClass()) {
            return false;
        }
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.f3590a, transformablePage.f3590a) && Intrinsics.c(this.b, transformablePage.b) && this.c == transformablePage.c && Intrinsics.c(this.d, transformablePage.d);
    }

    public final int hashCode() {
        int iD = (androidx.camera.core.impl.b.d(Arrays.hashCode(this.f3590a) * 31, 31, this.b) + this.c) * 31;
        List list = this.d;
        return iD + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.f3590a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.c);
        sb.append(", hintOriginalIndices=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i, List data) {
        this(new int[]{i}, data, i, null);
        Intrinsics.h(data, "data");
    }
}
