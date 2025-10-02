package com.woolworths.scanlibrary.ui.tap;

import android.content.IntentSender;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.ui.splash.d;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.C1191c;
import me.oriient.internal.infra.locationManager.C1194f;
import me.oriient.internal.infra.locationManager.FusedLocationManager;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements OnCompleteListener, Consumer, OnSuccessListener, VisibleTilesResolver.ScaleProvider {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.d) {
            case 1:
                ((d) this.e).invoke(obj);
                break;
            case 2:
            default:
                ((com.woolworths.scanlibrary.util.widget.d) this.e).invoke(obj);
                break;
            case 3:
                ((i) this.e).invoke(obj);
                break;
            case 4:
                ((i) this.e).invoke(obj);
                break;
            case 5:
                ((j) this.e).invoke(obj);
                break;
            case 6:
                ((com.woolworths.scanlibrary.util.widget.d) this.e).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) throws Throwable {
        switch (this.d) {
            case 0:
                TapPresenter tapPresenter = (TapPresenter) this.e;
                Intrinsics.h(task, "task");
                if (!task.isSuccessful()) {
                    Timber.f27013a.p(task.getException());
                    break;
                } else {
                    String str = (String) task.getResult();
                    if (str != null && !str.equals(tapPresenter.f.a())) {
                        DeviceRegistrationUC.RequestValues requestValues = new DeviceRegistrationUC.RequestValues();
                        requestValues.f21179a = str;
                        CompositeDisposable compositeDisposable = tapPresenter.b;
                        Single singleB = tapPresenter.g.b(requestValues);
                        a aVar = new a(new d(1, tapPresenter, str), 1);
                        com.google.common.net.a aVar2 = new com.google.common.net.a(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(22), 24);
                        singleB.getClass();
                        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(aVar, aVar2);
                        singleB.a(consumerSingleObserver);
                        compositeDisposable.d(consumerSingleObserver);
                        break;
                    }
                }
                break;
            default:
                TapOnFragment tapOnFragment = (TapOnFragment) this.e;
                Intrinsics.h(task, "task");
                try {
                    task.getResult(ApiException.class);
                    ((TapOnContract.Presenter) tapOnFragment.Q1()).c1();
                    tapOnFragment.q2();
                    break;
                } catch (ApiException e) {
                    if (e.getStatusCode() == 6) {
                        try {
                            ((ResolvableApiException) e).startResolutionForResult(tapOnFragment.requireActivity(), 2);
                            return;
                        } catch (Exception e2) {
                            if ((e2 instanceof IntentSender.SendIntentException) || (e2 instanceof ClassCastException)) {
                                return;
                            }
                            Timber.f27013a.p(e2);
                        }
                    }
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.d) {
            case 8:
                FusedLocationManager.fetchLastKnownLocation$lambda$3((C1191c) this.e, obj);
                break;
            default:
                FusedLocationManager.requestSingleUpdate$lambda$2((C1194f) this.e, obj);
                break;
        }
    }
}
