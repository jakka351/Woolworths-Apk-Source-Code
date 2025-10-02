package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class KeyboardOptions {
    public static final KeyboardOptions h;

    /* renamed from: a, reason: collision with root package name */
    public final int f1120a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final PlatformImeOptions e;
    public final Boolean f;
    public final LocaleList g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = 0;
        h = new KeyboardOptions(i, i, 127);
    }

    public KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.f1120a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = platformImeOptions;
        this.f = bool2;
        this.g = localeList;
    }

    public static KeyboardOptions a(int i, int i2, int i3) {
        KeyboardOptions keyboardOptions = h;
        int i4 = keyboardOptions.f1120a;
        Boolean bool = keyboardOptions.b;
        if ((i3 & 4) != 0) {
            i = keyboardOptions.c;
        }
        int i5 = i;
        if ((i3 & 8) != 0) {
            i2 = keyboardOptions.d;
        }
        return new KeyboardOptions(i4, bool, i5, i2, keyboardOptions.e, null, null);
    }

    public final int b() {
        int i = this.d;
        ImeAction imeAction = new ImeAction(i);
        if (i == -1) {
            imeAction = null;
        }
        if (imeAction != null) {
            return imeAction.f2115a;
        }
        return 1;
    }

    public final boolean c() {
        return this.f1120a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null && this.g == null;
    }

    public final ImeOptions d(boolean z) {
        int i = this.f1120a;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i);
        if (i == -1) {
            keyboardCapitalization = null;
        }
        int i2 = keyboardCapitalization != null ? keyboardCapitalization.f2118a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        KeyboardType keyboardType = i3 != 0 ? new KeyboardType(i3) : null;
        int i4 = keyboardType != null ? keyboardType.f2119a : 1;
        int iB = b();
        LocaleList localeList = this.g;
        if (localeList == null) {
            localeList = LocaleList.f;
        }
        return new ImeOptions(z, i2, zBooleanValue, i4, iB, this.e, localeList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return this.f1120a == keyboardOptions.f1120a && Intrinsics.c(this.b, keyboardOptions.b) && this.c == keyboardOptions.c && this.d == keyboardOptions.d && Intrinsics.c(this.e, keyboardOptions.e) && Intrinsics.c(this.f, keyboardOptions.f) && Intrinsics.c(this.g, keyboardOptions.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f1120a) * 31;
        Boolean bool = this.b;
        int iA = b.a(this.d, b.a(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f;
        int iHashCode2 = (iA + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.g;
        return iHashCode2 + (localeList != null ? localeList.d.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.a(this.f1120a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) KeyboardType.a(this.c)) + ", imeAction=" + ((Object) ImeAction.a(this.d)) + ", platformImeOptions=" + this.e + "showKeyboardOnFocus=" + this.f + ", hintLocales=" + this.g + ')';
    }

    public /* synthetic */ KeyboardOptions(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, null, null, null);
    }
}
