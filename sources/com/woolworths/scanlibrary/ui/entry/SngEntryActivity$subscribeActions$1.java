package com.woolworths.scanlibrary.ui.entry;

import android.app.Activity;
import android.content.Intent;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.scanlibrary.ui.entry.SngEntryContract;
import com.woolworths.scanlibrary.ui.entry.launcher.SngLauncherImpl;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1", f = "SngEntryActivity.kt", l = {134}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class SngEntryActivity$subscribeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SngEntryActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$2", f = "SngEntryActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<SngEntryContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ SngEntryActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SngEntryActivity sngEntryActivity, Continuation continuation) {
            super(2, continuation);
            this.q = sngEntryActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((SngEntryContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            SngEntryContract.Actions actions = (SngEntryContract.Actions) this.p;
            int i = SngEntryActivity.I;
            boolean zC = Intrinsics.c(actions, SngEntryContract.Actions.Close.f21245a);
            SngEntryActivity sngEntryActivity = this.q;
            if (zC) {
                sngEntryActivity.finish();
            } else if (Intrinsics.c(actions, SngEntryContract.Actions.ShowTutorial.f21249a)) {
                Intent intent = new Intent(sngEntryActivity, (Class<?>) OnBoardingActivity.class);
                intent.addFlags(0);
                sngEntryActivity.startActivity(intent);
            } else {
                boolean zC2 = Intrinsics.c(actions, SngEntryContract.Actions.OpenSng.f21246a);
                Activities.SngRewardsSetupActivity sngRewardsSetupActivity = Activities.SngRewardsSetupActivity.f4540a;
                if (zC2) {
                    SngLauncherImpl sngLauncherImpl = sngEntryActivity.E;
                    if (sngLauncherImpl == null) {
                        Intrinsics.p("sngLauncher");
                        throw null;
                    }
                    sngLauncherImpl.j = sngEntryActivity;
                    RewardsCardData cardData = sngLauncherImpl.e.getB();
                    String number = cardData != null ? cardData.getNumber() : null;
                    if (number == null || StringsKt.D(number)) {
                        Activity activity = sngLauncherImpl.j;
                        if (activity != null) {
                            activity.startActivityForResult(ActivityNavigatorKt.a(sngRewardsSetupActivity, ApplicationType.e), GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                        }
                    } else {
                        sngLauncherImpl.b();
                    }
                } else if (Intrinsics.c(actions, SngEntryContract.Actions.ShowNearestStore.f21248a)) {
                    int i2 = AvailableStoreListActivity.I;
                    Intent intent2 = new Intent(sngEntryActivity, (Class<?>) AvailableStoreListActivity.class);
                    intent2.addFlags(0);
                    sngEntryActivity.startActivity(intent2);
                } else {
                    if (!Intrinsics.c(actions, SngEntryContract.Actions.ShowAddRewardSetup.f21247a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sngEntryActivity.startActivity(ActivityNavigatorKt.a(sngRewardsSetupActivity, ApplicationType.e));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SngEntryActivity$subscribeActions$1(SngEntryActivity sngEntryActivity, Continuation continuation) {
        super(2, continuation);
        this.q = sngEntryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SngEntryActivity$subscribeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SngEntryActivity$subscribeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = SngEntryActivity.I;
            final SngEntryActivity sngEntryActivity = this.q;
            final Flow flow = sngEntryActivity.V4().n;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(sngEntryActivity, null), new Flow<SngEntryContract.Actions>() { // from class: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;
                    public final /* synthetic */ SngEntryActivity e;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2", f = "SngEntryActivity.kt", l = {50}, m = "emit")
                    /* renamed from: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object p;
                        public int q;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.p = obj;
                            this.q |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, SngEntryActivity sngEntryActivity) {
                        this.d = flowCollector;
                        this.e = sngEntryActivity;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L52
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            r6 = r5
                            com.woolworths.scanlibrary.ui.entry.SngEntryContract$Actions r6 = (com.woolworths.scanlibrary.ui.entry.SngEntryContract.Actions) r6
                            com.woolworths.scanlibrary.ui.entry.SngEntryActivity r6 = r4.e
                            androidx.lifecycle.Lifecycle r6 = r6.getD()
                            androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                            int r6 = r6.compareTo(r2)
                            if (r6 < 0) goto L52
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L52
                            return r1
                        L52:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.entry.SngEntryActivity$subscribeActions$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, sngEntryActivity), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            });
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
