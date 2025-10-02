package au.com.woolworths.foundation.shop.marketplace.education.ui;

import YU.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetContract;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
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
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetFragment;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetFragment;", "<init>", "()V", "Extras", "HostScreen", "Companion", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EducationBottomSheetFragment extends Hilt_EducationBottomSheetFragment {
    public final ResText j = new ResText(R.string.education_title_content_description);
    public final ViewModelLazy k = new ViewModelLazy(Reflection.f24268a.b(EducationBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_DATA", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static EducationBottomSheetFragment a(Screen screen, BottomSheetContent.Marketplace bottomSheetContent, InfoSection infoSection) {
            Intrinsics.h(bottomSheetContent, "bottomSheetContent");
            Intrinsics.h(infoSection, "infoSection");
            EducationBottomSheetFragment educationBottomSheetFragment = new EducationBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extras_data", new Extras(new HostScreen(screen.getD(), screen.getE(), screen.getF()), bottomSheetContent, infoSection));
            educationBottomSheetFragment.setArguments(bundle);
            return educationBottomSheetFragment;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final HostScreen d;
        public final BottomSheetContent.Marketplace e;
        public final InfoSection f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(HostScreen.CREATOR.createFromParcel(parcel), (BottomSheetContent.Marketplace) parcel.readParcelable(Extras.class.getClassLoader()), (InfoSection) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(HostScreen screen, BottomSheetContent.Marketplace bottomSheetContent, InfoSection infoSection) {
            Intrinsics.h(screen, "screen");
            Intrinsics.h(bottomSheetContent, "bottomSheetContent");
            Intrinsics.h(infoSection, "infoSection");
            this.d = screen;
            this.e = bottomSheetContent;
            this.f = infoSection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Extras(screen=" + this.d + ", bottomSheetContent=" + this.e + ", infoSection=" + this.f + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetFragment$HostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<HostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HostScreen> {
            @Override // android.os.Parcelable.Creator
            public final HostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HostScreen[] newArray(int i) {
                return new HostScreen[i];
            }
        }

        public HostScreen(String screenName, String sectionName, String screenTealiumKey) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(sectionName, "sectionName");
            Intrinsics.h(screenTealiumKey, "screenTealiumKey");
            this.d = screenName;
            this.e = sectionName;
            this.f = screenTealiumKey;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HostScreen)) {
                return false;
            }
            HostScreen hostScreen = (HostScreen) obj;
            return Intrinsics.c(this.d, hostScreen.d) && Intrinsics.c(this.e, hostScreen.e) && Intrinsics.c(this.f, hostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return a.o(a.v("HostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$onCreate$1", f = "EducationBottomSheetFragment.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02271 extends AdaptedFunctionReference implements Function2<EducationBottomSheetContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EducationBottomSheetContract.Actions actions = (EducationBottomSheetContract.Actions) obj;
                EducationBottomSheetFragment educationBottomSheetFragment = (EducationBottomSheetFragment) this.d;
                educationBottomSheetFragment.getClass();
                if (Intrinsics.c(actions, EducationBottomSheetContract.Actions.ContinueAddOrUpdateCart.f8751a)) {
                    educationBottomSheetFragment.dismiss();
                } else if (!(actions instanceof EducationBottomSheetContract.Actions.LaunchInfoSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EducationBottomSheetFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                EducationBottomSheetFragment educationBottomSheetFragment = EducationBottomSheetFragment.this;
                SharedFlowImpl sharedFlowImpl = ((EducationBottomSheetViewModel) educationBottomSheetFragment.k.getD()).m;
                Lifecycle d = educationBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02271(2, educationBottomSheetFragment, EducationBottomSheetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;)V", 4), FlowExtKt.a(sharedFlowImpl, d, Lifecycle.State.h));
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

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BottomSheetContent I1(Bundle bundle) {
        Extras extras;
        BottomSheetContent.Marketplace marketplace;
        if (bundle == null || (extras = (Extras) bundle.getParcelable("extras_data")) == null || (marketplace = extras.e) == null) {
            throw new IllegalArgumentException("extras_data argument is required");
        }
        return marketplace;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    /* renamed from: Q1, reason: from getter */
    public final ResText getJ() {
        return this.j;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BaseBottomSheetViewModel R1() {
        return (EducationBottomSheetViewModel) this.k.getD();
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("extras_data")) == null) {
            throw new IllegalArgumentException("extras_data argument is required");
        }
        EducationBottomSheetViewModel educationBottomSheetViewModel = (EducationBottomSheetViewModel) this.k.getD();
        HostScreen screen = extras.d;
        InfoSection infoSection = extras.f;
        Intrinsics.h(screen, "screen");
        Intrinsics.h(infoSection, "infoSection");
        educationBottomSheetViewModel.j = screen;
        educationBottomSheetViewModel.k = infoSection;
    }
}
