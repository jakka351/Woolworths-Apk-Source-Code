package nl.dionsegijn.konfetti.models;

import YU.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/models/Size;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class Size {

    /* renamed from: a, reason: collision with root package name */
    public final int f26655a;

    public Size(int i) {
        this.f26655a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Size) && this.f26655a == ((Size) obj).f26655a && Float.compare(5.0f, 5.0f) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(5.0f) + (this.f26655a * 31);
    }

    public final String toString() {
        return a.m(new StringBuilder("Size(sizeInDp="), this.f26655a, ", mass=5.0)");
    }
}
