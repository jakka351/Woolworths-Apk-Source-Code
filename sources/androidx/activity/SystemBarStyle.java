package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemBarStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f59a;
    public final int b;
    public final int c;
    public final Function1 d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static SystemBarStyle a(int i, int i2) {
            return new SystemBarStyle(SystemBarStyle$Companion$light$1.h, i, i2, 1);
        }
    }

    public SystemBarStyle(Function1 function1, int i, int i2, int i3) {
        this.f59a = i;
        this.b = i2;
        this.c = i3;
        this.d = function1;
    }
}
