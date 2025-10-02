package au.com.woolworths.base.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0086@¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lau/com/woolworths/base/rewards/account/RewardsActivityInteractor;", "", "<init>", "()V", "mutableShouldRefreshActivityFeed", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "notifyActivityFeedShouldBeRefreshed", "", "onShouldRefreshActivityFeed", UrlHandler.ACTION, "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsActivityInteractor {

    @NotNull
    private final MutableSharedFlow<Boolean> mutableShouldRefreshActivityFeed = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsActivityInteractor", f = "RewardsActivityInteractor.kt", l = {25}, m = "onShouldRefreshActivityFeed")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsActivityInteractor.this.onShouldRefreshActivityFeed(null, this);
        }
    }

    public final void notifyActivityFeedShouldBeRefreshed() {
        this.mutableShouldRefreshActivityFeed.f(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onShouldRefreshActivityFeed(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.base.rewards.account.RewardsActivityInteractor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$1 r0 = (au.com.woolworths.base.rewards.account.RewardsActivityInteractor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$1 r0 = new au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.ResultKt.b(r6)
            goto L42
        L2f:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> r6 = r4.mutableShouldRefreshActivityFeed
            au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$2 r2 = new au.com.woolworths.base.rewards.account.RewardsActivityInteractor$onShouldRefreshActivityFeed$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsActivityInteractor.onShouldRefreshActivityFeed(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
