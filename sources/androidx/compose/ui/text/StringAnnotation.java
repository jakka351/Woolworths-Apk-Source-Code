package androidx.compose.ui.text;

import androidx.compose.ui.platform.i;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {

    /* renamed from: a, reason: collision with root package name */
    public final String f2060a;

    public /* synthetic */ StringAnnotation(String str) {
        this.f2060a = str;
    }

    public static final /* synthetic */ StringAnnotation a(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: b, reason: from getter */
    public final /* synthetic */ String getF2060a() {
        return this.f2060a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StringAnnotation) {
            return Intrinsics.c(this.f2060a, ((StringAnnotation) obj).f2060a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2060a.hashCode();
    }

    public final String toString() {
        return i.a(')', "StringAnnotation(value=", this.f2060a);
    }
}
