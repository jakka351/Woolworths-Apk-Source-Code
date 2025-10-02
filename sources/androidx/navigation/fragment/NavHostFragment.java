package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "Companion", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavHostFragment extends Fragment implements NavHost {
    public final Lazy d = LazyKt.b(new androidx.lifecycle.a(this, 1));
    public View e;
    public int f;
    public boolean g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "", "KEY_GRAPH_ID", "Ljava/lang/String;", "KEY_START_DESTINATION_ARGS", "KEY_NAV_CONTROLLER_STATE", "KEY_DEFAULT_NAV_HOST", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public final NavHostController E1() {
        return (NavHostController) this.d.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (this.g) {
            FragmentTransaction fragmentTransactionE = getParentFragmentManager().e();
            fragmentTransactionE.m(this);
            fragmentTransactionE.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        E1();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.g = true;
            FragmentTransaction fragmentTransactionE = getParentFragmentManager().e();
            fragmentTransactionE.m(this);
            fragmentTransactionE.d();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.g(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = com.woolworths.R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.e;
        if (view != null && Navigation.a(view) == E1()) {
            view.setTag(com.woolworths.R.id.nav_controller_view_tag, null);
        }
        this.e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R.styleable.b);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R.styleable.c);
        Intrinsics.g(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.g = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.g) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(com.woolworths.R.id.nav_controller_view_tag, E1());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.e = view2;
            if (view2.getId() == getId()) {
                View view3 = this.e;
                Intrinsics.e(view3);
                view3.setTag(com.woolworths.R.id.nav_controller_view_tag, E1());
            }
        }
    }
}
