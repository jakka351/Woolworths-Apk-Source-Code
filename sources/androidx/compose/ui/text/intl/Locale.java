package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Locale {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Locale f2136a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static Locale a() {
            return (Locale) PlatformLocaleKt.f2137a.a().d.get(0);
        }
    }

    public Locale(java.util.Locale locale) {
        this.f2136a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.c(PlatformLocale_jvmKt.a(this.f2136a), PlatformLocale_jvmKt.a(((Locale) obj).f2136a));
    }

    public final int hashCode() {
        return PlatformLocale_jvmKt.a(this.f2136a).hashCode();
    }

    public final String toString() {
        return PlatformLocale_jvmKt.a(this.f2136a);
    }
}
