package com.google.zxing.oned.rss.expanded;

import android.support.v4.media.session.a;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;

/* loaded from: classes6.dex */
final class ExpandedPair {

    /* renamed from: a, reason: collision with root package name */
    public final DataCharacter f16188a;
    public final DataCharacter b;
    public final FinderPattern c;

    public ExpandedPair(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern) {
        this.f16188a = dataCharacter;
        this.b = dataCharacter2;
        this.c = finderPattern;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ExpandedPair expandedPair = (ExpandedPair) obj;
        return Objects.equals(this.f16188a, expandedPair.f16188a) && Objects.equals(this.b, expandedPair.b) && Objects.equals(this.c, expandedPair.c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f16188a) ^ Objects.hashCode(this.b)) ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f16188a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        FinderPattern finderPattern = this.c;
        return a.o(finderPattern == null ? "null" : Integer.valueOf(finderPattern.f16187a), " ]", sb);
    }
}
