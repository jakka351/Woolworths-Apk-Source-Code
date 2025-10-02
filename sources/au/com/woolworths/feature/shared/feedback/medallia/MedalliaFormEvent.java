package au.com.woolworths.feature.shared.feedback.medallia;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "", "FormSubmitted", "FormDismissed", "FormClosed", "FormDisplayed", "FormThankYouPrompt", "FormDisplayError", "FormLinkSelected", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormClosed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDismissed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDisplayError;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDisplayed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormLinkSelected;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormSubmitted;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormThankYouPrompt;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MedalliaFormEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormClosed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormClosed extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6479a;

        public FormClosed(String str) {
            this.f6479a = str;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6479a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormClosed) && Intrinsics.c(this.f6479a, ((FormClosed) obj).f6479a);
        }

        public final int hashCode() {
            return this.f6479a.hashCode();
        }

        public final String toString() {
            return a.h("FormClosed(formId=", this.f6479a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDismissed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormDismissed extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6480a;

        public FormDismissed(String str) {
            this.f6480a = str;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6480a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormDismissed) && Intrinsics.c(this.f6480a, ((FormDismissed) obj).f6480a);
        }

        public final int hashCode() {
            return this.f6480a.hashCode();
        }

        public final String toString() {
            return a.h("FormDismissed(formId=", this.f6480a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDisplayError;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormDisplayError extends MedalliaFormEvent {
        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a */
        public final String getF6484a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FormDisplayError);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FormDisplayError(formId=null, message=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormDisplayed;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormDisplayed extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6481a;

        public FormDisplayed(String str) {
            this.f6481a = str;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6481a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormDisplayed) && Intrinsics.c(this.f6481a, ((FormDisplayed) obj).f6481a);
        }

        public final int hashCode() {
            return this.f6481a.hashCode();
        }

        public final String toString() {
            return a.h("FormDisplayed(formId=", this.f6481a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormLinkSelected;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormLinkSelected extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6482a;
        public final String b;
        public final boolean c;

        public FormLinkSelected(String str, String str2, boolean z) {
            this.f6482a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6482a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormLinkSelected)) {
                return false;
            }
            FormLinkSelected formLinkSelected = (FormLinkSelected) obj;
            return Intrinsics.c(this.f6482a, formLinkSelected.f6482a) && Intrinsics.c(this.b, formLinkSelected.b) && this.c == formLinkSelected.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f6482a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.k(")", a.v("FormLinkSelected(formId=", this.f6482a, ", url=", this.b, ", isBlocked="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormSubmitted;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormSubmitted extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6483a;

        public FormSubmitted(String str) {
            this.f6483a = str;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6483a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormSubmitted) && Intrinsics.c(this.f6483a, ((FormSubmitted) obj).f6483a);
        }

        public final int hashCode() {
            return this.f6483a.hashCode();
        }

        public final String toString() {
            return a.h("FormSubmitted(formId=", this.f6483a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent$FormThankYouPrompt;", "Lau/com/woolworths/feature/shared/feedback/medallia/MedalliaFormEvent;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FormThankYouPrompt extends MedalliaFormEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6484a;

        public FormThankYouPrompt(String str) {
            this.f6484a = str;
        }

        @Override // au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent
        /* renamed from: a, reason: from getter */
        public final String getF6484a() {
            return this.f6484a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormThankYouPrompt) && Intrinsics.c(this.f6484a, ((FormThankYouPrompt) obj).f6484a);
        }

        public final int hashCode() {
            return this.f6484a.hashCode();
        }

        public final String toString() {
            return a.h("FormThankYouPrompt(formId=", this.f6484a, ")");
        }
    }

    /* renamed from: a */
    public abstract String getF6484a();
}
