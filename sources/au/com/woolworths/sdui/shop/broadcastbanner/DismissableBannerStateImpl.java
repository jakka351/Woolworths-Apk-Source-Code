package au.com.woolworths.sdui.shop.broadcastbanner;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.preferences.core.PreferencesKeys;
import au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/broadcastbanner/DismissableBannerStateImpl;", "Lau/com/woolworths/sdui/shop/broadcastbanner/DismissableBannerState;", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DismissableBannerStateImpl implements DismissableBannerState {

    /* renamed from: a, reason: collision with root package name */
    public final BasicCoreBroadcastBannerModel f10027a;
    public final BannerDismissInteractor b;
    public final MutableState c;

    public DismissableBannerStateImpl(BasicCoreBroadcastBannerModel model, BannerDismissInteractor bannerDismissInteractor) {
        boolean zContains;
        Intrinsics.h(model, "model");
        this.f10027a = model;
        this.b = bannerDismissInteractor;
        if (model.g) {
            String str = model.f10030a;
            if (str == null) {
                throw new IllegalArgumentException("bannerId must not be null when the broadcast banner is dismissible.");
            }
            zContains = ((Set) bannerDismissInteractor.c.getValue()).contains(PreferencesKeys.a(bannerDismissInteractor.c(str)).f2589a);
        } else {
            zContains = false;
        }
        this.c = SnapshotStateKt.f(Boolean.valueOf(zContains));
    }

    @Override // au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerState
    public final boolean a() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.c).getD()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl$dismiss$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl$dismiss$1 r0 = (au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl$dismiss$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl$dismiss$1 r0 = new au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl$dismiss$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel r5 = r4.f10027a
            java.lang.String r5 = r5.f10030a
            r0.r = r3
            au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor r2 = r4.b
            java.lang.Object r5 = r2.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            androidx.compose.runtime.MutableState r0 = r4.c
            androidx.compose.runtime.SnapshotMutableStateImpl r0 = (androidx.compose.runtime.SnapshotMutableStateImpl) r0
            r0.setValue(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
