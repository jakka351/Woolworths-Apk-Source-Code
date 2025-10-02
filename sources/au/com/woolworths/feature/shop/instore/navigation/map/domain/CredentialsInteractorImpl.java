package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Credentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/CredentialsInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/CredentialsInteractor;", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialsInteractorImpl implements CredentialsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Credentials f7364a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/CredentialsInteractorImpl$Companion;", "", "", "ORIIENT_DOMAIN_NAME", "Ljava/lang/String;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CredentialsInteractorImpl(String apiKey) {
        Intrinsics.h(apiKey, "apiKey");
        this.f7364a = new Credentials(apiKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$apiAuthenticate$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$apiAuthenticate$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$apiAuthenticate$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$apiAuthenticate$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$apiAuthenticate$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            kotlin.coroutines.SafeContinuation r6 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r6.<init>(r0)
            au.com.woolworths.feature.shop.instore.navigation.map.data.Credentials r0 = r5.f7364a
            r0.getClass()
            java.lang.String r0 = r0.f7333a
            au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$loginToOriient$2$1 r2 = new au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl$loginToOriient$2$1
            r2.<init>()
            java.lang.String r3 = "App User ID"
            java.lang.String r4 = "api.au.oriient.me"
            me.oriient.ipssdk.ips.IPSCore.login(r3, r0, r4, r2)
            java.lang.Object r6 = r6.a()
            if (r6 != r1) goto L57
            return r1
        L57:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult r6 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult) r6
            r6.getClass()
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Success
            if (r0 == 0) goto L68
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Success r6 = new au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Success
            kotlin.Unit r0 = kotlin.Unit.f24250a
            r6.<init>(r0)
            return r6
        L68:
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure
            if (r0 == 0) goto L76
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Failure r0 = new au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Failure
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Failure r6 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure) r6
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError r6 = r6.f7367a
            r0.<init>(r6)
            return r0
        L76:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
