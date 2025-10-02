package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.ReviewFormSectionReviewInputs;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.ReviewFormSectionTermsAndConditions;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemBodyField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemNameField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemRating;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemTitleField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItems;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewFormViewModel;", "Factory", "TextValidationState", "InputState", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubmitReviewViewModel extends ViewModel implements SubmitReviewFormViewModel {
    public final String e;
    public final AnalyticsManager f;
    public final SubmitReviewInteractor g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public WriteReviewFormData l;
    public String m;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewViewModel$Factory;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        SubmitReviewViewModel a(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewViewModel$InputState;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputState {
        public static final InputState e;
        public static final InputState f;
        public static final InputState g;
        public static final InputState h;
        public static final InputState i;
        public static final InputState j;
        public static final InputState k;
        public static final InputState l;
        public static final InputState m;
        public static final InputState n;
        public static final InputState o;
        public static final InputState p;
        public static final /* synthetic */ InputState[] q;
        public static final /* synthetic */ EnumEntries r;
        public final String d;

        static {
            InputState inputState = new InputState("VALID_INPUT", 0, null);
            e = inputState;
            InputState inputState2 = new InputState("RATING_REQUIRED", 1, "Required");
            f = inputState2;
            InputState inputState3 = new InputState("TNC_REQUIRED", 2, "Required");
            g = inputState3;
            InputState inputState4 = new InputState("REVIEW_TITLE_REQUIRED", 3, "Required");
            h = inputState4;
            InputState inputState5 = new InputState("REVIEW_TITLE_TOO_SHORT", 4, "Title too short");
            i = inputState5;
            InputState inputState6 = new InputState("REVIEW_TITLE_TOO_LONG", 5, "Title too long");
            j = inputState6;
            InputState inputState7 = new InputState("REVIEW_BODY_REQUIRED", 6, "Required");
            k = inputState7;
            InputState inputState8 = new InputState("REVIEW_BODY_TOO_SHORT", 7, "Review too short");
            l = inputState8;
            InputState inputState9 = new InputState("REVIEW_BODY_TOO_LONG", 8, "Review too long");
            m = inputState9;
            InputState inputState10 = new InputState("REVIEW_NICKNAME_REQUIRED", 9, "Required");
            n = inputState10;
            InputState inputState11 = new InputState("REVIEW_NICKNAME_TOO_SHORT", 10, "Name too short");
            o = inputState11;
            InputState inputState12 = new InputState("REVIEW_NICKNAME_TOO_LONG", 11, "Name too long");
            p = inputState12;
            InputState[] inputStateArr = {inputState, inputState2, inputState3, inputState4, inputState5, inputState6, inputState7, inputState8, inputState9, inputState10, inputState11, inputState12};
            q = inputStateArr;
            r = EnumEntriesKt.a(inputStateArr);
        }

        public InputState(String str, int i2, String str2) {
            this.d = str2;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) q.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewViewModel$TextValidationState;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextValidationState {
        public static final TextValidationState d;
        public static final TextValidationState e;
        public static final TextValidationState f;
        public static final TextValidationState g;
        public static final /* synthetic */ TextValidationState[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            TextValidationState textValidationState = new TextValidationState("VALID", 0);
            d = textValidationState;
            TextValidationState textValidationState2 = new TextValidationState("REQUIRED", 1);
            e = textValidationState2;
            TextValidationState textValidationState3 = new TextValidationState("TOO_SHORT", 2);
            f = textValidationState3;
            TextValidationState textValidationState4 = new TextValidationState("TOO_LONG", 3);
            g = textValidationState4;
            TextValidationState[] textValidationStateArr = {textValidationState, textValidationState2, textValidationState3, textValidationState4};
            h = textValidationStateArr;
            i = EnumEntriesKt.a(textValidationStateArr);
        }

        public static TextValidationState valueOf(String str) {
            return (TextValidationState) Enum.valueOf(TextValidationState.class, str);
        }

        public static TextValidationState[] values() {
            return (TextValidationState[]) h.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextValidationState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextValidationState textValidationState = TextValidationState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextValidationState textValidationState2 = TextValidationState.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextValidationState textValidationState3 = TextValidationState.d;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SubmitReviewViewModel(String str, AnalyticsManager analyticsManager, SubmitReviewInteractor submitReviewInteractor, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = str;
        this.f = analyticsManager;
        this.g = submitReviewInteractor;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(1, 1, BufferOverflow.e);
        this.h = sharedFlowImplA;
        this.i = FlowKt.a(sharedFlowImplA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(SubmitReviewContract.ViewState.InProgress.f12775a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        this.m = "";
        if (accountInteractor.d()) {
            q6();
        } else {
            sharedFlowImplA.f(SubmitReviewContract.Action.LaunchLogin.f12769a);
        }
    }

    public static final void p6(SubmitReviewViewModel submitReviewViewModel) {
        WriteReviewFormData writeReviewFormData = submitReviewViewModel.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        submitReviewViewModel.l = WriteReviewFormData.a(writeReviewFormData, null, 0, true, 15);
        MutableStateFlow mutableStateFlow = submitReviewViewModel.j;
        WriteReviewFormData writeReviewFormData2 = submitReviewViewModel.l;
        if (writeReviewFormData2 != null) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData2));
        } else {
            Intrinsics.p("reviewFormData");
            throw null;
        }
    }

    public static InputState v6(ReviewInputItems reviewInputItems) {
        if (reviewInputItems instanceof ReviewInputItemTitleField) {
            ReviewInputItemTitleField reviewInputItemTitleField = (ReviewInputItemTitleField) reviewInputItems;
            int iOrdinal = w6(reviewInputItemTitleField.b, reviewInputItemTitleField.c, reviewInputItemTitleField.d, reviewInputItemTitleField.g).ordinal();
            if (iOrdinal == 0) {
                return InputState.e;
            }
            if (iOrdinal == 1) {
                return InputState.h;
            }
            if (iOrdinal == 2) {
                return InputState.i;
            }
            if (iOrdinal == 3) {
                return InputState.j;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (reviewInputItems instanceof ReviewInputItemBodyField) {
            ReviewInputItemBodyField reviewInputItemBodyField = (ReviewInputItemBodyField) reviewInputItems;
            int iOrdinal2 = w6(reviewInputItemBodyField.b, reviewInputItemBodyField.c, reviewInputItemBodyField.d, reviewInputItemBodyField.g).ordinal();
            if (iOrdinal2 == 0) {
                return InputState.e;
            }
            if (iOrdinal2 == 1) {
                return InputState.k;
            }
            if (iOrdinal2 == 2) {
                return InputState.l;
            }
            if (iOrdinal2 == 3) {
                return InputState.m;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(reviewInputItems instanceof ReviewInputItemNameField)) {
            if (!(reviewInputItems instanceof ReviewInputItemRating)) {
                return InputState.e;
            }
            Integer num = ((ReviewInputItemRating) reviewInputItems).b;
            return (num != null && num.intValue() == 0) ? InputState.f : InputState.e;
        }
        ReviewInputItemNameField reviewInputItemNameField = (ReviewInputItemNameField) reviewInputItems;
        int iOrdinal3 = w6(reviewInputItemNameField.b, reviewInputItemNameField.c, reviewInputItemNameField.d, reviewInputItemNameField.g).ordinal();
        if (iOrdinal3 == 0) {
            return InputState.e;
        }
        if (iOrdinal3 == 1) {
            return InputState.n;
        }
        if (iOrdinal3 == 2) {
            return InputState.o;
        }
        if (iOrdinal3 == 3) {
            return InputState.p;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextValidationState w6(boolean z, Integer num, int i, String str) {
        return (z || str.length() != 0) ? (num == null || str.length() >= num.intValue()) ? str.length() > i ? TextValidationState.g : TextValidationState.d : TextValidationState.f : TextValidationState.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D5() {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel.D5():void");
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void G4() {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        this.l = WriteReviewFormData.a(writeReviewFormData, null, 0, false, 15);
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData2 = this.l;
        if (writeReviewFormData2 != null) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData2));
        } else {
            Intrinsics.p("reviewFormData");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void L3() {
        if (u6()) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData != null) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData));
        } else {
            Intrinsics.p("reviewFormData");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void N2() {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object objA : list) {
            if (objA instanceof ReviewFormSectionTermsAndConditions) {
                objA = ReviewFormSectionTermsAndConditions.a((ReviewFormSectionTermsAndConditions) objA, false, false, 7);
            }
            arrayList.add(objA);
        }
        WriteReviewFormData writeReviewFormDataA = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        MutableStateFlow mutableStateFlow = this.j;
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormDataA));
        this.l = writeReviewFormDataA;
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void Q0(int i) {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object reviewFormSectionReviewInputs : list) {
            if (reviewFormSectionReviewInputs instanceof ReviewFormSectionReviewInputs) {
                ArrayList<Object> arrayList2 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs).f12743a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                for (Object objA : arrayList2) {
                    if (objA instanceof ReviewInputItemRating) {
                        objA = ReviewInputItemRating.a((ReviewInputItemRating) objA, Integer.valueOf(i), null, 1);
                    }
                    arrayList3.add(objA);
                }
                reviewFormSectionReviewInputs = new ReviewFormSectionReviewInputs(arrayList3);
            }
            arrayList.add(reviewFormSectionReviewInputs);
        }
        WriteReviewFormData writeReviewFormDataA = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        MutableStateFlow mutableStateFlow = this.j;
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormDataA));
        this.l = writeReviewFormDataA;
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void T3(String text) {
        Intrinsics.h(text, "text");
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object reviewFormSectionReviewInputs : list) {
            if (reviewFormSectionReviewInputs instanceof ReviewFormSectionReviewInputs) {
                ArrayList<Object> arrayList2 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs).f12743a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                for (Object objA : arrayList2) {
                    if (objA instanceof ReviewInputItemBodyField) {
                        objA = ReviewInputItemBodyField.a((ReviewInputItemBodyField) objA, text, null, false, 575);
                    }
                    arrayList3.add(objA);
                }
                reviewFormSectionReviewInputs = new ReviewFormSectionReviewInputs(arrayList3);
            }
            arrayList.add(reviewFormSectionReviewInputs);
        }
        this.l = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        s6();
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData2 = this.l;
        if (writeReviewFormData2 == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData2));
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void W4(boolean z) {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object objA : list) {
            if (objA instanceof ReviewFormSectionTermsAndConditions) {
                objA = ReviewFormSectionTermsAndConditions.a((ReviewFormSectionTermsAndConditions) objA, z, false, 11);
            }
            arrayList.add(objA);
        }
        WriteReviewFormData writeReviewFormDataA = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        MutableStateFlow mutableStateFlow = this.j;
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormDataA));
        this.l = writeReviewFormDataA;
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void X3(final String errorText) {
        Intrinsics.h(errorText, "errorText");
        final SubmitReviewAnalytics.SubmitReview.Action action = new SubmitReviewAnalytics.SubmitReview(CollectionsKt.Q(this.e)).f;
        action.getClass();
        this.f.g(new Event(action, errorText) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$fetchError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4050a.e);
                a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "error_impression");
                a.y("event.Label", String.valueOf(errorText), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "reviewsscreen_errorimpression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "reviewsscreen_errorimpression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void Z5() {
        if (t6()) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData != null) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData));
        } else {
            Intrinsics.p("reviewFormData");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void e4(String text) {
        Intrinsics.h(text, "text");
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object reviewFormSectionReviewInputs : list) {
            if (reviewFormSectionReviewInputs instanceof ReviewFormSectionReviewInputs) {
                ArrayList<Object> arrayList2 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs).f12743a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                for (Object objA : arrayList2) {
                    if (objA instanceof ReviewInputItemTitleField) {
                        objA = ReviewInputItemTitleField.a((ReviewInputItemTitleField) objA, text, null, false, 959);
                    }
                    arrayList3.add(objA);
                }
                reviewFormSectionReviewInputs = new ReviewFormSectionReviewInputs(arrayList3);
            }
            arrayList.add(reviewFormSectionReviewInputs);
        }
        this.l = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        u6();
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData2 = this.l;
        if (writeReviewFormData2 == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData2));
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void l4() {
        if (s6()) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData != null) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData));
        } else {
            Intrinsics.p("reviewFormData");
            throw null;
        }
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new SubmitReviewViewModel$fetchReviewFormData$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r6(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitReviewSuccess$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitReviewSuccess$1 r0 = (au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitReviewSuccess$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitReviewSuccess$1 r0 = new au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitReviewSuccess$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlinx.coroutines.flow.SharedFlowImpl r3 = r6.h
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L64
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview r7 = new au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview
            java.lang.String r2 = r6.e
            java.util.List r2 = kotlin.collections.CollectionsKt.Q(r2)
            r7.<init>(r2)
            java.lang.String r2 = r6.m
            java.util.List r2 = kotlin.collections.CollectionsKt.Q(r2)
            au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action r7 = r7.f
            r7.getClass()
            au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$submitSuccess$1 r5 = new au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$submitSuccess$1
            r5.<init>(r7, r2)
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r7 = r6.f
            r7.g(r5)
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract$Action$ShowSubmitFormSuccessToast r7 = au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract.Action.ShowSubmitFormSuccessToast.f12771a
            r3.f(r7)
            r0.r = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract$Action$OnNavigateUp r7 = au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract.Action.OnNavigateUp.f12770a
            r3.f(r7)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel.r6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void s2(String text) {
        Intrinsics.h(text, "text");
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List<Object> list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object reviewFormSectionReviewInputs : list) {
            if (reviewFormSectionReviewInputs instanceof ReviewFormSectionReviewInputs) {
                ArrayList<Object> arrayList2 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs).f12743a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                for (Object objA : arrayList2) {
                    if (objA instanceof ReviewInputItemNameField) {
                        objA = ReviewInputItemNameField.a((ReviewInputItemNameField) objA, text, null, false, 575);
                    }
                    arrayList3.add(objA);
                }
                reviewFormSectionReviewInputs = new ReviewFormSectionReviewInputs(arrayList3);
            }
            arrayList.add(reviewFormSectionReviewInputs);
        }
        this.l = WriteReviewFormData.a(writeReviewFormData, arrayList, 0, false, 29);
        t6();
        MutableStateFlow mutableStateFlow = this.j;
        WriteReviewFormData writeReviewFormData2 = this.l;
        if (writeReviewFormData2 == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData2));
    }

    public final boolean s6() {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ReviewFormSectionReviewInputs) {
                arrayList.add(obj);
            }
        }
        ReviewFormSectionReviewInputs reviewFormSectionReviewInputs = (ReviewFormSectionReviewInputs) CollectionsKt.F(arrayList);
        ArrayList arrayList2 = reviewFormSectionReviewInputs != null ? reviewFormSectionReviewInputs.f12743a : null;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof ReviewInputItemBodyField) {
                    arrayList3.add(obj2);
                }
            }
            ReviewInputItemBodyField reviewInputItemBodyField = (ReviewInputItemBodyField) CollectionsKt.F(arrayList3);
            if (reviewInputItemBodyField != null) {
                String str = v6(reviewInputItemBodyField).d;
                WriteReviewFormData writeReviewFormData2 = this.l;
                if (writeReviewFormData2 == null) {
                    Intrinsics.p("reviewFormData");
                    throw null;
                }
                List<Object> list2 = writeReviewFormData2.b;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                for (Object reviewFormSectionReviewInputs2 : list2) {
                    if (reviewFormSectionReviewInputs2 instanceof ReviewFormSectionReviewInputs) {
                        ArrayList<Object> arrayList5 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs2).f12743a;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                        for (Object objA : arrayList5) {
                            if (objA instanceof ReviewInputItemBodyField) {
                                objA = ReviewInputItemBodyField.a((ReviewInputItemBodyField) objA, null, str, !(str == null || StringsKt.D(str)), 639);
                            }
                            arrayList6.add(objA);
                        }
                        reviewFormSectionReviewInputs2 = new ReviewFormSectionReviewInputs(arrayList6);
                    }
                    arrayList4.add(reviewFormSectionReviewInputs2);
                }
                this.l = WriteReviewFormData.a(writeReviewFormData2, arrayList4, 0, false, 29);
                if (str == null || str.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean t6() {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ReviewFormSectionReviewInputs) {
                arrayList.add(obj);
            }
        }
        ReviewFormSectionReviewInputs reviewFormSectionReviewInputs = (ReviewFormSectionReviewInputs) CollectionsKt.F(arrayList);
        ArrayList arrayList2 = reviewFormSectionReviewInputs != null ? reviewFormSectionReviewInputs.f12743a : null;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof ReviewInputItemNameField) {
                    arrayList3.add(obj2);
                }
            }
            ReviewInputItemNameField reviewInputItemNameField = (ReviewInputItemNameField) CollectionsKt.F(arrayList3);
            if (reviewInputItemNameField != null) {
                String str = v6(reviewInputItemNameField).d;
                WriteReviewFormData writeReviewFormData2 = this.l;
                if (writeReviewFormData2 == null) {
                    Intrinsics.p("reviewFormData");
                    throw null;
                }
                List<Object> list2 = writeReviewFormData2.b;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                for (Object reviewFormSectionReviewInputs2 : list2) {
                    if (reviewFormSectionReviewInputs2 instanceof ReviewFormSectionReviewInputs) {
                        ArrayList<Object> arrayList5 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs2).f12743a;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                        for (Object objA : arrayList5) {
                            if (objA instanceof ReviewInputItemNameField) {
                                objA = ReviewInputItemNameField.a((ReviewInputItemNameField) objA, null, str, !(str == null || StringsKt.D(str)), 639);
                            }
                            arrayList6.add(objA);
                        }
                        reviewFormSectionReviewInputs2 = new ReviewFormSectionReviewInputs(arrayList6);
                    }
                    arrayList4.add(reviewFormSectionReviewInputs2);
                }
                this.l = WriteReviewFormData.a(writeReviewFormData2, arrayList4, 0, false, 29);
                if (str == null || str.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u6() {
        WriteReviewFormData writeReviewFormData = this.l;
        if (writeReviewFormData == null) {
            Intrinsics.p("reviewFormData");
            throw null;
        }
        List list = writeReviewFormData.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ReviewFormSectionReviewInputs) {
                arrayList.add(obj);
            }
        }
        ReviewFormSectionReviewInputs reviewFormSectionReviewInputs = (ReviewFormSectionReviewInputs) CollectionsKt.F(arrayList);
        if (reviewFormSectionReviewInputs != null) {
            ArrayList arrayList2 = reviewFormSectionReviewInputs.f12743a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof ReviewInputItemTitleField) {
                    arrayList3.add(obj2);
                }
            }
            ReviewInputItemTitleField reviewInputItemTitleField = (ReviewInputItemTitleField) CollectionsKt.F(arrayList3);
            if (reviewInputItemTitleField != null) {
                String str = v6(reviewInputItemTitleField).d;
                WriteReviewFormData writeReviewFormData2 = this.l;
                if (writeReviewFormData2 == null) {
                    Intrinsics.p("reviewFormData");
                    throw null;
                }
                List<Object> list2 = writeReviewFormData2.b;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                for (Object reviewFormSectionReviewInputs2 : list2) {
                    if (reviewFormSectionReviewInputs2 instanceof ReviewFormSectionReviewInputs) {
                        ArrayList<Object> arrayList5 = ((ReviewFormSectionReviewInputs) reviewFormSectionReviewInputs2).f12743a;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                        for (Object objA : arrayList5) {
                            if (objA instanceof ReviewInputItemTitleField) {
                                objA = ReviewInputItemTitleField.a((ReviewInputItemTitleField) objA, null, str, !(str == null || StringsKt.D(str)), 639);
                            }
                            arrayList6.add(objA);
                        }
                        reviewFormSectionReviewInputs2 = new ReviewFormSectionReviewInputs(arrayList6);
                    }
                    arrayList4.add(reviewFormSectionReviewInputs2);
                }
                this.l = WriteReviewFormData.a(writeReviewFormData2, arrayList4, 0, false, 29);
                if (str == null || str.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel
    public final void w5(final String errorText) {
        Intrinsics.h(errorText, "errorText");
        SubmitReviewAnalytics.SubmitReview submitReview = new SubmitReviewAnalytics.SubmitReview(CollectionsKt.Q(this.e));
        final List listQ = CollectionsKt.Q(this.m);
        final SubmitReviewAnalytics.SubmitReview.Action action = submitReview.f;
        action.getClass();
        this.f.g(new Event(action, errorText, listQ) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics$SubmitReview$Action$submitError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(action.f4050a.e);
                spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("error.Name", androidx.compose.ui.input.pointer.a.m("event.Label", "review submission fail", spreadBuilder, errorText)));
                spreadBuilder.a(new Pair("product.Name", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "productratings&reviews_fail";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "productratings&reviews_fail".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }
}
