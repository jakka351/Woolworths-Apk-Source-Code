package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {

    /* renamed from: a, reason: collision with root package name */
    public final String f2070a;

    public VerbatimTtsAnnotation(String str) {
        this.f2070a = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getF2070a() {
        return this.f2070a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerbatimTtsAnnotation) {
            return Intrinsics.c(this.f2070a, ((VerbatimTtsAnnotation) obj).f2070a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2070a.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f2070a, ')');
    }
}
