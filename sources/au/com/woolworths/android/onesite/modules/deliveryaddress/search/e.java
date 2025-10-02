package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import androidx.lifecycle.f;
import androidx.navigation.compose.h;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Consumer, Function, BiFunction, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((d) obj2).invoke(obj);
                break;
            case 4:
                ((c) obj2).invoke(obj);
                break;
            case 5:
                ((c) obj2).invoke(obj);
                break;
            case 6:
                ((c) obj2).invoke(obj);
                break;
            case 7:
                ((c) obj2).invoke(obj);
                break;
            case 9:
                int i2 = CollectionModeSetupActivity.I;
                ((androidx.navigation.fragment.e) obj2).invoke(obj);
                break;
            case 10:
                ((androidx.navigation.fragment.e) obj2).invoke(obj);
                break;
            case 19:
                ((au.com.woolworths.base.rewards.account.a) obj2).invoke(obj);
                break;
            case 21:
                ((au.com.woolworths.base.rewards.account.a) obj2).invoke(obj);
                break;
            case 26:
                ((au.com.woolworths.feature.shop.account.ui.delete.a) obj2).invoke(obj);
                break;
            case 27:
                ((l) obj2).invoke(obj);
                break;
            default:
                ((l) obj2).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 1:
                c cVar = (c) this.e;
                Intrinsics.h(p0, "p0");
                cVar.invoke(p0);
                return ObservableEmpty.d;
            case 2:
                c cVar2 = (c) this.e;
                Intrinsics.h(p0, "p0");
                cVar2.invoke(p0);
                return ObservableEmpty.d;
            case 3:
                c cVar3 = (c) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) cVar3.invoke(p0);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            default:
                return RewardsAccountInteractorImpl.getRewardsSignupDetails$lambda$2((au.com.woolworths.android.onesite.repository.b) this.e, p0);
            case 8:
                c cVar4 = (c) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) cVar4.invoke(p0);
            case 12:
                androidx.navigation.a aVar = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) aVar.invoke(p0);
            case 13:
                au.com.woolworths.android.onesite.repository.a aVar2 = (au.com.woolworths.android.onesite.repository.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Result) aVar2.invoke(p0);
            case 14:
                au.com.woolworths.android.onesite.repository.a aVar3 = (au.com.woolworths.android.onesite.repository.a) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) aVar3.invoke(p0);
            case 15:
                return (SingleSource) ((au.com.woolworths.android.onesite.repository.b) this.e).invoke(p0);
            case 16:
                au.com.woolworths.android.onesite.repository.b bVar = (au.com.woolworths.android.onesite.repository.b) this.e;
                Intrinsics.h(p0, "p0");
                return (Result) bVar.invoke(p0);
            case 17:
                au.com.woolworths.android.onesite.repository.b bVar2 = (au.com.woolworths.android.onesite.repository.b) this.e;
                Intrinsics.h(p0, "p0");
                return (SingleSource) bVar2.invoke(p0);
            case 18:
                au.com.woolworths.android.onesite.repository.b bVar3 = (au.com.woolworths.android.onesite.repository.b) this.e;
                Intrinsics.h(p0, "p0");
                return bVar3.invoke(p0);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 23:
                int i2 = RewardsWalletOcrActivity.E;
                Intrinsics.h(e, "e");
                Timber.f27013a.b("RewardsWalletOcrActivity", "Payment card ocr not available.", e);
                ((RewardsWalletOcrActivity) obj).O4();
                break;
            default:
                Intrinsics.h(e, "e");
                Timber.f27013a.a("Payment card ocr not available.", e, new Object[0]);
                ((EverydayExtraSummaryFragment) obj).Q1();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws Exception {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 22:
                int i2 = RewardsWalletOcrActivity.E;
                ((androidx.navigation.fragment.e) obj2).invoke(obj);
                break;
            case 23:
            default:
                ((f) obj2).invoke(obj);
                break;
            case 24:
                ((au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.c) obj2).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object p0, Object p1) {
        h hVar = (h) this.e;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        return (Observable) hVar.invoke(p0, p1);
    }
}
