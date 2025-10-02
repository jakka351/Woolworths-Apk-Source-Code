package androidx.webkit.internal;

import android.os.Build;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {
    public static final HashSet c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f3846a;
    public final String b;

    public static class LAZY_HOLDER {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f3847a = new HashSet(Arrays.asList(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f3860a.a()));
    }

    public static class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return true;
        }
    }

    public static class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return true;
        }
    }

    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return true;
        }
    }

    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return true;
        }
    }

    public static class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return true;
        }
    }

    public static class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public ApiFeature(String str, String str2) {
        this.f3846a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean a() {
        return c() || d();
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String b() {
        return this.f3846a;
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = LAZY_HOLDER.f3847a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
