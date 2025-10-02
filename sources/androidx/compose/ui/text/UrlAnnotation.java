package androidx.compose.ui.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/UrlAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes2.dex */
public final class UrlAnnotation implements AnnotatedString.Annotation {

    /* renamed from: a, reason: collision with root package name */
    public final String f2069a;

    public UrlAnnotation(String str) {
        this.f2069a = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getF2069a() {
        return this.f2069a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrlAnnotation) {
            return Intrinsics.c(this.f2069a, ((UrlAnnotation) obj).f2069a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2069a.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("UrlAnnotation(url="), this.f2069a, ')');
    }
}
