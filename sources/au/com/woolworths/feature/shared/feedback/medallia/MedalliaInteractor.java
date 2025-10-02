package au.com.woolworths.feature.shared.feedback.medallia;

import YU.a;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaInteractor;", "", "InitState", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MedalliaInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfig f6485a;
    public final Application b;
    public InitState c;
    public final SharedFlowImpl d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaInteractor$InitState;", "", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitState {
        public static final InitState d;
        public static final InitState e;
        public static final InitState f;
        public static final InitState g;
        public static final /* synthetic */ InitState[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            InitState initState = new InitState("NotStarted", 0);
            d = initState;
            InitState initState2 = new InitState("Started", 1);
            e = initState2;
            InitState initState3 = new InitState("Success", 2);
            f = initState3;
            InitState initState4 = new InitState("Failed", 3);
            g = initState4;
            InitState[] initStateArr = {initState, initState2, initState3, initState4};
            h = initStateArr;
            i = EnumEntriesKt.a(initStateArr);
        }

        public static InitState valueOf(String str) {
            return (InitState) Enum.valueOf(InitState.class, str);
        }

        public static InitState[] values() {
            return (InitState[]) h.clone();
        }
    }

    public MedalliaInteractor(AppConfig appConfig, Application application) {
        Intrinsics.h(appConfig, "appConfig");
        this.f6485a = appConfig;
        this.b = application;
        this.c = InitState.d;
        this.d = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
    }

    public static void c(HashMap parameters) {
        Intrinsics.h(parameters, "parameters");
        Timber.f27013a.b("Medallia setCustomParameter" + parameters, new Object[0]);
        MedalliaDigital.setCustomParameters(parameters);
    }

    public static Object d(String str, SuspendLambda suspendLambda) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(suspendLambda));
        MedalliaDigital.showForm(str, new MDResultCallback() { // from class: au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$showForm$2$1
            @Override // com.medallia.digital.mobilesdk.MDResultCallback
            public final void onError(MDExternalError mDExternalError) {
                Timber.f27013a.b(a.A("Medallia showForm error ", mDExternalError != null ? mDExternalError.getMessage() : null), new Object[0]);
                safeContinuation.resumeWith(ResultKt.a(new MedalliaException(mDExternalError != null ? mDExternalError.getMessage() : null)));
            }

            @Override // com.medallia.digital.mobilesdk.MDResultCallback
            public final void onSuccess() {
                Timber.f27013a.b("Medallia showForm success", new Object[0]);
                safeContinuation.resumeWith(Unit.f24250a);
            }
        });
        Object objA = safeContinuation.a();
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final MedalliaInteractor$formFlow$$inlined$filter$1 a(String formId) {
        Intrinsics.h(formId, "formId");
        return new MedalliaInteractor$formFlow$$inlined$filter$1(FlowKt.a(this.d), formId);
    }

    public final boolean b() {
        return this.c == InitState.f;
    }
}
