package au.com.woolworths.feature.shared.feedback.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/Feedback2FormViewModel;", "Landroidx/lifecycle/ViewModel;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Feedback2FormViewModel extends ViewModel {
    public final MedalliaInteractor e;
    public final JwtRepositoryImpl f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final ThemeContext i;
    public final au.com.woolworths.design.core.ui.foundation.ThemeContext j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ApplicationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ApplicationType applicationType = ApplicationType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Feedback2FormViewModel(MedalliaInteractor medalliaInteractor, JwtRepositoryImpl jwtRepositoryImpl, ApplicationType applicationType) {
        ThemeContext themeContext;
        au.com.woolworths.design.core.ui.foundation.ThemeContext themeContext2;
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(applicationType, "applicationType");
        this.e = medalliaInteractor;
        this.f = jwtRepositoryImpl;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new Feedback2FormContract.ViewState(Feedback2FormContract.Status.d, null));
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        int iOrdinal = applicationType.ordinal();
        if (iOrdinal == 0) {
            themeContext = ThemeContext.e;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            themeContext = ThemeContext.d;
        }
        this.i = themeContext;
        int iOrdinal2 = applicationType.ordinal();
        if (iOrdinal2 == 0) {
            themeContext2 = au.com.woolworths.design.core.ui.foundation.ThemeContext.e;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            themeContext2 = au.com.woolworths.design.core.ui.foundation.ThemeContext.d;
        }
        this.j = themeContext2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            boolean r0 = r6 instanceof au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFeedbackForm$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFeedbackForm$1 r0 = (au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFeedbackForm$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFeedbackForm$1 r0 = new au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFeedbackForm$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)     // Catch: java.lang.IllegalArgumentException -> L27
            goto L45
        L27:
            r5 = move-exception
            goto L73
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor r6 = r4.e     // Catch: java.lang.IllegalArgumentException -> L27
            boolean r6 = r6.b()     // Catch: java.lang.IllegalArgumentException -> L27
            if (r6 == 0) goto L6b
            r0.r = r3     // Catch: java.lang.IllegalArgumentException -> L27
            java.lang.Object r6 = r4.r6(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L27
            if (r6 != r1) goto L45
            return r1
        L45:
            au.com.woolworths.feature.shared.feedback.data.Feedback2FormData r6 = (au.com.woolworths.feature.shared.feedback.data.Feedback2FormData) r6     // Catch: java.lang.IllegalArgumentException -> L27
            if (r6 == 0) goto L67
            java.lang.String r5 = r6.f6477a     // Catch: java.lang.IllegalArgumentException -> L27
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L27
            if (r0 <= 0) goto L5f
            java.util.Map r6 = r6.b     // Catch: java.lang.IllegalArgumentException -> L27
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.IllegalArgumentException -> L27
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L27
            r0.putAll(r6)     // Catch: java.lang.IllegalArgumentException -> L27
            r4.u6(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L27
            goto L79
        L5f:
            java.lang.String r5 = "no formId given"
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L27
            r6.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L27
            throw r6     // Catch: java.lang.IllegalArgumentException -> L27
        L67:
            r4.q6()     // Catch: java.lang.IllegalArgumentException -> L27
            goto L79
        L6b:
            java.lang.String r5 = "Medallia not initialized"
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L27
            r6.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L27
            throw r6     // Catch: java.lang.IllegalArgumentException -> L27
        L73:
            t6(r5)
            r4.q6()
        L79:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel.p6(au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void t6(Exception exc) {
        Timber.Forest forest = Timber.f27013a;
        forest.s("Feedback");
        forest.b(YU.a.A("Form error ", exc.getMessage()), new Object[0]);
    }

    public final void q6() {
        MutableStateFlow mutableStateFlow = this.g;
        mutableStateFlow.setValue(Feedback2FormContract.ViewState.a((Feedback2FormContract.ViewState) mutableStateFlow.getValue(), Feedback2FormContract.Status.e, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r6(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException, java.lang.IllegalArgumentException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$getFormParams$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$getFormParams$1 r0 = (au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$getFormParams$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$getFormParams$1 r0 = new au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$getFormParams$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.android.onesite.jwt.JwtRepositoryImpl r6 = r4.f
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse r6 = (au.com.woolworths.android.onesite.jwt.RewardsJwtResponse) r6
            boolean r5 = r6 instanceof au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Verified
            if (r5 == 0) goto L68
            kotlinx.serialization.json.Json$Default r5 = kotlinx.serialization.json.Json.d     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            au.com.woolworths.android.onesite.jwt.RewardsJwtResponse$Verified r6 = (au.com.woolworths.android.onesite.jwt.RewardsJwtResponse.Verified) r6     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            java.lang.String r6 = r6.f4262a     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            au.com.woolworths.feature.shared.feedback.data.Feedback2FormData$Companion r0 = au.com.woolworths.feature.shared.feedback.data.Feedback2FormData.INSTANCE     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            kotlinx.serialization.KSerializer r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.builtins.BuiltinSerializersKt.d(r0)     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            kotlinx.serialization.DeserializationStrategy r0 = (kotlinx.serialization.DeserializationStrategy) r0     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            java.lang.Object r5 = r5.b(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L5d kotlinx.serialization.SerializationException -> L5f
            return r5
        L5d:
            r5 = move-exception
            goto L61
        L5f:
            r5 = move-exception
            goto L65
        L61:
            t6(r5)
            goto L68
        L65:
            t6(r5)
        L68:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel.r6(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void s6(String formId, Map map) {
        Intrinsics.h(formId, "formId");
        try {
            if (!this.e.b()) {
                throw new IllegalArgumentException("Medallia not initialized");
            }
            HashMap map2 = new HashMap();
            map2.putAll(map);
            BuildersKt.c(ViewModelKt.a(this), null, null, new Feedback2FormViewModel$launchShowFeedbackForm$3(this, formId, map2, null), 3);
        } catch (IllegalArgumentException e) {
            t6(e);
            q6();
        }
    }

    public final Job u6(String str, HashMap map) {
        MutableStateFlow mutableStateFlow = this.g;
        mutableStateFlow.setValue(Feedback2FormContract.ViewState.a((Feedback2FormContract.ViewState) mutableStateFlow.getValue(), Feedback2FormContract.Status.d, 2));
        return BuildersKt.c(ViewModelKt.a(this), null, null, new Feedback2FormViewModel$showFormWithParams$2(this, str, map, null), 3);
    }
}
