package com.woolworths.scanlibrary.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.data.source.remote.RemoteDataSource;
import com.woolworths.scanlibrary.models.store.Store;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleResumeNext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/ScanNGoRepository;", "Lcom/woolworths/scanlibrary/data/ScanNGoDataSource;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScanNGoRepository implements ScanNGoDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteDataSource f21149a;
    public final Scheduler b;

    public ScanNGoRepository(RemoteDataSource remoteDataSource, Scheduler scheduler) {
        Intrinsics.h(scheduler, "scheduler");
        this.f21149a = remoteDataSource;
        this.b = scheduler;
    }

    public final Single a(int i) {
        return this.f21149a.f21163a.J(i).h(this.b);
    }

    public final Single b(int i) {
        Single<Store> singleR = this.f21149a.f21163a.r(i);
        SingleJust singleJustE = Single.e(new Store("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, 0, null, false, -2, 31, null));
        singleR.getClass();
        return new SingleResumeNext(singleR, Functions.e(singleJustE)).h(this.b);
    }

    public final Single c() {
        return this.f21149a.f21163a.Q().h(this.b);
    }
}
