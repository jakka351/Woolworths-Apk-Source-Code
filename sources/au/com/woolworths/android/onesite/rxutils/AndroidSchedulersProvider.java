package au.com.woolworths.android.onesite.rxutils;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AndroidSchedulersProvider implements SchedulersProvider {
    @Override // au.com.woolworths.android.onesite.rxutils.SchedulersProvider
    public final TrampolineScheduler a() {
        return Schedulers.d;
    }

    @Override // au.com.woolworths.android.onesite.rxutils.SchedulersProvider
    public final Scheduler b() {
        return AndroidSchedulers.a();
    }

    @Override // au.com.woolworths.android.onesite.rxutils.SchedulersProvider
    public final Scheduler c() {
        return Schedulers.b;
    }

    @Override // au.com.woolworths.android.onesite.rxutils.SchedulersProvider
    public final Scheduler d() {
        return Schedulers.c;
    }
}
