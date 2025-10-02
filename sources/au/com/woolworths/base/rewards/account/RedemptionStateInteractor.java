package au.com.woolworths.base.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.salesforce.marketingcloud.UrlHandler;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/base/rewards/account/RedemptionStateInteractor;", "", "Lau/com/woolworths/base/rewards/account/RedemptionStateRepository;", "settingRepository", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "dispatcherProvider", "<init>", "(Lau/com/woolworths/base/rewards/account/RedemptionStateRepository;Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;)V", "Lkotlin/Function0;", "", UrlHandler.ACTION, "onValueChanged", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyValueChanged", "()V", "Lau/com/woolworths/base/rewards/account/RedemptionStateRepository;", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedemptionStateInteractor {

    @NotNull
    private final DispatcherProvider dispatcherProvider;

    @NotNull
    private final RedemptionStateRepository settingRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RedemptionStateInteractor", f = "RedemptionStateInteractor.kt", l = {28}, m = "onValueChanged")
    /* renamed from: au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$1, reason: invalid class name */
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
            return RedemptionStateInteractor.this.onValueChanged(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$2", f = "RedemptionStateInteractor.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final /* synthetic */ Function0<Unit> $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$action = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RedemptionStateInteractor.this.new AnonymousClass2(this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SharedFlow<Unit> valueChanged = RedemptionStateInteractor.this.settingRepository.getValueChanged();
                final Function0<Unit> function0 = this.$action;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.base.rewards.account.RedemptionStateInteractor.onValueChanged.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        function0.invoke();
                        return Unit.f24250a;
                    }
                };
                this.label = 1;
                if (valueChanged.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Inject
    public RedemptionStateInteractor(@NotNull RedemptionStateRepository settingRepository, @NotNull DispatcherProvider dispatcherProvider) {
        Intrinsics.h(settingRepository, "settingRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.settingRepository = settingRepository;
        this.dispatcherProvider = dispatcherProvider;
    }

    public final void notifyValueChanged() {
        this.settingRepository.notifyValueChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onValueChanged(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.base.rewards.account.RedemptionStateInteractor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$1 r0 = (au.com.woolworths.base.rewards.account.RedemptionStateInteractor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$1 r0 = new au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.ResultKt.b(r7)
            goto L4a
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.dispatcherProvider
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$2 r2 = new au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onValueChanged$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RedemptionStateInteractor.onValueChanged(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
