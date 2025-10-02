package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Match {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResultColumn {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResultColumn);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResultColumn(name=null, index=0)";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "Companion", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Solution implements Comparable<Solution> {
        public static final /* synthetic */ int g = 0;
        public final List d;
        public final int e;
        public final int f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        static {
            new Solution(Integer.MAX_VALUE, Integer.MAX_VALUE, EmptyList.d);
        }

        public Solution(int i, int i2, List matches) {
            Intrinsics.h(matches, "matches");
            this.d = matches;
            this.e = i;
            this.f = i2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution other = solution;
            Intrinsics.h(other, "other");
            int iJ = Intrinsics.j(this.f, other.f);
            return iJ != 0 ? iJ : Intrinsics.j(this.e, other.e);
        }
    }
}
