package androidx.fragment.app.strictmode;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentStrictMode {

    /* renamed from: a, reason: collision with root package name */
    public static final Policy f2774a = Policy.f2775a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Flag {
        public static final /* synthetic */ Flag[] d = {new Flag("PENALTY_LOG", 0), new Flag("PENALTY_DEATH", 1), new Flag("DETECT_FRAGMENT_REUSE", 2), new Flag("DETECT_FRAGMENT_TAG_USAGE", 3), new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4), new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5), new Flag("DETECT_SET_USER_VISIBLE_HINT", 6), new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7), new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8)};

        /* JADX INFO: Fake field, exist only in values array */
        Flag EF5;

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) d.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnViolationListener {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "Builder", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Policy {

        /* renamed from: a, reason: collision with root package name */
        public static final Policy f2775a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Policy policy = new Policy();
            new LinkedHashMap();
            f2775a = policy;
        }
    }

    public static Policy a(Fragment fragment2) {
        while (fragment2 != null) {
            if (fragment2.isAdded()) {
                Intrinsics.g(fragment2.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment2 = fragment2.getParentFragment();
        }
        return f2774a;
    }

    public static void b(Violation violation) {
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.d.getClass().getName()), violation);
        }
    }

    public static final void c(Fragment fragment2, String previousFragmentId) {
        Intrinsics.h(fragment2, "fragment");
        Intrinsics.h(previousFragmentId, "previousFragmentId");
        b(new FragmentReuseViolation(fragment2, "Attempting to reuse fragment " + fragment2 + " with previous ID " + previousFragmentId));
        a(fragment2).getClass();
    }

    public static final void d(Fragment fragment2, ViewGroup viewGroup) {
        b(new FragmentTagUsageViolation(fragment2, viewGroup));
        a(fragment2).getClass();
    }

    public static final void e(Fragment fragment2) {
        b(new GetRetainInstanceUsageViolation(fragment2, "Attempting to get retain instance for fragment " + fragment2));
        a(fragment2).getClass();
    }

    public static final void f(Fragment fragment2) {
        b(new GetTargetFragmentRequestCodeUsageViolation(fragment2, "Attempting to get target request code from fragment " + fragment2));
        a(fragment2).getClass();
    }

    public static final void g(Fragment fragment2) {
        b(new GetTargetFragmentUsageViolation(fragment2, "Attempting to get target fragment from fragment " + fragment2));
        a(fragment2).getClass();
    }

    public static final void h(Fragment fragment2) {
        b(new SetRetainInstanceUsageViolation(fragment2, "Attempting to set retain instance for fragment " + fragment2));
        a(fragment2).getClass();
    }

    public static final void i(Fragment fragment2, Fragment fragment3, int i) {
        b(new SetTargetFragmentUsageViolation(fragment2, "Attempting to set target fragment " + fragment3 + " with request code " + i + " for fragment " + fragment2));
        a(fragment2).getClass();
    }

    public static final void j(Fragment fragment2, boolean z) {
        b(new SetUserVisibleHintViolation(fragment2, "Attempting to set user visible hint to " + z + " for fragment " + fragment2));
        a(fragment2).getClass();
    }
}
