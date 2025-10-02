package au.com.woolworths.sdui.shop.broadcastbanner.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.d;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/broadcastbanner/interactor/BannerDismissInteractor;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BannerDismissInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f10029a;
    public final d b;
    public final MutableStateFlow c = StateFlowKt.a(EmptySet.d);

    public BannerDismissInteractor(DataStore dataStore, d dVar) {
        this.f10029a = dataStore;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$preload$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$preload$1 r0 = (au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$preload$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$preload$1 r0 = new au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$preload$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.p
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
            kotlin.ResultKt.b(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.DataStore r6 = r5.f10029a
            kotlinx.coroutines.flow.Flow r6 = r6.getData()
            kotlinx.coroutines.flow.MutableStateFlow r2 = r5.c
            r0.p = r2
            r0.s = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.w(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r2
        L4a:
            androidx.datastore.preferences.core.Preferences r6 = (androidx.datastore.preferences.core.Preferences) r6
            java.util.Map r6 = r6.a()
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            if (r3 == 0) goto L5f
            r1.add(r2)
            goto L5f
        L7c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.s(r1, r2)
            r6.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L8b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            androidx.datastore.preferences.core.Preferences$Key r2 = (androidx.datastore.preferences.core.Preferences.Key) r2
            java.lang.String r2 = r2.f2589a
            r6.add(r2)
            goto L8b
        La3:
            java.util.Set r6 = kotlin.collections.CollectionsKt.L0(r6)
            r0.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$1 r0 = (au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$1 r0 = new au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.datastore.preferences.core.Preferences$Key r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            if (r5 == 0) goto L69
            java.lang.String r5 = r4.c(r5)
            androidx.datastore.preferences.core.Preferences$Key r5 = androidx.datastore.preferences.core.PreferencesKeys.a(r5)
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$3 r6 = new au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor$storeDismissedBanner$3
            r2 = 0
            r6.<init>(r5, r2)
            r0.p = r5
            r0.s = r3
            androidx.datastore.core.DataStore r2 = r4.f10029a
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.a(r2, r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.c
            java.lang.Object r0 = r6.getValue()
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r2 = r5.f2589a
            java.util.LinkedHashSet r1 = kotlin.collections.SetsKt.h(r1, r2)
            boolean r6 = r6.d(r0, r1)
            if (r6 == 0) goto L51
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L69:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bannerId must not be null when the broadcast banner is dismissible."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String c(String str) {
        String str2 = (String) this.b.invoke();
        if (str2 == null) {
            str2 = "Guest";
        }
        return a.i(str2, "_", str, "_dismissed");
    }
}
