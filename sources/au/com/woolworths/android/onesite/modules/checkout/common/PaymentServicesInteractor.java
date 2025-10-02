package au.com.woolworths.android.onesite.modules.checkout.common;

import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesInteractor;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PaymentServicesInteractor {
    Single a();

    SingleSubscribeOn b(boolean z);

    SingleOnErrorReturn c();

    void d(boolean z);

    boolean e();

    boolean f();

    String[] g();

    void h();

    boolean i(String str);

    BehaviorSubject j();

    boolean k();

    boolean l();
}
