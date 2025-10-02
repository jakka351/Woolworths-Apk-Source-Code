package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "AnchorInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Selection {

    /* renamed from: a, reason: collision with root package name */
    public final AnchorInfo f1204a;
    public final AnchorInfo b;
    public final boolean c;

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ResolvedTextDirection f1205a;
        public final int b;
        public final long c;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.f1205a = resolvedTextDirection;
            this.b = i;
            this.c = j;
        }

        /* renamed from: a, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.f1205a == anchorInfo.f1205a && this.b == anchorInfo.b && this.c == anchorInfo.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, this.f1205a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.f1205a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", selectableId=");
            return androidx.camera.core.impl.b.q(sb, this.c, ')');
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        this.f1204a = anchorInfo;
        this.b = anchorInfo2;
        this.c = z;
    }

    public static Selection a(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i) {
        if ((i & 1) != 0) {
            anchorInfo = selection.f1204a;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.b;
        }
        if ((i & 4) != 0) {
            z = selection.c;
        }
        selection.getClass();
        return new Selection(anchorInfo, anchorInfo2, z);
    }

    /* renamed from: b, reason: from getter */
    public final AnchorInfo getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final AnchorInfo getF1204a() {
        return this.f1204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return Intrinsics.c(this.f1204a, selection.f1204a) && Intrinsics.c(this.b, selection.b) && this.c == selection.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f1204a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f1204a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return androidx.camera.core.impl.b.s(sb, this.c, ')');
    }
}
