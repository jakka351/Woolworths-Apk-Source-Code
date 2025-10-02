package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeOptions {
    public static final ImeOptions h = new ImeOptions(false, 0, true, 1, 1, null, LocaleList.f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2116a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final PlatformImeOptions f;
    public final LocaleList g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.f2116a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = platformImeOptions;
        this.g = localeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.f2116a == imeOptions.f2116a && this.b == imeOptions.b && this.c == imeOptions.c && this.d == imeOptions.d && this.e == imeOptions.e && Intrinsics.c(this.f, imeOptions.f) && Intrinsics.c(this.g, imeOptions.g);
    }

    public final int hashCode() {
        return this.g.d.hashCode() + androidx.camera.core.impl.b.a(this.e, androidx.camera.core.impl.b.a(this.d, androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.a(this.b, Boolean.hashCode(this.f2116a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f2116a + ", capitalization=" + ((Object) KeyboardCapitalization.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) KeyboardType.a(this.d)) + ", imeAction=" + ((Object) ImeAction.a(this.e)) + ", platformImeOptions=" + this.f + ", hintLocales=" + this.g + ')';
    }
}
