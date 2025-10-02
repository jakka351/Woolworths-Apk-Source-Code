package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "InnerOnBackPressedCallback", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AbstractListDetailFragment extends Fragment {
    public OnBackPressedCallback d;
    public int e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        public final SlidingPaneLayout d;

        public InnerOnBackPressedCallback(SlidingPaneLayout slidingPaneLayout) {
            super(true);
            this.d = slidingPaneLayout;
            slidingPaneLayout.q.add(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void a(View panel) {
            Intrinsics.h(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void b(View panel) {
            Intrinsics.h(panel, "panel");
            i(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void c(View panel) {
            Intrinsics.h(panel, "panel");
            i(false);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            this.d.a();
        }
    }

    public abstract View E1();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragment;
        Bundle bundle2;
        Intrinsics.h(inflater, "inflater");
        if (bundle != null) {
            this.e = bundle.getInt("android-support-nav:fragment:graphId");
        }
        final SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(com.woolworths.R.id.sliding_pane_layout);
        View viewE1 = E1();
        if (!Intrinsics.c(viewE1, slidingPaneLayout) && !Intrinsics.c(viewE1.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewE1);
        }
        Context context = inflater.getContext();
        Intrinsics.g(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(com.woolworths.R.id.sliding_pane_detail_container);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(com.woolworths.R.dimen.sliding_pane_detail_pane_width));
        layoutParams.f3763a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment fragmentF = getChildFragmentManager().F(com.woolworths.R.id.sliding_pane_detail_container);
        if (fragmentF != null) {
        } else {
            int i = this.e;
            if (i != 0) {
                if (i != 0) {
                    bundle2 = new Bundle();
                    bundle2.putInt("android-support-nav:fragment:graphId", i);
                } else {
                    bundle2 = null;
                }
                navHostFragment = new NavHostFragment();
                if (bundle2 != null) {
                    navHostFragment.setArguments(bundle2);
                }
            } else {
                navHostFragment = new NavHostFragment();
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.g(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = childFragmentManager.e();
            fragmentTransactionE.p = true;
            fragmentTransactionE.g(com.woolworths.R.id.sliding_pane_detail_container, navHostFragment, null, 1);
            fragmentTransactionE.d();
        }
        this.d = new InnerOnBackPressedCallback(slidingPaneLayout);
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.navigation.fragment.AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    view.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = this.f3501a.d;
                    Intrinsics.e(onBackPressedCallback);
                    SlidingPaneLayout slidingPaneLayout2 = slidingPaneLayout;
                    onBackPressedCallback.i(slidingPaneLayout2.h && slidingPaneLayout2.d());
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.d;
            Intrinsics.e(onBackPressedCallback);
            onBackPressedCallback.i(slidingPaneLayout.h && slidingPaneLayout.d());
        }
        OnBackPressedDispatcher f = requireActivity().getF();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OnBackPressedCallback onBackPressedCallback2 = this.d;
        Intrinsics.e(onBackPressedCallback2);
        f.a(viewLifecycleOwner, onBackPressedCallback2);
        return slidingPaneLayout;
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
            this.e = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        int i = this.e;
        if (i != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        View viewRequireView = requireView();
        Intrinsics.f(viewRequireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        Intrinsics.e(((SlidingPaneLayout) viewRequireView).getChildAt(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewStateRestored(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onViewStateRestored(r3)
            androidx.activity.OnBackPressedCallback r3 = r2.d
            kotlin.jvm.internal.Intrinsics.e(r3)
            android.view.View r0 = r2.requireView()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout"
            kotlin.jvm.internal.Intrinsics.f(r0, r1)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout) r0
            boolean r0 = r0.h
            if (r0 == 0) goto L28
            android.view.View r0 = r2.requireView()
            kotlin.jvm.internal.Intrinsics.f(r0, r1)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout) r0
            boolean r0 = r0.d()
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            r3.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.AbstractListDetailFragment.onViewStateRestored(android.os.Bundle):void");
    }
}
