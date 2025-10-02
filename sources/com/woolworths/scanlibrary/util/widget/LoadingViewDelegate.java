package com.woolworths.scanlibrary.util.widget;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/LoadingViewDelegate;", "Lcom/woolworths/scanlibrary/util/widget/LoadingView;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadingViewDelegate implements LoadingView {

    /* renamed from: a, reason: collision with root package name */
    public final WooliesProgressView f21380a;
    public final FrameLayout b;
    public final TextSwitcher c;
    public final CompositeDisposable d = new CompositeDisposable();
    public ArrayList e;
    public FragmentActivity f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/LoadingViewDelegate$Companion;", "", "", "SPINNER_TIMEOUT_MSEC", "J", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public LoadingViewDelegate(final FragmentActivity fragmentActivity) {
        this.f = fragmentActivity;
        View rootView = fragmentActivity.findViewById(R.id.content).getRootView();
        Intrinsics.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        RelativeLayout relativeLayout = new RelativeLayout(fragmentActivity);
        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
        frameLayout.setId(com.woolworths.R.id.sng_wapple_background);
        frameLayout.setBackgroundResource(com.woolworths.R.color.background_semi_transparent);
        relativeLayout.addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
        this.b = frameLayout;
        WooliesProgressView wooliesProgressView = new WooliesProgressView(fragmentActivity, null);
        wooliesProgressView.setId(com.woolworths.R.id.sng_wapple);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.addView(wooliesProgressView, layoutParams);
        this.f21380a = wooliesProgressView;
        TextSwitcher textSwitcher = new TextSwitcher(fragmentActivity);
        textSwitcher.setId(com.woolworths.R.id.sng_wapple_text);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.woolworths.scanlibrary.util.widget.c
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                FragmentActivity fragmentActivity2 = fragmentActivity;
                TextView textView = new TextView(fragmentActivity2);
                textView.setGravity(49);
                textView.setTextColor(-1);
                textView.setTextSize(0, fragmentActivity2.getResources().getDimension(com.woolworths.R.dimen.sng_wapple_text_size));
                return textView;
            }
        });
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(fragmentActivity.getResources().getDimensionPixelSize(com.woolworths.R.dimen.sng_general_spacing), fragmentActivity.getResources().getDimensionPixelSize(com.woolworths.R.dimen.sng_spacing_small), fragmentActivity.getResources().getDimensionPixelSize(com.woolworths.R.dimen.sng_general_spacing), fragmentActivity.getResources().getDimensionPixelSize(com.woolworths.R.dimen.sng_general_spacing));
        layoutParams2.addRule(3, com.woolworths.R.id.sng_wapple);
        relativeLayout.addView(textSwitcher, layoutParams2);
        this.c = textSwitcher;
        ((ViewGroup) rootView).addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        b();
    }

    public final void a() {
        b();
        this.d.e();
        this.f = null;
    }

    public final void b() {
        try {
            FragmentActivity fragmentActivity = this.f;
            if (fragmentActivity == null) {
                return;
            }
            if (fragmentActivity == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.d.e();
            this.c.setVisibility(8);
            this.f21380a.setVisibility(8);
            this.b.setVisibility(8);
            fragmentActivity.getWindow().clearFlags(16);
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        FragmentActivity fragmentActivity = this.f;
        if (fragmentActivity == null) {
            return;
        }
        this.f21380a.setVisibility(0);
        fragmentActivity.getWindow().setFlags(16, 16);
        ObservableObserveOn observableObserveOnF = Observable.k(61000L, TimeUnit.MILLISECONDS).f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver = new LambdaObserver(new com.woolworths.scanlibrary.ui.tap.a(new d(this, 0), 6), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        this.d.d(lambdaObserver);
    }
}
