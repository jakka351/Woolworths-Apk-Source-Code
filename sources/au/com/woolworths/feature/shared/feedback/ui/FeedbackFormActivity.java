package au.com.woolworths.feature.shared.feedback.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c;
import au.com.woolworths.feature.shared.feedback.databinding.ActivityFeedbackFormBinding;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FeedbackFormActivity extends Hilt_FeedbackFormActivity {
    public static final /* synthetic */ int z = 0;
    public AppConfig x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(FeedbackFormViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormActivity$Companion;", "", "", "FEEDBACK_PARAM_INTERACTION_ID", "Ljava/lang/String;", "FEEDBACK_PARAM_BRAND", "FEEDBACK_PARAM_CUSTOMER_NAME", "FEEDBACK_PARAM_SESSION_ID", "FEEDBACK_PARAM_AGENT_PLATFORM", "FEEDBACK_PARAM_SURVEY_FIRST_INTENT", "FEEDBACK_PARAM_SURVEY_LAST_INTENT", "Extras", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormActivity$Companion$Extras;", "Landroid/os/Parcelable;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String formId) {
                Intrinsics.h(formId, "formId");
                this.d = formId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return YU.a.h("Extras(formId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$onCreate$4", f = "FeedbackFormActivity.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$onCreate$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity$onCreate$4$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<FeedbackFormContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FeedbackFormContract.Actions actions = (FeedbackFormContract.Actions) obj;
                FeedbackFormActivity feedbackFormActivity = (FeedbackFormActivity) this.d;
                int i = FeedbackFormActivity.z;
                feedbackFormActivity.getClass();
                if (actions instanceof FeedbackFormContract.Actions.OnDisplayResult) {
                    Intent intent = new Intent();
                    intent.putExtra("FEEDBACK_FORM_RESULT_MESSAGE", ((FeedbackFormContract.Actions.OnDisplayResult) actions).f6494a);
                    feedbackFormActivity.setResult(-1, intent);
                    feedbackFormActivity.finish();
                } else {
                    if (!(actions instanceof FeedbackFormContract.Actions.MedalliaEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    feedbackFormActivity.finish();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FeedbackFormActivity.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = FeedbackFormActivity.z;
                FeedbackFormActivity feedbackFormActivity = FeedbackFormActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, feedbackFormActivity, FeedbackFormActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shared/feedback/ui/FeedbackFormContract$Actions;)V", 4), ((FeedbackFormViewModel) feedbackFormActivity.y.getD()).h);
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    public static final void O4(String str, HashMap map, String str2) {
        if (str == null || str.length() <= 0) {
            return;
        }
        map.put(str2, str);
    }

    @Override // au.com.woolworths.feature.shared.feedback.ui.Hilt_FeedbackFormActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.FeedbackForm.Extras extras = (Activities.FeedbackForm.Extras) getIntent().getParcelableExtra("FEEDBACK_FORM_EXTRA");
        if (extras == null) {
            throw new IllegalArgumentException("Extras should be present!");
        }
        ViewModelLazy viewModelLazy = this.y;
        FeedbackFormViewModel feedbackFormViewModel = (FeedbackFormViewModel) viewModelLazy.getD();
        String str = extras.d;
        if (str == null) {
            throw new IllegalArgumentException("formId should be present!");
        }
        feedbackFormViewModel.i = str;
        FeedbackFormViewModel feedbackFormViewModel2 = (FeedbackFormViewModel) viewModelLazy.getD();
        HashMap map = new HashMap();
        O4(extras.f, map, "brand");
        O4(extras.g, map, "customerName");
        O4(extras.e, map, "interactionId");
        O4(extras.h, map, "sessionId");
        O4(extras.i, map, "agentPlatform");
        O4(extras.j, map, "firstIntent");
        O4(extras.k, map, "lastIntent");
        feedbackFormViewModel2.j = map;
        setSupportActionBar(((ActivityFeedbackFormBinding) DataBindingUtil.d(this, R.layout.activity_feedback_form)).y);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass4(null), 3);
        ((FeedbackFormViewModel) viewModelLazy.getD()).g.f(this, new FeedbackFormActivity$sam$androidx_lifecycle_Observer$0(new c(17)));
        FeedbackFormViewModel feedbackFormViewModel3 = (FeedbackFormViewModel) viewModelLazy.getD();
        BuildersKt.c(ViewModelKt.a(feedbackFormViewModel3), null, null, new FeedbackFormViewModel$showFeedbackForm$1(feedbackFormViewModel3, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean zOnOptionsItemSelected;
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                finish();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
