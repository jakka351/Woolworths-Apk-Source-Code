package au.com.woolworths.foundation.shop.editorder;

import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatusKt;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderInteractorImpl;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderInteractor;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditOrderInteractorImpl implements EditOrderInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f8719a;
    public final EditOrderRepository b;
    public final LegacyShoppingModeRepository c;
    public final CollectionModeInteractor d;
    public final PickUpLocatorRepository e;
    public final AccountInteractor f;
    public final ContextScope g;
    public final MutableLiveData h;
    public final MutableLiveData i;

    public EditOrderInteractorImpl(DispatcherProvider dispatcherProvider, EditOrderRepository repository, LegacyShoppingModeRepository shoppingModeRepository, CollectionModeInteractor collectionModeInteractor, PickUpLocatorRepository pickUpLocatorRepository, AccountInteractor accountInteractor) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(repository, "repository");
        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.f8719a = dispatcherProvider;
        this.b = repository;
        this.c = shoppingModeRepository;
        this.d = collectionModeInteractor;
        this.e = pickUpLocatorRepository;
        this.f = accountInteractor;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.h = mutableLiveData;
        this.i = mutableLiveData;
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final void D() {
        if (this.f.d()) {
            BuildersKt.c(this.g, null, null, new EditOrderInteractorImpl$syncEditOrderStatus$1(this, null), 3);
        } else {
            this.h.j(new EditOrderStatus(EditOrderMode.NOT_EDITING, null, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(java.lang.String r6, au.com.woolworths.foundation.shop.editorder.data.EditOrderMode r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$setEditOrderStatus$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$setEditOrderStatus$1 r0 = (au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$setEditOrderStatus$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$setEditOrderStatus$1 r0 = new au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$setEditOrderStatus$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse r6 = r0.p
            kotlin.ResultKt.b(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.b(r8)
            goto L46
        L38:
            kotlin.ResultKt.b(r8)
            r0.s = r4
            au.com.woolworths.foundation.shop.editorder.EditOrderRepository r8 = r5.b
            java.lang.Object r8 = r8.b(r6, r7, r0)
            if (r8 != r1) goto L46
            goto L67
        L46:
            r6 = r8
            au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse r6 = (au.com.woolworths.foundation.shop.editorder.data.SetEditOrderStatusResponse) r6
            r0.p = r6
            r0.s = r3
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.f8719a
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$syncFulfilmentMethod$2 r8 = new au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$syncFulfilmentMethod$2
            r2 = 0
            r8.<init>(r5, r2)
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r8, r0)
            if (r7 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r7 = kotlin.Unit.f24250a
        L65:
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            au.com.woolworths.foundation.shop.editorder.data.EditOrderMode r7 = r6.getCurrentMode()
            r5.P(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl.I(java.lang.String, au.com.woolworths.foundation.shop.editorder.data.EditOrderMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final void N() {
        a.v(this.b.f8720a, "cmo_coach_mark_key", true);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final boolean O() {
        return this.b.f8720a.getBoolean("cmo_coach_mark_key", false);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final void P(EditOrderMode targetMode) {
        Intrinsics.h(targetMode, "targetMode");
        EditOrderStatus editOrderStatus = (EditOrderStatus) this.i.e();
        this.h.m(editOrderStatus != null ? EditOrderStatus.a(editOrderStatus, targetMode, 6) : null);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final boolean e() {
        EditOrderStatus editOrderStatus = (EditOrderStatus) this.i.e();
        return editOrderStatus != null && EditOrderStatusKt.a(editOrderStatus);
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        TrackableValue trackableValue = TrackableValue.K;
        EditOrderStatus editOrderStatus = (EditOrderStatus) this.i.e();
        return TrackingMetadata.Companion.a(trackableValue, Boolean.valueOf((editOrderStatus != null ? editOrderStatus.getMode() : null) == EditOrderMode.EDITING));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final LiveData m() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$fetchEditOrderStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$fetchEditOrderStatus$1 r0 = (au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$fetchEditOrderStatus$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$fetchEditOrderStatus$1 r0 = new au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl$fetchEditOrderStatus$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L27
            goto L51
        L27:
            r5 = move-exception
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.foundation.shop.editorder.EditOrderRepository r5 = r4.b     // Catch: java.lang.Exception -> L27
            androidx.lifecycle.MutableLiveData r2 = r4.i     // Catch: java.lang.Exception -> L27
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Exception -> L27
            au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus r2 = (au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus) r2     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L46
            au.com.woolworths.foundation.shop.editorder.data.EditOrderMode r2 = r2.getMode()     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto L48
        L46:
            au.com.woolworths.foundation.shop.editorder.data.EditOrderMode r2 = au.com.woolworths.foundation.shop.editorder.data.EditOrderMode.NOT_EDITING     // Catch: java.lang.Exception -> L27
        L48:
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L51
            return r1
        L51:
            au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus r5 = (au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus) r5     // Catch: java.lang.Exception -> L27
            androidx.lifecycle.MutableLiveData r0 = r4.h     // Catch: java.lang.Exception -> L27
            r0.j(r5)     // Catch: java.lang.Exception -> L27
            return r5
        L59:
            timber.log.Timber$Forest r0 = timber.log.Timber.f27013a
            r0.p(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.editorder.EditOrderInteractorImpl.t(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderInteractor
    public final void x() {
        EditOrderStatus editOrderStatus = (EditOrderStatus) this.i.e();
        this.h.m(editOrderStatus != null ? EditOrderStatus.a(editOrderStatus, null, 3) : null);
    }
}
