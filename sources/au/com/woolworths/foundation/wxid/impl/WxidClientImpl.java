package au.com.woolworths.foundation.wxid.impl;

import androidx.datastore.core.DataStore;
import au.com.woolworths.foundation.wxid.WxidClient;
import au.com.woolworths.foundation.wxid.shop.ShopWxidFetcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/wxid/impl/WxidClientImpl;", "Lau/com/woolworths/foundation/wxid/WxidClient;", "Companion", "wxid-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WxidClientImpl implements WxidClient {

    /* renamed from: a, reason: collision with root package name */
    public final ShopWxidFetcher f8935a;
    public final DataStore b;
    public final WxidSessionImpl c;
    public final CoroutineScope d;
    public final CoroutineDispatcher e;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.wxid.impl.WxidClientImpl$1", f = "WxidClientImpl.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.wxid.impl.WxidClientImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public WxidSessionImpl p;
        public int q;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WxidClientImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WxidSessionImpl wxidSessionImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                WxidClientImpl wxidClientImpl = WxidClientImpl.this;
                WxidSessionImpl wxidSessionImpl2 = wxidClientImpl.c;
                this.p = wxidSessionImpl2;
                this.q = 1;
                obj = wxidClientImpl.e(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wxidSessionImpl = wxidSessionImpl2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wxidSessionImpl = this.p;
                ResultKt.b(obj);
            }
            wxidSessionImpl.a((String) obj);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/wxid/impl/WxidClientImpl$Companion;", "", "", "WXID_FETCH_NEXT_TRY_AFTER_HOURS", "I", "wxid-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public WxidClientImpl(ShopWxidFetcher shopWxidFetcher, DataStore dataStore) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler syncDispatcher = DefaultIoScheduler.f;
        Intrinsics.h(syncDispatcher, "syncDispatcher");
        this.f8935a = shopWxidFetcher;
        this.b = dataStore;
        this.c = WxidSessionImpl.f8936a;
        GlobalScope globalScope = GlobalScope.d;
        this.d = globalScope;
        this.e = syncDispatcher;
        BuildersKt.c(globalScope, syncDispatcher, null, new AnonymousClass1(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(au.com.woolworths.foundation.wxid.impl.WxidClientImpl r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.wxid.impl.WxidClientImpl.d(au.com.woolworths.foundation.wxid.impl.WxidClientImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.wxid.WxidClient
    public final void a() {
        BuildersKt.c(this.d, this.e, null, new WxidClientImpl$syncWxid$1(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.wxid.WxidClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$1 r0 = (au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$1 r0 = new au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$2 r5 = new au.com.woolworths.foundation.wxid.impl.WxidClientImpl$clearWxid$2
            r5.<init>()
            r0.r = r3
            androidx.datastore.core.DataStore r2 = r4.b
            java.lang.Object r5 = androidx.datastore.preferences.core.PreferencesKt.a(r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            au.com.woolworths.foundation.wxid.impl.WxidSessionImpl r5 = r4.c
            r5.getClass()
            r5 = 0
            au.com.woolworths.foundation.wxid.impl.WxidSessionImpl.b = r5
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.wxid.impl.WxidClientImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.wxid.WxidClient
    public final WxidClientImpl$watchWxid$$inlined$map$1 c() {
        return new WxidClientImpl$watchWxid$$inlined$map$1(this.b.getD());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxid$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxid$1 r0 = (au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxid$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxid$1 r0 = new au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxid$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            androidx.datastore.core.DataStore r5 = r4.b
            kotlinx.coroutines.flow.Flow r5 = r5.getD()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            androidx.datastore.preferences.core.Preferences$Key r0 = au.com.woolworths.foundation.wxid.impl.data.WxidDataStore.Keys.f8937a
            java.lang.Object r5 = r5.b(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.wxid.impl.WxidClientImpl.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxidNextFetchAt$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxidNextFetchAt$1 r0 = (au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxidNextFetchAt$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxidNextFetchAt$1 r0 = new au.com.woolworths.foundation.wxid.impl.WxidClientImpl$getStoredWxidNextFetchAt$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            androidx.datastore.core.DataStore r5 = r4.b
            kotlinx.coroutines.flow.Flow r5 = r5.getD()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.w(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            androidx.datastore.preferences.core.Preferences$Key r1 = au.com.woolworths.foundation.wxid.impl.data.WxidDataStore.Keys.b
            java.lang.Object r5 = r5.b(r1)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L54
            long r1 = r5.longValue()
            goto L56
        L54:
            r1 = 0
        L56:
            long r0 = r0.toSeconds(r1)
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.wxid.impl.WxidClientImpl.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
