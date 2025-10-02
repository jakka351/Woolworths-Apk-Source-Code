package au.com.woolworths.android.onesite.modules.mvp;

import au.com.woolworths.android.onesite.modules.mvp.BaseView;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes3.dex */
public class BasePresenterImpl<T extends BaseView> implements BasePresenter<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f4374a;
    public final CompositeDisposable b = new CompositeDisposable();

    @Override // au.com.woolworths.android.onesite.modules.mvp.BasePresenter
    public void a() {
        this.b.e();
        this.f4374a = null;
    }

    public final boolean i() {
        return this.f4374a != null;
    }
}
