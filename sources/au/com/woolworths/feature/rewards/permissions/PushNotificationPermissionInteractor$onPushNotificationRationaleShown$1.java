package au.com.woolworths.feature.rewards.permissions;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1", f = "PushNotificationPermissionInteractor.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PushNotificationPermissionInteractor q;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "preferences"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1$1", f = "PushNotificationPermissionInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
        public /* synthetic */ Object p;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            MutablePreferences mutablePreferences = new MutablePreferences(MapsKt.s(((Preferences) this.p).a()), false);
            mutablePreferences.e(PushNotificationPermissionInteractor.e, Boolean.TRUE);
            return mutablePreferences;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1(PushNotificationPermissionInteractor pushNotificationPermissionInteractor, Continuation continuation) {
        super(2, continuation);
        this.q = pushNotificationPermissionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            DataStore dataStore = this.q.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.p = 1;
            if (dataStore.a(anonymousClass1, this) == coroutineSingletons) {
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
