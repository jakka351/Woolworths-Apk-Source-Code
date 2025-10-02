package androidx.navigation.internal;

import androidx.navigation.NavDeepLink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ NavDeepLink e;

    public /* synthetic */ g(NavDeepLink navDeepLink, int i) {
        this.d = i;
        this.e = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        String key = (String) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(key, "key");
                zContains = this.e.c().contains(key);
                break;
            default:
                Intrinsics.h(key, "key");
                zContains = this.e.c().contains(key);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
