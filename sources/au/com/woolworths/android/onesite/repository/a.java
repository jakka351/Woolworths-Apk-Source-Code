package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.rxutils.Result;
import io.reactivex.Single;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TrolleyInteractorImpl e;

    public /* synthetic */ a(TrolleyInteractorImpl trolleyInteractorImpl, int i) {
        this.d = i;
        this.e = trolleyInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                TrolleyResult trolleyResult = (TrolleyResult) obj;
                Intrinsics.h(trolleyResult, "trolleyResult");
                trolleyResult.removePaddedZeroes();
                Result resultB = Result.Companion.b(trolleyResult);
                this.e.o.f(resultB);
                return resultB;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.h(it, "it");
                Timber.f27013a.p(it);
                Result resultA = Result.Companion.a(it);
                this.e.o.f(resultA);
                return Single.e(resultA);
        }
    }
}
