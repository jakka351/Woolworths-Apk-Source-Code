package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class c extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private k f16997a;

    public class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16998a;

        public a(boolean z) {
            this.f16998a = z;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FragmentActivity activity;
            View view = c.this.getView();
            if (view != null) {
                view.setLayerType(0, null);
            }
            if (this.f16998a || (activity = c.this.getActivity()) == null) {
                return;
            }
            activity.finish();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private int a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.layout.mcsdk_iam_banner_top : R.layout.mcsdk_iam_banner_bottom;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f16997a = (k) getArguments().getParcelable("messageHandler");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) throws Resources.NotFoundException {
        View view;
        Animation animationOnCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (animationOnCreateAnimation == null && i2 != 0) {
            animationOnCreateAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
        }
        if (animationOnCreateAnimation != null && (view = getView()) != null) {
            view.setLayerType(2, null);
            animationOnCreateAnimation.setAnimationListener(new a(z));
        }
        return animationOnCreateAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k kVar = this.f16997a;
        if (kVar == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(a(kVar.d()), viewGroup, false);
        b bVar = new b(getActivity() instanceof View.OnClickListener ? (View.OnClickListener) getActivity() : null, this.f16997a.k());
        bVar.a(viewInflate, this.f16997a);
        SwipeDismissConstraintLayout swipeDismissConstraintLayout = (SwipeDismissConstraintLayout) viewInflate.findViewById(bVar.g());
        if (swipeDismissConstraintLayout != null && (getActivity() instanceof SwipeDismissConstraintLayout.SwipeDismissListener)) {
            swipeDismissConstraintLayout.setListener((SwipeDismissConstraintLayout.SwipeDismissListener) getActivity());
        }
        return viewInflate;
    }

    public static c a(k kVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("messageHandler", kVar);
        c cVar = new c();
        cVar.setArguments(bundle);
        return cVar;
    }
}
