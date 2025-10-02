package au.com.woolworths.android.onesite.modules.mvp;

import au.com.woolworths.android.onesite.modules.mvp.BaseView;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes3.dex */
public class BaseLifeCyclePresenterImpl<T extends BaseView> implements BaseLifeCyclePresenter<T> {

    /* renamed from: a, reason: collision with root package name */
    public BaseView f4373a;
    public CompositeDisposable b;
    public CompositeDisposable c;

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseLifeCyclePresenter
    public final void a() {
        this.b.e();
        this.f4373a = null;
    }

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseLifeCyclePresenter
    public final void c(Object obj) {
        this.f4373a = (BaseView) obj;
    }

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseLifeCyclePresenter
    public final void destroy() {
        this.c.e();
    }
}
