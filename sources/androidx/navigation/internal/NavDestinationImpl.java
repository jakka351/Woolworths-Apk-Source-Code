package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.NavUriUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/internal/NavDestinationImpl;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavDestinationImpl {

    /* renamed from: a, reason: collision with root package name */
    public final NavDestination f3511a;
    public String b;
    public final ArrayList c = new ArrayList();
    public final LinkedHashMap d = new LinkedHashMap();
    public int e;
    public String f;
    public Lazy g;

    public NavDestinationImpl(NavDestination navDestination) {
        this.f3511a = navDestination;
    }

    public final NavDestination.DeepLinkMatch a(String route) {
        NavDeepLink navDeepLink;
        Intrinsics.h(route, "route");
        Lazy lazy = this.g;
        if (lazy == null || (navDeepLink = (NavDeepLink) lazy.getD()) == null) {
            return null;
        }
        int i = NavDestination.i;
        String uriString = "android-app://androidx.navigation/".concat(route);
        Intrinsics.h(uriString, "uriString");
        Uri uriB = NavUriUtils.b(uriString);
        Bundle bundleD = navDeepLink.d(uriB, this.d);
        if (bundleD == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.f3511a, bundleD, navDeepLink.p, navDeepLink.b(uriB), false, -1);
    }
}
