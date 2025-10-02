package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing;

import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel$onPrimaryActionClicked$1", f = "EverydayExtraLandingViewModel.kt", l = {245, 246, 247}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraLandingViewModel$onPrimaryActionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraLandingViewModel q;
    public final /* synthetic */ EverydayExtrasLandingFooterItem.Button r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EverydayExtrasButtonActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EverydayExtrasButtonActionType everydayExtrasButtonActionType2 = EverydayExtrasButtonActionType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraLandingViewModel$onPrimaryActionClicked$1(EverydayExtraLandingViewModel everydayExtraLandingViewModel, EverydayExtrasLandingFooterItem.Button button, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraLandingViewModel;
        this.r = button;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraLandingViewModel$onPrimaryActionClicked$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraLandingViewModel$onPrimaryActionClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel r0 = r9.q
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor r1 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r9.p
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L29
            if (r3 == r7) goto L25
            if (r3 == r6) goto L21
            if (r3 != r5) goto L19
            kotlin.ResultKt.b(r10)
            return r4
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            kotlin.ResultKt.b(r10)
            return r4
        L25:
            kotlin.ResultKt.b(r10)
            return r4
        L29:
            kotlin.ResultKt.b(r10)
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r10 = r0.h
            au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion r0 = au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics.Landing.Action.d
            au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem$Button r3 = r9.r
            java.lang.String r8 = r3.d
            r0.getClass()
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$submitClick$1 r0 = new au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$submitClick$1
            r0.<init>(r8)
            r10.g(r0)
            au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType r10 = r3.e
            int r10 = r10.ordinal()
            if (r10 == 0) goto L6e
            if (r10 == r7) goto L65
            if (r10 != r6) goto L5f
            java.lang.String r10 = r3.f
            if (r10 != 0) goto L56
            java.lang.String r10 = ""
        L56:
            r9.p = r6
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r2) goto L7f
            goto L7e
        L5f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L65:
            r9.p = r5
            java.lang.Object r10 = r1.b(r9)
            if (r10 != r2) goto L7f
            goto L7e
        L6e:
            r9.p = r7
            kotlinx.coroutines.channels.BufferedChannel r10 = r1.b
            au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor$Event$NavigateToChoosePlan r0 = au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor.Event.NavigateToChoosePlan.f5936a
            java.lang.Object r10 = r10.z(r0, r9)
            if (r10 != r2) goto L7b
            goto L7c
        L7b:
            r10 = r4
        L7c:
            if (r10 != r2) goto L7f
        L7e:
            return r2
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel$onPrimaryActionClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
