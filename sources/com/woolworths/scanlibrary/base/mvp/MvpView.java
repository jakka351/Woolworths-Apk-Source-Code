package com.woolworths.scanlibrary.base.mvp;

import android.R;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.tap.a;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import com.woolworths.scanlibrary.util.widget.d;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ErrorType", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MvpView<T extends MvpPresenter> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvp/MvpView$ErrorType;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorType {
        public static final ErrorType d;
        public static final ErrorType e;
        public static final ErrorType f;
        public static final /* synthetic */ ErrorType[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            ErrorType errorType = new ErrorType("GENERAL", 0);
            ErrorType errorType2 = new ErrorType("NETWORK", 1);
            d = errorType2;
            ErrorType errorType3 = new ErrorType("NO_NETWORK", 2);
            e = errorType3;
            ErrorType errorType4 = new ErrorType("OTHER", 3);
            f = errorType4;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4};
            g = errorTypeArr;
            h = EnumEntriesKt.a(errorTypeArr);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) g.clone();
        }
    }

    static void o0(DaggerBaseFragment daggerBaseFragment, String[] strArr) {
        LoadingViewDelegate loadingViewDelegate = daggerBaseFragment.k;
        if (loadingViewDelegate != null) {
            CompositeDisposable compositeDisposable = loadingViewDelegate.d;
            TextSwitcher textSwitcher = loadingViewDelegate.c;
            if (strArr.length != 0) {
                compositeDisposable.e();
                textSwitcher.setVisibility(0);
                loadingViewDelegate.b.setVisibility(0);
                ArrayList arrayListQ0 = ArraysKt.q0(strArr);
                loadingViewDelegate.e = arrayListQ0;
                String str = (String) arrayListQ0.remove(0);
                textSwitcher.setOutAnimation(null);
                textSwitcher.setInAnimation(null);
                textSwitcher.setText(str);
                FragmentActivity fragmentActivity = loadingViewDelegate.f;
                if (fragmentActivity != null) {
                    ArrayList arrayList = loadingViewDelegate.e;
                    if (arrayList == null) {
                        Intrinsics.p("wappleMessages");
                        throw null;
                    }
                    if (!arrayList.isEmpty()) {
                        textSwitcher.setOutAnimation(AnimationUtils.loadAnimation(fragmentActivity, R.anim.slide_out_right));
                        textSwitcher.setInAnimation(AnimationUtils.loadAnimation(fragmentActivity, R.anim.slide_in_left));
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Scheduler scheduler = Schedulers.b;
                        ObjectHelper.b(timeUnit, "unit is null");
                        ObjectHelper.b(scheduler, "scheduler is null");
                        ObservableObserveOn observableObserveOnF = new ObservableInterval(Math.max(0L, 3000L), Math.max(0L, 3000L), scheduler).f(AndroidSchedulers.a());
                        LambdaObserver lambdaObserver = new LambdaObserver(new a(new d(loadingViewDelegate, 1), 7), Functions.e);
                        observableObserveOnF.a(lambdaObserver);
                        compositeDisposable.d(lambdaObserver);
                    }
                }
            }
            loadingViewDelegate.c();
        }
    }

    default void N3(boolean z) {
    }

    default void W3(boolean z) {
    }

    void i0(ErrorType errorType);

    void k1(MvpPresenter mvpPresenter);

    void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0);
}
