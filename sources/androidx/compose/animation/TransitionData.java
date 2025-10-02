package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TransitionData {

    /* renamed from: a, reason: collision with root package name */
    public final Fade f738a;
    public final Slide b;
    public final ChangeSize c;
    public final Scale d;
    public final boolean e;
    public final Map f;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z, Map map) {
        this.f738a = fade;
        this.b = slide;
        this.c = changeSize;
        this.d = scale;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return Intrinsics.c(this.f738a, transitionData.f738a) && Intrinsics.c(this.b, transitionData.b) && Intrinsics.c(this.c, transitionData.c) && Intrinsics.c(this.d, transitionData.d) && this.e == transitionData.e && Intrinsics.c(this.f, transitionData.f);
    }

    public final int hashCode() {
        Fade fade = this.f738a;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.b;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.c;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.d;
        return this.f.hashCode() + b.e((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.f738a);
        sb.append(", slide=");
        sb.append(this.b);
        sb.append(", changeSize=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append(this.d);
        sb.append(", hold=");
        sb.append(this.e);
        sb.append(", effectsMap=");
        return android.support.v4.media.session.a.u(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Map] */
    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale, (i & 16) == 0, (i & 32) != 0 ? EmptyMap.d : linkedHashMap);
    }
}
