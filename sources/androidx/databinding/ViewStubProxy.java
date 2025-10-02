package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBindingImpl;

/* loaded from: classes2.dex */
public class ViewStubProxy {

    /* renamed from: a, reason: collision with root package name */
    public ViewStub f2550a;
    public ViewDataBinding b;
    public View c;
    public ActivitySearchBindingImpl d;

    public ViewStubProxy(ViewStub viewStub) {
        ViewStub.OnInflateListener onInflateListener = new ViewStub.OnInflateListener() { // from class: androidx.databinding.ViewStubProxy.1
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                ViewStubProxy viewStubProxy = ViewStubProxy.this;
                viewStubProxy.c = view;
                viewStubProxy.b = DataBindingUtil.f2545a.b(viewStubProxy.d.m, view, viewStub2.getLayoutResource());
                viewStubProxy.f2550a = null;
                viewStubProxy.d.r();
                viewStubProxy.d.j();
            }
        };
        this.f2550a = viewStub;
        viewStub.setOnInflateListener(onInflateListener);
    }
}
