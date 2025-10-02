package androidx.navigation.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.os.SavedStateReader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavBackStackEntryStateImpl {

    /* renamed from: a, reason: collision with root package name */
    public final String f3508a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl$Companion;", "", "", "KEY_ID", "Ljava/lang/String;", "KEY_DESTINATION_ID", "KEY_ARGS", "KEY_SAVED_STATE", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NavBackStackEntryStateImpl(NavBackStackEntry entry, int i) {
        Intrinsics.h(entry, "entry");
        this.f3508a = entry.i;
        this.b = i;
        NavBackStackEntryImpl navBackStackEntryImpl = entry.k;
        this.c = navBackStackEntryImpl.a();
        Pair[] pairArr = new Pair[0];
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        this.d = bundleA;
        navBackStackEntryImpl.getClass();
        navBackStackEntryImpl.h.b(bundleA);
    }

    public NavBackStackEntryStateImpl(Bundle state) {
        Intrinsics.h(state, "state");
        this.f3508a = SavedStateReader.j(state, "nav-entry-state:id");
        this.b = SavedStateReader.f(state, "nav-entry-state:destination-id");
        this.c = SavedStateReader.i(state, "nav-entry-state:args");
        this.d = SavedStateReader.i(state, "nav-entry-state:saved-state");
    }
}
