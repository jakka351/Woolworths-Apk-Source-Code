package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/FragmentContainer;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    public final FragmentActivity d;
    public final FragmentActivity e;
    public final Handler f;
    public final FragmentManager g;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.d = fragmentActivity;
        this.e = fragmentActivity;
        this.f = handler;
        this.g = new FragmentManagerImpl();
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View b(int i) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean c() {
        return true;
    }

    public void d(PrintWriter printWriter, String[] strArr) {
    }

    public abstract FragmentActivity e();

    public LayoutInflater f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        Intrinsics.g(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public boolean g(String permission) {
        Intrinsics.h(permission, "permission");
        return false;
    }

    public void h() {
    }
}
